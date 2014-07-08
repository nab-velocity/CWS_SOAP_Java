/**
 * BankcardTransactionDataPro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;

public class BankcardTransactionDataPro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData  implements java.io.Serializable {
    /* <summary>
     *             Configuration to setup and perform an automated recurring
     * payment on the behalf of the merchant. Conditional, optional if ManagedBilling
     * (ServiceInformation) = 'true', otherwise not present.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBilling managedBilling;

    /* <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' or 'Level3'.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data;

    /* <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if Service Information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails;

    /* <summary>
     *             Collection of transaction details related to PINless Debit
     * cards. Conditional, optional when processing a recurring or installment
     * MOTO or Ecommerce transaction with a PIN Debit card without entering
     * a PIN.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.PINlessDebitData PINlessDebitData;

    /* <summary>
     *             Inventory Information Approval System (IIAS) data including
     * amounts for FSA eligible items.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASData IIASData;

    public BankcardTransactionDataPro() {
    }

    public BankcardTransactionDataPro(
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3 currencyCode,
           java.lang.String transactionDateTime,
           java.lang.String campaignId,
           java.lang.String reference,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType accountType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData alternativeMerchantData,
           java.lang.String approvalCode,
           java.math.BigDecimal cashBackAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent customerPresent,
           java.lang.String employeeId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode entryMode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType goodsType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType industryType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData internetTransactionData,
           java.lang.String invoiceNumber,
           java.lang.String orderNumber,
           java.lang.Boolean isPartialShipment,
           java.lang.Boolean signatureCaptured,
           java.math.BigDecimal feeAmount,
           java.lang.String terminalId,
           java.lang.String laneId,
           java.math.BigDecimal tipAmount,
           java.lang.String batchAssignment,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType partialApprovalCapable,
           java.lang.String scoreThreshold,
           java.lang.Boolean isQuasiCash,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBilling managedBilling,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.PINlessDebitData PINlessDebitData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASData IIASData) {
        super(
            amount,
            currencyCode,
            transactionDateTime,
            campaignId,
            reference,
            accountType,
            alternativeMerchantData,
            approvalCode,
            cashBackAmount,
            customerPresent,
            employeeId,
            entryMode,
            goodsType,
            industryType,
            internetTransactionData,
            invoiceNumber,
            orderNumber,
            isPartialShipment,
            signatureCaptured,
            feeAmount,
            terminalId,
            laneId,
            tipAmount,
            batchAssignment,
            partialApprovalCapable,
            scoreThreshold,
            isQuasiCash,
            transactionCode);
        this.managedBilling = managedBilling;
        this.level2Data = level2Data;
        this.lineItemDetails = lineItemDetails;
        this.PINlessDebitData = PINlessDebitData;
        this.IIASData = IIASData;
    }


    /**
     * Gets the managedBilling value for this BankcardTransactionDataPro.
     * 
     * @return managedBilling   * <summary>
     *             Configuration to setup and perform an automated recurring
     * payment on the behalf of the merchant. Conditional, optional if ManagedBilling
     * (ServiceInformation) = 'true', otherwise not present.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBilling getManagedBilling() {
        return managedBilling;
    }


    /**
     * Sets the managedBilling value for this BankcardTransactionDataPro.
     * 
     * @param managedBilling   * <summary>
     *             Configuration to setup and perform an automated recurring
     * payment on the behalf of the merchant. Conditional, optional if ManagedBilling
     * (ServiceInformation) = 'true', otherwise not present.
     *             </summary>
     */
    public void setManagedBilling(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBilling managedBilling) {
        this.managedBilling = managedBilling;
    }


    /**
     * Gets the level2Data value for this BankcardTransactionDataPro.
     * 
     * @return level2Data   * <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' or 'Level3'.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data getLevel2Data() {
        return level2Data;
    }


    /**
     * Sets the level2Data value for this BankcardTransactionDataPro.
     * 
     * @param level2Data   * <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' or 'Level3'.
     *             </summary>
     */
    public void setLevel2Data(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data) {
        this.level2Data = level2Data;
    }


    /**
     * Gets the lineItemDetails value for this BankcardTransactionDataPro.
     * 
     * @return lineItemDetails   * <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if Service Information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] getLineItemDetails() {
        return lineItemDetails;
    }


    /**
     * Sets the lineItemDetails value for this BankcardTransactionDataPro.
     * 
     * @param lineItemDetails   * <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if Service Information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary>
     */
    public void setLineItemDetails(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails) {
        this.lineItemDetails = lineItemDetails;
    }


    /**
     * Gets the PINlessDebitData value for this BankcardTransactionDataPro.
     * 
     * @return PINlessDebitData   * <summary>
     *             Collection of transaction details related to PINless Debit
     * cards. Conditional, optional when processing a recurring or installment
     * MOTO or Ecommerce transaction with a PIN Debit card without entering
     * a PIN.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.PINlessDebitData getPINlessDebitData() {
        return PINlessDebitData;
    }


    /**
     * Sets the PINlessDebitData value for this BankcardTransactionDataPro.
     * 
     * @param PINlessDebitData   * <summary>
     *             Collection of transaction details related to PINless Debit
     * cards. Conditional, optional when processing a recurring or installment
     * MOTO or Ecommerce transaction with a PIN Debit card without entering
     * a PIN.
     *             </summary>
     */
    public void setPINlessDebitData(com.ipcommerce.schemas.CWS.v2_0.Transactions.PINlessDebitData PINlessDebitData) {
        this.PINlessDebitData = PINlessDebitData;
    }


    /**
     * Gets the IIASData value for this BankcardTransactionDataPro.
     * 
     * @return IIASData   * <summary>
     *             Inventory Information Approval System (IIAS) data including
     * amounts for FSA eligible items.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASData getIIASData() {
        return IIASData;
    }


    /**
     * Sets the IIASData value for this BankcardTransactionDataPro.
     * 
     * @param IIASData   * <summary>
     *             Inventory Information Approval System (IIAS) data including
     * amounts for FSA eligible items.
     *             </summary>
     */
    public void setIIASData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASData IIASData) {
        this.IIASData = IIASData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransactionDataPro)) return false;
        BankcardTransactionDataPro other = (BankcardTransactionDataPro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.managedBilling==null && other.getManagedBilling()==null) || 
             (this.managedBilling!=null &&
              this.managedBilling.equals(other.getManagedBilling()))) &&
            ((this.level2Data==null && other.getLevel2Data()==null) || 
             (this.level2Data!=null &&
              this.level2Data.equals(other.getLevel2Data()))) &&
            ((this.lineItemDetails==null && other.getLineItemDetails()==null) || 
             (this.lineItemDetails!=null &&
              java.util.Arrays.equals(this.lineItemDetails, other.getLineItemDetails()))) &&
            ((this.PINlessDebitData==null && other.getPINlessDebitData()==null) || 
             (this.PINlessDebitData!=null &&
              this.PINlessDebitData.equals(other.getPINlessDebitData()))) &&
            ((this.IIASData==null && other.getIIASData()==null) || 
             (this.IIASData!=null &&
              this.IIASData.equals(other.getIIASData())));
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
        if (getManagedBilling() != null) {
            _hashCode += getManagedBilling().hashCode();
        }
        if (getLevel2Data() != null) {
            _hashCode += getLevel2Data().hashCode();
        }
        if (getLineItemDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPINlessDebitData() != null) {
            _hashCode += getPINlessDebitData().hashCode();
        }
        if (getIIASData() != null) {
            _hashCode += getIIASData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransactionDataPro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionDataPro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "ManagedBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ManagedBilling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level2Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "Level2Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Level2Data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "LineItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINlessDebitData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "PINlessDebitData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PINlessDebitData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIASData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "IIASData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASData"));
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
