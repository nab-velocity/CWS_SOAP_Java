/**
 * CWSValidationResultFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults;


/**
 * <summary>
 *             Contains a collection of one or more PTLS XML error messages
 * in CWSValidationErrorFault. The application should respond to these
 * validation errors and correct the data being sent in.
 *             </summary>
 */
public class CWSValidationResultFault  extends com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSBaseFault  implements java.io.Serializable {
    /* <summary>
     *             List of specific validation errors from CWSValidationErrorFault.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault[] errors;

    public CWSValidationResultFault() {
    }

    public CWSValidationResultFault(
           java.lang.Integer errorID,
           java.lang.String helpURL,
           java.lang.String operation,
           java.lang.String problemType,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault[] errors) {
        super(
            errorID,
            helpURL,
            operation,
            problemType);
        this.errors = errors;
    }


    /**
     * Gets the errors value for this CWSValidationResultFault.
     * 
     * @return errors   * <summary>
     *             List of specific validation errors from CWSValidationErrorFault.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this CWSValidationResultFault.
     * 
     * @param errors   * <summary>
     *             List of specific validation errors from CWSValidationErrorFault.
     * </summary>
     */
    public void setErrors(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CWSValidationResultFault)) return false;
        CWSValidationResultFault other = (CWSValidationResultFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CWSValidationResultFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault"));
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
