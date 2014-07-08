/**
 * MerchantProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains data specific to a merchant and the service(s)
 * for which the merchant profile will be saved. Required.
 *             </summary>
 */
public class MerchantProfile  implements java.io.Serializable {
    /* <summary>
     *             Unique identifer for the merchant profile. Referenced
     * in transaction processing operations as 'merchantProfileId'. Optional.
     * </summary> */
    private java.lang.String profileId;

    /* <summary>
     *             The service Id of the merchant's Service Provider. Conditional,
     * required when the service key supports more than one Bankcard service.
     * In this scenario, a merchant profile should be saved for each Service
     * Provider.
     *             </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             The name of the service the profile is saved for. This
     * value is returned to the client application when GetMerchantProfiles
     * is called. Required.
     *             </summary> */
    private java.lang.String serviceName;

    /* <summary>
     *             Date this merchant profile was last updated. This value
     * is returned to the client application when GetMerchantProfiles is
     * called. Required.
     *             </summary> */
    private java.util.Calendar lastUpdated;

    /* <summary>
     *             Contains general data for a merchant that will be used
     * across all service classes. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantData;

    /* <summary>
     *             Allows a merchant profile to be saved with transaction
     * data defaults. If this data will not change for each transaction,
     * there is no need to override these values on the transaction. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileTransactionData transactionData;

    public MerchantProfile() {
    }

    public MerchantProfile(
           java.lang.String profileId,
           java.lang.String serviceId,
           java.lang.String serviceName,
           java.util.Calendar lastUpdated,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantData,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileTransactionData transactionData) {
           this.profileId = profileId;
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.lastUpdated = lastUpdated;
           this.merchantData = merchantData;
           this.transactionData = transactionData;
    }


    /**
     * Gets the profileId value for this MerchantProfile.
     * 
     * @return profileId   * <summary>
     *             Unique identifer for the merchant profile. Referenced
     * in transaction processing operations as 'merchantProfileId'. Optional.
     * </summary>
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this MerchantProfile.
     * 
     * @param profileId   * <summary>
     *             Unique identifer for the merchant profile. Referenced
     * in transaction processing operations as 'merchantProfileId'. Optional.
     * </summary>
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the serviceId value for this MerchantProfile.
     * 
     * @return serviceId   * <summary>
     *             The service Id of the merchant's Service Provider. Conditional,
     * required when the service key supports more than one Bankcard service.
     * In this scenario, a merchant profile should be saved for each Service
     * Provider.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this MerchantProfile.
     * 
     * @param serviceId   * <summary>
     *             The service Id of the merchant's Service Provider. Conditional,
     * required when the service key supports more than one Bankcard service.
     * In this scenario, a merchant profile should be saved for each Service
     * Provider.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this MerchantProfile.
     * 
     * @return serviceName   * <summary>
     *             The name of the service the profile is saved for. This
     * value is returned to the client application when GetMerchantProfiles
     * is called. Required.
     *             </summary>
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this MerchantProfile.
     * 
     * @param serviceName   * <summary>
     *             The name of the service the profile is saved for. This
     * value is returned to the client application when GetMerchantProfiles
     * is called. Required.
     *             </summary>
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the lastUpdated value for this MerchantProfile.
     * 
     * @return lastUpdated   * <summary>
     *             Date this merchant profile was last updated. This value
     * is returned to the client application when GetMerchantProfiles is
     * called. Required.
     *             </summary>
     */
    public java.util.Calendar getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this MerchantProfile.
     * 
     * @param lastUpdated   * <summary>
     *             Date this merchant profile was last updated. This value
     * is returned to the client application when GetMerchantProfiles is
     * called. Required.
     *             </summary>
     */
    public void setLastUpdated(java.util.Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the merchantData value for this MerchantProfile.
     * 
     * @return merchantData   * <summary>
     *             Contains general data for a merchant that will be used
     * across all service classes. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData getMerchantData() {
        return merchantData;
    }


    /**
     * Sets the merchantData value for this MerchantProfile.
     * 
     * @param merchantData   * <summary>
     *             Contains general data for a merchant that will be used
     * across all service classes. Required.
     *             </summary>
     */
    public void setMerchantData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData merchantData) {
        this.merchantData = merchantData;
    }


    /**
     * Gets the transactionData value for this MerchantProfile.
     * 
     * @return transactionData   * <summary>
     *             Allows a merchant profile to be saved with transaction
     * data defaults. If this data will not change for each transaction,
     * there is no need to override these values on the transaction. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileTransactionData getTransactionData() {
        return transactionData;
    }


    /**
     * Sets the transactionData value for this MerchantProfile.
     * 
     * @param transactionData   * <summary>
     *             Allows a merchant profile to be saved with transaction
     * data defaults. If this data will not change for each transaction,
     * there is no need to override these values on the transaction. Required.
     * </summary>
     */
    public void setTransactionData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileTransactionData transactionData) {
        this.transactionData = transactionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantProfile)) return false;
        MerchantProfile other = (MerchantProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.merchantData==null && other.getMerchantData()==null) || 
             (this.merchantData!=null &&
              this.merchantData.equals(other.getMerchantData()))) &&
            ((this.transactionData==null && other.getTransactionData()==null) || 
             (this.transactionData!=null &&
              this.transactionData.equals(other.getTransactionData())));
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
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getMerchantData() != null) {
            _hashCode += getMerchantData().hashCode();
        }
        if (getTransactionData() != null) {
            _hashCode += getTransactionData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TransactionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileTransactionData"));
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
