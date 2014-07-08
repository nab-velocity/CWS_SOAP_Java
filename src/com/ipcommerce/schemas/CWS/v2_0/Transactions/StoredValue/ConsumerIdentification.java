/**
 * ConsumerIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Consumer Identification data. Conditional required if
 * CardData is not supplied.
 *             </summary>
 */
public class ConsumerIdentification  implements java.io.Serializable {
    /* <summary>
     *             Indicates the type of consumer identifier provided. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdType idType;

    /* <summary>
     *             Contains the actual consumer identifier data. Required.
     * </summary> */
    private java.lang.String idData;

    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdEntryMode idEntryMode;

    public ConsumerIdentification() {
    }

    public ConsumerIdentification(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdType idType,
           java.lang.String idData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdEntryMode idEntryMode) {
           this.idType = idType;
           this.idData = idData;
           this.idEntryMode = idEntryMode;
    }


    /**
     * Gets the idType value for this ConsumerIdentification.
     * 
     * @return idType   * <summary>
     *             Indicates the type of consumer identifier provided. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ConsumerIdentification.
     * 
     * @param idType   * <summary>
     *             Indicates the type of consumer identifier provided. Required.
     * </summary>
     */
    public void setIdType(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdType idType) {
        this.idType = idType;
    }


    /**
     * Gets the idData value for this ConsumerIdentification.
     * 
     * @return idData   * <summary>
     *             Contains the actual consumer identifier data. Required.
     * </summary>
     */
    public java.lang.String getIdData() {
        return idData;
    }


    /**
     * Sets the idData value for this ConsumerIdentification.
     * 
     * @param idData   * <summary>
     *             Contains the actual consumer identifier data. Required.
     * </summary>
     */
    public void setIdData(java.lang.String idData) {
        this.idData = idData;
    }


    /**
     * Gets the idEntryMode value for this ConsumerIdentification.
     * 
     * @return idEntryMode
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdEntryMode getIdEntryMode() {
        return idEntryMode;
    }


    /**
     * Sets the idEntryMode value for this ConsumerIdentification.
     * 
     * @param idEntryMode
     */
    public void setIdEntryMode(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdEntryMode idEntryMode) {
        this.idEntryMode = idEntryMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsumerIdentification)) return false;
        ConsumerIdentification other = (ConsumerIdentification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.idData==null && other.getIdData()==null) || 
             (this.idData!=null &&
              this.idData.equals(other.getIdData()))) &&
            ((this.idEntryMode==null && other.getIdEntryMode()==null) || 
             (this.idEntryMode!=null &&
              this.idEntryMode.equals(other.getIdEntryMode())));
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
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIdData() != null) {
            _hashCode += getIdData().hashCode();
        }
        if (getIdEntryMode() != null) {
            _hashCode += getIdEntryMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsumerIdentification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEntryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdEntryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdEntryMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
