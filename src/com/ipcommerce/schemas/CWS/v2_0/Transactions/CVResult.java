/**
 * CVResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class CVResult implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CVResult(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Match = "Match";
    public static final java.lang.String _NoMatch = "NoMatch";
    public static final java.lang.String _NotProcessed = "NotProcessed";
    public static final java.lang.String _NoCodePresent = "NoCodePresent";
    public static final java.lang.String _ShouldHaveBeenPresent = "ShouldHaveBeenPresent";
    public static final java.lang.String _IssuerNotCertified = "IssuerNotCertified";
    public static final java.lang.String _Invalid = "Invalid";
    public static final java.lang.String _NoResponse = "NoResponse";
    public static final java.lang.String _NotApplicable = "NotApplicable";
    public static final CVResult NotSet = new CVResult(_NotSet);
    public static final CVResult Match = new CVResult(_Match);
    public static final CVResult NoMatch = new CVResult(_NoMatch);
    public static final CVResult NotProcessed = new CVResult(_NotProcessed);
    public static final CVResult NoCodePresent = new CVResult(_NoCodePresent);
    public static final CVResult ShouldHaveBeenPresent = new CVResult(_ShouldHaveBeenPresent);
    public static final CVResult IssuerNotCertified = new CVResult(_IssuerNotCertified);
    public static final CVResult Invalid = new CVResult(_Invalid);
    public static final CVResult NoResponse = new CVResult(_NoResponse);
    public static final CVResult NotApplicable = new CVResult(_NotApplicable);
    public java.lang.String getValue() { return _value_;}
    public static CVResult fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CVResult enumeration = (CVResult)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CVResult fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CVResult.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVResult"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
