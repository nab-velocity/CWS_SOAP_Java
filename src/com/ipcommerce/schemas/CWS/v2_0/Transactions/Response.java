/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;

public class Response  implements java.io.Serializable {
    /* <summary>
     *             Shows whether transaction was a success or failure. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status;

    /* <summary>
     *             Status code returned from the service. Expected.
     *             </summary> */
    private java.lang.String statusCode;

    /* <summary>
     *             Verbose message describing the status of the transaction.
     * Optional.
     *             </summary> */
    private java.lang.String statusMessage;

    /* <summary>
     *             Transaction identifier that may be used for subsequent
     * Commerce Web Services transactions. Expected.
     *             </summary> */
    private java.lang.String transactionId;

    /* <summary>
     *             Transaction identifier assigned by Commerce Web Services
     * before sending the transaction to the Service Provider. May be useful
     * for identifying the transaction when contacting the service offline.
     * This will always be returned to the client application. Required.
     *             </summary> */
    private java.lang.String originatorTransactionId;

    /* <summary>
     *             Transaction identifier assigned by the Service Provider.
     * May be useful for identifying the transaction when contacting the
     * Service Provider offline. Expected.
     *             </summary> */
    private java.lang.String serviceTransactionId;

    /* <summary>
     *             The local date and time of the transaction as calculated
     * by the service. Expected, although amount of detail varies between
     * services.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime;

    /* <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum;

    /* <summary>
     *             Indicates the state of the transaction as it relates to
     * capture. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState;

    /* <summary>
     *             Indicates the current state of a transaction. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState;

    /* <summary>
     *             Indicates if the transaction has been acknowledged by
     * the client application.  Required.
     *             </summary> */
    private java.lang.Boolean isAcknowledged;

    /* <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary> */
    private java.lang.String reference;

    public Response() {
    }

    public Response(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status,
           java.lang.String statusCode,
           java.lang.String statusMessage,
           java.lang.String transactionId,
           java.lang.String originatorTransactionId,
           java.lang.String serviceTransactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.Boolean isAcknowledged,
           java.lang.String reference) {
           this.status = status;
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.transactionId = transactionId;
           this.originatorTransactionId = originatorTransactionId;
           this.serviceTransactionId = serviceTransactionId;
           this.serviceTransactionDateTime = serviceTransactionDateTime;
           this.addendum = addendum;
           this.captureState = captureState;
           this.transactionState = transactionState;
           this.isAcknowledged = isAcknowledged;
           this.reference = reference;
    }


    /**
     * Gets the status value for this Response.
     * 
     * @return status   * <summary>
     *             Shows whether transaction was a success or failure. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Response.
     * 
     * @param status   * <summary>
     *             Shows whether transaction was a success or failure. Required.
     * </summary>
     */
    public void setStatus(com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status) {
        this.status = status;
    }


    /**
     * Gets the statusCode value for this Response.
     * 
     * @return statusCode   * <summary>
     *             Status code returned from the service. Expected.
     *             </summary>
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this Response.
     * 
     * @param statusCode   * <summary>
     *             Status code returned from the service. Expected.
     *             </summary>
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this Response.
     * 
     * @return statusMessage   * <summary>
     *             Verbose message describing the status of the transaction.
     * Optional.
     *             </summary>
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this Response.
     * 
     * @param statusMessage   * <summary>
     *             Verbose message describing the status of the transaction.
     * Optional.
     *             </summary>
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the transactionId value for this Response.
     * 
     * @return transactionId   * <summary>
     *             Transaction identifier that may be used for subsequent
     * Commerce Web Services transactions. Expected.
     *             </summary>
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Response.
     * 
     * @param transactionId   * <summary>
     *             Transaction identifier that may be used for subsequent
     * Commerce Web Services transactions. Expected.
     *             </summary>
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the originatorTransactionId value for this Response.
     * 
     * @return originatorTransactionId   * <summary>
     *             Transaction identifier assigned by Commerce Web Services
     * before sending the transaction to the Service Provider. May be useful
     * for identifying the transaction when contacting the service offline.
     * This will always be returned to the client application. Required.
     *             </summary>
     */
    public java.lang.String getOriginatorTransactionId() {
        return originatorTransactionId;
    }


    /**
     * Sets the originatorTransactionId value for this Response.
     * 
     * @param originatorTransactionId   * <summary>
     *             Transaction identifier assigned by Commerce Web Services
     * before sending the transaction to the Service Provider. May be useful
     * for identifying the transaction when contacting the service offline.
     * This will always be returned to the client application. Required.
     *             </summary>
     */
    public void setOriginatorTransactionId(java.lang.String originatorTransactionId) {
        this.originatorTransactionId = originatorTransactionId;
    }


    /**
     * Gets the serviceTransactionId value for this Response.
     * 
     * @return serviceTransactionId   * <summary>
     *             Transaction identifier assigned by the Service Provider.
     * May be useful for identifying the transaction when contacting the
     * Service Provider offline. Expected.
     *             </summary>
     */
    public java.lang.String getServiceTransactionId() {
        return serviceTransactionId;
    }


    /**
     * Sets the serviceTransactionId value for this Response.
     * 
     * @param serviceTransactionId   * <summary>
     *             Transaction identifier assigned by the Service Provider.
     * May be useful for identifying the transaction when contacting the
     * Service Provider offline. Expected.
     *             </summary>
     */
    public void setServiceTransactionId(java.lang.String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }


    /**
     * Gets the serviceTransactionDateTime value for this Response.
     * 
     * @return serviceTransactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the service. Expected, although amount of detail varies between
     * services.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime getServiceTransactionDateTime() {
        return serviceTransactionDateTime;
    }


    /**
     * Sets the serviceTransactionDateTime value for this Response.
     * 
     * @param serviceTransactionDateTime   * <summary>
     *             The local date and time of the transaction as calculated
     * by the service. Expected, although amount of detail varies between
     * services.
     *             </summary>
     */
    public void setServiceTransactionDateTime(com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime) {
        this.serviceTransactionDateTime = serviceTransactionDateTime;
    }


    /**
     * Gets the addendum value for this Response.
     * 
     * @return addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum getAddendum() {
        return addendum;
    }


    /**
     * Sets the addendum value for this Response.
     * 
     * @param addendum   * <summary>
     *             Managed and unmanaged addendum. Optional.
     *             </summary>
     */
    public void setAddendum(com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum) {
        this.addendum = addendum;
    }


    /**
     * Gets the captureState value for this Response.
     * 
     * @return captureState   * <summary>
     *             Indicates the state of the transaction as it relates to
     * capture. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState getCaptureState() {
        return captureState;
    }


    /**
     * Sets the captureState value for this Response.
     * 
     * @param captureState   * <summary>
     *             Indicates the state of the transaction as it relates to
     * capture. Required.
     *             </summary>
     */
    public void setCaptureState(com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState) {
        this.captureState = captureState;
    }


    /**
     * Gets the transactionState value for this Response.
     * 
     * @return transactionState   * <summary>
     *             Indicates the current state of a transaction. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState getTransactionState() {
        return transactionState;
    }


    /**
     * Sets the transactionState value for this Response.
     * 
     * @param transactionState   * <summary>
     *             Indicates the current state of a transaction. Required.
     * </summary>
     */
    public void setTransactionState(com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        this.transactionState = transactionState;
    }


    /**
     * Gets the isAcknowledged value for this Response.
     * 
     * @return isAcknowledged   * <summary>
     *             Indicates if the transaction has been acknowledged by
     * the client application.  Required.
     *             </summary>
     */
    public java.lang.Boolean getIsAcknowledged() {
        return isAcknowledged;
    }


    /**
     * Sets the isAcknowledged value for this Response.
     * 
     * @param isAcknowledged   * <summary>
     *             Indicates if the transaction has been acknowledged by
     * the client application.  Required.
     *             </summary>
     */
    public void setIsAcknowledged(java.lang.Boolean isAcknowledged) {
        this.isAcknowledged = isAcknowledged;
    }


    /**
     * Gets the reference value for this Response.
     * 
     * @return reference   * <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary>
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this Response.
     * 
     * @param reference   * <summary>
     *             Specifies user or customer reference data echoed from
     * the request. Optional.
     *             </summary>
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.originatorTransactionId==null && other.getOriginatorTransactionId()==null) || 
             (this.originatorTransactionId!=null &&
              this.originatorTransactionId.equals(other.getOriginatorTransactionId()))) &&
            ((this.serviceTransactionId==null && other.getServiceTransactionId()==null) || 
             (this.serviceTransactionId!=null &&
              this.serviceTransactionId.equals(other.getServiceTransactionId()))) &&
            ((this.serviceTransactionDateTime==null && other.getServiceTransactionDateTime()==null) || 
             (this.serviceTransactionDateTime!=null &&
              this.serviceTransactionDateTime.equals(other.getServiceTransactionDateTime()))) &&
            ((this.addendum==null && other.getAddendum()==null) || 
             (this.addendum!=null &&
              this.addendum.equals(other.getAddendum()))) &&
            ((this.captureState==null && other.getCaptureState()==null) || 
             (this.captureState!=null &&
              this.captureState.equals(other.getCaptureState()))) &&
            ((this.transactionState==null && other.getTransactionState()==null) || 
             (this.transactionState!=null &&
              this.transactionState.equals(other.getTransactionState()))) &&
            ((this.isAcknowledged==null && other.getIsAcknowledged()==null) || 
             (this.isAcknowledged!=null &&
              this.isAcknowledged.equals(other.getIsAcknowledged()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getOriginatorTransactionId() != null) {
            _hashCode += getOriginatorTransactionId().hashCode();
        }
        if (getServiceTransactionId() != null) {
            _hashCode += getServiceTransactionId().hashCode();
        }
        if (getServiceTransactionDateTime() != null) {
            _hashCode += getServiceTransactionDateTime().hashCode();
        }
        if (getAddendum() != null) {
            _hashCode += getAddendum().hashCode();
        }
        if (getCaptureState() != null) {
            _hashCode += getCaptureState().hashCode();
        }
        if (getTransactionState() != null) {
            _hashCode += getTransactionState().hashCode();
        }
        if (getIsAcknowledged() != null) {
            _hashCode += getIsAcknowledged().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "StatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "OriginatorTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ServiceTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTransactionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ServiceTransactionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ServiceTransactionDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addendum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAcknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "IsAcknowledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Reference"));
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
