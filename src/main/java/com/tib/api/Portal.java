
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
     * Creates the session.
     *
     * @param args the args
     * @return  CreateSessionResponse.
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
     * Lists the services.
     *
     * @param args the args
     * @return  ListServicesResponse.
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
     * Gets the service.
     *
     * @param args the args
     * @return  GetServiceResponse.
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
     * Retrieves wallet information for a service, including the effective balance (wallet balance plus available delay buffer minus pending collections), the risk-adjusted withdrawable amount, processing status, and whether the new wallet feature is active.
     *
     * @param args the args
     * @return  A GetWalletInformationsResponse containing the wallet model with balance, withdrawable amount, and status.
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
     * Lists the merchants.
     *
     * @param args the args
     * @return  ListMerchantsResponse.
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
     * Retrieves the payment provider boarding (onboarding) status for all merchants within a service. Returns each merchant's boarding progress with their current status.
     *
     * @param args the args
     * @return  A GetServiceBoardingStatusResponse containing the boarding status of each merchant in the service.
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
     * Creates the merchant.
     *
     * @param args the args
     * @return  A CreateMerchantResponse containing the identifier of the newly created merchant.
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
     * Adds a new bank account (i.e., new merchant in TIB's data model) to an existing fully-boarded service. Authorizes the new merchant on insert. One-shot semantic: no pending state, no approval workflow, no confirmation email. Owner and Currency are inherited from an active sibling merchant on the same service. This is a parallel path to CreateMerchant (which serves boarding's first-merchant insert).
     *
     * @param args the args
     * @return  An AddBankAccountResponse containing the identifier of the newly created merchant.
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
    public AddBankAccountResponse addBankAccount(AddBankAccountArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("AddBankAccount", args);
        return new AddBankAccountResponse(apiResponse);
    }
    /**
     * Gets the merchant.
     *
     * @param args the args
     * @return  GetMerchantResponse.
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
     * Saves the merchant.
     *
     * @param args the args
     * @return  A SaveMerchantResponse indicating success or errors.
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
     * Saves the merchant basic information.
     *
     * @param args the args
     * @return  SaveMerchantResponse.
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
     * Saves the merchant account information. This operation is protected by two-factor authentication. On first use the response carries two-factor setup instructions (TwoFactorStatus and TwoFactorSetupData); see the Two-factor authentication guide.
     *
     * @param args the args
     * @return  A SaveMerchantResponse containing the two-factor authentication status of the operation.
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
     * Deletes the merchant.
     *
     * @param args the args
     * @return  DeleteMerchantResponse.
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
     * Gets the merchants by external identifier.
     *
     * @param args the args
     * @return  GetMerchantsByExternalIdResponse.
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
     * Adjusts a merchant's wallet balance. IncreaseWallet collects the amount from the merchant (by EFT, or by Interac when requested) and credits the wallet; DecreaseWallet withdraws it from the wallet balance, subject to the risk-adjusted withdrawable balance. Requires the wallet feature to be enabled for the service. This operation supports idempotency via the IdempotencyKey field.
     *
     * @param args the args
     * @return  An AdjustWalletResponse containing the identifier of the transfer created for the adjustment and WasSuccessful set to true; when a withdrawal is refused because the client's boarding is incomplete, no transfer is created and the response carries RequiresSupplierBoarding set to true with WasSuccessful false instead.
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
     * Lists the customers.
     *
     * @param args the args
     * @return  ListCustomersResponse.
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
     * Creates the customer.
     *
     * @param args the args
     * @return  CreateCustomerResponse.
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
     * Gets the customer.
     *
     * @param args the args
     * @return  GetCustomerResponse.
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
     * Saves the customer.
     *
     * @param args the args
     * @return  SaveCustomerResponse.
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
     * Updates only a customer's contact information (email, phone, address, language) without touching the rest of the customer record. Use this when editing the contact card in isolation: fields left null preserve the stored value, empty strings clear it, and non-empty values overwrite.
     *
     * @param args the args
     * @return  A SaveCustomerContactInfoResponse containing the contact information as persisted after the save.
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
    public SaveCustomerContactInfoResponse saveCustomerContactInfo(SaveCustomerContactInfoArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("SaveCustomerContactInfo", args);
        return new SaveCustomerContactInfoResponse(apiResponse, objectMapper);
    }
    /**
     * Deletes the customer.
     *
     * @param args the args
     * @return  DeleteCustomerResponse.
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
     * Gets the customers by external identifier.
     *
     * @param args the args
     * @return  GetCustomersByExternalIdResponse.
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
     * Lists the payment methods.
     *
     * @param args the args
     * @return  ListPaymentMethodsResponse.
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
     * Creates the credit card payment method.
     *
     * @param args the args
     * @return  CreateCreditCardPaymentMethodResponse.
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
     * Creates the direct account payment method.
     *
     * @param args the args
     * @return  A CreateDirectAccountPaymentMethodResponse containing the identifier of the newly created payment method.
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
     * Creates the Interac payment method.
     *
     * @param args the args
     * @return  CreateInteracPaymentMethodResponse.
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
     * Gets the payment method.
     *
     * @param args the args
     * @return  GetPaymentMethodResponse.
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
     * Deletes the payment method.
     *
     * @param args the args
     * @return  DeletePaymentMethodResponse.
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
     * Sets the default payment method.
     *
     * @param args the args
     * @return  SetDefaultPaymentMethodResponse.
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
     * Lists the bills.
     *
     * @param args the args
     * @return  ListBillsResponse.
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
     * Creates the bill.
     *
     * @param args the args
     * @return  CreateBillResponse.
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
     * Gets the bill.
     *
     * @param args the args
     * @return  GetBillResponse.
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
     * Deletes the bill.
     *
     * @param args the args
     * @return  DeleteBillResponse.
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
     * Lists the transfers.
     *
     * @param args the args
     * @return  ListTransfersResponse.
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
     * Retrieves a filtered, summarized list of transfers for a service using an optimized query. Supports filtering by transfer type, date range, merchant, transfer group, error status, and resolved status.
     *
     * @param args the args
     * @return  A ListTransfersFastResponse containing the summarized transfer list.
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
     * Retrieves all active recurring transfers for a given service, including their next scheduled recurrence date and associated merchant information.
     *
     * @param args the args
     * @return  A GetRecuringTransfersResponse containing the list of recurring transfers.
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
     * Deletes a recurring transfer by its identifier, stopping all future scheduled occurrences.
     *
     * @param args the args
     * @return  A DeleteRecuringTransferResponse.
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
     * Creates the payment. This operation supports idempotency via the IdempotencyKey field.
     *
     * @param args the args
     * @return  CreatePaymentResponse.
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
     * Creates the direct Interac transaction. This operation supports idempotency via the IdempotencyKey field.
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
     * Creates the transaction from raw. This operation supports idempotency via the IdempotencyKey field.
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
     * Forces immediate processing of a transfer that would otherwise wait for the next scheduled run. For supplier transfers, only the paying merchant (fee-payer) can force-process; the recipient supplier cannot force-execute a transfer they did not create. This operation supports idempotency via the IdempotencyKey field.
     *
     * @param args the args
     * @return  A ForcePaymentProcessResponse describing the outcome of the forced run.
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
     * Creates the free operation. This operation supports idempotency via the IdempotencyKey field.
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
        return new CreateFreeOperationResponse(apiResponse);
    }
    /**
     * Creates a batch of free operations (deposits or collections) in a single call. Validates that client onboarding (KYC) is completed before allowing free deposit operations. This operation supports idempotency via the IdempotencyKey field.
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
     * Reverts (cancels or reverses) a transfer. For pending gateway payments, deletes the transfer and its public token. For processed payments, creates reversal operations for each non-fee operation. Rejects transfers over $5,000 or wallet-type transfers. For supplier transfers, only the paying merchant (fee-payer) can revert; the recipient supplier cannot revert a transfer they did not create. This operation supports idempotency via the IdempotencyKey field.
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
        return new CreateSubClientResponse(apiResponse, objectMapper);
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
     * Relaunches (retries) a previously failed transfer for a merchant. Resets the failed payment in the database for reprocessing and sends an internal notification email with the transfer details. This operation supports idempotency via the IdempotencyKey field.
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
     * Creates a payment transfer from the calling merchant to a supplier. Validates both merchants, runs business rules on the sending merchant's limits, creates the transfer as a free collection, and optionally creates a bill. Notifies the supplier unless client approval is required. This operation supports idempotency via the IdempotencyKey field.
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
        return new CreateSupplierTransferResponse(apiResponse);
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
     * Soft-deletes a supplier link for the specified merchant. The supplier's merchant account is not affected — only the payer-to-supplier association is removed.
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
     * Lists supplier transfers initiated by the calling merchant (identified via FeeMerchantId). Returns transfers where the caller is the fee-payer, with optional date/status filters.
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
     * Lists recurring supplier transfers across an entire service. Returns every non-deleted recurring supplier transfer where any merchant in the given service is the fee-payer, with the supplier merchant's name on each entry. Use this to view all recurring supplier payments service-wide; use ListSupplierRecurringTransfers when scoping to a single fee-paying merchant.
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
    public ListSupplierRecurringTransfersResponse listSupplierRecurringTransfersByService(ListSupplierRecurringTransfersByServiceArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("ListSupplierRecurringTransfersByService", args);
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
    /**
     * Verifies the 2FA setup after user scans QR code and enters the code. Enables 2FA for the user once verification succeeds.
     *
     * @param args the args
     * @return  Verify2FASetupResponse indicating success or failure.
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
    public Verify2FASetupResponse verify2FASetup(Verify2FASetupArgs args)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException,
                NoSuchPaddingException, BadPaddingException, SAXException, InvalidKeySpecException,
                IllegalBlockSizeException {
        APIResponse apiResponse = client.call("Verify2FASetup", args);
        return new Verify2FASetupResponse(apiResponse, objectMapper);
    }

}
