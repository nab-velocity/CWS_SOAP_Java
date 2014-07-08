/**
 * BankcardTransactionPro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;

public class BankcardTransactionPro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransaction  implements java.io.Serializable {
    /* <summary>
     *             Details about a transaction that may lower interchange
     * rates for the transaction. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData interchangeData;

    public BankcardTransactionPro() {
    }

    public BankcardTransactionPro(
           java.lang.String relayResponseUrl,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData applicationConfigurationData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData transactionData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData interchangeData) {
        super(
            relayResponseUrl,
            customerData,
            reportingData,
            addendum,
            applicationConfigurationData,
            tenderData,
            transactionData);
        this.interchangeData = interchangeData;
    }


    /**
     * Gets the interchangeData value for this BankcardTransactionPro.
     * 
     * @return interchangeData   * <summary>
     *             Details about a transaction that may lower interchange
     * rates for the transaction. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData getInterchangeData() {
        return interchangeData;
    }


    /**
     * Sets the interchangeData value for this BankcardTransactionPro.
     * 
     * @param interchangeData   * <summary>
     *             Details about a transaction that may lower interchange
     * rates for the transaction. Optional.
     *             </summary>
     */
    public void setInterchangeData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData interchangeData) {
        this.interchangeData = interchangeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransactionPro)) return false;
        BankcardTransactionPro other = (BankcardTransactionPro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.interchangeData==null && other.getInterchangeData()==null) || 
             (this.interchangeData!=null &&
              this.interchangeData.equals(other.getInterchangeData())));
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
        if (getInterchangeData() != null) {
            _hashCode += getInterchangeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransactionPro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionPro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interchangeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "InterchangeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardInterchangeData"));
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
