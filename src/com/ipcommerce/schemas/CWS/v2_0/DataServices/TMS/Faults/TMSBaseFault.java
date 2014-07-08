/**
 * TMSBaseFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults;

public class TMSBaseFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* <summary>
     *             The error code of the fault.
     *             </summary> */
    private java.lang.Integer errorID;

    /* <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary> */
    private java.lang.String helpURL;

    /* <summary>
     *             The TMS operation name that originated the fault.
     *             </summary> */
    private java.lang.String operation;

    /* <summary>
     *             Lists the specific error message for the associated fault.
     * </summary> */
    private java.lang.String problemType;

    public TMSBaseFault() {
    }

    public TMSBaseFault(
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
     * Gets the errorID value for this TMSBaseFault.
     * 
     * @return errorID   * <summary>
     *             The error code of the fault.
     *             </summary>
     */
    public java.lang.Integer getErrorID() {
        return errorID;
    }


    /**
     * Sets the errorID value for this TMSBaseFault.
     * 
     * @param errorID   * <summary>
     *             The error code of the fault.
     *             </summary>
     */
    public void setErrorID(java.lang.Integer errorID) {
        this.errorID = errorID;
    }


    /**
     * Gets the helpURL value for this TMSBaseFault.
     * 
     * @return helpURL   * <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary>
     */
    public java.lang.String getHelpURL() {
        return helpURL;
    }


    /**
     * Sets the helpURL value for this TMSBaseFault.
     * 
     * @param helpURL   * <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary>
     */
    public void setHelpURL(java.lang.String helpURL) {
        this.helpURL = helpURL;
    }


    /**
     * Gets the operation value for this TMSBaseFault.
     * 
     * @return operation   * <summary>
     *             The TMS operation name that originated the fault.
     *             </summary>
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this TMSBaseFault.
     * 
     * @param operation   * <summary>
     *             The TMS operation name that originated the fault.
     *             </summary>
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the problemType value for this TMSBaseFault.
     * 
     * @return problemType   * <summary>
     *             Lists the specific error message for the associated fault.
     * </summary>
     */
    public java.lang.String getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this TMSBaseFault.
     * 
     * @param problemType   * <summary>
     *             Lists the specific error message for the associated fault.
     * </summary>
     */
    public void setProblemType(java.lang.String problemType) {
        this.problemType = problemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMSBaseFault)) return false;
        TMSBaseFault other = (TMSBaseFault) obj;
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
        new org.apache.axis.description.TypeDesc(TMSBaseFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSBaseFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "ErrorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "HelpURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "ProblemType"));
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
