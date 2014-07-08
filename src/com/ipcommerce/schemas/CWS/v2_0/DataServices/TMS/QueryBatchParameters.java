/**
 * QueryBatchParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             The filter criteria used to perform transaction batch
 * queries. Required.
 *             </summary>
 */
public class QueryBatchParameters  implements java.io.Serializable {
    /* <summary>
     *             The date range (StartDate and EndDate) of the batch to
     * query. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange batchDateRange;

    /* <summary>
     *             Collection of specific BatchId values to query. Optional.
     * </summary> */
    private java.lang.String[] batchIds;

    /* <summary>
     *             Collection of specific MerchantProfileId values to query.
     * Optional.
     *             </summary> */
    private java.lang.String[] merchantProfileIds;

    /* <summary>
     *             Collection of specific ServiceKey values to query. Optional.
     * </summary> */
    private java.lang.String[] serviceKeys;

    /* <summary>
     *             Collection of specific TransactionId values to query.
     * Optional.
     *             </summary> */
    private java.lang.String[] transactionIds;

    public QueryBatchParameters() {
    }

    public QueryBatchParameters(
           com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange batchDateRange,
           java.lang.String[] batchIds,
           java.lang.String[] merchantProfileIds,
           java.lang.String[] serviceKeys,
           java.lang.String[] transactionIds) {
           this.batchDateRange = batchDateRange;
           this.batchIds = batchIds;
           this.merchantProfileIds = merchantProfileIds;
           this.serviceKeys = serviceKeys;
           this.transactionIds = transactionIds;
    }


    /**
     * Gets the batchDateRange value for this QueryBatchParameters.
     * 
     * @return batchDateRange   * <summary>
     *             The date range (StartDate and EndDate) of the batch to
     * query. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange getBatchDateRange() {
        return batchDateRange;
    }


    /**
     * Sets the batchDateRange value for this QueryBatchParameters.
     * 
     * @param batchDateRange   * <summary>
     *             The date range (StartDate and EndDate) of the batch to
     * query. Optional.
     *             </summary>
     */
    public void setBatchDateRange(com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange batchDateRange) {
        this.batchDateRange = batchDateRange;
    }


    /**
     * Gets the batchIds value for this QueryBatchParameters.
     * 
     * @return batchIds   * <summary>
     *             Collection of specific BatchId values to query. Optional.
     * </summary>
     */
    public java.lang.String[] getBatchIds() {
        return batchIds;
    }


    /**
     * Sets the batchIds value for this QueryBatchParameters.
     * 
     * @param batchIds   * <summary>
     *             Collection of specific BatchId values to query. Optional.
     * </summary>
     */
    public void setBatchIds(java.lang.String[] batchIds) {
        this.batchIds = batchIds;
    }


    /**
     * Gets the merchantProfileIds value for this QueryBatchParameters.
     * 
     * @return merchantProfileIds   * <summary>
     *             Collection of specific MerchantProfileId values to query.
     * Optional.
     *             </summary>
     */
    public java.lang.String[] getMerchantProfileIds() {
        return merchantProfileIds;
    }


    /**
     * Sets the merchantProfileIds value for this QueryBatchParameters.
     * 
     * @param merchantProfileIds   * <summary>
     *             Collection of specific MerchantProfileId values to query.
     * Optional.
     *             </summary>
     */
    public void setMerchantProfileIds(java.lang.String[] merchantProfileIds) {
        this.merchantProfileIds = merchantProfileIds;
    }


    /**
     * Gets the serviceKeys value for this QueryBatchParameters.
     * 
     * @return serviceKeys   * <summary>
     *             Collection of specific ServiceKey values to query. Optional.
     * </summary>
     */
    public java.lang.String[] getServiceKeys() {
        return serviceKeys;
    }


    /**
     * Sets the serviceKeys value for this QueryBatchParameters.
     * 
     * @param serviceKeys   * <summary>
     *             Collection of specific ServiceKey values to query. Optional.
     * </summary>
     */
    public void setServiceKeys(java.lang.String[] serviceKeys) {
        this.serviceKeys = serviceKeys;
    }


    /**
     * Gets the transactionIds value for this QueryBatchParameters.
     * 
     * @return transactionIds   * <summary>
     *             Collection of specific TransactionId values to query.
     * Optional.
     *             </summary>
     */
    public java.lang.String[] getTransactionIds() {
        return transactionIds;
    }


    /**
     * Sets the transactionIds value for this QueryBatchParameters.
     * 
     * @param transactionIds   * <summary>
     *             Collection of specific TransactionId values to query.
     * Optional.
     *             </summary>
     */
    public void setTransactionIds(java.lang.String[] transactionIds) {
        this.transactionIds = transactionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBatchParameters)) return false;
        QueryBatchParameters other = (QueryBatchParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchDateRange==null && other.getBatchDateRange()==null) || 
             (this.batchDateRange!=null &&
              this.batchDateRange.equals(other.getBatchDateRange()))) &&
            ((this.batchIds==null && other.getBatchIds()==null) || 
             (this.batchIds!=null &&
              java.util.Arrays.equals(this.batchIds, other.getBatchIds()))) &&
            ((this.merchantProfileIds==null && other.getMerchantProfileIds()==null) || 
             (this.merchantProfileIds!=null &&
              java.util.Arrays.equals(this.merchantProfileIds, other.getMerchantProfileIds()))) &&
            ((this.serviceKeys==null && other.getServiceKeys()==null) || 
             (this.serviceKeys!=null &&
              java.util.Arrays.equals(this.serviceKeys, other.getServiceKeys()))) &&
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
        if (getBatchDateRange() != null) {
            _hashCode += getBatchDateRange().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryBatchParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryBatchParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("merchantProfileIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MerchantProfileIds"));
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
