
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Error;

import java.util.Arrays;
import java.util.Objects;

public class APIResponse {

        @JsonAlias({"DasPaymentId", "DasProviderId", "TransferId", 
                    "SessionId", "RecordIsModify", "Key", 
                    "BoardingInfo", "BoardingResultEntity", "PaymentMethodId", 
                    "OperationId", "OperationStatus", "TransactionId", 
                    "TransactionStatus", "IsRevertable", "Reason", 
                    "IsValid", "BillId", "RedirectUrl", 
                    "Token", "ClientLoginId", "ClientId", 
                    "CustomerId", "CreateFreeOperationBatchResponses", "Status", 
                    "PaymentId", "ReferenceNumber", "Message", 
                    "RequestDataResponse", "MerchantId", "AutoSelectPaymentFlowResult", 
                    "PaymentFlowParsingResult", "PaymentLink", "CreatedServiceId", 
                    "ServiceId", "TransactionsGroupId", "IsClientExisting", 
                    "Operation", "ErrorReportDataList", "RelatedClientId", 
                    "ClientName", "TableName", "RelatedDescription", 
                    "BillAmount", "ProviderAccountOperationList", "BillsInfo", 
                    "Bill", "ApprovalStatus", "MerchantName", 
                    "MerchantEmail", "SandboxId", "Processing", 
                    "Payout", "GetBoardingMerchantCredentialResultEntity", "GetBoardingStatusResultEntity", 
                    "Currency", "MerchantLanguage", "AuthorizationStatus", 
                    "CreatedDate", "PhoneNumber", "MerchantDescription", 
                    "AccountName", "AccountInformation", "BoardingStatus", 
                    "JsonObject", "ValidationToken", "WhiteLabeling", 
                    "Client", "ClientSettings", "ServiceSettings", 
                    "ServiceFeeSettings", "Users", "ConsolidationInternalReportList", 
                    "ContractEdditionRequests", "Customer", "Customers", 
                    "OperationIds", "OperationList", "PublicTokenId", 
                    "DropIn", "TransactionFeesAgregated", "Question", 
                    "Owner", "Email", "Description", 
                    "Mobile", "LoginRelations", "Merchant", 
                    "Merchants", "DateLineReport", "Transfers", 
                    "PaymentMethodRequestData", "PaymentMethod", "Payment", 
                    "Countries", "Provinces", "ServiceName", 
                    "RoutingType", "RecuringTransfersCount", "RecuringTransfers", 
                    "BoardingServiceMerchants", "Service", "LoginTypeId", 
                    "Username", "Language", "IsReadOnly", 
                    "InternalReferenceId", "AggregatedCategoryExtractions", "MonthlyTransactionStats", 
                    "DailyCashbackStats", "Transactions", "TransfersCreations", 
                    "Transfer", "Wallets", "IsValidPaymentId", 
                    "Bills", "Clients", "CanadaDasPayments", 
                    "QuebecDasPayments", "CanadaDasProvider", "QuebecDasProvider", 
                    "PaymentMethods", "Payments", "Services", 
                    "whiteLabelings", "Step", "CompanyName", 
                    "CompanyAddress", "AdminFirstName", "AdminLastName", 
                    "AdminAddress", "CompanyType", "DidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService", 
                    "DidOwnersAlreadyAskedForBankrupcy", "HaveYouBeenSubjectOfVisaRiskProgram", "DrivingLicenceNumber", 
                    "CompanyTypes", "CompanyInfos", "EditionRequests", 
                    "LoggOffSuccess", "NoOfPendingBoarding", "NoOfActiveBoarding", 
                    "TransmissionResults", "CompressedTransmissionResults", "DataId", 
                    "Amount", "TransferType", "TransactionDueDate", 
                    "DataCryptedBase64", "CaseStatus", "RetrieveDocumentResultEntity", 
                    "HasBeenDeleted", "BoardingInformationId", "SearchResult", 
                    "NeqOrNi", "AddressDisplay", "CreationDate", 
                    "IsQuebec", "HasDetails", "SubmitDocumentResultEntity", 
                    "Count", "ContractEditionRequest"})
        private Object response;

        @JsonProperty("CryptedSelf")
        private String cryptedSelf;

        @JsonProperty("IV")
        private String iv;

        @JsonProperty("Errors")
        private Error[] errors;

        @JsonProperty("HasError")
        private boolean hasError;

        @JsonProperty("Messages")
        private String messages;

        @JsonProperty("NodeAnswered")
        private String nodeAnswered;

        public String getCryptedSelf() {
            return cryptedSelf;
        }

        public void setCryptedSelf(String cryptedSelf) {
            this.cryptedSelf = cryptedSelf;
        }

        public String getIv() {
            return iv;
        }

        public void setIv(String iv) {
            this.iv = iv;
        }

        public Error[] getErrors() {
            return errors;
        }

        public void setErrors(Error[] errors) {
            this.errors = errors;
        }

        public boolean isHasError() {
            return hasError;
        }

        public void setHasError(boolean hasError) {
            this.hasError = hasError;
        }

        public String getMessages() {
            return messages;
        }

        public void setMessages(String messages) {
            this.messages = messages;
        }

        public String getNodeAnswered() {
            return nodeAnswered;
        }

        public void setNodeAnswered(String nodeAnswered) {
            this.nodeAnswered = nodeAnswered;
        }

        public Object getResponse() {
            return response;
        }

        public void setResponse(Object response) {
            this.response = response;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            APIResponse that = (APIResponse) o;
            return hasError == that.hasError &&
                Objects.equals(response, that.response) &&
                Objects.equals(cryptedSelf, that.cryptedSelf) &&
                Objects.equals(iv, that.iv) &&
                Arrays.equals(errors, that.errors) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(nodeAnswered, that.nodeAnswered);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(response, cryptedSelf, iv, hasError, messages, nodeAnswered);
            result = 31 * result + Arrays.hashCode(errors);
            return result;
        }

        @Override
        public String toString() {
            return "APIResponse{" +
                    "response=" + response +
                    ", cryptedSelf='" + cryptedSelf + '\'' +
                    ", iv='" + iv + '\'' +
                    ", errors=" + Arrays.toString(errors) +
                    ", hasError=" + hasError +
                    ", messages='" + messages + '\'' +
                    ", nodeAnswered='" + nodeAnswered + '\'' +
                    '}';
        }
    }
