/**
 * AdviceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class AdviceResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdviceResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Unsupported = "Unsupported";
    public static final java.lang.String _NewAccountInfoAvailable = "NewAccountInfoAvailable";
    public static final java.lang.String _TryAgainLater = "TryAgainLater";
    public static final java.lang.String _DoNotTryAgainLater = "DoNotTryAgainLater";
    public static final java.lang.String _DoNotHonor = "DoNotHonor";
    public static final AdviceResponse NotSet = new AdviceResponse(_NotSet);
    public static final AdviceResponse Unsupported = new AdviceResponse(_Unsupported);
    public static final AdviceResponse NewAccountInfoAvailable = new AdviceResponse(_NewAccountInfoAvailable);
    public static final AdviceResponse TryAgainLater = new AdviceResponse(_TryAgainLater);
    public static final AdviceResponse DoNotTryAgainLater = new AdviceResponse(_DoNotTryAgainLater);
    public static final AdviceResponse DoNotHonor = new AdviceResponse(_DoNotHonor);
    public java.lang.String getValue() { return _value_;}
    public static AdviceResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdviceResponse enumeration = (AdviceResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdviceResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdviceResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AdviceResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
