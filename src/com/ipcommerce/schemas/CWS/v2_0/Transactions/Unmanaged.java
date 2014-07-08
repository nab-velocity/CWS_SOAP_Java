/**
 * Unmanaged.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Can be used to pass service-specific information such
 * as username/password or session token credentials. Optional.
 *             </summary>
 */
public class Unmanaged  implements java.io.Serializable {
    /* <summary>
     *             One or more xml strings. Required.
     *             </summary> */
    private java.lang.String[] any;

    public Unmanaged() {
    }

    public Unmanaged(
           java.lang.String[] any) {
           this.any = any;
    }


    /**
     * Gets the any value for this Unmanaged.
     * 
     * @return any   * <summary>
     *             One or more xml strings. Required.
     *             </summary>
     */
    public java.lang.String[] getAny() {
        return any;
    }


    /**
     * Sets the any value for this Unmanaged.
     * 
     * @param any   * <summary>
     *             One or more xml strings. Required.
     *             </summary>
     */
    public void setAny(java.lang.String[] any) {
        this.any = any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Unmanaged)) return false;
        Unmanaged other = (Unmanaged) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.any==null && other.getAny()==null) || 
             (this.any!=null &&
              java.util.Arrays.equals(this.any, other.getAny())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAny() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAny());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAny(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Unmanaged.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Unmanaged"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("any");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Any"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
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
