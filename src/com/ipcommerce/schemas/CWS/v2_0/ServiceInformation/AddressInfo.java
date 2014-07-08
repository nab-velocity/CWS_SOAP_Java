/**
 * AddressInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains merchant address information. Required.
 *             </summary>
 */
public class AddressInfo  implements java.io.Serializable {
    /* <summary>
     *             Street Address Line 1. Required.
     *             </summary> */
    private java.lang.String street1;

    /* <summary>
     *             Street Address Line 2. Optional.
     *             </summary> */
    private java.lang.String street2;

    /* <summary>
     *             City. Required.
     *             </summary> */
    private java.lang.String city;

    /* <summary>
     *             State or Province. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince stateProvince;

    /* <summary>
     *             Postal Code. Required.
     *             </summary> */
    private java.lang.String postalCode;

    /* <summary>
     *             Country. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3 countryCode;

    public AddressInfo() {
    }

    public AddressInfo(
           java.lang.String street1,
           java.lang.String street2,
           java.lang.String city,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince stateProvince,
           java.lang.String postalCode,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3 countryCode) {
           this.street1 = street1;
           this.street2 = street2;
           this.city = city;
           this.stateProvince = stateProvince;
           this.postalCode = postalCode;
           this.countryCode = countryCode;
    }


    /**
     * Gets the street1 value for this AddressInfo.
     * 
     * @return street1   * <summary>
     *             Street Address Line 1. Required.
     *             </summary>
     */
    public java.lang.String getStreet1() {
        return street1;
    }


    /**
     * Sets the street1 value for this AddressInfo.
     * 
     * @param street1   * <summary>
     *             Street Address Line 1. Required.
     *             </summary>
     */
    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }


    /**
     * Gets the street2 value for this AddressInfo.
     * 
     * @return street2   * <summary>
     *             Street Address Line 2. Optional.
     *             </summary>
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this AddressInfo.
     * 
     * @param street2   * <summary>
     *             Street Address Line 2. Optional.
     *             </summary>
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }


    /**
     * Gets the city value for this AddressInfo.
     * 
     * @return city   * <summary>
     *             City. Required.
     *             </summary>
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AddressInfo.
     * 
     * @param city   * <summary>
     *             City. Required.
     *             </summary>
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateProvince value for this AddressInfo.
     * 
     * @return stateProvince   * <summary>
     *             State or Province. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this AddressInfo.
     * 
     * @param stateProvince   * <summary>
     *             State or Province. Required.
     *             </summary>
     */
    public void setStateProvince(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince stateProvince) {
        this.stateProvince = stateProvince;
    }


    /**
     * Gets the postalCode value for this AddressInfo.
     * 
     * @return postalCode   * <summary>
     *             Postal Code. Required.
     *             </summary>
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AddressInfo.
     * 
     * @param postalCode   * <summary>
     *             Postal Code. Required.
     *             </summary>
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the countryCode value for this AddressInfo.
     * 
     * @return countryCode   * <summary>
     *             Country. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3 getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this AddressInfo.
     * 
     * @param countryCode   * <summary>
     *             Country. Required.
     *             </summary>
     */
    public void setCountryCode(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3 countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressInfo)) return false;
        AddressInfo other = (AddressInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.street1==null && other.getStreet1()==null) || 
             (this.street1!=null &&
              this.street1.equals(other.getStreet1()))) &&
            ((this.street2==null && other.getStreet2()==null) || 
             (this.street2!=null &&
              this.street2.equals(other.getStreet2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateProvince==null && other.getStateProvince()==null) || 
             (this.stateProvince!=null &&
              this.stateProvince.equals(other.getStateProvince()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
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
        if (getStreet1() != null) {
            _hashCode += getStreet1().hashCode();
        }
        if (getStreet2() != null) {
            _hashCode += getStreet2().hashCode();
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AddressInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Street1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeStateProvince"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOCountryCodeA3"));
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
