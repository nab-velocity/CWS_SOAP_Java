/**
 * PhoneResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class PhoneResult implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PhoneResult(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _NotIncluded = "NotIncluded";
    public static final java.lang.String _Match = "Match";
    public static final java.lang.String _NoMatch = "NoMatch";
    public static final java.lang.String _IssuerNotCertified = "IssuerNotCertified";
    public static final java.lang.String _NoResponseFromCardAssociation = "NoResponseFromCardAssociation";
    public static final java.lang.String _UnknownResponseFromCardAssociation = "UnknownResponseFromCardAssociation";
    public static final java.lang.String _NotVerified = "NotVerified";
    public static final java.lang.String _BadFormat = "BadFormat";
    public static final PhoneResult NotSet = new PhoneResult(_NotSet);
    public static final PhoneResult NotIncluded = new PhoneResult(_NotIncluded);
    public static final PhoneResult Match = new PhoneResult(_Match);
    public static final PhoneResult NoMatch = new PhoneResult(_NoMatch);
    public static final PhoneResult IssuerNotCertified = new PhoneResult(_IssuerNotCertified);
    public static final PhoneResult NoResponseFromCardAssociation = new PhoneResult(_NoResponseFromCardAssociation);
    public static final PhoneResult UnknownResponseFromCardAssociation = new PhoneResult(_UnknownResponseFromCardAssociation);
    public static final PhoneResult NotVerified = new PhoneResult(_NotVerified);
    public static final PhoneResult BadFormat = new PhoneResult(_BadFormat);
    public java.lang.String getValue() { return _value_;}
    public static PhoneResult fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PhoneResult enumeration = (PhoneResult)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PhoneResult fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PhoneResult.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PhoneResult"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
