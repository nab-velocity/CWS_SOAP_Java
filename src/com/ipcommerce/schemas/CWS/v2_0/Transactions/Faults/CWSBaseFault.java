/**
 * CWSBaseFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults;

public class CWSBaseFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* <summary>
     *             The batch Id for the fault.
     *             </summary> */
    private java.lang.String batchId;

    /* <summary>
     *             The error code of the fault.
     *             </summary> */
    private java.lang.Integer errorID;

    /* <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary> */
    private java.lang.String helpURL;

    /* <summary>
     *             The CWS operation name that originated the fault.
     *             </summary> */
    private java.lang.String operation;

    /* <summary>
     *             Lists the specific error message for the associated fault.
     * </summary> */
    private java.lang.String problemType;

    /* <summary>
     *             The transaction Id associated with the fault.
     *             </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             The transaction state of the transaction Id associated
     * with the fault.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState;

    public CWSBaseFault() {
    }

    public CWSBaseFault(
           java.lang.String batchId,
           java.lang.Integer errorID,
           java.lang.String helpURL,
           java.lang.String operation,
           java.lang.String problemType,
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        this.batchId = batchId;
        this.errorID = errorID;
        this.helpURL = helpURL;
        this.operation = operation;
        this.problemType = problemType;
        this.transactionId = transactionId;
        this.transactionState = transactionState;
    }


    /**
     * Gets the batchId value for this CWSBaseFault.
     * 
     * @return batchId   * <summary>
     *             The batch Id for the fault.
     *             </summary>
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this CWSBaseFault.
     * 
     * @param batchId   * <summary>
     *             The batch Id for the fault.
     *             </summary>
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the errorID value for this CWSBaseFault.
     * 
     * @return errorID   * <summary>
     *             The error code of the fault.
     *             </summary>
     */
    public java.lang.Integer getErrorID() {
        return errorID;
    }


    /**
     * Sets the errorID value for this CWSBaseFault.
     * 
     * @param errorID   * <summary>
     *             The error code of the fault.
     *             </summary>
     */
    public void setErrorID(java.lang.Integer errorID) {
        this.errorID = errorID;
    }


    /**
     * Gets the helpURL value for this CWSBaseFault.
     * 
     * @return helpURL   * <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary>
     */
    public java.lang.String getHelpURL() {
        return helpURL;
    }


    /**
     * Sets the helpURL value for this CWSBaseFault.
     * 
     * @param helpURL   * <summary>
     *             The web URL that will display more information about the
     * fault.
     *             </summary>
     */
    public void setHelpURL(java.lang.String helpURL) {
        this.helpURL = helpURL;
    }


    /**
     * Gets the operation value for this CWSBaseFault.
     * 
     * @return operation   * <summary>
     *             The CWS operation name that originated the fault.
     *             </summary>
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CWSBaseFault.
     * 
     * @param operation   * <summary>
     *             The CWS operation name that originated the fault.
     *             </summary>
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the problemType value for this CWSBaseFault.
     * 
     * @return problemType   * <summary>
     *             Lists the specific error message for the associated fault.
     * </summary>
     */
    public java.lang.String getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this CWSBaseFault.
     * 
     * @param problemType   * <summary>
     *             Lists the specific error message for the associated fault.
     * </summary>
     */
    public void setProblemType(java.lang.String problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the transactionId value for this CWSBaseFault.
     * 
     * @return transactionId   * <summary>
     *             The transaction Id associated with the fault.
     *             </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CWSBaseFault.
     * 
     * @param transactionId   * <summary>
     *             The transaction Id associated with the fault.
     *             </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionState value for this CWSBaseFault.
     * 
     * @return transactionState   * <summary>
     *             The transaction state of the transaction Id associated
     * with the fault.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getTransactionState() {
        return transactionState;
    }


    /**
     * Sets the transactionState value for this CWSBaseFault.
     * 
     * @param transactionState   * <summary>
     *             The transaction state of the transaction Id associated
     * with the fault.
     *             </summary>
     */
    public void setTransactionState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        this.transactionState = transactionState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CWSBaseFault)) return false;
        CWSBaseFault other = (CWSBaseFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.errorID==null && other.getErrorID()==null) || 
             (this.errorID!=null &&
              this.errorID.equals(other.getErrorID()))) &&
            ((this.helpURL==null && other.getHelpURL()==null) || 
             (this.helpURL!=null &&
              this.helpURL.equals(other.getHelpURL()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionState==null && other.getTransactionState()==null) || 
             (this.transactionState!=null &&
              this.transactionState.equals(other.getTransactionState())));
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
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getErrorID() != null) {
            _hashCode += getErrorID().hashCode();
        }
        if (getHelpURL() != null) {
            _hashCode += getHelpURL().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionState() != null) {
            _hashCode += getTransactionState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CWSBaseFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSBaseFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "ErrorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "HelpURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "ProblemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "TransactionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
