/**
 * ChargeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class ChargeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChargeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Lodging = "Lodging";
    public static final java.lang.String _Restaurant = "Restaurant";
    public static final java.lang.String _GiftShop = "GiftShop";
    public static final java.lang.String _HealthSpa = "HealthSpa";
    public static final java.lang.String _BeautyShop = "BeautyShop";
    public static final java.lang.String _ConventionFee = "ConventionFee";
    public static final java.lang.String _TennisProShop = "TennisProShop";
    public static final java.lang.String _GolfProShop = "GolfProShop";
    public static final java.lang.String _RetailOther = "RetailOther";
    public static final ChargeType NotSet = new ChargeType(_NotSet);
    public static final ChargeType Lodging = new ChargeType(_Lodging);
    public static final ChargeType Restaurant = new ChargeType(_Restaurant);
    public static final ChargeType GiftShop = new ChargeType(_GiftShop);
    public static final ChargeType HealthSpa = new ChargeType(_HealthSpa);
    public static final ChargeType BeautyShop = new ChargeType(_BeautyShop);
    public static final ChargeType ConventionFee = new ChargeType(_ConventionFee);
    public static final ChargeType TennisProShop = new ChargeType(_TennisProShop);
    public static final ChargeType GolfProShop = new ChargeType(_GolfProShop);
    public static final ChargeType RetailOther = new ChargeType(_RetailOther);
    public java.lang.String getValue() { return _value_;}
    public static ChargeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChargeType enumeration = (ChargeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChargeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChargeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ChargeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
