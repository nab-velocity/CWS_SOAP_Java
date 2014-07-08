/**
 * StoredValueTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Stored Value tender data. Required.
 *             </summary>
 */
public class StoredValueTenderData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData  implements java.io.Serializable {
    /* <summary>
     *             Cardholder data. Conditional, required if IdType is a
     * card (PAN or track data).
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData cardData;

    /* <summary>
     *             Contains security information for the payment card. Conditional,
     * required for PIN Debit transactions.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData cardSecurityData;

    /* <summary>
     *             Actual cardholder identification data in the form of encrypted
     * PIN. Optional.
     *             </summary> */
    private java.lang.String cardholderId;

    /* <summary>
     *             Collection of Consumer Identification data. Conditional,
     * required if CardData is not supplied.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] consumerIdentifications;

    public StoredValueTenderData() {
    }

    public StoredValueTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData cardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData cardSecurityData,
           java.lang.String cardholderId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] consumerIdentifications) {
        super(
            paymentAccountDataToken,
            securePaymentAccountData,
            encryptionKeyId,
            swipeStatus);
        this.cardData = cardData;
        this.cardSecurityData = cardSecurityData;
        this.cardholderId = cardholderId;
        this.consumerIdentifications = consumerIdentifications;
    }


    /**
     * Gets the cardData value for this StoredValueTenderData.
     * 
     * @return cardData   * <summary>
     *             Cardholder data. Conditional, required if IdType is a
     * card (PAN or track data).
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData getCardData() {
        return cardData;
    }


    /**
     * Sets the cardData value for this StoredValueTenderData.
     * 
     * @param cardData   * <summary>
     *             Cardholder data. Conditional, required if IdType is a
     * card (PAN or track data).
     *             </summary>
     */
    public void setCardData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData cardData) {
        this.cardData = cardData;
    }


    /**
     * Gets the cardSecurityData value for this StoredValueTenderData.
     * 
     * @return cardSecurityData   * <summary>
     *             Contains security information for the payment card. Conditional,
     * required for PIN Debit transactions.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData getCardSecurityData() {
        return cardSecurityData;
    }


    /**
     * Sets the cardSecurityData value for this StoredValueTenderData.
     * 
     * @param cardSecurityData   * <summary>
     *             Contains security information for the payment card. Conditional,
     * required for PIN Debit transactions.
     *             </summary>
     */
    public void setCardSecurityData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData cardSecurityData) {
        this.cardSecurityData = cardSecurityData;
    }


    /**
     * Gets the cardholderId value for this StoredValueTenderData.
     * 
     * @return cardholderId   * <summary>
     *             Actual cardholder identification data in the form of encrypted
     * PIN. Optional.
     *             </summary>
     */
    public java.lang.String getCardholderId() {
        return cardholderId;
    }


    /**
     * Sets the cardholderId value for this StoredValueTenderData.
     * 
     * @param cardholderId   * <summary>
     *             Actual cardholder identification data in the form of encrypted
     * PIN. Optional.
     *             </summary>
     */
    public void setCardholderId(java.lang.String cardholderId) {
        this.cardholderId = cardholderId;
    }


    /**
     * Gets the consumerIdentifications value for this StoredValueTenderData.
     * 
     * @return consumerIdentifications   * <summary>
     *             Collection of Consumer Identification data. Conditional,
     * required if CardData is not supplied.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] getConsumerIdentifications() {
        return consumerIdentifications;
    }


    /**
     * Sets the consumerIdentifications value for this StoredValueTenderData.
     * 
     * @param consumerIdentifications   * <summary>
     *             Collection of Consumer Identification data. Conditional,
     * required if CardData is not supplied.
     *             </summary>
     */
    public void setConsumerIdentifications(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] consumerIdentifications) {
        this.consumerIdentifications = consumerIdentifications;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueTenderData)) return false;
        StoredValueTenderData other = (StoredValueTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardData==null && other.getCardData()==null) || 
             (this.cardData!=null &&
              this.cardData.equals(other.getCardData()))) &&
            ((this.cardSecurityData==null && other.getCardSecurityData()==null) || 
             (this.cardSecurityData!=null &&
              this.cardSecurityData.equals(other.getCardSecurityData()))) &&
            ((this.cardholderId==null && other.getCardholderId()==null) || 
             (this.cardholderId!=null &&
              this.cardholderId.equals(other.getCardholderId()))) &&
            ((this.consumerIdentifications==null && other.getConsumerIdentifications()==null) || 
             (this.consumerIdentifications!=null &&
              java.util.Arrays.equals(this.consumerIdentifications, other.getConsumerIdentifications())));
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
        if (getCardData() != null) {
            _hashCode += getCardData().hashCode();
        }
        if (getCardSecurityData() != null) {
            _hashCode += getCardSecurityData().hashCode();
        }
        if (getCardholderId() != null) {
            _hashCode += getCardholderId().hashCode();
        }
        if (getConsumerIdentifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsumerIdentifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsumerIdentifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSecurityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardSecurityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardSecurityData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardholderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardholderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerIdentifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification"));
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
