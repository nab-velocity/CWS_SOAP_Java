/**
 * BankcardReturnPro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;


/**
 * <summary>
 *             Contains information for returning Bankcard transactions
 * (Credit and PIN Debit). Required.
 *             </summary>
 */
public class BankcardReturnPro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardReturn  implements java.io.Serializable {
    /* <summary>
     *             Collection of transaction line item details. Conditional,
     * optional if service information indicates PurchaseCardLevel (ServiceInformation)
     * = 'Level3'.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails;

    public BankcardReturnPro() {
    }

    public BankcardReturnPro(
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           java.lang.String transactionDateTime,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData tenderData,
           java.math.BigDecimal feeAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode transactionCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[] lineItemDetails) {
        super(
            transactionId,
            addendum,
            transactionDateTime,
            amount,
            tenderData,
            feeAmount,
            transactionCode);
        this.lineItemDetails = lineItemDetails;
    }


    /**
     * Gets the lineItemDetails value for this BankcardReturnPro.
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
     * Sets the lineItemDetails value for this BankcardReturnPro.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardReturnPro)) return false;
        BankcardReturnPro other = (BankcardReturnPro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lineItemDetails==null && other.getLineItemDetails()==null) || 
             (this.lineItemDetails!=null &&
              java.util.Arrays.equals(this.lineItemDetails, other.getLineItemDetails())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardReturnPro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardReturnPro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "LineItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
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
