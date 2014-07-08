/**
 * BillPayServiceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Specifies the bill payment service name and address for
 * PINless Debit bill payment. Conditional, required if different from
 * merchant name and address.
 *             </summary>
 */
public class BillPayServiceData  implements java.io.Serializable {
    /* <summary>
     *             Name of the bill payment service. Required.
     *             </summary> */
    private java.lang.String companyName;

    /* <summary>
     *             Address of the bill payment service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo companyAddress;

    public BillPayServiceData() {
    }

    public BillPayServiceData(
           java.lang.String companyName,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo companyAddress) {
           this.companyName = companyName;
           this.companyAddress = companyAddress;
    }


    /**
     * Gets the companyName value for this BillPayServiceData.
     * 
     * @return companyName   * <summary>
     *             Name of the bill payment service. Required.
     *             </summary>
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this BillPayServiceData.
     * 
     * @param companyName   * <summary>
     *             Name of the bill payment service. Required.
     *             </summary>
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyAddress value for this BillPayServiceData.
     * 
     * @return companyAddress   * <summary>
     *             Address of the bill payment service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo getCompanyAddress() {
        return companyAddress;
    }


    /**
     * Sets the companyAddress value for this BillPayServiceData.
     * 
     * @param companyAddress   * <summary>
     *             Address of the bill payment service. Required.
     *             </summary>
     */
    public void setCompanyAddress(com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo companyAddress) {
        this.companyAddress = companyAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPayServiceData)) return false;
        BillPayServiceData other = (BillPayServiceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.companyAddress==null && other.getCompanyAddress()==null) || 
             (this.companyAddress!=null &&
              this.companyAddress.equals(other.getCompanyAddress())));
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCompanyAddress() != null) {
            _hashCode += getCompanyAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPayServiceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillPayServiceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CompanyAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AddressInfo"));
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
