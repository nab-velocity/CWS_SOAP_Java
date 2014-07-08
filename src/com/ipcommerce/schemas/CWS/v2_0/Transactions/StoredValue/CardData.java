/**
 * CardData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Cardholder data. Conditional, required if IdType of the
 * consumer identifier instance is a card (PAN or TrackData).
 *             </summary>
 */
public class CardData  implements java.io.Serializable {
    /* <summary>
     *             DEPRECATED Use Track1Data or Track2Data.  The actual data
     * read from the magnetic stripe on a card. Socket should strip Start
     * and End Sentinels, LRC and Track separators if present in card swipe.
     * Conditional, required when IdType is a swiped card ('Track_?_Data').
     * </summary> */
    private java.lang.String trackData;

    /* <summary>
     *             Card account number. Required.
     *             </summary> */
    private java.lang.String accountNumber;

    /* <summary>
     *             Card expiration. Optional.
     *             </summary> */
    private java.lang.String expire;

    /* <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary> */
    private java.lang.String track1Data;

    /* <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary> */
    private java.lang.String track2Data;

    public CardData() {
    }

    public CardData(
           java.lang.String trackData,
           java.lang.String accountNumber,
           java.lang.String expire,
           java.lang.String track1Data,
           java.lang.String track2Data) {
           this.trackData = trackData;
           this.accountNumber = accountNumber;
           this.expire = expire;
           this.track1Data = track1Data;
           this.track2Data = track2Data;
    }


    /**
     * Gets the trackData value for this CardData.
     * 
     * @return trackData   * <summary>
     *             DEPRECATED Use Track1Data or Track2Data.  The actual data
     * read from the magnetic stripe on a card. Socket should strip Start
     * and End Sentinels, LRC and Track separators if present in card swipe.
     * Conditional, required when IdType is a swiped card ('Track_?_Data').
     * </summary>
     */
    public java.lang.String getTrackData() {
        return trackData;
    }


    /**
     * Sets the trackData value for this CardData.
     * 
     * @param trackData   * <summary>
     *             DEPRECATED Use Track1Data or Track2Data.  The actual data
     * read from the magnetic stripe on a card. Socket should strip Start
     * and End Sentinels, LRC and Track separators if present in card swipe.
     * Conditional, required when IdType is a swiped card ('Track_?_Data').
     * </summary>
     */
    public void setTrackData(java.lang.String trackData) {
        this.trackData = trackData;
    }


    /**
     * Gets the accountNumber value for this CardData.
     * 
     * @return accountNumber   * <summary>
     *             Card account number. Required.
     *             </summary>
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CardData.
     * 
     * @param accountNumber   * <summary>
     *             Card account number. Required.
     *             </summary>
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the expire value for this CardData.
     * 
     * @return expire   * <summary>
     *             Card expiration. Optional.
     *             </summary>
     */
    public java.lang.String getExpire() {
        return expire;
    }


    /**
     * Sets the expire value for this CardData.
     * 
     * @param expire   * <summary>
     *             Card expiration. Optional.
     *             </summary>
     */
    public void setExpire(java.lang.String expire) {
        this.expire = expire;
    }


    /**
     * Gets the track1Data value for this CardData.
     * 
     * @return track1Data   * <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary>
     */
    public java.lang.String getTrack1Data() {
        return track1Data;
    }


    /**
     * Sets the track1Data value for this CardData.
     * 
     * @param track1Data   * <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary>
     */
    public void setTrack1Data(java.lang.String track1Data) {
        this.track1Data = track1Data;
    }


    /**
     * Gets the track2Data value for this CardData.
     * 
     * @return track2Data   * <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary>
     */
    public java.lang.String getTrack2Data() {
        return track2Data;
    }


    /**
     * Sets the track2Data value for this CardData.
     * 
     * @param track2Data   * <summary>
     *             The actual data read from the magnetic stripe on a card.
     * Application should strip Start and End Sentinels, LRC, and Track separators.
     * Conditional, required if at least one track data is required for authorizations
     * unless card not present or keyed entry.
     *             </summary>
     */
    public void setTrack2Data(java.lang.String track2Data) {
        this.track2Data = track2Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardData)) return false;
        CardData other = (CardData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trackData==null && other.getTrackData()==null) || 
             (this.trackData!=null &&
              this.trackData.equals(other.getTrackData()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.expire==null && other.getExpire()==null) || 
             (this.expire!=null &&
              this.expire.equals(other.getExpire()))) &&
            ((this.track1Data==null && other.getTrack1Data()==null) || 
             (this.track1Data!=null &&
              this.track1Data.equals(other.getTrack1Data()))) &&
            ((this.track2Data==null && other.getTrack2Data()==null) || 
             (this.track2Data!=null &&
              this.track2Data.equals(other.getTrack2Data())));
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
        if (getTrackData() != null) {
            _hashCode += getTrackData().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getExpire() != null) {
            _hashCode += getExpire().hashCode();
        }
        if (getTrack1Data() != null) {
            _hashCode += getTrack1Data().hashCode();
        }
        if (getTrack2Data() != null) {
            _hashCode += getTrack2Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "TrackData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track1Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Track1Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Track2Data"));
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
