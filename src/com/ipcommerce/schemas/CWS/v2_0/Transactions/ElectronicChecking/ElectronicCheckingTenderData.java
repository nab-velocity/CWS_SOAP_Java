/**
 * ElectronicCheckingTenderData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;

public class ElectronicCheckingTenderData  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData  implements java.io.Serializable {
    /* <summary>
     *             Back side image. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage backCheckImage;

    /* <summary>
     *             Basic information about the check being processed. Required.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckData checkData;

    /* <summary>
     *             Front side image. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage frontCheckImage;

    public ElectronicCheckingTenderData() {
    }

    public ElectronicCheckingTenderData(
           java.lang.String paymentAccountDataToken,
           java.lang.String securePaymentAccountData,
           java.lang.String encryptionKeyId,
           java.lang.String swipeStatus,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage backCheckImage,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckData checkData,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage frontCheckImage) {
        super(
            paymentAccountDataToken,
            securePaymentAccountData,
            encryptionKeyId,
            swipeStatus);
        this.backCheckImage = backCheckImage;
        this.checkData = checkData;
        this.frontCheckImage = frontCheckImage;
    }


    /**
     * Gets the backCheckImage value for this ElectronicCheckingTenderData.
     * 
     * @return backCheckImage   * <summary>
     *             Back side image. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage getBackCheckImage() {
        return backCheckImage;
    }


    /**
     * Sets the backCheckImage value for this ElectronicCheckingTenderData.
     * 
     * @param backCheckImage   * <summary>
     *             Back side image. Optional.
     *             </summary>
     */
    public void setBackCheckImage(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage backCheckImage) {
        this.backCheckImage = backCheckImage;
    }


    /**
     * Gets the checkData value for this ElectronicCheckingTenderData.
     * 
     * @return checkData   * <summary>
     *             Basic information about the check being processed. Required.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckData getCheckData() {
        return checkData;
    }


    /**
     * Sets the checkData value for this ElectronicCheckingTenderData.
     * 
     * @param checkData   * <summary>
     *             Basic information about the check being processed. Required.
     * </summary>
     */
    public void setCheckData(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckData checkData) {
        this.checkData = checkData;
    }


    /**
     * Gets the frontCheckImage value for this ElectronicCheckingTenderData.
     * 
     * @return frontCheckImage   * <summary>
     *             Front side image. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage getFrontCheckImage() {
        return frontCheckImage;
    }


    /**
     * Sets the frontCheckImage value for this ElectronicCheckingTenderData.
     * 
     * @param frontCheckImage   * <summary>
     *             Front side image. Optional.
     *             </summary>
     */
    public void setFrontCheckImage(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage frontCheckImage) {
        this.frontCheckImage = frontCheckImage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicCheckingTenderData)) return false;
        ElectronicCheckingTenderData other = (ElectronicCheckingTenderData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.backCheckImage==null && other.getBackCheckImage()==null) || 
             (this.backCheckImage!=null &&
              this.backCheckImage.equals(other.getBackCheckImage()))) &&
            ((this.checkData==null && other.getCheckData()==null) || 
             (this.checkData!=null &&
              this.checkData.equals(other.getCheckData()))) &&
            ((this.frontCheckImage==null && other.getFrontCheckImage()==null) || 
             (this.frontCheckImage!=null &&
              this.frontCheckImage.equals(other.getFrontCheckImage())));
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
        if (getBackCheckImage() != null) {
            _hashCode += getBackCheckImage().hashCode();
        }
        if (getCheckData() != null) {
            _hashCode += getCheckData().hashCode();
        }
        if (getFrontCheckImage() != null) {
            _hashCode += getFrontCheckImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicCheckingTenderData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTenderData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backCheckImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "BackCheckImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frontCheckImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "FrontCheckImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckImage"));
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
