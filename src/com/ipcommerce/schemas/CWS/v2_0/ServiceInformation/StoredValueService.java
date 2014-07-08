/**
 * StoredValueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains a collection of Stored Value-specific services.
 * Conditional, required if the service supports Stored Value transaction
 * processing.
 *             </summary>
 */
public class StoredValueService  implements java.io.Serializable {
    /* <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations;

    /* <summary>
     *             Unique service identifier. Required.
     *             </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             Service name. Required.
     *             </summary> */
    private java.lang.String serviceName;

    /* <summary>
     *             Tenders supported by the service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders;

    /* <summary>
     *             Need summary description...
     *             </summary> */
    private java.lang.Boolean secureMSRAllowed;

    public StoredValueService() {
    }

    public StoredValueService(
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations,
           java.lang.String serviceId,
           java.lang.String serviceName,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders,
           java.lang.Boolean secureMSRAllowed) {
           this.operations = operations;
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.tenders = tenders;
           this.secureMSRAllowed = secureMSRAllowed;
    }


    /**
     * Gets the operations value for this StoredValueService.
     * 
     * @return operations   * <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this StoredValueService.
     * 
     * @param operations   * <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary>
     */
    public void setOperations(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations) {
        this.operations = operations;
    }


    /**
     * Gets the serviceId value for this StoredValueService.
     * 
     * @return serviceId   * <summary>
     *             Unique service identifier. Required.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this StoredValueService.
     * 
     * @param serviceId   * <summary>
     *             Unique service identifier. Required.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this StoredValueService.
     * 
     * @return serviceName   * <summary>
     *             Service name. Required.
     *             </summary>
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this StoredValueService.
     * 
     * @param serviceName   * <summary>
     *             Service name. Required.
     *             </summary>
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the tenders value for this StoredValueService.
     * 
     * @return tenders   * <summary>
     *             Tenders supported by the service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders getTenders() {
        return tenders;
    }


    /**
     * Sets the tenders value for this StoredValueService.
     * 
     * @param tenders   * <summary>
     *             Tenders supported by the service. Required.
     *             </summary>
     */
    public void setTenders(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders) {
        this.tenders = tenders;
    }


    /**
     * Gets the secureMSRAllowed value for this StoredValueService.
     * 
     * @return secureMSRAllowed   * <summary>
     *             Need summary description...
     *             </summary>
     */
    public java.lang.Boolean getSecureMSRAllowed() {
        return secureMSRAllowed;
    }


    /**
     * Sets the secureMSRAllowed value for this StoredValueService.
     * 
     * @param secureMSRAllowed   * <summary>
     *             Need summary description...
     *             </summary>
     */
    public void setSecureMSRAllowed(java.lang.Boolean secureMSRAllowed) {
        this.secureMSRAllowed = secureMSRAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueService)) return false;
        StoredValueService other = (StoredValueService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              this.operations.equals(other.getOperations()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.tenders==null && other.getTenders()==null) || 
             (this.tenders!=null &&
              this.tenders.equals(other.getTenders()))) &&
            ((this.secureMSRAllowed==null && other.getSecureMSRAllowed()==null) || 
             (this.secureMSRAllowed!=null &&
              this.secureMSRAllowed.equals(other.getSecureMSRAllowed())));
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
        if (getOperations() != null) {
            _hashCode += getOperations().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getTenders() != null) {
            _hashCode += getTenders().hashCode();
        }
        if (getSecureMSRAllowed() != null) {
            _hashCode += getSecureMSRAllowed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations"));
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
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureMSRAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SecureMSRAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
