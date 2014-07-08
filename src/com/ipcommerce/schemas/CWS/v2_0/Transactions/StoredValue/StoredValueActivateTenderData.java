/**
 * StoredValueActivateTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Used to activate the card as tender. Required.
 *             </summary>
 */
public class StoredValueActivateTenderData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData  implements java.io.Serializable {
    /* <summary>
     *             Aggregate used to submit account number length and BIN
     * number for virtual card activation. Conditional, for virtual card
     * activation when TxnCode = 'Issue_Account'. At least one of CardData,
     * VirtualCardData, CardDataToken or SecureCardData must be provided.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.VirtualCardData virtualCardData;

    public StoredValueActivateTenderData() {
    }

    public StoredValueActivateTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData cardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData cardSecurityData,
           java.lang.String cardholderId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[] consumerIdentifications,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.VirtualCardData virtualCardData) {
        super(
            paymentAccountDataToken,
            securePaymentAccountData,
            encryptionKeyId,
            swipeStatus,
            cardData,
            cardSecurityData,
            cardholderId,
            consumerIdentifications);
        this.virtualCardData = virtualCardData;
    }


    /**
     * Gets the virtualCardData value for this StoredValueActivateTenderData.
     * 
     * @return virtualCardData   * <summary>
     *             Aggregate used to submit account number length and BIN
     * number for virtual card activation. Conditional, for virtual card
     * activation when TxnCode = 'Issue_Account'. At least one of CardData,
     * VirtualCardData, CardDataToken or SecureCardData must be provided.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.VirtualCardData getVirtualCardData() {
        return virtualCardData;
    }


    /**
     * Sets the virtualCardData value for this StoredValueActivateTenderData.
     * 
     * @param virtualCardData   * <summary>
     *             Aggregate used to submit account number length and BIN
     * number for virtual card activation. Conditional, for virtual card
     * activation when TxnCode = 'Issue_Account'. At least one of CardData,
     * VirtualCardData, CardDataToken or SecureCardData must be provided.
     * </summary>
     */
    public void setVirtualCardData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.VirtualCardData virtualCardData) {
        this.virtualCardData = virtualCardData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueActivateTenderData)) return false;
        StoredValueActivateTenderData other = (StoredValueActivateTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.virtualCardData==null && other.getVirtualCardData()==null) || 
             (this.virtualCardData!=null &&
              this.virtualCardData.equals(other.getVirtualCardData())));
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
        if (getVirtualCardData() != null) {
            _hashCode += getVirtualCardData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueActivateTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueActivateTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualCardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "VirtualCardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "VirtualCardData"));
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
