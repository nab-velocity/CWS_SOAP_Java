/**
 * IdEntryMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;

public class IdEntryMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IdEntryMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _TrackData = "TrackData";
    public static final java.lang.String _Keyed = "Keyed";
    public static final java.lang.String _Internet = "Internet";
    public static final java.lang.String _BlueTooth = "BlueTooth";
    public static final java.lang.String _RFID = "RFID";
    public static final java.lang.String _Wireless = "Wireless";
    public static final java.lang.String _Biometric = "Biometric";
    public static final java.lang.String _NFC = "NFC";
    public static final java.lang.String _Transponder = "Transponder";
    public static final java.lang.String _ContactlessDevice = "ContactlessDevice";
    public static final java.lang.String _ChipCapableDevice = "ChipCapableDevice";
    public static final java.lang.String _ProviderIssued = "ProviderIssued";
    public static final java.lang.String _BarCodeReader = "BarCodeReader";
    public static final IdEntryMode NotSet = new IdEntryMode(_NotSet);
    public static final IdEntryMode TrackData = new IdEntryMode(_TrackData);
    public static final IdEntryMode Keyed = new IdEntryMode(_Keyed);
    public static final IdEntryMode Internet = new IdEntryMode(_Internet);
    public static final IdEntryMode BlueTooth = new IdEntryMode(_BlueTooth);
    public static final IdEntryMode RFID = new IdEntryMode(_RFID);
    public static final IdEntryMode Wireless = new IdEntryMode(_Wireless);
    public static final IdEntryMode Biometric = new IdEntryMode(_Biometric);
    public static final IdEntryMode NFC = new IdEntryMode(_NFC);
    public static final IdEntryMode Transponder = new IdEntryMode(_Transponder);
    public static final IdEntryMode ContactlessDevice = new IdEntryMode(_ContactlessDevice);
    public static final IdEntryMode ChipCapableDevice = new IdEntryMode(_ChipCapableDevice);
    public static final IdEntryMode ProviderIssued = new IdEntryMode(_ProviderIssued);
    public static final IdEntryMode BarCodeReader = new IdEntryMode(_BarCodeReader);
    public java.lang.String getValue() { return _value_;}
    public static IdEntryMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IdEntryMode enumeration = (IdEntryMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IdEntryMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IdEntryMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdEntryMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
