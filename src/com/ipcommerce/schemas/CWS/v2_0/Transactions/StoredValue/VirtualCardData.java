/**
 * VirtualCardData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Aggregate used to submit account number length and BIN
 * number for virtual card activation. Conditional, for virtual card
 * activation when TxnCode = 'Issue_Account'. At least one of CardData,
 * VirtualCardData, CardDataToken or SecureCardData must be provided.
 * </summary>
 */
public class VirtualCardData  implements java.io.Serializable {
    /* <summary>
     *             The length of the account number that will be returned
     * by the service provider. Required.
     *             </summary> */
    private java.lang.Integer accountNumberLength;

    /* <summary>
     *             The virtual gift card BIN number assigned by the service
     * provider. Required.
     *             </summary> */
    private java.lang.String BIN;

    public VirtualCardData() {
    }

    public VirtualCardData(
           java.lang.Integer accountNumberLength,
           java.lang.String BIN) {
           this.accountNumberLength = accountNumberLength;
           this.BIN = BIN;
    }


    /**
     * Gets the accountNumberLength value for this VirtualCardData.
     * 
     * @return accountNumberLength   * <summary>
     *             The length of the account number that will be returned
     * by the service provider. Required.
     *             </summary>
     */
    public java.lang.Integer getAccountNumberLength() {
        return accountNumberLength;
    }


    /**
     * Sets the accountNumberLength value for this VirtualCardData.
     * 
     * @param accountNumberLength   * <summary>
     *             The length of the account number that will be returned
     * by the service provider. Required.
     *             </summary>
     */
    public void setAccountNumberLength(java.lang.Integer accountNumberLength) {
        this.accountNumberLength = accountNumberLength;
    }


    /**
     * Gets the BIN value for this VirtualCardData.
     * 
     * @return BIN   * <summary>
     *             The virtual gift card BIN number assigned by the service
     * provider. Required.
     *             </summary>
     */
    public java.lang.String getBIN() {
        return BIN;
    }


    /**
     * Sets the BIN value for this VirtualCardData.
     * 
     * @param BIN   * <summary>
     *             The virtual gift card BIN number assigned by the service
     * provider. Required.
     *             </summary>
     */
    public void setBIN(java.lang.String BIN) {
        this.BIN = BIN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualCardData)) return false;
        VirtualCardData other = (VirtualCardData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumberLength==null && other.getAccountNumberLength()==null) || 
             (this.accountNumberLength!=null &&
              this.accountNumberLength.equals(other.getAccountNumberLength()))) &&
            ((this.BIN==null && other.getBIN()==null) || 
             (this.BIN!=null &&
              this.BIN.equals(other.getBIN())));
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
        if (getAccountNumberLength() != null) {
            _hashCode += getAccountNumberLength().hashCode();
        }
        if (getBIN() != null) {
            _hashCode += getBIN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualCardData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "VirtualCardData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumberLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "AccountNumberLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "BIN"));
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
