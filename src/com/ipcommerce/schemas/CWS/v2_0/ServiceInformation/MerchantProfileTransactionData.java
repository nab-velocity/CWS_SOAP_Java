/**
 * MerchantProfileTransactionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains transaction-specific information associated with
 * a specific merchant. Required.
 *             </summary>
 */
public class MerchantProfileTransactionData  implements java.io.Serializable {
    /* <summary>
     *             Contains information sent with all Bankcard transactions.
     * May be overridden on each transaction, as necessary. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardTransactionDataDefaults bankcardTransactionDataDefaults;

    public MerchantProfileTransactionData() {
    }

    public MerchantProfileTransactionData(
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardTransactionDataDefaults bankcardTransactionDataDefaults) {
           this.bankcardTransactionDataDefaults = bankcardTransactionDataDefaults;
    }


    /**
     * Gets the bankcardTransactionDataDefaults value for this MerchantProfileTransactionData.
     * 
     * @return bankcardTransactionDataDefaults   * <summary>
     *             Contains information sent with all Bankcard transactions.
     * May be overridden on each transaction, as necessary. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardTransactionDataDefaults getBankcardTransactionDataDefaults() {
        return bankcardTransactionDataDefaults;
    }


    /**
     * Sets the bankcardTransactionDataDefaults value for this MerchantProfileTransactionData.
     * 
     * @param bankcardTransactionDataDefaults   * <summary>
     *             Contains information sent with all Bankcard transactions.
     * May be overridden on each transaction, as necessary. Required.
     *             </summary>
     */
    public void setBankcardTransactionDataDefaults(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardTransactionDataDefaults bankcardTransactionDataDefaults) {
        this.bankcardTransactionDataDefaults = bankcardTransactionDataDefaults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantProfileTransactionData)) return false;
        MerchantProfileTransactionData other = (MerchantProfileTransactionData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankcardTransactionDataDefaults==null && other.getBankcardTransactionDataDefaults()==null) || 
             (this.bankcardTransactionDataDefaults!=null &&
              this.bankcardTransactionDataDefaults.equals(other.getBankcardTransactionDataDefaults())));
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
        if (getBankcardTransactionDataDefaults() != null) {
            _hashCode += getBankcardTransactionDataDefaults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantProfileTransactionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileTransactionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankcardTransactionDataDefaults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardTransactionDataDefaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardTransactionDataDefaults"));
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
