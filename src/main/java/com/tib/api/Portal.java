
package com.tib.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tib.api.client.APIClient;
import com.tib.api.client.AbstractAPIClient;
import com.tib.api.model.request.*;
import com.tib.api.model.response.*;
import org.xml.sax.SAXException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * This is the Portal class. It contains all the APIs (methods),
 * which is used to make encrypted API calls.
 *
 * @author TIB Finance
 */
public class Portal {

    private static AbstractAPIClient client;

    private static ObjectMapper objectMapper;

    /**
     * Constructor to create Portal object.
     *
     * @param objectMapper the object mapper
     * @param baseURL      the base url
     */
    public Portal(ObjectMapper objectMapper, String baseURL) {
        this.objectMapper = objectMapper;
        client = new APIClient(objectMapper, baseURL);
    }

    /**
     * Creates an authenticated session for a TIB Finance client.
     *
     * @param args the args
     * @return  On success returns a JSON payload with SessionId (Guid) and Expiration (ISO‑8601 timestamp) indicating the session token and its validity period.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateSessionResponse createSession(CreateSessionArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateSession", args);
        return new CreateSessionResponse(apiResponse);
    }
    /**
     * Retrieves the list of service contracts associated with the authenticated merchant.
     *
     * @param args the args
     * @return  On success, returns a JSON array of service objects, each containing ServiceId (GUID) and optional descriptive fields (e.g., Name, Status). HTTP 200.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListServicesResponse listServices(ListServicesArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListServices", args);
        return new ListServicesResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves the details of a specific Service (contract) for the authenticated client.
     *
     * @param args the args
     * @return  On success, returns a Service object containing ServiceId, MerchantId, Name, Limits, Fees, Currency, EffectiveDates, and CurrentStatus.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetServiceResponse getService(GetServiceArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetService", args);
        return new GetServiceResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves the wallet state for a specific service.
     *
     * @param args the args
     * @return  On success, returns a JSON object containing effectiveBalance (decimal), withdrawableAmount (decimal), processingStatus (enum), and isNewWalletEnabled (boolean). Errors are returned with standard API error codes.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetWalletInformationsResponse getWalletInformationsByService(GetWalletInformationsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetWalletInformationsByService", args);
        return new GetWalletInformationsResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves a list of merchant accounts accessible to the authenticated session.
     *
     * @param args the args
     * @return  On success, returns HTTP 200 with a JSON array of merchant objects, each containing MerchantId (GUID), Name, IsPrimary (bool), and Status fields.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListMerchantsResponse listMerchants(ListMerchantsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListMerchants", args);
        return new ListMerchantsResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves the boarding status of all merchants associated with a specific service.
     *
     * @param args the args
     * @return  JSON array of objects, each containing MerchantId (Guid), BoardingStatus (enum: Boarded|Pending|Failed), and StatusTimestamp (ISO‑8601). HTTP 200 on success; error codes follow standard API error handling.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetServiceBoardingStatusResponse getServiceBoardingStatus(GetServiceBoardingStatusArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetServiceBoardingStatus", args);
        return new GetServiceBoardingStatusResponse(apiResponse, objectMapper);
    }
    /**
     * Creates a new merchant (bank account) for the client.
     *
     * @param args the args
     * @return  MerchantId (GUID) of the newly created merchant and a validationStatus flag indicating whether the merchant is active or pending validation.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateMerchantResponse createMerchant(CreateMerchantArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateMerchant", args);
        return new CreateMerchantResponse(apiResponse);
    }
    /**
     * Retrieves the details of a merchant by its GUID.
     *
     * @param args the args
     * @return  On success, returns a Merchant object with MerchantId, basic information (name, status, creation date) and a preview of account information (bank name, masked account number, currency, etc.).
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetMerchantResponse getMerchant(GetMerchantArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetMerchant", args);
        return new GetMerchantResponse(apiResponse, objectMapper);
    }
    /**
     * Updates or creates a merchant record in TIB Finance.
     *
     * @param args the args
     * @return  On success, returns HTTP 200 with a JSON body containing the saved MerchantId and a timestamp of the update, or an error object on failure.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public SaveMerchantResponse saveMerchant(SaveMerchantArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SaveMerchant", args);
        return new SaveMerchantResponse(apiResponse, objectMapper);
    }
    /**
     * Updates the basic profile data of an existing merchant.
     *
     * @param args the args
     * @return  HTTP 200 with a JSON body containing a success flag and the MerchantId; on failure returns the standard error object with error code and description.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public SaveMerchantResponse saveMerchantBasicInfo(SaveMerchantBasicInfoArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SaveMerchantBasicInfo", args);
        return new SaveMerchantResponse(apiResponse, objectMapper);
    }
    /**
     * Saves or updates a merchant's bank account information.
     *
     * @param args the args
     * @return  HTTP 200 with JSON confirming the operation, e.g., { "merchantId": "<GUID>", "accountSaved": true }.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public SaveMerchantResponse saveMerchantAccountInfo(SaveMerchantAccountInfoArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SaveMerchantAccountInfo", args);
        return new SaveMerchantResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes a merchant (bank account) identified by its GUID.
     *
     * @param args the args
     * @return  HTTP 200 with a JSON body containing { "success": true, "merchantId": "<MerchantId>" }. Errors return appropriate HTTP status codes and error payload.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeleteMerchantResponse deleteMerchant(DeleteMerchantArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeleteMerchant", args);
        return new DeleteMerchantResponse(apiResponse);
    }
    /**
     * Retrieves TIB merchant records that match a given external system identifier.
     *
     * @param args the args
     * @return  On success, returns a JSON array of merchant objects, each containing at least the internal MerchantId (Guid) and basic merchant information. Errors are returned as standard API error objects.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetMerchantsByExternalIdResponse getMerchantsByExternalId(GetMerchantsByExternalIdArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetMerchantsByExternalId", args);
        return new GetMerchantsByExternalIdResponse(apiResponse, objectMapper);
    }
    /**
     * Adjusts the merchant's wallet balance by the specified amount.
     *
     * @param args the args
     * @return  On success returns an object containing AdjustWalletId (GUID), NewBalance (decimal) and Status ('Success' or error details).
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public AdjustWalletResponse adjustWallet(AdjustWalletArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("AdjustWallet", args);
        return new AdjustWalletResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves a list of customer objects associated with the specified merchant.
     *
     * @param args the args
     * @return  On success, returns HTTP 200 with a JSON array of customer objects, each containing at minimum: CustomerId (GUID), Email (optional), CreatedDate (ISO‑8601), and Status (enum). Errors are returned with standard HTTP error codes and an error payload.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListCustomersResponse listCustomers(ListCustomersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListCustomers", args);
        return new ListCustomersResponse(apiResponse, objectMapper);
    }
    /**
     * Creates a new Customer object in TIB Finance.
     *
     * @param args the args
     * @return  On success, returns a JSON payload containing CustomerId (GUID) and a creation timestamp.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateCustomerResponse createCustomer(CreateCustomerArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateCustomer", args);
        return new CreateCustomerResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves details of a specific customer.
     *
     * @param args the args
     * @return  On success, returns a Customer object containing Id, Email, Status, and an array of PaymentMethod summaries. HTTP 200 with JSON payload; errors returned with appropriate HTTP status codes.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetCustomerResponse getCustomer(GetCustomerArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetCustomer", args);
        return new GetCustomerResponse(apiResponse, objectMapper);
    }
    /**
     * Creates or updates a customer record in TIB Finance.
     *
     * @param args the args
     * @return  On success returns a JSON object containing CustomerId (Guid) and a success flag, e.g., { "CustomerId": "...", "Success": true }.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public SaveCustomerResponse saveCustomer(SaveCustomerArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SaveCustomer", args);
        return new SaveCustomerResponse(apiResponse);
    }
    /**
     * Deletes a customer record from the TIB Finance system.
     *
     * @param args the args
     * @return  HTTP 204 No Content on success; if a body is returned, it contains a JSON object { "deletedCustomerId": "<Guid>", "status": "Success" }.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeleteCustomerResponse deleteCustomer(DeleteCustomerArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeleteCustomer", args);
        return new DeleteCustomerResponse(apiResponse);
    }
    /**
     * Retrieves one or more TIB Finance customers matching a given external identifier.
     *
     * @param args the args
     * @return  On success, returns a JSON array of customer objects, each containing at least the TIB CustomerId (Guid) and associated metadata. Errors are returned as standard API error objects.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetCustomersByExternalIdResponse getCustomersByExternalId(GetCustomersByExternalIdArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetCustomersByExternalId", args);
        return new GetCustomersByExternalIdResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves all payment methods associated with a specific customer under a given merchant.
     *
     * @param args the args
     * @return  On success, returns a JSON array of payment method objects, each containing Id (GUID), Type (enum: CreditCard|BankAccount|Interac), Status, and masked account details.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListPaymentMethodsResponse listPaymentMethods(ListPaymentMethodsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListPaymentMethods", args);
        return new ListPaymentMethodsResponse(apiResponse, objectMapper);
    }
    /**
     * Creates a new credit‑card payment method for a specified customer.
     *
     * @param args the args
     * @return  HTTP 201 with JSON containing PaymentMethodId (GUID) and masked card info (last4, expiryMonth, expiryYear).
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateCreditCardPaymentMethodResponse createCreditCardPaymentMethod(CreateCreditCardPaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateCreditCardPaymentMethod", args);
        return new CreateCreditCardPaymentMethodResponse(apiResponse);
    }
    /**
     * Creates a bank‑account payment method linked directly to a customer.
     *
     * @param args the args
     * @return  On success returns a JSON payload with paymentMethodId (Guid) and status="Created"; on failure returns standard error object with code and message.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateDirectAccountPaymentMethodResponse createDirectAccountPaymentMethod(CreateDirectAccountPaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateDirectAccountPaymentMethod", args);
        return new CreateDirectAccountPaymentMethodResponse(apiResponse);
    }
    /**
     * Creates an Interac payment method for a specified customer.
     *
     * @param args the args
     * @return  On success returns a JSON object containing PaymentMethodId (Guid) and a status field indicating creation success.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateInteracPaymentMethodResponse createInteracPaymentMethod(CreateInteracPaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateInteracPaymentMethod", args);
        return new CreateInteracPaymentMethodResponse(apiResponse);
    }
    /**
     * Retrieves the details of a specific payment method.
     *
     * @param args the args
     * @return  On success, returns a PaymentMethod object with fields such as id, type, masked account information, status, createdDate, and lastModifiedDate.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetPaymentMethodResponse getPaymentMethod(GetPaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetPaymentMethod", args);
        return new GetPaymentMethodResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes a specific payment method from a customer profile.
     *
     * @param args the args
     * @return  HTTP 204 No Content on successful deletion; error payload with standard TIB Finance error codes on failure.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeletePaymentMethodResponse deletePaymentMethod(DeletePaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeletePaymentMethod", args);
        return new DeletePaymentMethodResponse(apiResponse);
    }
    /**
     * Sets the default payment method for a specified customer.
     *
     * @param args the args
     * @return  HTTP 200 with JSON { "success": true, "customerId": "<GUID>", "defaultPaymentMethodId": "<GUID>" }. Errors are returned with appropriate HTTP status codes and error payloads.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public SetDefaultPaymentMethodResponse setDefaultPaymentMethod(SetDefaultPaymentMethodArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SetDefaultPaymentMethod", args);
        return new SetDefaultPaymentMethodResponse(apiResponse);
    }
    /**
     * Retrieves a collection of bills created within a specified time range.
     *
     * @param args the args
     * @return  On success, returns a JSON array of bill objects, each containing at least BillId (GUID), CreationDate, Amount, Currency, Status, and optional metadata.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListBillsResponse listBills(ListBillsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListBills", args);
        return new ListBillsResponse(apiResponse, objectMapper);
    }
    /**
     * Creates a new bill record in TIB Finance.
     *
     * @param args the args
     * @return  On success, returns a JSON object with billId (Guid) and creationTimestamp (ISO‑8601).
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateBillResponse createBill(CreateBillArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateBill", args);
        return new CreateBillResponse(apiResponse);
    }
    /**
     * Retrieves details of a specific bill.
     *
     * @param args the args
     * @return  On success, returns a Bill object containing bill metadata (id, amount, currency, status, creation date, due date) and an array of associated payment IDs.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetBillResponse getBill(GetBillArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetBill", args);
        return new GetBillResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes a previously created bill.
     *
     * @param args the args
     * @return  HTTP 204 No Content on success (empty response body). Errors are returned with standard HTTP error codes and a JSON error payload.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeleteBillResponse deleteBill(DeleteBillArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeleteBill", args);
        return new DeleteBillResponse(apiResponse);
    }
    /**
     * Retrieves a paginated list of transfer records matching the supplied filters.
     *
     * @param args the args
     * @return  On success, returns a JSON object containing an array of transfer objects (each with TransferId, Status, Type, Amount, Dates, and related identifiers) and pagination metadata (TotalCount, PageSize, PageNumber).
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListTransfersResponse listTransfers(ListTransfersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListTransfers", args);
        return new ListTransfersResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves a filtered, summarized list of transfer records for a specified service.
     *
     * @param args the args
     * @return  HTTP 200 with a JSON payload containing an array of transfer summary objects (e.g., TransferId, Date, Type, Amount, Status, Resolved, ErrorCode) plus optional pagination info.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListTransfersFastResponse listTransfersFast(ListTransfersFastArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListTransfersFast", args);
        return new ListTransfersFastResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves all transfer records associated with a specific bill.
     *
     * @param args the args
     * @return  On success, a JSON array of transfer objects, each containing TransferId, OperationId, Direction, Target, Status (numeric enum), BankResult (if applicable), Description, and timestamps.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListTransfersFastResponse listTransfersForBillFast(ListTransfersForBillFastArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListTransfersForBillFast", args);
        return new ListTransfersFastResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves all active recurring transfers for a specified service.
     *
     * @param args the args
     * @return  A JSON array of transfer objects, each containing TransferId (GUID), Status, NextRecurrenceDate (ISO‑8601), Amount, Currency, MerchantId (GUID), and optional metadata such as Description and LastRunResult.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetRecuringTransfersResponse getRecuringTransfers(GetRecuringTransfersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetRecuringTransfers", args);
        return new GetRecuringTransfersResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes a recurring transfer and cancels all its future scheduled executions.
     *
     * @param args the args
     * @return  HTTP 200 with JSON { "deleted": true, "transferId": "<RecuringTransferId>" } on success; error payload otherwise.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeleteRecuringTransferResponse deleteRecuringTransfer(DeleteRecuringTransferArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeleteRecuringTransfer", args);
        return new DeleteRecuringTransferResponse(apiResponse);
    }
    /**
     * Creates a payment associated with a specific bill.
     *
     * @param args the args
     * @return  Success returns a JSON object containing PaymentId (Guid), Status (e.g., 'Created'), and optional fields like ProcessedAt and TransactionDetails.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreatePaymentResponse createPayment(CreatePaymentArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreatePayment", args);
        return new CreatePaymentResponse(apiResponse, objectMapper);
    }
    /**
     * Gets the payment.
     *
     * @param args the args
     * @return  GetPaymentResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetPaymentResponse getPayment(GetPaymentArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetPayment", args);
        return new GetPaymentResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes the payment.
     *
     * @param args the args
     * @return  DeletePaymentResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeletePaymentResponse deletePayment(DeletePaymentArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeletePayment", args);
        return new DeletePaymentResponse(apiResponse);
    }
    /**
     * Creates the direct Interac transaction
     *
     * @param args the args
     * @return  CreateDirectInteracTransactionResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateDirectInteracTransactionResponse createDirectInteracTransaction(CreateDirectInteracTransactionArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateDirectInteracTransaction", args);
        return new CreateDirectInteracTransactionResponse(apiResponse);
    }
    /**
     * Creates the transaction from raw.
     *
     * @param args the args
     * @return  CreateTransactionFromRawResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateTransactionFromRawResponse createTransactionFromRaw(CreateTransactionFromRawArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateTransactionFromRaw", args);
        return new CreateTransactionFromRawResponse(apiResponse);
    }
    /**
     * Lists the executed operations.
     *
     * @param args the args
     * @return  ListExecutedOperationsResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListExecutedOperationsResponse listExecutedOperations(ListExecutedOperationsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListExecutedOperations", args);
        return new ListExecutedOperationsResponse(apiResponse, objectMapper);
    }
    /**
     * Forces the payment process.
     *
     * @param args the args
     * @return  ForcePaymentProcessResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ForcePaymentProcessResponse forcePaymentProcess(ForcePaymentProcessArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ForcePaymentProcess", args);
        return new ForcePaymentProcessResponse(apiResponse);
    }
    /**
     * Gets the drop in public token.
     *
     * @param args the args
     * @return  GetDropInPublicTokenResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetDropInPublicTokenResponse getDropInPublicToken(GetDropInPublicTokenArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetDropInPublicToken", args);
        return new GetDropInPublicTokenResponse(apiResponse);
    }
    /**
     * Creates the free operation.
     *
     * @param args the args
     * @return  CreateFreeOperationResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateFreeOperationResponse createFreeOperation(CreateFreeOperationArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateFreeOperation", args);
        return new CreateFreeOperationResponse(apiResponse, objectMapper);
    }
    /**
     * Creates a batch of free operations (deposits or collections) in a single call. Validates that client onboarding (KYC) is completed before allowing free deposit operations.
     *
     * @param args the args
     * @return  A CreateFreeOperationBatchResponse containing the results for each operation in the batch.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateFreeOperationBatchResponse createFreeOperationBatch(CreateFreeOperationBatchArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateFreeOperationBatch", args);
        return new CreateFreeOperationBatchResponse(apiResponse, objectMapper);
    }
    /**
     * Reverts (cancels or reverses) a transfer. For pending gateway payments, deletes the transfer and its public token. For processed payments, creates reversal operations for each non-fee operation. Rejects transfers over $5,000 or wallet-type transfers.
     *
     * @param args the args
     * @return  A RevertTransferResponse indicating whether the transfer was deleted or reversed.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public RevertTransferResponse revertTransfer(RevertTransferArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("RevertTransfer", args);
        return new RevertTransferResponse(apiResponse);
    }
    /**
     * Updates the security question and answer on an existing Interac payment method. Creates a replacement payment method with the new credentials and deletes the old one. The answer is encrypted via the external data vault, and both question and answer are obfuscated in logs.
     *
     * @param args the args
     * @return  A ChangeInteracPaymentMethodQuestionAndAnswerResponse containing the new payment method ID.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ChangeInteracPaymentMethodQuestionAndAnswerResponse changeInteracPaymentMethodQuestionAndAnswer(ChangeInteracPaymentMethodQuestionAndAnswerArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ChangeInteracPaymentMethodQuestionAndAnswer", args);
        return new ChangeInteracPaymentMethodQuestionAndAnswerResponse(apiResponse);
    }
    /**
     * Initializes the merchant onboarding (boarding) process for a service. Generates a public access token and returns a redirect URL to either the direct login page (if a service-level login exists) or the boarding sign-up wizard.
     *
     * @param args the args
     * @return  An InitBoardingResponse containing the redirect URL for the boarding wizard.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public InitBoardingResponse initBoarding(InitBoardingArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("InitBoarding", args);
        return new InitBoardingResponse(apiResponse);
    }
    /**
     * Creates a new sub-client (child service) under the authenticated client's account. The sub-client is represented as a service entity with its own name, language, and currency.
     *
     * @param args the args
     * @return  A CreateSubClientResponse containing the newly created service ID.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateSubClientResponse createSubClient(CreateSubClientArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateSubClient", args);
        return new CreateSubClientResponse(apiResponse);
    }
    /**
     * Resends the payment notification email to the customer associated with a specific payment.
     *
     * @param args the args
     * @return  A ResendPaymentEmailResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ResendPaymentEmailResponse resendPaymentEmail(ResendPaymentEmailArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ResendPaymentEmail", args);
        return new ResendPaymentEmailResponse(apiResponse);
    }
    /**
     * Relaunches (retries) a previously failed transfer for a merchant. Resets the failed payment in the database for reprocessing and sends an internal notification email with the transfer details.
     *
     * @param args the args
     * @return  A RelaunchMerchantFailedTransferResponse.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public RelaunchMerchantFailedTransferResponse relaunchMerchantFailedTransfer(RelaunchMerchantFailedTransferArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("RelaunchMerchantFailedTransfer", args);
        return new RelaunchMerchantFailedTransferResponse(apiResponse);
    }
    /**
     * Creates a payment transfer from the calling merchant to a supplier. Validates both merchants, runs business rules on the sending merchant's limits, creates the transfer as a free collection, and optionally creates a bill. Notifies the supplier unless client approval is required.
     *
     * @param args the args
     * @return  A CreateSupplierTransferResponse containing the created transfer identifier.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateSupplierTransferResponse createSupplierTransfer(CreateSupplierTransferArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateSupplierTransfer", args);
        return new CreateSupplierTransferResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves the list of suppliers associated with a merchant, returning each supplier's name and identifier.
     *
     * @param args the args
     * @return  A GetSuppliersResponse containing the list of suppliers.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetSuppliersResponse getSuppliers(GetSuppliersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetSuppliers", args);
        return new GetSuppliersResponse(apiResponse, objectMapper);
    }
    /**
     * Creates or registers a supplier for a merchant. If a supplier with the given email already exists, reuses that supplier; otherwise provisions a new client, service, merchant, and login. Links the supplier to the calling merchant and creates a reciprocal customer record in the supplier's service.
     *
     * @param args the args
     * @return  A CreateSupplierResponse containing the supplier's merchant ID.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public CreateSupplierResponse createSupplier(CreateSupplierArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("CreateSupplier", args);
        return new CreateSupplierResponse(apiResponse, objectMapper);
    }
    /**
     * Lists suppliers linked to the specified merchant, including detailed information such as supplier name, email address, and creation date. For a lightweight name-and-ID-only list, use GetSuppliers instead.
     *
     * @param args the args
     * @return  A ListSuppliersResponse containing the list of supplier details.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListSuppliersResponse listSuppliers(ListSuppliersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListSuppliers", args);
        return new ListSuppliersResponse(apiResponse, objectMapper);
    }
    /**
     * Updates the display name (alias) that the payer uses to identify a supplier. The alias is a payer-side label and does not affect the supplier's own merchant name.
     *
     * @param args the args
     * @return  An UpdateSupplierAliasResponse confirming the update.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public UpdateSupplierAliasResponse updateSupplierAlias(UpdateSupplierAliasArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("UpdateSupplierAlias", args);
        return new UpdateSupplierAliasResponse(apiResponse);
    }
    /**
     * Soft-deletes a supplier link for the specified merchant. The supplier's merchant account is not affected â€” only the payer-to-supplier association is removed.
     *
     * @param args the args
     * @return  A DeleteSupplierResponse confirming the deletion.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public DeleteSupplierResponse deleteSupplier(DeleteSupplierArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("DeleteSupplier", args);
        return new DeleteSupplierResponse(apiResponse);
    }
    /**
     * Lists supplier transfers initiated by the calling merchant (identified via FeeMerchantId). Returns transfers where the caller is the fee-payer, with optional datestatus filters.
     *
     * @param args the args
     * @return  A ListSupplierTransfersResponse containing the list of supplier transfers.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListSupplierTransfersResponse listSupplierTransfers(ListSupplierTransfersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListSupplierTransfers", args);
        return new ListSupplierTransfersResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves a single supplier transfer by ID. Accessible to both the fee-payer and the supplier. Returns the transfer details along with the counterparty name and the caller's role.
     *
     * @param args the args
     * @return  A GetSupplierTransferResponse containing the transfer and counterparty info.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetSupplierTransferResponse getSupplierTransfer(GetSupplierTransferArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetSupplierTransfer", args);
        return new GetSupplierTransferResponse(apiResponse, objectMapper);
    }
    /**
     * Lists recurring supplier transfers initiated by the calling merchant. Returns recurring transfer configurations where the caller is the fee-payer.
     *
     * @param args the args
     * @return  A ListSupplierRecurringTransfersResponse containing the recurring transfers.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public ListSupplierRecurringTransfersResponse listSupplierRecurringTransfers(ListSupplierRecurringTransfersArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListSupplierRecurringTransfers", args);
        return new ListSupplierRecurringTransfersResponse(apiResponse, objectMapper);
    }
    /**
     * Retrieves wallet operation history for a service within a specified date range. Returns the list of daily operations, the wallet balance as of the start date, and the configured delay buffer amount.
     *
     * @param args the args
     * @return  A GetWalletOperationsResponse containing the operations, balance before operations, and delay buffer amount.
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     * @throws SAXException                       the sax exception
     */
    public GetWalletOperationsResponse getWalletOperations(GetWalletOperationsArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("GetWalletOperations", args);
        return new GetWalletOperationsResponse(apiResponse, objectMapper);
    }

}
