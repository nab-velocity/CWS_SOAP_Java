/**
 * BankcardTransactionDataDefaults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information sent with all Bankcard transactions.
 * May be overridden on each transaction, as necessary. Required.
 *             </summary>
 */
public class BankcardTransactionDataDefaults  implements java.io.Serializable {
    /* <summary>
     *             Merchant's currency code as defined by the International
     * Standards Organization (ISO). Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3 currencyCode;

    /* <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent customerPresent;

    /* <summary>
     *             DEPRECATED: This must now be set on each individual transaction.
     * Indicates how the cardholder data was retrieved. When authorizing
     * with stored card data, either locally or with CardDataToken, POSEntryMode
     * should indicate that the card data was manually collected (Keyed or
     * one of its variants). Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode entryMode;

    /* <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI requestACI;

    /* <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice requestAdvice;

    public BankcardTransactionDataDefaults() {
    }

    public BankcardTransactionDataDefaults(
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3 currencyCode,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent customerPresent,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode entryMode,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI requestACI,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice requestAdvice) {
           this.currencyCode = currencyCode;
           this.customerPresent = customerPresent;
           this.entryMode = entryMode;
           this.requestACI = requestACI;
           this.requestAdvice = requestAdvice;
    }


    /**
     * Gets the currencyCode value for this BankcardTransactionDataDefaults.
     * 
     * @return currencyCode   * <summary>
     *             Merchant's currency code as defined by the International
     * Standards Organization (ISO). Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3 getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BankcardTransactionDataDefaults.
     * 
     * @param currencyCode   * <summary>
     *             Merchant's currency code as defined by the International
     * Standards Organization (ISO). Optional.
     *             </summary>
     */
    public void setCurrencyCode(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3 currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customerPresent value for this BankcardTransactionDataDefaults.
     * 
     * @return customerPresent   * <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent getCustomerPresent() {
        return customerPresent;
    }


    /**
     * Sets the customerPresent value for this BankcardTransactionDataDefaults.
     * 
     * @param customerPresent   * <summary>
     *             Presence of cardholder relative to the transaction point
     * of service. Optional.
     *             </summary>
     */
    public void setCustomerPresent(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent customerPresent) {
        this.customerPresent = customerPresent;
    }


    /**
     * Gets the entryMode value for this BankcardTransactionDataDefaults.
     * 
     * @return entryMode   * <summary>
     *             DEPRECATED: This must now be set on each individual transaction.
     * Indicates how the cardholder data was retrieved. When authorizing
     * with stored card data, either locally or with CardDataToken, POSEntryMode
     * should indicate that the card data was manually collected (Keyed or
     * one of its variants). Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode getEntryMode() {
        return entryMode;
    }


    /**
     * Sets the entryMode value for this BankcardTransactionDataDefaults.
     * 
     * @param entryMode   * <summary>
     *             DEPRECATED: This must now be set on each individual transaction.
     * Indicates how the cardholder data was retrieved. When authorizing
     * with stored card data, either locally or with CardDataToken, POSEntryMode
     * should indicate that the card data was manually collected (Keyed or
     * one of its variants). Optional.
     *             </summary>
     */
    public void setEntryMode(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode entryMode) {
        this.entryMode = entryMode;
    }


    /**
     * Gets the requestACI value for this BankcardTransactionDataDefaults.
     * 
     * @return requestACI   * <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI getRequestACI() {
        return requestACI;
    }


    /**
     * Sets the requestACI value for this BankcardTransactionDataDefaults.
     * 
     * @param requestACI   * <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary>
     */
    public void setRequestACI(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI requestACI) {
        this.requestACI = requestACI;
    }


    /**
     * Gets the requestAdvice value for this BankcardTransactionDataDefaults.
     * 
     * @return requestAdvice   * <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice getRequestAdvice() {
        return requestAdvice;
    }


    /**
     * Sets the requestAdvice value for this BankcardTransactionDataDefaults.
     * 
     * @param requestAdvice   * <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary>
     */
    public void setRequestAdvice(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice requestAdvice) {
        this.requestAdvice = requestAdvice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransactionDataDefaults)) return false;
        BankcardTransactionDataDefaults other = (BankcardTransactionDataDefaults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customerPresent==null && other.getCustomerPresent()==null) || 
             (this.customerPresent!=null &&
              this.customerPresent.equals(other.getCustomerPresent()))) &&
            ((this.entryMode==null && other.getEntryMode()==null) || 
             (this.entryMode!=null &&
              this.entryMode.equals(other.getEntryMode()))) &&
            ((this.requestACI==null && other.getRequestACI()==null) || 
             (this.requestACI!=null &&
              this.requestACI.equals(other.getRequestACI()))) &&
            ((this.requestAdvice==null && other.getRequestAdvice()==null) || 
             (this.requestAdvice!=null &&
              this.requestAdvice.equals(other.getRequestAdvice())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomerPresent() != null) {
            _hashCode += getCustomerPresent().hashCode();
        }
        if (getEntryMode() != null) {
            _hashCode += getEntryMode().hashCode();
        }
        if (getRequestACI() != null) {
            _hashCode += getRequestACI().hashCode();
        }
        if (getRequestAdvice() != null) {
            _hashCode += getRequestAdvice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransactionDataDefaults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardTransactionDataDefaults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOCurrencyCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerPresent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EntryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EntryMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestACI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestACI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestACI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestAdvice"));
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
