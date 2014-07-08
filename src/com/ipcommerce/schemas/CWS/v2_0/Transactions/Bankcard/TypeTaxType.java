/**
 * TypeTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class TypeTaxType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TypeTaxType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _CityTax = "CityTax";
    public static final java.lang.String _CountyTax = "CountyTax";
    public static final java.lang.String _CountyParishTax = "CountyParishTax";
    public static final java.lang.String _EnergyTax = "EnergyTax";
    public static final java.lang.String _FederalTax = "FederalTax";
    public static final java.lang.String _EnvironmentalTax = "EnvironmentalTax";
    public static final java.lang.String _GoodsServicesTax = "GoodsServicesTax";
    public static final java.lang.String _HarmonizedTax = "HarmonizedTax";
    public static final java.lang.String _LuxuryTax = "LuxuryTax";
    public static final java.lang.String _LocalSalesTax = "LocalSalesTax";
    public static final java.lang.String _MunicipalTax = "MunicipalTax";
    public static final java.lang.String _OccupancyTax = "OccupancyTax";
    public static final java.lang.String _OtherTax = "OtherTax";
    public static final java.lang.String _QuebecSalesTax = "QuebecSalesTax";
    public static final java.lang.String _RoomTax = "RoomTax";
    public static final java.lang.String _StateLocalSalesTax = "StateLocalSalesTax";
    public static final java.lang.String _StateProvincialGoodsTax = "StateProvincialGoodsTax";
    public static final java.lang.String _StateSalesTax = "StateSalesTax";
    public static final java.lang.String _StateProvincialTax = "StateProvincialTax";
    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _VAT = "VAT";
    public static final TypeTaxType NotSet = new TypeTaxType(_NotSet);
    public static final TypeTaxType CityTax = new TypeTaxType(_CityTax);
    public static final TypeTaxType CountyTax = new TypeTaxType(_CountyTax);
    public static final TypeTaxType CountyParishTax = new TypeTaxType(_CountyParishTax);
    public static final TypeTaxType EnergyTax = new TypeTaxType(_EnergyTax);
    public static final TypeTaxType FederalTax = new TypeTaxType(_FederalTax);
    public static final TypeTaxType EnvironmentalTax = new TypeTaxType(_EnvironmentalTax);
    public static final TypeTaxType GoodsServicesTax = new TypeTaxType(_GoodsServicesTax);
    public static final TypeTaxType HarmonizedTax = new TypeTaxType(_HarmonizedTax);
    public static final TypeTaxType LuxuryTax = new TypeTaxType(_LuxuryTax);
    public static final TypeTaxType LocalSalesTax = new TypeTaxType(_LocalSalesTax);
    public static final TypeTaxType MunicipalTax = new TypeTaxType(_MunicipalTax);
    public static final TypeTaxType OccupancyTax = new TypeTaxType(_OccupancyTax);
    public static final TypeTaxType OtherTax = new TypeTaxType(_OtherTax);
    public static final TypeTaxType QuebecSalesTax = new TypeTaxType(_QuebecSalesTax);
    public static final TypeTaxType RoomTax = new TypeTaxType(_RoomTax);
    public static final TypeTaxType StateLocalSalesTax = new TypeTaxType(_StateLocalSalesTax);
    public static final TypeTaxType StateProvincialGoodsTax = new TypeTaxType(_StateProvincialGoodsTax);
    public static final TypeTaxType StateSalesTax = new TypeTaxType(_StateSalesTax);
    public static final TypeTaxType StateProvincialTax = new TypeTaxType(_StateProvincialTax);
    public static final TypeTaxType Unknown = new TypeTaxType(_Unknown);
    public static final TypeTaxType VAT = new TypeTaxType(_VAT);
    public java.lang.String getValue() { return _value_;}
    public static TypeTaxType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TypeTaxType enumeration = (TypeTaxType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TypeTaxType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TypeTaxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeTaxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
