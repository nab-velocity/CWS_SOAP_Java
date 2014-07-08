/**
 * PINlessDebitData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Collection of transaction details related to PINless Debit
 * cards. Conditional, optional when processing a recurring or installment
 * MOTO or Ecommerce transaction with a PIN Debit card without entering
 * a PIN.
 *             </summary>
 */
public class PINlessDebitData  implements java.io.Serializable {
    /* <summary>
     *             Specifies the bill payment service name and address for
     * PINless Debit bill payment.  Conditional, required if different from
     * merchant name and address.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData billPayServiceData;

    /* <summary>
     *             Specifies the payee information for PINless Debit bill
     * payment.  Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.PayeeData payeeData;

    public PINlessDebitData() {
    }

    public PINlessDebitData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData billPayServiceData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.PayeeData payeeData) {
           this.billPayServiceData = billPayServiceData;
           this.payeeData = payeeData;
    }


    /**
     * Gets the billPayServiceData value for this PINlessDebitData.
     * 
     * @return billPayServiceData   * <summary>
     *             Specifies the bill payment service name and address for
     * PINless Debit bill payment.  Conditional, required if different from
     * merchant name and address.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData getBillPayServiceData() {
        return billPayServiceData;
    }


    /**
     * Sets the billPayServiceData value for this PINlessDebitData.
     * 
     * @param billPayServiceData   * <summary>
     *             Specifies the bill payment service name and address for
     * PINless Debit bill payment.  Conditional, required if different from
     * merchant name and address.
     *             </summary>
     */
    public void setBillPayServiceData(com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData billPayServiceData) {
        this.billPayServiceData = billPayServiceData;
    }


    /**
     * Gets the payeeData value for this PINlessDebitData.
     * 
     * @return payeeData   * <summary>
     *             Specifies the payee information for PINless Debit bill
     * payment.  Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.PayeeData getPayeeData() {
        return payeeData;
    }


    /**
     * Sets the payeeData value for this PINlessDebitData.
     * 
     * @param payeeData   * <summary>
     *             Specifies the payee information for PINless Debit bill
     * payment.  Required.
     *             </summary>
     */
    public void setPayeeData(com.ipcommerce.schemas.CWS.v2_0.Transactions.PayeeData payeeData) {
        this.payeeData = payeeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PINlessDebitData)) return false;
        PINlessDebitData other = (PINlessDebitData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPayServiceData==null && other.getBillPayServiceData()==null) || 
             (this.billPayServiceData!=null &&
              this.billPayServiceData.equals(other.getBillPayServiceData()))) &&
            ((this.payeeData==null && other.getPayeeData()==null) || 
             (this.payeeData!=null &&
              this.payeeData.equals(other.getPayeeData())));
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
        if (getBillPayServiceData() != null) {
            _hashCode += getBillPayServiceData().hashCode();
        }
        if (getPayeeData() != null) {
            _hashCode += getPayeeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PINlessDebitData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PINlessDebitData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPayServiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillPayServiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillPayServiceData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payeeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PayeeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PayeeData"));
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
