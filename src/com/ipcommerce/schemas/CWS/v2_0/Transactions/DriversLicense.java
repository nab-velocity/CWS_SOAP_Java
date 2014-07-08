/**
 * DriversLicense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains driver's license information for the customer.
 * Optional.
 *             </summary>
 */
public class DriversLicense  implements java.io.Serializable {
    /* <summary>
     *             Driver's license number. Required.
     *             </summary> */
    private java.lang.String number;

    /* <summary>
     *             State or Province of issue of customer's drivers license.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeStateProvince state;

    /* <summary>
     *             Track 1 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary> */
    private java.lang.String track1;

    /* <summary>
     *             Track 2 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary> */
    private java.lang.String track2;

    public DriversLicense() {
    }

    public DriversLicense(
           java.lang.String number,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeStateProvince state,
           java.lang.String track1,
           java.lang.String track2) {
           this.number = number;
           this.state = state;
           this.track1 = track1;
           this.track2 = track2;
    }


    /**
     * Gets the number value for this DriversLicense.
     * 
     * @return number   * <summary>
     *             Driver's license number. Required.
     *             </summary>
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this DriversLicense.
     * 
     * @param number   * <summary>
     *             Driver's license number. Required.
     *             </summary>
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the state value for this DriversLicense.
     * 
     * @return state   * <summary>
     *             State or Province of issue of customer's drivers license.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeStateProvince getState() {
        return state;
    }


    /**
     * Sets the state value for this DriversLicense.
     * 
     * @param state   * <summary>
     *             State or Province of issue of customer's drivers license.
     * Required.
     *             </summary>
     */
    public void setState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeStateProvince state) {
        this.state = state;
    }


    /**
     * Gets the track1 value for this DriversLicense.
     * 
     * @return track1   * <summary>
     *             Track 1 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary>
     */
    public java.lang.String getTrack1() {
        return track1;
    }


    /**
     * Sets the track1 value for this DriversLicense.
     * 
     * @param track1   * <summary>
     *             Track 1 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary>
     */
    public void setTrack1(java.lang.String track1) {
        this.track1 = track1;
    }


    /**
     * Gets the track2 value for this DriversLicense.
     * 
     * @return track2   * <summary>
     *             Track 2 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary>
     */
    public java.lang.String getTrack2() {
        return track2;
    }


    /**
     * Sets the track2 value for this DriversLicense.
     * 
     * @param track2   * <summary>
     *             Track 2 data read off of the driver's license magnetic
     * stripe. Should not include the sentinels and LRC. Optional.
     *             </summary>
     */
    public void setTrack2(java.lang.String track2) {
        this.track2 = track2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriversLicense)) return false;
        DriversLicense other = (DriversLicense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.track1==null && other.getTrack1()==null) || 
             (this.track1!=null &&
              this.track1.equals(other.getTrack1()))) &&
            ((this.track2==null && other.getTrack2()==null) || 
             (this.track2!=null &&
              this.track2.equals(other.getTrack2())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTrack1() != null) {
            _hashCode += getTrack1().hashCode();
        }
        if (getTrack2() != null) {
            _hashCode += getTrack2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriversLicense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DriversLicense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeStateProvince"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Track1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Track2"));
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
