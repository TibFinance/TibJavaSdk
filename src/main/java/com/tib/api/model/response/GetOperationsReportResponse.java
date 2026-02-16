
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.OperationDateReportEntity;
import com.tib.api.model.TransferBaseInformationEntity;
import com.tib.api.model.USOperationReportEntity;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetOperationsReportResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("DateLineReport")
    private List<OperationDateReportEntity> dateLineReport;

    @JsonProperty("Transfers")
    private List<TransferBaseInformationEntity> transfers;

    @JsonProperty("USOperationsData")
    private List<USOperationReportEntity> uSOperationsData;

    @JsonProperty("IsBrandNewSupplier")
    private boolean isBrandNewSupplier;


    public GetOperationsReportResponse(Error[] errors, boolean hasError, String messages, List<OperationDateReportEntity> dateLineReport, List<TransferBaseInformationEntity> transfers, List<USOperationReportEntity> uSOperationsData, boolean isBrandNewSupplier) {
        super(errors, hasError, messages);
        this.dateLineReport = dateLineReport;
        this.transfers = transfers;
        this.uSOperationsData = uSOperationsData;
        this.isBrandNewSupplier = isBrandNewSupplier;
    }

    public GetOperationsReportResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dateLineReport = (List<OperationDateReportEntity>) apiResponse.getResponse();
            this.transfers = (List<TransferBaseInformationEntity>) apiResponse.getResponse();
            this.uSOperationsData = (List<USOperationReportEntity>) apiResponse.getResponse();
            this.isBrandNewSupplier = Boolean.parseBoolean(apiResponse.getResponse().toString());
        }
    }

    
    public List<OperationDateReportEntity> getDateLineReport() {
        return dateLineReport;
    }

    public void setDateLineReport(List<OperationDateReportEntity> dateLineReport) {
        this.dateLineReport = dateLineReport;
    }

    public List<TransferBaseInformationEntity> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<TransferBaseInformationEntity> transfers) {
        this.transfers = transfers;
    }

    public List<USOperationReportEntity> getUSOperationsData() {
        return uSOperationsData;
    }

    public void setUSOperationsData(List<USOperationReportEntity> uSOperationsData) {
        this.uSOperationsData = uSOperationsData;
    }

    public boolean getIsBrandNewSupplier() {
        return isBrandNewSupplier;
    }

    public void setIsBrandNewSupplier(boolean isBrandNewSupplier) {
        this.isBrandNewSupplier = isBrandNewSupplier;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOperationsReportResponse that = (GetOperationsReportResponse) o;
        return Objects.equals(dateLineReport, that.dateLineReport) && Objects.equals(transfers, that.transfers) && Objects.equals(uSOperationsData, that.uSOperationsData) && Objects.equals(isBrandNewSupplier, that.isBrandNewSupplier) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dateLineReport, transfers, uSOperationsData, isBrandNewSupplier);
    }

    @Override
    public String toString() {
        return "GetOperationsReportResponse{" +
                "dateLineReport='" + dateLineReport + '\'' +
                ", transfers='" + transfers + '\'' +
                ", uSOperationsData='" + uSOperationsData + '\'' +
                ", isBrandNewSupplier='" + isBrandNewSupplier + '\'' +

                '}';
    }
}