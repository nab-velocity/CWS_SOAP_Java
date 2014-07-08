/**
 * ElectronicCheckingCustomerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ElectronicCheckingCustomerData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData  implements java.io.Serializable {
    /* <summary>
     *             Additional billing information which may be required by
     * the Service Provider to process the Electronic Checking transaction.
     * Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.PersonalInfo additionalBillingData;

    public ElectronicCheckingCustomerData() {
    }

    public ElectronicCheckingCustomerData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo billingData,
           java.lang.String customerId,
           java.lang.String customerTaxId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.PersonalInfo additionalBillingData) {
        super(
            billingData,
            customerId,
            customerTaxId,
            shippingData);
        this.additionalBillingData = additionalBillingData;
    }


    /**
     * Gets the additionalBillingData value for this ElectronicCheckingCustomerData.
     * 
     * @return additionalBillingData   * <summary>
     *             Additional billing information which may be required by
     * the Service Provider to process the Electronic Checking transaction.
     * Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.PersonalInfo getAdditionalBillingData() {
        return additionalBillingData;
    }


    /**
     * Sets the additionalBillingData value for this ElectronicCheckingCustomerData.
     * 
     * @param additionalBillingData   * <summary>
     *             Additional billing information which may be required by
     * the Service Provider to process the Electronic Checking transaction.
     * Optional.
     *             </summary>
     */
    public void setAdditionalBillingData(com.ipcommerce.schemas.CWS.v2_0.Transactions.PersonalInfo additionalBillingData) {
        this.additionalBillingData = additionalBillingData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingCustomerData)) return false;
        ElectronicCheckingCustomerData other = (ElectronicCheckingCustomerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalBillingData==null && other.getAdditionalBillingData()==null) || 
             (this.additionalBillingData!=null &&
              this.additionalBillingData.equals(other.getAdditionalBillingData())));
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
        if (getAdditionalBillingData() != null) {
            _hashCode += getAdditionalBillingData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingCustomerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCustomerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalBillingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "AdditionalBillingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PersonalInfo"));
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
