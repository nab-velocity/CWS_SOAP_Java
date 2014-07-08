/**
 * SummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains transaction summary information. Expected.
 *             </summary>
 */
public class SummaryDetail  implements java.io.Serializable {
    /* <summary>
     *             Information about the transaction relative to related
     * transactions. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation familyInformation;

    /* <summary>
     *             High-level information about the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation transactionInformation;

    public SummaryDetail() {
    }

    public SummaryDetail(
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation familyInformation,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation transactionInformation) {
           this.familyInformation = familyInformation;
           this.transactionInformation = transactionInformation;
    }


    /**
     * Gets the familyInformation value for this SummaryDetail.
     * 
     * @return familyInformation   * <summary>
     *             Information about the transaction relative to related
     * transactions. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation getFamilyInformation() {
        return familyInformation;
    }


    /**
     * Sets the familyInformation value for this SummaryDetail.
     * 
     * @param familyInformation   * <summary>
     *             Information about the transaction relative to related
     * transactions. Expected.
     *             </summary>
     */
    public void setFamilyInformation(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation familyInformation) {
        this.familyInformation = familyInformation;
    }


    /**
     * Gets the transactionInformation value for this SummaryDetail.
     * 
     * @return transactionInformation   * <summary>
     *             High-level information about the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation getTransactionInformation() {
        return transactionInformation;
    }


    /**
     * Sets the transactionInformation value for this SummaryDetail.
     * 
     * @param transactionInformation   * <summary>
     *             High-level information about the transaction. Expected.
     * </summary>
     */
    public void setTransactionInformation(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SummaryDetail)) return false;
        SummaryDetail other = (SummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.familyInformation==null && other.getFamilyInformation()==null) || 
             (this.familyInformation!=null &&
              this.familyInformation.equals(other.getFamilyInformation()))) &&
            ((this.transactionInformation==null && other.getTransactionInformation()==null) || 
             (this.transactionInformation!=null &&
              this.transactionInformation.equals(other.getTransactionInformation())));
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
        if (getFamilyInformation() != null) {
            _hashCode += getFamilyInformation().hashCode();
        }
        if (getTransactionInformation() != null) {
            _hashCode += getTransactionInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionInformation"));
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
