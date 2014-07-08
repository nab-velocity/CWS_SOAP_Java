/**
 * AlternativeMerchantData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Specifies alternative merchant data that appears on accountholder
 * statements. Subject to Issuer discretion. Conditional, optional when
 * supported by service.
 *             </summary>
 */
public class AlternativeMerchantData  implements java.io.Serializable {
    /* <summary>
     *             Specifies an alternative customer service web URL or Email
     * address. Conditional, required for Ecommerce transactions.
     *             </summary> */
    private java.lang.String customerServiceInternet;

    /* <summary>
     *             Specifies an alternative customer service phone number.
     * Conditional, required for MOTO transactions.
     *             </summary> */
    private java.lang.String customerServicePhone;

    /* <summary>
     *             Specifies a description of the product or service purchased
     * that is recognizable to the accountholder. Optional.
     *             </summary> */
    private java.lang.String description;

    /* <summary>
     *             Specifies the Standard Industry Code or Merchant Category
     * Code that identifies the alternative merchant industry classification.
     * Optional.
     *             </summary> */
    private java.lang.String SIC;

    /* <summary>
     *             Specifies alternative merchant address information. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address;

    /* <summary>
     *             Specifies an alternative merchant location ID or vendor
     * code. Optional.
     *             </summary> */
    private java.lang.String merchantId;

    /* <summary>
     *             Specifies an alternative merchant name or DBA name. Required.
     * </summary> */
    private java.lang.String name;

    public AlternativeMerchantData() {
    }

    public AlternativeMerchantData(
           java.lang.String customerServiceInternet,
           java.lang.String customerServicePhone,
           java.lang.String description,
           java.lang.String SIC,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address,
           java.lang.String merchantId,
           java.lang.String name) {
           this.customerServiceInternet = customerServiceInternet;
           this.customerServicePhone = customerServicePhone;
           this.description = description;
           this.SIC = SIC;
           this.address = address;
           this.merchantId = merchantId;
           this.name = name;
    }


    /**
     * Gets the customerServiceInternet value for this AlternativeMerchantData.
     * 
     * @return customerServiceInternet   * <summary>
     *             Specifies an alternative customer service web URL or Email
     * address. Conditional, required for Ecommerce transactions.
     *             </summary>
     */
    public java.lang.String getCustomerServiceInternet() {
        return customerServiceInternet;
    }


    /**
     * Sets the customerServiceInternet value for this AlternativeMerchantData.
     * 
     * @param customerServiceInternet   * <summary>
     *             Specifies an alternative customer service web URL or Email
     * address. Conditional, required for Ecommerce transactions.
     *             </summary>
     */
    public void setCustomerServiceInternet(java.lang.String customerServiceInternet) {
        this.customerServiceInternet = customerServiceInternet;
    }


    /**
     * Gets the customerServicePhone value for this AlternativeMerchantData.
     * 
     * @return customerServicePhone   * <summary>
     *             Specifies an alternative customer service phone number.
     * Conditional, required for MOTO transactions.
     *             </summary>
     */
    public java.lang.String getCustomerServicePhone() {
        return customerServicePhone;
    }


    /**
     * Sets the customerServicePhone value for this AlternativeMerchantData.
     * 
     * @param customerServicePhone   * <summary>
     *             Specifies an alternative customer service phone number.
     * Conditional, required for MOTO transactions.
     *             </summary>
     */
    public void setCustomerServicePhone(java.lang.String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }


    /**
     * Gets the description value for this AlternativeMerchantData.
     * 
     * @return description   * <summary>
     *             Specifies a description of the product or service purchased
     * that is recognizable to the accountholder. Optional.
     *             </summary>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AlternativeMerchantData.
     * 
     * @param description   * <summary>
     *             Specifies a description of the product or service purchased
     * that is recognizable to the accountholder. Optional.
     *             </summary>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the SIC value for this AlternativeMerchantData.
     * 
     * @return SIC   * <summary>
     *             Specifies the Standard Industry Code or Merchant Category
     * Code that identifies the alternative merchant industry classification.
     * Optional.
     *             </summary>
     */
    public java.lang.String getSIC() {
        return SIC;
    }


    /**
     * Sets the SIC value for this AlternativeMerchantData.
     * 
     * @param SIC   * <summary>
     *             Specifies the Standard Industry Code or Merchant Category
     * Code that identifies the alternative merchant industry classification.
     * Optional.
     *             </summary>
     */
    public void setSIC(java.lang.String SIC) {
        this.SIC = SIC;
    }


    /**
     * Gets the address value for this AlternativeMerchantData.
     * 
     * @return address   * <summary>
     *             Specifies alternative merchant address information. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AlternativeMerchantData.
     * 
     * @param address   * <summary>
     *             Specifies alternative merchant address information. Optional.
     * </summary>
     */
    public void setAddress(com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address) {
        this.address = address;
    }


    /**
     * Gets the merchantId value for this AlternativeMerchantData.
     * 
     * @return merchantId   * <summary>
     *             Specifies an alternative merchant location ID or vendor
     * code. Optional.
     *             </summary>
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this AlternativeMerchantData.
     * 
     * @param merchantId   * <summary>
     *             Specifies an alternative merchant location ID or vendor
     * code. Optional.
     *             </summary>
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the name value for this AlternativeMerchantData.
     * 
     * @return name   * <summary>
     *             Specifies an alternative merchant name or DBA name. Required.
     * </summary>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AlternativeMerchantData.
     * 
     * @param name   * <summary>
     *             Specifies an alternative merchant name or DBA name. Required.
     * </summary>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternativeMerchantData)) return false;
        AlternativeMerchantData other = (AlternativeMerchantData) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.SIC==null && other.getSIC()==null) || 
             (this.SIC!=null &&
              this.SIC.equals(other.getSIC()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSIC() != null) {
            _hashCode += getSIC().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternativeMerchantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AlternativeMerchantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceInternet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerServiceInternet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServicePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerServicePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
