/**
 * TransactionReportingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains additional transaction data to be printed on
 * reports. Conditional, allowed by some Service Providers. If this value
 * is set on the transaction and not allowed by the Service Provider,
 * the data will not be present on the transaction.
 *             </summary>
 */
public class TransactionReportingData  implements java.io.Serializable {
    /* <summary>
     *             Comment about the transaction. Optional.
     *             </summary> */
    private java.lang.String comment;

    /* <summary>
     *             Transaction description. Optional.
     *             </summary> */
    private java.lang.String description;

    /* <summary>
     *             Merchant or customer reference field that is used for
     * tracking or reporting purposes. Optional.
     *             </summary> */
    private java.lang.String reference;

    public TransactionReportingData() {
    }

    public TransactionReportingData(
           java.lang.String comment,
           java.lang.String description,
           java.lang.String reference) {
           this.comment = comment;
           this.description = description;
           this.reference = reference;
    }


    /**
     * Gets the comment value for this TransactionReportingData.
     * 
     * @return comment   * <summary>
     *             Comment about the transaction. Optional.
     *             </summary>
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TransactionReportingData.
     * 
     * @param comment   * <summary>
     *             Comment about the transaction. Optional.
     *             </summary>
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the description value for this TransactionReportingData.
     * 
     * @return description   * <summary>
     *             Transaction description. Optional.
     *             </summary>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionReportingData.
     * 
     * @param description   * <summary>
     *             Transaction description. Optional.
     *             </summary>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the reference value for this TransactionReportingData.
     * 
     * @return reference   * <summary>
     *             Merchant or customer reference field that is used for
     * tracking or reporting purposes. Optional.
     *             </summary>
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this TransactionReportingData.
     * 
     * @param reference   * <summary>
     *             Merchant or customer reference field that is used for
     * tracking or reporting purposes. Optional.
     *             </summary>
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionReportingData)) return false;
        TransactionReportingData other = (TransactionReportingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference())));
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionReportingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionReportingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Reference"));
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
