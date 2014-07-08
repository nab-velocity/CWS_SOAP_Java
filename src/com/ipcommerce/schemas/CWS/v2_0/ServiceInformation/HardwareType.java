/**
 * HardwareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class HardwareType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HardwareType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _PC = "PC";
    public static final java.lang.String _DialTerminal = "DialTerminal";
    public static final java.lang.String _ElectronicCashRegister = "ElectronicCashRegister";
    public static final java.lang.String _InStoreController = "InStoreController";
    public static final java.lang.String _Mainframe = "Mainframe";
    public static final java.lang.String _ThirdPartyDeveloper = "ThirdPartyDeveloper";
    public static final java.lang.String _POSPort = "POSPort";
    public static final java.lang.String _POSPartner = "POSPartner";
    public static final java.lang.String _TicketMachine = "TicketMachine";
    public static final java.lang.String _ATM = "ATM";
    public static final java.lang.String _ScripDevice = "ScripDevice";
    public static final java.lang.String _Telephone = "Telephone";
    public static final java.lang.String _InitiatedCAT = "InitiatedCAT";
    public static final java.lang.String _VirtualTerminal = "VirtualTerminal";
    public static final java.lang.String _MobileBanking = "MobileBanking";
    public static final HardwareType NotSet = new HardwareType(_NotSet);
    public static final HardwareType Unknown = new HardwareType(_Unknown);
    public static final HardwareType PC = new HardwareType(_PC);
    public static final HardwareType DialTerminal = new HardwareType(_DialTerminal);
    public static final HardwareType ElectronicCashRegister = new HardwareType(_ElectronicCashRegister);
    public static final HardwareType InStoreController = new HardwareType(_InStoreController);
    public static final HardwareType Mainframe = new HardwareType(_Mainframe);
    public static final HardwareType ThirdPartyDeveloper = new HardwareType(_ThirdPartyDeveloper);
    public static final HardwareType POSPort = new HardwareType(_POSPort);
    public static final HardwareType POSPartner = new HardwareType(_POSPartner);
    public static final HardwareType TicketMachine = new HardwareType(_TicketMachine);
    public static final HardwareType ATM = new HardwareType(_ATM);
    public static final HardwareType ScripDevice = new HardwareType(_ScripDevice);
    public static final HardwareType Telephone = new HardwareType(_Telephone);
    public static final HardwareType InitiatedCAT = new HardwareType(_InitiatedCAT);
    public static final HardwareType VirtualTerminal = new HardwareType(_VirtualTerminal);
    public static final HardwareType MobileBanking = new HardwareType(_MobileBanking);
    public java.lang.String getValue() { return _value_;}
    public static HardwareType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HardwareType enumeration = (HardwareType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HardwareType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HardwareType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "HardwareType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
