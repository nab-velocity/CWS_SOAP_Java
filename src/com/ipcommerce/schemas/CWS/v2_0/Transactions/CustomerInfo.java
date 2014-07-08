/**
 * CustomerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains information about the customer. Conditional,
 * required by some Service Providers. If this value is set on the transaction
 * and not required by the Service Provider, the data will not be present
 * on the transaction.
 *             </summary>
 */
public class CustomerInfo  implements java.io.Serializable {
    /* <summary>
     *             Parameterized full name. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.NameInfo name;

    /* <summary>
     *             Parameterized address. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address;

    /* <summary>
     *             Company name. Optional.
     *             </summary> */
    private java.lang.String businessName;

    /* <summary>
     *             Primary telephone number. Optional.
     *             </summary> */
    private java.lang.String phone;

    /* <summary>
     *             Primary fax number. Optional.
     *             </summary> */
    private java.lang.String fax;

    /* <summary>
     *             Email address. Optional.
     *             </summary> */
    private java.lang.String email;

    public CustomerInfo() {
    }

    public CustomerInfo(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.NameInfo name,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address,
           java.lang.String businessName,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email) {
           this.name = name;
           this.address = address;
           this.businessName = businessName;
           this.phone = phone;
           this.fax = fax;
           this.email = email;
    }


    /**
     * Gets the name value for this CustomerInfo.
     * 
     * @return name   * <summary>
     *             Parameterized full name. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.NameInfo getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomerInfo.
     * 
     * @param name   * <summary>
     *             Parameterized full name. Optional.
     *             </summary>
     */
    public void setName(com.ipcommerce.schemas.CWS.v2_0.Transactions.NameInfo name) {
        this.name = name;
    }


    /**
     * Gets the address value for this CustomerInfo.
     * 
     * @return address   * <summary>
     *             Parameterized address. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CustomerInfo.
     * 
     * @param address   * <summary>
     *             Parameterized address. Optional.
     *             </summary>
     */
    public void setAddress(com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo address) {
        this.address = address;
    }


    /**
     * Gets the businessName value for this CustomerInfo.
     * 
     * @return businessName   * <summary>
     *             Company name. Optional.
     *             </summary>
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this CustomerInfo.
     * 
     * @param businessName   * <summary>
     *             Company name. Optional.
     *             </summary>
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the phone value for this CustomerInfo.
     * 
     * @return phone   * <summary>
     *             Primary telephone number. Optional.
     *             </summary>
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this CustomerInfo.
     * 
     * @param phone   * <summary>
     *             Primary telephone number. Optional.
     *             </summary>
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this CustomerInfo.
     * 
     * @return fax   * <summary>
     *             Primary fax number. Optional.
     *             </summary>
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this CustomerInfo.
     * 
     * @param fax   * <summary>
     *             Primary fax number. Optional.
     *             </summary>
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this CustomerInfo.
     * 
     * @return email   * <summary>
     *             Email address. Optional.
     *             </summary>
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CustomerInfo.
     * 
     * @param email   * <summary>
     *             Email address. Optional.
     *             </summary>
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInfo)) return false;
        CustomerInfo other = (CustomerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "NameInfo"));
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
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Email"));
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
