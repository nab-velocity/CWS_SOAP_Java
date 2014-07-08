/**
 * TransactionState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class TransactionState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Declined = "Declined";
    public static final java.lang.String _Verified = "Verified";
    public static final java.lang.String _Authorized = "Authorized";
    public static final java.lang.String _Adjusted = "Adjusted";
    public static final java.lang.String _Captured = "Captured";
    public static final java.lang.String _CaptureDeclined = "CaptureDeclined";
    public static final java.lang.String _PartiallyCaptured = "PartiallyCaptured";
    public static final java.lang.String _Undone = "Undone";
    public static final java.lang.String _ReturnRequested = "ReturnRequested";
    public static final java.lang.String _PartialReturnRequested = "PartialReturnRequested";
    public static final java.lang.String _ReturnUndone = "ReturnUndone";
    public static final java.lang.String _Returned = "Returned";
    public static final java.lang.String _PartiallyReturned = "PartiallyReturned";
    public static final java.lang.String _InProcess = "InProcess";
    public static final java.lang.String _ErrorValidation = "ErrorValidation";
    public static final java.lang.String _ErrorUnknown = "ErrorUnknown";
    public static final java.lang.String _ErrorConnecting = "ErrorConnecting";
    public static final java.lang.String _FundsRequested = "FundsRequested";
    public static final java.lang.String _FundsTransferred = "FundsTransferred";
    public static final TransactionState NotSet = new TransactionState(_NotSet);
    public static final TransactionState Declined = new TransactionState(_Declined);
    public static final TransactionState Verified = new TransactionState(_Verified);
    public static final TransactionState Authorized = new TransactionState(_Authorized);
    public static final TransactionState Adjusted = new TransactionState(_Adjusted);
    public static final TransactionState Captured = new TransactionState(_Captured);
    public static final TransactionState CaptureDeclined = new TransactionState(_CaptureDeclined);
    public static final TransactionState PartiallyCaptured = new TransactionState(_PartiallyCaptured);
    public static final TransactionState Undone = new TransactionState(_Undone);
    public static final TransactionState ReturnRequested = new TransactionState(_ReturnRequested);
    public static final TransactionState PartialReturnRequested = new TransactionState(_PartialReturnRequested);
    public static final TransactionState ReturnUndone = new TransactionState(_ReturnUndone);
    public static final TransactionState Returned = new TransactionState(_Returned);
    public static final TransactionState PartiallyReturned = new TransactionState(_PartiallyReturned);
    public static final TransactionState InProcess = new TransactionState(_InProcess);
    public static final TransactionState ErrorValidation = new TransactionState(_ErrorValidation);
    public static final TransactionState ErrorUnknown = new TransactionState(_ErrorUnknown);
    public static final TransactionState ErrorConnecting = new TransactionState(_ErrorConnecting);
    public static final TransactionState FundsRequested = new TransactionState(_FundsRequested);
    public static final TransactionState FundsTransferred = new TransactionState(_FundsTransferred);
    public java.lang.String getValue() { return _value_;}
    public static TransactionState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionState enumeration = (TransactionState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
