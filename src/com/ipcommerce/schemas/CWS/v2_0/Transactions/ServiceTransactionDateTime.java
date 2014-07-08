/**
 * ServiceTransactionDateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             The local date and time of the transaction as calculated
 * by the Service Provider. If present in the response, this same data
 * element and value must be provided when settling a subsequent authorization
 * completion. Optional.
 *             </summary>
 */
public class ServiceTransactionDateTime  implements java.io.Serializable {
    /* <summary>
     *             Date. Optional.
     *             </summary> */
    private java.lang.String date;

    /* <summary>
     *             Time. Optional.
     *             </summary> */
    private java.lang.String time;

    /* <summary>
     *             Timezone. Optional.
     *             </summary> */
    private java.lang.String timeZone;

    public ServiceTransactionDateTime() {
    }

    public ServiceTransactionDateTime(
           java.lang.String date,
           java.lang.String time,
           java.lang.String timeZone) {
           this.date = date;
           this.time = time;
           this.timeZone = timeZone;
    }


    /**
     * Gets the date value for this ServiceTransactionDateTime.
     * 
     * @return date   * <summary>
     *             Date. Optional.
     *             </summary>
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ServiceTransactionDateTime.
     * 
     * @param date   * <summary>
     *             Date. Optional.
     *             </summary>
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the time value for this ServiceTransactionDateTime.
     * 
     * @return time   * <summary>
     *             Time. Optional.
     *             </summary>
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this ServiceTransactionDateTime.
     * 
     * @param time   * <summary>
     *             Time. Optional.
     *             </summary>
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the timeZone value for this ServiceTransactionDateTime.
     * 
     * @return timeZone   * <summary>
     *             Timezone. Optional.
     *             </summary>
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ServiceTransactionDateTime.
     * 
     * @param timeZone   * <summary>
     *             Timezone. Optional.
     *             </summary>
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceTransactionDateTime)) return false;
        ServiceTransactionDateTime other = (ServiceTransactionDateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceTransactionDateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ServiceTransactionDateTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
