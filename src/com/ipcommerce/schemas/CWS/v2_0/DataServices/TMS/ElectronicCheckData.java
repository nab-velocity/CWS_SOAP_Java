/**
 * ElectronicCheckData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Transaction information specific to Electronic Checking
 * transactions. Conditional, included if query results include Electronic
 * Checking transactions.
 *             </summary>
 */
public class ElectronicCheckData  implements java.io.Serializable {
    /* <summary>
     *             The check number as printed on the check. Expected.
     *             </summary> */
    private java.lang.String checkNumber;

    /* <summary>
     *             Masked account number from the check. Expected.
     *             </summary> */
    private java.lang.String maskedAccountNumber;

    /* <summary>
     *             Indicates the transaction type; either Credit or Debit.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType;

    public ElectronicCheckData() {
    }

    public ElectronicCheckData(
           java.lang.String checkNumber,
           java.lang.String maskedAccountNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType) {
           this.checkNumber = checkNumber;
           this.maskedAccountNumber = maskedAccountNumber;
           this.transactionType = transactionType;
    }


    /**
     * Gets the checkNumber value for this ElectronicCheckData.
     * 
     * @return checkNumber   * <summary>
     *             The check number as printed on the check. Expected.
     *             </summary>
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this ElectronicCheckData.
     * 
     * @param checkNumber   * <summary>
     *             The check number as printed on the check. Expected.
     *             </summary>
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the maskedAccountNumber value for this ElectronicCheckData.
     * 
     * @return maskedAccountNumber   * <summary>
     *             Masked account number from the check. Expected.
     *             </summary>
     */
    public java.lang.String getMaskedAccountNumber() {
        return maskedAccountNumber;
    }


    /**
     * Sets the maskedAccountNumber value for this ElectronicCheckData.
     * 
     * @param maskedAccountNumber   * <summary>
     *             Masked account number from the check. Expected.
     *             </summary>
     */
    public void setMaskedAccountNumber(java.lang.String maskedAccountNumber) {
        this.maskedAccountNumber = maskedAccountNumber;
    }


    /**
     * Gets the transactionType value for this ElectronicCheckData.
     * 
     * @return transactionType   * <summary>
     *             Indicates the transaction type; either Credit or Debit.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this ElectronicCheckData.
     * 
     * @param transactionType   * <summary>
     *             Indicates the transaction type; either Credit or Debit.
     * Expected.
     *             </summary>
     */
    public void setTransactionType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckData)) return false;
        ElectronicCheckData other = (ElectronicCheckData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.maskedAccountNumber==null && other.getMaskedAccountNumber()==null) || 
             (this.maskedAccountNumber!=null &&
              this.maskedAccountNumber.equals(other.getMaskedAccountNumber()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getMaskedAccountNumber() != null) {
            _hashCode += getMaskedAccountNumber().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CheckNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "MaskedAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "TransactionType"));
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
