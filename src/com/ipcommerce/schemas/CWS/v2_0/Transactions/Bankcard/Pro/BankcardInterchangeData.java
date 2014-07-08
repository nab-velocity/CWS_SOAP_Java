/**
 * BankcardInterchangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;


/**
 * <summary>
 *             Details about a transaction that may lower interchange
 * rates for the transaction. Optional.
 *             </summary>
 */
public class BankcardInterchangeData  implements java.io.Serializable {
    /* <summary>
     *             Indicates that the transaction is one in a set of recurring
     * or installment transactions. Conditional, required for recurring or
     * installment transactions.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BillPayment billPayment;

    /* <summary>
     *             Request commercial card status for the transaction. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestCommercialCard requestCommercialCard;

    /* <summary>
     *             Indicates recurring or installment transaction is on existing
     * debt. Conditional, required if BillPayment is set.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ExistingDebt existingDebt;

    /* <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestACI requestACI;

    /* <summary>
     *             Number of installments in the series. Conditional, required
     * for installment transactions.
     *             </summary> */
    private java.lang.Integer totalNumberOfInstallments;

    /* <summary>
     *             Number of installment represented by this transaction.
     * Conditional, required for installment transactions.
     *             </summary> */
    private java.lang.Integer currentInstallmentNumber;

    /* <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestAdvice requestAdvice;

    public BankcardInterchangeData() {
    }

    public BankcardInterchangeData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BillPayment billPayment,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestCommercialCard requestCommercialCard,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ExistingDebt existingDebt,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestACI requestACI,
           java.lang.Integer totalNumberOfInstallments,
           java.lang.Integer currentInstallmentNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestAdvice requestAdvice) {
           this.billPayment = billPayment;
           this.requestCommercialCard = requestCommercialCard;
           this.existingDebt = existingDebt;
           this.requestACI = requestACI;
           this.totalNumberOfInstallments = totalNumberOfInstallments;
           this.currentInstallmentNumber = currentInstallmentNumber;
           this.requestAdvice = requestAdvice;
    }


    /**
     * Gets the billPayment value for this BankcardInterchangeData.
     * 
     * @return billPayment   * <summary>
     *             Indicates that the transaction is one in a set of recurring
     * or installment transactions. Conditional, required for recurring or
     * installment transactions.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BillPayment getBillPayment() {
        return billPayment;
    }


    /**
     * Sets the billPayment value for this BankcardInterchangeData.
     * 
     * @param billPayment   * <summary>
     *             Indicates that the transaction is one in a set of recurring
     * or installment transactions. Conditional, required for recurring or
     * installment transactions.
     *             </summary>
     */
    public void setBillPayment(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BillPayment billPayment) {
        this.billPayment = billPayment;
    }


    /**
     * Gets the requestCommercialCard value for this BankcardInterchangeData.
     * 
     * @return requestCommercialCard   * <summary>
     *             Request commercial card status for the transaction. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestCommercialCard getRequestCommercialCard() {
        return requestCommercialCard;
    }


    /**
     * Sets the requestCommercialCard value for this BankcardInterchangeData.
     * 
     * @param requestCommercialCard   * <summary>
     *             Request commercial card status for the transaction. Optional.
     * </summary>
     */
    public void setRequestCommercialCard(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestCommercialCard requestCommercialCard) {
        this.requestCommercialCard = requestCommercialCard;
    }


    /**
     * Gets the existingDebt value for this BankcardInterchangeData.
     * 
     * @return existingDebt   * <summary>
     *             Indicates recurring or installment transaction is on existing
     * debt. Conditional, required if BillPayment is set.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ExistingDebt getExistingDebt() {
        return existingDebt;
    }


    /**
     * Sets the existingDebt value for this BankcardInterchangeData.
     * 
     * @param existingDebt   * <summary>
     *             Indicates recurring or installment transaction is on existing
     * debt. Conditional, required if BillPayment is set.
     *             </summary>
     */
    public void setExistingDebt(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ExistingDebt existingDebt) {
        this.existingDebt = existingDebt;
    }


    /**
     * Gets the requestACI value for this BankcardInterchangeData.
     * 
     * @return requestACI   * <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestACI getRequestACI() {
        return requestACI;
    }


    /**
     * Sets the requestACI value for this BankcardInterchangeData.
     * 
     * @param requestACI   * <summary>
     *             Authorization Characteristics Indicator. Identifies the
     * request as potentially qualifying for the Visa CPS or MasterCard Merit
     * programs. Optional.
     *             </summary>
     */
    public void setRequestACI(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestACI requestACI) {
        this.requestACI = requestACI;
    }


    /**
     * Gets the totalNumberOfInstallments value for this BankcardInterchangeData.
     * 
     * @return totalNumberOfInstallments   * <summary>
     *             Number of installments in the series. Conditional, required
     * for installment transactions.
     *             </summary>
     */
    public java.lang.Integer getTotalNumberOfInstallments() {
        return totalNumberOfInstallments;
    }


    /**
     * Sets the totalNumberOfInstallments value for this BankcardInterchangeData.
     * 
     * @param totalNumberOfInstallments   * <summary>
     *             Number of installments in the series. Conditional, required
     * for installment transactions.
     *             </summary>
     */
    public void setTotalNumberOfInstallments(java.lang.Integer totalNumberOfInstallments) {
        this.totalNumberOfInstallments = totalNumberOfInstallments;
    }


    /**
     * Gets the currentInstallmentNumber value for this BankcardInterchangeData.
     * 
     * @return currentInstallmentNumber   * <summary>
     *             Number of installment represented by this transaction.
     * Conditional, required for installment transactions.
     *             </summary>
     */
    public java.lang.Integer getCurrentInstallmentNumber() {
        return currentInstallmentNumber;
    }


    /**
     * Sets the currentInstallmentNumber value for this BankcardInterchangeData.
     * 
     * @param currentInstallmentNumber   * <summary>
     *             Number of installment represented by this transaction.
     * Conditional, required for installment transactions.
     *             </summary>
     */
    public void setCurrentInstallmentNumber(java.lang.Integer currentInstallmentNumber) {
        this.currentInstallmentNumber = currentInstallmentNumber;
    }


    /**
     * Gets the requestAdvice value for this BankcardInterchangeData.
     * 
     * @return requestAdvice   * <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestAdvice getRequestAdvice() {
        return requestAdvice;
    }


    /**
     * Sets the requestAdvice value for this BankcardInterchangeData.
     * 
     * @param requestAdvice   * <summary>
     *             Indicates whether to include advice on declined recurring
     * payment transactions. Optional.
     *             </summary>
     */
    public void setRequestAdvice(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestAdvice requestAdvice) {
        this.requestAdvice = requestAdvice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardInterchangeData)) return false;
        BankcardInterchangeData other = (BankcardInterchangeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPayment==null && other.getBillPayment()==null) || 
             (this.billPayment!=null &&
              this.billPayment.equals(other.getBillPayment()))) &&
            ((this.requestCommercialCard==null && other.getRequestCommercialCard()==null) || 
             (this.requestCommercialCard!=null &&
              this.requestCommercialCard.equals(other.getRequestCommercialCard()))) &&
            ((this.existingDebt==null && other.getExistingDebt()==null) || 
             (this.existingDebt!=null &&
              this.existingDebt.equals(other.getExistingDebt()))) &&
            ((this.requestACI==null && other.getRequestACI()==null) || 
             (this.requestACI!=null &&
              this.requestACI.equals(other.getRequestACI()))) &&
            ((this.totalNumberOfInstallments==null && other.getTotalNumberOfInstallments()==null) || 
             (this.totalNumberOfInstallments!=null &&
              this.totalNumberOfInstallments.equals(other.getTotalNumberOfInstallments()))) &&
            ((this.currentInstallmentNumber==null && other.getCurrentInstallmentNumber()==null) || 
             (this.currentInstallmentNumber!=null &&
              this.currentInstallmentNumber.equals(other.getCurrentInstallmentNumber()))) &&
            ((this.requestAdvice==null && other.getRequestAdvice()==null) || 
             (this.requestAdvice!=null &&
              this.requestAdvice.equals(other.getRequestAdvice())));
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
        if (getBillPayment() != null) {
            _hashCode += getBillPayment().hashCode();
        }
        if (getRequestCommercialCard() != null) {
            _hashCode += getRequestCommercialCard().hashCode();
        }
        if (getExistingDebt() != null) {
            _hashCode += getExistingDebt().hashCode();
        }
        if (getRequestACI() != null) {
            _hashCode += getRequestACI().hashCode();
        }
        if (getTotalNumberOfInstallments() != null) {
            _hashCode += getTotalNumberOfInstallments().hashCode();
        }
        if (getCurrentInstallmentNumber() != null) {
            _hashCode += getCurrentInstallmentNumber().hashCode();
        }
        if (getRequestAdvice() != null) {
            _hashCode += getRequestAdvice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardInterchangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardInterchangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BillPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BillPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestCommercialCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "RequestCommercialCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestCommercialCard"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingDebt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "ExistingDebt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ExistingDebt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestACI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "RequestACI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestACI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfInstallments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "TotalNumberOfInstallments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInstallmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "CurrentInstallmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "RequestAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestAdvice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
