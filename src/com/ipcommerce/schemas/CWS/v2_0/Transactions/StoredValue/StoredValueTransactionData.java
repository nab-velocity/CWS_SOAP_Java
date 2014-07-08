/**
 * StoredValueTransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Contains information about the Stored Value transaction
 * data. Required.
 *             </summary>
 */
public class StoredValueTransactionData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionData  implements java.io.Serializable {
    /* <summary>
     *             The Employee Identifier. Required.
     *             </summary> */
    private java.lang.String employeeId;

    /* <summary>
     *             The industry type of the transaction. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType;

    /* <summary>
     *             Tip amount. Optional.
     *             </summary> */
    private java.math.BigDecimal tipAmount;

    /* <summary>
     *             Currency code as defined by the International Standards
     * Organization (ISO). Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 tenderCurrencyCode;

    /* <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary> */
    private java.lang.String cardRestrictionValue;

    /* <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode;

    /* <summary>
     *             Specifies if Authorize should unload remaining balance.
     * Optional.
     *             </summary> */
    private java.lang.Boolean unload;

    /* <summary>
     *             Specifies card status for status update. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus;

    /* <summary>
     *             Indicates the operation type for ManageAccount. Conditional,
     * required if processing ManageAccount.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType;

    /* <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary> */
    private java.lang.String orderNumber;

    public StoredValueTransactionData() {
    }

    public StoredValueTransactionData(
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode,
           java.lang.String transactionDateTime,
           java.lang.String campaignId,
           java.lang.String reference,
           java.lang.String employeeId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType,
           java.math.BigDecimal tipAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 tenderCurrencyCode,
           java.lang.String cardRestrictionValue,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode,
           java.lang.Boolean unload,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType,
           java.lang.String orderNumber) {
        super(
            amount,
            currencyCode,
            transactionDateTime,
            campaignId,
            reference);
        this.employeeId = employeeId;
        this.industryType = industryType;
        this.tipAmount = tipAmount;
        this.tenderCurrencyCode = tenderCurrencyCode;
        this.cardRestrictionValue = cardRestrictionValue;
        this.entryMode = entryMode;
        this.unload = unload;
        this.cardStatus = cardStatus;
        this.operationType = operationType;
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the employeeId value for this StoredValueTransactionData.
     * 
     * @return employeeId   * <summary>
     *             The Employee Identifier. Required.
     *             </summary>
     */
    public java.lang.String getEmployeeId() {
        return employeeId;
    }


    /**
     * Sets the employeeId value for this StoredValueTransactionData.
     * 
     * @param employeeId   * <summary>
     *             The Employee Identifier. Required.
     *             </summary>
     */
    public void setEmployeeId(java.lang.String employeeId) {
        this.employeeId = employeeId;
    }


    /**
     * Gets the industryType value for this StoredValueTransactionData.
     * 
     * @return industryType   * <summary>
     *             The industry type of the transaction. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this StoredValueTransactionData.
     * 
     * @param industryType   * <summary>
     *             The industry type of the transaction. Required.
     *             </summary>
     */
    public void setIndustryType(com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the tipAmount value for this StoredValueTransactionData.
     * 
     * @return tipAmount   * <summary>
     *             Tip amount. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getTipAmount() {
        return tipAmount;
    }


    /**
     * Sets the tipAmount value for this StoredValueTransactionData.
     * 
     * @param tipAmount   * <summary>
     *             Tip amount. Optional.
     *             </summary>
     */
    public void setTipAmount(java.math.BigDecimal tipAmount) {
        this.tipAmount = tipAmount;
    }


    /**
     * Gets the tenderCurrencyCode value for this StoredValueTransactionData.
     * 
     * @return tenderCurrencyCode   * <summary>
     *             Currency code as defined by the International Standards
     * Organization (ISO). Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 getTenderCurrencyCode() {
        return tenderCurrencyCode;
    }


    /**
     * Sets the tenderCurrencyCode value for this StoredValueTransactionData.
     * 
     * @param tenderCurrencyCode   * <summary>
     *             Currency code as defined by the International Standards
     * Organization (ISO). Required.
     *             </summary>
     */
    public void setTenderCurrencyCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 tenderCurrencyCode) {
        this.tenderCurrencyCode = tenderCurrencyCode;
    }


    /**
     * Gets the cardRestrictionValue value for this StoredValueTransactionData.
     * 
     * @return cardRestrictionValue   * <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary>
     */
    public java.lang.String getCardRestrictionValue() {
        return cardRestrictionValue;
    }


    /**
     * Sets the cardRestrictionValue value for this StoredValueTransactionData.
     * 
     * @param cardRestrictionValue   * <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary>
     */
    public void setCardRestrictionValue(java.lang.String cardRestrictionValue) {
        this.cardRestrictionValue = cardRestrictionValue;
    }


    /**
     * Gets the entryMode value for this StoredValueTransactionData.
     * 
     * @return entryMode   * <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode getEntryMode() {
        return entryMode;
    }


    /**
     * Sets the entryMode value for this StoredValueTransactionData.
     * 
     * @param entryMode   * <summary>
     *             Indicates how the cardholder data was retrieved. When
     * authorizing with stored card data, either locally or with CardDataToken,
     * indicate that the card data was manually collected (keyed or one of
     * its variants). Required.
     *             </summary>
     */
    public void setEntryMode(com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode) {
        this.entryMode = entryMode;
    }


    /**
     * Gets the unload value for this StoredValueTransactionData.
     * 
     * @return unload   * <summary>
     *             Specifies if Authorize should unload remaining balance.
     * Optional.
     *             </summary>
     */
    public java.lang.Boolean getUnload() {
        return unload;
    }


    /**
     * Sets the unload value for this StoredValueTransactionData.
     * 
     * @param unload   * <summary>
     *             Specifies if Authorize should unload remaining balance.
     * Optional.
     *             </summary>
     */
    public void setUnload(java.lang.Boolean unload) {
        this.unload = unload;
    }


    /**
     * Gets the cardStatus value for this StoredValueTransactionData.
     * 
     * @return cardStatus   * <summary>
     *             Specifies card status for status update. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this StoredValueTransactionData.
     * 
     * @param cardStatus   * <summary>
     *             Specifies card status for status update. Optional.
     *             </summary>
     */
    public void setCardStatus(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the operationType value for this StoredValueTransactionData.
     * 
     * @return operationType   * <summary>
     *             Indicates the operation type for ManageAccount. Conditional,
     * required if processing ManageAccount.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this StoredValueTransactionData.
     * 
     * @param operationType   * <summary>
     *             Indicates the operation type for ManageAccount. Conditional,
     * required if processing ManageAccount.
     *             </summary>
     */
    public void setOperationType(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the orderNumber value for this StoredValueTransactionData.
     * 
     * @return orderNumber   * <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary>
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this StoredValueTransactionData.
     * 
     * @param orderNumber   * <summary>
     *             Order number as assigned by the merchant. Required.
     *             </summary>
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueTransactionData)) return false;
        StoredValueTransactionData other = (StoredValueTransactionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.employeeId==null && other.getEmployeeId()==null) || 
             (this.employeeId!=null &&
              this.employeeId.equals(other.getEmployeeId()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.tipAmount==null && other.getTipAmount()==null) || 
             (this.tipAmount!=null &&
              this.tipAmount.equals(other.getTipAmount()))) &&
            ((this.tenderCurrencyCode==null && other.getTenderCurrencyCode()==null) || 
             (this.tenderCurrencyCode!=null &&
              this.tenderCurrencyCode.equals(other.getTenderCurrencyCode()))) &&
            ((this.cardRestrictionValue==null && other.getCardRestrictionValue()==null) || 
             (this.cardRestrictionValue!=null &&
              this.cardRestrictionValue.equals(other.getCardRestrictionValue()))) &&
            ((this.entryMode==null && other.getEntryMode()==null) || 
             (this.entryMode!=null &&
              this.entryMode.equals(other.getEntryMode()))) &&
            ((this.unload==null && other.getUnload()==null) || 
             (this.unload!=null &&
              this.unload.equals(other.getUnload()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber())));
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
        if (getEmployeeId() != null) {
            _hashCode += getEmployeeId().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getTipAmount() != null) {
            _hashCode += getTipAmount().hashCode();
        }
        if (getTenderCurrencyCode() != null) {
            _hashCode += getTenderCurrencyCode().hashCode();
        }
        if (getCardRestrictionValue() != null) {
            _hashCode += getCardRestrictionValue().hashCode();
        }
        if (getEntryMode() != null) {
            _hashCode += getEntryMode().hashCode();
        }
        if (getUnload() != null) {
            _hashCode += getUnload().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueTransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "EmployeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IndustryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "IndustryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "TipAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "TenderCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCurrencyCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardRestrictionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardRestrictionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "EntryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "EntryMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Unload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OperationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OrderNumber"));
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
