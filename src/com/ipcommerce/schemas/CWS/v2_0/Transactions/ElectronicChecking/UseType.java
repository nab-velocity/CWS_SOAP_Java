/**
 * UseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class UseType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UseType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Savings = "Savings";
    public static final java.lang.String _Checking = "Checking";
    public static final java.lang.String _Travelers = "Travelers";
    public static final java.lang.String _Payroll = "Payroll";
    public static final java.lang.String _Cash = "Cash";
    public static final java.lang.String _TwoParty = "TwoParty";
    public static final java.lang.String _Government = "Government";
    public static final UseType NotSet = new UseType(_NotSet);
    public static final UseType Savings = new UseType(_Savings);
    public static final UseType Checking = new UseType(_Checking);
    public static final UseType Travelers = new UseType(_Travelers);
    public static final UseType Payroll = new UseType(_Payroll);
    public static final UseType Cash = new UseType(_Cash);
    public static final UseType TwoParty = new UseType(_TwoParty);
    public static final UseType Government = new UseType(_Government);
    public java.lang.String getValue() { return _value_;}
    public static UseType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UseType enumeration = (UseType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UseType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UseType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
