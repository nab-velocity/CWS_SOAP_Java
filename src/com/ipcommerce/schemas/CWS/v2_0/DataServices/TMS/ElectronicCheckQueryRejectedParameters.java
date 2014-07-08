/**
 * ElectronicCheckQueryRejectedParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Electronic Checking specific query parameters for QueryRejectedDetail
 * and QueryRejectedSummary. Required.
 *             </summary>
 */
public class ElectronicCheckQueryRejectedParameters  extends com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters  implements java.io.Serializable {
    /* <summary>
     *             Date range for the transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange queryDateRange;

    /* <summary>
     *             Indicates if the date range should query SubmitDate or
     * ReturnDate. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TypeDateType queryDateType;

    /* <summary>
     *             Specific service Id for the Service Provider supporting
     * QueryRejectedDetail and QueryRejectedSummary. Required.
     *             </summary> */
    private java.lang.String serviceId;

    public ElectronicCheckQueryRejectedParameters() {
    }

    public ElectronicCheckQueryRejectedParameters(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange queryDateRange,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TypeDateType queryDateType,
           java.lang.String serviceId) {
        super(
            addendum);
        this.queryDateRange = queryDateRange;
        this.queryDateType = queryDateType;
        this.serviceId = serviceId;
    }


    /**
     * Gets the queryDateRange value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @return queryDateRange   * <summary>
     *             Date range for the transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange getQueryDateRange() {
        return queryDateRange;
    }


    /**
     * Sets the queryDateRange value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @param queryDateRange   * <summary>
     *             Date range for the transactions. Required.
     *             </summary>
     */
    public void setQueryDateRange(com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange queryDateRange) {
        this.queryDateRange = queryDateRange;
    }


    /**
     * Gets the queryDateType value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @return queryDateType   * <summary>
     *             Indicates if the date range should query SubmitDate or
     * ReturnDate. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TypeDateType getQueryDateType() {
        return queryDateType;
    }


    /**
     * Sets the queryDateType value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @param queryDateType   * <summary>
     *             Indicates if the date range should query SubmitDate or
     * ReturnDate. Required.
     *             </summary>
     */
    public void setQueryDateType(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TypeDateType queryDateType) {
        this.queryDateType = queryDateType;
    }


    /**
     * Gets the serviceId value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @return serviceId   * <summary>
     *             Specific service Id for the Service Provider supporting
     * QueryRejectedDetail and QueryRejectedSummary. Required.
     *             </summary>
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ElectronicCheckQueryRejectedParameters.
     * 
     * @param serviceId   * <summary>
     *             Specific service Id for the Service Provider supporting
     * QueryRejectedDetail and QueryRejectedSummary. Required.
     *             </summary>
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckQueryRejectedParameters)) return false;
        ElectronicCheckQueryRejectedParameters other = (ElectronicCheckQueryRejectedParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.queryDateRange==null && other.getQueryDateRange()==null) || 
             (this.queryDateRange!=null &&
              this.queryDateRange.equals(other.getQueryDateRange()))) &&
            ((this.queryDateType==null && other.getQueryDateType()==null) || 
             (this.queryDateType!=null &&
              this.queryDateType.equals(other.getQueryDateType()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId())));
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
        if (getQueryDateRange() != null) {
            _hashCode += getQueryDateRange().hashCode();
        }
        if (getQueryDateType() != null) {
            _hashCode += getQueryDateType().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckQueryRejectedParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckQueryRejectedParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryDateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TypeDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ServiceId"));
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
