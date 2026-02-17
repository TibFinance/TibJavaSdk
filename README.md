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
    <version>2.0.2</version>
</dependency>
```

## Quick Start

```java
import com.tib.api.TibInvoker;
import com.tib.api.model.request.CreateSessionArgs;
import com.tib.api.model.response.CreateSessionResponse;

TibInvoker.init("https://sandboxportal.tib.finance");

CreateSessionArgs args = new CreateSessionArgs();
args.setClientId("your_client_id");
args.setUsername("your_username");
args.setPassword("your_password");
CreateSessionResponse response = TibInvoker.portal.createSession(args);
System.out.println(response.getSessionId());
```

## Documentation

For the complete API reference and guides, visit [doc.tib.finance](https://doc.tib.finance).

This SDK provides access to **56 API methods** for payment processing, merchant management, and financial operations.

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
