/**
 * Manage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class Manage  implements java.io.Serializable {
    /* <summary>
     *             Transaction Identifier corresponding to the transaction
     * to update. Required.
     *             </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum;

    public Manage() {
    }

    public Manage(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
           this.transactionId = transactionId;
           this.addendum = addendum;
    }


    /**
     * Gets the transactionId value for this Manage.
     * 
     * @return transactionId   * <summary>
     *             Transaction Identifier corresponding to the transaction
     * to update. Required.
     *             </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Manage.
     * 
     * @param transactionId   * <summary>
     *             Transaction Identifier corresponding to the transaction
     * to update. Required.
     *             </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the addendum value for this Manage.
     * 
     * @return addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum getAddendum() {
        return addendum;
    }


    /**
     * Sets the addendum value for this Manage.
     * 
     * @param addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public void setAddendum(com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
        this.addendum = addendum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Manage)) return false;
        Manage other = (Manage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.addendum==null && other.getAddendum()==null) || 
             (this.addendum!=null &&
              this.addendum.equals(other.getAddendum())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getAddendum() != null) {
            _hashCode += getAddendum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Manage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Manage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addendum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
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
