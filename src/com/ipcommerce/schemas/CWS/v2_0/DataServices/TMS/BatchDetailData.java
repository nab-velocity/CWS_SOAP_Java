/**
 * BatchDetailData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Detailed data regarding the batch. Expected.
 *             </summary>
 */
public class BatchDetailData  implements java.io.Serializable {
    /* <summary>
     *             The capture date of the batch, in UTC. Expected.
     *             </summary> */
    private java.util.Calendar batchCaptureDate;

    /* <summary>
     *             The ID of the batch. Expected.
     *             </summary> */
    private java.lang.String batchId;

    /* <summary>
     *             Summary data about the transactions in the batch. Deprecated
     * - see SummaryData
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData batchSummaryData;

    /* <summary>
     *             Determines the capture state of the batch. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState;

    /* <summary>
     *             The batch description. Optional.
     *             </summary> */
    private java.lang.String description;

    /* <summary>
     *             Summary data about the transactions in the batch. 
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData;

    /* <summary>
     *             The IDs of all the transactions within the batch. Expected.
     * </summary> */
    private java.lang.String[] transactionIds;

    public BatchDetailData() {
    }

    public BatchDetailData(
           java.util.Calendar batchCaptureDate,
           java.lang.String batchId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData batchSummaryData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           java.lang.String description,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData,
           java.lang.String[] transactionIds) {
           this.batchCaptureDate = batchCaptureDate;
           this.batchId = batchId;
           this.batchSummaryData = batchSummaryData;
           this.captureState = captureState;
           this.description = description;
           this.summaryData = summaryData;
           this.transactionIds = transactionIds;
    }


    /**
     * Gets the batchCaptureDate value for this BatchDetailData.
     * 
     * @return batchCaptureDate   * <summary>
     *             The capture date of the batch, in UTC. Expected.
     *             </summary>
     */
    public java.util.Calendar getBatchCaptureDate() {
        return batchCaptureDate;
    }


    /**
     * Sets the batchCaptureDate value for this BatchDetailData.
     * 
     * @param batchCaptureDate   * <summary>
     *             The capture date of the batch, in UTC. Expected.
     *             </summary>
     */
    public void setBatchCaptureDate(java.util.Calendar batchCaptureDate) {
        this.batchCaptureDate = batchCaptureDate;
    }


    /**
     * Gets the batchId value for this BatchDetailData.
     * 
     * @return batchId   * <summary>
     *             The ID of the batch. Expected.
     *             </summary>
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this BatchDetailData.
     * 
     * @param batchId   * <summary>
     *             The ID of the batch. Expected.
     *             </summary>
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the batchSummaryData value for this BatchDetailData.
     * 
     * @return batchSummaryData   * <summary>
     *             Summary data about the transactions in the batch. Deprecated
     * - see SummaryData
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData getBatchSummaryData() {
        return batchSummaryData;
    }


    /**
     * Sets the batchSummaryData value for this BatchDetailData.
     * 
     * @param batchSummaryData   * <summary>
     *             Summary data about the transactions in the batch. Deprecated
     * - see SummaryData
     *             </summary>
     */
    public void setBatchSummaryData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData batchSummaryData) {
        this.batchSummaryData = batchSummaryData;
    }


    /**
     * Gets the captureState value for this BatchDetailData.
     * 
     * @return captureState   * <summary>
     *             Determines the capture state of the batch. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState getCaptureState() {
        return captureState;
    }


    /**
     * Sets the captureState value for this BatchDetailData.
     * 
     * @param captureState   * <summary>
     *             Determines the capture state of the batch. Expected.
     *             </summary>
     */
    public void setCaptureState(com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState) {
        this.captureState = captureState;
    }


    /**
     * Gets the description value for this BatchDetailData.
     * 
     * @return description   * <summary>
     *             The batch description. Optional.
     *             </summary>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BatchDetailData.
     * 
     * @param description   * <summary>
     *             The batch description. Optional.
     *             </summary>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the summaryData value for this BatchDetailData.
     * 
     * @return summaryData   * <summary>
     *             Summary data about the transactions in the batch. 
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData getSummaryData() {
        return summaryData;
    }


    /**
     * Sets the summaryData value for this BatchDetailData.
     * 
     * @param summaryData   * <summary>
     *             Summary data about the transactions in the batch. 
     *             </summary>
     */
    public void setSummaryData(com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData summaryData) {
        this.summaryData = summaryData;
    }


    /**
     * Gets the transactionIds value for this BatchDetailData.
     * 
     * @return transactionIds   * <summary>
     *             The IDs of all the transactions within the batch. Expected.
     * </summary>
     */
    public java.lang.String[] getTransactionIds() {
        return transactionIds;
    }


    /**
     * Sets the transactionIds value for this BatchDetailData.
     * 
     * @param transactionIds   * <summary>
     *             The IDs of all the transactions within the batch. Expected.
     * </summary>
     */
    public void setTransactionIds(java.lang.String[] transactionIds) {
        this.transactionIds = transactionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchDetailData)) return false;
        BatchDetailData other = (BatchDetailData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchCaptureDate==null && other.getBatchCaptureDate()==null) || 
             (this.batchCaptureDate!=null &&
              this.batchCaptureDate.equals(other.getBatchCaptureDate()))) &&
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.batchSummaryData==null && other.getBatchSummaryData()==null) || 
             (this.batchSummaryData!=null &&
              this.batchSummaryData.equals(other.getBatchSummaryData()))) &&
            ((this.captureState==null && other.getCaptureState()==null) || 
             (this.captureState!=null &&
              this.captureState.equals(other.getCaptureState()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.summaryData==null && other.getSummaryData()==null) || 
             (this.summaryData!=null &&
              this.summaryData.equals(other.getSummaryData()))) &&
            ((this.transactionIds==null && other.getTransactionIds()==null) || 
             (this.transactionIds!=null &&
              java.util.Arrays.equals(this.transactionIds, other.getTransactionIds())));
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
        if (getBatchCaptureDate() != null) {
            _hashCode += getBatchCaptureDate().hashCode();
        }
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getBatchSummaryData() != null) {
            _hashCode += getBatchSummaryData().hashCode();
        }
        if (getCaptureState() != null) {
            _hashCode += getCaptureState().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSummaryData() != null) {
            _hashCode += getSummaryData().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchDetailData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDetailData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchCaptureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchCaptureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSummaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchSummaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionSummaryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CaptureState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryData"));
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
