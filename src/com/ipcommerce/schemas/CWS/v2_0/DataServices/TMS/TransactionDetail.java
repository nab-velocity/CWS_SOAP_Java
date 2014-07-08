/**
 * TransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains detailed transaction data. Expected.
 *             </summary>
 */
public class TransactionDetail  implements java.io.Serializable {
    /* <summary>
     *             The entire transaction in CWS or serialized XML format.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CompleteTransaction completeTransaction;

    /* <summary>
     *             Information about the transaction relative to related
     * transactions. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation familyInformation;

    /* <summary>
     *             High-level information about the transaction. Expected.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation transactionInformation;

    public TransactionDetail() {
    }

    public TransactionDetail(
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CompleteTransaction completeTransaction,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation familyInformation,
           com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation transactionInformation) {
           this.completeTransaction = completeTransaction;
           this.familyInformation = familyInformation;
           this.transactionInformation = transactionInformation;
    }


    /**
     * Gets the completeTransaction value for this TransactionDetail.
     * 
     * @return completeTransaction   * <summary>
     *             The entire transaction in CWS or serialized XML format.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CompleteTransaction getCompleteTransaction() {
        return completeTransaction;
    }


    /**
     * Sets the completeTransaction value for this TransactionDetail.
     * 
     * @param completeTransaction   * <summary>
     *             The entire transaction in CWS or serialized XML format.
     * Expected.
     *             </summary>
     */
    public void setCompleteTransaction(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CompleteTransaction completeTransaction) {
        this.completeTransaction = completeTransaction;
    }


    /**
     * Gets the familyInformation value for this TransactionDetail.
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
     * Sets the familyInformation value for this TransactionDetail.
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
     * Gets the transactionInformation value for this TransactionDetail.
     * 
     * @return transactionInformation   * <summary>
     *             High-level information about the transaction. Expected.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation getTransactionInformation() {
        return transactionInformation;
    }


    /**
     * Sets the transactionInformation value for this TransactionDetail.
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
        if (!(obj instanceof TransactionDetail)) return false;
        TransactionDetail other = (TransactionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.completeTransaction==null && other.getCompleteTransaction()==null) || 
             (this.completeTransaction!=null &&
              this.completeTransaction.equals(other.getCompleteTransaction()))) &&
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
        if (getCompleteTransaction() != null) {
            _hashCode += getCompleteTransaction().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(TransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CompleteTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CompleteTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
