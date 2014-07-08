/**
 * InternetTransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information about the internet connection. Conditional,
 * required by some Service Providers. If this value is set on the transaction
 * and not required by the Service Provider, the data will not be present
 * on the transaction.
 *             </summary>
 */
public class InternetTransactionData  implements java.io.Serializable {
    /* <summary>
     *             The IP Address of the client application. Conditional,
     * required by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary> */
    private java.lang.String ipAddress;

    /* <summary>
     *             The Session Id of the application. Conditional, required
     * by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary> */
    private java.lang.String sessionId;

    public InternetTransactionData() {
    }

    public InternetTransactionData(
           java.lang.String ipAddress,
           java.lang.String sessionId) {
           this.ipAddress = ipAddress;
           this.sessionId = sessionId;
    }


    /**
     * Gets the ipAddress value for this InternetTransactionData.
     * 
     * @return ipAddress   * <summary>
     *             The IP Address of the client application. Conditional,
     * required by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary>
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this InternetTransactionData.
     * 
     * @param ipAddress   * <summary>
     *             The IP Address of the client application. Conditional,
     * required by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary>
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the sessionId value for this InternetTransactionData.
     * 
     * @return sessionId   * <summary>
     *             The Session Id of the application. Conditional, required
     * by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary>
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InternetTransactionData.
     * 
     * @param sessionId   * <summary>
     *             The Session Id of the application. Conditional, required
     * by some Service Providers. If this value is set on the transaction
     * and not required by the Service Provider, the data will not be present
     * on the transaction.
     *             </summary>
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternetTransactionData)) return false;
        InternetTransactionData other = (InternetTransactionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternetTransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InternetTransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "SessionId"));
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
