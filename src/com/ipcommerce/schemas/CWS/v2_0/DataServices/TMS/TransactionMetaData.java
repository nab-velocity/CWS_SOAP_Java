/**
 * TransactionMetaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains transaction details not represented in the CWS
 * object model. Expected.
 *             </summary>
 */
public class TransactionMetaData  implements java.io.Serializable {
    /* <summary>
     *             The transaction amount. Expected.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             The card type used for the transaction. Expected.
     *             </summary> */
    private java.lang.String cardType;

    /* <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary> */
    private java.lang.String maskedPAN;

    /* <summary>
     *              Sequence number of the transaction. Expected.
     *             </summary> */
    private java.lang.String sequenceNumber;

    /* <summary>
     *              The Id of the service used for the transaction. Expected.
     * </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             The Transaction class and type of the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair;

    /* <summary>
     *             The date and time the transaction was submitted, in UTC.
     * Expected.
     *             </summary> */
    private java.util.Calendar transactionDateTime;

    /* <summary>
     *             The Transaction Id of the transaction. Expected.
     *             </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState;

    /* <summary>
     *              Identifies the workflow used for the transaction. Expected.
     * </summary> */
    private java.lang.String workflowId;

    public TransactionMetaData() {
    }

    public TransactionMetaData(
           java.math.BigDecimal amount,
           java.lang.String cardType,
           java.lang.String maskedPAN,
           java.lang.String sequenceNumber,
           java.lang.String serviceId,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair,
           java.util.Calendar transactionDateTime,
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.String workflowId) {
           this.amount = amount;
           this.cardType = cardType;
           this.maskedPAN = maskedPAN;
           this.sequenceNumber = sequenceNumber;
           this.serviceId = serviceId;
           this.transactionClassTypePair = transactionClassTypePair;
           this.transactionDateTime = transactionDateTime;
           this.transactionId = transactionId;
           this.transactionState = transactionState;
           this.workflowId = workflowId;
    }


    /**
     * Gets the amount value for this TransactionMetaData.
     * 
     * @return amount   * <summary>
     *             The transaction amount. Expected.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionMetaData.
     * 
     * @param amount   * <summary>
     *             The transaction amount. Expected.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardType value for this TransactionMetaData.
     * 
     * @return cardType   * <summary>
     *             The card type used for the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this TransactionMetaData.
     * 
     * @param cardType   * <summary>
     *             The card type used for the transaction. Expected.
     *             </summary>
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the maskedPAN value for this TransactionMetaData.
     * 
     * @return maskedPAN   * <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary>
     */
    public java.lang.String getMaskedPAN() {
        return maskedPAN;
    }


    /**
     * Sets the maskedPAN value for this TransactionMetaData.
     * 
     * @param maskedPAN   * <summary>
     *             The cardholder's PAN in masked format. Expected.
     *             </summary>
     */
    public void setMaskedPAN(java.lang.String maskedPAN) {
        this.maskedPAN = maskedPAN;
    }


    /**
     * Gets the sequenceNumber value for this TransactionMetaData.
     * 
     * @return sequenceNumber   * <summary>
     *              Sequence number of the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this TransactionMetaData.
     * 
     * @param sequenceNumber   * <summary>
     *              Sequence number of the transaction. Expected.
     *             </summary>
     */
    public void setSequenceNumber(java.lang.String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the serviceId value for this TransactionMetaData.
     * 
     * @return serviceId   * <summary>
     *              The Id of the service used for the transaction. Expected.
     * </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this TransactionMetaData.
     * 
     * @param serviceId   * <summary>
     *              The Id of the service used for the transaction. Expected.
     * </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the transactionClassTypePair value for this TransactionMetaData.
     * 
     * @return transactionClassTypePair   * <summary>
     *             The Transaction class and type of the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair getTransactionClassTypePair() {
        return transactionClassTypePair;
    }


    /**
     * Sets the transactionClassTypePair value for this TransactionMetaData.
     * 
     * @param transactionClassTypePair   * <summary>
     *             The Transaction class and type of the transaction. Expected.
     * </summary>
     */
    public void setTransactionClassTypePair(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair transactionClassTypePair) {
        this.transactionClassTypePair = transactionClassTypePair;
    }


    /**
     * Gets the transactionDateTime value for this TransactionMetaData.
     * 
     * @return transactionDateTime   * <summary>
     *             The date and time the transaction was submitted, in UTC.
     * Expected.
     *             </summary>
     */
    public java.util.Calendar getTransactionDateTime() {
        return transactionDateTime;
    }


    /**
     * Sets the transactionDateTime value for this TransactionMetaData.
     * 
     * @param transactionDateTime   * <summary>
     *             The date and time the transaction was submitted, in UTC.
     * Expected.
     *             </summary>
     */
    public void setTransactionDateTime(java.util.Calendar transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }


    /**
     * Gets the transactionId value for this TransactionMetaData.
     * 
     * @return transactionId   * <summary>
     *             The Transaction Id of the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransactionMetaData.
     * 
     * @param transactionId   * <summary>
     *             The Transaction Id of the transaction. Expected.
     *             </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionState value for this TransactionMetaData.
     * 
     * @return transactionState   * <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getTransactionState() {
        return transactionState;
    }


    /**
     * Sets the transactionState value for this TransactionMetaData.
     * 
     * @param transactionState   * <summary>
     *             Indicates the current state of the transaction. Expected.
     * </summary>
     */
    public void setTransactionState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        this.transactionState = transactionState;
    }


    /**
     * Gets the workflowId value for this TransactionMetaData.
     * 
     * @return workflowId   * <summary>
     *              Identifies the workflow used for the transaction. Expected.
     * </summary>
     */
    public java.lang.String getWorkflowId() {
        return workflowId;
    }


    /**
     * Sets the workflowId value for this TransactionMetaData.
     * 
     * @param workflowId   * <summary>
     *              Identifies the workflow used for the transaction. Expected.
     * </summary>
     */
    public void setWorkflowId(java.lang.String workflowId) {
        this.workflowId = workflowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionMetaData)) return false;
        TransactionMetaData other = (TransactionMetaData) obj;
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
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.maskedPAN==null && other.getMaskedPAN()==null) || 
             (this.maskedPAN!=null &&
              this.maskedPAN.equals(other.getMaskedPAN()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.transactionClassTypePair==null && other.getTransactionClassTypePair()==null) || 
             (this.transactionClassTypePair!=null &&
              this.transactionClassTypePair.equals(other.getTransactionClassTypePair()))) &&
            ((this.transactionDateTime==null && other.getTransactionDateTime()==null) || 
             (this.transactionDateTime!=null &&
              this.transactionDateTime.equals(other.getTransactionDateTime()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionState==null && other.getTransactionState()==null) || 
             (this.transactionState!=null &&
              this.transactionState.equals(other.getTransactionState()))) &&
            ((this.workflowId==null && other.getWorkflowId()==null) || 
             (this.workflowId!=null &&
              this.workflowId.equals(other.getWorkflowId())));
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
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getMaskedPAN() != null) {
            _hashCode += getMaskedPAN().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getTransactionClassTypePair() != null) {
            _hashCode += getTransactionClassTypePair().hashCode();
        }
        if (getTransactionDateTime() != null) {
            _hashCode += getTransactionDateTime().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionState() != null) {
            _hashCode += getTransactionState().hashCode();
        }
        if (getWorkflowId() != null) {
            _hashCode += getWorkflowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionMetaData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MaskedPAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionClassTypePair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "WorkflowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
