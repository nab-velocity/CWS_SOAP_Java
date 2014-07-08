/**
 * ElectronicCheckingRejectedDetailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;

public class ElectronicCheckingRejectedDetailResponse  extends com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse  implements java.io.Serializable {
    /* <summary>
     *             Summary data about the rejected transactions. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.RejectedSummary summary;

    /* <summary>
     *             Collection of transaction details for each rejected transaction.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] transactions;

    public ElectronicCheckingRejectedDetailResponse() {
    }

    public ElectronicCheckingRejectedDetailResponse(
           java.lang.String statusCode,
           java.lang.String statusMessage,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.RejectedSummary summary,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] transactions) {
        super(
            statusCode,
            statusMessage);
        this.summary = summary;
        this.transactions = transactions;
    }


    /**
     * Gets the summary value for this ElectronicCheckingRejectedDetailResponse.
     * 
     * @return summary   * <summary>
     *             Summary data about the rejected transactions. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.RejectedSummary getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this ElectronicCheckingRejectedDetailResponse.
     * 
     * @param summary   * <summary>
     *             Summary data about the rejected transactions. Expected.
     * </summary>
     */
    public void setSummary(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.RejectedSummary summary) {
        this.summary = summary;
    }


    /**
     * Gets the transactions value for this ElectronicCheckingRejectedDetailResponse.
     * 
     * @return transactions   * <summary>
     *             Collection of transaction details for each rejected transaction.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this ElectronicCheckingRejectedDetailResponse.
     * 
     * @param transactions   * <summary>
     *             Collection of transaction details for each rejected transaction.
     * Expected.
     *             </summary>
     */
    public void setTransactions(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] transactions) {
        this.transactions = transactions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingRejectedDetailResponse)) return false;
        ElectronicCheckingRejectedDetailResponse other = (ElectronicCheckingRejectedDetailResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions())));
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
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingRejectedDetailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckingRejectedDetailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "RejectedSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail"));
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
