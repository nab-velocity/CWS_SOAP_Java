/**
 * CheckData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;


/**
 * <summary>
 *             Basic information about the check being processed. Required.
 * </summary>
 */
public class CheckData  implements java.io.Serializable {
    /* <summary>
     *             Account number on the check. Required
     *             </summary> */
    private java.lang.String accountNumber;

    /* <summary>
     *             Bank account country of origin for receiver deposit. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckCountryCode checkCountryCode;

    /* <summary>
     *             The check number as printed on the check. Optional.
     *             </summary> */
    private java.lang.String checkNumber;

    /* <summary>
     *             Indicates the type of entity which owns the account. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.OwnerType ownerType;

    /* <summary>
     *             The rawMICRLine filed of MICRLines. MICRLines is Optional.
     * </summary> */
    private java.lang.String rawMICRLine;

    /* <summary>
     *             9-digit bank routing number of the receiver deposit account.
     * Required.
     *             </summary> */
    private java.lang.String routingNumber;

    /* <summary>
     *             Indicates the type of account. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType useType;

    public CheckData() {
    }

    public CheckData(
           java.lang.String accountNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckCountryCode checkCountryCode,
           java.lang.String checkNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.OwnerType ownerType,
           java.lang.String rawMICRLine,
           java.lang.String routingNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType useType) {
           this.accountNumber = accountNumber;
           this.checkCountryCode = checkCountryCode;
           this.checkNumber = checkNumber;
           this.ownerType = ownerType;
           this.rawMICRLine = rawMICRLine;
           this.routingNumber = routingNumber;
           this.useType = useType;
    }


    /**
     * Gets the accountNumber value for this CheckData.
     * 
     * @return accountNumber   * <summary>
     *             Account number on the check. Required
     *             </summary>
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CheckData.
     * 
     * @param accountNumber   * <summary>
     *             Account number on the check. Required
     *             </summary>
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the checkCountryCode value for this CheckData.
     * 
     * @return checkCountryCode   * <summary>
     *             Bank account country of origin for receiver deposit. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckCountryCode getCheckCountryCode() {
        return checkCountryCode;
    }


    /**
     * Sets the checkCountryCode value for this CheckData.
     * 
     * @param checkCountryCode   * <summary>
     *             Bank account country of origin for receiver deposit. Required.
     * </summary>
     */
    public void setCheckCountryCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckCountryCode checkCountryCode) {
        this.checkCountryCode = checkCountryCode;
    }


    /**
     * Gets the checkNumber value for this CheckData.
     * 
     * @return checkNumber   * <summary>
     *             The check number as printed on the check. Optional.
     *             </summary>
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this CheckData.
     * 
     * @param checkNumber   * <summary>
     *             The check number as printed on the check. Optional.
     *             </summary>
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the ownerType value for this CheckData.
     * 
     * @return ownerType   * <summary>
     *             Indicates the type of entity which owns the account. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.OwnerType getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this CheckData.
     * 
     * @param ownerType   * <summary>
     *             Indicates the type of entity which owns the account. Required.
     * </summary>
     */
    public void setOwnerType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.OwnerType ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the rawMICRLine value for this CheckData.
     * 
     * @return rawMICRLine   * <summary>
     *             The rawMICRLine filed of MICRLines. MICRLines is Optional.
     * </summary>
     */
    public java.lang.String getRawMICRLine() {
        return rawMICRLine;
    }


    /**
     * Sets the rawMICRLine value for this CheckData.
     * 
     * @param rawMICRLine   * <summary>
     *             The rawMICRLine filed of MICRLines. MICRLines is Optional.
     * </summary>
     */
    public void setRawMICRLine(java.lang.String rawMICRLine) {
        this.rawMICRLine = rawMICRLine;
    }


    /**
     * Gets the routingNumber value for this CheckData.
     * 
     * @return routingNumber   * <summary>
     *             9-digit bank routing number of the receiver deposit account.
     * Required.
     *             </summary>
     */
    public java.lang.String getRoutingNumber() {
        return routingNumber;
    }


    /**
     * Sets the routingNumber value for this CheckData.
     * 
     * @param routingNumber   * <summary>
     *             9-digit bank routing number of the receiver deposit account.
     * Required.
     *             </summary>
     */
    public void setRoutingNumber(java.lang.String routingNumber) {
        this.routingNumber = routingNumber;
    }


    /**
     * Gets the useType value for this CheckData.
     * 
     * @return useType   * <summary>
     *             Indicates the type of account. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType getUseType() {
        return useType;
    }


    /**
     * Sets the useType value for this CheckData.
     * 
     * @param useType   * <summary>
     *             Indicates the type of account. Required.
     *             </summary>
     */
    public void setUseType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType useType) {
        this.useType = useType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckData)) return false;
        CheckData other = (CheckData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.checkCountryCode==null && other.getCheckCountryCode()==null) || 
             (this.checkCountryCode!=null &&
              this.checkCountryCode.equals(other.getCheckCountryCode()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.rawMICRLine==null && other.getRawMICRLine()==null) || 
             (this.rawMICRLine!=null &&
              this.rawMICRLine.equals(other.getRawMICRLine()))) &&
            ((this.routingNumber==null && other.getRoutingNumber()==null) || 
             (this.routingNumber!=null &&
              this.routingNumber.equals(other.getRoutingNumber()))) &&
            ((this.useType==null && other.getUseType()==null) || 
             (this.useType!=null &&
              this.useType.equals(other.getUseType())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCheckCountryCode() != null) {
            _hashCode += getCheckCountryCode().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getRawMICRLine() != null) {
            _hashCode += getRawMICRLine().hashCode();
        }
        if (getRoutingNumber() != null) {
            _hashCode += getRoutingNumber().hashCode();
        }
        if (getUseType() != null) {
            _hashCode += getUseType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "OwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "OwnerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawMICRLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "RawMICRLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "RoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
