/**
 * ElectronicCheckingTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ElectronicCheckingTransactionResponse  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Response  implements java.io.Serializable {
    /* <summary>
     *             Indicates if the customer's account will accept ACH transactions.
     * Returned only on QueryAccount transactions. Optional.
     *             </summary> */
    private java.lang.Boolean ACHCapable;

    /* <summary>
     *             Indicates the amount of the transaction. Optional.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             A code provided when a transaction is approved. Optional.
     * </summary> */
    private java.lang.String approvalCode;

    /* <summary>
     *             Indicates the corrected account number that should be
     * used for electronic check processing. Optional.
     *             </summary> */
    private java.lang.String modifiedAccountNumber;

    /* <summary>
     *             Indicates the corrected 9-digit Bank Routing number that
     * should be used for electronic check processing. Optional.
     *             </summary> */
    private java.lang.String modifiedRoutingNumber;

    /* <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary> */
    private java.lang.String paymentAccountDataToken;

    /* <summary>
     *             Contains information indicating why the transaction was
     * returned. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ReturnInformation returnInformation;

    /* <summary>
     *             TxnCode returned from SP. Optional.
     *             </summary> */
    private java.lang.String rspTxnCode;

    /* <summary>
     *             The date the transaction was submitted to the bank. Optional.
     * </summary> */
    private java.util.Calendar submitDate;

    public ElectronicCheckingTransactionResponse() {
    }

    public ElectronicCheckingTransactionResponse(
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
           java.lang.Boolean ACHCapable,
           java.math.BigDecimal amount,
           java.lang.String approvalCode,
           java.lang.String modifiedAccountNumber,
           java.lang.String modifiedRoutingNumber,
           java.lang.String paymentAccountDataToken,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ReturnInformation returnInformation,
           java.lang.String rspTxnCode,
           java.util.Calendar submitDate) {
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
        this.ACHCapable = ACHCapable;
        this.amount = amount;
        this.approvalCode = approvalCode;
        this.modifiedAccountNumber = modifiedAccountNumber;
        this.modifiedRoutingNumber = modifiedRoutingNumber;
        this.paymentAccountDataToken = paymentAccountDataToken;
        this.returnInformation = returnInformation;
        this.rspTxnCode = rspTxnCode;
        this.submitDate = submitDate;
    }


    /**
     * Gets the ACHCapable value for this ElectronicCheckingTransactionResponse.
     * 
     * @return ACHCapable   * <summary>
     *             Indicates if the customer's account will accept ACH transactions.
     * Returned only on QueryAccount transactions. Optional.
     *             </summary>
     */
    public java.lang.Boolean getACHCapable() {
        return ACHCapable;
    }


    /**
     * Sets the ACHCapable value for this ElectronicCheckingTransactionResponse.
     * 
     * @param ACHCapable   * <summary>
     *             Indicates if the customer's account will accept ACH transactions.
     * Returned only on QueryAccount transactions. Optional.
     *             </summary>
     */
    public void setACHCapable(java.lang.Boolean ACHCapable) {
        this.ACHCapable = ACHCapable;
    }


    /**
     * Gets the amount value for this ElectronicCheckingTransactionResponse.
     * 
     * @return amount   * <summary>
     *             Indicates the amount of the transaction. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ElectronicCheckingTransactionResponse.
     * 
     * @param amount   * <summary>
     *             Indicates the amount of the transaction. Optional.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the approvalCode value for this ElectronicCheckingTransactionResponse.
     * 
     * @return approvalCode   * <summary>
     *             A code provided when a transaction is approved. Optional.
     * </summary>
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this ElectronicCheckingTransactionResponse.
     * 
     * @param approvalCode   * <summary>
     *             A code provided when a transaction is approved. Optional.
     * </summary>
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the modifiedAccountNumber value for this ElectronicCheckingTransactionResponse.
     * 
     * @return modifiedAccountNumber   * <summary>
     *             Indicates the corrected account number that should be
     * used for electronic check processing. Optional.
     *             </summary>
     */
    public java.lang.String getModifiedAccountNumber() {
        return modifiedAccountNumber;
    }


    /**
     * Sets the modifiedAccountNumber value for this ElectronicCheckingTransactionResponse.
     * 
     * @param modifiedAccountNumber   * <summary>
     *             Indicates the corrected account number that should be
     * used for electronic check processing. Optional.
     *             </summary>
     */
    public void setModifiedAccountNumber(java.lang.String modifiedAccountNumber) {
        this.modifiedAccountNumber = modifiedAccountNumber;
    }


    /**
     * Gets the modifiedRoutingNumber value for this ElectronicCheckingTransactionResponse.
     * 
     * @return modifiedRoutingNumber   * <summary>
     *             Indicates the corrected 9-digit Bank Routing number that
     * should be used for electronic check processing. Optional.
     *             </summary>
     */
    public java.lang.String getModifiedRoutingNumber() {
        return modifiedRoutingNumber;
    }


    /**
     * Sets the modifiedRoutingNumber value for this ElectronicCheckingTransactionResponse.
     * 
     * @param modifiedRoutingNumber   * <summary>
     *             Indicates the corrected 9-digit Bank Routing number that
     * should be used for electronic check processing. Optional.
     *             </summary>
     */
    public void setModifiedRoutingNumber(java.lang.String modifiedRoutingNumber) {
        this.modifiedRoutingNumber = modifiedRoutingNumber;
    }


    /**
     * Gets the paymentAccountDataToken value for this ElectronicCheckingTransactionResponse.
     * 
     * @return paymentAccountDataToken   * <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary>
     */
    public java.lang.String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }


    /**
     * Sets the paymentAccountDataToken value for this ElectronicCheckingTransactionResponse.
     * 
     * @param paymentAccountDataToken   * <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary>
     */
    public void setPaymentAccountDataToken(java.lang.String paymentAccountDataToken) {
        this.paymentAccountDataToken = paymentAccountDataToken;
    }


    /**
     * Gets the returnInformation value for this ElectronicCheckingTransactionResponse.
     * 
     * @return returnInformation   * <summary>
     *             Contains information indicating why the transaction was
     * returned. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ReturnInformation getReturnInformation() {
        return returnInformation;
    }


    /**
     * Sets the returnInformation value for this ElectronicCheckingTransactionResponse.
     * 
     * @param returnInformation   * <summary>
     *             Contains information indicating why the transaction was
     * returned. Optional.
     *             </summary>
     */
    public void setReturnInformation(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ReturnInformation returnInformation) {
        this.returnInformation = returnInformation;
    }


    /**
     * Gets the rspTxnCode value for this ElectronicCheckingTransactionResponse.
     * 
     * @return rspTxnCode   * <summary>
     *             TxnCode returned from SP. Optional.
     *             </summary>
     */
    public java.lang.String getRspTxnCode() {
        return rspTxnCode;
    }


    /**
     * Sets the rspTxnCode value for this ElectronicCheckingTransactionResponse.
     * 
     * @param rspTxnCode   * <summary>
     *             TxnCode returned from SP. Optional.
     *             </summary>
     */
    public void setRspTxnCode(java.lang.String rspTxnCode) {
        this.rspTxnCode = rspTxnCode;
    }


    /**
     * Gets the submitDate value for this ElectronicCheckingTransactionResponse.
     * 
     * @return submitDate   * <summary>
     *             The date the transaction was submitted to the bank. Optional.
     * </summary>
     */
    public java.util.Calendar getSubmitDate() {
        return submitDate;
    }


    /**
     * Sets the submitDate value for this ElectronicCheckingTransactionResponse.
     * 
     * @param submitDate   * <summary>
     *             The date the transaction was submitted to the bank. Optional.
     * </summary>
     */
    public void setSubmitDate(java.util.Calendar submitDate) {
        this.submitDate = submitDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingTransactionResponse)) return false;
        ElectronicCheckingTransactionResponse other = (ElectronicCheckingTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACHCapable==null && other.getACHCapable()==null) || 
             (this.ACHCapable!=null &&
              this.ACHCapable.equals(other.getACHCapable()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.modifiedAccountNumber==null && other.getModifiedAccountNumber()==null) || 
             (this.modifiedAccountNumber!=null &&
              this.modifiedAccountNumber.equals(other.getModifiedAccountNumber()))) &&
            ((this.modifiedRoutingNumber==null && other.getModifiedRoutingNumber()==null) || 
             (this.modifiedRoutingNumber!=null &&
              this.modifiedRoutingNumber.equals(other.getModifiedRoutingNumber()))) &&
            ((this.paymentAccountDataToken==null && other.getPaymentAccountDataToken()==null) || 
             (this.paymentAccountDataToken!=null &&
              this.paymentAccountDataToken.equals(other.getPaymentAccountDataToken()))) &&
            ((this.returnInformation==null && other.getReturnInformation()==null) || 
             (this.returnInformation!=null &&
              this.returnInformation.equals(other.getReturnInformation()))) &&
            ((this.rspTxnCode==null && other.getRspTxnCode()==null) || 
             (this.rspTxnCode!=null &&
              this.rspTxnCode.equals(other.getRspTxnCode()))) &&
            ((this.submitDate==null && other.getSubmitDate()==null) || 
             (this.submitDate!=null &&
              this.submitDate.equals(other.getSubmitDate())));
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
        if (getACHCapable() != null) {
            _hashCode += getACHCapable().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getModifiedAccountNumber() != null) {
            _hashCode += getModifiedAccountNumber().hashCode();
        }
        if (getModifiedRoutingNumber() != null) {
            _hashCode += getModifiedRoutingNumber().hashCode();
        }
        if (getPaymentAccountDataToken() != null) {
            _hashCode += getPaymentAccountDataToken().hashCode();
        }
        if (getReturnInformation() != null) {
            _hashCode += getReturnInformation().hashCode();
        }
        if (getRspTxnCode() != null) {
            _hashCode += getRspTxnCode().hashCode();
        }
        if (getSubmitDate() != null) {
            _hashCode += getSubmitDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ACHCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ApprovalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ModifiedAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ModifiedRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAccountDataToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "PaymentAccountDataToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspTxnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "RspTxnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "SubmitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
