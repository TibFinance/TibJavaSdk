
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferBaseInformationEntity   {

    
    /**
     * Unique identifier of the transfer record
     */
    @JsonProperty("i")
    private String i;

    /**
     * The timestamp when the transfer was created.
     */
    @JsonProperty("cdt")
    private OffsetDateTime cdt;

    /**
     * The timestamp of the transfer
     */
    @JsonProperty("t")
    private String t;

    /**
     * Unique integer identifier for the payment
     */
    @JsonProperty("pmt")
    private Integer pmt;

    /**
     * Transfer description
     */
    @JsonProperty("d")
    private String d;

    /**
     * A human‑readable message or note associated with the transfer
     */
    @JsonProperty("m")
    private String m;

    /**
     * The date and time when the transfer was created.
     */
    @JsonProperty("td")
    private OffsetDateTime td;

    /**
     * The monetary amount of the transfer
     */
    @JsonProperty("a")
    private Double a;

    /**
     * Total number of transfer entries returned
     */
    @JsonProperty("s")
    private Integer s;

    /**
     * Timestamp of the transfer record
     */
    @JsonProperty("ts")
    private Integer ts;

    /**
     * Identifier of the clearing/payment system used for the transfer
     */
    @JsonProperty("cps")
    private String cps;

    /**
     * Total number of transfers returned by the request
     */
    @JsonProperty("c")
    private Integer c;

    /**
     * The name of the counterparty involved in the transfer
     */
    @JsonProperty("cn")
    private String cn;

    /**
     * The unique identifier of the cash entry (CEM) associated with the transfer
     */
    @JsonProperty("cem")
    private String cem;

    /**
     * Globally unique identifier of the transfer record
     */
    @JsonProperty("cid")
    private String cid;

    /**
     * Unique identifier of the transfer returned by ListTransfersForBillFast
     */
    @JsonProperty("trd")
    private String trd;

    /**
     * Identifier of the managing entity for the transfer
     */
    @JsonProperty("man")
    private String man;

    /**
     * String identifier of the transfer mapping returned by ListTransfersForBillFast
     */
    @JsonProperty("map")
    private String map;

    /**
     * The end date and time of the transfer period returned by ListTransfersForBillFast.
     */
    @JsonProperty("ed")
    private OffsetDateTime ed;

    /**
     * The timestamp indicating when the transfer was completed
     */
    @JsonProperty("ed2")
    private OffsetDateTime ed2;

    /**
     * Indicates whether any transfer in the list has an error
     */
    @JsonProperty("he")
    private boolean he;

    /**
     * Indicates if the transfer record is marked as deleted
     */
    @JsonProperty("del")
    private boolean del;

    /**
     * The total monetary amount collected for the transfer operation.
     */
    @JsonProperty("CollectOperationAmount")
    private Double collectOperationAmount;

    /**
     * The monetary amount of the deposit operation associated with the BillFast transfer.
     */
    @JsonProperty("DepositOperationAmount")
    private Double depositOperationAmount;

    /**
     * The fee amount applied to the transfer under the Convenient Fees scheme.
     */
    @JsonProperty("ConvenientFeesOperationAmount")
    private Double convenientFeesOperationAmount;

    /**
     * The total fee amount applied to the transfer operation.
     */
    @JsonProperty("FeesOperationAmount")
    private Double feesOperationAmount;

    /**
     * Indicates the transfer direction relative to the biller
     */
    @JsonProperty("Direction")
    private Integer direction;

    /**
     * Indicates whether the listed transfer has been refunded.
     */
    @JsonProperty("Refunded")
    private boolean refunded;

    /**
     * The monetary amount transferred for the BillFast transaction.
     */
    @JsonProperty("TransferAmount")
    private Double transferAmount;

    /**
     * Indicates whether the listed transfer is a supplier transfer.
     */
    @JsonProperty("IsSupplierTransfer")
    private boolean isSupplierTransfer;

    /**
     * The payer's custom alias for the supplier (from MerchantSuppliers.SupplierName). Only populated for supplier transfer list endpoints.
     */
    @JsonProperty("SupplierAlias")
    private String supplierAlias;

    /**
     * The unique external reference number assigned to the transfer
     */
    @JsonProperty("ern")
    private String ern;


    
    public TransferBaseInformationEntity() {
    }

    
    public TransferBaseInformationEntity(String i, OffsetDateTime cdt, String t, Integer pmt, String d, String m, OffsetDateTime td, Double a, Integer s, Integer ts, String cps, Integer c, String cn, String cem, String cid, String trd, String man, String map, OffsetDateTime ed, OffsetDateTime ed2, boolean he, boolean del, Double collectOperationAmount, Double depositOperationAmount, Double convenientFeesOperationAmount, Double feesOperationAmount, Integer direction, boolean refunded, Double transferAmount, boolean isSupplierTransfer, String supplierAlias, String ern) {
        this.i = i;
        this.cdt = cdt;
        this.t = t;
        this.pmt = pmt;
        this.d = d;
        this.m = m;
        this.td = td;
        this.a = a;
        this.s = s;
        this.ts = ts;
        this.cps = cps;
        this.c = c;
        this.cn = cn;
        this.cem = cem;
        this.cid = cid;
        this.trd = trd;
        this.man = man;
        this.map = map;
        this.ed = ed;
        this.ed2 = ed2;
        this.he = he;
        this.del = del;
        this.collectOperationAmount = collectOperationAmount;
        this.depositOperationAmount = depositOperationAmount;
        this.convenientFeesOperationAmount = convenientFeesOperationAmount;
        this.feesOperationAmount = feesOperationAmount;
        this.direction = direction;
        this.refunded = refunded;
        this.transferAmount = transferAmount;
        this.isSupplierTransfer = isSupplierTransfer;
        this.supplierAlias = supplierAlias;
        this.ern = ern;
    }
    
    

    
    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public OffsetDateTime getCdt() {
        return cdt;
    }

    public void setCdt(OffsetDateTime cdt) {
        this.cdt = cdt;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public Integer getPmt() {
        return pmt;
    }

    public void setPmt(Integer pmt) {
        this.pmt = pmt;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public OffsetDateTime getTd() {
        return td;
    }

    public void setTd(OffsetDateTime td) {
        this.td = td;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public String getCps() {
        return cps;
    }

    public void setCps(String cps) {
        this.cps = cps;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getCem() {
        return cem;
    }

    public void setCem(String cem) {
        this.cem = cem;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTrd() {
        return trd;
    }

    public void setTrd(String trd) {
        this.trd = trd;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public OffsetDateTime getEd() {
        return ed;
    }

    public void setEd(OffsetDateTime ed) {
        this.ed = ed;
    }

    public OffsetDateTime getEd2() {
        return ed2;
    }

    public void setEd2(OffsetDateTime ed2) {
        this.ed2 = ed2;
    }

    public boolean getHe() {
        return he;
    }

    public void setHe(boolean he) {
        this.he = he;
    }

    public boolean getDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public Double getCollectOperationAmount() {
        return collectOperationAmount;
    }

    public void setCollectOperationAmount(Double collectOperationAmount) {
        this.collectOperationAmount = collectOperationAmount;
    }

    public Double getDepositOperationAmount() {
        return depositOperationAmount;
    }

    public void setDepositOperationAmount(Double depositOperationAmount) {
        this.depositOperationAmount = depositOperationAmount;
    }

    public Double getConvenientFeesOperationAmount() {
        return convenientFeesOperationAmount;
    }

    public void setConvenientFeesOperationAmount(Double convenientFeesOperationAmount) {
        this.convenientFeesOperationAmount = convenientFeesOperationAmount;
    }

    public Double getFeesOperationAmount() {
        return feesOperationAmount;
    }

    public void setFeesOperationAmount(Double feesOperationAmount) {
        this.feesOperationAmount = feesOperationAmount;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(boolean refunded) {
        this.refunded = refunded;
    }

    public Double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public boolean getIsSupplierTransfer() {
        return isSupplierTransfer;
    }

    public void setIsSupplierTransfer(boolean isSupplierTransfer) {
        this.isSupplierTransfer = isSupplierTransfer;
    }

    public String getSupplierAlias() {
        return supplierAlias;
    }

    public void setSupplierAlias(String supplierAlias) {
        this.supplierAlias = supplierAlias;
    }

    public String getErn() {
        return ern;
    }

    public void setErn(String ern) {
        this.ern = ern;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferBaseInformationEntity that = (TransferBaseInformationEntity) o;
        return Objects.equals(i, that.i) && Objects.equals(cdt, that.cdt) && Objects.equals(t, that.t) && Objects.equals(pmt, that.pmt) && Objects.equals(d, that.d) && Objects.equals(m, that.m) && Objects.equals(td, that.td) && Objects.equals(a, that.a) && Objects.equals(s, that.s) && Objects.equals(ts, that.ts) && Objects.equals(cps, that.cps) && Objects.equals(c, that.c) && Objects.equals(cn, that.cn) && Objects.equals(cem, that.cem) && Objects.equals(cid, that.cid) && Objects.equals(trd, that.trd) && Objects.equals(man, that.man) && Objects.equals(map, that.map) && Objects.equals(ed, that.ed) && Objects.equals(ed2, that.ed2) && Objects.equals(he, that.he) && Objects.equals(del, that.del) && Objects.equals(collectOperationAmount, that.collectOperationAmount) && Objects.equals(depositOperationAmount, that.depositOperationAmount) && Objects.equals(convenientFeesOperationAmount, that.convenientFeesOperationAmount) && Objects.equals(feesOperationAmount, that.feesOperationAmount) && Objects.equals(direction, that.direction) && Objects.equals(refunded, that.refunded) && Objects.equals(transferAmount, that.transferAmount) && Objects.equals(isSupplierTransfer, that.isSupplierTransfer) && Objects.equals(supplierAlias, that.supplierAlias) && Objects.equals(ern, that.ern) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(i, cdt, t, pmt, d, m, td, a, s, ts, cps, c, cn, cem, cid, trd, man, map, ed, ed2, he, del, collectOperationAmount, depositOperationAmount, convenientFeesOperationAmount, feesOperationAmount, direction, refunded, transferAmount, isSupplierTransfer, supplierAlias, ern);
    }

    @Override
    public String toString() {
        return "TransferBaseInformationEntity{" +
                "i='" + i + '\'' +
                ", cdt='" + cdt + '\'' +
                ", t='" + t + '\'' +
                ", pmt='" + pmt + '\'' +
                ", d='" + d + '\'' +
                ", m='" + m + '\'' +
                ", td='" + td + '\'' +
                ", a='" + a + '\'' +
                ", s='" + s + '\'' +
                ", ts='" + ts + '\'' +
                ", cps='" + cps + '\'' +
                ", c='" + c + '\'' +
                ", cn='" + cn + '\'' +
                ", cem='" + cem + '\'' +
                ", cid='" + cid + '\'' +
                ", trd='" + trd + '\'' +
                ", man='" + man + '\'' +
                ", map='" + map + '\'' +
                ", ed='" + ed + '\'' +
                ", ed2='" + ed2 + '\'' +
                ", he='" + he + '\'' +
                ", del='" + del + '\'' +
                ", collectOperationAmount='" + collectOperationAmount + '\'' +
                ", depositOperationAmount='" + depositOperationAmount + '\'' +
                ", convenientFeesOperationAmount='" + convenientFeesOperationAmount + '\'' +
                ", feesOperationAmount='" + feesOperationAmount + '\'' +
                ", direction='" + direction + '\'' +
                ", refunded='" + refunded + '\'' +
                ", transferAmount='" + transferAmount + '\'' +
                ", isSupplierTransfer='" + isSupplierTransfer + '\'' +
                ", supplierAlias='" + supplierAlias + '\'' +
                ", ern='" + ern + '\'' +

                '}';
    }
}