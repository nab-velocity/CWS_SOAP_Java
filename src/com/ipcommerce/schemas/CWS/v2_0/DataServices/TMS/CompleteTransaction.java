/**
 * CompleteTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             The complete transaction, either in CWS format or serialized
 * XML. Conditional, included if querying transaction detail.
 *             </summary>
 */
public class CompleteTransaction  implements java.io.Serializable {
    /* <summary>
     *             The complete transaction using the CWS object model. Conditional,
     * included if transactionDetailFormat is CWSTransaction.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CWSTransaction CWSTransaction;

    /* <summary>
     *             The complete transaction as serialized XML. Conditional,
     * included if transactionDetailFormat is CWSSerializedTransaction.
     *             </summary> */
    private java.lang.String serializedTransaction;

    public CompleteTransaction() {
    }

    public CompleteTransaction(
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CWSTransaction CWSTransaction,
           java.lang.String serializedTransaction) {
           this.CWSTransaction = CWSTransaction;
           this.serializedTransaction = serializedTransaction;
    }


    /**
     * Gets the CWSTransaction value for this CompleteTransaction.
     * 
     * @return CWSTransaction   * <summary>
     *             The complete transaction using the CWS object model. Conditional,
     * included if transactionDetailFormat is CWSTransaction.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CWSTransaction getCWSTransaction() {
        return CWSTransaction;
    }


    /**
     * Sets the CWSTransaction value for this CompleteTransaction.
     * 
     * @param CWSTransaction   * <summary>
     *             The complete transaction using the CWS object model. Conditional,
     * included if transactionDetailFormat is CWSTransaction.
     *             </summary>
     */
    public void setCWSTransaction(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CWSTransaction CWSTransaction) {
        this.CWSTransaction = CWSTransaction;
    }


    /**
     * Gets the serializedTransaction value for this CompleteTransaction.
     * 
     * @return serializedTransaction   * <summary>
     *             The complete transaction as serialized XML. Conditional,
     * included if transactionDetailFormat is CWSSerializedTransaction.
     *             </summary>
     */
    public java.lang.String getSerializedTransaction() {
        return serializedTransaction;
    }


    /**
     * Sets the serializedTransaction value for this CompleteTransaction.
     * 
     * @param serializedTransaction   * <summary>
     *             The complete transaction as serialized XML. Conditional,
     * included if transactionDetailFormat is CWSSerializedTransaction.
     *             </summary>
     */
    public void setSerializedTransaction(java.lang.String serializedTransaction) {
        this.serializedTransaction = serializedTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompleteTransaction)) return false;
        CompleteTransaction other = (CompleteTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CWSTransaction==null && other.getCWSTransaction()==null) || 
             (this.CWSTransaction!=null &&
              this.CWSTransaction.equals(other.getCWSTransaction()))) &&
            ((this.serializedTransaction==null && other.getSerializedTransaction()==null) || 
             (this.serializedTransaction!=null &&
              this.serializedTransaction.equals(other.getSerializedTransaction())));
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
        if (getCWSTransaction() != null) {
            _hashCode += getCWSTransaction().hashCode();
        }
        if (getSerializedTransaction() != null) {
            _hashCode += getSerializedTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompleteTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CompleteTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CWSTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CWSTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CWSTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serializedTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SerializedTransaction"));
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
