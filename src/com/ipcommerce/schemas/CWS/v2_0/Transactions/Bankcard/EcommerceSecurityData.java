/**
 * EcommerceSecurityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Ecommerce security elements. Conditional, optional for
 * Ecommerce transactions, otherwise not present.
 *             </summary>
 */
public class EcommerceSecurityData  implements java.io.Serializable {
    /* <summary>
     *             Contains actual data for token. VPAS or UCAF value must
     * be in its original base64 encoded form. Conditional, required for
     * Electronic Commerce transactions using VPAS, UCAF, or SET w/certificate.
     * </summary> */
    private java.lang.String tokenData;

    /* <summary>
     *             Specifies VPAS, UCAF, or SET Certificate S/N. Conditional,
     * required for Electronic Commerce transactions using VPAS, UCAF, or
     * SET w/certificate.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TokenIndicator tokenIndicator;

    /* <summary>
     *             Transaction identifier in its original, base64 encoded
     * form for Electronic Commerce transactions w/VPAS. Optional.
     *             </summary> */
    private java.lang.String XID;

    public EcommerceSecurityData() {
    }

    public EcommerceSecurityData(
           java.lang.String tokenData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TokenIndicator tokenIndicator,
           java.lang.String XID) {
           this.tokenData = tokenData;
           this.tokenIndicator = tokenIndicator;
           this.XID = XID;
    }


    /**
     * Gets the tokenData value for this EcommerceSecurityData.
     * 
     * @return tokenData   * <summary>
     *             Contains actual data for token. VPAS or UCAF value must
     * be in its original base64 encoded form. Conditional, required for
     * Electronic Commerce transactions using VPAS, UCAF, or SET w/certificate.
     * </summary>
     */
    public java.lang.String getTokenData() {
        return tokenData;
    }


    /**
     * Sets the tokenData value for this EcommerceSecurityData.
     * 
     * @param tokenData   * <summary>
     *             Contains actual data for token. VPAS or UCAF value must
     * be in its original base64 encoded form. Conditional, required for
     * Electronic Commerce transactions using VPAS, UCAF, or SET w/certificate.
     * </summary>
     */
    public void setTokenData(java.lang.String tokenData) {
        this.tokenData = tokenData;
    }


    /**
     * Gets the tokenIndicator value for this EcommerceSecurityData.
     * 
     * @return tokenIndicator   * <summary>
     *             Specifies VPAS, UCAF, or SET Certificate S/N. Conditional,
     * required for Electronic Commerce transactions using VPAS, UCAF, or
     * SET w/certificate.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TokenIndicator getTokenIndicator() {
        return tokenIndicator;
    }


    /**
     * Sets the tokenIndicator value for this EcommerceSecurityData.
     * 
     * @param tokenIndicator   * <summary>
     *             Specifies VPAS, UCAF, or SET Certificate S/N. Conditional,
     * required for Electronic Commerce transactions using VPAS, UCAF, or
     * SET w/certificate.
     *             </summary>
     */
    public void setTokenIndicator(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TokenIndicator tokenIndicator) {
        this.tokenIndicator = tokenIndicator;
    }


    /**
     * Gets the XID value for this EcommerceSecurityData.
     * 
     * @return XID   * <summary>
     *             Transaction identifier in its original, base64 encoded
     * form for Electronic Commerce transactions w/VPAS. Optional.
     *             </summary>
     */
    public java.lang.String getXID() {
        return XID;
    }


    /**
     * Sets the XID value for this EcommerceSecurityData.
     * 
     * @param XID   * <summary>
     *             Transaction identifier in its original, base64 encoded
     * form for Electronic Commerce transactions w/VPAS. Optional.
     *             </summary>
     */
    public void setXID(java.lang.String XID) {
        this.XID = XID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EcommerceSecurityData)) return false;
        EcommerceSecurityData other = (EcommerceSecurityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokenData==null && other.getTokenData()==null) || 
             (this.tokenData!=null &&
              this.tokenData.equals(other.getTokenData()))) &&
            ((this.tokenIndicator==null && other.getTokenIndicator()==null) || 
             (this.tokenIndicator!=null &&
              this.tokenIndicator.equals(other.getTokenIndicator()))) &&
            ((this.XID==null && other.getXID()==null) || 
             (this.XID!=null &&
              this.XID.equals(other.getXID())));
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
        if (getTokenData() != null) {
            _hashCode += getTokenData().hashCode();
        }
        if (getTokenIndicator() != null) {
            _hashCode += getTokenIndicator().hashCode();
        }
        if (getXID() != null) {
            _hashCode += getXID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EcommerceSecurityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EcommerceSecurityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TokenData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TokenIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TokenIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "XID"));
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
