/**
 * BankcardServiceAVSData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information returned to the application specifying
 * the required Address Verification System (AVS) fields. Conditional,
 * may be required by the Service Provider.
 *             </summary>
 */
public class BankcardServiceAVSData  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether Cardholder Name is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean cardholderName;

    /* <summary>
     *             Indicates whether Street Address is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean street;

    /* <summary>
     *             Indicates whether City is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean city;

    /* <summary>
     *             Indicates whether State or Province is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean stateProvince;

    /* <summary>
     *             Indicates whether PostalCode is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean postalCode;

    /* <summary>
     *             Indicates whether Country is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary> */
    private java.lang.Boolean country;

    /* <summary>
     *             Indicates whether Cardholder Phone Number is required
     * for AVS. Conditional, required if BankcardServiceAVSData is not null.
     * </summary> */
    private java.lang.Boolean phone;

    public BankcardServiceAVSData() {
    }

    public BankcardServiceAVSData(
           java.lang.Boolean cardholderName,
           java.lang.Boolean street,
           java.lang.Boolean city,
           java.lang.Boolean stateProvince,
           java.lang.Boolean postalCode,
           java.lang.Boolean country,
           java.lang.Boolean phone) {
           this.cardholderName = cardholderName;
           this.street = street;
           this.city = city;
           this.stateProvince = stateProvince;
           this.postalCode = postalCode;
           this.country = country;
           this.phone = phone;
    }


    /**
     * Gets the cardholderName value for this BankcardServiceAVSData.
     * 
     * @return cardholderName   * <summary>
     *             Indicates whether Cardholder Name is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getCardholderName() {
        return cardholderName;
    }


    /**
     * Sets the cardholderName value for this BankcardServiceAVSData.
     * 
     * @param cardholderName   * <summary>
     *             Indicates whether Cardholder Name is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setCardholderName(java.lang.Boolean cardholderName) {
        this.cardholderName = cardholderName;
    }


    /**
     * Gets the street value for this BankcardServiceAVSData.
     * 
     * @return street   * <summary>
     *             Indicates whether Street Address is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getStreet() {
        return street;
    }


    /**
     * Sets the street value for this BankcardServiceAVSData.
     * 
     * @param street   * <summary>
     *             Indicates whether Street Address is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setStreet(java.lang.Boolean street) {
        this.street = street;
    }


    /**
     * Gets the city value for this BankcardServiceAVSData.
     * 
     * @return city   * <summary>
     *             Indicates whether City is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getCity() {
        return city;
    }


    /**
     * Sets the city value for this BankcardServiceAVSData.
     * 
     * @param city   * <summary>
     *             Indicates whether City is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setCity(java.lang.Boolean city) {
        this.city = city;
    }


    /**
     * Gets the stateProvince value for this BankcardServiceAVSData.
     * 
     * @return stateProvince   * <summary>
     *             Indicates whether State or Province is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this BankcardServiceAVSData.
     * 
     * @param stateProvince   * <summary>
     *             Indicates whether State or Province is required for AVS.
     * Conditional, required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setStateProvince(java.lang.Boolean stateProvince) {
        this.stateProvince = stateProvince;
    }


    /**
     * Gets the postalCode value for this BankcardServiceAVSData.
     * 
     * @return postalCode   * <summary>
     *             Indicates whether PostalCode is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this BankcardServiceAVSData.
     * 
     * @param postalCode   * <summary>
     *             Indicates whether PostalCode is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setPostalCode(java.lang.Boolean postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this BankcardServiceAVSData.
     * 
     * @return country   * <summary>
     *             Indicates whether Country is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public java.lang.Boolean getCountry() {
        return country;
    }


    /**
     * Sets the country value for this BankcardServiceAVSData.
     * 
     * @param country   * <summary>
     *             Indicates whether Country is required for AVS. Conditional,
     * required if BankcardServiceAVSData is not null.
     *             </summary>
     */
    public void setCountry(java.lang.Boolean country) {
        this.country = country;
    }


    /**
     * Gets the phone value for this BankcardServiceAVSData.
     * 
     * @return phone   * <summary>
     *             Indicates whether Cardholder Phone Number is required
     * for AVS. Conditional, required if BankcardServiceAVSData is not null.
     * </summary>
     */
    public java.lang.Boolean getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this BankcardServiceAVSData.
     * 
     * @param phone   * <summary>
     *             Indicates whether Cardholder Phone Number is required
     * for AVS. Conditional, required if BankcardServiceAVSData is not null.
     * </summary>
     */
    public void setPhone(java.lang.Boolean phone) {
        this.phone = phone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardServiceAVSData)) return false;
        BankcardServiceAVSData other = (BankcardServiceAVSData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardholderName==null && other.getCardholderName()==null) || 
             (this.cardholderName!=null &&
              this.cardholderName.equals(other.getCardholderName()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateProvince==null && other.getStateProvince()==null) || 
             (this.stateProvince!=null &&
              this.stateProvince.equals(other.getStateProvince()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone())));
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
        if (getCardholderName() != null) {
            _hashCode += getCardholderName().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateProvince() != null) {
            _hashCode += getStateProvince().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardServiceAVSData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardServiceAVSData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardholderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CardholderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Phone"));
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
