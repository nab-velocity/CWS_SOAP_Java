/**
 * BankcardCapturePro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;

public class BankcardCapturePro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardCapture  implements java.io.Serializable {
    /* <summary>
     *             If present (true), indicates a partial capture of the
     * authorized funds. Additional captures will be made against the same
     * authorization. If omitted (false) then this is the last amount to
     * be captured from the authorization. Any additional authorized funds
     * will be released. Conditional, required if MultiplePartialCapture
     * (ServiceInformation) is 'true'.
     *             </summary> */
    private java.lang.Boolean multiplePartialCapture;

    /* <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' (or higher) and this data was not
     * passed in the authorization.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data;

    /* <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if service information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails;

    /* <summary>
     *             Customer shipping details. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData;

    public BankcardCapturePro() {
    }

    public BankcardCapturePro(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType chargeType,
           java.util.Calendar shipDate,
           java.math.BigDecimal tipAmount,
           java.lang.Boolean multiplePartialCapture,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData) {
        super(
            transactionId,
            addendum,
            amount,
            chargeType,
            shipDate,
            tipAmount);
        this.multiplePartialCapture = multiplePartialCapture;
        this.level2Data = level2Data;
        this.lineItemDetails = lineItemDetails;
        this.shippingData = shippingData;
    }


    /**
     * Gets the multiplePartialCapture value for this BankcardCapturePro.
     * 
     * @return multiplePartialCapture   * <summary>
     *             If present (true), indicates a partial capture of the
     * authorized funds. Additional captures will be made against the same
     * authorization. If omitted (false) then this is the last amount to
     * be captured from the authorization. Any additional authorized funds
     * will be released. Conditional, required if MultiplePartialCapture
     * (ServiceInformation) is 'true'.
     *             </summary>
     */
    public java.lang.Boolean getMultiplePartialCapture() {
        return multiplePartialCapture;
    }


    /**
     * Sets the multiplePartialCapture value for this BankcardCapturePro.
     * 
     * @param multiplePartialCapture   * <summary>
     *             If present (true), indicates a partial capture of the
     * authorized funds. Additional captures will be made against the same
     * authorization. If omitted (false) then this is the last amount to
     * be captured from the authorization. Any additional authorized funds
     * will be released. Conditional, required if MultiplePartialCapture
     * (ServiceInformation) is 'true'.
     *             </summary>
     */
    public void setMultiplePartialCapture(java.lang.Boolean multiplePartialCapture) {
        this.multiplePartialCapture = multiplePartialCapture;
    }


    /**
     * Gets the level2Data value for this BankcardCapturePro.
     * 
     * @return level2Data   * <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' (or higher) and this data was not
     * passed in the authorization.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data getLevel2Data() {
        return level2Data;
    }


    /**
     * Sets the level2Data value for this BankcardCapturePro.
     * 
     * @param level2Data   * <summary>
     *             Aggregate of elements specific to Level 2/Purchase Card
     * transactions. Conditional, required when LineItemDetails are provided,
     * otherwise optional if Service Information indicates PurchaseCardLevel
     * (ServiceInformation) = 'Level2' (or higher) and this data was not
     * passed in the authorization.
     *             </summary>
     */
    public void setLevel2Data(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data level2Data) {
        this.level2Data = level2Data;
    }


    /**
     * Gets the lineItemDetails value for this BankcardCapturePro.
     * 
     * @return lineItemDetails   * <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if service information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] getLineItemDetails() {
        return lineItemDetails;
    }


    /**
     * Sets the lineItemDetails value for this BankcardCapturePro.
     * 
     * @param lineItemDetails   * <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if service information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary>
     */
    public void setLineItemDetails(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails) {
        this.lineItemDetails = lineItemDetails;
    }


    /**
     * Gets the shippingData value for this BankcardCapturePro.
     * 
     * @return shippingData   * <summary>
     *             Customer shipping details. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo getShippingData() {
        return shippingData;
    }


    /**
     * Sets the shippingData value for this BankcardCapturePro.
     * 
     * @param shippingData   * <summary>
     *             Customer shipping details. Optional.
     *             </summary>
     */
    public void setShippingData(com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo shippingData) {
        this.shippingData = shippingData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardCapturePro)) return false;
        BankcardCapturePro other = (BankcardCapturePro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.multiplePartialCapture==null && other.getMultiplePartialCapture()==null) || 
             (this.multiplePartialCapture!=null &&
              this.multiplePartialCapture.equals(other.getMultiplePartialCapture()))) &&
            ((this.level2Data==null && other.getLevel2Data()==null) || 
             (this.level2Data!=null &&
              this.level2Data.equals(other.getLevel2Data()))) &&
            ((this.lineItemDetails==null && other.getLineItemDetails()==null) || 
             (this.lineItemDetails!=null &&
              java.util.Arrays.equals(this.lineItemDetails, other.getLineItemDetails()))) &&
            ((this.shippingData==null && other.getShippingData()==null) || 
             (this.shippingData!=null &&
              this.shippingData.equals(other.getShippingData())));
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
        if (getMultiplePartialCapture() != null) {
            _hashCode += getMultiplePartialCapture().hashCode();
        }
        if (getLevel2Data() != null) {
            _hashCode += getLevel2Data().hashCode();
        }
        if (getLineItemDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingData() != null) {
            _hashCode += getShippingData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardCapturePro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCapturePro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplePartialCapture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "MultiplePartialCapture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level2Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "Level2Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Level2Data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "LineItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "ShippingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerInfo"));
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
