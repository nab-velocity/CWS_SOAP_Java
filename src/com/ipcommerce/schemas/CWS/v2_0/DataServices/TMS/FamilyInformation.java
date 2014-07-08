/**
 * FamilyInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;


/**
 * <summary>
 *             Contains summary information for the family of transactions.
 * Expected.
 *             </summary>
 */
public class FamilyInformation  implements java.io.Serializable {
    /* <summary>
     *             The ID of the transaction family. Expected.
     *             </summary> */
    private java.lang.String familyId;

    /* <summary>
     *             The total number of transactions in the family. Expected.
     * </summary> */
    private java.lang.Integer familySequenceCount;

    /* <summary>
     *             The position of this transaction in the family sequence.
     * Expected.
     *             </summary> */
    private java.lang.Integer familySequenceNumber;

    /* <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState;

    /* <summary>
     *             The net amount value for the transaction family. Expected.
     * </summary> */
    private java.math.BigDecimal netAmount;

    public FamilyInformation() {
    }

    public FamilyInformation(
           java.lang.String familyId,
           java.lang.Integer familySequenceCount,
           java.lang.Integer familySequenceNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState,
           java.math.BigDecimal netAmount) {
           this.familyId = familyId;
           this.familySequenceCount = familySequenceCount;
           this.familySequenceNumber = familySequenceNumber;
           this.familyState = familyState;
           this.netAmount = netAmount;
    }


    /**
     * Gets the familyId value for this FamilyInformation.
     * 
     * @return familyId   * <summary>
     *             The ID of the transaction family. Expected.
     *             </summary>
     */
    public java.lang.String getFamilyId() {
        return familyId;
    }


    /**
     * Sets the familyId value for this FamilyInformation.
     * 
     * @param familyId   * <summary>
     *             The ID of the transaction family. Expected.
     *             </summary>
     */
    public void setFamilyId(java.lang.String familyId) {
        this.familyId = familyId;
    }


    /**
     * Gets the familySequenceCount value for this FamilyInformation.
     * 
     * @return familySequenceCount   * <summary>
     *             The total number of transactions in the family. Expected.
     * </summary>
     */
    public java.lang.Integer getFamilySequenceCount() {
        return familySequenceCount;
    }


    /**
     * Sets the familySequenceCount value for this FamilyInformation.
     * 
     * @param familySequenceCount   * <summary>
     *             The total number of transactions in the family. Expected.
     * </summary>
     */
    public void setFamilySequenceCount(java.lang.Integer familySequenceCount) {
        this.familySequenceCount = familySequenceCount;
    }


    /**
     * Gets the familySequenceNumber value for this FamilyInformation.
     * 
     * @return familySequenceNumber   * <summary>
     *             The position of this transaction in the family sequence.
     * Expected.
     *             </summary>
     */
    public java.lang.Integer getFamilySequenceNumber() {
        return familySequenceNumber;
    }


    /**
     * Sets the familySequenceNumber value for this FamilyInformation.
     * 
     * @param familySequenceNumber   * <summary>
     *             The position of this transaction in the family sequence.
     * Expected.
     *             </summary>
     */
    public void setFamilySequenceNumber(java.lang.Integer familySequenceNumber) {
        this.familySequenceNumber = familySequenceNumber;
    }


    /**
     * Gets the familyState value for this FamilyInformation.
     * 
     * @return familyState   * <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getFamilyState() {
        return familyState;
    }


    /**
     * Sets the familyState value for this FamilyInformation.
     * 
     * @param familyState   * <summary>
     *             The current state of the family, defined as the state
     * of the last transaction in the family. Expected.
     *             </summary>
     */
    public void setFamilyState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState familyState) {
        this.familyState = familyState;
    }


    /**
     * Gets the netAmount value for this FamilyInformation.
     * 
     * @return netAmount   * <summary>
     *             The net amount value for the transaction family. Expected.
     * </summary>
     */
    public java.math.BigDecimal getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this FamilyInformation.
     * 
     * @param netAmount   * <summary>
     *             The net amount value for the transaction family. Expected.
     * </summary>
     */
    public void setNetAmount(java.math.BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FamilyInformation)) return false;
        FamilyInformation other = (FamilyInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.familyId==null && other.getFamilyId()==null) || 
             (this.familyId!=null &&
              this.familyId.equals(other.getFamilyId()))) &&
            ((this.familySequenceCount==null && other.getFamilySequenceCount()==null) || 
             (this.familySequenceCount!=null &&
              this.familySequenceCount.equals(other.getFamilySequenceCount()))) &&
            ((this.familySequenceNumber==null && other.getFamilySequenceNumber()==null) || 
             (this.familySequenceNumber!=null &&
              this.familySequenceNumber.equals(other.getFamilySequenceNumber()))) &&
            ((this.familyState==null && other.getFamilyState()==null) || 
             (this.familyState!=null &&
              this.familyState.equals(other.getFamilyState()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount())));
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
        if (getFamilyId() != null) {
            _hashCode += getFamilyId().hashCode();
        }
        if (getFamilySequenceCount() != null) {
            _hashCode += getFamilySequenceCount().hashCode();
        }
        if (getFamilySequenceNumber() != null) {
            _hashCode += getFamilySequenceNumber().hashCode();
        }
        if (getFamilyState() != null) {
            _hashCode += getFamilyState().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FamilyInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familySequenceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilySequenceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familySequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilySequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "NetAmount"));
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
