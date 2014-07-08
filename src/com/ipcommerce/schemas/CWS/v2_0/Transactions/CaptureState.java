/**
 * CaptureState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class CaptureState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CaptureState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _CannotCapture = "CannotCapture";
    public static final java.lang.String _ReadyForCapture = "ReadyForCapture";
    public static final java.lang.String _CapturePending = "CapturePending";
    public static final java.lang.String _Captured = "Captured";
    public static final java.lang.String _CaptureDeclined = "CaptureDeclined";
    public static final java.lang.String _InProcess = "InProcess";
    public static final java.lang.String _CapturedUndoPermitted = "CapturedUndoPermitted";
    public static final java.lang.String _CapturePendingUndoPermitted = "CapturePendingUndoPermitted";
    public static final java.lang.String _CaptureError = "CaptureError";
    public static final java.lang.String _CaptureUnknown = "CaptureUnknown";
    public static final java.lang.String _BatchSent = "BatchSent";
    public static final java.lang.String _BatchSentUndoPermitted = "BatchSentUndoPermitted";
    public static final CaptureState NotSet = new CaptureState(_NotSet);
    public static final CaptureState CannotCapture = new CaptureState(_CannotCapture);
    public static final CaptureState ReadyForCapture = new CaptureState(_ReadyForCapture);
    public static final CaptureState CapturePending = new CaptureState(_CapturePending);
    public static final CaptureState Captured = new CaptureState(_Captured);
    public static final CaptureState CaptureDeclined = new CaptureState(_CaptureDeclined);
    public static final CaptureState InProcess = new CaptureState(_InProcess);
    public static final CaptureState CapturedUndoPermitted = new CaptureState(_CapturedUndoPermitted);
    public static final CaptureState CapturePendingUndoPermitted = new CaptureState(_CapturePendingUndoPermitted);
    public static final CaptureState CaptureError = new CaptureState(_CaptureError);
    public static final CaptureState CaptureUnknown = new CaptureState(_CaptureUnknown);
    public static final CaptureState BatchSent = new CaptureState(_BatchSent);
    public static final CaptureState BatchSentUndoPermitted = new CaptureState(_BatchSentUndoPermitted);
    public java.lang.String getValue() { return _value_;}
    public static CaptureState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CaptureState enumeration = (CaptureState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CaptureState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CaptureState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
