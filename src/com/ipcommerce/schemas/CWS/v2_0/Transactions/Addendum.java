/**
 * Addendum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Used to pass optional service-specific information. It
 * is not necessary to pass this object unless specifically directed
 * to do so by your Solutions Consultant. Optional.
 *             </summary>
 */
public class Addendum  implements java.io.Serializable {
    /* <summary>
     *             Unmanaged addenda. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Unmanaged unmanaged;

    public Addendum() {
    }

    public Addendum(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Unmanaged unmanaged) {
           this.unmanaged = unmanaged;
    }


    /**
     * Gets the unmanaged value for this Addendum.
     * 
     * @return unmanaged   * <summary>
     *             Unmanaged addenda. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Unmanaged getUnmanaged() {
        return unmanaged;
    }


    /**
     * Sets the unmanaged value for this Addendum.
     * 
     * @param unmanaged   * <summary>
     *             Unmanaged addenda. Optional.
     *             </summary>
     */
    public void setUnmanaged(com.ipcommerce.schemas.CWS.v2_0.Transactions.Unmanaged unmanaged) {
        this.unmanaged = unmanaged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Addendum)) return false;
        Addendum other = (Addendum) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unmanaged==null && other.getUnmanaged()==null) || 
             (this.unmanaged!=null &&
              this.unmanaged.equals(other.getUnmanaged())));
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
        if (getUnmanaged() != null) {
            _hashCode += getUnmanaged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Addendum.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmanaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Unmanaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Unmanaged"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
