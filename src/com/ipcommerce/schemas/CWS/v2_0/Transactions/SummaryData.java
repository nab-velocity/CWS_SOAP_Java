/**
 * SummaryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Summary information for credit and debit totals. Required.
 * </summary>
 */
public class SummaryData  implements java.io.Serializable {
    /* <summary>
     *             Totals for cashback transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals cashBackTotals;

    /* <summary>
     *             Totals for returned credit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditReturnTotals;

    /* <summary>
     *             Totals for credit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditTotals;

    /* <summary>
     *             Totals for returned debit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitReturnTotals;

    /* <summary>
     *             Totals for debit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitTotals;

    /* <summary>
     *             Net totals for the batch. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals netTotals;

    /* <summary>
     *             Totals for voided transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals voidTotals;

    public SummaryData() {
    }

    public SummaryData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals cashBackTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditReturnTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitReturnTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals netTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals voidTotals) {
           this.cashBackTotals = cashBackTotals;
           this.creditReturnTotals = creditReturnTotals;
           this.creditTotals = creditTotals;
           this.debitReturnTotals = debitReturnTotals;
           this.debitTotals = debitTotals;
           this.netTotals = netTotals;
           this.voidTotals = voidTotals;
    }


    /**
     * Gets the cashBackTotals value for this SummaryData.
     * 
     * @return cashBackTotals   * <summary>
     *             Totals for cashback transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getCashBackTotals() {
        return cashBackTotals;
    }


    /**
     * Sets the cashBackTotals value for this SummaryData.
     * 
     * @param cashBackTotals   * <summary>
     *             Totals for cashback transactions. Required.
     *             </summary>
     */
    public void setCashBackTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals cashBackTotals) {
        this.cashBackTotals = cashBackTotals;
    }


    /**
     * Gets the creditReturnTotals value for this SummaryData.
     * 
     * @return creditReturnTotals   * <summary>
     *             Totals for returned credit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getCreditReturnTotals() {
        return creditReturnTotals;
    }


    /**
     * Sets the creditReturnTotals value for this SummaryData.
     * 
     * @param creditReturnTotals   * <summary>
     *             Totals for returned credit transactions. Required.
     *             </summary>
     */
    public void setCreditReturnTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditReturnTotals) {
        this.creditReturnTotals = creditReturnTotals;
    }


    /**
     * Gets the creditTotals value for this SummaryData.
     * 
     * @return creditTotals   * <summary>
     *             Totals for credit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getCreditTotals() {
        return creditTotals;
    }


    /**
     * Sets the creditTotals value for this SummaryData.
     * 
     * @param creditTotals   * <summary>
     *             Totals for credit transactions. Required.
     *             </summary>
     */
    public void setCreditTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals creditTotals) {
        this.creditTotals = creditTotals;
    }


    /**
     * Gets the debitReturnTotals value for this SummaryData.
     * 
     * @return debitReturnTotals   * <summary>
     *             Totals for returned debit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getDebitReturnTotals() {
        return debitReturnTotals;
    }


    /**
     * Sets the debitReturnTotals value for this SummaryData.
     * 
     * @param debitReturnTotals   * <summary>
     *             Totals for returned debit transactions. Required.
     *             </summary>
     */
    public void setDebitReturnTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitReturnTotals) {
        this.debitReturnTotals = debitReturnTotals;
    }


    /**
     * Gets the debitTotals value for this SummaryData.
     * 
     * @return debitTotals   * <summary>
     *             Totals for debit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getDebitTotals() {
        return debitTotals;
    }


    /**
     * Sets the debitTotals value for this SummaryData.
     * 
     * @param debitTotals   * <summary>
     *             Totals for debit transactions. Required.
     *             </summary>
     */
    public void setDebitTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals debitTotals) {
        this.debitTotals = debitTotals;
    }


    /**
     * Gets the netTotals value for this SummaryData.
     * 
     * @return netTotals   * <summary>
     *             Net totals for the batch. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getNetTotals() {
        return netTotals;
    }


    /**
     * Sets the netTotals value for this SummaryData.
     * 
     * @param netTotals   * <summary>
     *             Net totals for the batch. Required.
     *             </summary>
     */
    public void setNetTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals netTotals) {
        this.netTotals = netTotals;
    }


    /**
     * Gets the voidTotals value for this SummaryData.
     * 
     * @return voidTotals   * <summary>
     *             Totals for voided transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals getVoidTotals() {
        return voidTotals;
    }


    /**
     * Sets the voidTotals value for this SummaryData.
     * 
     * @param voidTotals   * <summary>
     *             Totals for voided transactions. Required.
     *             </summary>
     */
    public void setVoidTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals voidTotals) {
        this.voidTotals = voidTotals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SummaryData)) return false;
        SummaryData other = (SummaryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cashBackTotals==null && other.getCashBackTotals()==null) || 
             (this.cashBackTotals!=null &&
              this.cashBackTotals.equals(other.getCashBackTotals()))) &&
            ((this.creditReturnTotals==null && other.getCreditReturnTotals()==null) || 
             (this.creditReturnTotals!=null &&
              this.creditReturnTotals.equals(other.getCreditReturnTotals()))) &&
            ((this.creditTotals==null && other.getCreditTotals()==null) || 
             (this.creditTotals!=null &&
              this.creditTotals.equals(other.getCreditTotals()))) &&
            ((this.debitReturnTotals==null && other.getDebitReturnTotals()==null) || 
             (this.debitReturnTotals!=null &&
              this.debitReturnTotals.equals(other.getDebitReturnTotals()))) &&
            ((this.debitTotals==null && other.getDebitTotals()==null) || 
             (this.debitTotals!=null &&
              this.debitTotals.equals(other.getDebitTotals()))) &&
            ((this.netTotals==null && other.getNetTotals()==null) || 
             (this.netTotals!=null &&
              this.netTotals.equals(other.getNetTotals()))) &&
            ((this.voidTotals==null && other.getVoidTotals()==null) || 
             (this.voidTotals!=null &&
              this.voidTotals.equals(other.getVoidTotals())));
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
        if (getCashBackTotals() != null) {
            _hashCode += getCashBackTotals().hashCode();
        }
        if (getCreditReturnTotals() != null) {
            _hashCode += getCreditReturnTotals().hashCode();
        }
        if (getCreditTotals() != null) {
            _hashCode += getCreditTotals().hashCode();
        }
        if (getDebitReturnTotals() != null) {
            _hashCode += getDebitReturnTotals().hashCode();
        }
        if (getDebitTotals() != null) {
            _hashCode += getDebitTotals().hashCode();
        }
        if (getNetTotals() != null) {
            _hashCode += getNetTotals().hashCode();
        }
        if (getVoidTotals() != null) {
            _hashCode += getVoidTotals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SummaryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBackTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CashBackTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReturnTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CreditReturnTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CreditTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitReturnTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DebitReturnTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DebitTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "NetTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "VoidTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals"));
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
