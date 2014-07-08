/**
 * TransactionSummaryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Summary information (item count and total amount) when
 * transactions are captured. Required.
 *             </summary>
 */
public class TransactionSummaryData  implements java.io.Serializable {
    /* <summary>
     *             The sum of all PIN Debit transaction cash back amounts
     * included in the batch. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals cashBackTotals;

    /* <summary>
     *             Total count and net amount of transactions for the entire
     * batch independent of transaction class. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals netTotals;

    /* <summary>
     *             Total count and amount of returns for the entire batch
     * independent of transaction class. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals returnTotals;

    /* <summary>
     *             Total count and amount of sales for the entire batch independent
     * of transaction class. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals saleTotals;

    /* <summary>
     *             Total count and amount of voids for the entire batch independent
     * of transaction class. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals voidTotals;

    /* <summary>
     *             Total count and amount of PIN Debit returns. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitReturnTotals;

    /* <summary>
     *             Total count and amount of PIN Debit sales. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitSaleTotals;

    public TransactionSummaryData() {
    }

    public TransactionSummaryData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals cashBackTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals netTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals returnTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals saleTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals voidTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitReturnTotals,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitSaleTotals) {
           this.cashBackTotals = cashBackTotals;
           this.netTotals = netTotals;
           this.returnTotals = returnTotals;
           this.saleTotals = saleTotals;
           this.voidTotals = voidTotals;
           this.PINDebitReturnTotals = PINDebitReturnTotals;
           this.PINDebitSaleTotals = PINDebitSaleTotals;
    }


    /**
     * Gets the cashBackTotals value for this TransactionSummaryData.
     * 
     * @return cashBackTotals   * <summary>
     *             The sum of all PIN Debit transaction cash back amounts
     * included in the batch. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getCashBackTotals() {
        return cashBackTotals;
    }


    /**
     * Sets the cashBackTotals value for this TransactionSummaryData.
     * 
     * @param cashBackTotals   * <summary>
     *             The sum of all PIN Debit transaction cash back amounts
     * included in the batch. Optional.
     *             </summary>
     */
    public void setCashBackTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals cashBackTotals) {
        this.cashBackTotals = cashBackTotals;
    }


    /**
     * Gets the netTotals value for this TransactionSummaryData.
     * 
     * @return netTotals   * <summary>
     *             Total count and net amount of transactions for the entire
     * batch independent of transaction class. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getNetTotals() {
        return netTotals;
    }


    /**
     * Sets the netTotals value for this TransactionSummaryData.
     * 
     * @param netTotals   * <summary>
     *             Total count and net amount of transactions for the entire
     * batch independent of transaction class. Expected.
     *             </summary>
     */
    public void setNetTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals netTotals) {
        this.netTotals = netTotals;
    }


    /**
     * Gets the returnTotals value for this TransactionSummaryData.
     * 
     * @return returnTotals   * <summary>
     *             Total count and amount of returns for the entire batch
     * independent of transaction class. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getReturnTotals() {
        return returnTotals;
    }


    /**
     * Sets the returnTotals value for this TransactionSummaryData.
     * 
     * @param returnTotals   * <summary>
     *             Total count and amount of returns for the entire batch
     * independent of transaction class. Optional.
     *             </summary>
     */
    public void setReturnTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals returnTotals) {
        this.returnTotals = returnTotals;
    }


    /**
     * Gets the saleTotals value for this TransactionSummaryData.
     * 
     * @return saleTotals   * <summary>
     *             Total count and amount of sales for the entire batch independent
     * of transaction class. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getSaleTotals() {
        return saleTotals;
    }


    /**
     * Sets the saleTotals value for this TransactionSummaryData.
     * 
     * @param saleTotals   * <summary>
     *             Total count and amount of sales for the entire batch independent
     * of transaction class. Optional.
     *             </summary>
     */
    public void setSaleTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals saleTotals) {
        this.saleTotals = saleTotals;
    }


    /**
     * Gets the voidTotals value for this TransactionSummaryData.
     * 
     * @return voidTotals   * <summary>
     *             Total count and amount of voids for the entire batch independent
     * of transaction class. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getVoidTotals() {
        return voidTotals;
    }


    /**
     * Sets the voidTotals value for this TransactionSummaryData.
     * 
     * @param voidTotals   * <summary>
     *             Total count and amount of voids for the entire batch independent
     * of transaction class. Optional.
     *             </summary>
     */
    public void setVoidTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals voidTotals) {
        this.voidTotals = voidTotals;
    }


    /**
     * Gets the PINDebitReturnTotals value for this TransactionSummaryData.
     * 
     * @return PINDebitReturnTotals   * <summary>
     *             Total count and amount of PIN Debit returns. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getPINDebitReturnTotals() {
        return PINDebitReturnTotals;
    }


    /**
     * Sets the PINDebitReturnTotals value for this TransactionSummaryData.
     * 
     * @param PINDebitReturnTotals   * <summary>
     *             Total count and amount of PIN Debit returns. Optional.
     * </summary>
     */
    public void setPINDebitReturnTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitReturnTotals) {
        this.PINDebitReturnTotals = PINDebitReturnTotals;
    }


    /**
     * Gets the PINDebitSaleTotals value for this TransactionSummaryData.
     * 
     * @return PINDebitSaleTotals   * <summary>
     *             Total count and amount of PIN Debit sales. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals getPINDebitSaleTotals() {
        return PINDebitSaleTotals;
    }


    /**
     * Sets the PINDebitSaleTotals value for this TransactionSummaryData.
     * 
     * @param PINDebitSaleTotals   * <summary>
     *             Total count and amount of PIN Debit sales. Optional.
     *             </summary>
     */
    public void setPINDebitSaleTotals(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals PINDebitSaleTotals) {
        this.PINDebitSaleTotals = PINDebitSaleTotals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSummaryData)) return false;
        TransactionSummaryData other = (TransactionSummaryData) obj;
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
            ((this.netTotals==null && other.getNetTotals()==null) || 
             (this.netTotals!=null &&
              this.netTotals.equals(other.getNetTotals()))) &&
            ((this.returnTotals==null && other.getReturnTotals()==null) || 
             (this.returnTotals!=null &&
              this.returnTotals.equals(other.getReturnTotals()))) &&
            ((this.saleTotals==null && other.getSaleTotals()==null) || 
             (this.saleTotals!=null &&
              this.saleTotals.equals(other.getSaleTotals()))) &&
            ((this.voidTotals==null && other.getVoidTotals()==null) || 
             (this.voidTotals!=null &&
              this.voidTotals.equals(other.getVoidTotals()))) &&
            ((this.PINDebitReturnTotals==null && other.getPINDebitReturnTotals()==null) || 
             (this.PINDebitReturnTotals!=null &&
              this.PINDebitReturnTotals.equals(other.getPINDebitReturnTotals()))) &&
            ((this.PINDebitSaleTotals==null && other.getPINDebitSaleTotals()==null) || 
             (this.PINDebitSaleTotals!=null &&
              this.PINDebitSaleTotals.equals(other.getPINDebitSaleTotals())));
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
        if (getNetTotals() != null) {
            _hashCode += getNetTotals().hashCode();
        }
        if (getReturnTotals() != null) {
            _hashCode += getReturnTotals().hashCode();
        }
        if (getSaleTotals() != null) {
            _hashCode += getSaleTotals().hashCode();
        }
        if (getVoidTotals() != null) {
            _hashCode += getVoidTotals().hashCode();
        }
        if (getPINDebitReturnTotals() != null) {
            _hashCode += getPINDebitReturnTotals().hashCode();
        }
        if (getPINDebitSaleTotals() != null) {
            _hashCode += getPINDebitSaleTotals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSummaryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionSummaryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBackTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CashBackTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "NetTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ReturnTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "SaleTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "VoidTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebitReturnTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitReturnTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebitSaleTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitSaleTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals"));
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
