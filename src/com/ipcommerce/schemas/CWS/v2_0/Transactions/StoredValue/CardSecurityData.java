/**
 * CardSecurityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Contains security information for the payment card. Conditional,
 * required for PIN Debit transactions.
 *             </summary>
 */
public class CardSecurityData  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether or not CVD2 data was provided. Conditional,
     * required for keyed transactions. Recommended for card-not-present
     * authorizations. Not used in settlement.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided;

    /* <summary>
     *             Actual CVD2 data. Conditional, required if CVDataInd =
     * 'Provided'.
     *             </summary> */
    private java.lang.String CVData;

    public CardSecurityData() {
    }

    public CardSecurityData(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided,
           java.lang.String CVData) {
           this.CVDataProvided = CVDataProvided;
           this.CVData = CVData;
    }


    /**
     * Gets the CVDataProvided value for this CardSecurityData.
     * 
     * @return CVDataProvided   * <summary>
     *             Indicates whether or not CVD2 data was provided. Conditional,
     * required for keyed transactions. Recommended for card-not-present
     * authorizations. Not used in settlement.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided getCVDataProvided() {
        return CVDataProvided;
    }


    /**
     * Sets the CVDataProvided value for this CardSecurityData.
     * 
     * @param CVDataProvided   * <summary>
     *             Indicates whether or not CVD2 data was provided. Conditional,
     * required for keyed transactions. Recommended for card-not-present
     * authorizations. Not used in settlement.
     *             </summary>
     */
    public void setCVDataProvided(com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided CVDataProvided) {
        this.CVDataProvided = CVDataProvided;
    }


    /**
     * Gets the CVData value for this CardSecurityData.
     * 
     * @return CVData   * <summary>
     *             Actual CVD2 data. Conditional, required if CVDataInd =
     * 'Provided'.
     *             </summary>
     */
    public java.lang.String getCVData() {
        return CVData;
    }


    /**
     * Sets the CVData value for this CardSecurityData.
     * 
     * @param CVData   * <summary>
     *             Actual CVD2 data. Conditional, required if CVDataInd =
     * 'Provided'.
     *             </summary>
     */
    public void setCVData(java.lang.String CVData) {
        this.CVData = CVData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSecurityData)) return false;
        CardSecurityData other = (CardSecurityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CVDataProvided==null && other.getCVDataProvided()==null) || 
             (this.CVDataProvided!=null &&
              this.CVDataProvided.equals(other.getCVDataProvided()))) &&
            ((this.CVData==null && other.getCVData()==null) || 
             (this.CVData!=null &&
              this.CVData.equals(other.getCVData())));
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
        if (getCVDataProvided() != null) {
            _hashCode += getCVDataProvided().hashCode();
        }
        if (getCVData() != null) {
            _hashCode += getCVData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSecurityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardSecurityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVDataProvided");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CVDataProvided"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVDataProvided"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CVData"));
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
