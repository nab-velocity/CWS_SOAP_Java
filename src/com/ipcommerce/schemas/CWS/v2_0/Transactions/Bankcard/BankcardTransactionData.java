/**
 * BankcardTransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information about the Bankcard transaction data.
 * Required.
 *             </summary>
 */
public class BankcardTransactionData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionData  implements java.io.Serializable {
    /* <summary>
     *             Indicates the bank account type. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType accountType;

    /* <summary>
     *             Alternative merchant data to appear on accountholder statements.
     * Subject to Issuer discretion. Conditional, optional if BankcardService.AlternativeMerchantData
     * is true.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData alternativeMerchantData;

    /* <summary>
     *             Approval code for this authorization. Conditional, required
     * if prior authorization approval was obtained.
     *             </summary> */
    private java.lang.String approvalCode;

    /* <summary>
     *             Specifies a cash back amount for PIN Debit transactions.
     * Optional.
     *             </summary> */
    private java.math.BigDecimal cashBackAmount;

    /* <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent customerPresent;

    /* <summary>
     *             Clerk/cashier identifier. Conditional, required for Retail,
     * Restaurant, and MOTO industry types.
     *             </summary> */
    private java.lang.String employeeId;

    /* <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode;

    /* <summary>
     *             Type of goods purchased. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType goodsType;

    /* <summary>
     *             Obsolete.  MerchantProfile must include Industry Type
     * and cannot be overridden.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType;

    /* <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData internetTransactionData;

    /* <summary>
     *             Informational field used to track invoice/receipt number.
     * Optional.
     *             </summary> */
    private java.lang.String invoiceNumber;

    /* <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary> */
    private java.lang.String orderNumber;

    /* <summary>
     *             Indicates whether or not the transaction represents a
     * partial shipment. Optional.
     *             </summary> */
    private java.lang.Boolean isPartialShipment;

    /* <summary>
     *             Specifies whether the cardholder provided a signature
     * for the transaction. Required.
     *             </summary> */
    private java.lang.Boolean signatureCaptured;

    /* <summary>
     *             Specifies a fee amount associated with the authorization,
     * such as convenience fees. Optional.
     *             </summary> */
    private java.math.BigDecimal feeAmount;

    /* <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary> */
    private java.lang.String terminalId;

    /* <summary>
     *             Identifies the cashier location at which the transaction
     * occurred. Optional.
     *             </summary> */
    private java.lang.String laneId;

    /* <summary>
     *             Tip amount, if known at the time of authorization. Optional.
     * </summary> */
    private java.math.BigDecimal tipAmount;

    /* <summary>
     *             Specific batch number assignment, when allowed. Optional.
     * </summary> */
    private java.lang.String batchAssignment;

    /* <summary>
     *             Indicates whether the merchant is capable of processing
     * a partial approval for this transaction. When 'false', the merchant
     * is not capable of processing partial approvals, resulting in more
     * declined transactions. Conditional, required if ServiceInformation.Tenders.PartialApprovalSupportType
     * = 'Enabled'. Otherwise, not present.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType partialApprovalCapable;

    /* <summary>
     *             Specifies the score threshold used in accepting or declining
     * certain transactions. Optional
     *             </summary> */
    private java.lang.String scoreThreshold;

    /* <summary>
     *             If ‘true’, specifies that this transaction represents
     * a sale of items that are directly convertible to cash, such as casino
     * gaming chips, money orders, deposits, wire transfer money orders,
     * Travelers Cheques, and foreign currency. Optional.
     *             </summary> */
    private java.lang.Boolean isQuasiCash;

    /* <summary>
     *             Indicates the transaction code. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode;

    public BankcardTransactionData() {
    }

    public BankcardTransactionData(
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode,
           java.lang.String transactionDateTime,
           java.lang.String campaignId,
           java.lang.String reference,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType accountType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData alternativeMerchantData,
           java.lang.String approvalCode,
           java.math.BigDecimal cashBackAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent customerPresent,
           java.lang.String employeeId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType goodsType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData internetTransactionData,
           java.lang.String invoiceNumber,
           java.lang.String orderNumber,
           java.lang.Boolean isPartialShipment,
           java.lang.Boolean signatureCaptured,
           java.math.BigDecimal feeAmount,
           java.lang.String terminalId,
           java.lang.String laneId,
           java.math.BigDecimal tipAmount,
           java.lang.String batchAssignment,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType partialApprovalCapable,
           java.lang.String scoreThreshold,
           java.lang.Boolean isQuasiCash,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode) {
        super(
            amount,
            currencyCode,
            transactionDateTime,
            campaignId,
            reference);
        this.accountType = accountType;
        this.alternativeMerchantData = alternativeMerchantData;
        this.approvalCode = approvalCode;
        this.cashBackAmount = cashBackAmount;
        this.customerPresent = customerPresent;
        this.employeeId = employeeId;
        this.entryMode = entryMode;
        this.goodsType = goodsType;
        this.industryType = industryType;
        this.internetTransactionData = internetTransactionData;
        this.invoiceNumber = invoiceNumber;
        this.orderNumber = orderNumber;
        this.isPartialShipment = isPartialShipment;
        this.signatureCaptured = signatureCaptured;
        this.feeAmount = feeAmount;
        this.terminalId = terminalId;
        this.laneId = laneId;
        this.tipAmount = tipAmount;
        this.batchAssignment = batchAssignment;
        this.partialApprovalCapable = partialApprovalCapable;
        this.scoreThreshold = scoreThreshold;
        this.isQuasiCash = isQuasiCash;
        this.transactionCode = transactionCode;
    }


    /**
     * Gets the accountType value for this BankcardTransactionData.
     * 
     * @return accountType   * <summary>
     *             Indicates the bank account type. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this BankcardTransactionData.
     * 
     * @param accountType   * <summary>
     *             Indicates the bank account type. Optional.
     *             </summary>
     */
    public void setAccountType(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the alternativeMerchantData value for this BankcardTransactionData.
     * 
     * @return alternativeMerchantData   * <summary>
     *             Alternative merchant data to appear on accountholder statements.
     * Subject to Issuer discretion. Conditional, optional if BankcardService.AlternativeMerchantData
     * is true.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData getAlternativeMerchantData() {
        return alternativeMerchantData;
    }


    /**
     * Sets the alternativeMerchantData value for this BankcardTransactionData.
     * 
     * @param alternativeMerchantData   * <summary>
     *             Alternative merchant data to appear on accountholder statements.
     * Subject to Issuer discretion. Conditional, optional if BankcardService.AlternativeMerchantData
     * is true.
     *             </summary>
     */
    public void setAlternativeMerchantData(com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData alternativeMerchantData) {
        this.alternativeMerchantData = alternativeMerchantData;
    }


    /**
     * Gets the approvalCode value for this BankcardTransactionData.
     * 
     * @return approvalCode   * <summary>
     *             Approval code for this authorization. Conditional, required
     * if prior authorization approval was obtained.
     *             </summary>
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this BankcardTransactionData.
     * 
     * @param approvalCode   * <summary>
     *             Approval code for this authorization. Conditional, required
     * if prior authorization approval was obtained.
     *             </summary>
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the cashBackAmount value for this BankcardTransactionData.
     * 
     * @return cashBackAmount   * <summary>
     *             Specifies a cash back amount for PIN Debit transactions.
     * Optional.
     *             </summary>
     */
    public java.math.BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }


    /**
     * Sets the cashBackAmount value for this BankcardTransactionData.
     * 
     * @param cashBackAmount   * <summary>
     *             Specifies a cash back amount for PIN Debit transactions.
     * Optional.
     *             </summary>
     */
    public void setCashBackAmount(java.math.BigDecimal cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }


    /**
     * Gets the customerPresent value for this BankcardTransactionData.
     * 
     * @return customerPresent   * <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent getCustomerPresent() {
        return customerPresent;
    }


    /**
     * Sets the customerPresent value for this BankcardTransactionData.
     * 
     * @param customerPresent   * <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Required.
     *             </summary>
     */
    public void setCustomerPresent(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent customerPresent) {
        this.customerPresent = customerPresent;
    }


    /**
     * Gets the employeeId value for this BankcardTransactionData.
     * 
     * @return employeeId   * <summary>
     *             Clerk/cashier identifier. Conditional, required for Retail,
     * Restaurant, and MOTO industry types.
     *             </summary>
     */
    public java.lang.String getEmployeeId() {
        return employeeId;
    }


    /**
     * Sets the employeeId value for this BankcardTransactionData.
     * 
     * @param employeeId   * <summary>
     *             Clerk/cashier identifier. Conditional, required for Retail,
     * Restaurant, and MOTO industry types.
     *             </summary>
     */
    public void setEmployeeId(java.lang.String employeeId) {
        this.employeeId = employeeId;
    }


    /**
     * Gets the entryMode value for this BankcardTransactionData.
     * 
     * @return entryMode   * <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode getEntryMode() {
        return entryMode;
    }


    /**
     * Sets the entryMode value for this BankcardTransactionData.
     * 
     * @param entryMode   * <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary>
     */
    public void setEntryMode(com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode) {
        this.entryMode = entryMode;
    }


    /**
     * Gets the goodsType value for this BankcardTransactionData.
     * 
     * @return goodsType   * <summary>
     *             Type of goods purchased. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType getGoodsType() {
        return goodsType;
    }


    /**
     * Sets the goodsType value for this BankcardTransactionData.
     * 
     * @param goodsType   * <summary>
     *             Type of goods purchased. Optional.
     *             </summary>
     */
    public void setGoodsType(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType goodsType) {
        this.goodsType = goodsType;
    }


    /**
     * Gets the industryType value for this BankcardTransactionData.
     * 
     * @return industryType   * <summary>
     *             Obsolete.  MerchantProfile must include Industry Type
     * and cannot be overridden.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this BankcardTransactionData.
     * 
     * @param industryType   * <summary>
     *             Obsolete.  MerchantProfile must include Industry Type
     * and cannot be overridden.
     *             </summary>
     */
    public void setIndustryType(com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the internetTransactionData value for this BankcardTransactionData.
     * 
     * @return internetTransactionData   * <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData getInternetTransactionData() {
        return internetTransactionData;
    }


    /**
     * Sets the internetTransactionData value for this BankcardTransactionData.
     * 
     * @param internetTransactionData   * <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary>
     */
    public void setInternetTransactionData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData internetTransactionData) {
        this.internetTransactionData = internetTransactionData;
    }


    /**
     * Gets the invoiceNumber value for this BankcardTransactionData.
     * 
     * @return invoiceNumber   * <summary>
     *             Informational field used to track invoice/receipt number.
     * Optional.
     *             </summary>
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this BankcardTransactionData.
     * 
     * @param invoiceNumber   * <summary>
     *             Informational field used to track invoice/receipt number.
     * Optional.
     *             </summary>
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the orderNumber value for this BankcardTransactionData.
     * 
     * @return orderNumber   * <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary>
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this BankcardTransactionData.
     * 
     * @param orderNumber   * <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary>
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the isPartialShipment value for this BankcardTransactionData.
     * 
     * @return isPartialShipment   * <summary>
     *             Indicates whether or not the transaction represents a
     * partial shipment. Optional.
     *             </summary>
     */
    public java.lang.Boolean getIsPartialShipment() {
        return isPartialShipment;
    }


    /**
     * Sets the isPartialShipment value for this BankcardTransactionData.
     * 
     * @param isPartialShipment   * <summary>
     *             Indicates whether or not the transaction represents a
     * partial shipment. Optional.
     *             </summary>
     */
    public void setIsPartialShipment(java.lang.Boolean isPartialShipment) {
        this.isPartialShipment = isPartialShipment;
    }


    /**
     * Gets the signatureCaptured value for this BankcardTransactionData.
     * 
     * @return signatureCaptured   * <summary>
     *             Specifies whether the cardholder provided a signature
     * for the transaction. Required.
     *             </summary>
     */
    public java.lang.Boolean getSignatureCaptured() {
        return signatureCaptured;
    }


    /**
     * Sets the signatureCaptured value for this BankcardTransactionData.
     * 
     * @param signatureCaptured   * <summary>
     *             Specifies whether the cardholder provided a signature
     * for the transaction. Required.
     *             </summary>
     */
    public void setSignatureCaptured(java.lang.Boolean signatureCaptured) {
        this.signatureCaptured = signatureCaptured;
    }


    /**
     * Gets the feeAmount value for this BankcardTransactionData.
     * 
     * @return feeAmount   * <summary>
     *             Specifies a fee amount associated with the authorization,
     * such as convenience fees. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this BankcardTransactionData.
     * 
     * @param feeAmount   * <summary>
     *             Specifies a fee amount associated with the authorization,
     * such as convenience fees. Optional.
     *             </summary>
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the terminalId value for this BankcardTransactionData.
     * 
     * @return terminalId   * <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary>
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this BankcardTransactionData.
     * 
     * @param terminalId   * <summary>
     *             Gets or sets the internet transaction data value. Optional.
     * </summary>
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the laneId value for this BankcardTransactionData.
     * 
     * @return laneId   * <summary>
     *             Identifies the cashier location at which the transaction
     * occurred. Optional.
     *             </summary>
     */
    public java.lang.String getLaneId() {
        return laneId;
    }


    /**
     * Sets the laneId value for this BankcardTransactionData.
     * 
     * @param laneId   * <summary>
     *             Identifies the cashier location at which the transaction
     * occurred. Optional.
     *             </summary>
     */
    public void setLaneId(java.lang.String laneId) {
        this.laneId = laneId;
    }


    /**
     * Gets the tipAmount value for this BankcardTransactionData.
     * 
     * @return tipAmount   * <summary>
     *             Tip amount, if known at the time of authorization. Optional.
     * </summary>
     */
    public java.math.BigDecimal getTipAmount() {
        return tipAmount;
    }


    /**
     * Sets the tipAmount value for this BankcardTransactionData.
     * 
     * @param tipAmount   * <summary>
     *             Tip amount, if known at the time of authorization. Optional.
     * </summary>
     */
    public void setTipAmount(java.math.BigDecimal tipAmount) {
        this.tipAmount = tipAmount;
    }


    /**
     * Gets the batchAssignment value for this BankcardTransactionData.
     * 
     * @return batchAssignment   * <summary>
     *             Specific batch number assignment, when allowed. Optional.
     * </summary>
     */
    public java.lang.String getBatchAssignment() {
        return batchAssignment;
    }


    /**
     * Sets the batchAssignment value for this BankcardTransactionData.
     * 
     * @param batchAssignment   * <summary>
     *             Specific batch number assignment, when allowed. Optional.
     * </summary>
     */
    public void setBatchAssignment(java.lang.String batchAssignment) {
        this.batchAssignment = batchAssignment;
    }


    /**
     * Gets the partialApprovalCapable value for this BankcardTransactionData.
     * 
     * @return partialApprovalCapable   * <summary>
     *             Indicates whether the merchant is capable of processing
     * a partial approval for this transaction. When 'false', the merchant
     * is not capable of processing partial approvals, resulting in more
     * declined transactions. Conditional, required if ServiceInformation.Tenders.PartialApprovalSupportType
     * = 'Enabled'. Otherwise, not present.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType getPartialApprovalCapable() {
        return partialApprovalCapable;
    }


    /**
     * Sets the partialApprovalCapable value for this BankcardTransactionData.
     * 
     * @param partialApprovalCapable   * <summary>
     *             Indicates whether the merchant is capable of processing
     * a partial approval for this transaction. When 'false', the merchant
     * is not capable of processing partial approvals, resulting in more
     * declined transactions. Conditional, required if ServiceInformation.Tenders.PartialApprovalSupportType
     * = 'Enabled'. Otherwise, not present.
     *             </summary>
     */
    public void setPartialApprovalCapable(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType partialApprovalCapable) {
        this.partialApprovalCapable = partialApprovalCapable;
    }


    /**
     * Gets the scoreThreshold value for this BankcardTransactionData.
     * 
     * @return scoreThreshold   * <summary>
     *             Specifies the score threshold used in accepting or declining
     * certain transactions. Optional
     *             </summary>
     */
    public java.lang.String getScoreThreshold() {
        return scoreThreshold;
    }


    /**
     * Sets the scoreThreshold value for this BankcardTransactionData.
     * 
     * @param scoreThreshold   * <summary>
     *             Specifies the score threshold used in accepting or declining
     * certain transactions. Optional
     *             </summary>
     */
    public void setScoreThreshold(java.lang.String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }


    /**
     * Gets the isQuasiCash value for this BankcardTransactionData.
     * 
     * @return isQuasiCash   * <summary>
     *             If ‘true’, specifies that this transaction represents
     * a sale of items that are directly convertible to cash, such as casino
     * gaming chips, money orders, deposits, wire transfer money orders,
     * Travelers Cheques, and foreign currency. Optional.
     *             </summary>
     */
    public java.lang.Boolean getIsQuasiCash() {
        return isQuasiCash;
    }


    /**
     * Sets the isQuasiCash value for this BankcardTransactionData.
     * 
     * @param isQuasiCash   * <summary>
     *             If ‘true’, specifies that this transaction represents
     * a sale of items that are directly convertible to cash, such as casino
     * gaming chips, money orders, deposits, wire transfer money orders,
     * Travelers Cheques, and foreign currency. Optional.
     *             </summary>
     */
    public void setIsQuasiCash(java.lang.Boolean isQuasiCash) {
        this.isQuasiCash = isQuasiCash;
    }


    /**
     * Gets the transactionCode value for this BankcardTransactionData.
     * 
     * @return transactionCode   * <summary>
     *             Indicates the transaction code. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode getTransactionCode() {
        return transactionCode;
    }


    /**
     * Sets the transactionCode value for this BankcardTransactionData.
     * 
     * @param transactionCode   * <summary>
     *             Indicates the transaction code. Optional.
     *             </summary>
     */
    public void setTransactionCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode) {
        this.transactionCode = transactionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransactionData)) return false;
        BankcardTransactionData other = (BankcardTransactionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.alternativeMerchantData==null && other.getAlternativeMerchantData()==null) || 
             (this.alternativeMerchantData!=null &&
              this.alternativeMerchantData.equals(other.getAlternativeMerchantData()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.cashBackAmount==null && other.getCashBackAmount()==null) || 
             (this.cashBackAmount!=null &&
              this.cashBackAmount.equals(other.getCashBackAmount()))) &&
            ((this.customerPresent==null && other.getCustomerPresent()==null) || 
             (this.customerPresent!=null &&
              this.customerPresent.equals(other.getCustomerPresent()))) &&
            ((this.employeeId==null && other.getEmployeeId()==null) || 
             (this.employeeId!=null &&
              this.employeeId.equals(other.getEmployeeId()))) &&
            ((this.entryMode==null && other.getEntryMode()==null) || 
             (this.entryMode!=null &&
              this.entryMode.equals(other.getEntryMode()))) &&
            ((this.goodsType==null && other.getGoodsType()==null) || 
             (this.goodsType!=null &&
              this.goodsType.equals(other.getGoodsType()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.internetTransactionData==null && other.getInternetTransactionData()==null) || 
             (this.internetTransactionData!=null &&
              this.internetTransactionData.equals(other.getInternetTransactionData()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.isPartialShipment==null && other.getIsPartialShipment()==null) || 
             (this.isPartialShipment!=null &&
              this.isPartialShipment.equals(other.getIsPartialShipment()))) &&
            ((this.signatureCaptured==null && other.getSignatureCaptured()==null) || 
             (this.signatureCaptured!=null &&
              this.signatureCaptured.equals(other.getSignatureCaptured()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.laneId==null && other.getLaneId()==null) || 
             (this.laneId!=null &&
              this.laneId.equals(other.getLaneId()))) &&
            ((this.tipAmount==null && other.getTipAmount()==null) || 
             (this.tipAmount!=null &&
              this.tipAmount.equals(other.getTipAmount()))) &&
            ((this.batchAssignment==null && other.getBatchAssignment()==null) || 
             (this.batchAssignment!=null &&
              this.batchAssignment.equals(other.getBatchAssignment()))) &&
            ((this.partialApprovalCapable==null && other.getPartialApprovalCapable()==null) || 
             (this.partialApprovalCapable!=null &&
              this.partialApprovalCapable.equals(other.getPartialApprovalCapable()))) &&
            ((this.scoreThreshold==null && other.getScoreThreshold()==null) || 
             (this.scoreThreshold!=null &&
              this.scoreThreshold.equals(other.getScoreThreshold()))) &&
            ((this.isQuasiCash==null && other.getIsQuasiCash()==null) || 
             (this.isQuasiCash!=null &&
              this.isQuasiCash.equals(other.getIsQuasiCash()))) &&
            ((this.transactionCode==null && other.getTransactionCode()==null) || 
             (this.transactionCode!=null &&
              this.transactionCode.equals(other.getTransactionCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAlternativeMerchantData() != null) {
            _hashCode += getAlternativeMerchantData().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getCashBackAmount() != null) {
            _hashCode += getCashBackAmount().hashCode();
        }
        if (getCustomerPresent() != null) {
            _hashCode += getCustomerPresent().hashCode();
        }
        if (getEmployeeId() != null) {
            _hashCode += getEmployeeId().hashCode();
        }
        if (getEntryMode() != null) {
            _hashCode += getEntryMode().hashCode();
        }
        if (getGoodsType() != null) {
            _hashCode += getGoodsType().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getInternetTransactionData() != null) {
            _hashCode += getInternetTransactionData().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getIsPartialShipment() != null) {
            _hashCode += getIsPartialShipment().hashCode();
        }
        if (getSignatureCaptured() != null) {
            _hashCode += getSignatureCaptured().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getLaneId() != null) {
            _hashCode += getLaneId().hashCode();
        }
        if (getTipAmount() != null) {
            _hashCode += getTipAmount().hashCode();
        }
        if (getBatchAssignment() != null) {
            _hashCode += getBatchAssignment().hashCode();
        }
        if (getPartialApprovalCapable() != null) {
            _hashCode += getPartialApprovalCapable().hashCode();
        }
        if (getScoreThreshold() != null) {
            _hashCode += getScoreThreshold().hashCode();
        }
        if (getIsQuasiCash() != null) {
            _hashCode += getIsQuasiCash().hashCode();
        }
        if (getTransactionCode() != null) {
            _hashCode += getTransactionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AlternativeMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AlternativeMerchantData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApprovalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CashBackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CustomerPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CustomerPresent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EmployeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EntryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "EntryMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodsType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "GoodsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "GoodsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IndustryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "IndustryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetTransactionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InternetTransactionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InternetTransactionData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartialShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IsPartialShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureCaptured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "SignatureCaptured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TerminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laneId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LaneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TipAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BatchAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialApprovalCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PartialApprovalCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PartialApprovalSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ScoreThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQuasiCash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IsQuasiCash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
