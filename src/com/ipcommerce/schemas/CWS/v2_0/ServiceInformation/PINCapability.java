/**
 * PINCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class PINCapability implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PINCapability(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _PINSupported = "PINSupported";
    public static final java.lang.String _PINNotSupported = "PINNotSupported";
    public static final java.lang.String _PINVerifiedByDevice = "PINVerifiedByDevice";
    public static final java.lang.String _PINPadInoperative = "PINPadInoperative";
    public static final PINCapability NotSet = new PINCapability(_NotSet);
    public static final PINCapability Unknown = new PINCapability(_Unknown);
    public static final PINCapability PINSupported = new PINCapability(_PINSupported);
    public static final PINCapability PINNotSupported = new PINCapability(_PINNotSupported);
    public static final PINCapability PINVerifiedByDevice = new PINCapability(_PINVerifiedByDevice);
    public static final PINCapability PINPadInoperative = new PINCapability(_PINPadInoperative);
    public java.lang.String getValue() { return _value_;}
    public static PINCapability fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PINCapability enumeration = (PINCapability)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PINCapability fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PINCapability.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINCapability"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
