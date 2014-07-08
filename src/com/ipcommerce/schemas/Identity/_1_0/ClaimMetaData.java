/**
 * ClaimMetaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.Identity._1_0;

public class ClaimMetaData  implements java.io.Serializable {
    private java.lang.String claimDescription;

    private java.lang.String claimGuid;

    private java.lang.String claimNs;

    private java.lang.String claimType;

    private java.lang.String claimValue;

    private java.lang.Boolean confidential;

    public ClaimMetaData() {
    }

    public ClaimMetaData(
           java.lang.String claimDescription,
           java.lang.String claimGuid,
           java.lang.String claimNs,
           java.lang.String claimType,
           java.lang.String claimValue,
           java.lang.Boolean confidential) {
           this.claimDescription = claimDescription;
           this.claimGuid = claimGuid;
           this.claimNs = claimNs;
           this.claimType = claimType;
           this.claimValue = claimValue;
           this.confidential = confidential;
    }


    /**
     * Gets the claimDescription value for this ClaimMetaData.
     * 
     * @return claimDescription
     */
    public java.lang.String getClaimDescription() {
        return claimDescription;
    }


    /**
     * Sets the claimDescription value for this ClaimMetaData.
     * 
     * @param claimDescription
     */
    public void setClaimDescription(java.lang.String claimDescription) {
        this.claimDescription = claimDescription;
    }


    /**
     * Gets the claimGuid value for this ClaimMetaData.
     * 
     * @return claimGuid
     */
    public java.lang.String getClaimGuid() {
        return claimGuid;
    }


    /**
     * Sets the claimGuid value for this ClaimMetaData.
     * 
     * @param claimGuid
     */
    public void setClaimGuid(java.lang.String claimGuid) {
        this.claimGuid = claimGuid;
    }


    /**
     * Gets the claimNs value for this ClaimMetaData.
     * 
     * @return claimNs
     */
    public java.lang.String getClaimNs() {
        return claimNs;
    }


    /**
     * Sets the claimNs value for this ClaimMetaData.
     * 
     * @param claimNs
     */
    public void setClaimNs(java.lang.String claimNs) {
        this.claimNs = claimNs;
    }


    /**
     * Gets the claimType value for this ClaimMetaData.
     * 
     * @return claimType
     */
    public java.lang.String getClaimType() {
        return claimType;
    }


    /**
     * Sets the claimType value for this ClaimMetaData.
     * 
     * @param claimType
     */
    public void setClaimType(java.lang.String claimType) {
        this.claimType = claimType;
    }


    /**
     * Gets the claimValue value for this ClaimMetaData.
     * 
     * @return claimValue
     */
    public java.lang.String getClaimValue() {
        return claimValue;
    }


    /**
     * Sets the claimValue value for this ClaimMetaData.
     * 
     * @param claimValue
     */
    public void setClaimValue(java.lang.String claimValue) {
        this.claimValue = claimValue;
    }


    /**
     * Gets the confidential value for this ClaimMetaData.
     * 
     * @return confidential
     */
    public java.lang.Boolean getConfidential() {
        return confidential;
    }


    /**
     * Sets the confidential value for this ClaimMetaData.
     * 
     * @param confidential
     */
    public void setConfidential(java.lang.Boolean confidential) {
        this.confidential = confidential;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimMetaData)) return false;
        ClaimMetaData other = (ClaimMetaData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimDescription==null && other.getClaimDescription()==null) || 
             (this.claimDescription!=null &&
              this.claimDescription.equals(other.getClaimDescription()))) &&
            ((this.claimGuid==null && other.getClaimGuid()==null) || 
             (this.claimGuid!=null &&
              this.claimGuid.equals(other.getClaimGuid()))) &&
            ((this.claimNs==null && other.getClaimNs()==null) || 
             (this.claimNs!=null &&
              this.claimNs.equals(other.getClaimNs()))) &&
            ((this.claimType==null && other.getClaimType()==null) || 
             (this.claimType!=null &&
              this.claimType.equals(other.getClaimType()))) &&
            ((this.claimValue==null && other.getClaimValue()==null) || 
             (this.claimValue!=null &&
              this.claimValue.equals(other.getClaimValue()))) &&
            ((this.confidential==null && other.getConfidential()==null) || 
             (this.confidential!=null &&
              this.confidential.equals(other.getConfidential())));
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
        if (getClaimDescription() != null) {
            _hashCode += getClaimDescription().hashCode();
        }
        if (getClaimGuid() != null) {
            _hashCode += getClaimGuid().hashCode();
        }
        if (getClaimNs() != null) {
            _hashCode += getClaimNs().hashCode();
        }
        if (getClaimType() != null) {
            _hashCode += getClaimType().hashCode();
        }
        if (getClaimValue() != null) {
            _hashCode += getClaimValue().hashCode();
        }
        if (getConfidential() != null) {
            _hashCode += getConfidential().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimMetaData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "Confidential"));
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
