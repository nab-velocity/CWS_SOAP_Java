/**
 * ReturnInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;


/**
 * <summary>
 *             Contains information about the reason the bank rejected
 * the transaction. Optional.
 *             </summary>
 */
public class ReturnInformation  implements java.io.Serializable {
    /* <summary>
     *             Code that indicates why the transaction was returned.
     * Optional.
     *             </summary> */
    private java.lang.String returnCode;

    /* <summary>
     *             The date the transaction was returned by the bank. Optional.
     * </summary> */
    private java.util.Calendar returnDate;

    /* <summary>
     *             Reason that indicates why the transaction was returned.
     * Optional.
     *             </summary> */
    private java.lang.String returnReason;

    public ReturnInformation() {
    }

    public ReturnInformation(
           java.lang.String returnCode,
           java.util.Calendar returnDate,
           java.lang.String returnReason) {
           this.returnCode = returnCode;
           this.returnDate = returnDate;
           this.returnReason = returnReason;
    }


    /**
     * Gets the returnCode value for this ReturnInformation.
     * 
     * @return returnCode   * <summary>
     *             Code that indicates why the transaction was returned.
     * Optional.
     *             </summary>
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ReturnInformation.
     * 
     * @param returnCode   * <summary>
     *             Code that indicates why the transaction was returned.
     * Optional.
     *             </summary>
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnDate value for this ReturnInformation.
     * 
     * @return returnDate   * <summary>
     *             The date the transaction was returned by the bank. Optional.
     * </summary>
     */
    public java.util.Calendar getReturnDate() {
        return returnDate;
    }


    /**
     * Sets the returnDate value for this ReturnInformation.
     * 
     * @param returnDate   * <summary>
     *             The date the transaction was returned by the bank. Optional.
     * </summary>
     */
    public void setReturnDate(java.util.Calendar returnDate) {
        this.returnDate = returnDate;
    }


    /**
     * Gets the returnReason value for this ReturnInformation.
     * 
     * @return returnReason   * <summary>
     *             Reason that indicates why the transaction was returned.
     * Optional.
     *             </summary>
     */
    public java.lang.String getReturnReason() {
        return returnReason;
    }


    /**
     * Sets the returnReason value for this ReturnInformation.
     * 
     * @param returnReason   * <summary>
     *             Reason that indicates why the transaction was returned.
     * Optional.
     *             </summary>
     */
    public void setReturnReason(java.lang.String returnReason) {
        this.returnReason = returnReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnInformation)) return false;
        ReturnInformation other = (ReturnInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.returnDate==null && other.getReturnDate()==null) || 
             (this.returnDate!=null &&
              this.returnDate.equals(other.getReturnDate()))) &&
            ((this.returnReason==null && other.getReturnReason()==null) || 
             (this.returnReason!=null &&
              this.returnReason.equals(other.getReturnReason())));
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
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getReturnDate() != null) {
            _hashCode += getReturnDate().hashCode();
        }
        if (getReturnReason() != null) {
            _hashCode += getReturnReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnReason"));
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
