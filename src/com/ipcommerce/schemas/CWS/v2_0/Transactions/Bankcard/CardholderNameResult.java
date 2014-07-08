/**
 * CardholderNameResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class CardholderNameResult implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CardholderNameResult(java.lang.String value) {
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
    public static final CardholderNameResult NotSet = new CardholderNameResult(_NotSet);
    public static final CardholderNameResult NotIncluded = new CardholderNameResult(_NotIncluded);
    public static final CardholderNameResult Match = new CardholderNameResult(_Match);
    public static final CardholderNameResult NoMatch = new CardholderNameResult(_NoMatch);
    public static final CardholderNameResult IssuerNotCertified = new CardholderNameResult(_IssuerNotCertified);
    public static final CardholderNameResult NoResponseFromCardAssociation = new CardholderNameResult(_NoResponseFromCardAssociation);
    public static final CardholderNameResult UnknownResponseFromCardAssociation = new CardholderNameResult(_UnknownResponseFromCardAssociation);
    public static final CardholderNameResult NotVerified = new CardholderNameResult(_NotVerified);
    public static final CardholderNameResult BadFormat = new CardholderNameResult(_BadFormat);
    public java.lang.String getValue() { return _value_;}
    public static CardholderNameResult fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CardholderNameResult enumeration = (CardholderNameResult)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CardholderNameResult fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CardholderNameResult.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderNameResult"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
