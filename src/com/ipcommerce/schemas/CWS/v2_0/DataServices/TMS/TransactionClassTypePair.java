/**
 * TransactionClassTypePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Defines a contract for an expected pairing of transaction
 * class and transaction type. Optional on request, expected on response.
 * </summary>
 */
public class TransactionClassTypePair  implements java.io.Serializable {
    /* <summary>
     *             The Transaction Class. Expected.
     *             </summary> */
    private java.lang.String transactionClass;

    /* <summary>
     *             The Transaction Type. Expected.
     *             </summary> */
    private java.lang.String transactionType;

    public TransactionClassTypePair() {
    }

    public TransactionClassTypePair(
           java.lang.String transactionClass,
           java.lang.String transactionType) {
           this.transactionClass = transactionClass;
           this.transactionType = transactionType;
    }


    /**
     * Gets the transactionClass value for this TransactionClassTypePair.
     * 
     * @return transactionClass   * <summary>
     *             The Transaction Class. Expected.
     *             </summary>
     */
    public java.lang.String getTransactionClass() {
        return transactionClass;
    }


    /**
     * Sets the transactionClass value for this TransactionClassTypePair.
     * 
     * @param transactionClass   * <summary>
     *             The Transaction Class. Expected.
     *             </summary>
     */
    public void setTransactionClass(java.lang.String transactionClass) {
        this.transactionClass = transactionClass;
    }


    /**
     * Gets the transactionType value for this TransactionClassTypePair.
     * 
     * @return transactionType   * <summary>
     *             The Transaction Type. Expected.
     *             </summary>
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this TransactionClassTypePair.
     * 
     * @param transactionType   * <summary>
     *             The Transaction Type. Expected.
     *             </summary>
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionClassTypePair)) return false;
        TransactionClassTypePair other = (TransactionClassTypePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionClass==null && other.getTransactionClass()==null) || 
             (this.transactionClass!=null &&
              this.transactionClass.equals(other.getTransactionClass()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getTransactionClass() != null) {
            _hashCode += getTransactionClass().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionClassTypePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionType"));
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
