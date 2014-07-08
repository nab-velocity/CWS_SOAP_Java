/**
 * Transaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class Transaction  implements java.io.Serializable {
    private java.lang.String relayResponseUrl;

    /* <summary>
     *             Details about the customer. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData;

    /* <summary>
     *             Additional data to be printed on reports. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData;

    /* <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum;

    public Transaction() {
    }

    public Transaction(
           java.lang.String relayResponseUrl,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
           this.relayResponseUrl = relayResponseUrl;
           this.customerData = customerData;
           this.reportingData = reportingData;
           this.addendum = addendum;
    }


    /**
     * Gets the relayResponseUrl value for this Transaction.
     * 
     * @return relayResponseUrl
     */
    public java.lang.String getRelayResponseUrl() {
        return relayResponseUrl;
    }


    /**
     * Sets the relayResponseUrl value for this Transaction.
     * 
     * @param relayResponseUrl
     */
    public void setRelayResponseUrl(java.lang.String relayResponseUrl) {
        this.relayResponseUrl = relayResponseUrl;
    }


    /**
     * Gets the customerData value for this Transaction.
     * 
     * @return customerData   * <summary>
     *             Details about the customer. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData getCustomerData() {
        return customerData;
    }


    /**
     * Sets the customerData value for this Transaction.
     * 
     * @param customerData   * <summary>
     *             Details about the customer. Optional.
     *             </summary>
     */
    public void setCustomerData(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData customerData) {
        this.customerData = customerData;
    }


    /**
     * Gets the reportingData value for this Transaction.
     * 
     * @return reportingData   * <summary>
     *             Additional data to be printed on reports. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData getReportingData() {
        return reportingData;
    }


    /**
     * Sets the reportingData value for this Transaction.
     * 
     * @param reportingData   * <summary>
     *             Additional data to be printed on reports. Optional.
     *             </summary>
     */
    public void setReportingData(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData reportingData) {
        this.reportingData = reportingData;
    }


    /**
     * Gets the addendum value for this Transaction.
     * 
     * @return addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum getAddendum() {
        return addendum;
    }


    /**
     * Sets the addendum value for this Transaction.
     * 
     * @param addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public void setAddendum(com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
        this.addendum = addendum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaction)) return false;
        Transaction other = (Transaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relayResponseUrl==null && other.getRelayResponseUrl()==null) || 
             (this.relayResponseUrl!=null &&
              this.relayResponseUrl.equals(other.getRelayResponseUrl()))) &&
            ((this.customerData==null && other.getCustomerData()==null) || 
             (this.customerData!=null &&
              this.customerData.equals(other.getCustomerData()))) &&
            ((this.reportingData==null && other.getReportingData()==null) || 
             (this.reportingData!=null &&
              this.reportingData.equals(other.getReportingData()))) &&
            ((this.addendum==null && other.getAddendum()==null) || 
             (this.addendum!=null &&
              this.addendum.equals(other.getAddendum())));
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
        if (getRelayResponseUrl() != null) {
            _hashCode += getRelayResponseUrl().hashCode();
        }
        if (getCustomerData() != null) {
            _hashCode += getCustomerData().hashCode();
        }
        if (getReportingData() != null) {
            _hashCode += getReportingData().hashCode();
        }
        if (getAddendum() != null) {
            _hashCode += getAddendum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relayResponseUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "RelayResponseUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionCustomerData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ReportingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionReportingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addendum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
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
