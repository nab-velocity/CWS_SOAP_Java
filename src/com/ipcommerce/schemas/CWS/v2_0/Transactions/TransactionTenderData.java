/**
 * TransactionTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class TransactionTenderData  implements java.io.Serializable {
    /* <summary>
     *             Token specified by offsite cardholder data storage Service
     * Providers to retrieve stored payment account data. Optional, may be
     * used in place of detailed tender data.
     *             </summary> */
    private java.lang.String paymentAccountDataToken;

    /* <summary>
     *             Data collected from a magnetic stripe and protected by
     * an encrypting card reader. Track 2 data must be provided. Conditional,
     * at least one of CardData, PaymentAccountDataToken or SecurePaymentAccountData
     * must be provided.
     *             </summary> */
    private java.lang.String securePaymentAccountData;

    /* <summary>
     *             Specifies the identifier for the encryption key used for
     * card data encryption, such as the key serial number for DUK/PT encryption.
     * Conditional, required if SecurePaymentAccountData is used.
     *             </summary> */
    private java.lang.String encryptionKeyId;

    /* <summary>
     *             Specifies the status of the card swipe as returned by
     * the card reader. Optional.
     *             </summary> */
    private java.lang.String swipeStatus;

    public TransactionTenderData() {
    }

    public TransactionTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus) {
           this.paymentAccountDataToken = paymentAccountDataToken;
           this.securePaymentAccountData = securePaymentAccountData;
           this.encryptionKeyId = encryptionKeyId;
           this.swipeStatus = swipeStatus;
    }


    /**
     * Gets the paymentAccountDataToken value for this TransactionTenderData.
     * 
     * @return paymentAccountDataToken   * <summary>
     *             Token specified by offsite cardholder data storage Service
     * Providers to retrieve stored payment account data. Optional, may be
     * used in place of detailed tender data.
     *             </summary>
     */
    public java.lang.String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }


    /**
     * Sets the paymentAccountDataToken value for this TransactionTenderData.
     * 
     * @param paymentAccountDataToken   * <summary>
     *             Token specified by offsite cardholder data storage Service
     * Providers to retrieve stored payment account data. Optional, may be
     * used in place of detailed tender data.
     *             </summary>
     */
    public void setPaymentAccountDataToken(java.lang.String paymentAccountDataToken) {
        this.paymentAccountDataToken = paymentAccountDataToken;
    }


    /**
     * Gets the securePaymentAccountData value for this TransactionTenderData.
     * 
     * @return securePaymentAccountData   * <summary>
     *             Data collected from a magnetic stripe and protected by
     * an encrypting card reader. Track 2 data must be provided. Conditional,
     * at least one of CardData, PaymentAccountDataToken or SecurePaymentAccountData
     * must be provided.
     *             </summary>
     */
    public java.lang.String getSecurePaymentAccountData() {
        return securePaymentAccountData;
    }


    /**
     * Sets the securePaymentAccountData value for this TransactionTenderData.
     * 
     * @param securePaymentAccountData   * <summary>
     *             Data collected from a magnetic stripe and protected by
     * an encrypting card reader. Track 2 data must be provided. Conditional,
     * at least one of CardData, PaymentAccountDataToken or SecurePaymentAccountData
     * must be provided.
     *             </summary>
     */
    public void setSecurePaymentAccountData(java.lang.String securePaymentAccountData) {
        this.securePaymentAccountData = securePaymentAccountData;
    }


    /**
     * Gets the encryptionKeyId value for this TransactionTenderData.
     * 
     * @return encryptionKeyId   * <summary>
     *             Specifies the identifier for the encryption key used for
     * card data encryption, such as the key serial number for DUK/PT encryption.
     * Conditional, required if SecurePaymentAccountData is used.
     *             </summary>
     */
    public java.lang.String getEncryptionKeyId() {
        return encryptionKeyId;
    }


    /**
     * Sets the encryptionKeyId value for this TransactionTenderData.
     * 
     * @param encryptionKeyId   * <summary>
     *             Specifies the identifier for the encryption key used for
     * card data encryption, such as the key serial number for DUK/PT encryption.
     * Conditional, required if SecurePaymentAccountData is used.
     *             </summary>
     */
    public void setEncryptionKeyId(java.lang.String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
    }


    /**
     * Gets the swipeStatus value for this TransactionTenderData.
     * 
     * @return swipeStatus   * <summary>
     *             Specifies the status of the card swipe as returned by
     * the card reader. Optional.
     *             </summary>
     */
    public java.lang.String getSwipeStatus() {
        return swipeStatus;
    }


    /**
     * Sets the swipeStatus value for this TransactionTenderData.
     * 
     * @param swipeStatus   * <summary>
     *             Specifies the status of the card swipe as returned by
     * the card reader. Optional.
     *             </summary>
     */
    public void setSwipeStatus(java.lang.String swipeStatus) {
        this.swipeStatus = swipeStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTenderData)) return false;
        TransactionTenderData other = (TransactionTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentAccountDataToken==null && other.getPaymentAccountDataToken()==null) || 
             (this.paymentAccountDataToken!=null &&
              this.paymentAccountDataToken.equals(other.getPaymentAccountDataToken()))) &&
            ((this.securePaymentAccountData==null && other.getSecurePaymentAccountData()==null) || 
             (this.securePaymentAccountData!=null &&
              this.securePaymentAccountData.equals(other.getSecurePaymentAccountData()))) &&
            ((this.encryptionKeyId==null && other.getEncryptionKeyId()==null) || 
             (this.encryptionKeyId!=null &&
              this.encryptionKeyId.equals(other.getEncryptionKeyId()))) &&
            ((this.swipeStatus==null && other.getSwipeStatus()==null) || 
             (this.swipeStatus!=null &&
              this.swipeStatus.equals(other.getSwipeStatus())));
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
        if (getPaymentAccountDataToken() != null) {
            _hashCode += getPaymentAccountDataToken().hashCode();
        }
        if (getSecurePaymentAccountData() != null) {
            _hashCode += getSecurePaymentAccountData().hashCode();
        }
        if (getEncryptionKeyId() != null) {
            _hashCode += getEncryptionKeyId().hashCode();
        }
        if (getSwipeStatus() != null) {
            _hashCode += getSwipeStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAccountDataToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PaymentAccountDataToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securePaymentAccountData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SecurePaymentAccountData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "EncryptionKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swipeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SwipeStatus"));
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
