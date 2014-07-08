/**
 * PINDebitUndoReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;

public class PINDebitUndoReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PINDebitUndoReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _NotApplicable = "NotApplicable";
    public static final java.lang.String _NoResponse = "NoResponse";
    public static final java.lang.String _LateResponse = "LateResponse";
    public static final java.lang.String _UnableToDeliverToPOS = "UnableToDeliverToPOS";
    public static final java.lang.String _CustomerCancellation = "CustomerCancellation";
    public static final java.lang.String _SuspectMalfunction = "SuspectMalfunction";
    public static final java.lang.String _PartiallyCompleted = "PartiallyCompleted";
    public static final java.lang.String _OriginalAmountIncorrect = "OriginalAmountIncorrect";
    public static final java.lang.String _ResponseIncomplete = "ResponseIncomplete";
    public static final java.lang.String _CADFailure = "CADFailure";
    public static final java.lang.String _UnableToDeliverResponse = "UnableToDeliverResponse";
    public static final java.lang.String _ResponseTimeout = "ResponseTimeout";
    public static final PINDebitUndoReason NotSet = new PINDebitUndoReason(_NotSet);
    public static final PINDebitUndoReason NotApplicable = new PINDebitUndoReason(_NotApplicable);
    public static final PINDebitUndoReason NoResponse = new PINDebitUndoReason(_NoResponse);
    public static final PINDebitUndoReason LateResponse = new PINDebitUndoReason(_LateResponse);
    public static final PINDebitUndoReason UnableToDeliverToPOS = new PINDebitUndoReason(_UnableToDeliverToPOS);
    public static final PINDebitUndoReason CustomerCancellation = new PINDebitUndoReason(_CustomerCancellation);
    public static final PINDebitUndoReason SuspectMalfunction = new PINDebitUndoReason(_SuspectMalfunction);
    public static final PINDebitUndoReason PartiallyCompleted = new PINDebitUndoReason(_PartiallyCompleted);
    public static final PINDebitUndoReason OriginalAmountIncorrect = new PINDebitUndoReason(_OriginalAmountIncorrect);
    public static final PINDebitUndoReason ResponseIncomplete = new PINDebitUndoReason(_ResponseIncomplete);
    public static final PINDebitUndoReason CADFailure = new PINDebitUndoReason(_CADFailure);
    public static final PINDebitUndoReason UnableToDeliverResponse = new PINDebitUndoReason(_UnableToDeliverResponse);
    public static final PINDebitUndoReason ResponseTimeout = new PINDebitUndoReason(_ResponseTimeout);
    public java.lang.String getValue() { return _value_;}
    public static PINDebitUndoReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PINDebitUndoReason enumeration = (PINDebitUndoReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PINDebitUndoReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PINDebitUndoReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitUndoReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
