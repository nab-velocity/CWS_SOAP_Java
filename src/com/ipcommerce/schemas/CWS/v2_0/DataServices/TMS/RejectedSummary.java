/**
 * RejectedSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Summary information about the rejected transactions. Expected.
 * </summary>
 */
public class RejectedSummary  implements java.io.Serializable {
    /* <summary>
     *             The total count of rejected Credit transactions. Expected.
     * </summary> */
    private java.lang.Integer creditTransactionCount;

    /* <summary>
     *             The total count of rejected Debit transactions. Expected.
     * </summary> */
    private java.math.BigDecimal creditTransactionTotal;

    /* <summary>
     *             The total dollar amount for rejected Credit transactions.
     * Expected.
     *             </summary> */
    private java.lang.Integer debitTransactionCount;

    /* <summary>
     *             The total dollar amount for rejected Debit transactions.
     * Expected.
     *             </summary> */
    private java.math.BigDecimal debitTransactionTotal;

    public RejectedSummary() {
    }

    public RejectedSummary(
           java.lang.Integer creditTransactionCount,
           java.math.BigDecimal creditTransactionTotal,
           java.lang.Integer debitTransactionCount,
           java.math.BigDecimal debitTransactionTotal) {
           this.creditTransactionCount = creditTransactionCount;
           this.creditTransactionTotal = creditTransactionTotal;
           this.debitTransactionCount = debitTransactionCount;
           this.debitTransactionTotal = debitTransactionTotal;
    }


    /**
     * Gets the creditTransactionCount value for this RejectedSummary.
     * 
     * @return creditTransactionCount   * <summary>
     *             The total count of rejected Credit transactions. Expected.
     * </summary>
     */
    public java.lang.Integer getCreditTransactionCount() {
        return creditTransactionCount;
    }


    /**
     * Sets the creditTransactionCount value for this RejectedSummary.
     * 
     * @param creditTransactionCount   * <summary>
     *             The total count of rejected Credit transactions. Expected.
     * </summary>
     */
    public void setCreditTransactionCount(java.lang.Integer creditTransactionCount) {
        this.creditTransactionCount = creditTransactionCount;
    }


    /**
     * Gets the creditTransactionTotal value for this RejectedSummary.
     * 
     * @return creditTransactionTotal   * <summary>
     *             The total count of rejected Debit transactions. Expected.
     * </summary>
     */
    public java.math.BigDecimal getCreditTransactionTotal() {
        return creditTransactionTotal;
    }


    /**
     * Sets the creditTransactionTotal value for this RejectedSummary.
     * 
     * @param creditTransactionTotal   * <summary>
     *             The total count of rejected Debit transactions. Expected.
     * </summary>
     */
    public void setCreditTransactionTotal(java.math.BigDecimal creditTransactionTotal) {
        this.creditTransactionTotal = creditTransactionTotal;
    }


    /**
     * Gets the debitTransactionCount value for this RejectedSummary.
     * 
     * @return debitTransactionCount   * <summary>
     *             The total dollar amount for rejected Credit transactions.
     * Expected.
     *             </summary>
     */
    public java.lang.Integer getDebitTransactionCount() {
        return debitTransactionCount;
    }


    /**
     * Sets the debitTransactionCount value for this RejectedSummary.
     * 
     * @param debitTransactionCount   * <summary>
     *             The total dollar amount for rejected Credit transactions.
     * Expected.
     *             </summary>
     */
    public void setDebitTransactionCount(java.lang.Integer debitTransactionCount) {
        this.debitTransactionCount = debitTransactionCount;
    }


    /**
     * Gets the debitTransactionTotal value for this RejectedSummary.
     * 
     * @return debitTransactionTotal   * <summary>
     *             The total dollar amount for rejected Debit transactions.
     * Expected.
     *             </summary>
     */
    public java.math.BigDecimal getDebitTransactionTotal() {
        return debitTransactionTotal;
    }


    /**
     * Sets the debitTransactionTotal value for this RejectedSummary.
     * 
     * @param debitTransactionTotal   * <summary>
     *             The total dollar amount for rejected Debit transactions.
     * Expected.
     *             </summary>
     */
    public void setDebitTransactionTotal(java.math.BigDecimal debitTransactionTotal) {
        this.debitTransactionTotal = debitTransactionTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RejectedSummary)) return false;
        RejectedSummary other = (RejectedSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditTransactionCount==null && other.getCreditTransactionCount()==null) || 
             (this.creditTransactionCount!=null &&
              this.creditTransactionCount.equals(other.getCreditTransactionCount()))) &&
            ((this.creditTransactionTotal==null && other.getCreditTransactionTotal()==null) || 
             (this.creditTransactionTotal!=null &&
              this.creditTransactionTotal.equals(other.getCreditTransactionTotal()))) &&
            ((this.debitTransactionCount==null && other.getDebitTransactionCount()==null) || 
             (this.debitTransactionCount!=null &&
              this.debitTransactionCount.equals(other.getDebitTransactionCount()))) &&
            ((this.debitTransactionTotal==null && other.getDebitTransactionTotal()==null) || 
             (this.debitTransactionTotal!=null &&
              this.debitTransactionTotal.equals(other.getDebitTransactionTotal())));
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
        if (getCreditTransactionCount() != null) {
            _hashCode += getCreditTransactionCount().hashCode();
        }
        if (getCreditTransactionTotal() != null) {
            _hashCode += getCreditTransactionTotal().hashCode();
        }
        if (getDebitTransactionCount() != null) {
            _hashCode += getDebitTransactionCount().hashCode();
        }
        if (getDebitTransactionTotal() != null) {
            _hashCode += getDebitTransactionTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RejectedSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "RejectedSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditTransactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CreditTransactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditTransactionTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CreditTransactionTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitTransactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "DebitTransactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitTransactionTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "DebitTransactionTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
