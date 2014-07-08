/**
 * AVSData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Cardholder address data for Address Verification System
 * (AVS). Optional.
 *             </summary>
 */
public class AVSData  implements java.io.Serializable {
    /* <summary>
     *             Cardholder name embossed on the front of the card. Conditional,
     * required if specified in AVSData.CardholderName (ServiceInformation).
     * </summary> */
    private java.lang.String cardholderName;

    /* <summary>
     *             Street Address. Conditional, required if specified in
     * AVSData.Street (ServiceInformation).
     *             </summary> */
    private java.lang.String street;

    /* <summary>
     *             City. Conditional, required if specified in AVSData.City
     * (ServiceInformation).
     *             </summary> */
    private java.lang.String city;

    /* <summary>
     *             State or Province. Conditional, required if specified
     * in AVSData.StateProvince (ServiceInformation).
     *             </summary> */
    private java.lang.String stateProvince;

    /* <summary>
     *             Postal Code. Conditional, required if specified in AVSData.PostalCode
     * (ServiceInformation).
     *             </summary> */
    private java.lang.String postalCode;

    /* <summary>
     *             Country. Conditional, required if specified in AVSData.Country
     * (ServiceInformation).
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 country;

    /* <summary>
     *             Cardholder phone number. Conditional, required if specified
     * in AVSData.Phone (ServiceInformation).
     *             </summary> */
    private java.lang.String phone;

    /* <summary>
     *             Cardholder email address. Conditional, reference AVS/Email
     * service configuration for level of service provider support.
     *             </summary> */
    private java.lang.String email;

    public AVSData() {
    }

    public AVSData(
           java.lang.String cardholderName,
           java.lang.String street,
           java.lang.String city,
           java.lang.String stateProvince,
           java.lang.String postalCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 country,
           java.lang.String phone,
           java.lang.String email) {
           this.cardholderName = cardholderName;
           this.street = street;
           this.city = city;
           this.stateProvince = stateProvince;
           this.postalCode = postalCode;
           this.country = country;
           this.phone = phone;
           this.email = email;
    }


    /**
     * Gets the cardholderName value for this AVSData.
     * 
     * @return cardholderName   * <summary>
     *             Cardholder name embossed on the front of the card. Conditional,
     * required if specified in AVSData.CardholderName (ServiceInformation).
     * </summary>
     */
    public java.lang.String getCardholderName() {
        return cardholderName;
    }


    /**
     * Sets the cardholderName value for this AVSData.
     * 
     * @param cardholderName   * <summary>
     *             Cardholder name embossed on the front of the card. Conditional,
     * required if specified in AVSData.CardholderName (ServiceInformation).
     * </summary>
     */
    public void setCardholderName(java.lang.String cardholderName) {
        this.cardholderName = cardholderName;
    }


    /**
     * Gets the street value for this AVSData.
     * 
     * @return street   * <summary>
     *             Street Address. Conditional, required if specified in
     * AVSData.Street (ServiceInformation).
     *             </summary>
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this AVSData.
     * 
     * @param street   * <summary>
     *             Street Address. Conditional, required if specified in
     * AVSData.Street (ServiceInformation).
     *             </summary>
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the city value for this AVSData.
     * 
     * @return city   * <summary>
     *             City. Conditional, required if specified in AVSData.City
     * (ServiceInformation).
     *             </summary>
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AVSData.
     * 
     * @param city   * <summary>
     *             City. Conditional, required if specified in AVSData.City
     * (ServiceInformation).
     *             </summary>
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateProvince value for this AVSData.
     * 
     * @return stateProvince   * <summary>
     *             State or Province. Conditional, required if specified
     * in AVSData.StateProvince (ServiceInformation).
     *             </summary>
     */
    public java.lang.String getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this AVSData.
     * 
     * @param stateProvince   * <summary>
     *             State or Province. Conditional, required if specified
     * in AVSData.StateProvince (ServiceInformation).
     *             </summary>
     */
    public void setStateProvince(java.lang.String stateProvince) {
        this.stateProvince = stateProvince;
    }


    /**
     * Gets the postalCode value for this AVSData.
     * 
     * @return postalCode   * <summary>
     *             Postal Code. Conditional, required if specified in AVSData.PostalCode
     * (ServiceInformation).
     *             </summary>
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AVSData.
     * 
     * @param postalCode   * <summary>
     *             Postal Code. Conditional, required if specified in AVSData.PostalCode
     * (ServiceInformation).
     *             </summary>
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the country value for this AVSData.
     * 
     * @return country   * <summary>
     *             Country. Conditional, required if specified in AVSData.Country
     * (ServiceInformation).
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AVSData.
     * 
     * @param country   * <summary>
     *             Country. Conditional, required if specified in AVSData.Country
     * (ServiceInformation).
     *             </summary>
     */
    public void setCountry(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 country) {
        this.country = country;
    }


    /**
     * Gets the phone value for this AVSData.
     * 
     * @return phone   * <summary>
     *             Cardholder phone number. Conditional, required if specified
     * in AVSData.Phone (ServiceInformation).
     *             </summary>
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this AVSData.
     * 
     * @param phone   * <summary>
     *             Cardholder phone number. Conditional, required if specified
     * in AVSData.Phone (ServiceInformation).
     *             </summary>
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the email value for this AVSData.
     * 
     * @return email   * <summary>
     *             Cardholder email address. Conditional, reference AVS/Email
     * service configuration for level of service provider support.
     *             </summary>
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AVSData.
     * 
     * @param email   * <summary>
     *             Cardholder email address. Conditional, reference AVS/Email
     * service configuration for level of service provider support.
     *             </summary>
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AVSData)) return false;
        AVSData other = (AVSData) obj;
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
              this.phone.equals(other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AVSData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardholderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "StateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCountryCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Email"));
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
