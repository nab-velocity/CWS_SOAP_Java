/**
 * _return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class _return  implements java.io.Serializable {
    /* <summary>
     *             Transaction ID of the authorization to return. Required.
     * </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum;

    /* <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary> */
    private java.lang.String transactionDateTime;

    public _return() {
    }

    public _return(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.lang.String transactionDateTime) {
           this.transactionId = transactionId;
           this.addendum = addendum;
           this.transactionDateTime = transactionDateTime;
    }


    /**
     * Gets the transactionId value for this _return.
     * 
     * @return transactionId   * <summary>
     *             Transaction ID of the authorization to return. Required.
     * </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this _return.
     * 
     * @param transactionId   * <summary>
     *             Transaction ID of the authorization to return. Required.
     * </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the addendum value for this _return.
     * 
     * @return addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum getAddendum() {
        return addendum;
    }


    /**
     * Sets the addendum value for this _return.
     * 
     * @param addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public void setAddendum(com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
        this.addendum = addendum;
    }


    /**
     * Gets the transactionDateTime value for this _return.
     * 
     * @return transactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary>
     */
    public java.lang.String getTransactionDateTime() {
        return transactionDateTime;
    }


    /**
     * Sets the transactionDateTime value for this _return.
     * 
     * @param transactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the merchant and printed on the customer receipt. This field should
     * contain a timezone offset representing the timezone in which the transaction
     * is taking place. Optional, but highly recommended.
     *             </summary>
     */
    public void setTransactionDateTime(java.lang.String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _return)) return false;
        _return other = (_return) obj;
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
              this.addendum.equals(other.getAddendum()))) &&
            ((this.transactionDateTime==null && other.getTransactionDateTime()==null) || 
             (this.transactionDateTime!=null &&
              this.transactionDateTime.equals(other.getTransactionDateTime())));
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
        if (getTransactionDateTime() != null) {
            _hashCode += getTransactionDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Return"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionDateTime"));
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
