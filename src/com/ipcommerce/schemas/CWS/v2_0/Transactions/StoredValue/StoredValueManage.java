/**
 * StoredValueManage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Stored Value udpdate data for building Deactivate, Status,
 * Reload and BalanceTransfer from Activate.
 *             </summary>
 */
public class StoredValueManage  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage  implements java.io.Serializable {
    /* <summary>
     *             The amount to be reloaded on the card.  Conditional required
     * if processing Reload.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Card data for the source account. Conditional, required
     * if processing Balance Transfer.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData;

    /* <summary>
     *             Specifies card status for status update. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus;

    /* <summary>
     *             Specifies cash out deactivation. Optional.
     *             </summary> */
    private java.lang.Boolean isCashOut;

    /* <summary>
     *             Indicates the opertion type for ManageAccount.  Conditional,
     * required if processing ManageAccount.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType;

    public StoredValueManage() {
    }

    public StoredValueManage(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus,
           java.lang.Boolean isCashOut,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType) {
        super(
            transactionId,
            addendum);
        this.amount = amount;
        this.sourceCardData = sourceCardData;
        this.cardStatus = cardStatus;
        this.isCashOut = isCashOut;
        this.operationType = operationType;
    }


    /**
     * Gets the amount value for this StoredValueManage.
     * 
     * @return amount   * <summary>
     *             The amount to be reloaded on the card.  Conditional required
     * if processing Reload.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this StoredValueManage.
     * 
     * @param amount   * <summary>
     *             The amount to be reloaded on the card.  Conditional required
     * if processing Reload.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the sourceCardData value for this StoredValueManage.
     * 
     * @return sourceCardData   * <summary>
     *             Card data for the source account. Conditional, required
     * if processing Balance Transfer.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData getSourceCardData() {
        return sourceCardData;
    }


    /**
     * Sets the sourceCardData value for this StoredValueManage.
     * 
     * @param sourceCardData   * <summary>
     *             Card data for the source account. Conditional, required
     * if processing Balance Transfer.
     *             </summary>
     */
    public void setSourceCardData(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData sourceCardData) {
        this.sourceCardData = sourceCardData;
    }


    /**
     * Gets the cardStatus value for this StoredValueManage.
     * 
     * @return cardStatus   * <summary>
     *             Specifies card status for status update. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this StoredValueManage.
     * 
     * @param cardStatus   * <summary>
     *             Specifies card status for status update. Optional.
     *             </summary>
     */
    public void setCardStatus(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the isCashOut value for this StoredValueManage.
     * 
     * @return isCashOut   * <summary>
     *             Specifies cash out deactivation. Optional.
     *             </summary>
     */
    public java.lang.Boolean getIsCashOut() {
        return isCashOut;
    }


    /**
     * Sets the isCashOut value for this StoredValueManage.
     * 
     * @param isCashOut   * <summary>
     *             Specifies cash out deactivation. Optional.
     *             </summary>
     */
    public void setIsCashOut(java.lang.Boolean isCashOut) {
        this.isCashOut = isCashOut;
    }


    /**
     * Gets the operationType value for this StoredValueManage.
     * 
     * @return operationType   * <summary>
     *             Indicates the opertion type for ManageAccount.  Conditional,
     * required if processing ManageAccount.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this StoredValueManage.
     * 
     * @param operationType   * <summary>
     *             Indicates the opertion type for ManageAccount.  Conditional,
     * required if processing ManageAccount.
     *             </summary>
     */
    public void setOperationType(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueManage)) return false;
        StoredValueManage other = (StoredValueManage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.sourceCardData==null && other.getSourceCardData()==null) || 
             (this.sourceCardData!=null &&
              this.sourceCardData.equals(other.getSourceCardData()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.isCashOut==null && other.getIsCashOut()==null) || 
             (this.isCashOut!=null &&
              this.isCashOut.equals(other.getIsCashOut()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSourceCardData() != null) {
            _hashCode += getSourceCardData().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getIsCashOut() != null) {
            _hashCode += getIsCashOut().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueManage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueManage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCardData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "SourceCardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCashOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IsCashOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
