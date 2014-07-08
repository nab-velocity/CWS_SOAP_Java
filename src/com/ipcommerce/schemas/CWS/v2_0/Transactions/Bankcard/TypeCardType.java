/**
 * TypeCardType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class TypeCardType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TypeCardType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _PrivateLabel = "PrivateLabel";
    public static final java.lang.String _Visa = "Visa";
    public static final java.lang.String _MasterCard = "MasterCard";
    public static final java.lang.String _AmericanExpress = "AmericanExpress";
    public static final java.lang.String _DinersCartBlanche = "DinersCartBlanche";
    public static final java.lang.String _Discover = "Discover";
    public static final java.lang.String _JCB = "JCB";
    public static final java.lang.String _CitibankFinancial = "CitibankFinancial";
    public static final java.lang.String _RevolutionCard = "RevolutionCard";
    public static final java.lang.String _UnbrandedATM = "UnbrandedATM";
    public static final java.lang.String _Dankort = "Dankort";
    public static final java.lang.String _Solo = "Solo";
    public static final java.lang.String _Maestro = "Maestro";
    public static final java.lang.String _LaserCard = "LaserCard";
    public static final java.lang.String _Electron = "Electron";
    public static final java.lang.String _Finax = "Finax";
    public static final java.lang.String _Kopkort = "Kopkort";
    public static final java.lang.String _CarteAurore = "CarteAurore";
    public static final java.lang.String _CartesBancaires = "CartesBancaires";
    public static final java.lang.String _DinersClub = "DinersClub";
    public static final TypeCardType NotSet = new TypeCardType(_NotSet);
    public static final TypeCardType PrivateLabel = new TypeCardType(_PrivateLabel);
    public static final TypeCardType Visa = new TypeCardType(_Visa);
    public static final TypeCardType MasterCard = new TypeCardType(_MasterCard);
    public static final TypeCardType AmericanExpress = new TypeCardType(_AmericanExpress);
    public static final TypeCardType DinersCartBlanche = new TypeCardType(_DinersCartBlanche);
    public static final TypeCardType Discover = new TypeCardType(_Discover);
    public static final TypeCardType JCB = new TypeCardType(_JCB);
    public static final TypeCardType CitibankFinancial = new TypeCardType(_CitibankFinancial);
    public static final TypeCardType RevolutionCard = new TypeCardType(_RevolutionCard);
    public static final TypeCardType UnbrandedATM = new TypeCardType(_UnbrandedATM);
    public static final TypeCardType Dankort = new TypeCardType(_Dankort);
    public static final TypeCardType Solo = new TypeCardType(_Solo);
    public static final TypeCardType Maestro = new TypeCardType(_Maestro);
    public static final TypeCardType LaserCard = new TypeCardType(_LaserCard);
    public static final TypeCardType Electron = new TypeCardType(_Electron);
    public static final TypeCardType Finax = new TypeCardType(_Finax);
    public static final TypeCardType Kopkort = new TypeCardType(_Kopkort);
    public static final TypeCardType CarteAurore = new TypeCardType(_CarteAurore);
    public static final TypeCardType CartesBancaires = new TypeCardType(_CartesBancaires);
    public static final TypeCardType DinersClub = new TypeCardType(_DinersClub);
    public java.lang.String getValue() { return _value_;}
    public static TypeCardType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TypeCardType enumeration = (TypeCardType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TypeCardType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TypeCardType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
