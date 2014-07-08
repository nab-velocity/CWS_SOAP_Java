/**
 * CommercialCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class CommercialCardResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CommercialCardResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _NotImplemented = "NotImplemented";
    public static final java.lang.String _PurchaseCard = "PurchaseCard";
    public static final java.lang.String _CorporateCard = "CorporateCard";
    public static final java.lang.String _BusinessCard = "BusinessCard";
    public static final java.lang.String _NonCommercialCard = "NonCommercialCard";
    public static final java.lang.String _PurchaseCardDataUnsupported = "PurchaseCardDataUnsupported";
    public static final java.lang.String _Unknown = "Unknown";
    public static final CommercialCardResponse NotSet = new CommercialCardResponse(_NotSet);
    public static final CommercialCardResponse NotImplemented = new CommercialCardResponse(_NotImplemented);
    public static final CommercialCardResponse PurchaseCard = new CommercialCardResponse(_PurchaseCard);
    public static final CommercialCardResponse CorporateCard = new CommercialCardResponse(_CorporateCard);
    public static final CommercialCardResponse BusinessCard = new CommercialCardResponse(_BusinessCard);
    public static final CommercialCardResponse NonCommercialCard = new CommercialCardResponse(_NonCommercialCard);
    public static final CommercialCardResponse PurchaseCardDataUnsupported = new CommercialCardResponse(_PurchaseCardDataUnsupported);
    public static final CommercialCardResponse Unknown = new CommercialCardResponse(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static CommercialCardResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CommercialCardResponse enumeration = (CommercialCardResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CommercialCardResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CommercialCardResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CommercialCardResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
