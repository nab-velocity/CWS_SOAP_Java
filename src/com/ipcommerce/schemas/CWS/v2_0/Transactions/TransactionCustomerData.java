/**
 * TransactionCustomerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains information about the customer. Conditional,
 * required by some Service Providers. If this value is set on the transaction
 * and not required by the Service Provider, the data will not be present
 * on the transaction.
 *             </summary>
 */
public class TransactionCustomerData  implements java.io.Serializable {
    /* <summary>
     *             Customer billing or home details. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo billingData;

    /* <summary>
     *             Identifier used by the merchant to identify the customer.
     * Optional. 
     *             </summary> */
    private java.lang.String customerId;

    /* <summary>
     *             Customer's federal or VAT identification number. Optional.
     * </summary> */
    private java.lang.String customerTaxId;

    /* <summary>
     *             Customer shipping details. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData;

    public TransactionCustomerData() {
    }

    public TransactionCustomerData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo billingData,
           java.lang.String customerId,
           java.lang.String customerTaxId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData) {
           this.billingData = billingData;
           this.customerId = customerId;
           this.customerTaxId = customerTaxId;
           this.shippingData = shippingData;
    }


    /**
     * Gets the billingData value for this TransactionCustomerData.
     * 
     * @return billingData   * <summary>
     *             Customer billing or home details. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo getBillingData() {
        return billingData;
    }


    /**
     * Sets the billingData value for this TransactionCustomerData.
     * 
     * @param billingData   * <summary>
     *             Customer billing or home details. Optional.
     *             </summary>
     */
    public void setBillingData(com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo billingData) {
        this.billingData = billingData;
    }


    /**
     * Gets the customerId value for this TransactionCustomerData.
     * 
     * @return customerId   * <summary>
     *             Identifier used by the merchant to identify the customer.
     * Optional. 
     *             </summary>
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this TransactionCustomerData.
     * 
     * @param customerId   * <summary>
     *             Identifier used by the merchant to identify the customer.
     * Optional. 
     *             </summary>
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerTaxId value for this TransactionCustomerData.
     * 
     * @return customerTaxId   * <summary>
     *             Customer's federal or VAT identification number. Optional.
     * </summary>
     */
    public java.lang.String getCustomerTaxId() {
        return customerTaxId;
    }


    /**
     * Sets the customerTaxId value for this TransactionCustomerData.
     * 
     * @param customerTaxId   * <summary>
     *             Customer's federal or VAT identification number. Optional.
     * </summary>
     */
    public void setCustomerTaxId(java.lang.String customerTaxId) {
        this.customerTaxId = customerTaxId;
    }


    /**
     * Gets the shippingData value for this TransactionCustomerData.
     * 
     * @return shippingData   * <summary>
     *             Customer shipping details. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo getShippingData() {
        return shippingData;
    }


    /**
     * Sets the shippingData value for this TransactionCustomerData.
     * 
     * @param shippingData   * <summary>
     *             Customer shipping details. Optional.
     *             </summary>
     */
    public void setShippingData(com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData) {
        this.shippingData = shippingData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionCustomerData)) return false;
        TransactionCustomerData other = (TransactionCustomerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingData==null && other.getBillingData()==null) || 
             (this.billingData!=null &&
              this.billingData.equals(other.getBillingData()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.customerTaxId==null && other.getCustomerTaxId()==null) || 
             (this.customerTaxId!=null &&
              this.customerTaxId.equals(other.getCustomerTaxId()))) &&
            ((this.shippingData==null && other.getShippingData()==null) || 
             (this.shippingData!=null &&
              this.shippingData.equals(other.getShippingData())));
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
        if (getBillingData() != null) {
            _hashCode += getBillingData().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCustomerTaxId() != null) {
            _hashCode += getCustomerTaxId().hashCode();
        }
        if (getShippingData() != null) {
            _hashCode += getShippingData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionCustomerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionCustomerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ShippingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerInfo"));
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
