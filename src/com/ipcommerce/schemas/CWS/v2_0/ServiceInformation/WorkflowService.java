/**
 * WorkflowService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information returned to the application with
 * details about the Workflow service(s) for which it is configured.
 *             </summary>
 */
public class WorkflowService  implements java.io.Serializable {
    /* <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow. Expected.
     *             </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             The Service Name.  Expected.
     *             </summary> */
    private java.lang.String serviceName;

    /* <summary>
     *             The Service Type.  Expected.
     *             </summary> */
    private java.lang.String serviceType;

    /* <summary>
     *             The ordinal position within the workflow.  Expected.
     *             </summary> */
    private java.lang.Integer ordinal;

    public WorkflowService() {
    }

    public WorkflowService(
           java.lang.String serviceId,
           java.lang.String serviceName,
           java.lang.String serviceType,
           java.lang.Integer ordinal) {
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.serviceType = serviceType;
           this.ordinal = ordinal;
    }


    /**
     * Gets the serviceId value for this WorkflowService.
     * 
     * @return serviceId   * <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow. Expected.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this WorkflowService.
     * 
     * @param serviceId   * <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow. Expected.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this WorkflowService.
     * 
     * @return serviceName   * <summary>
     *             The Service Name.  Expected.
     *             </summary>
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this WorkflowService.
     * 
     * @param serviceName   * <summary>
     *             The Service Name.  Expected.
     *             </summary>
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceType value for this WorkflowService.
     * 
     * @return serviceType   * <summary>
     *             The Service Type.  Expected.
     *             </summary>
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this WorkflowService.
     * 
     * @param serviceType   * <summary>
     *             The Service Type.  Expected.
     *             </summary>
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the ordinal value for this WorkflowService.
     * 
     * @return ordinal   * <summary>
     *             The ordinal position within the workflow.  Expected.
     *             </summary>
     */
    public java.lang.Integer getOrdinal() {
        return ordinal;
    }


    /**
     * Sets the ordinal value for this WorkflowService.
     * 
     * @param ordinal   * <summary>
     *             The ordinal position within the workflow.  Expected.
     *             </summary>
     */
    public void setOrdinal(java.lang.Integer ordinal) {
        this.ordinal = ordinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowService)) return false;
        WorkflowService other = (WorkflowService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.ordinal==null && other.getOrdinal()==null) || 
             (this.ordinal!=null &&
              this.ordinal.equals(other.getOrdinal())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getOrdinal() != null) {
            _hashCode += getOrdinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Ordinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
