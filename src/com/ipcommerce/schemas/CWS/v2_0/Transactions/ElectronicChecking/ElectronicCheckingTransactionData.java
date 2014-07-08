/**
 * ElectronicCheckingTransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;


/**
 * <summary>
 *             Contains information about the Electronic Checking transaction
 * data. Required.
 *             </summary>
 */
public class ElectronicCheckingTransactionData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionData  implements java.io.Serializable {
    /* <summary>
     *             Specifies the effective date of the transaction. Required.
     * </summary> */
    private java.util.Calendar effectiveDate;

    /* <summary>
     *             Indicates whether the transaction is recurring. Conditional,
     * required if SECCode = 'WEB'.
     *             </summary> */
    private java.lang.Boolean isRecurring;

    /* <summary>
     *             Specifies the payees email address. Optional.
     *             </summary> */
    private java.lang.String payeeEmail;

    /* <summary>
     *             Specifies the reference number used by the payer to identify
     * the payee. Required.
     *             </summary> */
    private java.lang.String payeeId;

    /* <summary>
     *             The three letter code that indicates what NACHA regulations
     * the transaction must adhere to. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.SECCode SECCode;

    /* <summary>
     *             Indicates the Electronic Checking service type: ACH, RDC
     * or ECK. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ServiceType serviceType;

    /* <summary>
     *             Indicates the transaction type. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType;

    public ElectronicCheckingTransactionData() {
    }

    public ElectronicCheckingTransactionData(
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode,
           java.lang.String transactionDateTime,
           java.lang.String campaignId,
           java.lang.String reference,
           java.util.Calendar effectiveDate,
           java.lang.Boolean isRecurring,
           java.lang.String payeeEmail,
           java.lang.String payeeId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.SECCode SECCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ServiceType serviceType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType) {
        super(
            amount,
            currencyCode,
            transactionDateTime,
            campaignId,
            reference);
        this.effectiveDate = effectiveDate;
        this.isRecurring = isRecurring;
        this.payeeEmail = payeeEmail;
        this.payeeId = payeeId;
        this.SECCode = SECCode;
        this.serviceType = serviceType;
        this.transactionType = transactionType;
    }


    /**
     * Gets the effectiveDate value for this ElectronicCheckingTransactionData.
     * 
     * @return effectiveDate   * <summary>
     *             Specifies the effective date of the transaction. Required.
     * </summary>
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ElectronicCheckingTransactionData.
     * 
     * @param effectiveDate   * <summary>
     *             Specifies the effective date of the transaction. Required.
     * </summary>
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the isRecurring value for this ElectronicCheckingTransactionData.
     * 
     * @return isRecurring   * <summary>
     *             Indicates whether the transaction is recurring. Conditional,
     * required if SECCode = 'WEB'.
     *             </summary>
     */
    public java.lang.Boolean getIsRecurring() {
        return isRecurring;
    }


    /**
     * Sets the isRecurring value for this ElectronicCheckingTransactionData.
     * 
     * @param isRecurring   * <summary>
     *             Indicates whether the transaction is recurring. Conditional,
     * required if SECCode = 'WEB'.
     *             </summary>
     */
    public void setIsRecurring(java.lang.Boolean isRecurring) {
        this.isRecurring = isRecurring;
    }


    /**
     * Gets the payeeEmail value for this ElectronicCheckingTransactionData.
     * 
     * @return payeeEmail   * <summary>
     *             Specifies the payees email address. Optional.
     *             </summary>
     */
    public java.lang.String getPayeeEmail() {
        return payeeEmail;
    }


    /**
     * Sets the payeeEmail value for this ElectronicCheckingTransactionData.
     * 
     * @param payeeEmail   * <summary>
     *             Specifies the payees email address. Optional.
     *             </summary>
     */
    public void setPayeeEmail(java.lang.String payeeEmail) {
        this.payeeEmail = payeeEmail;
    }


    /**
     * Gets the payeeId value for this ElectronicCheckingTransactionData.
     * 
     * @return payeeId   * <summary>
     *             Specifies the reference number used by the payer to identify
     * the payee. Required.
     *             </summary>
     */
    public java.lang.String getPayeeId() {
        return payeeId;
    }


    /**
     * Sets the payeeId value for this ElectronicCheckingTransactionData.
     * 
     * @param payeeId   * <summary>
     *             Specifies the reference number used by the payer to identify
     * the payee. Required.
     *             </summary>
     */
    public void setPayeeId(java.lang.String payeeId) {
        this.payeeId = payeeId;
    }


    /**
     * Gets the SECCode value for this ElectronicCheckingTransactionData.
     * 
     * @return SECCode   * <summary>
     *             The three letter code that indicates what NACHA regulations
     * the transaction must adhere to. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.SECCode getSECCode() {
        return SECCode;
    }


    /**
     * Sets the SECCode value for this ElectronicCheckingTransactionData.
     * 
     * @param SECCode   * <summary>
     *             The three letter code that indicates what NACHA regulations
     * the transaction must adhere to. Required.
     *             </summary>
     */
    public void setSECCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.SECCode SECCode) {
        this.SECCode = SECCode;
    }


    /**
     * Gets the serviceType value for this ElectronicCheckingTransactionData.
     * 
     * @return serviceType   * <summary>
     *             Indicates the Electronic Checking service type: ACH, RDC
     * or ECK. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ElectronicCheckingTransactionData.
     * 
     * @param serviceType   * <summary>
     *             Indicates the Electronic Checking service type: ACH, RDC
     * or ECK. Required.
     *             </summary>
     */
    public void setServiceType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the transactionType value for this ElectronicCheckingTransactionData.
     * 
     * @return transactionType   * <summary>
     *             Indicates the transaction type. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this ElectronicCheckingTransactionData.
     * 
     * @param transactionType   * <summary>
     *             Indicates the transaction type. Required.
     *             </summary>
     */
    public void setTransactionType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingTransactionData)) return false;
        ElectronicCheckingTransactionData other = (ElectronicCheckingTransactionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.isRecurring==null && other.getIsRecurring()==null) || 
             (this.isRecurring!=null &&
              this.isRecurring.equals(other.getIsRecurring()))) &&
            ((this.payeeEmail==null && other.getPayeeEmail()==null) || 
             (this.payeeEmail!=null &&
              this.payeeEmail.equals(other.getPayeeEmail()))) &&
            ((this.payeeId==null && other.getPayeeId()==null) || 
             (this.payeeId!=null &&
              this.payeeId.equals(other.getPayeeId()))) &&
            ((this.SECCode==null && other.getSECCode()==null) || 
             (this.SECCode!=null &&
              this.SECCode.equals(other.getSECCode()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getIsRecurring() != null) {
            _hashCode += getIsRecurring().hashCode();
        }
        if (getPayeeEmail() != null) {
            _hashCode += getPayeeEmail().hashCode();
        }
        if (getPayeeId() != null) {
            _hashCode += getPayeeId().hashCode();
        }
        if (getSECCode() != null) {
            _hashCode += getSECCode().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingTransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "IsRecurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payeeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "PayeeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "PayeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "SECCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "SECCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "TransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "TransactionType"));
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
