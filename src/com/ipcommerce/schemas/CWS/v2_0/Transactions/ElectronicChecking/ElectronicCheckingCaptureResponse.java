/**
 * ElectronicCheckingCaptureResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ElectronicCheckingCaptureResponse  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Response  implements java.io.Serializable {
    /* <summary>
     *             Summary information (item count and total amount) for
     * the captured transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData;

    public ElectronicCheckingCaptureResponse() {
    }

    public ElectronicCheckingCaptureResponse(
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
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData) {
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
            reference);
        this.summaryData = summaryData;
    }


    /**
     * Gets the summaryData value for this ElectronicCheckingCaptureResponse.
     * 
     * @return summaryData   * <summary>
     *             Summary information (item count and total amount) for
     * the captured transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData getSummaryData() {
        return summaryData;
    }


    /**
     * Sets the summaryData value for this ElectronicCheckingCaptureResponse.
     * 
     * @param summaryData   * <summary>
     *             Summary information (item count and total amount) for
     * the captured transactions. Required.
     *             </summary>
     */
    public void setSummaryData(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData) {
        this.summaryData = summaryData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingCaptureResponse)) return false;
        ElectronicCheckingCaptureResponse other = (ElectronicCheckingCaptureResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.summaryData==null && other.getSummaryData()==null) || 
             (this.summaryData!=null &&
              this.summaryData.equals(other.getSummaryData())));
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
        if (getSummaryData() != null) {
            _hashCode += getSummaryData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingCaptureResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCaptureResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "SummaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryData"));
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
