/**
 * TransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class TransactionData  implements java.io.Serializable {
    /* <summary>
     *             Authorization amount of the transaction. Required.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Transaction currency code as defined by the International
     * Standards Organization (ISO). Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode;

    /* <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary> */
    private java.lang.String transactionDateTime;

    /* <summary>
     *             Specifies the identifier associated with a campaign-enabled
     * Commerce Playlist, such as Multi-Party Payments (MPP). Optional.
     *             </summary> */
    private java.lang.String campaignId;

    /* <summary>
     *             Specifies user or customer reference data that is used
     * for tracking or reporting purposes that may be echoed back in the
     * response. Optional.
     *             </summary> */
    private java.lang.String reference;

    public TransactionData() {
    }

    public TransactionData(
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode,
           java.lang.String transactionDateTime,
           java.lang.String campaignId,
           java.lang.String reference) {
           this.amount = amount;
           this.currencyCode = currencyCode;
           this.transactionDateTime = transactionDateTime;
           this.campaignId = campaignId;
           this.reference = reference;
    }


    /**
     * Gets the amount value for this TransactionData.
     * 
     * @return amount   * <summary>
     *             Authorization amount of the transaction. Required.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionData.
     * 
     * @param amount   * <summary>
     *             Authorization amount of the transaction. Required.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this TransactionData.
     * 
     * @return currencyCode   * <summary>
     *             Transaction currency code as defined by the International
     * Standards Organization (ISO). Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this TransactionData.
     * 
     * @param currencyCode   * <summary>
     *             Transaction currency code as defined by the International
     * Standards Organization (ISO). Required.
     *             </summary>
     */
    public void setCurrencyCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the transactionDateTime value for this TransactionData.
     * 
     * @return transactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary>
     */
    public java.lang.String getTransactionDateTime() {
        return transactionDateTime;
    }


    /**
     * Sets the transactionDateTime value for this TransactionData.
     * 
     * @param transactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary>
     */
    public void setTransactionDateTime(java.lang.String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }


    /**
     * Gets the campaignId value for this TransactionData.
     * 
     * @return campaignId   * <summary>
     *             Specifies the identifier associated with a campaign-enabled
     * Commerce Playlist, such as Multi-Party Payments (MPP). Optional.
     *             </summary>
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this TransactionData.
     * 
     * @param campaignId   * <summary>
     *             Specifies the identifier associated with a campaign-enabled
     * Commerce Playlist, such as Multi-Party Payments (MPP). Optional.
     *             </summary>
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the reference value for this TransactionData.
     * 
     * @return reference   * <summary>
     *             Specifies user or customer reference data that is used
     * for tracking or reporting purposes that may be echoed back in the
     * response. Optional.
     *             </summary>
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this TransactionData.
     * 
     * @param reference   * <summary>
     *             Specifies user or customer reference data that is used
     * for tracking or reporting purposes that may be echoed back in the
     * response. Optional.
     *             </summary>
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionData)) return false;
        TransactionData other = (TransactionData) obj;
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
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.transactionDateTime==null && other.getTransactionDateTime()==null) || 
             (this.transactionDateTime!=null &&
              this.transactionDateTime.equals(other.getTransactionDateTime()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getTransactionDateTime() != null) {
            _hashCode += getTransactionDateTime().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCurrencyCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
