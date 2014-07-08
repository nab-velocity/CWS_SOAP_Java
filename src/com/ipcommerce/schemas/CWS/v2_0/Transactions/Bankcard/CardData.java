/**
 * CardData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information about the payment card. Conditional,
 * required for Authorize and AuthorizeAndCapture transactions. May be
 * required for undoing PIN Debit transactions.
 *             </summary>
 */
public class CardData  implements java.io.Serializable {
    /* <summary>
     *             Type of card used in the transaction. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType cardType;

    /* <summary>
     *             Cardholder name embossed on the front of the card. Optional,
     * but recommended for MOTO and Ecommerce industry types.
     *             </summary> */
    private java.lang.String cardholderName;

    /* <summary>
     *             Cardholder Primary Account Number embossed on the front
     * of the card. Required.
     *             </summary> */
    private java.lang.String PAN;

    /* <summary>
     *             The 4-digit expiration date embossed on the front of a
     * card. Conditional, required for authorization, not required for settlement.
     * </summary> */
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
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType cardType,
           java.lang.String cardholderName,
           java.lang.String PAN,
           java.lang.String expire,
           java.lang.String track1Data,
           java.lang.String track2Data) {
           this.cardType = cardType;
           this.cardholderName = cardholderName;
           this.PAN = PAN;
           this.expire = expire;
           this.track1Data = track1Data;
           this.track2Data = track2Data;
    }


    /**
     * Gets the cardType value for this CardData.
     * 
     * @return cardType   * <summary>
     *             Type of card used in the transaction. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this CardData.
     * 
     * @param cardType   * <summary>
     *             Type of card used in the transaction. Required.
     *             </summary>
     */
    public void setCardType(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardholderName value for this CardData.
     * 
     * @return cardholderName   * <summary>
     *             Cardholder name embossed on the front of the card. Optional,
     * but recommended for MOTO and Ecommerce industry types.
     *             </summary>
     */
    public java.lang.String getCardholderName() {
        return cardholderName;
    }


    /**
     * Sets the cardholderName value for this CardData.
     * 
     * @param cardholderName   * <summary>
     *             Cardholder name embossed on the front of the card. Optional,
     * but recommended for MOTO and Ecommerce industry types.
     *             </summary>
     */
    public void setCardholderName(java.lang.String cardholderName) {
        this.cardholderName = cardholderName;
    }


    /**
     * Gets the PAN value for this CardData.
     * 
     * @return PAN   * <summary>
     *             Cardholder Primary Account Number embossed on the front
     * of the card. Required.
     *             </summary>
     */
    public java.lang.String getPAN() {
        return PAN;
    }


    /**
     * Sets the PAN value for this CardData.
     * 
     * @param PAN   * <summary>
     *             Cardholder Primary Account Number embossed on the front
     * of the card. Required.
     *             </summary>
     */
    public void setPAN(java.lang.String PAN) {
        this.PAN = PAN;
    }


    /**
     * Gets the expire value for this CardData.
     * 
     * @return expire   * <summary>
     *             The 4-digit expiration date embossed on the front of a
     * card. Conditional, required for authorization, not required for settlement.
     * </summary>
     */
    public java.lang.String getExpire() {
        return expire;
    }


    /**
     * Sets the expire value for this CardData.
     * 
     * @param expire   * <summary>
     *             The 4-digit expiration date embossed on the front of a
     * card. Conditional, required for authorization, not required for settlement.
     * </summary>
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
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardholderName==null && other.getCardholderName()==null) || 
             (this.cardholderName!=null &&
              this.cardholderName.equals(other.getCardholderName()))) &&
            ((this.PAN==null && other.getPAN()==null) || 
             (this.PAN!=null &&
              this.PAN.equals(other.getPAN()))) &&
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
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardholderName() != null) {
            _hashCode += getCardholderName().hashCode();
        }
        if (getPAN() != null) {
            _hashCode += getPAN().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardholderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track1Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Track1Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track2Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Track2Data"));
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
