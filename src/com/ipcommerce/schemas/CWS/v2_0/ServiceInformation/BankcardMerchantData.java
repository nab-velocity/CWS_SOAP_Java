/**
 * BankcardMerchantData.java
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
public class BankcardMerchantData  implements java.io.Serializable {
    /* <summary>
     *             Identifies the merchant to a direct debit switch. Conditional,
     * required if provisioned by the service provider.
     *             </summary> */
    private java.lang.String ABANumber;

    /* <summary>
     *             Acquirer Bank Identification Number. Identifies the merchant's
     * acquiring bank. Typically provisioned by the service provider. Optional.
     * </summary> */
    private java.lang.String acquirerBIN;

    /* <summary>
     *             Agent Bank Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String agentBank;

    /* <summary>
     *             Agent Chain Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String agentChain;

    /* <summary>
     *             Identifies the merchant as an aggregator. Typically provisioned
     * by the service provider. If not present, the default value is 'false'.
     * Optional.
     *             </summary> */
    private java.lang.Boolean aggregator;

    /* <summary>
     *             Client number. Typically provisioned by the service provider.
     * Optional.
     *             </summary> */
    private java.lang.String clientNumber;

    /* <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) and cannot be overridden on each
     * transaction. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType;

    /* <summary>
     *             Unique identifier for the merchant's location. Conditional,
     * required if provisioned by the service provider.
     *             </summary> */
    private java.lang.String location;

    /* <summary>
     *             Merchant type. Typically provisioned by the service provider.
     * Optional.
     *             </summary> */
    private java.lang.String merchantType;

    /* <summary>
     *             Indicates whether to print the customer service telephone
     * number on the customer's transaction receipt. Conditional, required
     * for MOTO transactions.
     *             </summary> */
    private java.lang.Boolean printCustomerServicePhone;

    /* <summary>
     *             Qualification codes. Typically provisioned by the service
     * provider. Optional.
     *             </summary> */
    private java.lang.String qualificationCodes;

    /* <summary>
     *             Designates the reimbursement fee applicable to the transaction.
     * Conditional, required if provisioned by the service provider.
     *             </summary> */
    private java.lang.String reimbursementAttribute;

    /* <summary>
     *             Standard Industry Code. Identifies the merchant industry
     * classification. May be provisioned by the service provider. Required.
     * </summary> */
    private java.lang.String SIC;

    /* <summary>
     *             Additional transaction device identifier. Conditional,
     * required if provisioned by the service provider.
     *             </summary> */
    private java.lang.String secondaryTerminalId;

    /* <summary>
     *             Identifies the merchant settling agent to direct debit
     * networks. Conditional, required if provisioned by the service provider.
     * </summary> */
    private java.lang.String settlementAgent;

    /* <summary>
     *             Provides a list of debit and EBT networks that a Point-of-Sale
     * (POS) system can access. Conditional, required if provisioned by the
     * service provider.
     *             </summary> */
    private java.lang.String sharingGroup;

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

    /* <summary>
     *             Timezone of the merchant location and the Daylight Savings
     * Time observation status. Conditional, required if provisioned by the
     * service provider.
     *             </summary> */
    private java.lang.String timeZoneDifferential;

    public BankcardMerchantData() {
    }

    public BankcardMerchantData(
           java.lang.String ABANumber,
           java.lang.String acquirerBIN,
           java.lang.String agentBank,
           java.lang.String agentChain,
           java.lang.Boolean aggregator,
           java.lang.String clientNumber,
           com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType,
           java.lang.String location,
           java.lang.String merchantType,
           java.lang.Boolean printCustomerServicePhone,
           java.lang.String qualificationCodes,
           java.lang.String reimbursementAttribute,
           java.lang.String SIC,
           java.lang.String secondaryTerminalId,
           java.lang.String settlementAgent,
           java.lang.String sharingGroup,
           java.lang.String storeId,
           java.lang.String terminalId,
           java.lang.String timeZoneDifferential) {
           this.ABANumber = ABANumber;
           this.acquirerBIN = acquirerBIN;
           this.agentBank = agentBank;
           this.agentChain = agentChain;
           this.aggregator = aggregator;
           this.clientNumber = clientNumber;
           this.industryType = industryType;
           this.location = location;
           this.merchantType = merchantType;
           this.printCustomerServicePhone = printCustomerServicePhone;
           this.qualificationCodes = qualificationCodes;
           this.reimbursementAttribute = reimbursementAttribute;
           this.SIC = SIC;
           this.secondaryTerminalId = secondaryTerminalId;
           this.settlementAgent = settlementAgent;
           this.sharingGroup = sharingGroup;
           this.storeId = storeId;
           this.terminalId = terminalId;
           this.timeZoneDifferential = timeZoneDifferential;
    }


    /**
     * Gets the ABANumber value for this BankcardMerchantData.
     * 
     * @return ABANumber   * <summary>
     *             Identifies the merchant to a direct debit switch. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public java.lang.String getABANumber() {
        return ABANumber;
    }


    /**
     * Sets the ABANumber value for this BankcardMerchantData.
     * 
     * @param ABANumber   * <summary>
     *             Identifies the merchant to a direct debit switch. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public void setABANumber(java.lang.String ABANumber) {
        this.ABANumber = ABANumber;
    }


    /**
     * Gets the acquirerBIN value for this BankcardMerchantData.
     * 
     * @return acquirerBIN   * <summary>
     *             Acquirer Bank Identification Number. Identifies the merchant's
     * acquiring bank. Typically provisioned by the service provider. Optional.
     * </summary>
     */
    public java.lang.String getAcquirerBIN() {
        return acquirerBIN;
    }


    /**
     * Sets the acquirerBIN value for this BankcardMerchantData.
     * 
     * @param acquirerBIN   * <summary>
     *             Acquirer Bank Identification Number. Identifies the merchant's
     * acquiring bank. Typically provisioned by the service provider. Optional.
     * </summary>
     */
    public void setAcquirerBIN(java.lang.String acquirerBIN) {
        this.acquirerBIN = acquirerBIN;
    }


    /**
     * Gets the agentBank value for this BankcardMerchantData.
     * 
     * @return agentBank   * <summary>
     *             Agent Bank Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getAgentBank() {
        return agentBank;
    }


    /**
     * Sets the agentBank value for this BankcardMerchantData.
     * 
     * @param agentBank   * <summary>
     *             Agent Bank Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setAgentBank(java.lang.String agentBank) {
        this.agentBank = agentBank;
    }


    /**
     * Gets the agentChain value for this BankcardMerchantData.
     * 
     * @return agentChain   * <summary>
     *             Agent Chain Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getAgentChain() {
        return agentChain;
    }


    /**
     * Sets the agentChain value for this BankcardMerchantData.
     * 
     * @param agentChain   * <summary>
     *             Agent Chain Identifier. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setAgentChain(java.lang.String agentChain) {
        this.agentChain = agentChain;
    }


    /**
     * Gets the aggregator value for this BankcardMerchantData.
     * 
     * @return aggregator   * <summary>
     *             Identifies the merchant as an aggregator. Typically provisioned
     * by the service provider. If not present, the default value is 'false'.
     * Optional.
     *             </summary>
     */
    public java.lang.Boolean getAggregator() {
        return aggregator;
    }


    /**
     * Sets the aggregator value for this BankcardMerchantData.
     * 
     * @param aggregator   * <summary>
     *             Identifies the merchant as an aggregator. Typically provisioned
     * by the service provider. If not present, the default value is 'false'.
     * Optional.
     *             </summary>
     */
    public void setAggregator(java.lang.Boolean aggregator) {
        this.aggregator = aggregator;
    }


    /**
     * Gets the clientNumber value for this BankcardMerchantData.
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
     * Sets the clientNumber value for this BankcardMerchantData.
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
     * Gets the industryType value for this BankcardMerchantData.
     * 
     * @return industryType   * <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) and cannot be overridden on each
     * transaction. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this BankcardMerchantData.
     * 
     * @param industryType   * <summary>
     *             The industry type of the transaction. This will be saved
     * in the MerchantProfile (default) and cannot be overridden on each
     * transaction. Required.
     *             </summary>
     */
    public void setIndustryType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the location value for this BankcardMerchantData.
     * 
     * @return location   * <summary>
     *             Unique identifier for the merchant's location. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BankcardMerchantData.
     * 
     * @param location   * <summary>
     *             Unique identifier for the merchant's location. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the merchantType value for this BankcardMerchantData.
     * 
     * @return merchantType   * <summary>
     *             Merchant type. Typically provisioned by the service provider.
     * Optional.
     *             </summary>
     */
    public java.lang.String getMerchantType() {
        return merchantType;
    }


    /**
     * Sets the merchantType value for this BankcardMerchantData.
     * 
     * @param merchantType   * <summary>
     *             Merchant type. Typically provisioned by the service provider.
     * Optional.
     *             </summary>
     */
    public void setMerchantType(java.lang.String merchantType) {
        this.merchantType = merchantType;
    }


    /**
     * Gets the printCustomerServicePhone value for this BankcardMerchantData.
     * 
     * @return printCustomerServicePhone   * <summary>
     *             Indicates whether to print the customer service telephone
     * number on the customer's transaction receipt. Conditional, required
     * for MOTO transactions.
     *             </summary>
     */
    public java.lang.Boolean getPrintCustomerServicePhone() {
        return printCustomerServicePhone;
    }


    /**
     * Sets the printCustomerServicePhone value for this BankcardMerchantData.
     * 
     * @param printCustomerServicePhone   * <summary>
     *             Indicates whether to print the customer service telephone
     * number on the customer's transaction receipt. Conditional, required
     * for MOTO transactions.
     *             </summary>
     */
    public void setPrintCustomerServicePhone(java.lang.Boolean printCustomerServicePhone) {
        this.printCustomerServicePhone = printCustomerServicePhone;
    }


    /**
     * Gets the qualificationCodes value for this BankcardMerchantData.
     * 
     * @return qualificationCodes   * <summary>
     *             Qualification codes. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public java.lang.String getQualificationCodes() {
        return qualificationCodes;
    }


    /**
     * Sets the qualificationCodes value for this BankcardMerchantData.
     * 
     * @param qualificationCodes   * <summary>
     *             Qualification codes. Typically provisioned by the service
     * provider. Optional.
     *             </summary>
     */
    public void setQualificationCodes(java.lang.String qualificationCodes) {
        this.qualificationCodes = qualificationCodes;
    }


    /**
     * Gets the reimbursementAttribute value for this BankcardMerchantData.
     * 
     * @return reimbursementAttribute   * <summary>
     *             Designates the reimbursement fee applicable to the transaction.
     * Conditional, required if provisioned by the service provider.
     *             </summary>
     */
    public java.lang.String getReimbursementAttribute() {
        return reimbursementAttribute;
    }


    /**
     * Sets the reimbursementAttribute value for this BankcardMerchantData.
     * 
     * @param reimbursementAttribute   * <summary>
     *             Designates the reimbursement fee applicable to the transaction.
     * Conditional, required if provisioned by the service provider.
     *             </summary>
     */
    public void setReimbursementAttribute(java.lang.String reimbursementAttribute) {
        this.reimbursementAttribute = reimbursementAttribute;
    }


    /**
     * Gets the SIC value for this BankcardMerchantData.
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
     * Sets the SIC value for this BankcardMerchantData.
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
     * Gets the secondaryTerminalId value for this BankcardMerchantData.
     * 
     * @return secondaryTerminalId   * <summary>
     *             Additional transaction device identifier. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public java.lang.String getSecondaryTerminalId() {
        return secondaryTerminalId;
    }


    /**
     * Sets the secondaryTerminalId value for this BankcardMerchantData.
     * 
     * @param secondaryTerminalId   * <summary>
     *             Additional transaction device identifier. Conditional,
     * required if provisioned by the service provider.
     *             </summary>
     */
    public void setSecondaryTerminalId(java.lang.String secondaryTerminalId) {
        this.secondaryTerminalId = secondaryTerminalId;
    }


    /**
     * Gets the settlementAgent value for this BankcardMerchantData.
     * 
     * @return settlementAgent   * <summary>
     *             Identifies the merchant settling agent to direct debit
     * networks. Conditional, required if provisioned by the service provider.
     * </summary>
     */
    public java.lang.String getSettlementAgent() {
        return settlementAgent;
    }


    /**
     * Sets the settlementAgent value for this BankcardMerchantData.
     * 
     * @param settlementAgent   * <summary>
     *             Identifies the merchant settling agent to direct debit
     * networks. Conditional, required if provisioned by the service provider.
     * </summary>
     */
    public void setSettlementAgent(java.lang.String settlementAgent) {
        this.settlementAgent = settlementAgent;
    }


    /**
     * Gets the sharingGroup value for this BankcardMerchantData.
     * 
     * @return sharingGroup   * <summary>
     *             Provides a list of debit and EBT networks that a Point-of-Sale
     * (POS) system can access. Conditional, required if provisioned by the
     * service provider.
     *             </summary>
     */
    public java.lang.String getSharingGroup() {
        return sharingGroup;
    }


    /**
     * Sets the sharingGroup value for this BankcardMerchantData.
     * 
     * @param sharingGroup   * <summary>
     *             Provides a list of debit and EBT networks that a Point-of-Sale
     * (POS) system can access. Conditional, required if provisioned by the
     * service provider.
     *             </summary>
     */
    public void setSharingGroup(java.lang.String sharingGroup) {
        this.sharingGroup = sharingGroup;
    }


    /**
     * Gets the storeId value for this BankcardMerchantData.
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
     * Sets the storeId value for this BankcardMerchantData.
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
     * Gets the terminalId value for this BankcardMerchantData.
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
     * Sets the terminalId value for this BankcardMerchantData.
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


    /**
     * Gets the timeZoneDifferential value for this BankcardMerchantData.
     * 
     * @return timeZoneDifferential   * <summary>
     *             Timezone of the merchant location and the Daylight Savings
     * Time observation status. Conditional, required if provisioned by the
     * service provider.
     *             </summary>
     */
    public java.lang.String getTimeZoneDifferential() {
        return timeZoneDifferential;
    }


    /**
     * Sets the timeZoneDifferential value for this BankcardMerchantData.
     * 
     * @param timeZoneDifferential   * <summary>
     *             Timezone of the merchant location and the Daylight Savings
     * Time observation status. Conditional, required if provisioned by the
     * service provider.
     *             </summary>
     */
    public void setTimeZoneDifferential(java.lang.String timeZoneDifferential) {
        this.timeZoneDifferential = timeZoneDifferential;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardMerchantData)) return false;
        BankcardMerchantData other = (BankcardMerchantData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ABANumber==null && other.getABANumber()==null) || 
             (this.ABANumber!=null &&
              this.ABANumber.equals(other.getABANumber()))) &&
            ((this.acquirerBIN==null && other.getAcquirerBIN()==null) || 
             (this.acquirerBIN!=null &&
              this.acquirerBIN.equals(other.getAcquirerBIN()))) &&
            ((this.agentBank==null && other.getAgentBank()==null) || 
             (this.agentBank!=null &&
              this.agentBank.equals(other.getAgentBank()))) &&
            ((this.agentChain==null && other.getAgentChain()==null) || 
             (this.agentChain!=null &&
              this.agentChain.equals(other.getAgentChain()))) &&
            ((this.aggregator==null && other.getAggregator()==null) || 
             (this.aggregator!=null &&
              this.aggregator.equals(other.getAggregator()))) &&
            ((this.clientNumber==null && other.getClientNumber()==null) || 
             (this.clientNumber!=null &&
              this.clientNumber.equals(other.getClientNumber()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.merchantType==null && other.getMerchantType()==null) || 
             (this.merchantType!=null &&
              this.merchantType.equals(other.getMerchantType()))) &&
            ((this.printCustomerServicePhone==null && other.getPrintCustomerServicePhone()==null) || 
             (this.printCustomerServicePhone!=null &&
              this.printCustomerServicePhone.equals(other.getPrintCustomerServicePhone()))) &&
            ((this.qualificationCodes==null && other.getQualificationCodes()==null) || 
             (this.qualificationCodes!=null &&
              this.qualificationCodes.equals(other.getQualificationCodes()))) &&
            ((this.reimbursementAttribute==null && other.getReimbursementAttribute()==null) || 
             (this.reimbursementAttribute!=null &&
              this.reimbursementAttribute.equals(other.getReimbursementAttribute()))) &&
            ((this.SIC==null && other.getSIC()==null) || 
             (this.SIC!=null &&
              this.SIC.equals(other.getSIC()))) &&
            ((this.secondaryTerminalId==null && other.getSecondaryTerminalId()==null) || 
             (this.secondaryTerminalId!=null &&
              this.secondaryTerminalId.equals(other.getSecondaryTerminalId()))) &&
            ((this.settlementAgent==null && other.getSettlementAgent()==null) || 
             (this.settlementAgent!=null &&
              this.settlementAgent.equals(other.getSettlementAgent()))) &&
            ((this.sharingGroup==null && other.getSharingGroup()==null) || 
             (this.sharingGroup!=null &&
              this.sharingGroup.equals(other.getSharingGroup()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.timeZoneDifferential==null && other.getTimeZoneDifferential()==null) || 
             (this.timeZoneDifferential!=null &&
              this.timeZoneDifferential.equals(other.getTimeZoneDifferential())));
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
        if (getABANumber() != null) {
            _hashCode += getABANumber().hashCode();
        }
        if (getAcquirerBIN() != null) {
            _hashCode += getAcquirerBIN().hashCode();
        }
        if (getAgentBank() != null) {
            _hashCode += getAgentBank().hashCode();
        }
        if (getAgentChain() != null) {
            _hashCode += getAgentChain().hashCode();
        }
        if (getAggregator() != null) {
            _hashCode += getAggregator().hashCode();
        }
        if (getClientNumber() != null) {
            _hashCode += getClientNumber().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMerchantType() != null) {
            _hashCode += getMerchantType().hashCode();
        }
        if (getPrintCustomerServicePhone() != null) {
            _hashCode += getPrintCustomerServicePhone().hashCode();
        }
        if (getQualificationCodes() != null) {
            _hashCode += getQualificationCodes().hashCode();
        }
        if (getReimbursementAttribute() != null) {
            _hashCode += getReimbursementAttribute().hashCode();
        }
        if (getSIC() != null) {
            _hashCode += getSIC().hashCode();
        }
        if (getSecondaryTerminalId() != null) {
            _hashCode += getSecondaryTerminalId().hashCode();
        }
        if (getSettlementAgent() != null) {
            _hashCode += getSettlementAgent().hashCode();
        }
        if (getSharingGroup() != null) {
            _hashCode += getSharingGroup().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getTimeZoneDifferential() != null) {
            _hashCode += getTimeZoneDifferential().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardMerchantData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ABANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerBIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AcquirerBIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AgentBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentChain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AgentChain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Aggregator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printCustomerServicePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PrintCustomerServicePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QualificationCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursementAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReimbursementAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryTerminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SecondaryTerminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SettlementAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SharingGroup"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneDifferential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TimeZoneDifferential"));
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
