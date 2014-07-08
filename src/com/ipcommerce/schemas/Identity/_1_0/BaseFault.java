/**
 * BaseFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.Identity._1_0;

public class BaseFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.Integer errorID;

    private java.lang.String helpURL;

    private java.lang.String operation;

    private java.lang.String problemType;

    public BaseFault() {
    }

    public BaseFault(
           java.lang.Integer errorID,
           java.lang.String helpURL,
           java.lang.String operation,
           java.lang.String problemType) {
        this.errorID = errorID;
        this.helpURL = helpURL;
        this.operation = operation;
        this.problemType = problemType;
    }


    /**
     * Gets the errorID value for this BaseFault.
     * 
     * @return errorID
     */
    public java.lang.Integer getErrorID() {
        return errorID;
    }


    /**
     * Sets the errorID value for this BaseFault.
     * 
     * @param errorID
     */
    public void setErrorID(java.lang.Integer errorID) {
        this.errorID = errorID;
    }


    /**
     * Gets the helpURL value for this BaseFault.
     * 
     * @return helpURL
     */
    public java.lang.String getHelpURL() {
        return helpURL;
    }


    /**
     * Sets the helpURL value for this BaseFault.
     * 
     * @param helpURL
     */
    public void setHelpURL(java.lang.String helpURL) {
        this.helpURL = helpURL;
    }


    /**
     * Gets the operation value for this BaseFault.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this BaseFault.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the problemType value for this BaseFault.
     * 
     * @return problemType
     */
    public java.lang.String getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this BaseFault.
     * 
     * @param problemType
     */
    public void setProblemType(java.lang.String problemType) {
        this.problemType = problemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseFault)) return false;
        BaseFault other = (BaseFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorID==null && other.getErrorID()==null) || 
             (this.errorID!=null &&
              this.errorID.equals(other.getErrorID()))) &&
            ((this.helpURL==null && other.getHelpURL()==null) || 
             (this.helpURL!=null &&
              this.helpURL.equals(other.getHelpURL()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType())));
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
        if (getErrorID() != null) {
            _hashCode += getErrorID().hashCode();
        }
        if (getHelpURL() != null) {
            _hashCode += getHelpURL().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BaseFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ErrorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "HelpURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ProblemType"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
