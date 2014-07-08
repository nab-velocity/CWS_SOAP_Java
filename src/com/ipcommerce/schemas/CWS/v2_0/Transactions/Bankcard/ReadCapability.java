/**
 * ReadCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class ReadCapability implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReadCapability(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _HasMSR = "HasMSR";
    public static final java.lang.String _NoMSR = "NoMSR";
    public static final java.lang.String _KeyOnly = "KeyOnly";
    public static final java.lang.String _Chip = "Chip";
    public static final java.lang.String _ContactlessChip = "ContactlessChip";
    public static final java.lang.String _ContactlessMSR = "ContactlessMSR";
    public static final java.lang.String _ECR = "ECR";
    public static final java.lang.String _VSCCapable = "VSCCapable";
    public static final java.lang.String _RFIDCapable = "RFIDCapable";
    public static final java.lang.String _EmvICC = "EmvICC";
    public static final java.lang.String _MSREMVICC = "MSREMVICC";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _OCRReader = "OCRReader";
    public static final java.lang.String _BarCodeReader = "BarCodeReader";
    public static final java.lang.String _NotSpecified = "NotSpecified";
    public static final java.lang.String _ARUIVR = "ARUIVR";
    public static final java.lang.String _NoTerminal = "NoTerminal";
    public static final java.lang.String _NFCCapable = "NFCCapable";
    public static final ReadCapability NotSet = new ReadCapability(_NotSet);
    public static final ReadCapability HasMSR = new ReadCapability(_HasMSR);
    public static final ReadCapability NoMSR = new ReadCapability(_NoMSR);
    public static final ReadCapability KeyOnly = new ReadCapability(_KeyOnly);
    public static final ReadCapability Chip = new ReadCapability(_Chip);
    public static final ReadCapability ContactlessChip = new ReadCapability(_ContactlessChip);
    public static final ReadCapability ContactlessMSR = new ReadCapability(_ContactlessMSR);
    public static final ReadCapability ECR = new ReadCapability(_ECR);
    public static final ReadCapability VSCCapable = new ReadCapability(_VSCCapable);
    public static final ReadCapability RFIDCapable = new ReadCapability(_RFIDCapable);
    public static final ReadCapability EmvICC = new ReadCapability(_EmvICC);
    public static final ReadCapability MSREMVICC = new ReadCapability(_MSREMVICC);
    public static final ReadCapability Unknown = new ReadCapability(_Unknown);
    public static final ReadCapability OCRReader = new ReadCapability(_OCRReader);
    public static final ReadCapability BarCodeReader = new ReadCapability(_BarCodeReader);
    public static final ReadCapability NotSpecified = new ReadCapability(_NotSpecified);
    public static final ReadCapability ARUIVR = new ReadCapability(_ARUIVR);
    public static final ReadCapability NoTerminal = new ReadCapability(_NoTerminal);
    public static final ReadCapability NFCCapable = new ReadCapability(_NFCCapable);
    public java.lang.String getValue() { return _value_;}
    public static ReadCapability fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReadCapability enumeration = (ReadCapability)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReadCapability fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReadCapability.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ReadCapability"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
