/**
 * BankcardApplicationConfigurationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Overrides application data for the specific transaction.
 * Optional.
 *             </summary>
 */
public class BankcardApplicationConfigurationData  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether the application is attended or unattended,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary> */
    private java.lang.Boolean applicationAttended;

    /* <summary>
     *             Location of the application relative to the merchant,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ApplicationLocation applicationLocation;

    /* <summary>
     *             Type of device running the application, if different from
     * the value set in ServiceInformation. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.HardwareType hardwareType;

    /* <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN), if different from the value set in ServiceInformation.
     * Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINCapability PINCapability;

    /* <summary>
     *             Capability of the device to read cardholder data, if different
     * from the value set in ServiceInformation. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ReadCapability readCapability;

    public BankcardApplicationConfigurationData() {
    }

    public BankcardApplicationConfigurationData(
           java.lang.Boolean applicationAttended,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ApplicationLocation applicationLocation,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.HardwareType hardwareType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINCapability PINCapability,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ReadCapability readCapability) {
           this.applicationAttended = applicationAttended;
           this.applicationLocation = applicationLocation;
           this.hardwareType = hardwareType;
           this.PINCapability = PINCapability;
           this.readCapability = readCapability;
    }


    /**
     * Gets the applicationAttended value for this BankcardApplicationConfigurationData.
     * 
     * @return applicationAttended   * <summary>
     *             Indicates whether the application is attended or unattended,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public java.lang.Boolean getApplicationAttended() {
        return applicationAttended;
    }


    /**
     * Sets the applicationAttended value for this BankcardApplicationConfigurationData.
     * 
     * @param applicationAttended   * <summary>
     *             Indicates whether the application is attended or unattended,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public void setApplicationAttended(java.lang.Boolean applicationAttended) {
        this.applicationAttended = applicationAttended;
    }


    /**
     * Gets the applicationLocation value for this BankcardApplicationConfigurationData.
     * 
     * @return applicationLocation   * <summary>
     *             Location of the application relative to the merchant,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ApplicationLocation getApplicationLocation() {
        return applicationLocation;
    }


    /**
     * Sets the applicationLocation value for this BankcardApplicationConfigurationData.
     * 
     * @param applicationLocation   * <summary>
     *             Location of the application relative to the merchant,
     * if different from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public void setApplicationLocation(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ApplicationLocation applicationLocation) {
        this.applicationLocation = applicationLocation;
    }


    /**
     * Gets the hardwareType value for this BankcardApplicationConfigurationData.
     * 
     * @return hardwareType   * <summary>
     *             Type of device running the application, if different from
     * the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.HardwareType getHardwareType() {
        return hardwareType;
    }


    /**
     * Sets the hardwareType value for this BankcardApplicationConfigurationData.
     * 
     * @param hardwareType   * <summary>
     *             Type of device running the application, if different from
     * the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public void setHardwareType(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }


    /**
     * Gets the PINCapability value for this BankcardApplicationConfigurationData.
     * 
     * @return PINCapability   * <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN), if different from the value set in ServiceInformation.
     * Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINCapability getPINCapability() {
        return PINCapability;
    }


    /**
     * Sets the PINCapability value for this BankcardApplicationConfigurationData.
     * 
     * @param PINCapability   * <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN), if different from the value set in ServiceInformation.
     * Optional.
     *             </summary>
     */
    public void setPINCapability(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINCapability PINCapability) {
        this.PINCapability = PINCapability;
    }


    /**
     * Gets the readCapability value for this BankcardApplicationConfigurationData.
     * 
     * @return readCapability   * <summary>
     *             Capability of the device to read cardholder data, if different
     * from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ReadCapability getReadCapability() {
        return readCapability;
    }


    /**
     * Sets the readCapability value for this BankcardApplicationConfigurationData.
     * 
     * @param readCapability   * <summary>
     *             Capability of the device to read cardholder data, if different
     * from the value set in ServiceInformation. Optional.
     *             </summary>
     */
    public void setReadCapability(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ReadCapability readCapability) {
        this.readCapability = readCapability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardApplicationConfigurationData)) return false;
        BankcardApplicationConfigurationData other = (BankcardApplicationConfigurationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationAttended==null && other.getApplicationAttended()==null) || 
             (this.applicationAttended!=null &&
              this.applicationAttended.equals(other.getApplicationAttended()))) &&
            ((this.applicationLocation==null && other.getApplicationLocation()==null) || 
             (this.applicationLocation!=null &&
              this.applicationLocation.equals(other.getApplicationLocation()))) &&
            ((this.hardwareType==null && other.getHardwareType()==null) || 
             (this.hardwareType!=null &&
              this.hardwareType.equals(other.getHardwareType()))) &&
            ((this.PINCapability==null && other.getPINCapability()==null) || 
             (this.PINCapability!=null &&
              this.PINCapability.equals(other.getPINCapability()))) &&
            ((this.readCapability==null && other.getReadCapability()==null) || 
             (this.readCapability!=null &&
              this.readCapability.equals(other.getReadCapability())));
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
        if (getApplicationAttended() != null) {
            _hashCode += getApplicationAttended().hashCode();
        }
        if (getApplicationLocation() != null) {
            _hashCode += getApplicationLocation().hashCode();
        }
        if (getHardwareType() != null) {
            _hashCode += getHardwareType().hashCode();
        }
        if (getPINCapability() != null) {
            _hashCode += getPINCapability().hashCode();
        }
        if (getReadCapability() != null) {
            _hashCode += getReadCapability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardApplicationConfigurationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardApplicationConfigurationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationAttended");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApplicationAttended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApplicationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApplicationLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "HardwareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "HardwareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ReadCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ReadCapability"));
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
