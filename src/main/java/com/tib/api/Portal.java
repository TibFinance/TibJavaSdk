
package com.tib.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.xml.security.exceptions.Base64DecodingException;
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
 * which is used to make to encrypted API calls.
 *
 * @author mayur
 */
public class Portal {

    private static AbstractAPIClient client;

    private static ObjectMapper objectMapper;

    /**
     * Constructor to to create Portal object.
     *
     * @param objectMapper the object mapper
     * @param baseURL      the base url
     */
    public Portal(ObjectMapper objectMapper, String baseURL) {
        this.objectMapper = objectMapper;
        client = new APIClient(objectMapper, baseURL);
    }
    
    /**
* The CreateSession function is purposed to establish a fresh session, thereby ensuring a secure and distinct environment for user activities.
*
* @param args the args
* @return  On successful execution, the function yields an instance of the CreateSessionResponse, encompassing details about the freshly instantiated session.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateSessionResponse createSession(CreateSessionArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateSession", args);
    return new CreateSessionResponse(apiResponse);
}/**
* Retrieves the full list of services that are available to the authenticated client.
*
* @param args the args
* @return  A ListServicesResponse object that contains an array of Service objects and associated pagination information.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListServicesResponse listServices(ListServicesArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListServices", args);
    return new ListServicesResponse(apiResponse);
}/**
* Retrieves the details of a specified service within the TIB Finance API. This function is essential for accessing service-related information, which is crucial for managing contracts and determining applicable limits and fees.
*
* @param args the args
* @return  An instance of GetServiceResponse containing the service details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetServiceResponse getService(GetServiceArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetService", args);
    return new GetServiceResponse(apiResponse, objectMapper);
}/**
* Gets the service.
*
* @param args the args
* @return  GetWalletInformationsByServiceResponse.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetWalletInformationsResponse getWalletInformationsByService(GetWalletInformationsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetWalletInformationsByService", args);
    return new GetWalletInformationsResponse(apiResponse);
}/**
* Retrieves a list of all merchants associated with the client's account. This function is essential for managing and accessing merchant-specific data within the API.
*
* @param args the args
* @return  Returns a ListMerchantsResponse object containing details of each merchant.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListMerchantsResponse listMerchants(ListMerchantsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListMerchants", args);
    return new ListMerchantsResponse(apiResponse);
}/**
* Retrieves a list of merchants who have completed the boarding process. This function is essential for monitoring and managing merchant onboarding statuses within the system.
*
* @param args the args
* @return  Returns a ListMerchantsResponse object containing details of merchants with completed boarding.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetServiceBoardingStatusResponse getServiceBoardingStatus(GetServiceBoardingStatusArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetServiceBoardingStatus", args);
    return new GetServiceBoardingStatusResponse(apiResponse);
}/**
* Initiates the creation of a new merchant account within the TIB Finance system. This function is essential for setting up a merchant's basic and account information, which is a prerequisite for conducting transactions.
*
* @param args the args
* @return  Returns a CreateMerchantResponse object, which contains the status and details of the merchant creation process.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateMerchantResponse createMerchant(CreateMerchantArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateMerchant", args);
    return new CreateMerchantResponse(apiResponse);
}/**
* Retrieves detailed information about a specific merchant using the provided merchant ID. This function is essential for accessing the merchant's basic and account information necessary for transaction processing.
*
* @param args the args
* @return  A GetMerchantResponse object containing the merchant's details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetMerchantResponse getMerchant(GetMerchantArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetMerchant", args);
    return new GetMerchantResponse(apiResponse, objectMapper);
}/**
* Persists a merchant entity to the TIB Finance system.
*
* @param args the args
* @return  A SaveMerchantResponse indicating the result of the operation, including the newly generated merchant identifier.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public SaveMerchantResponse saveMerchant(SaveMerchantArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("SaveMerchant", args);
    return new SaveMerchantResponse(apiResponse);
}/**
* This function saves the basic information of a merchant. It is used to update or create the initial details associated with a merchant account within the TIB Finance API system.
*
* @param args the args
* @return  The function returns a SaveMerchantResponse object, which contains the status and details of the save operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public SaveMerchantResponse saveMerchantBasicInfo(SaveMerchantBasicInfoArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("SaveMerchantBasicInfo", args);
    return new SaveMerchantResponse(apiResponse);
}/**
* Stores the merchant's account details securely in the system.
*
* @param args the args
* @return  Returns a SaveMerchantResponse object indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public SaveMerchantResponse saveMerchantAccountInfo(SaveMerchantAccountInfoArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("SaveMerchantAccountInfo", args);
    return new SaveMerchantResponse(apiResponse);
}/**
* Removes a specified merchant from the system. This operation is irreversible and will permanently delete the merchant's data, including all associated accounts and transactions.
*
* @param args the args
* @return  An instance of DeleteMerchantResponse indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeleteMerchantResponse deleteMerchant(DeleteMerchantArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeleteMerchant", args);
    return new DeleteMerchantResponse(apiResponse);
}/**
* Retrieves merchant information using an external identifier. This function is essential for accessing merchant details that are linked to a specific external ID, facilitating seamless integration with external systems.
*
* @param args the args
* @return  An instance of GetMerchantsByExternalIdResponse containing the merchant details associated with the provided external identifier.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetMerchantsByExternalIdResponse getMerchantsByExternalId(GetMerchantsByExternalIdArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetMerchantsByExternalId", args);
    return new GetMerchantsByExternalIdResponse(apiResponse);
}/**
* Retrieves a list of customers associated with a merchant account.
*
* @param args the args
* @return  Returns a ListCustomersResponse object containing customer details and associated metadata.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public AdjustWalletResponse adjustWallet(AdjustWalletArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("AdjustWallet", args);
    return new AdjustWalletResponse(apiResponse);
}/**
* Generates a comprehensive list of all customers based on specified criteria, providing a complete overview of the customer base.
*
* @param args the args
* @return  The function returns a 'ListCustomersResponse' object. This object contains a detailed list of customers, each with comprehensive information, providing a complete overview of the customer base.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListCustomersResponse listCustomers(ListCustomersArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListCustomers", args);
    return new ListCustomersResponse(apiResponse);
}/**
* Creates a new customer entity within the system. This function initializes a customer object, which serves as a container for identifying the individual and associating payment methods.
*
* @param args the args
* @return  Returns a CreateCustomerResponse object, confirming the successful creation of the customer.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateCustomerResponse createCustomer(CreateCustomerArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateCustomer", args);
    return new CreateCustomerResponse(apiResponse);
}/**
* Retrieves detailed information about a specific customer based on the provided customer identifier. This function is essential for accessing customer data necessary for transaction processing and account management.
*
* @param args the args
* @return  An instance of GetCustomerResponse containing the customer's details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetCustomerResponse getCustomer(GetCustomerArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetCustomer", args);
    return new GetCustomerResponse(apiResponse, objectMapper);
}/**
* Persists the customer data to the database, ensuring that all necessary customer information is stored for future transactions.
*
* @param args the args
* @return  An instance of SaveCustomerResponse, indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public SaveCustomerResponse saveCustomer(SaveCustomerArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("SaveCustomer", args);
    return new SaveCustomerResponse(apiResponse);
}/**
* Removes a customer from the system based on the provided customer ID. This operation is irreversible and ensures that all associated data with the customer is permanently deleted.
*
* @param args the args
* @return  A DeleteCustomerResponse object indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeleteCustomerResponse deleteCustomer(DeleteCustomerArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeleteCustomer", args);
    return new DeleteCustomerResponse(apiResponse);
}/**
* Retrieves customer information using an external identifier. This function is essential for accessing customer data linked to a specific external ID, which is useful for integration with external systems.
*
* @param args the args
* @return  Returns a GetCustomersByExternalIdResponse object containing the customer details associated with the provided external identifier.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetCustomersByExternalIdResponse getCustomersByExternalId(GetCustomersByExternalIdArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetCustomersByExternalId", args);
    return new GetCustomersByExternalIdResponse(apiResponse);
}/**
* Retrieves a list of available payment methods associated with a customer. This function is essential for accessing and managing the various financial accounts linked to a customer, such as credit cards, bank accounts, and Interac. It is particularly useful for applications that need to display or process customer payment options.
*
* @param args the args
* @return  Returns a ListPaymentMethodsResponse object containing the details of each payment method associated with the customer.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListPaymentMethodsResponse listPaymentMethods(ListPaymentMethodsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListPaymentMethods", args);
    return new ListPaymentMethodsResponse(apiResponse);
}/**
* Initializes a new credit card payment method for a customer. This function is essential for enabling transactions using a customer's credit card within the TIB Finance API. It securely stores the credit card details and associates them with the customer's account.
*
* @param args the args
* @return  CreateCreditCardPaymentMethodResponse, which confirms the successful creation of the credit card payment method.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateCreditCardPaymentMethodResponse createCreditCardPaymentMethod(CreateCreditCardPaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateCreditCardPaymentMethod", args);
    return new CreateCreditCardPaymentMethodResponse(apiResponse);
}/**
* Initializes a new direct account payment method for a customer. This function facilitates the creation of a payment method linked directly to a customer's bank account, allowing for seamless transactions.
*
* @param args the args
* @return  Returns a CreateDirectAccountPaymentMethodResponse object containing the status and details of the newly created payment method.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateDirectAccountPaymentMethodResponse createDirectAccountPaymentMethod(CreateDirectAccountPaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateDirectAccountPaymentMethod", args);
    return new CreateDirectAccountPaymentMethodResponse(apiResponse);
}/**
* This function initializes and creates a new Interac payment method for a customer. It allows the merchant to facilitate transactions using the Interac network, which is a popular method for electronic funds transfers in Canada.
*
* @param args the args
* @return  The function returns a CreateInteracPaymentMethodResponse object, which contains details about the newly created Interac payment method, including its unique identifier and status.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateInteracPaymentMethodResponse createInteracPaymentMethod(CreateInteracPaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateInteracPaymentMethod", args);
    return new CreateInteracPaymentMethodResponse(apiResponse);
}/**
* Retrieves the details of a specific payment method associated with a customer. This function is essential for accessing payment method information, which can include credit cards, bank accounts, or Interac details.
*
* @param args the args
* @return  Returns a GetPaymentMethodResponse object containing the details of the requested payment method.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetPaymentMethodResponse getPaymentMethod(GetPaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetPaymentMethod", args);
    return new GetPaymentMethodResponse(apiResponse, objectMapper);
}/**
* Removes a specified payment method from the system. This function is typically used to delete a customer's payment method that is no longer needed or valid.
*
* @param args the args
* @return  Returns a DeletePaymentMethodResponse object indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeletePaymentMethodResponse deletePaymentMethod(DeletePaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeletePaymentMethod", args);
    return new DeletePaymentMethodResponse(apiResponse);
}/**
* Sets the default payment method for a customer. This function assigns a specified payment method as the primary option for transactions, ensuring that it is used by default unless another method is specified.
*
* @param args the args
* @return  Returns a SetDefaultPaymentMethodResponse object indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public SetDefaultPaymentMethodResponse setDefaultPaymentMethod(SetDefaultPaymentMethodArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("SetDefaultPaymentMethod", args);
    return new SetDefaultPaymentMethodResponse(apiResponse);
}/**
* Retrieves a list of all bills associated with the client's account. This function is essential for managing and reviewing billing information within the system.
*
* @param args the args
* @return  Returns a ListBillsResponse object containing the details of all bills.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListBillsResponse listBills(ListBillsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListBills", args);
    return new ListBillsResponse(apiResponse);
}/**
* Initiates the creation of a bill within the system. This function generates a unique Bill ID, which can be used for subsequent operations related to the bill.
*
* @param args the args
* @return  Returns a CreateBillResponse object containing the newly created Bill ID and any relevant status information.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateBillResponse createBill(CreateBillArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateBill", args);
    return new CreateBillResponse(apiResponse);
}/**
* Retrieves a bill based on the provided criteria. This function is essential for accessing detailed billing information within the API, facilitating further operations such as payment processing or bill management.
*
* @param args the args
* @return  Returns a GetBillResponse object containing detailed information about the requested bill, including its status, amount, and associated customer details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetBillResponse getBill(GetBillArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetBill", args);
    return new GetBillResponse(apiResponse, objectMapper);
}/**
* Removes a specified bill from the system. This operation is typically used when a bill is no longer needed or was created in error. Ensure that the bill ID is valid and corresponds to an existing bill before attempting to delete.
*
* @param args the args
* @return  A DeleteBillResponse object indicating the success or failure of the deletion operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeleteBillResponse deleteBill(DeleteBillArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeleteBill", args);
    return new DeleteBillResponse(apiResponse);
}/**
* Retrieves a list of all transfer operations available within the system. This function provides details about each transfer, including status and associated metadata.
*
* @param args the args
* @return  An instance of ListTransfersResponse containing the details of all transfers.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListTransfersResponse listTransfers(ListTransfersArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListTransfers", args);
    return new ListTransfersResponse(apiResponse);
}/**
* Lists the transfers.
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListTransfersFastResponse listTransfersFast(ListTransfersFastArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListTransfersFast", args);
    return new ListTransfersFastResponse(apiResponse);
}/**
* Lists the transfers of a bill.
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListTransfersFastResponse listTransfersForBillFast(ListTransfersForBillFastArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListTransfersForBillFast", args);
    return new ListTransfersFastResponse(apiResponse);
}/**
* Retrieves a list of recurring transfer operations associated with the client's account. This function is essential for clients who need to manage or review their scheduled transfers.
*
* @param args the args
* @return  Returns a list of recurring transfer objects, each containing details such as transfer ID, amount, schedule, and status.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetRecuringTransfersResponse getRecuringTransfers(GetRecuringTransfersArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetRecuringTransfers", args);
    return new GetRecuringTransfersResponse(apiResponse);
}/**
* Deletes a recurring transfer from the system.
*
* @param args the args
* @return  Returns a confirmation of successful deletion or an error message if the operation fails.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeleteRecuringTransferResponse deleteRecuringTransfer(DeleteRecuringTransferArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeleteRecuringTransfer", args);
    return new DeleteRecuringTransferResponse(apiResponse);
}/**
* Initiates a new payment transaction within the system. This function processes the payment details provided and returns a response indicating the success or failure of the operation.
*
* @param args the args
* @return  Returns a CreatePaymentResponse object that contains the status and details of the payment transaction.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreatePaymentResponse createPayment(CreatePaymentArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreatePayment", args);
    return new CreatePaymentResponse(apiResponse, objectMapper);
}/**
* Retrieves the details of a specific payment using the provided payment identifier.
*
* @param args the args
* @return  An instance of GetPaymentResponse containing the payment details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetPaymentResponse getPayment(GetPaymentArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetPayment", args);
    return new GetPaymentResponse(apiResponse, objectMapper);
}/**
* Removes a specified payment from the system. This function is essential for managing and rectifying payment records, ensuring that erroneous or obsolete payments are efficiently deleted.
*
* @param args the args
* @return  An instance of DeletePaymentResponse, indicating the success or failure of the operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public DeletePaymentResponse deletePayment(DeletePaymentArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("DeletePayment", args);
    return new DeletePaymentResponse(apiResponse);
}/**
* Initiates a direct Interac transaction, enabling the transfer of funds using a recipient's email or mobile phone number. This method facilitates seamless money transfers without requiring detailed customer account information.
*
* @param args the args
* @return  A CreateDirectInteracTransactionResponse object containing the status and details of the transaction.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateDirectInteracTransactionResponse createDirectInteracTransaction(CreateDirectInteracTransactionArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateDirectInteracTransaction", args);
    return new CreateDirectInteracTransactionResponse(apiResponse);
}/**
* Initiates a transaction using raw data input. This function processes the raw transaction details to create a valid transaction entry within the system.
*
* @param args the args
* @return  Returns a CreateTransactionFromRawResponse object, which contains the status and details of the transaction creation process.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateTransactionFromRawResponse createTransactionFromRaw(CreateTransactionFromRawArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateTransactionFromRaw", args);
    return new CreateTransactionFromRawResponse(apiResponse);
}/**
* Retrieves a list of operations that have been executed within the system. This function provides detailed information about each operation, allowing users to track and analyze completed transactions.
*
* @param args the args
* @return  Returns a ListExecutedOperationsResponse object containing details of the executed operations.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ListExecutedOperationsResponse listExecutedOperations(ListExecutedOperationsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ListExecutedOperations", args);
    return new ListExecutedOperationsResponse(apiResponse);
}/**
* Triggers the payment processing workflow for a specific payment, overriding the default automatic selection mechanism.
*
* @param args the args
* @return  ForcePaymentProcessResponse that indicates the outcome of the forced operation and provides any error information.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ForcePaymentProcessResponse forcePaymentProcess(ForcePaymentProcessArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ForcePaymentProcess", args);
    return new ForcePaymentProcessResponse(apiResponse);
}/**
* Retrieves the public token necessary for initiating a drop-in session. This token is used to authenticate and authorize the session within the API framework.
*
* @param args the args
* @return  An instance of GetDropInPublicTokenResponse, containing the public token and any associated metadata.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetDropInPublicTokenResponse getDropInPublicToken(GetDropInPublicTokenArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetDropInPublicToken", args);
    return new GetDropInPublicTokenResponse(apiResponse);
}/**
* Initiates a free operation within the TIB Finance API, allowing for transactions not directly linked to a specific bill. This function is typically used to either collect payments from a customer's payment method or deposit funds into it, with the exception of credit card deposits.
*
* @param args the args
* @return  An instance of CreateFreeOperationResponse, which contains the result of the operation and any relevant transaction details.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateFreeOperationResponse createFreeOperation(CreateFreeOperationArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateFreeOperation", args);
    return new CreateFreeOperationResponse(apiResponse);
}/**
* Initiates a batch of free operations, allowing for transactions not tied to a specific bill. This function is essential for handling payments or deposits directly linked to customer payment methods.
*
* @param args the args
* @return  Returns a confirmation of the batch creation, including details of each operation within the batch.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateFreeOperationBatchResponse createFreeOperationBatch(CreateFreeOperationBatchArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateFreeOperationBatch", args);
    return new CreateFreeOperationBatchResponse(apiResponse);
}/**
* Reverts a previously executed transfer operation, restoring the original state of the involved accounts.
*
* @param args the args
* @return  Returns a status indicating the success or failure of the revert operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public RevertTransferResponse revertTransfer(RevertTransferArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("RevertTransfer", args);
    return new RevertTransferResponse(apiResponse);
}/**
* Modifies the security question and answer for an Interac payment method associated with a customer account.
*
* @param args the args
* @return  Returns a confirmation of the update operation, indicating success or failure.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ChangeInteracPaymentMethodQuestionAndAnswerResponse changeInteracPaymentMethodQuestionAndAnswer(ChangeInteracPaymentMethodQuestionAndAnswerArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ChangeInteracPaymentMethodQuestionAndAnswer", args);
    return new ChangeInteracPaymentMethodQuestionAndAnswerResponse(apiResponse);
}/**
* Initializes the boarding process for a new client within the TIB Finance API.
*
* @param args the args
* @return  Returns a confirmation of successful initialization or an error message if the process fails.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public InitBoardingResponse initBoarding(InitBoardingArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("InitBoarding", args);
    return new InitBoardingResponse(apiResponse);
}/**
* Creates a new sub-client within the TIB Finance system.
*
* @param args the args
* @return  Returns a unique identifier for the newly created sub-client, formatted as a GUID.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateSubClientResponse createSubClient(CreateSubClientArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateSubClient", args);
    return new CreateSubClientResponse(apiResponse);
}/**
* Resends the payment notification email to the specified recipient.
*
* @param args the args
* @return  Returns a status indicating whether the email was successfully resent.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public ResendPaymentEmailResponse resendPaymentEmail(ResendPaymentEmailArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("ResendPaymentEmail", args);
    return new ResendPaymentEmailResponse(apiResponse);
}/**
* Initiates a retry process for a merchant's failed transfer operation.
*
* @param args the args
* @return  Returns a status indicating the success or failure of the retry operation.
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public RelaunchMerchantFailedTransferResponse relaunchMerchantFailedTransfer(RelaunchMerchantFailedTransferArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("RelaunchMerchantFailedTransfer", args);
    return new RelaunchMerchantFailedTransferResponse(apiResponse);
}/**
* 
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateSupplierTransferResponse createSupplierTransfer(CreateSupplierTransferArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateSupplierTransfer", args);
    return new CreateSupplierTransferResponse(apiResponse);
}/**
* 
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetSuppliersResponse getSuppliers(GetSuppliersArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetSuppliers", args);
    return new GetSuppliersResponse(apiResponse);
}/**
* 
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public CreateSupplierResponse createSupplier(CreateSupplierArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("CreateSupplier", args);
    return new CreateSupplierResponse(apiResponse);
}/**
* 
*
* @param args the args
* @return  
* @throws NoSuchAlgorithmException           the no such algorithm exception
* @throws InvalidKeyException                the invalid key exception
* @throws IOException                        the io exception
* @throws InvalidAlgorithmParameterException the invalid algorithm parameter
*                                            exception
* @throws NoSuchPaddingException             the no such padding exception
* @throws BadPaddingException                the bad padding exception
* @throws Base64DecodingException            the base 64 decoding exception
* @throws IllegalBlockSizeException          the illegal block size exception
* @throws InvalidKeySpecException            the invalid key spec exception
* @throws SAXException                       the sax exception
*/
public GetWalletOperationsResponse getWalletOperations(GetWalletOperationsArgs args)
        throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
            NoSuchPaddingException, BadPaddingException, SAXException, Base64DecodingException, InvalidKeySpecException,
            IllegalBlockSizeException {
    APIResponse apiResponse = client.call("GetWalletOperations", args);
    return new GetWalletOperationsResponse(apiResponse);
}

}
