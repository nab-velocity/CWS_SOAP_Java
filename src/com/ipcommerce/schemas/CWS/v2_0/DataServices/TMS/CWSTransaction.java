/**
 * CWSTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             The complete transaction using the CWS object model. Conditional,
 * included if transactionDetailFormat is CWSTransaction.
 *             </summary>
 */
public class CWSTransaction  implements java.io.Serializable {
    /* <summary>
     *              Application data used for the transaction. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData;

    /* <summary>
     *              Merchant profile data used for the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantProfileMerchantData;

    /* <summary>
     *              Transaction details not represented in CWS object model.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData metaData;

    /* <summary>
     *              Transaction response details. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Response response;

    /* <summary>
     *              Transaction request details. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction;

    public CWSTransaction() {
    }

    public CWSTransaction(
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantProfileMerchantData,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData metaData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Response response,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction) {
           this.applicationData = applicationData;
           this.merchantProfileMerchantData = merchantProfileMerchantData;
           this.metaData = metaData;
           this.response = response;
           this.transaction = transaction;
    }


    /**
     * Gets the applicationData value for this CWSTransaction.
     * 
     * @return applicationData   * <summary>
     *              Application data used for the transaction. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData getApplicationData() {
        return applicationData;
    }


    /**
     * Sets the applicationData value for this CWSTransaction.
     * 
     * @param applicationData   * <summary>
     *              Application data used for the transaction. Expected.
     *             </summary>
     */
    public void setApplicationData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData) {
        this.applicationData = applicationData;
    }


    /**
     * Gets the merchantProfileMerchantData value for this CWSTransaction.
     * 
     * @return merchantProfileMerchantData   * <summary>
     *              Merchant profile data used for the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData getMerchantProfileMerchantData() {
        return merchantProfileMerchantData;
    }


    /**
     * Sets the merchantProfileMerchantData value for this CWSTransaction.
     * 
     * @param merchantProfileMerchantData   * <summary>
     *              Merchant profile data used for the transaction. Expected.
     * </summary>
     */
    public void setMerchantProfileMerchantData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantProfileMerchantData) {
        this.merchantProfileMerchantData = merchantProfileMerchantData;
    }


    /**
     * Gets the metaData value for this CWSTransaction.
     * 
     * @return metaData   * <summary>
     *              Transaction details not represented in CWS object model.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this CWSTransaction.
     * 
     * @param metaData   * <summary>
     *              Transaction details not represented in CWS object model.
     * Expected.
     *             </summary>
     */
    public void setMetaData(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the response value for this CWSTransaction.
     * 
     * @return response   * <summary>
     *              Transaction response details. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CWSTransaction.
     * 
     * @param response   * <summary>
     *              Transaction response details. Expected.
     *             </summary>
     */
    public void setResponse(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response response) {
        this.response = response;
    }


    /**
     * Gets the transaction value for this CWSTransaction.
     * 
     * @return transaction   * <summary>
     *              Transaction request details. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this CWSTransaction.
     * 
     * @param transaction   * <summary>
     *              Transaction request details. Expected.
     *             </summary>
     */
    public void setTransaction(com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction) {
        this.transaction = transaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CWSTransaction)) return false;
        CWSTransaction other = (CWSTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationData==null && other.getApplicationData()==null) || 
             (this.applicationData!=null &&
              this.applicationData.equals(other.getApplicationData()))) &&
            ((this.merchantProfileMerchantData==null && other.getMerchantProfileMerchantData()==null) || 
             (this.merchantProfileMerchantData!=null &&
              this.merchantProfileMerchantData.equals(other.getMerchantProfileMerchantData()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              this.metaData.equals(other.getMetaData()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction())));
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
        if (getApplicationData() != null) {
            _hashCode += getApplicationData().hashCode();
        }
        if (getMerchantProfileMerchantData() != null) {
            _hashCode += getMerchantProfileMerchantData().hashCode();
        }
        if (getMetaData() != null) {
            _hashCode += getMetaData().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CWSTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CWSTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ApplicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantProfileMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MerchantProfileMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "Transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"));
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
