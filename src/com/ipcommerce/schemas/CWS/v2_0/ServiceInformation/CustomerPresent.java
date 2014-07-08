/**
 * CustomerPresent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class CustomerPresent implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerPresent(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Present = "Present";
    public static final java.lang.String _Suspicious = "Suspicious";
    public static final java.lang.String _BillPayment = "BillPayment";
    public static final java.lang.String _Transponder = "Transponder";
    public static final java.lang.String _MOTO = "MOTO";
    public static final java.lang.String _VisaOpenNetworkTransaction = "VisaOpenNetworkTransaction";
    public static final java.lang.String _VisaCardPresentStripeUnreadable = "VisaCardPresentStripeUnreadable";
    public static final java.lang.String _MailFax = "MailFax";
    public static final java.lang.String _Ecommerce = "Ecommerce";
    public static final java.lang.String _TelARU = "TelARU";
    public static final java.lang.String _MOTOCC = "MOTOCC";
    public static final java.lang.String _VoiceResponse = "VoiceResponse";
    public static final CustomerPresent NotSet = new CustomerPresent(_NotSet);
    public static final CustomerPresent Present = new CustomerPresent(_Present);
    public static final CustomerPresent Suspicious = new CustomerPresent(_Suspicious);
    public static final CustomerPresent BillPayment = new CustomerPresent(_BillPayment);
    public static final CustomerPresent Transponder = new CustomerPresent(_Transponder);
    public static final CustomerPresent MOTO = new CustomerPresent(_MOTO);
    public static final CustomerPresent VisaOpenNetworkTransaction = new CustomerPresent(_VisaOpenNetworkTransaction);
    public static final CustomerPresent VisaCardPresentStripeUnreadable = new CustomerPresent(_VisaCardPresentStripeUnreadable);
    public static final CustomerPresent MailFax = new CustomerPresent(_MailFax);
    public static final CustomerPresent Ecommerce = new CustomerPresent(_Ecommerce);
    public static final CustomerPresent TelARU = new CustomerPresent(_TelARU);
    public static final CustomerPresent MOTOCC = new CustomerPresent(_MOTOCC);
    public static final CustomerPresent VoiceResponse = new CustomerPresent(_VoiceResponse);
    public java.lang.String getValue() { return _value_;}
    public static CustomerPresent fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerPresent enumeration = (CustomerPresent)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerPresent fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerPresent.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerPresent"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
