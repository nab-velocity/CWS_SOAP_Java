/**
 * BankcardCaptureResponsePro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;


/**
 * <summary>
 *             Response to capturing Bankcard Pro transactions. Expected.
 * </summary>
 */
public class BankcardCaptureResponsePro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardCaptureResponse  implements java.io.Serializable {
    public BankcardCaptureResponsePro() {
    }

    public BankcardCaptureResponsePro(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status,
           java.lang.String statusCode,
           java.lang.String statusMessage,
           java.lang.String transactionId,
           java.lang.String originatorTransactionId,
           java.lang.String serviceTransactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.Boolean isAcknowledged,
           java.lang.String reference,
           java.lang.String batchId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData transactionSummaryData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard prepaidCard) {
        super(
            status,
            statusCode,
            statusMessage,
            transactionId,
            originatorTransactionId,
            serviceTransactionId,
            serviceTransactionDateTime,
            addendum,
            captureState,
            transactionState,
            isAcknowledged,
            reference,
            batchId,
            industryType,
            transactionSummaryData,
            prepaidCard);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardCaptureResponsePro)) return false;
        BankcardCaptureResponsePro other = (BankcardCaptureResponsePro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardCaptureResponsePro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCaptureResponsePro"));
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
