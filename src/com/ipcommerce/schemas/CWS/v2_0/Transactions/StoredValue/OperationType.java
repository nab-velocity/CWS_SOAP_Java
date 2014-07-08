/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;

public class OperationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Activate = "Activate";
    public static final java.lang.String _BalanceTransfer = "BalanceTransfer";
    public static final java.lang.String _Deactivate = "Deactivate";
    public static final java.lang.String _Reload = "Reload";
    public static final java.lang.String _UpdateStatus = "UpdateStatus";
    public static final OperationType NotSet = new OperationType(_NotSet);
    public static final OperationType Activate = new OperationType(_Activate);
    public static final OperationType BalanceTransfer = new OperationType(_BalanceTransfer);
    public static final OperationType Deactivate = new OperationType(_Deactivate);
    public static final OperationType Reload = new OperationType(_Reload);
    public static final OperationType UpdateStatus = new OperationType(_UpdateStatus);
    public java.lang.String getValue() { return _value_;}
    public static OperationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperationType enumeration = (OperationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OperationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
