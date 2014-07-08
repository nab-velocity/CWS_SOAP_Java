/**
 * Tenders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains specific information about the supported payment
 * tenders. Returned to the application by GetServiceInformation. Expected.
 * </summary>
 */
public class Tenders  implements java.io.Serializable {
    /* <summary>
     *             Indicates support for the Credit Card tender. Required.
     * </summary> */
    private java.lang.Boolean credit;

    /* <summary>
     *             Indicates support for the PIN Debit tender. Required.
     *             </summary> */
    private java.lang.Boolean PINDebit;

    /* <summary>
     *             Indicates support for PINless Debit. Required.
     *             </summary> */
    private java.lang.Boolean PINlessDebit;

    /* <summary>
     *             Indicates the types of Return transactions supported by
     * the service for PIN Debit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINDebitReturnSupportType PINDebitReturnSupportType;

    /* <summary>
     *             Specifies whether a new card swipe is required when performing
     * an Undo on a PIN Debit card. Required.
     *             </summary> */
    private java.lang.Boolean PINDebitUndoTenderDataRequired;

    /* <summary>
     *             Indicates the level of credit authorization support on
     * a service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditAuthorizeSupportType creditAuthorizeSupport;

    /* <summary>
     *             Indicates the types of date ranges that are supported
     * for QueryRejected on a service. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.QueryRejectedSupportType queryRejectedSupport;

    /* <summary>
     *             Indicates if Undo is supported by the service for PIN
     * Debit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PinDebitUndoSupportType pinDebitUndoSupport;

    /* <summary>
     *             Indicates level of BatchAssignment supported by the service.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BatchAssignmentSupport batchAssignmentSupport;

    /* <summary>
     *             Indicates the types of Return transactions supported by
     * the service for Credit transactions. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReturnSupportType creditReturnSupportType;

    /* <summary>
     *             Indicates the types of track data supported. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TrackDataSupportType trackDataSupport;

    /* <summary>
     *             Specifies whether or not user credentials are required
     * for the service. Optional, if not present defaults to 'false'.
     *             </summary> */
    private java.lang.Boolean credentialsRequired;

    /* <summary>
     *             Specifies if Reversal is supported.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReversalSupportType creditReversalSupportType;

    /* <summary>
     *             Specifies whether the service supports partial approval
     * capability at the transaction level. If not present defaults to ‘DisabledAlwaysSupported’.
     * Expected.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PartialApprovalSupportType partialApprovalSupportType;

    public Tenders() {
    }

    public Tenders(
           java.lang.Boolean credit,
           java.lang.Boolean PINDebit,
           java.lang.Boolean PINlessDebit,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINDebitReturnSupportType PINDebitReturnSupportType,
           java.lang.Boolean PINDebitUndoTenderDataRequired,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditAuthorizeSupportType creditAuthorizeSupport,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.QueryRejectedSupportType queryRejectedSupport,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PinDebitUndoSupportType pinDebitUndoSupport,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BatchAssignmentSupport batchAssignmentSupport,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReturnSupportType creditReturnSupportType,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TrackDataSupportType trackDataSupport,
           java.lang.Boolean credentialsRequired,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReversalSupportType creditReversalSupportType,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PartialApprovalSupportType partialApprovalSupportType) {
           this.credit = credit;
           this.PINDebit = PINDebit;
           this.PINlessDebit = PINlessDebit;
           this.PINDebitReturnSupportType = PINDebitReturnSupportType;
           this.PINDebitUndoTenderDataRequired = PINDebitUndoTenderDataRequired;
           this.creditAuthorizeSupport = creditAuthorizeSupport;
           this.queryRejectedSupport = queryRejectedSupport;
           this.pinDebitUndoSupport = pinDebitUndoSupport;
           this.batchAssignmentSupport = batchAssignmentSupport;
           this.creditReturnSupportType = creditReturnSupportType;
           this.trackDataSupport = trackDataSupport;
           this.credentialsRequired = credentialsRequired;
           this.creditReversalSupportType = creditReversalSupportType;
           this.partialApprovalSupportType = partialApprovalSupportType;
    }


    /**
     * Gets the credit value for this Tenders.
     * 
     * @return credit   * <summary>
     *             Indicates support for the Credit Card tender. Required.
     * </summary>
     */
    public java.lang.Boolean getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this Tenders.
     * 
     * @param credit   * <summary>
     *             Indicates support for the Credit Card tender. Required.
     * </summary>
     */
    public void setCredit(java.lang.Boolean credit) {
        this.credit = credit;
    }


    /**
     * Gets the PINDebit value for this Tenders.
     * 
     * @return PINDebit   * <summary>
     *             Indicates support for the PIN Debit tender. Required.
     *             </summary>
     */
    public java.lang.Boolean getPINDebit() {
        return PINDebit;
    }


    /**
     * Sets the PINDebit value for this Tenders.
     * 
     * @param PINDebit   * <summary>
     *             Indicates support for the PIN Debit tender. Required.
     *             </summary>
     */
    public void setPINDebit(java.lang.Boolean PINDebit) {
        this.PINDebit = PINDebit;
    }


    /**
     * Gets the PINlessDebit value for this Tenders.
     * 
     * @return PINlessDebit   * <summary>
     *             Indicates support for PINless Debit. Required.
     *             </summary>
     */
    public java.lang.Boolean getPINlessDebit() {
        return PINlessDebit;
    }


    /**
     * Sets the PINlessDebit value for this Tenders.
     * 
     * @param PINlessDebit   * <summary>
     *             Indicates support for PINless Debit. Required.
     *             </summary>
     */
    public void setPINlessDebit(java.lang.Boolean PINlessDebit) {
        this.PINlessDebit = PINlessDebit;
    }


    /**
     * Gets the PINDebitReturnSupportType value for this Tenders.
     * 
     * @return PINDebitReturnSupportType   * <summary>
     *             Indicates the types of Return transactions supported by
     * the service for PIN Debit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINDebitReturnSupportType getPINDebitReturnSupportType() {
        return PINDebitReturnSupportType;
    }


    /**
     * Sets the PINDebitReturnSupportType value for this Tenders.
     * 
     * @param PINDebitReturnSupportType   * <summary>
     *             Indicates the types of Return transactions supported by
     * the service for PIN Debit transactions. Required.
     *             </summary>
     */
    public void setPINDebitReturnSupportType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINDebitReturnSupportType PINDebitReturnSupportType) {
        this.PINDebitReturnSupportType = PINDebitReturnSupportType;
    }


    /**
     * Gets the PINDebitUndoTenderDataRequired value for this Tenders.
     * 
     * @return PINDebitUndoTenderDataRequired   * <summary>
     *             Specifies whether a new card swipe is required when performing
     * an Undo on a PIN Debit card. Required.
     *             </summary>
     */
    public java.lang.Boolean getPINDebitUndoTenderDataRequired() {
        return PINDebitUndoTenderDataRequired;
    }


    /**
     * Sets the PINDebitUndoTenderDataRequired value for this Tenders.
     * 
     * @param PINDebitUndoTenderDataRequired   * <summary>
     *             Specifies whether a new card swipe is required when performing
     * an Undo on a PIN Debit card. Required.
     *             </summary>
     */
    public void setPINDebitUndoTenderDataRequired(java.lang.Boolean PINDebitUndoTenderDataRequired) {
        this.PINDebitUndoTenderDataRequired = PINDebitUndoTenderDataRequired;
    }


    /**
     * Gets the creditAuthorizeSupport value for this Tenders.
     * 
     * @return creditAuthorizeSupport   * <summary>
     *             Indicates the level of credit authorization support on
     * a service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditAuthorizeSupportType getCreditAuthorizeSupport() {
        return creditAuthorizeSupport;
    }


    /**
     * Sets the creditAuthorizeSupport value for this Tenders.
     * 
     * @param creditAuthorizeSupport   * <summary>
     *             Indicates the level of credit authorization support on
     * a service. Required.
     *             </summary>
     */
    public void setCreditAuthorizeSupport(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditAuthorizeSupportType creditAuthorizeSupport) {
        this.creditAuthorizeSupport = creditAuthorizeSupport;
    }


    /**
     * Gets the queryRejectedSupport value for this Tenders.
     * 
     * @return queryRejectedSupport   * <summary>
     *             Indicates the types of date ranges that are supported
     * for QueryRejected on a service. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.QueryRejectedSupportType getQueryRejectedSupport() {
        return queryRejectedSupport;
    }


    /**
     * Sets the queryRejectedSupport value for this Tenders.
     * 
     * @param queryRejectedSupport   * <summary>
     *             Indicates the types of date ranges that are supported
     * for QueryRejected on a service. Required.
     *             </summary>
     */
    public void setQueryRejectedSupport(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.QueryRejectedSupportType queryRejectedSupport) {
        this.queryRejectedSupport = queryRejectedSupport;
    }


    /**
     * Gets the pinDebitUndoSupport value for this Tenders.
     * 
     * @return pinDebitUndoSupport   * <summary>
     *             Indicates if Undo is supported by the service for PIN
     * Debit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PinDebitUndoSupportType getPinDebitUndoSupport() {
        return pinDebitUndoSupport;
    }


    /**
     * Sets the pinDebitUndoSupport value for this Tenders.
     * 
     * @param pinDebitUndoSupport   * <summary>
     *             Indicates if Undo is supported by the service for PIN
     * Debit transactions. Required.
     *             </summary>
     */
    public void setPinDebitUndoSupport(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PinDebitUndoSupportType pinDebitUndoSupport) {
        this.pinDebitUndoSupport = pinDebitUndoSupport;
    }


    /**
     * Gets the batchAssignmentSupport value for this Tenders.
     * 
     * @return batchAssignmentSupport   * <summary>
     *             Indicates level of BatchAssignment supported by the service.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BatchAssignmentSupport getBatchAssignmentSupport() {
        return batchAssignmentSupport;
    }


    /**
     * Sets the batchAssignmentSupport value for this Tenders.
     * 
     * @param batchAssignmentSupport   * <summary>
     *             Indicates level of BatchAssignment supported by the service.
     * Required.
     *             </summary>
     */
    public void setBatchAssignmentSupport(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BatchAssignmentSupport batchAssignmentSupport) {
        this.batchAssignmentSupport = batchAssignmentSupport;
    }


    /**
     * Gets the creditReturnSupportType value for this Tenders.
     * 
     * @return creditReturnSupportType   * <summary>
     *             Indicates the types of Return transactions supported by
     * the service for Credit transactions. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReturnSupportType getCreditReturnSupportType() {
        return creditReturnSupportType;
    }


    /**
     * Sets the creditReturnSupportType value for this Tenders.
     * 
     * @param creditReturnSupportType   * <summary>
     *             Indicates the types of Return transactions supported by
     * the service for Credit transactions. Required.
     *             </summary>
     */
    public void setCreditReturnSupportType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReturnSupportType creditReturnSupportType) {
        this.creditReturnSupportType = creditReturnSupportType;
    }


    /**
     * Gets the trackDataSupport value for this Tenders.
     * 
     * @return trackDataSupport   * <summary>
     *             Indicates the types of track data supported. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TrackDataSupportType getTrackDataSupport() {
        return trackDataSupport;
    }


    /**
     * Sets the trackDataSupport value for this Tenders.
     * 
     * @param trackDataSupport   * <summary>
     *             Indicates the types of track data supported. Required.
     * </summary>
     */
    public void setTrackDataSupport(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TrackDataSupportType trackDataSupport) {
        this.trackDataSupport = trackDataSupport;
    }


    /**
     * Gets the credentialsRequired value for this Tenders.
     * 
     * @return credentialsRequired   * <summary>
     *             Specifies whether or not user credentials are required
     * for the service. Optional, if not present defaults to 'false'.
     *             </summary>
     */
    public java.lang.Boolean getCredentialsRequired() {
        return credentialsRequired;
    }


    /**
     * Sets the credentialsRequired value for this Tenders.
     * 
     * @param credentialsRequired   * <summary>
     *             Specifies whether or not user credentials are required
     * for the service. Optional, if not present defaults to 'false'.
     *             </summary>
     */
    public void setCredentialsRequired(java.lang.Boolean credentialsRequired) {
        this.credentialsRequired = credentialsRequired;
    }


    /**
     * Gets the creditReversalSupportType value for this Tenders.
     * 
     * @return creditReversalSupportType   * <summary>
     *             Specifies if Reversal is supported.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReversalSupportType getCreditReversalSupportType() {
        return creditReversalSupportType;
    }


    /**
     * Sets the creditReversalSupportType value for this Tenders.
     * 
     * @param creditReversalSupportType   * <summary>
     *             Specifies if Reversal is supported.
     *             </summary>
     */
    public void setCreditReversalSupportType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReversalSupportType creditReversalSupportType) {
        this.creditReversalSupportType = creditReversalSupportType;
    }


    /**
     * Gets the partialApprovalSupportType value for this Tenders.
     * 
     * @return partialApprovalSupportType   * <summary>
     *             Specifies whether the service supports partial approval
     * capability at the transaction level. If not present defaults to ‘DisabledAlwaysSupported’.
     * Expected.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PartialApprovalSupportType getPartialApprovalSupportType() {
        return partialApprovalSupportType;
    }


    /**
     * Sets the partialApprovalSupportType value for this Tenders.
     * 
     * @param partialApprovalSupportType   * <summary>
     *             Specifies whether the service supports partial approval
     * capability at the transaction level. If not present defaults to ‘DisabledAlwaysSupported’.
     * Expected.
     *             </summary>
     */
    public void setPartialApprovalSupportType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PartialApprovalSupportType partialApprovalSupportType) {
        this.partialApprovalSupportType = partialApprovalSupportType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tenders)) return false;
        Tenders other = (Tenders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.PINDebit==null && other.getPINDebit()==null) || 
             (this.PINDebit!=null &&
              this.PINDebit.equals(other.getPINDebit()))) &&
            ((this.PINlessDebit==null && other.getPINlessDebit()==null) || 
             (this.PINlessDebit!=null &&
              this.PINlessDebit.equals(other.getPINlessDebit()))) &&
            ((this.PINDebitReturnSupportType==null && other.getPINDebitReturnSupportType()==null) || 
             (this.PINDebitReturnSupportType!=null &&
              this.PINDebitReturnSupportType.equals(other.getPINDebitReturnSupportType()))) &&
            ((this.PINDebitUndoTenderDataRequired==null && other.getPINDebitUndoTenderDataRequired()==null) || 
             (this.PINDebitUndoTenderDataRequired!=null &&
              this.PINDebitUndoTenderDataRequired.equals(other.getPINDebitUndoTenderDataRequired()))) &&
            ((this.creditAuthorizeSupport==null && other.getCreditAuthorizeSupport()==null) || 
             (this.creditAuthorizeSupport!=null &&
              this.creditAuthorizeSupport.equals(other.getCreditAuthorizeSupport()))) &&
            ((this.queryRejectedSupport==null && other.getQueryRejectedSupport()==null) || 
             (this.queryRejectedSupport!=null &&
              this.queryRejectedSupport.equals(other.getQueryRejectedSupport()))) &&
            ((this.pinDebitUndoSupport==null && other.getPinDebitUndoSupport()==null) || 
             (this.pinDebitUndoSupport!=null &&
              this.pinDebitUndoSupport.equals(other.getPinDebitUndoSupport()))) &&
            ((this.batchAssignmentSupport==null && other.getBatchAssignmentSupport()==null) || 
             (this.batchAssignmentSupport!=null &&
              this.batchAssignmentSupport.equals(other.getBatchAssignmentSupport()))) &&
            ((this.creditReturnSupportType==null && other.getCreditReturnSupportType()==null) || 
             (this.creditReturnSupportType!=null &&
              this.creditReturnSupportType.equals(other.getCreditReturnSupportType()))) &&
            ((this.trackDataSupport==null && other.getTrackDataSupport()==null) || 
             (this.trackDataSupport!=null &&
              this.trackDataSupport.equals(other.getTrackDataSupport()))) &&
            ((this.credentialsRequired==null && other.getCredentialsRequired()==null) || 
             (this.credentialsRequired!=null &&
              this.credentialsRequired.equals(other.getCredentialsRequired()))) &&
            ((this.creditReversalSupportType==null && other.getCreditReversalSupportType()==null) || 
             (this.creditReversalSupportType!=null &&
              this.creditReversalSupportType.equals(other.getCreditReversalSupportType()))) &&
            ((this.partialApprovalSupportType==null && other.getPartialApprovalSupportType()==null) || 
             (this.partialApprovalSupportType!=null &&
              this.partialApprovalSupportType.equals(other.getPartialApprovalSupportType())));
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
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getPINDebit() != null) {
            _hashCode += getPINDebit().hashCode();
        }
        if (getPINlessDebit() != null) {
            _hashCode += getPINlessDebit().hashCode();
        }
        if (getPINDebitReturnSupportType() != null) {
            _hashCode += getPINDebitReturnSupportType().hashCode();
        }
        if (getPINDebitUndoTenderDataRequired() != null) {
            _hashCode += getPINDebitUndoTenderDataRequired().hashCode();
        }
        if (getCreditAuthorizeSupport() != null) {
            _hashCode += getCreditAuthorizeSupport().hashCode();
        }
        if (getQueryRejectedSupport() != null) {
            _hashCode += getQueryRejectedSupport().hashCode();
        }
        if (getPinDebitUndoSupport() != null) {
            _hashCode += getPinDebitUndoSupport().hashCode();
        }
        if (getBatchAssignmentSupport() != null) {
            _hashCode += getBatchAssignmentSupport().hashCode();
        }
        if (getCreditReturnSupportType() != null) {
            _hashCode += getCreditReturnSupportType().hashCode();
        }
        if (getTrackDataSupport() != null) {
            _hashCode += getTrackDataSupport().hashCode();
        }
        if (getCredentialsRequired() != null) {
            _hashCode += getCredentialsRequired().hashCode();
        }
        if (getCreditReversalSupportType() != null) {
            _hashCode += getCreditReversalSupportType().hashCode();
        }
        if (getPartialApprovalSupportType() != null) {
            _hashCode += getPartialApprovalSupportType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tenders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINlessDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINlessDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebitReturnSupportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINDebitReturnSupportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINDebitReturnSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebitUndoTenderDataRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINDebitUndoTenderDataRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAuthorizeSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditAuthorizeSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditAuthorizeSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRejectedSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryRejectedSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryRejectedSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDebitUndoSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PinDebitUndoSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PinDebitUndoSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchAssignmentSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BatchAssignmentSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BatchAssignmentSupport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReturnSupportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReturnSupportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReturnSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackDataSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TrackDataSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TrackDataSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CredentialsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditReversalSupportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReversalSupportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReversalSupportType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialApprovalSupportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PartialApprovalSupportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PartialApprovalSupportType"));
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
