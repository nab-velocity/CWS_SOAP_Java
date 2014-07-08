/**
 * FamilyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains detail information for the family of transactions.
 * </summary>
 */
public class FamilyDetail  implements java.io.Serializable {
    /* <summary>
     *             The Id of the batch where the original transaction was
     * captured. Expected.
     *             </summary> */
    private java.lang.String batchId;

    /* <summary>
     *             The date and time of the original capture, in UTC. Expected
     * on successfully captured transactions.
     *             </summary> */
    private java.util.Calendar captureDateTime;

    /* <summary>
     *             The amount that was captured. Expected.
     *             </summary> */
    private java.math.BigDecimal capturedAmount;

    /* <summary>
     *             The customer Id specified on the original transaction.
     * Expected if present on authorization.
     *             </summary> */
    private java.lang.String customerId;

    /* <summary>
     *             The Family Id taken from the original Transaction Id.
     * Expected.
     *             </summary> */
    private java.lang.String familyId;

    /* <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState;

    /* <summary>
     *             The most recently authorized transaction amount. Expected.
     * </summary> */
    private java.math.BigDecimal lastAuthorizedAmount;

    /* <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary> */
    private java.lang.String merchantProfileId;

    /* <summary>
     *             The net amount charged inclusive of all transactions in
     * the family. This will be negative when the transaction involves more
     * funds are moving to the cardholder than to the merchant, as would
     * be the case with a ReturnUnlinked transaction. Expected.
     *             </summary> */
    private java.math.BigDecimal netAmount;

    /* <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary> */
    private java.lang.String serviceKey;

    /* <summary>
     *             DEPRECATED: The TransactionIds property does not provide
     * enough data for processing partial returns. Please use the TransactionMetaData
     * property.
     *             </summary> */
    private java.lang.String[] transactionIds;

    /* <summary>
     *             Transaction metadata, including TransactionId, ServiceId,
     * etc. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData[] transactionMetaData;

    public FamilyDetail() {
    }

    public FamilyDetail(
           java.lang.String batchId,
           java.util.Calendar captureDateTime,
           java.math.BigDecimal capturedAmount,
           java.lang.String customerId,
           java.lang.String familyId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState,
           java.math.BigDecimal lastAuthorizedAmount,
           java.lang.String merchantProfileId,
           java.math.BigDecimal netAmount,
           java.lang.String serviceKey,
           java.lang.String[] transactionIds,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData[] transactionMetaData) {
           this.batchId = batchId;
           this.captureDateTime = captureDateTime;
           this.capturedAmount = capturedAmount;
           this.customerId = customerId;
           this.familyId = familyId;
           this.familyState = familyState;
           this.lastAuthorizedAmount = lastAuthorizedAmount;
           this.merchantProfileId = merchantProfileId;
           this.netAmount = netAmount;
           this.serviceKey = serviceKey;
           this.transactionIds = transactionIds;
           this.transactionMetaData = transactionMetaData;
    }


    /**
     * Gets the batchId value for this FamilyDetail.
     * 
     * @return batchId   * <summary>
     *             The Id of the batch where the original transaction was
     * captured. Expected.
     *             </summary>
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this FamilyDetail.
     * 
     * @param batchId   * <summary>
     *             The Id of the batch where the original transaction was
     * captured. Expected.
     *             </summary>
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the captureDateTime value for this FamilyDetail.
     * 
     * @return captureDateTime   * <summary>
     *             The date and time of the original capture, in UTC. Expected
     * on successfully captured transactions.
     *             </summary>
     */
    public java.util.Calendar getCaptureDateTime() {
        return captureDateTime;
    }


    /**
     * Sets the captureDateTime value for this FamilyDetail.
     * 
     * @param captureDateTime   * <summary>
     *             The date and time of the original capture, in UTC. Expected
     * on successfully captured transactions.
     *             </summary>
     */
    public void setCaptureDateTime(java.util.Calendar captureDateTime) {
        this.captureDateTime = captureDateTime;
    }


    /**
     * Gets the capturedAmount value for this FamilyDetail.
     * 
     * @return capturedAmount   * <summary>
     *             The amount that was captured. Expected.
     *             </summary>
     */
    public java.math.BigDecimal getCapturedAmount() {
        return capturedAmount;
    }


    /**
     * Sets the capturedAmount value for this FamilyDetail.
     * 
     * @param capturedAmount   * <summary>
     *             The amount that was captured. Expected.
     *             </summary>
     */
    public void setCapturedAmount(java.math.BigDecimal capturedAmount) {
        this.capturedAmount = capturedAmount;
    }


    /**
     * Gets the customerId value for this FamilyDetail.
     * 
     * @return customerId   * <summary>
     *             The customer Id specified on the original transaction.
     * Expected if present on authorization.
     *             </summary>
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this FamilyDetail.
     * 
     * @param customerId   * <summary>
     *             The customer Id specified on the original transaction.
     * Expected if present on authorization.
     *             </summary>
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the familyId value for this FamilyDetail.
     * 
     * @return familyId   * <summary>
     *             The Family Id taken from the original Transaction Id.
     * Expected.
     *             </summary>
     */
    public java.lang.String getFamilyId() {
        return familyId;
    }


    /**
     * Sets the familyId value for this FamilyDetail.
     * 
     * @param familyId   * <summary>
     *             The Family Id taken from the original Transaction Id.
     * Expected.
     *             </summary>
     */
    public void setFamilyId(java.lang.String familyId) {
        this.familyId = familyId;
    }


    /**
     * Gets the familyState value for this FamilyDetail.
     * 
     * @return familyState   * <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getFamilyState() {
        return familyState;
    }


    /**
     * Sets the familyState value for this FamilyDetail.
     * 
     * @param familyState   * <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary>
     */
    public void setFamilyState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState) {
        this.familyState = familyState;
    }


    /**
     * Gets the lastAuthorizedAmount value for this FamilyDetail.
     * 
     * @return lastAuthorizedAmount   * <summary>
     *             The most recently authorized transaction amount. Expected.
     * </summary>
     */
    public java.math.BigDecimal getLastAuthorizedAmount() {
        return lastAuthorizedAmount;
    }


    /**
     * Sets the lastAuthorizedAmount value for this FamilyDetail.
     * 
     * @param lastAuthorizedAmount   * <summary>
     *             The most recently authorized transaction amount. Expected.
     * </summary>
     */
    public void setLastAuthorizedAmount(java.math.BigDecimal lastAuthorizedAmount) {
        this.lastAuthorizedAmount = lastAuthorizedAmount;
    }


    /**
     * Gets the merchantProfileId value for this FamilyDetail.
     * 
     * @return merchantProfileId   * <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary>
     */
    public java.lang.String getMerchantProfileId() {
        return merchantProfileId;
    }


    /**
     * Sets the merchantProfileId value for this FamilyDetail.
     * 
     * @param merchantProfileId   * <summary>
     *             The MerchantProfileId used for the transaction. Expected.
     * </summary>
     */
    public void setMerchantProfileId(java.lang.String merchantProfileId) {
        this.merchantProfileId = merchantProfileId;
    }


    /**
     * Gets the netAmount value for this FamilyDetail.
     * 
     * @return netAmount   * <summary>
     *             The net amount charged inclusive of all transactions in
     * the family. This will be negative when the transaction involves more
     * funds are moving to the cardholder than to the merchant, as would
     * be the case with a ReturnUnlinked transaction. Expected.
     *             </summary>
     */
    public java.math.BigDecimal getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this FamilyDetail.
     * 
     * @param netAmount   * <summary>
     *             The net amount charged inclusive of all transactions in
     * the family. This will be negative when the transaction involves more
     * funds are moving to the cardholder than to the merchant, as would
     * be the case with a ReturnUnlinked transaction. Expected.
     *             </summary>
     */
    public void setNetAmount(java.math.BigDecimal netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the serviceKey value for this FamilyDetail.
     * 
     * @return serviceKey   * <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary>
     */
    public java.lang.String getServiceKey() {
        return serviceKey;
    }


    /**
     * Sets the serviceKey value for this FamilyDetail.
     * 
     * @param serviceKey   * <summary>
     *             The ServiceKey used for the transaction. Expected.
     *             </summary>
     */
    public void setServiceKey(java.lang.String serviceKey) {
        this.serviceKey = serviceKey;
    }


    /**
     * Gets the transactionIds value for this FamilyDetail.
     * 
     * @return transactionIds   * <summary>
     *             DEPRECATED: The TransactionIds property does not provide
     * enough data for processing partial returns. Please use the TransactionMetaData
     * property.
     *             </summary>
     */
    public java.lang.String[] getTransactionIds() {
        return transactionIds;
    }


    /**
     * Sets the transactionIds value for this FamilyDetail.
     * 
     * @param transactionIds   * <summary>
     *             DEPRECATED: The TransactionIds property does not provide
     * enough data for processing partial returns. Please use the TransactionMetaData
     * property.
     *             </summary>
     */
    public void setTransactionIds(java.lang.String[] transactionIds) {
        this.transactionIds = transactionIds;
    }


    /**
     * Gets the transactionMetaData value for this FamilyDetail.
     * 
     * @return transactionMetaData   * <summary>
     *             Transaction metadata, including TransactionId, ServiceId,
     * etc. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData[] getTransactionMetaData() {
        return transactionMetaData;
    }


    /**
     * Sets the transactionMetaData value for this FamilyDetail.
     * 
     * @param transactionMetaData   * <summary>
     *             Transaction metadata, including TransactionId, ServiceId,
     * etc. Expected.
     *             </summary>
     */
    public void setTransactionMetaData(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData[] transactionMetaData) {
        this.transactionMetaData = transactionMetaData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FamilyDetail)) return false;
        FamilyDetail other = (FamilyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.captureDateTime==null && other.getCaptureDateTime()==null) || 
             (this.captureDateTime!=null &&
              this.captureDateTime.equals(other.getCaptureDateTime()))) &&
            ((this.capturedAmount==null && other.getCapturedAmount()==null) || 
             (this.capturedAmount!=null &&
              this.capturedAmount.equals(other.getCapturedAmount()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.familyId==null && other.getFamilyId()==null) || 
             (this.familyId!=null &&
              this.familyId.equals(other.getFamilyId()))) &&
            ((this.familyState==null && other.getFamilyState()==null) || 
             (this.familyState!=null &&
              this.familyState.equals(other.getFamilyState()))) &&
            ((this.lastAuthorizedAmount==null && other.getLastAuthorizedAmount()==null) || 
             (this.lastAuthorizedAmount!=null &&
              this.lastAuthorizedAmount.equals(other.getLastAuthorizedAmount()))) &&
            ((this.merchantProfileId==null && other.getMerchantProfileId()==null) || 
             (this.merchantProfileId!=null &&
              this.merchantProfileId.equals(other.getMerchantProfileId()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.serviceKey==null && other.getServiceKey()==null) || 
             (this.serviceKey!=null &&
              this.serviceKey.equals(other.getServiceKey()))) &&
            ((this.transactionIds==null && other.getTransactionIds()==null) || 
             (this.transactionIds!=null &&
              java.util.Arrays.equals(this.transactionIds, other.getTransactionIds()))) &&
            ((this.transactionMetaData==null && other.getTransactionMetaData()==null) || 
             (this.transactionMetaData!=null &&
              java.util.Arrays.equals(this.transactionMetaData, other.getTransactionMetaData())));
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
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getCaptureDateTime() != null) {
            _hashCode += getCaptureDateTime().hashCode();
        }
        if (getCapturedAmount() != null) {
            _hashCode += getCapturedAmount().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getFamilyId() != null) {
            _hashCode += getFamilyId().hashCode();
        }
        if (getFamilyState() != null) {
            _hashCode += getFamilyState().hashCode();
        }
        if (getLastAuthorizedAmount() != null) {
            _hashCode += getLastAuthorizedAmount().hashCode();
        }
        if (getMerchantProfileId() != null) {
            _hashCode += getMerchantProfileId().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getServiceKey() != null) {
            _hashCode += getServiceKey().hashCode();
        }
        if (getTransactionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionMetaData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionMetaData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionMetaData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FamilyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CapturedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuthorizedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "LastAuthorizedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MerchantProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "NetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionMetaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData"));
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
