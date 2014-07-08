/**
 * Tax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Aggregate of tax information. Optional.
 *             </summary>
 */
public class Tax  implements java.io.Serializable {
    /* <summary>
     *             Total amount of tax applied. Required.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Total tax rate. Optional.
     *             </summary> */
    private java.math.BigDecimal rate;

    /* <summary>
     *             Tax invoice number. Optional.
     *             </summary> */
    private java.lang.String invoiceNumber;

    /* <summary>
     *             Collection of itemized tax information. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax[] itemizedTaxes;

    public Tax() {
    }

    public Tax(
           java.math.BigDecimal amount,
           java.math.BigDecimal rate,
           java.lang.String invoiceNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax[] itemizedTaxes) {
           this.amount = amount;
           this.rate = rate;
           this.invoiceNumber = invoiceNumber;
           this.itemizedTaxes = itemizedTaxes;
    }


    /**
     * Gets the amount value for this Tax.
     * 
     * @return amount   * <summary>
     *             Total amount of tax applied. Required.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Tax.
     * 
     * @param amount   * <summary>
     *             Total amount of tax applied. Required.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the rate value for this Tax.
     * 
     * @return rate   * <summary>
     *             Total tax rate. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Tax.
     * 
     * @param rate   * <summary>
     *             Total tax rate. Optional.
     *             </summary>
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the invoiceNumber value for this Tax.
     * 
     * @return invoiceNumber   * <summary>
     *             Tax invoice number. Optional.
     *             </summary>
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this Tax.
     * 
     * @param invoiceNumber   * <summary>
     *             Tax invoice number. Optional.
     *             </summary>
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the itemizedTaxes value for this Tax.
     * 
     * @return itemizedTaxes   * <summary>
     *             Collection of itemized tax information. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax[] getItemizedTaxes() {
        return itemizedTaxes;
    }


    /**
     * Sets the itemizedTaxes value for this Tax.
     * 
     * @param itemizedTaxes   * <summary>
     *             Collection of itemized tax information. Optional.
     *             </summary>
     */
    public void setItemizedTaxes(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax[] itemizedTaxes) {
        this.itemizedTaxes = itemizedTaxes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tax)) return false;
        Tax other = (Tax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.itemizedTaxes==null && other.getItemizedTaxes()==null) || 
             (this.itemizedTaxes!=null &&
              java.util.Arrays.equals(this.itemizedTaxes, other.getItemizedTaxes())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getItemizedTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemizedTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemizedTaxes(), i);
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
        new org.apache.axis.description.TypeDesc(Tax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemizedTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTax"));
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
