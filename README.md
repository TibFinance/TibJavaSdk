# TIB Finance Java SDK

![Java](https://img.shields.io/badge/java-8%2B-orange)

Java SDK for the TIB Finance payment processing API.

## Installation

```bash
git clone https://github.com/TibFinance/TibJavaSdk.git
cd TibJavaSdk
mvn install
```

Then add to your `pom.xml`:

```xml
<dependency>
    <groupId>finance.tib</groupId>
    <artifactId>tib-finance-sdk</artifactId>
    <version>3.2.0</version>
</dependency>
```

Alternatively, download the prebuilt jar from the latest [GitHub release](https://github.com/TibFinance/TibJavaSdk/releases).

## Quick Start

```java
import com.tib.api.TibInvoker;
import com.tib.api.model.request.CreateSessionArgs;
import com.tib.api.model.response.CreateSessionResponse;

TibInvoker.init("https://sandboxportal.tib.finance");

CreateSessionArgs sessionArgs = new CreateSessionArgs();
sessionArgs.setClientId("your_client_id");
sessionArgs.setUsername("your_username");
sessionArgs.setPassword("your_password");

// Portal methods declare checked exceptions (crypto/IO), so wrap the call
try {
    CreateSessionResponse response = TibInvoker.portal.createSession(sessionArgs);
    if (response.isHasError()) {
        System.out.println("Session failed: " + response.getMessages());
    } else {
        System.out.println(response.getSessionId());
    }
} catch (Exception e) {
    System.err.println("Request failed: " + e.getMessage());
}
```

## Two-step sign-in (merchant- or service-level users)

The Quick Start signs in with `TibInvoker.portal.createSession`, which opens a client-level session. A user whose access is limited to a merchant or a service signs in with two calls instead:

1. Call `TibInvoker.portal.getLoginAccessList` with the client ID, username and password. Each entry in `LoginRelations` is one access the user can open: `InternalReferenceType` gives its level (2 client, 4 merchant, 16 service) and `InternalReferenceId` the ID of that client, merchant or service. `Description` is a label for display only.
2. Call `TibInvoker.portal.login` with the same client ID, username and password, and the `LoginsUserRelationsId` of the chosen entry.

Send the returned `SessionId` as `SessionToken` on the following calls, as with `TibInvoker.portal.createSession`. Failed sign-in attempts count toward a temporary lockout, so do not retry in a loop.

```java
import com.tib.api.TibInvoker;
import com.tib.api.model.LoginRelationsEntity;
import com.tib.api.model.request.GetLoginAccessListArgs;
import com.tib.api.model.request.ListServicesArgs;
import com.tib.api.model.request.LoginArgs;
import com.tib.api.model.response.GetLoginAccessListResponse;
import com.tib.api.model.response.LoginResponse;

try {
    GetLoginAccessListResponse accesses = TibInvoker.portal.getLoginAccessList(
            new GetLoginAccessListArgs("your_client_id", "your_username", "your_password"));
    if (accesses.isHasError()) {
        System.out.println("Sign-in failed: " + accesses.getMessages());
    } else {
        // Each entry is one access: pick the one to open
        // (getInternalReferenceType(): 2 client, 4 merchant, 16 service).
        LoginRelationsEntity access = accesses.getLoginRelations().get(0);
        LoginResponse response = TibInvoker.portal.login(new LoginArgs(
                "your_client_id", "your_username", "your_password", access.getLoginsUserRelationsId()));
        if (response.isHasError()) {
            System.out.println("Sign-in failed: " + response.getMessages());
        } else {
            ListServicesArgs servicesArgs = new ListServicesArgs();
            servicesArgs.setSessionToken(response.getSessionId());
            TibInvoker.portal.listServices(servicesArgs);
        }
    }
} catch (Exception e) {
    System.err.println("Request failed: " + e.getMessage());
}
```

## Documentation

For the complete API reference and guides, visit [doc.tib.finance](https://doc.tib.finance).

This SDK provides access to **70 API methods** for payment processing, merchant management, and financial operations.

## Other TIB Finance SDKs

| SDK | Repository |
|-----|------------|
| Python | [TibPythonSdk](https://github.com/TibFinance/TibPythonSdk) |
| .NET Core | [TibDotNetCoreSdk](https://github.com/TibFinance/TibDotNetCoreSdk) |
| .NET Framework | [TibDotNetSdk](https://github.com/TibFinance/TibDotNetSdk) |
| PHP | [TibPhpSdk](https://github.com/TibFinance/TibPhpSdk) |
| JavaScript (Browser) | [TibJavascriptSdk](https://github.com/TibFinance/TibJavascriptSdk) |
| Node.js | [TibNodeJsSdk](https://github.com/TibFinance/TibNodeJsSdk) |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

- Documentation: [doc.tib.finance](https://doc.tib.finance)
- Email: support@tib.finance
