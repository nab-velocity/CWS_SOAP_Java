/**
 * Workflow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information returned to the application with
 * details about the Workflow(s) for which it is configured.
 *             </summary>
 */
public class Workflow  implements java.io.Serializable {
    /* <summary>
     *             The workflow Id.  Expected.
     *             </summary> */
    private java.lang.String workflowId;

    /* <summary>
     *             The workflow name.  Expected.
     *             </summary> */
    private java.lang.String name;

    /* <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow.  Expected.
     *             </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             Represents a collection of workflow services. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService[] workflowServices;

    public Workflow() {
    }

    public Workflow(
           java.lang.String workflowId,
           java.lang.String name,
           java.lang.String serviceId,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService[] workflowServices) {
           this.workflowId = workflowId;
           this.name = name;
           this.serviceId = serviceId;
           this.workflowServices = workflowServices;
    }


    /**
     * Gets the workflowId value for this Workflow.
     * 
     * @return workflowId   * <summary>
     *             The workflow Id.  Expected.
     *             </summary>
     */
    public java.lang.String getWorkflowId() {
        return workflowId;
    }


    /**
     * Sets the workflowId value for this Workflow.
     * 
     * @param workflowId   * <summary>
     *             The workflow Id.  Expected.
     *             </summary>
     */
    public void setWorkflowId(java.lang.String workflowId) {
        this.workflowId = workflowId;
    }


    /**
     * Gets the name value for this Workflow.
     * 
     * @return name   * <summary>
     *             The workflow name.  Expected.
     *             </summary>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Workflow.
     * 
     * @param name   * <summary>
     *             The workflow name.  Expected.
     *             </summary>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the serviceId value for this Workflow.
     * 
     * @return serviceId   * <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow.  Expected.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this Workflow.
     * 
     * @param serviceId   * <summary>
     *             The service Id which corresponds to the Bankcard or Electronic
     * Checking service within the workflow.  Expected.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the workflowServices value for this Workflow.
     * 
     * @return workflowServices   * <summary>
     *             Represents a collection of workflow services. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService[] getWorkflowServices() {
        return workflowServices;
    }


    /**
     * Sets the workflowServices value for this Workflow.
     * 
     * @param workflowServices   * <summary>
     *             Represents a collection of workflow services. Expected.
     * </summary>
     */
    public void setWorkflowServices(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService[] workflowServices) {
        this.workflowServices = workflowServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Workflow)) return false;
        Workflow other = (Workflow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowId==null && other.getWorkflowId()==null) || 
             (this.workflowId!=null &&
              this.workflowId.equals(other.getWorkflowId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.workflowServices==null && other.getWorkflowServices()==null) || 
             (this.workflowServices!=null &&
              java.util.Arrays.equals(this.workflowServices, other.getWorkflowServices())));
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
        if (getWorkflowId() != null) {
            _hashCode += getWorkflowId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getWorkflowServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowServices(), i);
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
        new org.apache.axis.description.TypeDesc(Workflow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService"));
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
