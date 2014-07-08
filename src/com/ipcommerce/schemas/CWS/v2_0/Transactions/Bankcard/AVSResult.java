/**
 * AVSResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Specifies the result of an Address Verification System
 * (AVS) lookup by the Service Provider. Optional.
 *             </summary>
 */
public class AVSResult  implements java.io.Serializable {
    /* <summary>
     *             Specifies the actual result of AVS from the Service Provider.
     * Optional.
     *             </summary> */
    private java.lang.String actualResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to address
     * matching. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AddressResult addressResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to country
     * matching. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CountryResult countryResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to state matching.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.StateResult stateResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to postal code
     * matching. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PostalCodeResult postalCodeResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to phone matching.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PhoneResult phoneResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to cardholder
     * name matching. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardholderNameResult cardholderNameResult;

    /* <summary>
     *             Specifies the result of AVS as it pertains to city matching.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CityResult cityResult;

    public AVSResult() {
    }

    public AVSResult(
           java.lang.String actualResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AddressResult addressResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CountryResult countryResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.StateResult stateResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PostalCodeResult postalCodeResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PhoneResult phoneResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardholderNameResult cardholderNameResult,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CityResult cityResult) {
           this.actualResult = actualResult;
           this.addressResult = addressResult;
           this.countryResult = countryResult;
           this.stateResult = stateResult;
           this.postalCodeResult = postalCodeResult;
           this.phoneResult = phoneResult;
           this.cardholderNameResult = cardholderNameResult;
           this.cityResult = cityResult;
    }


    /**
     * Gets the actualResult value for this AVSResult.
     * 
     * @return actualResult   * <summary>
     *             Specifies the actual result of AVS from the Service Provider.
     * Optional.
     *             </summary>
     */
    public java.lang.String getActualResult() {
        return actualResult;
    }


    /**
     * Sets the actualResult value for this AVSResult.
     * 
     * @param actualResult   * <summary>
     *             Specifies the actual result of AVS from the Service Provider.
     * Optional.
     *             </summary>
     */
    public void setActualResult(java.lang.String actualResult) {
        this.actualResult = actualResult;
    }


    /**
     * Gets the addressResult value for this AVSResult.
     * 
     * @return addressResult   * <summary>
     *             Specifies the result of AVS as it pertains to address
     * matching. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AddressResult getAddressResult() {
        return addressResult;
    }


    /**
     * Sets the addressResult value for this AVSResult.
     * 
     * @param addressResult   * <summary>
     *             Specifies the result of AVS as it pertains to address
     * matching. Required.
     *             </summary>
     */
    public void setAddressResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AddressResult addressResult) {
        this.addressResult = addressResult;
    }


    /**
     * Gets the countryResult value for this AVSResult.
     * 
     * @return countryResult   * <summary>
     *             Specifies the result of AVS as it pertains to country
     * matching. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CountryResult getCountryResult() {
        return countryResult;
    }


    /**
     * Sets the countryResult value for this AVSResult.
     * 
     * @param countryResult   * <summary>
     *             Specifies the result of AVS as it pertains to country
     * matching. Required.
     *             </summary>
     */
    public void setCountryResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CountryResult countryResult) {
        this.countryResult = countryResult;
    }


    /**
     * Gets the stateResult value for this AVSResult.
     * 
     * @return stateResult   * <summary>
     *             Specifies the result of AVS as it pertains to state matching.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.StateResult getStateResult() {
        return stateResult;
    }


    /**
     * Sets the stateResult value for this AVSResult.
     * 
     * @param stateResult   * <summary>
     *             Specifies the result of AVS as it pertains to state matching.
     * Required.
     *             </summary>
     */
    public void setStateResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.StateResult stateResult) {
        this.stateResult = stateResult;
    }


    /**
     * Gets the postalCodeResult value for this AVSResult.
     * 
     * @return postalCodeResult   * <summary>
     *             Specifies the result of AVS as it pertains to postal code
     * matching. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PostalCodeResult getPostalCodeResult() {
        return postalCodeResult;
    }


    /**
     * Sets the postalCodeResult value for this AVSResult.
     * 
     * @param postalCodeResult   * <summary>
     *             Specifies the result of AVS as it pertains to postal code
     * matching. Required.
     *             </summary>
     */
    public void setPostalCodeResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PostalCodeResult postalCodeResult) {
        this.postalCodeResult = postalCodeResult;
    }


    /**
     * Gets the phoneResult value for this AVSResult.
     * 
     * @return phoneResult   * <summary>
     *             Specifies the result of AVS as it pertains to phone matching.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PhoneResult getPhoneResult() {
        return phoneResult;
    }


    /**
     * Sets the phoneResult value for this AVSResult.
     * 
     * @param phoneResult   * <summary>
     *             Specifies the result of AVS as it pertains to phone matching.
     * Required.
     *             </summary>
     */
    public void setPhoneResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PhoneResult phoneResult) {
        this.phoneResult = phoneResult;
    }


    /**
     * Gets the cardholderNameResult value for this AVSResult.
     * 
     * @return cardholderNameResult   * <summary>
     *             Specifies the result of AVS as it pertains to cardholder
     * name matching. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardholderNameResult getCardholderNameResult() {
        return cardholderNameResult;
    }


    /**
     * Sets the cardholderNameResult value for this AVSResult.
     * 
     * @param cardholderNameResult   * <summary>
     *             Specifies the result of AVS as it pertains to cardholder
     * name matching. Required.
     *             </summary>
     */
    public void setCardholderNameResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardholderNameResult cardholderNameResult) {
        this.cardholderNameResult = cardholderNameResult;
    }


    /**
     * Gets the cityResult value for this AVSResult.
     * 
     * @return cityResult   * <summary>
     *             Specifies the result of AVS as it pertains to city matching.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CityResult getCityResult() {
        return cityResult;
    }


    /**
     * Sets the cityResult value for this AVSResult.
     * 
     * @param cityResult   * <summary>
     *             Specifies the result of AVS as it pertains to city matching.
     * Required.
     *             </summary>
     */
    public void setCityResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CityResult cityResult) {
        this.cityResult = cityResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AVSResult)) return false;
        AVSResult other = (AVSResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualResult==null && other.getActualResult()==null) || 
             (this.actualResult!=null &&
              this.actualResult.equals(other.getActualResult()))) &&
            ((this.addressResult==null && other.getAddressResult()==null) || 
             (this.addressResult!=null &&
              this.addressResult.equals(other.getAddressResult()))) &&
            ((this.countryResult==null && other.getCountryResult()==null) || 
             (this.countryResult!=null &&
              this.countryResult.equals(other.getCountryResult()))) &&
            ((this.stateResult==null && other.getStateResult()==null) || 
             (this.stateResult!=null &&
              this.stateResult.equals(other.getStateResult()))) &&
            ((this.postalCodeResult==null && other.getPostalCodeResult()==null) || 
             (this.postalCodeResult!=null &&
              this.postalCodeResult.equals(other.getPostalCodeResult()))) &&
            ((this.phoneResult==null && other.getPhoneResult()==null) || 
             (this.phoneResult!=null &&
              this.phoneResult.equals(other.getPhoneResult()))) &&
            ((this.cardholderNameResult==null && other.getCardholderNameResult()==null) || 
             (this.cardholderNameResult!=null &&
              this.cardholderNameResult.equals(other.getCardholderNameResult()))) &&
            ((this.cityResult==null && other.getCityResult()==null) || 
             (this.cityResult!=null &&
              this.cityResult.equals(other.getCityResult())));
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
        if (getActualResult() != null) {
            _hashCode += getActualResult().hashCode();
        }
        if (getAddressResult() != null) {
            _hashCode += getAddressResult().hashCode();
        }
        if (getCountryResult() != null) {
            _hashCode += getCountryResult().hashCode();
        }
        if (getStateResult() != null) {
            _hashCode += getStateResult().hashCode();
        }
        if (getPostalCodeResult() != null) {
            _hashCode += getPostalCodeResult().hashCode();
        }
        if (getPhoneResult() != null) {
            _hashCode += getPhoneResult().hashCode();
        }
        if (getCardholderNameResult() != null) {
            _hashCode += getCardholderNameResult().hashCode();
        }
        if (getCityResult() != null) {
            _hashCode += getCityResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AVSResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ActualResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AddressResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AddressResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CountryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CountryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "StateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "StateResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PostalCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PostalCodeResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PhoneResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PhoneResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardholderNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderNameResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CityResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CityResult"));
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
