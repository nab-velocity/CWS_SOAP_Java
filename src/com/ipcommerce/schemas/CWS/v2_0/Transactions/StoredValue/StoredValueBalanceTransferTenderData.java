/**
 * StoredValueBalanceTransferTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Tender data specific to balance transfers. Required.
 *             </summary>
 */
public class StoredValueBalanceTransferTenderData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData  implements java.io.Serializable {
    /* <summary>
     *             Card data for the source account. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData;

    /* <summary>
     *             Consumer Identification data for the source account. Conditional,
     * required if CardData not supplied.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification consumerIdentification;

    public StoredValueBalanceTransferTenderData() {
    }

    public StoredValueBalanceTransferTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData cardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData cardSecurityData,
           java.lang.String cardholderId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] consumerIdentifications,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification consumerIdentification) {
        super(
            paymentAccountDataToken,
            securePaymentAccountData,
            encryptionKeyId,
            swipeStatus,
            cardData,
            cardSecurityData,
            cardholderId,
            consumerIdentifications);
        this.sourceCardData = sourceCardData;
        this.consumerIdentification = consumerIdentification;
    }


    /**
     * Gets the sourceCardData value for this StoredValueBalanceTransferTenderData.
     * 
     * @return sourceCardData   * <summary>
     *             Card data for the source account. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData getSourceCardData() {
        return sourceCardData;
    }


    /**
     * Sets the sourceCardData value for this StoredValueBalanceTransferTenderData.
     * 
     * @param sourceCardData   * <summary>
     *             Card data for the source account. Optional.
     *             </summary>
     */
    public void setSourceCardData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData) {
        this.sourceCardData = sourceCardData;
    }


    /**
     * Gets the consumerIdentification value for this StoredValueBalanceTransferTenderData.
     * 
     * @return consumerIdentification   * <summary>
     *             Consumer Identification data for the source account. Conditional,
     * required if CardData not supplied.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification getConsumerIdentification() {
        return consumerIdentification;
    }


    /**
     * Sets the consumerIdentification value for this StoredValueBalanceTransferTenderData.
     * 
     * @param consumerIdentification   * <summary>
     *             Consumer Identification data for the source account. Conditional,
     * required if CardData not supplied.
     *             </summary>
     */
    public void setConsumerIdentification(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification consumerIdentification) {
        this.consumerIdentification = consumerIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueBalanceTransferTenderData)) return false;
        StoredValueBalanceTransferTenderData other = (StoredValueBalanceTransferTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceCardData==null && other.getSourceCardData()==null) || 
             (this.sourceCardData!=null &&
              this.sourceCardData.equals(other.getSourceCardData()))) &&
            ((this.consumerIdentification==null && other.getConsumerIdentification()==null) || 
             (this.consumerIdentification!=null &&
              this.consumerIdentification.equals(other.getConsumerIdentification())));
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
        if (getSourceCardData() != null) {
            _hashCode += getSourceCardData().hashCode();
        }
        if (getConsumerIdentification() != null) {
            _hashCode += getConsumerIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueBalanceTransferTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueBalanceTransferTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "SourceCardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification"));
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
