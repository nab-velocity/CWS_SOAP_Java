/**
 * QueryTransactionsParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Provides parameters used to filter a transaction query.
 * Required.
 *             </summary>
 */
public class QueryTransactionsParameters  implements java.io.Serializable {
    /* <summary>
     *             Collection of specific transaction Amount values from
     * transaction requests. This will match the Amount authorized, returned,
     * adjusted by, or captured. Optional.
     *             </summary> */
    private java.math.BigDecimal[] amounts;

    /* <summary>
     *             Collection of specific ApprovalCode values from transaction
     * responses. Optional.
     *             </summary> */
    private java.lang.String[] approvalCodes;

    /* <summary>
     *             Collection of specific BatchId values from transaction
     * responses. Optional.
     *             </summary>
     *             <value>The batch ids.</value> */
    private java.lang.String[] batchIds;

    /* <summary>
     *             Range of transaction capture dates. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange captureDateRange;

    /* <summary>
     *             Collection of capture states. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState[] captureStates;

    /* <summary>
     *             Collection of specific CardType values from transaction
     * requests. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType[] cardTypes;

    /* <summary>
     *             Whether transaction was acknowledged. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged;

    /* <summary>
     *             Collection of specific MerchantProfileId values from transaction
     * requests. Optional.
     *             </summary> */
    private java.lang.String[] merchantProfileIds;

    /* <summary>
     *             Collection of specific OrderNumber values from transaction
     * requests. Optional.
     *             </summary> */
    private java.lang.String[] orderNumbers;

    /* <summary>
     *             Specifies the way TMS should filter when two or more parameters
     * are specified. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryType queryType;

    /* <summary>
     *             Collection of specific ServiceId values. Optional.
     *             </summary> */
    private java.lang.String[] serviceIds;

    /* <summary>
     *             Collection of specific ServiceKey values. Optional.
     *             </summary> */
    private java.lang.String[] serviceKeys;

    /* <summary>
     *             Collection of specific Transaction Class / Transaction
     * Type pairs. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair[] transactionClassTypePairs;

    /* <summary>
     *             Range of dates the transactions were processed. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange transactionDateRange;

    /* <summary>
     *             Collection of specific TransactionId values from transaction
     * responses. Optional.
     *             </summary> */
    private java.lang.String[] transactionIds;

    /* <summary>
     *             Collection of specific transaction states. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState[] transactionStates;

    public QueryTransactionsParameters() {
    }

    public QueryTransactionsParameters(
           java.math.BigDecimal[] amounts,
           java.lang.String[] approvalCodes,
           java.lang.String[] batchIds,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange captureDateRange,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState[] captureStates,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType[] cardTypes,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged,
           java.lang.String[] merchantProfileIds,
           java.lang.String[] orderNumbers,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryType queryType,
           java.lang.String[] serviceIds,
           java.lang.String[] serviceKeys,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair[] transactionClassTypePairs,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange transactionDateRange,
           java.lang.String[] transactionIds,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState[] transactionStates) {
           this.amounts = amounts;
           this.approvalCodes = approvalCodes;
           this.batchIds = batchIds;
           this.captureDateRange = captureDateRange;
           this.captureStates = captureStates;
           this.cardTypes = cardTypes;
           this.isAcknowledged = isAcknowledged;
           this.merchantProfileIds = merchantProfileIds;
           this.orderNumbers = orderNumbers;
           this.queryType = queryType;
           this.serviceIds = serviceIds;
           this.serviceKeys = serviceKeys;
           this.transactionClassTypePairs = transactionClassTypePairs;
           this.transactionDateRange = transactionDateRange;
           this.transactionIds = transactionIds;
           this.transactionStates = transactionStates;
    }


    /**
     * Gets the amounts value for this QueryTransactionsParameters.
     * 
     * @return amounts   * <summary>
     *             Collection of specific transaction Amount values from
     * transaction requests. This will match the Amount authorized, returned,
     * adjusted by, or captured. Optional.
     *             </summary>
     */
    public java.math.BigDecimal[] getAmounts() {
        return amounts;
    }


    /**
     * Sets the amounts value for this QueryTransactionsParameters.
     * 
     * @param amounts   * <summary>
     *             Collection of specific transaction Amount values from
     * transaction requests. This will match the Amount authorized, returned,
     * adjusted by, or captured. Optional.
     *             </summary>
     */
    public void setAmounts(java.math.BigDecimal[] amounts) {
        this.amounts = amounts;
    }


    /**
     * Gets the approvalCodes value for this QueryTransactionsParameters.
     * 
     * @return approvalCodes   * <summary>
     *             Collection of specific ApprovalCode values from transaction
     * responses. Optional.
     *             </summary>
     */
    public java.lang.String[] getApprovalCodes() {
        return approvalCodes;
    }


    /**
     * Sets the approvalCodes value for this QueryTransactionsParameters.
     * 
     * @param approvalCodes   * <summary>
     *             Collection of specific ApprovalCode values from transaction
     * responses. Optional.
     *             </summary>
     */
    public void setApprovalCodes(java.lang.String[] approvalCodes) {
        this.approvalCodes = approvalCodes;
    }


    /**
     * Gets the batchIds value for this QueryTransactionsParameters.
     * 
     * @return batchIds   * <summary>
     *             Collection of specific BatchId values from transaction
     * responses. Optional.
     *             </summary>
     *             <value>The batch ids.</value>
     */
    public java.lang.String[] getBatchIds() {
        return batchIds;
    }


    /**
     * Sets the batchIds value for this QueryTransactionsParameters.
     * 
     * @param batchIds   * <summary>
     *             Collection of specific BatchId values from transaction
     * responses. Optional.
     *             </summary>
     *             <value>The batch ids.</value>
     */
    public void setBatchIds(java.lang.String[] batchIds) {
        this.batchIds = batchIds;
    }


    /**
     * Gets the captureDateRange value for this QueryTransactionsParameters.
     * 
     * @return captureDateRange   * <summary>
     *             Range of transaction capture dates. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange getCaptureDateRange() {
        return captureDateRange;
    }


    /**
     * Sets the captureDateRange value for this QueryTransactionsParameters.
     * 
     * @param captureDateRange   * <summary>
     *             Range of transaction capture dates. Optional.
     *             </summary>
     */
    public void setCaptureDateRange(com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange captureDateRange) {
        this.captureDateRange = captureDateRange;
    }


    /**
     * Gets the captureStates value for this QueryTransactionsParameters.
     * 
     * @return captureStates   * <summary>
     *             Collection of capture states. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState[] getCaptureStates() {
        return captureStates;
    }


    /**
     * Sets the captureStates value for this QueryTransactionsParameters.
     * 
     * @param captureStates   * <summary>
     *             Collection of capture states. Optional.
     *             </summary>
     */
    public void setCaptureStates(com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState[] captureStates) {
        this.captureStates = captureStates;
    }


    /**
     * Gets the cardTypes value for this QueryTransactionsParameters.
     * 
     * @return cardTypes   * <summary>
     *             Collection of specific CardType values from transaction
     * requests. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType[] getCardTypes() {
        return cardTypes;
    }


    /**
     * Sets the cardTypes value for this QueryTransactionsParameters.
     * 
     * @param cardTypes   * <summary>
     *             Collection of specific CardType values from transaction
     * requests. Optional.
     *             </summary>
     */
    public void setCardTypes(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType[] cardTypes) {
        this.cardTypes = cardTypes;
    }


    /**
     * Gets the isAcknowledged value for this QueryTransactionsParameters.
     * 
     * @return isAcknowledged   * <summary>
     *             Whether transaction was acknowledged. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter getIsAcknowledged() {
        return isAcknowledged;
    }


    /**
     * Sets the isAcknowledged value for this QueryTransactionsParameters.
     * 
     * @param isAcknowledged   * <summary>
     *             Whether transaction was acknowledged. Optional.
     *             </summary>
     */
    public void setIsAcknowledged(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter isAcknowledged) {
        this.isAcknowledged = isAcknowledged;
    }


    /**
     * Gets the merchantProfileIds value for this QueryTransactionsParameters.
     * 
     * @return merchantProfileIds   * <summary>
     *             Collection of specific MerchantProfileId values from transaction
     * requests. Optional.
     *             </summary>
     */
    public java.lang.String[] getMerchantProfileIds() {
        return merchantProfileIds;
    }


    /**
     * Sets the merchantProfileIds value for this QueryTransactionsParameters.
     * 
     * @param merchantProfileIds   * <summary>
     *             Collection of specific MerchantProfileId values from transaction
     * requests. Optional.
     *             </summary>
     */
    public void setMerchantProfileIds(java.lang.String[] merchantProfileIds) {
        this.merchantProfileIds = merchantProfileIds;
    }


    /**
     * Gets the orderNumbers value for this QueryTransactionsParameters.
     * 
     * @return orderNumbers   * <summary>
     *             Collection of specific OrderNumber values from transaction
     * requests. Optional.
     *             </summary>
     */
    public java.lang.String[] getOrderNumbers() {
        return orderNumbers;
    }


    /**
     * Sets the orderNumbers value for this QueryTransactionsParameters.
     * 
     * @param orderNumbers   * <summary>
     *             Collection of specific OrderNumber values from transaction
     * requests. Optional.
     *             </summary>
     */
    public void setOrderNumbers(java.lang.String[] orderNumbers) {
        this.orderNumbers = orderNumbers;
    }


    /**
     * Gets the queryType value for this QueryTransactionsParameters.
     * 
     * @return queryType   * <summary>
     *             Specifies the way TMS should filter when two or more parameters
     * are specified. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryType getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this QueryTransactionsParameters.
     * 
     * @param queryType   * <summary>
     *             Specifies the way TMS should filter when two or more parameters
     * are specified. Required.
     *             </summary>
     */
    public void setQueryType(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryType queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the serviceIds value for this QueryTransactionsParameters.
     * 
     * @return serviceIds   * <summary>
     *             Collection of specific ServiceId values. Optional.
     *             </summary>
     */
    public java.lang.String[] getServiceIds() {
        return serviceIds;
    }


    /**
     * Sets the serviceIds value for this QueryTransactionsParameters.
     * 
     * @param serviceIds   * <summary>
     *             Collection of specific ServiceId values. Optional.
     *             </summary>
     */
    public void setServiceIds(java.lang.String[] serviceIds) {
        this.serviceIds = serviceIds;
    }


    /**
     * Gets the serviceKeys value for this QueryTransactionsParameters.
     * 
     * @return serviceKeys   * <summary>
     *             Collection of specific ServiceKey values. Optional.
     *             </summary>
     */
    public java.lang.String[] getServiceKeys() {
        return serviceKeys;
    }


    /**
     * Sets the serviceKeys value for this QueryTransactionsParameters.
     * 
     * @param serviceKeys   * <summary>
     *             Collection of specific ServiceKey values. Optional.
     *             </summary>
     */
    public void setServiceKeys(java.lang.String[] serviceKeys) {
        this.serviceKeys = serviceKeys;
    }


    /**
     * Gets the transactionClassTypePairs value for this QueryTransactionsParameters.
     * 
     * @return transactionClassTypePairs   * <summary>
     *             Collection of specific Transaction Class / Transaction
     * Type pairs. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair[] getTransactionClassTypePairs() {
        return transactionClassTypePairs;
    }


    /**
     * Sets the transactionClassTypePairs value for this QueryTransactionsParameters.
     * 
     * @param transactionClassTypePairs   * <summary>
     *             Collection of specific Transaction Class / Transaction
     * Type pairs. Optional.
     *             </summary>
     */
    public void setTransactionClassTypePairs(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair[] transactionClassTypePairs) {
        this.transactionClassTypePairs = transactionClassTypePairs;
    }


    /**
     * Gets the transactionDateRange value for this QueryTransactionsParameters.
     * 
     * @return transactionDateRange   * <summary>
     *             Range of dates the transactions were processed. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange getTransactionDateRange() {
        return transactionDateRange;
    }


    /**
     * Sets the transactionDateRange value for this QueryTransactionsParameters.
     * 
     * @param transactionDateRange   * <summary>
     *             Range of dates the transactions were processed. Optional.
     * </summary>
     */
    public void setTransactionDateRange(com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange transactionDateRange) {
        this.transactionDateRange = transactionDateRange;
    }


    /**
     * Gets the transactionIds value for this QueryTransactionsParameters.
     * 
     * @return transactionIds   * <summary>
     *             Collection of specific TransactionId values from transaction
     * responses. Optional.
     *             </summary>
     */
    public java.lang.String[] getTransactionIds() {
        return transactionIds;
    }


    /**
     * Sets the transactionIds value for this QueryTransactionsParameters.
     * 
     * @param transactionIds   * <summary>
     *             Collection of specific TransactionId values from transaction
     * responses. Optional.
     *             </summary>
     */
    public void setTransactionIds(java.lang.String[] transactionIds) {
        this.transactionIds = transactionIds;
    }


    /**
     * Gets the transactionStates value for this QueryTransactionsParameters.
     * 
     * @return transactionStates   * <summary>
     *             Collection of specific transaction states. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState[] getTransactionStates() {
        return transactionStates;
    }


    /**
     * Sets the transactionStates value for this QueryTransactionsParameters.
     * 
     * @param transactionStates   * <summary>
     *             Collection of specific transaction states. Optional.
     *             </summary>
     */
    public void setTransactionStates(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState[] transactionStates) {
        this.transactionStates = transactionStates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTransactionsParameters)) return false;
        QueryTransactionsParameters other = (QueryTransactionsParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amounts==null && other.getAmounts()==null) || 
             (this.amounts!=null &&
              java.util.Arrays.equals(this.amounts, other.getAmounts()))) &&
            ((this.approvalCodes==null && other.getApprovalCodes()==null) || 
             (this.approvalCodes!=null &&
              java.util.Arrays.equals(this.approvalCodes, other.getApprovalCodes()))) &&
            ((this.batchIds==null && other.getBatchIds()==null) || 
             (this.batchIds!=null &&
              java.util.Arrays.equals(this.batchIds, other.getBatchIds()))) &&
            ((this.captureDateRange==null && other.getCaptureDateRange()==null) || 
             (this.captureDateRange!=null &&
              this.captureDateRange.equals(other.getCaptureDateRange()))) &&
            ((this.captureStates==null && other.getCaptureStates()==null) || 
             (this.captureStates!=null &&
              java.util.Arrays.equals(this.captureStates, other.getCaptureStates()))) &&
            ((this.cardTypes==null && other.getCardTypes()==null) || 
             (this.cardTypes!=null &&
              java.util.Arrays.equals(this.cardTypes, other.getCardTypes()))) &&
            ((this.isAcknowledged==null && other.getIsAcknowledged()==null) || 
             (this.isAcknowledged!=null &&
              this.isAcknowledged.equals(other.getIsAcknowledged()))) &&
            ((this.merchantProfileIds==null && other.getMerchantProfileIds()==null) || 
             (this.merchantProfileIds!=null &&
              java.util.Arrays.equals(this.merchantProfileIds, other.getMerchantProfileIds()))) &&
            ((this.orderNumbers==null && other.getOrderNumbers()==null) || 
             (this.orderNumbers!=null &&
              java.util.Arrays.equals(this.orderNumbers, other.getOrderNumbers()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.serviceIds==null && other.getServiceIds()==null) || 
             (this.serviceIds!=null &&
              java.util.Arrays.equals(this.serviceIds, other.getServiceIds()))) &&
            ((this.serviceKeys==null && other.getServiceKeys()==null) || 
             (this.serviceKeys!=null &&
              java.util.Arrays.equals(this.serviceKeys, other.getServiceKeys()))) &&
            ((this.transactionClassTypePairs==null && other.getTransactionClassTypePairs()==null) || 
             (this.transactionClassTypePairs!=null &&
              java.util.Arrays.equals(this.transactionClassTypePairs, other.getTransactionClassTypePairs()))) &&
            ((this.transactionDateRange==null && other.getTransactionDateRange()==null) || 
             (this.transactionDateRange!=null &&
              this.transactionDateRange.equals(other.getTransactionDateRange()))) &&
            ((this.transactionIds==null && other.getTransactionIds()==null) || 
             (this.transactionIds!=null &&
              java.util.Arrays.equals(this.transactionIds, other.getTransactionIds()))) &&
            ((this.transactionStates==null && other.getTransactionStates()==null) || 
             (this.transactionStates!=null &&
              java.util.Arrays.equals(this.transactionStates, other.getTransactionStates())));
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
        if (getAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBatchIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaptureDateRange() != null) {
            _hashCode += getCaptureDateRange().hashCode();
        }
        if (getCaptureStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaptureStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaptureStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAcknowledged() != null) {
            _hashCode += getIsAcknowledged().hashCode();
        }
        if (getMerchantProfileIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantProfileIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantProfileIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getServiceIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionClassTypePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionClassTypePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionClassTypePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDateRange() != null) {
            _hashCode += getTransactionDateRange().hashCode();
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
        if (getTransactionStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionStates(), i);
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
        new org.apache.axis.description.TypeDesc(QueryTransactionsParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Amounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "decimal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ApprovalCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureStates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CardTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAcknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "IsAcknowledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BooleanParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantProfileIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MerchantProfileIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "OrderNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionClassTypePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DateRange"));
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
        elemField.setFieldName("transactionStates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
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
