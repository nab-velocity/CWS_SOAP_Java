/**
 * ElectronicCheckingUndo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ElectronicCheckingUndo  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo  implements java.io.Serializable {
    /* <summary>
     *             Specifies the undo type.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UndoType undoType;

    public ElectronicCheckingUndo() {
    }

    public ElectronicCheckingUndo(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UndoType undoType) {
        super(
            transactionId,
            addendum);
        this.undoType = undoType;
    }


    /**
     * Gets the undoType value for this ElectronicCheckingUndo.
     * 
     * @return undoType   * <summary>
     *             Specifies the undo type.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UndoType getUndoType() {
        return undoType;
    }


    /**
     * Sets the undoType value for this ElectronicCheckingUndo.
     * 
     * @param undoType   * <summary>
     *             Specifies the undo type.
     *             </summary>
     */
    public void setUndoType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UndoType undoType) {
        this.undoType = undoType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingUndo)) return false;
        ElectronicCheckingUndo other = (ElectronicCheckingUndo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.undoType==null && other.getUndoType()==null) || 
             (this.undoType!=null &&
              this.undoType.equals(other.getUndoType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUndoType() != null) {
            _hashCode += getUndoType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingUndo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingUndo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undoType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UndoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UndoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
