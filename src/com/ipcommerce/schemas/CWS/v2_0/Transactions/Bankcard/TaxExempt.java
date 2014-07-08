/**
 * TaxExempt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Tax exemption indicator and number. Optional.
 *             </summary>
 */
public class TaxExempt  implements java.io.Serializable {
    /* <summary>
     *             Indicates tax exempt status for the transaction. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IsTaxExempt isTaxExempt;

    /* <summary>
     *             Indicates the tax exempt number for the transaction. Conditional,
     * required if IsTaxExempt = 'Exempt' or 'NotExemptTaxInfoProvided'.
     *             </summary> */
    private java.lang.String taxExemptNumber;

    public TaxExempt() {
    }

    public TaxExempt(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IsTaxExempt isTaxExempt,
           java.lang.String taxExemptNumber) {
           this.isTaxExempt = isTaxExempt;
           this.taxExemptNumber = taxExemptNumber;
    }


    /**
     * Gets the isTaxExempt value for this TaxExempt.
     * 
     * @return isTaxExempt   * <summary>
     *             Indicates tax exempt status for the transaction. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IsTaxExempt getIsTaxExempt() {
        return isTaxExempt;
    }


    /**
     * Sets the isTaxExempt value for this TaxExempt.
     * 
     * @param isTaxExempt   * <summary>
     *             Indicates tax exempt status for the transaction. Required.
     * </summary>
     */
    public void setIsTaxExempt(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IsTaxExempt isTaxExempt) {
        this.isTaxExempt = isTaxExempt;
    }


    /**
     * Gets the taxExemptNumber value for this TaxExempt.
     * 
     * @return taxExemptNumber   * <summary>
     *             Indicates the tax exempt number for the transaction. Conditional,
     * required if IsTaxExempt = 'Exempt' or 'NotExemptTaxInfoProvided'.
     *             </summary>
     */
    public java.lang.String getTaxExemptNumber() {
        return taxExemptNumber;
    }


    /**
     * Sets the taxExemptNumber value for this TaxExempt.
     * 
     * @param taxExemptNumber   * <summary>
     *             Indicates the tax exempt number for the transaction. Conditional,
     * required if IsTaxExempt = 'Exempt' or 'NotExemptTaxInfoProvided'.
     *             </summary>
     */
    public void setTaxExemptNumber(java.lang.String taxExemptNumber) {
        this.taxExemptNumber = taxExemptNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxExempt)) return false;
        TaxExempt other = (TaxExempt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isTaxExempt==null && other.getIsTaxExempt()==null) || 
             (this.isTaxExempt!=null &&
              this.isTaxExempt.equals(other.getIsTaxExempt()))) &&
            ((this.taxExemptNumber==null && other.getTaxExemptNumber()==null) || 
             (this.taxExemptNumber!=null &&
              this.taxExemptNumber.equals(other.getTaxExemptNumber())));
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
        if (getIsTaxExempt() != null) {
            _hashCode += getIsTaxExempt().hashCode();
        }
        if (getTaxExemptNumber() != null) {
            _hashCode += getTaxExemptNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxExempt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxExempt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IsTaxExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IsTaxExempt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxExemptNumber"));
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
