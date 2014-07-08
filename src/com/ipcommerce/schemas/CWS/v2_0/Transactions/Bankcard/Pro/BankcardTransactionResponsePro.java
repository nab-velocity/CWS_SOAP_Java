/**
 * BankcardTransactionResponsePro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro;


/**
 * <summary>
 *             Response to Bankcard Pro transactions. Expected.
 *             </summary>
 */
public class BankcardTransactionResponsePro  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionResponse  implements java.io.Serializable {
    /* <summary>
     *             Specifies reason for issuer decline of recurring payment
     * transactions. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AdviceResponse adviceResponse;

    /* <summary>
     *             Indicates the status of the card with respect to its ability
     * to utilize purchase card data. When the card is a Business, Corporate,
     * or Purchase card, providing purchase card data can result in improved
     * interchange rates. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CommercialCardResponse commercialCardResponse;

    /* <summary>
     *             Provides information concerning the status of a transaction's
     * CPS qualification. Optional.
     *             </summary> */
    private java.lang.String returnedACI;

    public BankcardTransactionResponsePro() {
    }

    public BankcardTransactionResponsePro(
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
           java.lang.String reference,
           java.math.BigDecimal amount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType cardType,
           java.math.BigDecimal feeAmount,
           java.lang.String approvalCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSResult AVSResult,
           java.lang.String batchId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult CVResult,
           java.lang.String cardLevel,
           java.lang.String downgradeCode,
           java.lang.String maskedPAN,
           java.lang.String paymentAccountDataToken,
           java.lang.String retrievalReferenceNumber,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Resubmit resubmit,
           java.util.Calendar settlementDate,
           java.math.BigDecimal finalBalance,
           java.lang.String orderId,
           java.math.BigDecimal cashBackAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard prepaidCard,
           java.lang.String expire,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AdviceResponse adviceResponse,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CommercialCardResponse commercialCardResponse,
           java.lang.String returnedACI) {
        super(
            status,
            statusCode,
            statusMessage,
            transactionId,
            originatorTransactionId,
            serviceTransactionId,
            serviceTransactionDateTime,
            addendum,
            captureState,
            transactionState,
            isAcknowledged,
            reference,
            amount,
            cardType,
            feeAmount,
            approvalCode,
            AVSResult,
            batchId,
            CVResult,
            cardLevel,
            downgradeCode,
            maskedPAN,
            paymentAccountDataToken,
            retrievalReferenceNumber,
            resubmit,
            settlementDate,
            finalBalance,
            orderId,
            cashBackAmount,
            prepaidCard,
            expire);
        this.adviceResponse = adviceResponse;
        this.commercialCardResponse = commercialCardResponse;
        this.returnedACI = returnedACI;
    }


    /**
     * Gets the adviceResponse value for this BankcardTransactionResponsePro.
     * 
     * @return adviceResponse   * <summary>
     *             Specifies reason for issuer decline of recurring payment
     * transactions. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AdviceResponse getAdviceResponse() {
        return adviceResponse;
    }


    /**
     * Sets the adviceResponse value for this BankcardTransactionResponsePro.
     * 
     * @param adviceResponse   * <summary>
     *             Specifies reason for issuer decline of recurring payment
     * transactions. Optional.
     *             </summary>
     */
    public void setAdviceResponse(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AdviceResponse adviceResponse) {
        this.adviceResponse = adviceResponse;
    }


    /**
     * Gets the commercialCardResponse value for this BankcardTransactionResponsePro.
     * 
     * @return commercialCardResponse   * <summary>
     *             Indicates the status of the card with respect to its ability
     * to utilize purchase card data. When the card is a Business, Corporate,
     * or Purchase card, providing purchase card data can result in improved
     * interchange rates. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CommercialCardResponse getCommercialCardResponse() {
        return commercialCardResponse;
    }


    /**
     * Sets the commercialCardResponse value for this BankcardTransactionResponsePro.
     * 
     * @param commercialCardResponse   * <summary>
     *             Indicates the status of the card with respect to its ability
     * to utilize purchase card data. When the card is a Business, Corporate,
     * or Purchase card, providing purchase card data can result in improved
     * interchange rates. Optional.
     *             </summary>
     */
    public void setCommercialCardResponse(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CommercialCardResponse commercialCardResponse) {
        this.commercialCardResponse = commercialCardResponse;
    }


    /**
     * Gets the returnedACI value for this BankcardTransactionResponsePro.
     * 
     * @return returnedACI   * <summary>
     *             Provides information concerning the status of a transaction's
     * CPS qualification. Optional.
     *             </summary>
     */
    public java.lang.String getReturnedACI() {
        return returnedACI;
    }


    /**
     * Sets the returnedACI value for this BankcardTransactionResponsePro.
     * 
     * @param returnedACI   * <summary>
     *             Provides information concerning the status of a transaction's
     * CPS qualification. Optional.
     *             </summary>
     */
    public void setReturnedACI(java.lang.String returnedACI) {
        this.returnedACI = returnedACI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankcardTransactionResponsePro)) return false;
        BankcardTransactionResponsePro other = (BankcardTransactionResponsePro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adviceResponse==null && other.getAdviceResponse()==null) || 
             (this.adviceResponse!=null &&
              this.adviceResponse.equals(other.getAdviceResponse()))) &&
            ((this.commercialCardResponse==null && other.getCommercialCardResponse()==null) || 
             (this.commercialCardResponse!=null &&
              this.commercialCardResponse.equals(other.getCommercialCardResponse()))) &&
            ((this.returnedACI==null && other.getReturnedACI()==null) || 
             (this.returnedACI!=null &&
              this.returnedACI.equals(other.getReturnedACI())));
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
        if (getAdviceResponse() != null) {
            _hashCode += getAdviceResponse().hashCode();
        }
        if (getCommercialCardResponse() != null) {
            _hashCode += getCommercialCardResponse().hashCode();
        }
        if (getReturnedACI() != null) {
            _hashCode += getReturnedACI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankcardTransactionResponsePro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionResponsePro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adviceResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "AdviceResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AdviceResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialCardResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "CommercialCardResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CommercialCardResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnedACI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "ReturnedACI"));
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
