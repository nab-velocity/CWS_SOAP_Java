/**
 * BankcardTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class BankcardTransaction  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction  implements java.io.Serializable {
    /* <summary>
     *             Details about the way this application instance is configured,
     * if different from the values set in ServiceInformation. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData applicationConfigurationData;

    /* <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData;

    /* <summary>
     *             Contains transaction detail information. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData transactionData;

    public BankcardTransaction() {
    }

    public BankcardTransaction(
           java.lang.String relayResponseUrl,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData applicationConfigurationData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData transactionData) {
        super(
            relayResponseUrl,
            customerData,
            reportingData,
            addendum);
        this.applicationConfigurationData = applicationConfigurationData;
        this.tenderData = tenderData;
        this.transactionData = transactionData;
    }


    /**
     * Gets the applicationConfigurationData value for this BankcardTransaction.
     * 
     * @return applicationConfigurationData   * <summary>
     *             Details about the way this application instance is configured,
     * if different from the values set in ServiceInformation. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData getApplicationConfigurationData() {
        return applicationConfigurationData;
    }


    /**
     * Sets the applicationConfigurationData value for this BankcardTransaction.
     * 
     * @param applicationConfigurationData   * <summary>
     *             Details about the way this application instance is configured,
     * if different from the values set in ServiceInformation. Optional.
     *             </summary>
     */
    public void setApplicationConfigurationData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData applicationConfigurationData) {
        this.applicationConfigurationData = applicationConfigurationData;
    }


    /**
     * Gets the tenderData value for this BankcardTransaction.
     * 
     * @return tenderData   * <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData getTenderData() {
        return tenderData;
    }


    /**
     * Sets the tenderData value for this BankcardTransaction.
     * 
     * @param tenderData   * <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary>
     */
    public void setTenderData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData) {
        this.tenderData = tenderData;
    }


    /**
     * Gets the transactionData value for this BankcardTransaction.
     * 
     * @return transactionData   * <summary>
     *             Contains transaction detail information. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData getTransactionData() {
        return transactionData;
    }


    /**
     * Sets the transactionData value for this BankcardTransaction.
     * 
     * @param transactionData   * <summary>
     *             Contains transaction detail information. Required.
     *             </summary>
     */
    public void setTransactionData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData transactionData) {
        this.transactionData = transactionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransaction)) return false;
        BankcardTransaction other = (BankcardTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationConfigurationData==null && other.getApplicationConfigurationData()==null) || 
             (this.applicationConfigurationData!=null &&
              this.applicationConfigurationData.equals(other.getApplicationConfigurationData()))) &&
            ((this.tenderData==null && other.getTenderData()==null) || 
             (this.tenderData!=null &&
              this.tenderData.equals(other.getTenderData()))) &&
            ((this.transactionData==null && other.getTransactionData()==null) || 
             (this.transactionData!=null &&
              this.transactionData.equals(other.getTransactionData())));
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
        if (getApplicationConfigurationData() != null) {
            _hashCode += getApplicationConfigurationData().hashCode();
        }
        if (getTenderData() != null) {
            _hashCode += getTenderData().hashCode();
        }
        if (getTransactionData() != null) {
            _hashCode += getTransactionData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationConfigurationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApplicationConfigurationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardApplicationConfigurationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TenderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTenderData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransactionData"));
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
