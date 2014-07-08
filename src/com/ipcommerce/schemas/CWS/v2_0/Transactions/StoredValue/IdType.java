/**
 * IdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;

public class IdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _PIN = "PIN";
    public static final java.lang.String _PINEncrypted = "PINEncrypted";
    public static final java.lang.String _PINEncryptedKeySerialNumber = "PINEncryptedKeySerialNumber";
    public static final java.lang.String _PhoneNumber = "PhoneNumber";
    public static final java.lang.String _DriversLicenseNumber = "DriversLicenseNumber";
    public static final java.lang.String _EmailAddress = "EmailAddress";
    public static final java.lang.String _BiometricAlgorithm = "BiometricAlgorithm";
    public static final java.lang.String _BiometricMap = "BiometricMap";
    public static final java.lang.String _X509Certificate = "X509Certificate";
    public static final java.lang.String _Passphrase = "Passphrase";
    public static final java.lang.String _Hash = "Hash";
    public static final java.lang.String _PublicKey = "PublicKey";
    public static final java.lang.String _RetinaAlg = "RetinaAlg";
    public static final java.lang.String _RetinaMap = "RetinaMap";
    public static final java.lang.String _BarCode = "BarCode";
    public static final IdType NotSet = new IdType(_NotSet);
    public static final IdType PIN = new IdType(_PIN);
    public static final IdType PINEncrypted = new IdType(_PINEncrypted);
    public static final IdType PINEncryptedKeySerialNumber = new IdType(_PINEncryptedKeySerialNumber);
    public static final IdType PhoneNumber = new IdType(_PhoneNumber);
    public static final IdType DriversLicenseNumber = new IdType(_DriversLicenseNumber);
    public static final IdType EmailAddress = new IdType(_EmailAddress);
    public static final IdType BiometricAlgorithm = new IdType(_BiometricAlgorithm);
    public static final IdType BiometricMap = new IdType(_BiometricMap);
    public static final IdType X509Certificate = new IdType(_X509Certificate);
    public static final IdType Passphrase = new IdType(_Passphrase);
    public static final IdType Hash = new IdType(_Hash);
    public static final IdType PublicKey = new IdType(_PublicKey);
    public static final IdType RetinaAlg = new IdType(_RetinaAlg);
    public static final IdType RetinaMap = new IdType(_RetinaMap);
    public static final IdType BarCode = new IdType(_BarCode);
    public java.lang.String getValue() { return _value_;}
    public static IdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IdType enumeration = (IdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
