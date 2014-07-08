/**
 * Operations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             The transaction processing operations supported by the
 * service. Required.
 *             </summary>
 */
public class Operations  implements java.io.Serializable {
    /* <summary>
     *             Indicates whether the Verify operation is supported. Required.
     * </summary> */
    private java.lang.Boolean verify;

    /* <summary>
     *             Indicates whether the QueryAccount operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean queryAccount;

    /* <summary>
     *             Indicates whether the AuthorizeAndCapture operation is
     * supported. Required.
     *             </summary> */
    private java.lang.Boolean authAndCapture;

    /* <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean authorize;

    /* <summary>
     *             Indicates whether the Adjust operation is supported. Required.
     * </summary> */
    private java.lang.Boolean adjust;

    /* <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean returnById;

    /* <summary>
     *             Indicates whether the ReturnUnlinked operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean returnUnlinked;

    /* <summary>
     *             Indicates whether the Undo operation is supported. Required.
     * </summary> */
    private java.lang.Boolean undo;

    /* <summary>
     *             Indicates whether the Capture operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean capture;

    /* <summary>
     *             Indicates whether the CaptureSelective operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean captureSelective;

    /* <summary>
     *             Indicates whether the CaptureAll operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean captureAll;

    /* <summary>
     *             Indicates the support level for batch release. Future
     * Use.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CloseBatch closeBatch;

    /* <summary>
     *             Indicates whether the QueryRejected operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean queryRejected;

    /* <summary>
     *             Indicates whether the ManageAccount operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean manageAccount;

    /* <summary>
     *             Indicates whether the ManageAccountById operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean manageAccountById;

    /* <summary>
     *             Indicates whether the Disburse operation is supported.
     * Required.
     *             </summary> */
    private java.lang.Boolean disburse;

    public Operations() {
    }

    public Operations(
           java.lang.Boolean verify,
           java.lang.Boolean queryAccount,
           java.lang.Boolean authAndCapture,
           java.lang.Boolean authorize,
           java.lang.Boolean adjust,
           java.lang.Boolean returnById,
           java.lang.Boolean returnUnlinked,
           java.lang.Boolean undo,
           java.lang.Boolean capture,
           java.lang.Boolean captureSelective,
           java.lang.Boolean captureAll,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CloseBatch closeBatch,
           java.lang.Boolean queryRejected,
           java.lang.Boolean manageAccount,
           java.lang.Boolean manageAccountById,
           java.lang.Boolean disburse) {
           this.verify = verify;
           this.queryAccount = queryAccount;
           this.authAndCapture = authAndCapture;
           this.authorize = authorize;
           this.adjust = adjust;
           this.returnById = returnById;
           this.returnUnlinked = returnUnlinked;
           this.undo = undo;
           this.capture = capture;
           this.captureSelective = captureSelective;
           this.captureAll = captureAll;
           this.closeBatch = closeBatch;
           this.queryRejected = queryRejected;
           this.manageAccount = manageAccount;
           this.manageAccountById = manageAccountById;
           this.disburse = disburse;
    }


    /**
     * Gets the verify value for this Operations.
     * 
     * @return verify   * <summary>
     *             Indicates whether the Verify operation is supported. Required.
     * </summary>
     */
    public java.lang.Boolean getVerify() {
        return verify;
    }


    /**
     * Sets the verify value for this Operations.
     * 
     * @param verify   * <summary>
     *             Indicates whether the Verify operation is supported. Required.
     * </summary>
     */
    public void setVerify(java.lang.Boolean verify) {
        this.verify = verify;
    }


    /**
     * Gets the queryAccount value for this Operations.
     * 
     * @return queryAccount   * <summary>
     *             Indicates whether the QueryAccount operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getQueryAccount() {
        return queryAccount;
    }


    /**
     * Sets the queryAccount value for this Operations.
     * 
     * @param queryAccount   * <summary>
     *             Indicates whether the QueryAccount operation is supported.
     * Required.
     *             </summary>
     */
    public void setQueryAccount(java.lang.Boolean queryAccount) {
        this.queryAccount = queryAccount;
    }


    /**
     * Gets the authAndCapture value for this Operations.
     * 
     * @return authAndCapture   * <summary>
     *             Indicates whether the AuthorizeAndCapture operation is
     * supported. Required.
     *             </summary>
     */
    public java.lang.Boolean getAuthAndCapture() {
        return authAndCapture;
    }


    /**
     * Sets the authAndCapture value for this Operations.
     * 
     * @param authAndCapture   * <summary>
     *             Indicates whether the AuthorizeAndCapture operation is
     * supported. Required.
     *             </summary>
     */
    public void setAuthAndCapture(java.lang.Boolean authAndCapture) {
        this.authAndCapture = authAndCapture;
    }


    /**
     * Gets the authorize value for this Operations.
     * 
     * @return authorize   * <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getAuthorize() {
        return authorize;
    }


    /**
     * Sets the authorize value for this Operations.
     * 
     * @param authorize   * <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary>
     */
    public void setAuthorize(java.lang.Boolean authorize) {
        this.authorize = authorize;
    }


    /**
     * Gets the adjust value for this Operations.
     * 
     * @return adjust   * <summary>
     *             Indicates whether the Adjust operation is supported. Required.
     * </summary>
     */
    public java.lang.Boolean getAdjust() {
        return adjust;
    }


    /**
     * Sets the adjust value for this Operations.
     * 
     * @param adjust   * <summary>
     *             Indicates whether the Adjust operation is supported. Required.
     * </summary>
     */
    public void setAdjust(java.lang.Boolean adjust) {
        this.adjust = adjust;
    }


    /**
     * Gets the returnById value for this Operations.
     * 
     * @return returnById   * <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getReturnById() {
        return returnById;
    }


    /**
     * Sets the returnById value for this Operations.
     * 
     * @param returnById   * <summary>
     *             Indicates whether the Authorize operation is supported.
     * Required.
     *             </summary>
     */
    public void setReturnById(java.lang.Boolean returnById) {
        this.returnById = returnById;
    }


    /**
     * Gets the returnUnlinked value for this Operations.
     * 
     * @return returnUnlinked   * <summary>
     *             Indicates whether the ReturnUnlinked operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getReturnUnlinked() {
        return returnUnlinked;
    }


    /**
     * Sets the returnUnlinked value for this Operations.
     * 
     * @param returnUnlinked   * <summary>
     *             Indicates whether the ReturnUnlinked operation is supported.
     * Required.
     *             </summary>
     */
    public void setReturnUnlinked(java.lang.Boolean returnUnlinked) {
        this.returnUnlinked = returnUnlinked;
    }


    /**
     * Gets the undo value for this Operations.
     * 
     * @return undo   * <summary>
     *             Indicates whether the Undo operation is supported. Required.
     * </summary>
     */
    public java.lang.Boolean getUndo() {
        return undo;
    }


    /**
     * Sets the undo value for this Operations.
     * 
     * @param undo   * <summary>
     *             Indicates whether the Undo operation is supported. Required.
     * </summary>
     */
    public void setUndo(java.lang.Boolean undo) {
        this.undo = undo;
    }


    /**
     * Gets the capture value for this Operations.
     * 
     * @return capture   * <summary>
     *             Indicates whether the Capture operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getCapture() {
        return capture;
    }


    /**
     * Sets the capture value for this Operations.
     * 
     * @param capture   * <summary>
     *             Indicates whether the Capture operation is supported.
     * Required.
     *             </summary>
     */
    public void setCapture(java.lang.Boolean capture) {
        this.capture = capture;
    }


    /**
     * Gets the captureSelective value for this Operations.
     * 
     * @return captureSelective   * <summary>
     *             Indicates whether the CaptureSelective operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getCaptureSelective() {
        return captureSelective;
    }


    /**
     * Sets the captureSelective value for this Operations.
     * 
     * @param captureSelective   * <summary>
     *             Indicates whether the CaptureSelective operation is supported.
     * Required.
     *             </summary>
     */
    public void setCaptureSelective(java.lang.Boolean captureSelective) {
        this.captureSelective = captureSelective;
    }


    /**
     * Gets the captureAll value for this Operations.
     * 
     * @return captureAll   * <summary>
     *             Indicates whether the CaptureAll operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getCaptureAll() {
        return captureAll;
    }


    /**
     * Sets the captureAll value for this Operations.
     * 
     * @param captureAll   * <summary>
     *             Indicates whether the CaptureAll operation is supported.
     * Required.
     *             </summary>
     */
    public void setCaptureAll(java.lang.Boolean captureAll) {
        this.captureAll = captureAll;
    }


    /**
     * Gets the closeBatch value for this Operations.
     * 
     * @return closeBatch   * <summary>
     *             Indicates the support level for batch release. Future
     * Use.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CloseBatch getCloseBatch() {
        return closeBatch;
    }


    /**
     * Sets the closeBatch value for this Operations.
     * 
     * @param closeBatch   * <summary>
     *             Indicates the support level for batch release. Future
     * Use.
     *             </summary>
     */
    public void setCloseBatch(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CloseBatch closeBatch) {
        this.closeBatch = closeBatch;
    }


    /**
     * Gets the queryRejected value for this Operations.
     * 
     * @return queryRejected   * <summary>
     *             Indicates whether the QueryRejected operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getQueryRejected() {
        return queryRejected;
    }


    /**
     * Sets the queryRejected value for this Operations.
     * 
     * @param queryRejected   * <summary>
     *             Indicates whether the QueryRejected operation is supported.
     * Required.
     *             </summary>
     */
    public void setQueryRejected(java.lang.Boolean queryRejected) {
        this.queryRejected = queryRejected;
    }


    /**
     * Gets the manageAccount value for this Operations.
     * 
     * @return manageAccount   * <summary>
     *             Indicates whether the ManageAccount operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getManageAccount() {
        return manageAccount;
    }


    /**
     * Sets the manageAccount value for this Operations.
     * 
     * @param manageAccount   * <summary>
     *             Indicates whether the ManageAccount operation is supported.
     * Required.
     *             </summary>
     */
    public void setManageAccount(java.lang.Boolean manageAccount) {
        this.manageAccount = manageAccount;
    }


    /**
     * Gets the manageAccountById value for this Operations.
     * 
     * @return manageAccountById   * <summary>
     *             Indicates whether the ManageAccountById operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getManageAccountById() {
        return manageAccountById;
    }


    /**
     * Sets the manageAccountById value for this Operations.
     * 
     * @param manageAccountById   * <summary>
     *             Indicates whether the ManageAccountById operation is supported.
     * Required.
     *             </summary>
     */
    public void setManageAccountById(java.lang.Boolean manageAccountById) {
        this.manageAccountById = manageAccountById;
    }


    /**
     * Gets the disburse value for this Operations.
     * 
     * @return disburse   * <summary>
     *             Indicates whether the Disburse operation is supported.
     * Required.
     *             </summary>
     */
    public java.lang.Boolean getDisburse() {
        return disburse;
    }


    /**
     * Sets the disburse value for this Operations.
     * 
     * @param disburse   * <summary>
     *             Indicates whether the Disburse operation is supported.
     * Required.
     *             </summary>
     */
    public void setDisburse(java.lang.Boolean disburse) {
        this.disburse = disburse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operations)) return false;
        Operations other = (Operations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.verify==null && other.getVerify()==null) || 
             (this.verify!=null &&
              this.verify.equals(other.getVerify()))) &&
            ((this.queryAccount==null && other.getQueryAccount()==null) || 
             (this.queryAccount!=null &&
              this.queryAccount.equals(other.getQueryAccount()))) &&
            ((this.authAndCapture==null && other.getAuthAndCapture()==null) || 
             (this.authAndCapture!=null &&
              this.authAndCapture.equals(other.getAuthAndCapture()))) &&
            ((this.authorize==null && other.getAuthorize()==null) || 
             (this.authorize!=null &&
              this.authorize.equals(other.getAuthorize()))) &&
            ((this.adjust==null && other.getAdjust()==null) || 
             (this.adjust!=null &&
              this.adjust.equals(other.getAdjust()))) &&
            ((this.returnById==null && other.getReturnById()==null) || 
             (this.returnById!=null &&
              this.returnById.equals(other.getReturnById()))) &&
            ((this.returnUnlinked==null && other.getReturnUnlinked()==null) || 
             (this.returnUnlinked!=null &&
              this.returnUnlinked.equals(other.getReturnUnlinked()))) &&
            ((this.undo==null && other.getUndo()==null) || 
             (this.undo!=null &&
              this.undo.equals(other.getUndo()))) &&
            ((this.capture==null && other.getCapture()==null) || 
             (this.capture!=null &&
              this.capture.equals(other.getCapture()))) &&
            ((this.captureSelective==null && other.getCaptureSelective()==null) || 
             (this.captureSelective!=null &&
              this.captureSelective.equals(other.getCaptureSelective()))) &&
            ((this.captureAll==null && other.getCaptureAll()==null) || 
             (this.captureAll!=null &&
              this.captureAll.equals(other.getCaptureAll()))) &&
            ((this.closeBatch==null && other.getCloseBatch()==null) || 
             (this.closeBatch!=null &&
              this.closeBatch.equals(other.getCloseBatch()))) &&
            ((this.queryRejected==null && other.getQueryRejected()==null) || 
             (this.queryRejected!=null &&
              this.queryRejected.equals(other.getQueryRejected()))) &&
            ((this.manageAccount==null && other.getManageAccount()==null) || 
             (this.manageAccount!=null &&
              this.manageAccount.equals(other.getManageAccount()))) &&
            ((this.manageAccountById==null && other.getManageAccountById()==null) || 
             (this.manageAccountById!=null &&
              this.manageAccountById.equals(other.getManageAccountById()))) &&
            ((this.disburse==null && other.getDisburse()==null) || 
             (this.disburse!=null &&
              this.disburse.equals(other.getDisburse())));
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
        if (getVerify() != null) {
            _hashCode += getVerify().hashCode();
        }
        if (getQueryAccount() != null) {
            _hashCode += getQueryAccount().hashCode();
        }
        if (getAuthAndCapture() != null) {
            _hashCode += getAuthAndCapture().hashCode();
        }
        if (getAuthorize() != null) {
            _hashCode += getAuthorize().hashCode();
        }
        if (getAdjust() != null) {
            _hashCode += getAdjust().hashCode();
        }
        if (getReturnById() != null) {
            _hashCode += getReturnById().hashCode();
        }
        if (getReturnUnlinked() != null) {
            _hashCode += getReturnUnlinked().hashCode();
        }
        if (getUndo() != null) {
            _hashCode += getUndo().hashCode();
        }
        if (getCapture() != null) {
            _hashCode += getCapture().hashCode();
        }
        if (getCaptureSelective() != null) {
            _hashCode += getCaptureSelective().hashCode();
        }
        if (getCaptureAll() != null) {
            _hashCode += getCaptureAll().hashCode();
        }
        if (getCloseBatch() != null) {
            _hashCode += getCloseBatch().hashCode();
        }
        if (getQueryRejected() != null) {
            _hashCode += getQueryRejected().hashCode();
        }
        if (getManageAccount() != null) {
            _hashCode += getManageAccount().hashCode();
        }
        if (getManageAccountById() != null) {
            _hashCode += getManageAccountById().hashCode();
        }
        if (getDisburse() != null) {
            _hashCode += getDisburse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Verify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authAndCapture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AuthAndCapture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Authorize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjust");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Adjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReturnById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnUnlinked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReturnUnlinked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Undo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Capture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureSelective");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CaptureSelective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureAll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CaptureAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CloseBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CloseBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRejected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryRejected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ManageAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageAccountById");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ManageAccountById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disburse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Disburse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
