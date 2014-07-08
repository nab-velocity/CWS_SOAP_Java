/**
 * BankcardTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information about the Bankcard transaction tender
 * data. Required.
 *             </summary>
 */
public class BankcardTenderData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData  implements java.io.Serializable {
    /* <summary>
     *             Card data. Conditional, required if any one of the following
     * must be provided: CardDataToken, SecureCardData, or CardData.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData cardData;

    /* <summary>
     *             Security data for card transactions, such as AVS and CVV.
     * Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData cardSecurityData;

    /* <summary>
     *             Ecommerce security elements. Conditional, optional for
     * Ecommerce transactions, otherwise not present.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.EcommerceSecurityData ecommerceSecurityData;

    public BankcardTenderData() {
    }

    public BankcardTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData cardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData cardSecurityData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.EcommerceSecurityData ecommerceSecurityData) {
        super(
            paymentAccountDataToken,
            securePaymentAccountData,
            encryptionKeyId,
            swipeStatus);
        this.cardData = cardData;
        this.cardSecurityData = cardSecurityData;
        this.ecommerceSecurityData = ecommerceSecurityData;
    }


    /**
     * Gets the cardData value for this BankcardTenderData.
     * 
     * @return cardData   * <summary>
     *             Card data. Conditional, required if any one of the following
     * must be provided: CardDataToken, SecureCardData, or CardData.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData getCardData() {
        return cardData;
    }


    /**
     * Sets the cardData value for this BankcardTenderData.
     * 
     * @param cardData   * <summary>
     *             Card data. Conditional, required if any one of the following
     * must be provided: CardDataToken, SecureCardData, or CardData.
     *             </summary>
     */
    public void setCardData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData cardData) {
        this.cardData = cardData;
    }


    /**
     * Gets the cardSecurityData value for this BankcardTenderData.
     * 
     * @return cardSecurityData   * <summary>
     *             Security data for card transactions, such as AVS and CVV.
     * Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData getCardSecurityData() {
        return cardSecurityData;
    }


    /**
     * Sets the cardSecurityData value for this BankcardTenderData.
     * 
     * @param cardSecurityData   * <summary>
     *             Security data for card transactions, such as AVS and CVV.
     * Optional.
     *             </summary>
     */
    public void setCardSecurityData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData cardSecurityData) {
        this.cardSecurityData = cardSecurityData;
    }


    /**
     * Gets the ecommerceSecurityData value for this BankcardTenderData.
     * 
     * @return ecommerceSecurityData   * <summary>
     *             Ecommerce security elements. Conditional, optional for
     * Ecommerce transactions, otherwise not present.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.EcommerceSecurityData getEcommerceSecurityData() {
        return ecommerceSecurityData;
    }


    /**
     * Sets the ecommerceSecurityData value for this BankcardTenderData.
     * 
     * @param ecommerceSecurityData   * <summary>
     *             Ecommerce security elements. Conditional, optional for
     * Ecommerce transactions, otherwise not present.
     *             </summary>
     */
    public void setEcommerceSecurityData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.EcommerceSecurityData ecommerceSecurityData) {
        this.ecommerceSecurityData = ecommerceSecurityData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTenderData)) return false;
        BankcardTenderData other = (BankcardTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardData==null && other.getCardData()==null) || 
             (this.cardData!=null &&
              this.cardData.equals(other.getCardData()))) &&
            ((this.cardSecurityData==null && other.getCardSecurityData()==null) || 
             (this.cardSecurityData!=null &&
              this.cardSecurityData.equals(other.getCardSecurityData()))) &&
            ((this.ecommerceSecurityData==null && other.getEcommerceSecurityData()==null) || 
             (this.ecommerceSecurityData!=null &&
              this.ecommerceSecurityData.equals(other.getEcommerceSecurityData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCardData() != null) {
            _hashCode += getCardData().hashCode();
        }
        if (getCardSecurityData() != null) {
            _hashCode += getCardSecurityData().hashCode();
        }
        if (getEcommerceSecurityData() != null) {
            _hashCode += getEcommerceSecurityData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSecurityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardSecurityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardSecurityData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecommerceSecurityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EcommerceSecurityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EcommerceSecurityData"));
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
