/**
 * ElectronicCheckingMerchantData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information specific to the Electronic Checking
 * service class for the merchant using the application. Conditional,
 * required if one of the data elements is required by the Service Provider.
 * </summary>
 */
public class ElectronicCheckingMerchantData  implements java.io.Serializable {
    /* <summary>
     *             Unique identifier that represents the ACH originator in
     * the service provider system. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String orginatorId;

    /* <summary>
     *             Product Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String productId;

    /* <summary>
     *             Site Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String siteId;

    public ElectronicCheckingMerchantData() {
    }

    public ElectronicCheckingMerchantData(
           java.lang.String orginatorId,
           java.lang.String productId,
           java.lang.String siteId) {
           this.orginatorId = orginatorId;
           this.productId = productId;
           this.siteId = siteId;
    }


    /**
     * Gets the orginatorId value for this ElectronicCheckingMerchantData.
     * 
     * @return orginatorId   * <summary>
     *             Unique identifier that represents the ACH originator in
     * the service provider system. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getOrginatorId() {
        return orginatorId;
    }


    /**
     * Sets the orginatorId value for this ElectronicCheckingMerchantData.
     * 
     * @param orginatorId   * <summary>
     *             Unique identifier that represents the ACH originator in
     * the service provider system. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setOrginatorId(java.lang.String orginatorId) {
        this.orginatorId = orginatorId;
    }


    /**
     * Gets the productId value for this ElectronicCheckingMerchantData.
     * 
     * @return productId   * <summary>
     *             Product Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ElectronicCheckingMerchantData.
     * 
     * @param productId   * <summary>
     *             Product Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the siteId value for this ElectronicCheckingMerchantData.
     * 
     * @return siteId   * <summary>
     *             Site Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this ElectronicCheckingMerchantData.
     * 
     * @param siteId   * <summary>
     *             Site Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingMerchantData)) return false;
        ElectronicCheckingMerchantData other = (ElectronicCheckingMerchantData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orginatorId==null && other.getOrginatorId()==null) || 
             (this.orginatorId!=null &&
              this.orginatorId.equals(other.getOrginatorId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId())));
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
        if (getOrginatorId() != null) {
            _hashCode += getOrginatorId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingMerchantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orginatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "OrginatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SiteId"));
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
