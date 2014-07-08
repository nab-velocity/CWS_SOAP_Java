/**
 * ImgCompressionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ImgCompressionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ImgCompressionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Group_4 = "Group_4";
    public static final java.lang.String _JPEG_Baseline = "JPEG_Baseline";
    public static final java.lang.String _ABIC = "ABIC";
    public static final java.lang.String _PNG = "PNG";
    public static final java.lang.String _JBIG = "JBIG";
    public static final java.lang.String _JPEG_2000 = "JPEG_2000";
    public static final ImgCompressionType NotSet = new ImgCompressionType(_NotSet);
    public static final ImgCompressionType Group_4 = new ImgCompressionType(_Group_4);
    public static final ImgCompressionType JPEG_Baseline = new ImgCompressionType(_JPEG_Baseline);
    public static final ImgCompressionType ABIC = new ImgCompressionType(_ABIC);
    public static final ImgCompressionType PNG = new ImgCompressionType(_PNG);
    public static final ImgCompressionType JBIG = new ImgCompressionType(_JBIG);
    public static final ImgCompressionType JPEG_2000 = new ImgCompressionType(_JPEG_2000);
    public java.lang.String getValue() { return _value_;}
    public static ImgCompressionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ImgCompressionType enumeration = (ImgCompressionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ImgCompressionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ImgCompressionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgCompressionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
