/**
 * ServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information about the supported service(s). Returned
 * to the application by GetServiceInformation. Expected.
 *             </summary>
 */
public class ServiceInformation  implements java.io.Serializable {
    /* <summary>
     *             Represents a collection of Bankcard-specific services.
     * Conditional, required if Credit Card or PIN Debit services are available.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService[] bankcardServices;

    /* <summary>
     *             Represents a collection of Electronic Checking-specific
     * services. Conditional, required if ACH, ECK, or RDC services are available.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService[] electronicCheckingServices;

    /* <summary>
     *             Represents a collection of Stored Value-specific services.
     * Conditional, required if SVA services are available.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService[] storedValueServices;

    /* <summary>
     *             Represents a collection of workflows. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow[] workflows;

    public ServiceInformation() {
    }

    public ServiceInformation(
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService[] bankcardServices,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService[] electronicCheckingServices,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService[] storedValueServices,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow[] workflows) {
           this.bankcardServices = bankcardServices;
           this.electronicCheckingServices = electronicCheckingServices;
           this.storedValueServices = storedValueServices;
           this.workflows = workflows;
    }


    /**
     * Gets the bankcardServices value for this ServiceInformation.
     * 
     * @return bankcardServices   * <summary>
     *             Represents a collection of Bankcard-specific services.
     * Conditional, required if Credit Card or PIN Debit services are available.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService[] getBankcardServices() {
        return bankcardServices;
    }


    /**
     * Sets the bankcardServices value for this ServiceInformation.
     * 
     * @param bankcardServices   * <summary>
     *             Represents a collection of Bankcard-specific services.
     * Conditional, required if Credit Card or PIN Debit services are available.
     * </summary>
     */
    public void setBankcardServices(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService[] bankcardServices) {
        this.bankcardServices = bankcardServices;
    }


    /**
     * Gets the electronicCheckingServices value for this ServiceInformation.
     * 
     * @return electronicCheckingServices   * <summary>
     *             Represents a collection of Electronic Checking-specific
     * services. Conditional, required if ACH, ECK, or RDC services are available.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService[] getElectronicCheckingServices() {
        return electronicCheckingServices;
    }


    /**
     * Sets the electronicCheckingServices value for this ServiceInformation.
     * 
     * @param electronicCheckingServices   * <summary>
     *             Represents a collection of Electronic Checking-specific
     * services. Conditional, required if ACH, ECK, or RDC services are available.
     * </summary>
     */
    public void setElectronicCheckingServices(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService[] electronicCheckingServices) {
        this.electronicCheckingServices = electronicCheckingServices;
    }


    /**
     * Gets the storedValueServices value for this ServiceInformation.
     * 
     * @return storedValueServices   * <summary>
     *             Represents a collection of Stored Value-specific services.
     * Conditional, required if SVA services are available.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService[] getStoredValueServices() {
        return storedValueServices;
    }


    /**
     * Sets the storedValueServices value for this ServiceInformation.
     * 
     * @param storedValueServices   * <summary>
     *             Represents a collection of Stored Value-specific services.
     * Conditional, required if SVA services are available.
     *             </summary>
     */
    public void setStoredValueServices(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService[] storedValueServices) {
        this.storedValueServices = storedValueServices;
    }


    /**
     * Gets the workflows value for this ServiceInformation.
     * 
     * @return workflows   * <summary>
     *             Represents a collection of workflows. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow[] getWorkflows() {
        return workflows;
    }


    /**
     * Sets the workflows value for this ServiceInformation.
     * 
     * @param workflows   * <summary>
     *             Represents a collection of workflows. Expected.
     *             </summary>
     */
    public void setWorkflows(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow[] workflows) {
        this.workflows = workflows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInformation)) return false;
        ServiceInformation other = (ServiceInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankcardServices==null && other.getBankcardServices()==null) || 
             (this.bankcardServices!=null &&
              java.util.Arrays.equals(this.bankcardServices, other.getBankcardServices()))) &&
            ((this.electronicCheckingServices==null && other.getElectronicCheckingServices()==null) || 
             (this.electronicCheckingServices!=null &&
              java.util.Arrays.equals(this.electronicCheckingServices, other.getElectronicCheckingServices()))) &&
            ((this.storedValueServices==null && other.getStoredValueServices()==null) || 
             (this.storedValueServices!=null &&
              java.util.Arrays.equals(this.storedValueServices, other.getStoredValueServices()))) &&
            ((this.workflows==null && other.getWorkflows()==null) || 
             (this.workflows!=null &&
              java.util.Arrays.equals(this.workflows, other.getWorkflows())));
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
        if (getBankcardServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankcardServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankcardServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElectronicCheckingServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElectronicCheckingServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElectronicCheckingServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoredValueServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoredValueServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoredValueServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkflows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflows(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankcardServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicCheckingServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingService"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storedValueServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow"));
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
