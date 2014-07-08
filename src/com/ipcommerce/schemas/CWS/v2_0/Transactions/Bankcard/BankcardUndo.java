/**
 * BankcardUndo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Contains information for undoing (voiding) Bankcard transactions
 * (Credit and PIN Debit). Required.
 *             </summary>
 */
public class BankcardUndo  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo  implements java.io.Serializable {
    /* <summary>
     *             Specifies the reason for the void. Conditional, required
     * for PIN Debit.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINDebitUndoReason PINDebitReason;

    /* <summary>
     *             Details about the card tender. Conditional, required if
     * BankcardService.Tenders.PINDebitUndoTenderDataRequired is true.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData;

    /* <summary>
     *             Indicates that the authorized transaction should be removed
     * from the batch regardless of whether the Undo() is approved or declined.
     * Otherwise, authorized transactions will only be removed from the batch
     * if the void is approved.
     *             </summary> */
    private java.lang.Boolean forceVoid;

    public BankcardUndo() {
    }

    public BankcardUndo(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINDebitUndoReason PINDebitReason,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData,
           java.lang.Boolean forceVoid) {
        super(
            transactionId,
            addendum);
        this.PINDebitReason = PINDebitReason;
        this.tenderData = tenderData;
        this.forceVoid = forceVoid;
    }


    /**
     * Gets the PINDebitReason value for this BankcardUndo.
     * 
     * @return PINDebitReason   * <summary>
     *             Specifies the reason for the void. Conditional, required
     * for PIN Debit.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINDebitUndoReason getPINDebitReason() {
        return PINDebitReason;
    }


    /**
     * Sets the PINDebitReason value for this BankcardUndo.
     * 
     * @param PINDebitReason   * <summary>
     *             Specifies the reason for the void. Conditional, required
     * for PIN Debit.
     *             </summary>
     */
    public void setPINDebitReason(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINDebitUndoReason PINDebitReason) {
        this.PINDebitReason = PINDebitReason;
    }


    /**
     * Gets the tenderData value for this BankcardUndo.
     * 
     * @return tenderData   * <summary>
     *             Details about the card tender. Conditional, required if
     * BankcardService.Tenders.PINDebitUndoTenderDataRequired is true.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData getTenderData() {
        return tenderData;
    }


    /**
     * Sets the tenderData value for this BankcardUndo.
     * 
     * @param tenderData   * <summary>
     *             Details about the card tender. Conditional, required if
     * BankcardService.Tenders.PINDebitUndoTenderDataRequired is true.
     *             </summary>
     */
    public void setTenderData(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData) {
        this.tenderData = tenderData;
    }


    /**
     * Gets the forceVoid value for this BankcardUndo.
     * 
     * @return forceVoid   * <summary>
     *             Indicates that the authorized transaction should be removed
     * from the batch regardless of whether the Undo() is approved or declined.
     * Otherwise, authorized transactions will only be removed from the batch
     * if the void is approved.
     *             </summary>
     */
    public java.lang.Boolean getForceVoid() {
        return forceVoid;
    }


    /**
     * Sets the forceVoid value for this BankcardUndo.
     * 
     * @param forceVoid   * <summary>
     *             Indicates that the authorized transaction should be removed
     * from the batch regardless of whether the Undo() is approved or declined.
     * Otherwise, authorized transactions will only be removed from the batch
     * if the void is approved.
     *             </summary>
     */
    public void setForceVoid(java.lang.Boolean forceVoid) {
        this.forceVoid = forceVoid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardUndo)) return false;
        BankcardUndo other = (BankcardUndo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.PINDebitReason==null && other.getPINDebitReason()==null) || 
             (this.PINDebitReason!=null &&
              this.PINDebitReason.equals(other.getPINDebitReason()))) &&
            ((this.tenderData==null && other.getTenderData()==null) || 
             (this.tenderData!=null &&
              this.tenderData.equals(other.getTenderData()))) &&
            ((this.forceVoid==null && other.getForceVoid()==null) || 
             (this.forceVoid!=null &&
              this.forceVoid.equals(other.getForceVoid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPINDebitReason() != null) {
            _hashCode += getPINDebitReason().hashCode();
        }
        if (getTenderData() != null) {
            _hashCode += getTenderData().hashCode();
        }
        if (getForceVoid() != null) {
            _hashCode += getForceVoid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardUndo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardUndo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINDebitReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitUndoReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenderData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TenderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTenderData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceVoid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ForceVoid"));
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
