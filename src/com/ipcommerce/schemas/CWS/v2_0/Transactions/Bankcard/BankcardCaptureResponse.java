/**
 * BankcardCaptureResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class BankcardCaptureResponse  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Response  implements java.io.Serializable {
    /* <summary>
     *             Batch Identifier. Optional.
     *             </summary> */
    private java.lang.String batchId;

    /* <summary>
     *             The industry type of the transaction(s). Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType;

    /* <summary>
     *             Summary of transaction data. Conditional, expected for
     * CaptureAll and CaptureSelective.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData transactionSummaryData;

    /* <summary>
     *             Specifies whether or not the card is a prepaid card. The
     * identification of prepaid cards is at the discretion of the payment
     * brand or issuer. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard prepaidCard;

    public BankcardCaptureResponse() {
    }

    public BankcardCaptureResponse(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status,
           java.lang.String statusCode,
           java.lang.String statusMessage,
           java.lang.String transactionId,
           java.lang.String originatorTransactionId,
           java.lang.String serviceTransactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.Boolean isAcknowledged,
           java.lang.String reference,
           java.lang.String batchId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData transactionSummaryData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard prepaidCard) {
        super(
            status,
            statusCode,
            statusMessage,
            transactionId,
            originatorTransactionId,
            serviceTransactionId,
            serviceTransactionDateTime,
            addendum,
            captureState,
            transactionState,
            isAcknowledged,
            reference);
        this.batchId = batchId;
        this.industryType = industryType;
        this.transactionSummaryData = transactionSummaryData;
        this.prepaidCard = prepaidCard;
    }


    /**
     * Gets the batchId value for this BankcardCaptureResponse.
     * 
     * @return batchId   * <summary>
     *             Batch Identifier. Optional.
     *             </summary>
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this BankcardCaptureResponse.
     * 
     * @param batchId   * <summary>
     *             Batch Identifier. Optional.
     *             </summary>
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the industryType value for this BankcardCaptureResponse.
     * 
     * @return industryType   * <summary>
     *             The industry type of the transaction(s). Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this BankcardCaptureResponse.
     * 
     * @param industryType   * <summary>
     *             The industry type of the transaction(s). Expected.
     *             </summary>
     */
    public void setIndustryType(com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the transactionSummaryData value for this BankcardCaptureResponse.
     * 
     * @return transactionSummaryData   * <summary>
     *             Summary of transaction data. Conditional, expected for
     * CaptureAll and CaptureSelective.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData getTransactionSummaryData() {
        return transactionSummaryData;
    }


    /**
     * Sets the transactionSummaryData value for this BankcardCaptureResponse.
     * 
     * @param transactionSummaryData   * <summary>
     *             Summary of transaction data. Conditional, expected for
     * CaptureAll and CaptureSelective.
     *             </summary>
     */
    public void setTransactionSummaryData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData transactionSummaryData) {
        this.transactionSummaryData = transactionSummaryData;
    }


    /**
     * Gets the prepaidCard value for this BankcardCaptureResponse.
     * 
     * @return prepaidCard   * <summary>
     *             Specifies whether or not the card is a prepaid card. The
     * identification of prepaid cards is at the discretion of the payment
     * brand or issuer. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard getPrepaidCard() {
        return prepaidCard;
    }


    /**
     * Sets the prepaidCard value for this BankcardCaptureResponse.
     * 
     * @param prepaidCard   * <summary>
     *             Specifies whether or not the card is a prepaid card. The
     * identification of prepaid cards is at the discretion of the payment
     * brand or issuer. Optional.
     *             </summary>
     */
    public void setPrepaidCard(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard prepaidCard) {
        this.prepaidCard = prepaidCard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardCaptureResponse)) return false;
        BankcardCaptureResponse other = (BankcardCaptureResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.transactionSummaryData==null && other.getTransactionSummaryData()==null) || 
             (this.transactionSummaryData!=null &&
              this.transactionSummaryData.equals(other.getTransactionSummaryData()))) &&
            ((this.prepaidCard==null && other.getPrepaidCard()==null) || 
             (this.prepaidCard!=null &&
              this.prepaidCard.equals(other.getPrepaidCard())));
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
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getTransactionSummaryData() != null) {
            _hashCode += getTransactionSummaryData().hashCode();
        }
        if (getPrepaidCard() != null) {
            _hashCode += getPrepaidCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardCaptureResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardCaptureResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IndustryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "IndustryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSummaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionSummaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionSummaryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PrepaidCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PrepaidCard"));
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
