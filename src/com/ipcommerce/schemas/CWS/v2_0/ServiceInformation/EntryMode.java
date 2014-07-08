/**
 * EntryMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class EntryMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntryMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Keyed = "Keyed";
    public static final java.lang.String _KeyedBadMagRead = "KeyedBadMagRead";
    public static final java.lang.String _TrackDataFromMSR = "TrackDataFromMSR";
    public static final java.lang.String _ChipReliable = "ChipReliable";
    public static final java.lang.String _ChipUnreliable = "ChipUnreliable";
    public static final java.lang.String _ContactlessMChipOrSmartCard = "ContactlessMChipOrSmartCard";
    public static final java.lang.String _ContactlessStripe = "ContactlessStripe";
    public static final java.lang.String _TerminalNotUsed = "TerminalNotUsed";
    public static final java.lang.String _BarCode = "BarCode";
    public static final java.lang.String _OCRReader = "OCRReader";
    public static final java.lang.String _VSCCapable = "VSCCapable";
    public static final java.lang.String _ChipTrackDataFromRFID = "ChipTrackDataFromRFID";
    public static final java.lang.String _MSRTrackDataFromRFID = "MSRTrackDataFromRFID";
    public static final java.lang.String _NFCCapable = "NFCCapable";
    public static final java.lang.String _Track2DataFromMSR = "Track2DataFromMSR";
    public static final EntryMode NotSet = new EntryMode(_NotSet);
    public static final EntryMode Keyed = new EntryMode(_Keyed);
    public static final EntryMode KeyedBadMagRead = new EntryMode(_KeyedBadMagRead);
    public static final EntryMode TrackDataFromMSR = new EntryMode(_TrackDataFromMSR);
    public static final EntryMode ChipReliable = new EntryMode(_ChipReliable);
    public static final EntryMode ChipUnreliable = new EntryMode(_ChipUnreliable);
    public static final EntryMode ContactlessMChipOrSmartCard = new EntryMode(_ContactlessMChipOrSmartCard);
    public static final EntryMode ContactlessStripe = new EntryMode(_ContactlessStripe);
    public static final EntryMode TerminalNotUsed = new EntryMode(_TerminalNotUsed);
    public static final EntryMode BarCode = new EntryMode(_BarCode);
    public static final EntryMode OCRReader = new EntryMode(_OCRReader);
    public static final EntryMode VSCCapable = new EntryMode(_VSCCapable);
    public static final EntryMode ChipTrackDataFromRFID = new EntryMode(_ChipTrackDataFromRFID);
    public static final EntryMode MSRTrackDataFromRFID = new EntryMode(_MSRTrackDataFromRFID);
    public static final EntryMode NFCCapable = new EntryMode(_NFCCapable);
    public static final EntryMode Track2DataFromMSR = new EntryMode(_Track2DataFromMSR);
    public java.lang.String getValue() { return _value_;}
    public static EntryMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntryMode enumeration = (EntryMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntryMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntryMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EntryMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
