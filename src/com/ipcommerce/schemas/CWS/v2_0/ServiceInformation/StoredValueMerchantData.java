/**
 * StoredValueMerchantData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;


/**
 * <summary>
 *             Contains information specific to the Bankcard Processing
 * service class for the merchant using the application. Required for
 * merchants using Credit Card and PIN Debit services.
 *             </summary>
 */
public class StoredValueMerchantData  implements java.io.Serializable {
    /* <summary>
     *             Agent Chain identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String agentChain;

    /* <summary>
     *             Client number. Typically provisioned by the service provider.
     * Optional.
     *             </summary> */
    private java.lang.String clientNumber;

    /* <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) but may be overridden on each transaction.
     * Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType;

    /* <summary>
     *             Standard Industry Code. Identifies the merchant industry
     * classification. May be provisioned by the service provider. Required.
     * </summary> */
    private java.lang.String SIC;

    /* <summary>
     *             Unique merchant store identifier. Conditional, required
     * if provisioned by the service provider.
     *             </summary> */
    private java.lang.String storeId;

    /* <summary>
     *             Transaction device identifier. Often referred to as Terminal
     * Number or Terminal ID (TID). Conditional, required if provisioned
     * by the service provider.
     *             </summary> */
    private java.lang.String terminalId;

    public StoredValueMerchantData() {
    }

    public StoredValueMerchantData(
           java.lang.String agentChain,
           java.lang.String clientNumber,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType,
           java.lang.String SIC,
           java.lang.String storeId,
           java.lang.String terminalId) {
           this.agentChain = agentChain;
           this.clientNumber = clientNumber;
           this.industryType = industryType;
           this.SIC = SIC;
           this.storeId = storeId;
           this.terminalId = terminalId;
    }


    /**
     * Gets the agentChain value for this StoredValueMerchantData.
     * 
     * @return agentChain   * <summary>
     *             Agent Chain identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getAgentChain() {
        return agentChain;
    }


    /**
     * Sets the agentChain value for this StoredValueMerchantData.
     * 
     * @param agentChain   * <summary>
     *             Agent Chain identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setAgentChain(java.lang.String agentChain) {
        this.agentChain = agentChain;
    }


    /**
     * Gets the clientNumber value for this StoredValueMerchantData.
     * 
     * @return clientNumber   * <summary>
     *             Client number. Typically provisioned by the service provider.
     * Optional.
     *             </summary>
     */
    public java.lang.String getClientNumber() {
        return clientNumber;
    }


    /**
     * Sets the clientNumber value for this StoredValueMerchantData.
     * 
     * @param clientNumber   * <summary>
     *             Client number. Typically provisioned by the service provider.
     * Optional.
     *             </summary>
     */
    public void setClientNumber(java.lang.String clientNumber) {
        this.clientNumber = clientNumber;
    }


    /**
     * Gets the industryType value for this StoredValueMerchantData.
     * 
     * @return industryType   * <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) but may be overridden on each transaction.
     * Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this StoredValueMerchantData.
     * 
     * @param industryType   * <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) but may be overridden on each transaction.
     * Required.
     *             </summary>
     */
    public void setIndustryType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the SIC value for this StoredValueMerchantData.
     * 
     * @return SIC   * <summary>
     *             Standard Industry Code. Identifies the merchant industry
     * classification. May be provisioned by the service provider. Required.
     * </summary>
     */
    public java.lang.String getSIC() {
        return SIC;
    }


    /**
     * Sets the SIC value for this StoredValueMerchantData.
     * 
     * @param SIC   * <summary>
     *             Standard Industry Code. Identifies the merchant industry
     * classification. May be provisioned by the service provider. Required.
     * </summary>
     */
    public void setSIC(java.lang.String SIC) {
        this.SIC = SIC;
    }


    /**
     * Gets the storeId value for this StoredValueMerchantData.
     * 
     * @return storeId   * <summary>
     *             Unique merchant store identifier. Conditional, required
     * if provisioned by the service provider.
     *             </summary>
     */
    public java.lang.String getStoreId() {
        return storeId;
    }


    /**
     * Sets the storeId value for this StoredValueMerchantData.
     * 
     * @param storeId   * <summary>
     *             Unique merchant store identifier. Conditional, required
     * if provisioned by the service provider.
     *             </summary>
     */
    public void setStoreId(java.lang.String storeId) {
        this.storeId = storeId;
    }


    /**
     * Gets the terminalId value for this StoredValueMerchantData.
     * 
     * @return terminalId   * <summary>
     *             Transaction device identifier. Often referred to as Terminal
     * Number or Terminal ID (TID). Conditional, required if provisioned
     * by the service provider.
     *             </summary>
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this StoredValueMerchantData.
     * 
     * @param terminalId   * <summary>
     *             Transaction device identifier. Often referred to as Terminal
     * Number or Terminal ID (TID). Conditional, required if provisioned
     * by the service provider.
     *             </summary>
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueMerchantData)) return false;
        StoredValueMerchantData other = (StoredValueMerchantData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentChain==null && other.getAgentChain()==null) || 
             (this.agentChain!=null &&
              this.agentChain.equals(other.getAgentChain()))) &&
            ((this.clientNumber==null && other.getClientNumber()==null) || 
             (this.clientNumber!=null &&
              this.clientNumber.equals(other.getClientNumber()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.SIC==null && other.getSIC()==null) || 
             (this.SIC!=null &&
              this.SIC.equals(other.getSIC()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId())));
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
        if (getAgentChain() != null) {
            _hashCode += getAgentChain().hashCode();
        }
        if (getClientNumber() != null) {
            _hashCode += getClientNumber().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getSIC() != null) {
            _hashCode += getSIC().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueMerchantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentChain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AgentChain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ClientNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "IndustryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "IndustryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TerminalId"));
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
