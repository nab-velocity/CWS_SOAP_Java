/**
 * TokenIndicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class TokenIndicator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TokenIndicator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _VPAS = "VPAS";
    public static final java.lang.String _UCAFWithData = "UCAFWithData";
    public static final java.lang.String _UCAFWithoutData = "UCAFWithoutData";
    public static final java.lang.String _AttemptedCardUnsupported = "AttemptedCardUnsupported";
    public static final java.lang.String _AttemptedServiceUnavailable = "AttemptedServiceUnavailable";
    public static final TokenIndicator NotSet = new TokenIndicator(_NotSet);
    public static final TokenIndicator VPAS = new TokenIndicator(_VPAS);
    public static final TokenIndicator UCAFWithData = new TokenIndicator(_UCAFWithData);
    public static final TokenIndicator UCAFWithoutData = new TokenIndicator(_UCAFWithoutData);
    public static final TokenIndicator AttemptedCardUnsupported = new TokenIndicator(_AttemptedCardUnsupported);
    public static final TokenIndicator AttemptedServiceUnavailable = new TokenIndicator(_AttemptedServiceUnavailable);
    public java.lang.String getValue() { return _value_;}
    public static TokenIndicator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TokenIndicator enumeration = (TokenIndicator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TokenIndicator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TokenIndicator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TokenIndicator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
