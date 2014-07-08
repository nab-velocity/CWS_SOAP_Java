/**
 * BankcardCapture.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information for capturing Bankcard transactions
 * (Credit and PIN Debit). Required.
 *             </summary>
 */
public class BankcardCapture  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture  implements java.io.Serializable {
    /* <summary>
     *             Amount to capture if different from the authorized amount.
     * Conditional, required when capturing a different amount than authorized.
     * </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Indicates the type of charge. In most retail environments,
     * this value will be set to 'RetailOther', but if other enumerations
     * are applicable they should be used. Conditional, required for Retail
     * transactions.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType chargeType;

    /* <summary>
     *             Date of goods shipment. Conditional, required for MOTO
     * transactions.
     *             </summary> */
    private java.util.Calendar shipDate;

    /* <summary>
     *             Tip amount, if not specified at the time of authorization.
     * Optional.
     *             </summary> */
    private java.math.BigDecimal tipAmount;

    public BankcardCapture() {
    }

    public BankcardCapture(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType chargeType,
           java.util.Calendar shipDate,
           java.math.BigDecimal tipAmount) {
        super(
            transactionId,
            addendum);
        this.amount = amount;
        this.chargeType = chargeType;
        this.shipDate = shipDate;
        this.tipAmount = tipAmount;
    }


    /**
     * Gets the amount value for this BankcardCapture.
     * 
     * @return amount   * <summary>
     *             Amount to capture if different from the authorized amount.
     * Conditional, required when capturing a different amount than authorized.
     * </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BankcardCapture.
     * 
     * @param amount   * <summary>
     *             Amount to capture if different from the authorized amount.
     * Conditional, required when capturing a different amount than authorized.
     * </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the chargeType value for this BankcardCapture.
     * 
     * @return chargeType   * <summary>
     *             Indicates the type of charge. In most retail environments,
     * this value will be set to 'RetailOther', but if other enumerations
     * are applicable they should be used. Conditional, required for Retail
     * transactions.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this BankcardCapture.
     * 
     * @param chargeType   * <summary>
     *             Indicates the type of charge. In most retail environments,
     * this value will be set to 'RetailOther', but if other enumerations
     * are applicable they should be used. Conditional, required for Retail
     * transactions.
     *             </summary>
     */
    public void setChargeType(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the shipDate value for this BankcardCapture.
     * 
     * @return shipDate   * <summary>
     *             Date of goods shipment. Conditional, required for MOTO
     * transactions.
     *             </summary>
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this BankcardCapture.
     * 
     * @param shipDate   * <summary>
     *             Date of goods shipment. Conditional, required for MOTO
     * transactions.
     *             </summary>
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the tipAmount value for this BankcardCapture.
     * 
     * @return tipAmount   * <summary>
     *             Tip amount, if not specified at the time of authorization.
     * Optional.
     *             </summary>
     */
    public java.math.BigDecimal getTipAmount() {
        return tipAmount;
    }


    /**
     * Sets the tipAmount value for this BankcardCapture.
     * 
     * @param tipAmount   * <summary>
     *             Tip amount, if not specified at the time of authorization.
     * Optional.
     *             </summary>
     */
    public void setTipAmount(java.math.BigDecimal tipAmount) {
        this.tipAmount = tipAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardCapture)) return false;
        BankcardCapture other = (BankcardCapture) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.tipAmount==null && other.getTipAmount()==null) || 
             (this.tipAmount!=null &&
              this.tipAmount.equals(other.getTipAmount())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getTipAmount() != null) {
            _hashCode += getTipAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardCapture.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardCapture"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ChargeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TipAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
