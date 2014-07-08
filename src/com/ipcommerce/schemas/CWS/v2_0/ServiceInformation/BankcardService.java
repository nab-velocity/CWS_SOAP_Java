/**
 * BankcardService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information returned to the application with
 * details about the Bankcard service(s) for which it is configured.
 *             </summary>
 */
public class BankcardService  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether the service supports AlternativeMerchantData
     * which will appear on the accountholder's statements. Subject to Issuer
     * discretion. Optional.
     *             </summary> */
    private java.lang.Boolean alternativeMerchantData;

    /* <summary>
     *             Indicates whether AutoBatch is supported by the service.
     * Required.
     *             </summary> */
    private java.lang.Boolean autoBatch;

    /* <summary>
     *             Address Verification Services supported by the service.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardServiceAVSData AVSData;

    /* <summary>
     *             The cut-off time for new transactions to be included in
     * the daily, automated batch (when supporting AutoBatch). Conditional,
     * required if the service supports AutoBatch.
     *             </summary> */
    private java.util.Calendar cutoffTime;

    /* <summary>
     *             Public key used for encrypting payment account data. Required.
     * </summary> */
    private java.lang.String encryptionKey;

    /* <summary>
     *             Indicates whether the service supports managed billing.
     * Required.
     *             </summary> */
    private java.lang.Boolean managedBilling;

    /* <summary>
     *             Maximum number of transactions to include in a single
     * batch. Required.
     *             </summary> */
    private java.lang.Long maximumBatchItems;

    /* <summary>
     *             Maximum number of line items that may be provided when
     * sending Level 3 line item data. Optional.
     *             </summary> */
    private java.lang.Long maximumLineItems;

    /* <summary>
     *             Indicates whether the service supports multiple partial
     * captures of a single authorization amount. Required.
     *             </summary> */
    private java.lang.Boolean multiplePartialCapture;

    /* <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations;

    /* <summary>
     *             Indicates the highest level of purchase card data supported
     * by the service. Level 3 support is inclusive of Level 2 data, and
     * Level 2 support is inclusive of Level 1 data. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PurchaseCardLevel purchaseCardLevel;

    /* <summary>
     *             Unique service identifier. Required.
     *             </summary> */
    private java.lang.String serviceId;

    /* <summary>
     *             Service name. Required.
     *             </summary> */
    private java.lang.String serviceName;

    /* <summary>
     *             Tenders supported by the service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders;

    public BankcardService() {
    }

    public BankcardService(
           java.lang.Boolean alternativeMerchantData,
           java.lang.Boolean autoBatch,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardServiceAVSData AVSData,
           java.util.Calendar cutoffTime,
           java.lang.String encryptionKey,
           java.lang.Boolean managedBilling,
           java.lang.Long maximumBatchItems,
           java.lang.Long maximumLineItems,
           java.lang.Boolean multiplePartialCapture,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PurchaseCardLevel purchaseCardLevel,
           java.lang.String serviceId,
           java.lang.String serviceName,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders) {
           this.alternativeMerchantData = alternativeMerchantData;
           this.autoBatch = autoBatch;
           this.AVSData = AVSData;
           this.cutoffTime = cutoffTime;
           this.encryptionKey = encryptionKey;
           this.managedBilling = managedBilling;
           this.maximumBatchItems = maximumBatchItems;
           this.maximumLineItems = maximumLineItems;
           this.multiplePartialCapture = multiplePartialCapture;
           this.operations = operations;
           this.purchaseCardLevel = purchaseCardLevel;
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.tenders = tenders;
    }


    /**
     * Gets the alternativeMerchantData value for this BankcardService.
     * 
     * @return alternativeMerchantData   * <summary>
     *             Indicates whether the service supports AlternativeMerchantData
     * which will appear on the accountholder's statements. Subject to Issuer
     * discretion. Optional.
     *             </summary>
     */
    public java.lang.Boolean getAlternativeMerchantData() {
        return alternativeMerchantData;
    }


    /**
     * Sets the alternativeMerchantData value for this BankcardService.
     * 
     * @param alternativeMerchantData   * <summary>
     *             Indicates whether the service supports AlternativeMerchantData
     * which will appear on the accountholder's statements. Subject to Issuer
     * discretion. Optional.
     *             </summary>
     */
    public void setAlternativeMerchantData(java.lang.Boolean alternativeMerchantData) {
        this.alternativeMerchantData = alternativeMerchantData;
    }


    /**
     * Gets the autoBatch value for this BankcardService.
     * 
     * @return autoBatch   * <summary>
     *             Indicates whether AutoBatch is supported by the service.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getAutoBatch() {
        return autoBatch;
    }


    /**
     * Sets the autoBatch value for this BankcardService.
     * 
     * @param autoBatch   * <summary>
     *             Indicates whether AutoBatch is supported by the service.
     * Required.
     *             </summary>
     */
    public void setAutoBatch(java.lang.Boolean autoBatch) {
        this.autoBatch = autoBatch;
    }


    /**
     * Gets the AVSData value for this BankcardService.
     * 
     * @return AVSData   * <summary>
     *             Address Verification Services supported by the service.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardServiceAVSData getAVSData() {
        return AVSData;
    }


    /**
     * Sets the AVSData value for this BankcardService.
     * 
     * @param AVSData   * <summary>
     *             Address Verification Services supported by the service.
     * Required.
     *             </summary>
     */
    public void setAVSData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardServiceAVSData AVSData) {
        this.AVSData = AVSData;
    }


    /**
     * Gets the cutoffTime value for this BankcardService.
     * 
     * @return cutoffTime   * <summary>
     *             The cut-off time for new transactions to be included in
     * the daily, automated batch (when supporting AutoBatch). Conditional,
     * required if the service supports AutoBatch.
     *             </summary>
     */
    public java.util.Calendar getCutoffTime() {
        return cutoffTime;
    }


    /**
     * Sets the cutoffTime value for this BankcardService.
     * 
     * @param cutoffTime   * <summary>
     *             The cut-off time for new transactions to be included in
     * the daily, automated batch (when supporting AutoBatch). Conditional,
     * required if the service supports AutoBatch.
     *             </summary>
     */
    public void setCutoffTime(java.util.Calendar cutoffTime) {
        this.cutoffTime = cutoffTime;
    }


    /**
     * Gets the encryptionKey value for this BankcardService.
     * 
     * @return encryptionKey   * <summary>
     *             Public key used for encrypting payment account data. Required.
     * </summary>
     */
    public java.lang.String getEncryptionKey() {
        return encryptionKey;
    }


    /**
     * Sets the encryptionKey value for this BankcardService.
     * 
     * @param encryptionKey   * <summary>
     *             Public key used for encrypting payment account data. Required.
     * </summary>
     */
    public void setEncryptionKey(java.lang.String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }


    /**
     * Gets the managedBilling value for this BankcardService.
     * 
     * @return managedBilling   * <summary>
     *             Indicates whether the service supports managed billing.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getManagedBilling() {
        return managedBilling;
    }


    /**
     * Sets the managedBilling value for this BankcardService.
     * 
     * @param managedBilling   * <summary>
     *             Indicates whether the service supports managed billing.
     * Required.
     *             </summary>
     */
    public void setManagedBilling(java.lang.Boolean managedBilling) {
        this.managedBilling = managedBilling;
    }


    /**
     * Gets the maximumBatchItems value for this BankcardService.
     * 
     * @return maximumBatchItems   * <summary>
     *             Maximum number of transactions to include in a single
     * batch. Required.
     *             </summary>
     */
    public java.lang.Long getMaximumBatchItems() {
        return maximumBatchItems;
    }


    /**
     * Sets the maximumBatchItems value for this BankcardService.
     * 
     * @param maximumBatchItems   * <summary>
     *             Maximum number of transactions to include in a single
     * batch. Required.
     *             </summary>
     */
    public void setMaximumBatchItems(java.lang.Long maximumBatchItems) {
        this.maximumBatchItems = maximumBatchItems;
    }


    /**
     * Gets the maximumLineItems value for this BankcardService.
     * 
     * @return maximumLineItems   * <summary>
     *             Maximum number of line items that may be provided when
     * sending Level 3 line item data. Optional.
     *             </summary>
     */
    public java.lang.Long getMaximumLineItems() {
        return maximumLineItems;
    }


    /**
     * Sets the maximumLineItems value for this BankcardService.
     * 
     * @param maximumLineItems   * <summary>
     *             Maximum number of line items that may be provided when
     * sending Level 3 line item data. Optional.
     *             </summary>
     */
    public void setMaximumLineItems(java.lang.Long maximumLineItems) {
        this.maximumLineItems = maximumLineItems;
    }


    /**
     * Gets the multiplePartialCapture value for this BankcardService.
     * 
     * @return multiplePartialCapture   * <summary>
     *             Indicates whether the service supports multiple partial
     * captures of a single authorization amount. Required.
     *             </summary>
     */
    public java.lang.Boolean getMultiplePartialCapture() {
        return multiplePartialCapture;
    }


    /**
     * Sets the multiplePartialCapture value for this BankcardService.
     * 
     * @param multiplePartialCapture   * <summary>
     *             Indicates whether the service supports multiple partial
     * captures of a single authorization amount. Required.
     *             </summary>
     */
    public void setMultiplePartialCapture(java.lang.Boolean multiplePartialCapture) {
        this.multiplePartialCapture = multiplePartialCapture;
    }


    /**
     * Gets the operations value for this BankcardService.
     * 
     * @return operations   * <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this BankcardService.
     * 
     * @param operations   * <summary>
     *             The transaction processing operations supported by the
     * service. Required.
     *             </summary>
     */
    public void setOperations(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations operations) {
        this.operations = operations;
    }


    /**
     * Gets the purchaseCardLevel value for this BankcardService.
     * 
     * @return purchaseCardLevel   * <summary>
     *             Indicates the highest level of purchase card data supported
     * by the service. Level 3 support is inclusive of Level 2 data, and
     * Level 2 support is inclusive of Level 1 data. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PurchaseCardLevel getPurchaseCardLevel() {
        return purchaseCardLevel;
    }


    /**
     * Sets the purchaseCardLevel value for this BankcardService.
     * 
     * @param purchaseCardLevel   * <summary>
     *             Indicates the highest level of purchase card data supported
     * by the service. Level 3 support is inclusive of Level 2 data, and
     * Level 2 support is inclusive of Level 1 data. Required.
     *             </summary>
     */
    public void setPurchaseCardLevel(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PurchaseCardLevel purchaseCardLevel) {
        this.purchaseCardLevel = purchaseCardLevel;
    }


    /**
     * Gets the serviceId value for this BankcardService.
     * 
     * @return serviceId   * <summary>
     *             Unique service identifier. Required.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BankcardService.
     * 
     * @param serviceId   * <summary>
     *             Unique service identifier. Required.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this BankcardService.
     * 
     * @return serviceName   * <summary>
     *             Service name. Required.
     *             </summary>
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this BankcardService.
     * 
     * @param serviceName   * <summary>
     *             Service name. Required.
     *             </summary>
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the tenders value for this BankcardService.
     * 
     * @return tenders   * <summary>
     *             Tenders supported by the service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders getTenders() {
        return tenders;
    }


    /**
     * Sets the tenders value for this BankcardService.
     * 
     * @param tenders   * <summary>
     *             Tenders supported by the service. Required.
     *             </summary>
     */
    public void setTenders(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders tenders) {
        this.tenders = tenders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardService)) return false;
        BankcardService other = (BankcardService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternativeMerchantData==null && other.getAlternativeMerchantData()==null) || 
             (this.alternativeMerchantData!=null &&
              this.alternativeMerchantData.equals(other.getAlternativeMerchantData()))) &&
            ((this.autoBatch==null && other.getAutoBatch()==null) || 
             (this.autoBatch!=null &&
              this.autoBatch.equals(other.getAutoBatch()))) &&
            ((this.AVSData==null && other.getAVSData()==null) || 
             (this.AVSData!=null &&
              this.AVSData.equals(other.getAVSData()))) &&
            ((this.cutoffTime==null && other.getCutoffTime()==null) || 
             (this.cutoffTime!=null &&
              this.cutoffTime.equals(other.getCutoffTime()))) &&
            ((this.encryptionKey==null && other.getEncryptionKey()==null) || 
             (this.encryptionKey!=null &&
              this.encryptionKey.equals(other.getEncryptionKey()))) &&
            ((this.managedBilling==null && other.getManagedBilling()==null) || 
             (this.managedBilling!=null &&
              this.managedBilling.equals(other.getManagedBilling()))) &&
            ((this.maximumBatchItems==null && other.getMaximumBatchItems()==null) || 
             (this.maximumBatchItems!=null &&
              this.maximumBatchItems.equals(other.getMaximumBatchItems()))) &&
            ((this.maximumLineItems==null && other.getMaximumLineItems()==null) || 
             (this.maximumLineItems!=null &&
              this.maximumLineItems.equals(other.getMaximumLineItems()))) &&
            ((this.multiplePartialCapture==null && other.getMultiplePartialCapture()==null) || 
             (this.multiplePartialCapture!=null &&
              this.multiplePartialCapture.equals(other.getMultiplePartialCapture()))) &&
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              this.operations.equals(other.getOperations()))) &&
            ((this.purchaseCardLevel==null && other.getPurchaseCardLevel()==null) || 
             (this.purchaseCardLevel!=null &&
              this.purchaseCardLevel.equals(other.getPurchaseCardLevel()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.tenders==null && other.getTenders()==null) || 
             (this.tenders!=null &&
              this.tenders.equals(other.getTenders())));
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
        if (getAlternativeMerchantData() != null) {
            _hashCode += getAlternativeMerchantData().hashCode();
        }
        if (getAutoBatch() != null) {
            _hashCode += getAutoBatch().hashCode();
        }
        if (getAVSData() != null) {
            _hashCode += getAVSData().hashCode();
        }
        if (getCutoffTime() != null) {
            _hashCode += getCutoffTime().hashCode();
        }
        if (getEncryptionKey() != null) {
            _hashCode += getEncryptionKey().hashCode();
        }
        if (getManagedBilling() != null) {
            _hashCode += getManagedBilling().hashCode();
        }
        if (getMaximumBatchItems() != null) {
            _hashCode += getMaximumBatchItems().hashCode();
        }
        if (getMaximumLineItems() != null) {
            _hashCode += getMaximumLineItems().hashCode();
        }
        if (getMultiplePartialCapture() != null) {
            _hashCode += getMultiplePartialCapture().hashCode();
        }
        if (getOperations() != null) {
            _hashCode += getOperations().hashCode();
        }
        if (getPurchaseCardLevel() != null) {
            _hashCode += getPurchaseCardLevel().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getTenders() != null) {
            _hashCode += getTenders().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AlternativeMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AutoBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVSData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AVSData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardServiceAVSData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cutoffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CutoffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EncryptionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ManagedBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumBatchItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MaximumBatchItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MaximumLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplePartialCapture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MultiplePartialCapture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseCardLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PurchaseCardLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PurchaseCardLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("tenders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders"));
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
