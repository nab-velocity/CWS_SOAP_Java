/**
 * QueryRejectedSupportType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class QueryRejectedSupportType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QueryRejectedSupportType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSupported = "NotSupported";
    public static final java.lang.String _SupportedWithDateRange = "SupportedWithDateRange";
    public static final java.lang.String _SupportedWithSpecificDate = "SupportedWithSpecificDate";
    public static final QueryRejectedSupportType NotSupported = new QueryRejectedSupportType(_NotSupported);
    public static final QueryRejectedSupportType SupportedWithDateRange = new QueryRejectedSupportType(_SupportedWithDateRange);
    public static final QueryRejectedSupportType SupportedWithSpecificDate = new QueryRejectedSupportType(_SupportedWithSpecificDate);
    public java.lang.String getValue() { return _value_;}
    public static QueryRejectedSupportType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QueryRejectedSupportType enumeration = (QueryRejectedSupportType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QueryRejectedSupportType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QueryRejectedSupportType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryRejectedSupportType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
