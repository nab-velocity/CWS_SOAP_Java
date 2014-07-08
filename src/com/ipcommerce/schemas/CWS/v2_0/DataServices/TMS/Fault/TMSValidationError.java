/**
 * TMSValidationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault;


/**
 * <summary>
 *             Contains the details of the CWSValidationResultFault.
 *             </summary>
 */
public class TMSValidationError  implements java.io.Serializable {
    /* <summary>
     *             Indicates the type of error.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationErrorEErrorType errorType;

    /* <summary>
     *             Indicates the data rule that failed.
     *             </summary> */
    private java.lang.String ruleKey;

    /* <summary>
     *             Indicates where the data rule failed. This can be null.
     * </summary> */
    private java.lang.String ruleLocationKey;

    /* <summary>
     *             The verbose message that describes the failure. Do not
     * put stack traces here; use the logger.
     *             </summary> */
    private java.lang.String ruleMessage;

    public TMSValidationError() {
    }

    public TMSValidationError(
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationErrorEErrorType errorType,
           java.lang.String ruleKey,
           java.lang.String ruleLocationKey,
           java.lang.String ruleMessage) {
           this.errorType = errorType;
           this.ruleKey = ruleKey;
           this.ruleLocationKey = ruleLocationKey;
           this.ruleMessage = ruleMessage;
    }


    /**
     * Gets the errorType value for this TMSValidationError.
     * 
     * @return errorType   * <summary>
     *             Indicates the type of error.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationErrorEErrorType getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this TMSValidationError.
     * 
     * @param errorType   * <summary>
     *             Indicates the type of error.
     *             </summary>
     */
    public void setErrorType(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationErrorEErrorType errorType) {
        this.errorType = errorType;
    }


    /**
     * Gets the ruleKey value for this TMSValidationError.
     * 
     * @return ruleKey   * <summary>
     *             Indicates the data rule that failed.
     *             </summary>
     */
    public java.lang.String getRuleKey() {
        return ruleKey;
    }


    /**
     * Sets the ruleKey value for this TMSValidationError.
     * 
     * @param ruleKey   * <summary>
     *             Indicates the data rule that failed.
     *             </summary>
     */
    public void setRuleKey(java.lang.String ruleKey) {
        this.ruleKey = ruleKey;
    }


    /**
     * Gets the ruleLocationKey value for this TMSValidationError.
     * 
     * @return ruleLocationKey   * <summary>
     *             Indicates where the data rule failed. This can be null.
     * </summary>
     */
    public java.lang.String getRuleLocationKey() {
        return ruleLocationKey;
    }


    /**
     * Sets the ruleLocationKey value for this TMSValidationError.
     * 
     * @param ruleLocationKey   * <summary>
     *             Indicates where the data rule failed. This can be null.
     * </summary>
     */
    public void setRuleLocationKey(java.lang.String ruleLocationKey) {
        this.ruleLocationKey = ruleLocationKey;
    }


    /**
     * Gets the ruleMessage value for this TMSValidationError.
     * 
     * @return ruleMessage   * <summary>
     *             The verbose message that describes the failure. Do not
     * put stack traces here; use the logger.
     *             </summary>
     */
    public java.lang.String getRuleMessage() {
        return ruleMessage;
    }


    /**
     * Sets the ruleMessage value for this TMSValidationError.
     * 
     * @param ruleMessage   * <summary>
     *             The verbose message that describes the failure. Do not
     * put stack traces here; use the logger.
     *             </summary>
     */
    public void setRuleMessage(java.lang.String ruleMessage) {
        this.ruleMessage = ruleMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMSValidationError)) return false;
        TMSValidationError other = (TMSValidationError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorType==null && other.getErrorType()==null) || 
             (this.errorType!=null &&
              this.errorType.equals(other.getErrorType()))) &&
            ((this.ruleKey==null && other.getRuleKey()==null) || 
             (this.ruleKey!=null &&
              this.ruleKey.equals(other.getRuleKey()))) &&
            ((this.ruleLocationKey==null && other.getRuleLocationKey()==null) || 
             (this.ruleLocationKey!=null &&
              this.ruleLocationKey.equals(other.getRuleLocationKey()))) &&
            ((this.ruleMessage==null && other.getRuleMessage()==null) || 
             (this.ruleMessage!=null &&
              this.ruleMessage.equals(other.getRuleMessage())));
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
        if (getErrorType() != null) {
            _hashCode += getErrorType().hashCode();
        }
        if (getRuleKey() != null) {
            _hashCode += getRuleKey().hashCode();
        }
        if (getRuleLocationKey() != null) {
            _hashCode += getRuleLocationKey().hashCode();
        }
        if (getRuleMessage() != null) {
            _hashCode += getRuleMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TMSValidationError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "ErrorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError.EErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "RuleKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleLocationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "RuleLocationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "RuleMessage"));
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
