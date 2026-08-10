
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
     * Transfer id.
     */
    @JsonProperty("i")
    private String i;

    /**
     * Creation date. Only populated on ListSupplierTransfers.
     */
    @JsonProperty("cdt")
    private OffsetDateTime cdt;

    /**
     * Display label of the paying payment method (for example the card brand and its last digits).
     */
    @JsonProperty("t")
    private String t;

    /**
     * Payment method type, as a PaymentMethodTypeEnum integer value.
     */
    @JsonProperty("pmt")
    private Integer pmt;

    /**
     * Masked account preview of the paying payment method.
     */
    @JsonProperty("d")
    private String d;

    /**
     * Merchant name.
     */
    @JsonProperty("m")
    private String m;

    /**
     * Transfer due date.
     */
    @JsonProperty("td")
    private OffsetDateTime td;

    /**
     * Transfer amount. On ListSupplierTransfers this is the operation amount when available, otherwise the transfer amount.
     */
    @JsonProperty("a")
    private Double a;

    /**
     * Composed process status, as a ProcessStatusEnum integer value. Defaults to New (1) when no status is available.
     */
    @JsonProperty("s")
    private Integer s;

    /**
     * Raw transfer status (ProcessStatusEnum value), taken directly from the transfer record; not reliably updated on all paths — prefer s, the composed status. Always 0 on ListTransfersForBillFast.
     */
    @JsonProperty("ts")
    private Integer ts;

    /**
     * Customer-facing status label. Only populated on ListSupplierTransfers. One of: Pending, InProgress, Completed, RevertedPending, RevertedCompleted, Error, Canceled.
     */
    @JsonProperty("cps")
    private String cps;

    /**
     * Bank return code, as a BankingOperationResultEnum integer value.
     */
    @JsonProperty("c")
    private Integer c;

    /**
     * Customer name.
     */
    @JsonProperty("cn")
    private String cn;

    /**
     * Customer email. Only populated on ListSupplierTransfers.
     */
    @JsonProperty("cem")
    private String cem;

    /**
     * Customer id. Only populated on ListSupplierTransfers.
     */
    @JsonProperty("cid")
    private String cid;

    /**
     * Bank-side transaction description. Only populated on ListSupplierTransfers.
     */
    @JsonProperty("trd")
    private String trd;

    /**
     * The merchant's own deposit account label. Not populated on ListTransfersForBillFast.
     */
    @JsonProperty("man")
    private String man;

    /**
     * The merchant's own deposit account preview (masked). Not populated on ListTransfersForBillFast.
     */
    @JsonProperty("map")
    private String map;

    /**
     * Execution date. Not populated on ListTransfersForBillFast.
     */
    @JsonProperty("ed")
    private OffsetDateTime ed;

    /**
     * True when the transfer has no payment method attached and its payment link is missing or expired — the payer can no longer complete it without a new link.
     */
    @JsonProperty("he")
    private boolean he;

    /**
     * Transfer direction (collection or deposit).
     */
    @JsonProperty("Direction")
    private Integer direction;

    /**
     * Original dollar amount of the transfer.
     */
    @JsonProperty("TransferAmount")
    private Double transferAmount;

    /**
     * Whether this transfer is a supplier payment.
     */
    @JsonProperty("IsSupplierTransfer")
    private boolean isSupplierTransfer;

    /**
     * The payer's custom alias for the supplier (from MerchantSuppliers.SupplierName). Only populated for supplier transfer list endpoints.
     */
    @JsonProperty("SupplierAlias")
    private String supplierAlias;

    /**
     * The customer's external reference number.
     */
    @JsonProperty("ern")
    private String ern;


    
    public TransferBaseInformationEntity() {
    }

    
    public TransferBaseInformationEntity(String i, OffsetDateTime cdt, String t, Integer pmt, String d, String m, OffsetDateTime td, Double a, Integer s, Integer ts, String cps, Integer c, String cn, String cem, String cid, String trd, String man, String map, OffsetDateTime ed, boolean he, Integer direction, Double transferAmount, boolean isSupplierTransfer, String supplierAlias, String ern) {
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
        this.he = he;
        this.direction = direction;
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

    public boolean getHe() {
        return he;
    }

    public void setHe(boolean he) {
        this.he = he;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
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
        return Objects.equals(i, that.i) && Objects.equals(cdt, that.cdt) && Objects.equals(t, that.t) && Objects.equals(pmt, that.pmt) && Objects.equals(d, that.d) && Objects.equals(m, that.m) && Objects.equals(td, that.td) && Objects.equals(a, that.a) && Objects.equals(s, that.s) && Objects.equals(ts, that.ts) && Objects.equals(cps, that.cps) && Objects.equals(c, that.c) && Objects.equals(cn, that.cn) && Objects.equals(cem, that.cem) && Objects.equals(cid, that.cid) && Objects.equals(trd, that.trd) && Objects.equals(man, that.man) && Objects.equals(map, that.map) && Objects.equals(ed, that.ed) && Objects.equals(he, that.he) && Objects.equals(direction, that.direction) && Objects.equals(transferAmount, that.transferAmount) && Objects.equals(isSupplierTransfer, that.isSupplierTransfer) && Objects.equals(supplierAlias, that.supplierAlias) && Objects.equals(ern, that.ern) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(i, cdt, t, pmt, d, m, td, a, s, ts, cps, c, cn, cem, cid, trd, man, map, ed, he, direction, transferAmount, isSupplierTransfer, supplierAlias, ern);
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
                ", he='" + he + '\'' +
                ", direction='" + direction + '\'' +
                ", transferAmount='" + transferAmount + '\'' +
                ", isSupplierTransfer='" + isSupplierTransfer + '\'' +
                ", supplierAlias='" + supplierAlias + '\'' +
                ", ern='" + ern + '\'' +

                '}';
    }
}