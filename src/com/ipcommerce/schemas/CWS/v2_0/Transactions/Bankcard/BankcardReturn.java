/**
 * BankcardReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information for returning Bankcard transactions
 * (Credit and PIN Debit). Required.
 *             </summary>
 */
public class BankcardReturn  extends com.ipcommerce.schemas.CWS.v2_0.Transactions._return  implements java.io.Serializable {
    /* <summary>
     *             Specifies the amount to return. Conditional, required
     * when performing a partial return.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Details about the card tender. Conditional, required by
     * ReturnById for PIN Debit transactions.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData;

    /* <summary>
     *             Specifies a fee amount associated with the authorization,
     * such as convenience fees. Optional.
     *             </summary> */
    private java.math.BigDecimal feeAmount;

    /* <summary>
     *             Indicates the transaction code. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode;

    public BankcardReturn() {
    }

    public BankcardReturn(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.lang.String transactionDateTime,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData,
           java.math.BigDecimal feeAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode) {
        super(
            transactionId,
            addendum,
            transactionDateTime);
        this.amount = amount;
        this.tenderData = tenderData;
        this.feeAmount = feeAmount;
        this.transactionCode = transactionCode;
    }


    /**
     * Gets the amount value for this BankcardReturn.
     * 
     * @return amount   * <summary>
     *             Specifies the amount to return. Conditional, required
     * when performing a partial return.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BankcardReturn.
     * 
     * @param amount   * <summary>
     *             Specifies the amount to return. Conditional, required
     * when performing a partial return.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the tenderData value for this BankcardReturn.
     * 
     * @return tenderData   * <summary>
     *             Details about the card tender. Conditional, required by
     * ReturnById for PIN Debit transactions.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData getTenderData() {
        return tenderData;
    }


    /**
     * Sets the tenderData value for this BankcardReturn.
     * 
     * @param tenderData   * <summary>
     *             Details about the card tender. Conditional, required by
     * ReturnById for PIN Debit transactions.
     *             </summary>
     */
    public void setTenderData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData) {
        this.tenderData = tenderData;
    }


    /**
     * Gets the feeAmount value for this BankcardReturn.
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
     * Sets the feeAmount value for this BankcardReturn.
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
     * Gets the transactionCode value for this BankcardReturn.
     * 
     * @return transactionCode   * <summary>
     *             Indicates the transaction code. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode getTransactionCode() {
        return transactionCode;
    }


    /**
     * Sets the transactionCode value for this BankcardReturn.
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
        if (!(obj instanceof BankcardReturn)) return false;
        BankcardReturn other = (BankcardReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.tenderData==null && other.getTenderData()==null) || 
             (this.tenderData!=null &&
              this.tenderData.equals(other.getTenderData()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTenderData() != null) {
            _hashCode += getTenderData().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getTransactionCode() != null) {
            _hashCode += getTransactionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TenderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTenderData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
