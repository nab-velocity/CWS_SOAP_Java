/**
 * ApplicationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information about the application that must be
 * supplied to the Service Information endpoint prior to transacting.
 * Required.
 *             </summary>
 */
public class ApplicationData  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether the application is attended or unattended.
     * Required.
     *             </summary> */
    private java.lang.Boolean applicationAttended;

    /* <summary>
     *             Location of the application relative to the merchant.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation applicationLocation;

    /* <summary>
     *             Name of the application. Required.
     *             </summary> */
    private java.lang.String applicationName;

    /* <summary>
     *             Developer Identifier, or Third-Party Processor Identifier
     * (TPPID). Conditional, required if provided to application developer
     * by application certification entity.
     *             </summary> */
    private java.lang.String developerId;

    /* <summary>
     *             Type of device running the application. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType hardwareType;

    /* <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN). Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability PINCapability;

    /* <summary>
     *             Unique identifier issued to certified software applications.
     * This value is passed with all subsequent transaction requests as 'applicationProfileId'.
     * Required.
     *             </summary> */
    private java.lang.String PTLSSocketId;

    /* <summary>
     *             Capability of the device to read cardholder data. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability readCapability;

    /* <summary>
     *             Serial number of the application provided by the software
     * developer. Unique per installed instance of the application. Required.
     * </summary> */
    private java.lang.String serialNumber;

    /* <summary>
     *             Software version of the application provided by the software
     * developer. Required.
     *             </summary> */
    private java.lang.String softwareVersion;

    /* <summary>
     *             Software version date of the application provided by the
     * software developer. Required.
     *             </summary> */
    private java.util.Calendar softwareVersionDate;

    /* <summary>
     *             Vendor Identifier. Conditional, required if provided to
     * application developer by application certification entity.
     *             </summary> */
    private java.lang.String vendorId;

    /* <summary>
     *             Specifies the type of encryption block used by the card
     * reader. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType encryptionType;

    /* <summary>
     *             Specifies the serial number located on the physical device
     * used to acquire payment account data. Optional.
     *             </summary> */
    private java.lang.String deviceSerialNumber;

    public ApplicationData() {
    }

    public ApplicationData(
           java.lang.Boolean applicationAttended,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation applicationLocation,
           java.lang.String applicationName,
           java.lang.String developerId,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType hardwareType,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability PINCapability,
           java.lang.String PTLSSocketId,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability readCapability,
           java.lang.String serialNumber,
           java.lang.String softwareVersion,
           java.util.Calendar softwareVersionDate,
           java.lang.String vendorId,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType encryptionType,
           java.lang.String deviceSerialNumber) {
           this.applicationAttended = applicationAttended;
           this.applicationLocation = applicationLocation;
           this.applicationName = applicationName;
           this.developerId = developerId;
           this.hardwareType = hardwareType;
           this.PINCapability = PINCapability;
           this.PTLSSocketId = PTLSSocketId;
           this.readCapability = readCapability;
           this.serialNumber = serialNumber;
           this.softwareVersion = softwareVersion;
           this.softwareVersionDate = softwareVersionDate;
           this.vendorId = vendorId;
           this.encryptionType = encryptionType;
           this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the applicationAttended value for this ApplicationData.
     * 
     * @return applicationAttended   * <summary>
     *             Indicates whether the application is attended or unattended.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getApplicationAttended() {
        return applicationAttended;
    }


    /**
     * Sets the applicationAttended value for this ApplicationData.
     * 
     * @param applicationAttended   * <summary>
     *             Indicates whether the application is attended or unattended.
     * Required.
     *             </summary>
     */
    public void setApplicationAttended(java.lang.Boolean applicationAttended) {
        this.applicationAttended = applicationAttended;
    }


    /**
     * Gets the applicationLocation value for this ApplicationData.
     * 
     * @return applicationLocation   * <summary>
     *             Location of the application relative to the merchant.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation getApplicationLocation() {
        return applicationLocation;
    }


    /**
     * Sets the applicationLocation value for this ApplicationData.
     * 
     * @param applicationLocation   * <summary>
     *             Location of the application relative to the merchant.
     * Required.
     *             </summary>
     */
    public void setApplicationLocation(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation applicationLocation) {
        this.applicationLocation = applicationLocation;
    }


    /**
     * Gets the applicationName value for this ApplicationData.
     * 
     * @return applicationName   * <summary>
     *             Name of the application. Required.
     *             </summary>
     */
    public java.lang.String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this ApplicationData.
     * 
     * @param applicationName   * <summary>
     *             Name of the application. Required.
     *             </summary>
     */
    public void setApplicationName(java.lang.String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the developerId value for this ApplicationData.
     * 
     * @return developerId   * <summary>
     *             Developer Identifier, or Third-Party Processor Identifier
     * (TPPID). Conditional, required if provided to application developer
     * by application certification entity.
     *             </summary>
     */
    public java.lang.String getDeveloperId() {
        return developerId;
    }


    /**
     * Sets the developerId value for this ApplicationData.
     * 
     * @param developerId   * <summary>
     *             Developer Identifier, or Third-Party Processor Identifier
     * (TPPID). Conditional, required if provided to application developer
     * by application certification entity.
     *             </summary>
     */
    public void setDeveloperId(java.lang.String developerId) {
        this.developerId = developerId;
    }


    /**
     * Gets the hardwareType value for this ApplicationData.
     * 
     * @return hardwareType   * <summary>
     *             Type of device running the application. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType getHardwareType() {
        return hardwareType;
    }


    /**
     * Sets the hardwareType value for this ApplicationData.
     * 
     * @param hardwareType   * <summary>
     *             Type of device running the application. Required.
     *             </summary>
     */
    public void setHardwareType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }


    /**
     * Gets the PINCapability value for this ApplicationData.
     * 
     * @return PINCapability   * <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN). Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability getPINCapability() {
        return PINCapability;
    }


    /**
     * Sets the PINCapability value for this ApplicationData.
     * 
     * @param PINCapability   * <summary>
     *             Indicates support for cardholder Personal Identification
     * Number (PIN). Required.
     *             </summary>
     */
    public void setPINCapability(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability PINCapability) {
        this.PINCapability = PINCapability;
    }


    /**
     * Gets the PTLSSocketId value for this ApplicationData.
     * 
     * @return PTLSSocketId   * <summary>
     *             Unique identifier issued to certified software applications.
     * This value is passed with all subsequent transaction requests as 'applicationProfileId'.
     * Required.
     *             </summary>
     */
    public java.lang.String getPTLSSocketId() {
        return PTLSSocketId;
    }


    /**
     * Sets the PTLSSocketId value for this ApplicationData.
     * 
     * @param PTLSSocketId   * <summary>
     *             Unique identifier issued to certified software applications.
     * This value is passed with all subsequent transaction requests as 'applicationProfileId'.
     * Required.
     *             </summary>
     */
    public void setPTLSSocketId(java.lang.String PTLSSocketId) {
        this.PTLSSocketId = PTLSSocketId;
    }


    /**
     * Gets the readCapability value for this ApplicationData.
     * 
     * @return readCapability   * <summary>
     *             Capability of the device to read cardholder data. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability getReadCapability() {
        return readCapability;
    }


    /**
     * Sets the readCapability value for this ApplicationData.
     * 
     * @param readCapability   * <summary>
     *             Capability of the device to read cardholder data. Required.
     * </summary>
     */
    public void setReadCapability(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability readCapability) {
        this.readCapability = readCapability;
    }


    /**
     * Gets the serialNumber value for this ApplicationData.
     * 
     * @return serialNumber   * <summary>
     *             Serial number of the application provided by the software
     * developer. Unique per installed instance of the application. Required.
     * </summary>
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ApplicationData.
     * 
     * @param serialNumber   * <summary>
     *             Serial number of the application provided by the software
     * developer. Unique per installed instance of the application. Required.
     * </summary>
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the softwareVersion value for this ApplicationData.
     * 
     * @return softwareVersion   * <summary>
     *             Software version of the application provided by the software
     * developer. Required.
     *             </summary>
     */
    public java.lang.String getSoftwareVersion() {
        return softwareVersion;
    }


    /**
     * Sets the softwareVersion value for this ApplicationData.
     * 
     * @param softwareVersion   * <summary>
     *             Software version of the application provided by the software
     * developer. Required.
     *             </summary>
     */
    public void setSoftwareVersion(java.lang.String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }


    /**
     * Gets the softwareVersionDate value for this ApplicationData.
     * 
     * @return softwareVersionDate   * <summary>
     *             Software version date of the application provided by the
     * software developer. Required.
     *             </summary>
     */
    public java.util.Calendar getSoftwareVersionDate() {
        return softwareVersionDate;
    }


    /**
     * Sets the softwareVersionDate value for this ApplicationData.
     * 
     * @param softwareVersionDate   * <summary>
     *             Software version date of the application provided by the
     * software developer. Required.
     *             </summary>
     */
    public void setSoftwareVersionDate(java.util.Calendar softwareVersionDate) {
        this.softwareVersionDate = softwareVersionDate;
    }


    /**
     * Gets the vendorId value for this ApplicationData.
     * 
     * @return vendorId   * <summary>
     *             Vendor Identifier. Conditional, required if provided to
     * application developer by application certification entity.
     *             </summary>
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this ApplicationData.
     * 
     * @param vendorId   * <summary>
     *             Vendor Identifier. Conditional, required if provided to
     * application developer by application certification entity.
     *             </summary>
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the encryptionType value for this ApplicationData.
     * 
     * @return encryptionType   * <summary>
     *             Specifies the type of encryption block used by the card
     * reader. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType getEncryptionType() {
        return encryptionType;
    }


    /**
     * Sets the encryptionType value for this ApplicationData.
     * 
     * @param encryptionType   * <summary>
     *             Specifies the type of encryption block used by the card
     * reader. Optional.
     *             </summary>
     */
    public void setEncryptionType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }


    /**
     * Gets the deviceSerialNumber value for this ApplicationData.
     * 
     * @return deviceSerialNumber   * <summary>
     *             Specifies the serial number located on the physical device
     * used to acquire payment account data. Optional.
     *             </summary>
     */
    public java.lang.String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this ApplicationData.
     * 
     * @param deviceSerialNumber   * <summary>
     *             Specifies the serial number located on the physical device
     * used to acquire payment account data. Optional.
     *             </summary>
     */
    public void setDeviceSerialNumber(java.lang.String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicationData)) return false;
        ApplicationData other = (ApplicationData) obj;
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
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.developerId==null && other.getDeveloperId()==null) || 
             (this.developerId!=null &&
              this.developerId.equals(other.getDeveloperId()))) &&
            ((this.hardwareType==null && other.getHardwareType()==null) || 
             (this.hardwareType!=null &&
              this.hardwareType.equals(other.getHardwareType()))) &&
            ((this.PINCapability==null && other.getPINCapability()==null) || 
             (this.PINCapability!=null &&
              this.PINCapability.equals(other.getPINCapability()))) &&
            ((this.PTLSSocketId==null && other.getPTLSSocketId()==null) || 
             (this.PTLSSocketId!=null &&
              this.PTLSSocketId.equals(other.getPTLSSocketId()))) &&
            ((this.readCapability==null && other.getReadCapability()==null) || 
             (this.readCapability!=null &&
              this.readCapability.equals(other.getReadCapability()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.softwareVersion==null && other.getSoftwareVersion()==null) || 
             (this.softwareVersion!=null &&
              this.softwareVersion.equals(other.getSoftwareVersion()))) &&
            ((this.softwareVersionDate==null && other.getSoftwareVersionDate()==null) || 
             (this.softwareVersionDate!=null &&
              this.softwareVersionDate.equals(other.getSoftwareVersionDate()))) &&
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.encryptionType==null && other.getEncryptionType()==null) || 
             (this.encryptionType!=null &&
              this.encryptionType.equals(other.getEncryptionType()))) &&
            ((this.deviceSerialNumber==null && other.getDeviceSerialNumber()==null) || 
             (this.deviceSerialNumber!=null &&
              this.deviceSerialNumber.equals(other.getDeviceSerialNumber())));
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
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getDeveloperId() != null) {
            _hashCode += getDeveloperId().hashCode();
        }
        if (getHardwareType() != null) {
            _hashCode += getHardwareType().hashCode();
        }
        if (getPINCapability() != null) {
            _hashCode += getPINCapability().hashCode();
        }
        if (getPTLSSocketId() != null) {
            _hashCode += getPTLSSocketId().hashCode();
        }
        if (getReadCapability() != null) {
            _hashCode += getReadCapability().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSoftwareVersion() != null) {
            _hashCode += getSoftwareVersion().hashCode();
        }
        if (getSoftwareVersionDate() != null) {
            _hashCode += getSoftwareVersionDate().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getEncryptionType() != null) {
            _hashCode += getEncryptionType().hashCode();
        }
        if (getDeviceSerialNumber() != null) {
            _hashCode += getDeviceSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationAttended");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationAttended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DeveloperId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "HardwareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "HardwareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTLSSocketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PTLSSocketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReadCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReadCapability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SoftwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareVersionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SoftwareVersionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "VendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EncryptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EncryptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DeviceSerialNumber"));
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
