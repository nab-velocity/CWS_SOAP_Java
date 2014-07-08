/**
 * PersonalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains a customer's sensitive personal information.
 * Optional.
 *             </summary>
 */
public class PersonalInfo  implements java.io.Serializable {
    /* <summary>
     *             Company name. Optional.
     *             </summary> */
    private java.lang.String company;

    /* <summary>
     *             The customer's date of birth. Optional.
     *             </summary> */
    private java.util.Calendar dateOfBirth;

    /* <summary>
     *             The customer's driver's license information. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.DriversLicense driversLicense;

    /* <summary>
     *             Employee identification number, which can be used as an
     * alternate form of identification. Optional.
     *             </summary> */
    private java.lang.String employeeIdNumber;

    /* <summary>
     *             The customer's gender. Optional.
     *             </summary> */
    private java.lang.String gender;

    /* <summary>
     *             Government issued identification number, which can be
     * used as an alternate form of identification. Optional.
     *             </summary> */
    private java.lang.String governmentIdNumber;

    /* <summary>
     *             Military issued identification number, which can be used
     * as an alternate form of identification. Optional.
     *             </summary> */
    private java.lang.String militaryIdNumber;

    /* <summary>
     *             The customer's social security number. Optional.
     *             </summary> */
    private java.lang.String socialSecurityNumber;

    /* <summary>
     *             The customer's federal tax identifier. Optional.
     *             </summary> */
    private java.lang.String taxId;

    public PersonalInfo() {
    }

    public PersonalInfo(
           java.lang.String company,
           java.util.Calendar dateOfBirth,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.DriversLicense driversLicense,
           java.lang.String employeeIdNumber,
           java.lang.String gender,
           java.lang.String governmentIdNumber,
           java.lang.String militaryIdNumber,
           java.lang.String socialSecurityNumber,
           java.lang.String taxId) {
           this.company = company;
           this.dateOfBirth = dateOfBirth;
           this.driversLicense = driversLicense;
           this.employeeIdNumber = employeeIdNumber;
           this.gender = gender;
           this.governmentIdNumber = governmentIdNumber;
           this.militaryIdNumber = militaryIdNumber;
           this.socialSecurityNumber = socialSecurityNumber;
           this.taxId = taxId;
    }


    /**
     * Gets the company value for this PersonalInfo.
     * 
     * @return company   * <summary>
     *             Company name. Optional.
     *             </summary>
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this PersonalInfo.
     * 
     * @param company   * <summary>
     *             Company name. Optional.
     *             </summary>
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the dateOfBirth value for this PersonalInfo.
     * 
     * @return dateOfBirth   * <summary>
     *             The customer's date of birth. Optional.
     *             </summary>
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this PersonalInfo.
     * 
     * @param dateOfBirth   * <summary>
     *             The customer's date of birth. Optional.
     *             </summary>
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the driversLicense value for this PersonalInfo.
     * 
     * @return driversLicense   * <summary>
     *             The customer's driver's license information. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.DriversLicense getDriversLicense() {
        return driversLicense;
    }


    /**
     * Sets the driversLicense value for this PersonalInfo.
     * 
     * @param driversLicense   * <summary>
     *             The customer's driver's license information. Optional.
     * </summary>
     */
    public void setDriversLicense(com.ipcommerce.schemas.CWS.v2_0.Transactions.DriversLicense driversLicense) {
        this.driversLicense = driversLicense;
    }


    /**
     * Gets the employeeIdNumber value for this PersonalInfo.
     * 
     * @return employeeIdNumber   * <summary>
     *             Employee identification number, which can be used as an
     * alternate form of identification. Optional.
     *             </summary>
     */
    public java.lang.String getEmployeeIdNumber() {
        return employeeIdNumber;
    }


    /**
     * Sets the employeeIdNumber value for this PersonalInfo.
     * 
     * @param employeeIdNumber   * <summary>
     *             Employee identification number, which can be used as an
     * alternate form of identification. Optional.
     *             </summary>
     */
    public void setEmployeeIdNumber(java.lang.String employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }


    /**
     * Gets the gender value for this PersonalInfo.
     * 
     * @return gender   * <summary>
     *             The customer's gender. Optional.
     *             </summary>
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this PersonalInfo.
     * 
     * @param gender   * <summary>
     *             The customer's gender. Optional.
     *             </summary>
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the governmentIdNumber value for this PersonalInfo.
     * 
     * @return governmentIdNumber   * <summary>
     *             Government issued identification number, which can be
     * used as an alternate form of identification. Optional.
     *             </summary>
     */
    public java.lang.String getGovernmentIdNumber() {
        return governmentIdNumber;
    }


    /**
     * Sets the governmentIdNumber value for this PersonalInfo.
     * 
     * @param governmentIdNumber   * <summary>
     *             Government issued identification number, which can be
     * used as an alternate form of identification. Optional.
     *             </summary>
     */
    public void setGovernmentIdNumber(java.lang.String governmentIdNumber) {
        this.governmentIdNumber = governmentIdNumber;
    }


    /**
     * Gets the militaryIdNumber value for this PersonalInfo.
     * 
     * @return militaryIdNumber   * <summary>
     *             Military issued identification number, which can be used
     * as an alternate form of identification. Optional.
     *             </summary>
     */
    public java.lang.String getMilitaryIdNumber() {
        return militaryIdNumber;
    }


    /**
     * Sets the militaryIdNumber value for this PersonalInfo.
     * 
     * @param militaryIdNumber   * <summary>
     *             Military issued identification number, which can be used
     * as an alternate form of identification. Optional.
     *             </summary>
     */
    public void setMilitaryIdNumber(java.lang.String militaryIdNumber) {
        this.militaryIdNumber = militaryIdNumber;
    }


    /**
     * Gets the socialSecurityNumber value for this PersonalInfo.
     * 
     * @return socialSecurityNumber   * <summary>
     *             The customer's social security number. Optional.
     *             </summary>
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this PersonalInfo.
     * 
     * @param socialSecurityNumber   * <summary>
     *             The customer's social security number. Optional.
     *             </summary>
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the taxId value for this PersonalInfo.
     * 
     * @return taxId   * <summary>
     *             The customer's federal tax identifier. Optional.
     *             </summary>
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this PersonalInfo.
     * 
     * @param taxId   * <summary>
     *             The customer's federal tax identifier. Optional.
     *             </summary>
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalInfo)) return false;
        PersonalInfo other = (PersonalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.driversLicense==null && other.getDriversLicense()==null) || 
             (this.driversLicense!=null &&
              this.driversLicense.equals(other.getDriversLicense()))) &&
            ((this.employeeIdNumber==null && other.getEmployeeIdNumber()==null) || 
             (this.employeeIdNumber!=null &&
              this.employeeIdNumber.equals(other.getEmployeeIdNumber()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.governmentIdNumber==null && other.getGovernmentIdNumber()==null) || 
             (this.governmentIdNumber!=null &&
              this.governmentIdNumber.equals(other.getGovernmentIdNumber()))) &&
            ((this.militaryIdNumber==null && other.getMilitaryIdNumber()==null) || 
             (this.militaryIdNumber!=null &&
              this.militaryIdNumber.equals(other.getMilitaryIdNumber()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId())));
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDriversLicense() != null) {
            _hashCode += getDriversLicense().hashCode();
        }
        if (getEmployeeIdNumber() != null) {
            _hashCode += getEmployeeIdNumber().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGovernmentIdNumber() != null) {
            _hashCode += getGovernmentIdNumber().hashCode();
        }
        if (getMilitaryIdNumber() != null) {
            _hashCode += getMilitaryIdNumber().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PersonalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driversLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DriversLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DriversLicense"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "EmployeeIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("governmentIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "GovernmentIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("militaryIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "MilitaryIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SocialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TaxId"));
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
