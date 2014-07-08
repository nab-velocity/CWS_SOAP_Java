/**
 * CardSecurityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains security information for the payment card. Conditional,
 * required for PIN Debit transactions.
 *             </summary>
 */
public class CardSecurityData  implements java.io.Serializable {
    /* <summary>
     *             Cardholder address data for Address Verification System
     * (AVS). Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSData AVSData;

    /* <summary>
     *             Indicates whether or not CV data provided. Optional, but
     * recommended for card not present authorizations, not used in settlement.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided;

    /* <summary>
     *             The Card Verification (CV) data applies to Visa (CVV),
     * MasterCard (CVC), AMEX (CID), and Discover (CID), and is contained
     * on the signature line of the physical credit card. Conditional, required
     * in authorizations if CVDataInd = 'Provided', not used in settlement.
     * </summary> */
    private java.lang.String CVData;

    /* <summary>
     *             Key serial number for DUK/PT PIN encryption. Conditional,
     * required for PIN Debit transactions.
     *             </summary> */
    private java.lang.String keySerialNumber;

    /* <summary>
     *             Encrypted PIN. Conditional, required for PIN Debit transactions.
     * </summary> */
    private java.lang.String PIN;

    /* <summary>
     *             Specifies identifying information about the tender, such
     * as a magnetic stripe fingerprint. Optional.
     *             </summary> */
    private java.lang.String identificationInformation;

    public CardSecurityData() {
    }

    public CardSecurityData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSData AVSData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided,
           java.lang.String CVData,
           java.lang.String keySerialNumber,
           java.lang.String PIN,
           java.lang.String identificationInformation) {
           this.AVSData = AVSData;
           this.CVDataProvided = CVDataProvided;
           this.CVData = CVData;
           this.keySerialNumber = keySerialNumber;
           this.PIN = PIN;
           this.identificationInformation = identificationInformation;
    }


    /**
     * Gets the AVSData value for this CardSecurityData.
     * 
     * @return AVSData   * <summary>
     *             Cardholder address data for Address Verification System
     * (AVS). Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSData getAVSData() {
        return AVSData;
    }


    /**
     * Sets the AVSData value for this CardSecurityData.
     * 
     * @param AVSData   * <summary>
     *             Cardholder address data for Address Verification System
     * (AVS). Optional.
     *             </summary>
     */
    public void setAVSData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSData AVSData) {
        this.AVSData = AVSData;
    }


    /**
     * Gets the CVDataProvided value for this CardSecurityData.
     * 
     * @return CVDataProvided   * <summary>
     *             Indicates whether or not CV data provided. Optional, but
     * recommended for card not present authorizations, not used in settlement.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided getCVDataProvided() {
        return CVDataProvided;
    }


    /**
     * Sets the CVDataProvided value for this CardSecurityData.
     * 
     * @param CVDataProvided   * <summary>
     *             Indicates whether or not CV data provided. Optional, but
     * recommended for card not present authorizations, not used in settlement.
     * </summary>
     */
    public void setCVDataProvided(com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided) {
        this.CVDataProvided = CVDataProvided;
    }


    /**
     * Gets the CVData value for this CardSecurityData.
     * 
     * @return CVData   * <summary>
     *             The Card Verification (CV) data applies to Visa (CVV),
     * MasterCard (CVC), AMEX (CID), and Discover (CID), and is contained
     * on the signature line of the physical credit card. Conditional, required
     * in authorizations if CVDataInd = 'Provided', not used in settlement.
     * </summary>
     */
    public java.lang.String getCVData() {
        return CVData;
    }


    /**
     * Sets the CVData value for this CardSecurityData.
     * 
     * @param CVData   * <summary>
     *             The Card Verification (CV) data applies to Visa (CVV),
     * MasterCard (CVC), AMEX (CID), and Discover (CID), and is contained
     * on the signature line of the physical credit card. Conditional, required
     * in authorizations if CVDataInd = 'Provided', not used in settlement.
     * </summary>
     */
    public void setCVData(java.lang.String CVData) {
        this.CVData = CVData;
    }


    /**
     * Gets the keySerialNumber value for this CardSecurityData.
     * 
     * @return keySerialNumber   * <summary>
     *             Key serial number for DUK/PT PIN encryption. Conditional,
     * required for PIN Debit transactions.
     *             </summary>
     */
    public java.lang.String getKeySerialNumber() {
        return keySerialNumber;
    }


    /**
     * Sets the keySerialNumber value for this CardSecurityData.
     * 
     * @param keySerialNumber   * <summary>
     *             Key serial number for DUK/PT PIN encryption. Conditional,
     * required for PIN Debit transactions.
     *             </summary>
     */
    public void setKeySerialNumber(java.lang.String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }


    /**
     * Gets the PIN value for this CardSecurityData.
     * 
     * @return PIN   * <summary>
     *             Encrypted PIN. Conditional, required for PIN Debit transactions.
     * </summary>
     */
    public java.lang.String getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this CardSecurityData.
     * 
     * @param PIN   * <summary>
     *             Encrypted PIN. Conditional, required for PIN Debit transactions.
     * </summary>
     */
    public void setPIN(java.lang.String PIN) {
        this.PIN = PIN;
    }


    /**
     * Gets the identificationInformation value for this CardSecurityData.
     * 
     * @return identificationInformation   * <summary>
     *             Specifies identifying information about the tender, such
     * as a magnetic stripe fingerprint. Optional.
     *             </summary>
     */
    public java.lang.String getIdentificationInformation() {
        return identificationInformation;
    }


    /**
     * Sets the identificationInformation value for this CardSecurityData.
     * 
     * @param identificationInformation   * <summary>
     *             Specifies identifying information about the tender, such
     * as a magnetic stripe fingerprint. Optional.
     *             </summary>
     */
    public void setIdentificationInformation(java.lang.String identificationInformation) {
        this.identificationInformation = identificationInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSecurityData)) return false;
        CardSecurityData other = (CardSecurityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AVSData==null && other.getAVSData()==null) || 
             (this.AVSData!=null &&
              this.AVSData.equals(other.getAVSData()))) &&
            ((this.CVDataProvided==null && other.getCVDataProvided()==null) || 
             (this.CVDataProvided!=null &&
              this.CVDataProvided.equals(other.getCVDataProvided()))) &&
            ((this.CVData==null && other.getCVData()==null) || 
             (this.CVData!=null &&
              this.CVData.equals(other.getCVData()))) &&
            ((this.keySerialNumber==null && other.getKeySerialNumber()==null) || 
             (this.keySerialNumber!=null &&
              this.keySerialNumber.equals(other.getKeySerialNumber()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN()))) &&
            ((this.identificationInformation==null && other.getIdentificationInformation()==null) || 
             (this.identificationInformation!=null &&
              this.identificationInformation.equals(other.getIdentificationInformation())));
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
        if (getAVSData() != null) {
            _hashCode += getAVSData().hashCode();
        }
        if (getCVDataProvided() != null) {
            _hashCode += getCVDataProvided().hashCode();
        }
        if (getCVData() != null) {
            _hashCode += getCVData().hashCode();
        }
        if (getKeySerialNumber() != null) {
            _hashCode += getKeySerialNumber().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        if (getIdentificationInformation() != null) {
            _hashCode += getIdentificationInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSecurityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardSecurityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVSData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVDataProvided");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CVDataProvided"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVDataProvided"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CVData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keySerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "KeySerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IdentificationInformation"));
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
