/**
 * TransactionInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains detailed transaction data for a single transaction.
 * Expected.
 *             </summary>
 */
public class TransactionInformation  implements java.io.Serializable {
    /* <summary>
     *             The transaction Amount. Expected.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             The transaction ApprovalCode. Expected on transaction
     * types that return an ApprovalCode.
     *             </summary> */
    private java.lang.String approvalCode;

    /* <summary>
     *             Transaction information specific to Bankcard transactions.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BankcardData bankcardData;

    /* <summary>
     *             The BatchId of the transaction. Expected.
     *             </summary> */
    private java.lang.String batchId;

    /* <summary>
     *             The date and time the transaction was captured, in UTC.
     * Expected on successfully captured transactions.
     *             </summary> */
    private java.util.Calendar captureDateTime;

    /* <summary>
     *             The capture state of the transaction. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState;

    /* <summary>
     *             The capture status message returned from the service provider.
     * Expected if the service provider suppports partial approved batches.
     * Expected.
     *             </summary> */
    private java.lang.String captureStatusMessage;

    /* <summary>
     *             The captured amount of the transaction. Expected.
     *             </summary> */
    private java.math.BigDecimal capturedAmount;

    /* <summary>
     *             The CustomerId specified by the merchant on the transaction
     * request. Expected when CustomerId was specified.
     *             </summary> */
    private java.lang.String customerId;

    /* <summary>
     *             Transaction information specific to Electronic Checking
     * transactions. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckData electronicCheckData;

    /* <summary>
     *             Whether transaction was acknowledged. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged;

    /* <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary> */
    private java.lang.String maskedPAN;

    /* <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary> */
    private java.lang.String merchantProfileId;

    /* <summary>
     *             The OriginatorTransactionId of the transaction. Expected.
     * </summary> */
    private java.lang.String originatorTransactionId;

    /* <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary> */
    private java.lang.String reference;

    /* <summary>
     *             The ID of the service used for the transaction. Expected.
     * </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary> */
    private java.lang.String serviceKey;

    /* <summary>
     *             The ServiceTransactionId of the transaction. Expected.
     * </summary> */
    private java.lang.String serviceTransactionId;

    /* <summary>
     *             Approval or decline status of the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status;

    /* <summary>
     *             Transaction information specific to Stored Value transactions.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.StoredValueData storedValueData;

    /* <summary>
     *             The Transaction Class and Type of the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair;

    /* <summary>
     *             The TransactionID of the transaction. Expected.
     *             </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState;

    /* <summary>
     *             The StatusCode returned from the transaction. Expected.
     * </summary> */
    private java.lang.String transactionStatusCode;

    /* <summary>
     *             The timestamp of the transaction, in UTC. Expected.
     *             </summary> */
    private java.util.Calendar transactionTimestamp;

    public TransactionInformation() {
    }

    public TransactionInformation(
           java.math.BigDecimal amount,
           java.lang.String approvalCode,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BankcardData bankcardData,
           java.lang.String batchId,
           java.util.Calendar captureDateTime,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           java.lang.String captureStatusMessage,
           java.math.BigDecimal capturedAmount,
           java.lang.String customerId,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckData electronicCheckData,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged,
           java.lang.String maskedPAN,
           java.lang.String merchantProfileId,
           java.lang.String originatorTransactionId,
           java.lang.String reference,
           java.lang.String serviceId,
           java.lang.String serviceKey,
           java.lang.String serviceTransactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.StoredValueData storedValueData,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair,
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.String transactionStatusCode,
           java.util.Calendar transactionTimestamp) {
           this.amount = amount;
           this.approvalCode = approvalCode;
           this.bankcardData = bankcardData;
           this.batchId = batchId;
           this.captureDateTime = captureDateTime;
           this.captureState = captureState;
           this.captureStatusMessage = captureStatusMessage;
           this.capturedAmount = capturedAmount;
           this.customerId = customerId;
           this.electronicCheckData = electronicCheckData;
           this.isAcknowledged = isAcknowledged;
           this.maskedPAN = maskedPAN;
           this.merchantProfileId = merchantProfileId;
           this.originatorTransactionId = originatorTransactionId;
           this.reference = reference;
           this.serviceId = serviceId;
           this.serviceKey = serviceKey;
           this.serviceTransactionId = serviceTransactionId;
           this.status = status;
           this.storedValueData = storedValueData;
           this.transactionClassTypePair = transactionClassTypePair;
           this.transactionId = transactionId;
           this.transactionState = transactionState;
           this.transactionStatusCode = transactionStatusCode;
           this.transactionTimestamp = transactionTimestamp;
    }


    /**
     * Gets the amount value for this TransactionInformation.
     * 
     * @return amount   * <summary>
     *             The transaction Amount. Expected.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionInformation.
     * 
     * @param amount   * <summary>
     *             The transaction Amount. Expected.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the approvalCode value for this TransactionInformation.
     * 
     * @return approvalCode   * <summary>
     *             The transaction ApprovalCode. Expected on transaction
     * types that return an ApprovalCode.
     *             </summary>
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this TransactionInformation.
     * 
     * @param approvalCode   * <summary>
     *             The transaction ApprovalCode. Expected on transaction
     * types that return an ApprovalCode.
     *             </summary>
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the bankcardData value for this TransactionInformation.
     * 
     * @return bankcardData   * <summary>
     *             Transaction information specific to Bankcard transactions.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BankcardData getBankcardData() {
        return bankcardData;
    }


    /**
     * Sets the bankcardData value for this TransactionInformation.
     * 
     * @param bankcardData   * <summary>
     *             Transaction information specific to Bankcard transactions.
     * Expected.
     *             </summary>
     */
    public void setBankcardData(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BankcardData bankcardData) {
        this.bankcardData = bankcardData;
    }


    /**
     * Gets the batchId value for this TransactionInformation.
     * 
     * @return batchId   * <summary>
     *             The BatchId of the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this TransactionInformation.
     * 
     * @param batchId   * <summary>
     *             The BatchId of the transaction. Expected.
     *             </summary>
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the captureDateTime value for this TransactionInformation.
     * 
     * @return captureDateTime   * <summary>
     *             The date and time the transaction was captured, in UTC.
     * Expected on successfully captured transactions.
     *             </summary>
     */
    public java.util.Calendar getCaptureDateTime() {
        return captureDateTime;
    }


    /**
     * Sets the captureDateTime value for this TransactionInformation.
     * 
     * @param captureDateTime   * <summary>
     *             The date and time the transaction was captured, in UTC.
     * Expected on successfully captured transactions.
     *             </summary>
     */
    public void setCaptureDateTime(java.util.Calendar captureDateTime) {
        this.captureDateTime = captureDateTime;
    }


    /**
     * Gets the captureState value for this TransactionInformation.
     * 
     * @return captureState   * <summary>
     *             The capture state of the transaction. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState getCaptureState() {
        return captureState;
    }


    /**
     * Sets the captureState value for this TransactionInformation.
     * 
     * @param captureState   * <summary>
     *             The capture state of the transaction. Expected.
     *             </summary>
     */
    public void setCaptureState(com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState) {
        this.captureState = captureState;
    }


    /**
     * Gets the captureStatusMessage value for this TransactionInformation.
     * 
     * @return captureStatusMessage   * <summary>
     *             The capture status message returned from the service provider.
     * Expected if the service provider suppports partial approved batches.
     * Expected.
     *             </summary>
     */
    public java.lang.String getCaptureStatusMessage() {
        return captureStatusMessage;
    }


    /**
     * Sets the captureStatusMessage value for this TransactionInformation.
     * 
     * @param captureStatusMessage   * <summary>
     *             The capture status message returned from the service provider.
     * Expected if the service provider suppports partial approved batches.
     * Expected.
     *             </summary>
     */
    public void setCaptureStatusMessage(java.lang.String captureStatusMessage) {
        this.captureStatusMessage = captureStatusMessage;
    }


    /**
     * Gets the capturedAmount value for this TransactionInformation.
     * 
     * @return capturedAmount   * <summary>
     *             The captured amount of the transaction. Expected.
     *             </summary>
     */
    public java.math.BigDecimal getCapturedAmount() {
        return capturedAmount;
    }


    /**
     * Sets the capturedAmount value for this TransactionInformation.
     * 
     * @param capturedAmount   * <summary>
     *             The captured amount of the transaction. Expected.
     *             </summary>
     */
    public void setCapturedAmount(java.math.BigDecimal capturedAmount) {
        this.capturedAmount = capturedAmount;
    }


    /**
     * Gets the customerId value for this TransactionInformation.
     * 
     * @return customerId   * <summary>
     *             The CustomerId specified by the merchant on the transaction
     * request. Expected when CustomerId was specified.
     *             </summary>
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this TransactionInformation.
     * 
     * @param customerId   * <summary>
     *             The CustomerId specified by the merchant on the transaction
     * request. Expected when CustomerId was specified.
     *             </summary>
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the electronicCheckData value for this TransactionInformation.
     * 
     * @return electronicCheckData   * <summary>
     *             Transaction information specific to Electronic Checking
     * transactions. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckData getElectronicCheckData() {
        return electronicCheckData;
    }


    /**
     * Sets the electronicCheckData value for this TransactionInformation.
     * 
     * @param electronicCheckData   * <summary>
     *             Transaction information specific to Electronic Checking
     * transactions. Expected.
     *             </summary>
     */
    public void setElectronicCheckData(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckData electronicCheckData) {
        this.electronicCheckData = electronicCheckData;
    }


    /**
     * Gets the isAcknowledged value for this TransactionInformation.
     * 
     * @return isAcknowledged   * <summary>
     *             Whether transaction was acknowledged. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter getIsAcknowledged() {
        return isAcknowledged;
    }


    /**
     * Sets the isAcknowledged value for this TransactionInformation.
     * 
     * @param isAcknowledged   * <summary>
     *             Whether transaction was acknowledged. Expected.
     *             </summary>
     */
    public void setIsAcknowledged(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged) {
        this.isAcknowledged = isAcknowledged;
    }


    /**
     * Gets the maskedPAN value for this TransactionInformation.
     * 
     * @return maskedPAN   * <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary>
     */
    public java.lang.String getMaskedPAN() {
        return maskedPAN;
    }


    /**
     * Sets the maskedPAN value for this TransactionInformation.
     * 
     * @param maskedPAN   * <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary>
     */
    public void setMaskedPAN(java.lang.String maskedPAN) {
        this.maskedPAN = maskedPAN;
    }


    /**
     * Gets the merchantProfileId value for this TransactionInformation.
     * 
     * @return merchantProfileId   * <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary>
     */
    public java.lang.String getMerchantProfileId() {
        return merchantProfileId;
    }


    /**
     * Sets the merchantProfileId value for this TransactionInformation.
     * 
     * @param merchantProfileId   * <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary>
     */
    public void setMerchantProfileId(java.lang.String merchantProfileId) {
        this.merchantProfileId = merchantProfileId;
    }


    /**
     * Gets the originatorTransactionId value for this TransactionInformation.
     * 
     * @return originatorTransactionId   * <summary>
     *             The OriginatorTransactionId of the transaction. Expected.
     * </summary>
     */
    public java.lang.String getOriginatorTransactionId() {
        return originatorTransactionId;
    }


    /**
     * Sets the originatorTransactionId value for this TransactionInformation.
     * 
     * @param originatorTransactionId   * <summary>
     *             The OriginatorTransactionId of the transaction. Expected.
     * </summary>
     */
    public void setOriginatorTransactionId(java.lang.String originatorTransactionId) {
        this.originatorTransactionId = originatorTransactionId;
    }


    /**
     * Gets the reference value for this TransactionInformation.
     * 
     * @return reference   * <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary>
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this TransactionInformation.
     * 
     * @param reference   * <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary>
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the serviceId value for this TransactionInformation.
     * 
     * @return serviceId   * <summary>
     *             The ID of the service used for the transaction. Expected.
     * </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this TransactionInformation.
     * 
     * @param serviceId   * <summary>
     *             The ID of the service used for the transaction. Expected.
     * </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKey value for this TransactionInformation.
     * 
     * @return serviceKey   * <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this TransactionInformation.
     * 
     * @param serviceKey   * <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary>
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }


    /**
     * Gets the serviceTransactionId value for this TransactionInformation.
     * 
     * @return serviceTransactionId   * <summary>
     *             The ServiceTransactionId of the transaction. Expected.
     * </summary>
     */
    public java.lang.String getServiceTransactionId() {
        return serviceTransactionId;
    }


    /**
     * Sets the serviceTransactionId value for this TransactionInformation.
     * 
     * @param serviceTransactionId   * <summary>
     *             The ServiceTransactionId of the transaction. Expected.
     * </summary>
     */
    public void setServiceTransactionId(java.lang.String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }


    /**
     * Gets the status value for this TransactionInformation.
     * 
     * @return status   * <summary>
     *             Approval or decline status of the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionInformation.
     * 
     * @param status   * <summary>
     *             Approval or decline status of the transaction. Expected.
     * </summary>
     */
    public void setStatus(com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status) {
        this.status = status;
    }


    /**
     * Gets the storedValueData value for this TransactionInformation.
     * 
     * @return storedValueData   * <summary>
     *             Transaction information specific to Stored Value transactions.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.StoredValueData getStoredValueData() {
        return storedValueData;
    }


    /**
     * Sets the storedValueData value for this TransactionInformation.
     * 
     * @param storedValueData   * <summary>
     *             Transaction information specific to Stored Value transactions.
     * Expected.
     *             </summary>
     */
    public void setStoredValueData(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.StoredValueData storedValueData) {
        this.storedValueData = storedValueData;
    }


    /**
     * Gets the transactionClassTypePair value for this TransactionInformation.
     * 
     * @return transactionClassTypePair   * <summary>
     *             The Transaction Class and Type of the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair getTransactionClassTypePair() {
        return transactionClassTypePair;
    }


    /**
     * Sets the transactionClassTypePair value for this TransactionInformation.
     * 
     * @param transactionClassTypePair   * <summary>
     *             The Transaction Class and Type of the transaction. Expected.
     * </summary>
     */
    public void setTransactionClassTypePair(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair) {
        this.transactionClassTypePair = transactionClassTypePair;
    }


    /**
     * Gets the transactionId value for this TransactionInformation.
     * 
     * @return transactionId   * <summary>
     *             The TransactionID of the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransactionInformation.
     * 
     * @param transactionId   * <summary>
     *             The TransactionID of the transaction. Expected.
     *             </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionState value for this TransactionInformation.
     * 
     * @return transactionState   * <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getTransactionState() {
        return transactionState;
    }


    /**
     * Sets the transactionState value for this TransactionInformation.
     * 
     * @param transactionState   * <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary>
     */
    public void setTransactionState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        this.transactionState = transactionState;
    }


    /**
     * Gets the transactionStatusCode value for this TransactionInformation.
     * 
     * @return transactionStatusCode   * <summary>
     *             The StatusCode returned from the transaction. Expected.
     * </summary>
     */
    public java.lang.String getTransactionStatusCode() {
        return transactionStatusCode;
    }


    /**
     * Sets the transactionStatusCode value for this TransactionInformation.
     * 
     * @param transactionStatusCode   * <summary>
     *             The StatusCode returned from the transaction. Expected.
     * </summary>
     */
    public void setTransactionStatusCode(java.lang.String transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }


    /**
     * Gets the transactionTimestamp value for this TransactionInformation.
     * 
     * @return transactionTimestamp   * <summary>
     *             The timestamp of the transaction, in UTC. Expected.
     *             </summary>
     */
    public java.util.Calendar getTransactionTimestamp() {
        return transactionTimestamp;
    }


    /**
     * Sets the transactionTimestamp value for this TransactionInformation.
     * 
     * @param transactionTimestamp   * <summary>
     *             The timestamp of the transaction, in UTC. Expected.
     *             </summary>
     */
    public void setTransactionTimestamp(java.util.Calendar transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionInformation)) return false;
        TransactionInformation other = (TransactionInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.bankcardData==null && other.getBankcardData()==null) || 
             (this.bankcardData!=null &&
              this.bankcardData.equals(other.getBankcardData()))) &&
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.captureDateTime==null && other.getCaptureDateTime()==null) || 
             (this.captureDateTime!=null &&
              this.captureDateTime.equals(other.getCaptureDateTime()))) &&
            ((this.captureState==null && other.getCaptureState()==null) || 
             (this.captureState!=null &&
              this.captureState.equals(other.getCaptureState()))) &&
            ((this.captureStatusMessage==null && other.getCaptureStatusMessage()==null) || 
             (this.captureStatusMessage!=null &&
              this.captureStatusMessage.equals(other.getCaptureStatusMessage()))) &&
            ((this.capturedAmount==null && other.getCapturedAmount()==null) || 
             (this.capturedAmount!=null &&
              this.capturedAmount.equals(other.getCapturedAmount()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.electronicCheckData==null && other.getElectronicCheckData()==null) || 
             (this.electronicCheckData!=null &&
              this.electronicCheckData.equals(other.getElectronicCheckData()))) &&
            ((this.isAcknowledged==null && other.getIsAcknowledged()==null) || 
             (this.isAcknowledged!=null &&
              this.isAcknowledged.equals(other.getIsAcknowledged()))) &&
            ((this.maskedPAN==null && other.getMaskedPAN()==null) || 
             (this.maskedPAN!=null &&
              this.maskedPAN.equals(other.getMaskedPAN()))) &&
            ((this.merchantProfileId==null && other.getMerchantProfileId()==null) || 
             (this.merchantProfileId!=null &&
              this.merchantProfileId.equals(other.getMerchantProfileId()))) &&
            ((this.originatorTransactionId==null && other.getOriginatorTransactionId()==null) || 
             (this.originatorTransactionId!=null &&
              this.originatorTransactionId.equals(other.getOriginatorTransactionId()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey()))) &&
            ((this.serviceTransactionId==null && other.getServiceTransactionId()==null) || 
             (this.serviceTransactionId!=null &&
              this.serviceTransactionId.equals(other.getServiceTransactionId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.storedValueData==null && other.getStoredValueData()==null) || 
             (this.storedValueData!=null &&
              this.storedValueData.equals(other.getStoredValueData()))) &&
            ((this.transactionClassTypePair==null && other.getTransactionClassTypePair()==null) || 
             (this.transactionClassTypePair!=null &&
              this.transactionClassTypePair.equals(other.getTransactionClassTypePair()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionState==null && other.getTransactionState()==null) || 
             (this.transactionState!=null &&
              this.transactionState.equals(other.getTransactionState()))) &&
            ((this.transactionStatusCode==null && other.getTransactionStatusCode()==null) || 
             (this.transactionStatusCode!=null &&
              this.transactionStatusCode.equals(other.getTransactionStatusCode()))) &&
            ((this.transactionTimestamp==null && other.getTransactionTimestamp()==null) || 
             (this.transactionTimestamp!=null &&
              this.transactionTimestamp.equals(other.getTransactionTimestamp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getBankcardData() != null) {
            _hashCode += getBankcardData().hashCode();
        }
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getCaptureDateTime() != null) {
            _hashCode += getCaptureDateTime().hashCode();
        }
        if (getCaptureState() != null) {
            _hashCode += getCaptureState().hashCode();
        }
        if (getCaptureStatusMessage() != null) {
            _hashCode += getCaptureStatusMessage().hashCode();
        }
        if (getCapturedAmount() != null) {
            _hashCode += getCapturedAmount().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getElectronicCheckData() != null) {
            _hashCode += getElectronicCheckData().hashCode();
        }
        if (getIsAcknowledged() != null) {
            _hashCode += getIsAcknowledged().hashCode();
        }
        if (getMaskedPAN() != null) {
            _hashCode += getMaskedPAN().hashCode();
        }
        if (getMerchantProfileId() != null) {
            _hashCode += getMerchantProfileId().hashCode();
        }
        if (getOriginatorTransactionId() != null) {
            _hashCode += getOriginatorTransactionId().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        if (getServiceTransactionId() != null) {
            _hashCode += getServiceTransactionId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStoredValueData() != null) {
            _hashCode += getStoredValueData().hashCode();
        }
        if (getTransactionClassTypePair() != null) {
            _hashCode += getTransactionClassTypePair().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionState() != null) {
            _hashCode += getTransactionState().hashCode();
        }
        if (getTransactionStatusCode() != null) {
            _hashCode += getTransactionStatusCode().hashCode();
        }
        if (getTransactionTimestamp() != null) {
            _hashCode += getTransactionTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ApprovalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankcardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BankcardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BankcardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CapturedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicCheckData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAcknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "IsAcknowledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BooleanParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MaskedPAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MerchantProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "OriginatorTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storedValueData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "StoredValueData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "StoredValueData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionClassTypePair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
