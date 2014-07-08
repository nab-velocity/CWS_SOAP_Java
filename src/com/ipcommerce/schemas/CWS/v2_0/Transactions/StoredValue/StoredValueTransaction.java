/**
 * StoredValueTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;

public class StoredValueTransaction  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction  implements java.io.Serializable {
    /* <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData tenderData;

    /* <summary>
     *             Contains transaction detail information. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionData transactionData;

    public StoredValueTransaction() {
    }

    public StoredValueTransaction(
           java.lang.String relayResponseUrl,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData tenderData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionData transactionData) {
        super(
            relayResponseUrl,
            customerData,
            reportingData,
            addendum);
        this.tenderData = tenderData;
        this.transactionData = transactionData;
    }


    /**
     * Gets the tenderData value for this StoredValueTransaction.
     * 
     * @return tenderData   * <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData getTenderData() {
        return tenderData;
    }


    /**
     * Sets the tenderData value for this StoredValueTransaction.
     * 
     * @param tenderData   * <summary>
     *             Details about the card tender used for the transaction.
     * Required.
     *             </summary>
     */
    public void setTenderData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData tenderData) {
        this.tenderData = tenderData;
    }


    /**
     * Gets the transactionData value for this StoredValueTransaction.
     * 
     * @return transactionData   * <summary>
     *             Contains transaction detail information. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionData getTransactionData() {
        return transactionData;
    }


    /**
     * Sets the transactionData value for this StoredValueTransaction.
     * 
     * @param transactionData   * <summary>
     *             Contains transaction detail information. Required.
     *             </summary>
     */
    public void setTransactionData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionData transactionData) {
        this.transactionData = transactionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueTransaction)) return false;
        StoredValueTransaction other = (StoredValueTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        new org.apache.axis.description.TypeDesc(StoredValueTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "TenderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTenderData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "TransactionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionData"));
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
