/**
 * MerchantProfileMerchantData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information specific to the merchant. Required.
 * </summary>
 */
public class MerchantProfileMerchantData  implements java.io.Serializable {
    /* <summary>
     *             Merchant's customer service web URL or email address.
     * Optional.
     *             </summary> */
    private java.lang.String customerServiceInternet;

    /* <summary>
     *             Merchant's customer service phone number. Conditional,
     * required for Bankcard MOTO transactions.
     *             </summary> */
    private java.lang.String customerServicePhone;

    /* <summary>
     *             Language to be used for the response text message. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOLanguageCodeA3 language;

    /* <summary>
     *             Merchant address. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo address;

    /* <summary>
     *             Merchant Identifier, or 'MID'. Provisioned by the service
     * provider. Required.
     *             </summary> */
    private java.lang.String merchantId;

    /* <summary>
     *             Name of the merchant. May be provisioned. Required.
     *             </summary> */
    private java.lang.String name;

    /* <summary>
     *             Merchant's local telephone number. Conditional, required
     * for Bankcard Ecommerce and MOTO transactions.
     *             </summary> */
    private java.lang.String phone;

    /* <summary>
     *             Merchant's federal or Value-Added Tax (VAT) identification
     * number. Optional.
     *             </summary> */
    private java.lang.String taxId;

    /* <summary>
     *             Additional merchant data for the Bankcard Processing service
     * class, including Credit Card and PIN Debit. Conditional, required
     * for merchants using Credit Card and PIN Debit services.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData bankcardMerchantData;

    /* <summary>
     *             Additional merchant data for the Electronic Checking service
     * class, including ACH. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData electronicCheckingMerchantData;

    /* <summary>
     *             Additional merchant data for the Stored Value service
     * class. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData storedValueMerchantData;

    public MerchantProfileMerchantData() {
    }

    public MerchantProfileMerchantData(
           java.lang.String customerServiceInternet,
           java.lang.String customerServicePhone,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOLanguageCodeA3 language,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo address,
           java.lang.String merchantId,
           java.lang.String name,
           java.lang.String phone,
           java.lang.String taxId,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData bankcardMerchantData,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData electronicCheckingMerchantData,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData storedValueMerchantData) {
           this.customerServiceInternet = customerServiceInternet;
           this.customerServicePhone = customerServicePhone;
           this.language = language;
           this.address = address;
           this.merchantId = merchantId;
           this.name = name;
           this.phone = phone;
           this.taxId = taxId;
           this.bankcardMerchantData = bankcardMerchantData;
           this.electronicCheckingMerchantData = electronicCheckingMerchantData;
           this.storedValueMerchantData = storedValueMerchantData;
    }


    /**
     * Gets the customerServiceInternet value for this MerchantProfileMerchantData.
     * 
     * @return customerServiceInternet   * <summary>
     *             Merchant's customer service web URL or email address.
     * Optional.
     *             </summary>
     */
    public java.lang.String getCustomerServiceInternet() {
        return customerServiceInternet;
    }


    /**
     * Sets the customerServiceInternet value for this MerchantProfileMerchantData.
     * 
     * @param customerServiceInternet   * <summary>
     *             Merchant's customer service web URL or email address.
     * Optional.
     *             </summary>
     */
    public void setCustomerServiceInternet(java.lang.String customerServiceInternet) {
        this.customerServiceInternet = customerServiceInternet;
    }


    /**
     * Gets the customerServicePhone value for this MerchantProfileMerchantData.
     * 
     * @return customerServicePhone   * <summary>
     *             Merchant's customer service phone number. Conditional,
     * required for Bankcard MOTO transactions.
     *             </summary>
     */
    public java.lang.String getCustomerServicePhone() {
        return customerServicePhone;
    }


    /**
     * Sets the customerServicePhone value for this MerchantProfileMerchantData.
     * 
     * @param customerServicePhone   * <summary>
     *             Merchant's customer service phone number. Conditional,
     * required for Bankcard MOTO transactions.
     *             </summary>
     */
    public void setCustomerServicePhone(java.lang.String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }


    /**
     * Gets the language value for this MerchantProfileMerchantData.
     * 
     * @return language   * <summary>
     *             Language to be used for the response text message. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOLanguageCodeA3 getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this MerchantProfileMerchantData.
     * 
     * @param language   * <summary>
     *             Language to be used for the response text message. Required.
     * </summary>
     */
    public void setLanguage(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOLanguageCodeA3 language) {
        this.language = language;
    }


    /**
     * Gets the address value for this MerchantProfileMerchantData.
     * 
     * @return address   * <summary>
     *             Merchant address. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo getAddress() {
        return address;
    }


    /**
     * Sets the address value for this MerchantProfileMerchantData.
     * 
     * @param address   * <summary>
     *             Merchant address. Required.
     *             </summary>
     */
    public void setAddress(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo address) {
        this.address = address;
    }


    /**
     * Gets the merchantId value for this MerchantProfileMerchantData.
     * 
     * @return merchantId   * <summary>
     *             Merchant Identifier, or 'MID'. Provisioned by the service
     * provider. Required.
     *             </summary>
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this MerchantProfileMerchantData.
     * 
     * @param merchantId   * <summary>
     *             Merchant Identifier, or 'MID'. Provisioned by the service
     * provider. Required.
     *             </summary>
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the name value for this MerchantProfileMerchantData.
     * 
     * @return name   * <summary>
     *             Name of the merchant. May be provisioned. Required.
     *             </summary>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MerchantProfileMerchantData.
     * 
     * @param name   * <summary>
     *             Name of the merchant. May be provisioned. Required.
     *             </summary>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the phone value for this MerchantProfileMerchantData.
     * 
     * @return phone   * <summary>
     *             Merchant's local telephone number. Conditional, required
     * for Bankcard Ecommerce and MOTO transactions.
     *             </summary>
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this MerchantProfileMerchantData.
     * 
     * @param phone   * <summary>
     *             Merchant's local telephone number. Conditional, required
     * for Bankcard Ecommerce and MOTO transactions.
     *             </summary>
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the taxId value for this MerchantProfileMerchantData.
     * 
     * @return taxId   * <summary>
     *             Merchant's federal or Value-Added Tax (VAT) identification
     * number. Optional.
     *             </summary>
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this MerchantProfileMerchantData.
     * 
     * @param taxId   * <summary>
     *             Merchant's federal or Value-Added Tax (VAT) identification
     * number. Optional.
     *             </summary>
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }


    /**
     * Gets the bankcardMerchantData value for this MerchantProfileMerchantData.
     * 
     * @return bankcardMerchantData   * <summary>
     *             Additional merchant data for the Bankcard Processing service
     * class, including Credit Card and PIN Debit. Conditional, required
     * for merchants using Credit Card and PIN Debit services.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData getBankcardMerchantData() {
        return bankcardMerchantData;
    }


    /**
     * Sets the bankcardMerchantData value for this MerchantProfileMerchantData.
     * 
     * @param bankcardMerchantData   * <summary>
     *             Additional merchant data for the Bankcard Processing service
     * class, including Credit Card and PIN Debit. Conditional, required
     * for merchants using Credit Card and PIN Debit services.
     *             </summary>
     */
    public void setBankcardMerchantData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData bankcardMerchantData) {
        this.bankcardMerchantData = bankcardMerchantData;
    }


    /**
     * Gets the electronicCheckingMerchantData value for this MerchantProfileMerchantData.
     * 
     * @return electronicCheckingMerchantData   * <summary>
     *             Additional merchant data for the Electronic Checking service
     * class, including ACH. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData getElectronicCheckingMerchantData() {
        return electronicCheckingMerchantData;
    }


    /**
     * Sets the electronicCheckingMerchantData value for this MerchantProfileMerchantData.
     * 
     * @param electronicCheckingMerchantData   * <summary>
     *             Additional merchant data for the Electronic Checking service
     * class, including ACH. Optional.
     *             </summary>
     */
    public void setElectronicCheckingMerchantData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData electronicCheckingMerchantData) {
        this.electronicCheckingMerchantData = electronicCheckingMerchantData;
    }


    /**
     * Gets the storedValueMerchantData value for this MerchantProfileMerchantData.
     * 
     * @return storedValueMerchantData   * <summary>
     *             Additional merchant data for the Stored Value service
     * class. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData getStoredValueMerchantData() {
        return storedValueMerchantData;
    }


    /**
     * Sets the storedValueMerchantData value for this MerchantProfileMerchantData.
     * 
     * @param storedValueMerchantData   * <summary>
     *             Additional merchant data for the Stored Value service
     * class. Optional.
     *             </summary>
     */
    public void setStoredValueMerchantData(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData storedValueMerchantData) {
        this.storedValueMerchantData = storedValueMerchantData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantProfileMerchantData)) return false;
        MerchantProfileMerchantData other = (MerchantProfileMerchantData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerServiceInternet==null && other.getCustomerServiceInternet()==null) || 
             (this.customerServiceInternet!=null &&
              this.customerServiceInternet.equals(other.getCustomerServiceInternet()))) &&
            ((this.customerServicePhone==null && other.getCustomerServicePhone()==null) || 
             (this.customerServicePhone!=null &&
              this.customerServicePhone.equals(other.getCustomerServicePhone()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId()))) &&
            ((this.bankcardMerchantData==null && other.getBankcardMerchantData()==null) || 
             (this.bankcardMerchantData!=null &&
              this.bankcardMerchantData.equals(other.getBankcardMerchantData()))) &&
            ((this.electronicCheckingMerchantData==null && other.getElectronicCheckingMerchantData()==null) || 
             (this.electronicCheckingMerchantData!=null &&
              this.electronicCheckingMerchantData.equals(other.getElectronicCheckingMerchantData()))) &&
            ((this.storedValueMerchantData==null && other.getStoredValueMerchantData()==null) || 
             (this.storedValueMerchantData!=null &&
              this.storedValueMerchantData.equals(other.getStoredValueMerchantData())));
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
        if (getCustomerServiceInternet() != null) {
            _hashCode += getCustomerServiceInternet().hashCode();
        }
        if (getCustomerServicePhone() != null) {
            _hashCode += getCustomerServicePhone().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        if (getBankcardMerchantData() != null) {
            _hashCode += getBankcardMerchantData().hashCode();
        }
        if (getElectronicCheckingMerchantData() != null) {
            _hashCode += getElectronicCheckingMerchantData().hashCode();
        }
        if (getStoredValueMerchantData() != null) {
            _hashCode += getStoredValueMerchantData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantProfileMerchantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceInternet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerServiceInternet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServicePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerServicePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOLanguageCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankcardMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicCheckingMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storedValueMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData"));
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
