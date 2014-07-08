/**
 * IIASData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Inventory Information Approval System (IIAS) data including
 * amounts for FSA eligible items.
 *             </summary>
 */
public class IIASData  implements java.io.Serializable {
    /* <summary>
     *             Specifies the total amount of eligible healthcare items
     * associated with the authorization. Conditional, required for IIAS
     * transactions.
     *             </summary> */
    private java.math.BigDecimal healthcareAmount;

    /* <summary>
     *             Specifies the portion of HealthCareAmt related to clinic
     * or other qualified expenses. Optional.
     *             </summary> */
    private java.math.BigDecimal clinicOtherAmount;

    /* <summary>
     *             Specifies the portion of HealthCareAmt related to dental
     * expenses. Optional.
     *             </summary> */
    private java.math.BigDecimal dentalAmount;

    /* <summary>
     *             Specifies the portion of HealthCareAmt related to prescription
     * expenses. Optional.
     *             </summary> */
    private java.math.BigDecimal prescriptionAmount;

    /* <summary>
     *             Specifies the portion of HealthCareAmt related to vision
     * or optical expenses. Optional.
     *             </summary> */
    private java.math.BigDecimal visionAmount;

    /* <summary>
     *             Specifies merchants IIAS status. Conditional, required
     * for IIAS transactions.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASDesignation IIASDesignation;

    public IIASData() {
    }

    public IIASData(
           java.math.BigDecimal healthcareAmount,
           java.math.BigDecimal clinicOtherAmount,
           java.math.BigDecimal dentalAmount,
           java.math.BigDecimal prescriptionAmount,
           java.math.BigDecimal visionAmount,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASDesignation IIASDesignation) {
           this.healthcareAmount = healthcareAmount;
           this.clinicOtherAmount = clinicOtherAmount;
           this.dentalAmount = dentalAmount;
           this.prescriptionAmount = prescriptionAmount;
           this.visionAmount = visionAmount;
           this.IIASDesignation = IIASDesignation;
    }


    /**
     * Gets the healthcareAmount value for this IIASData.
     * 
     * @return healthcareAmount   * <summary>
     *             Specifies the total amount of eligible healthcare items
     * associated with the authorization. Conditional, required for IIAS
     * transactions.
     *             </summary>
     */
    public java.math.BigDecimal getHealthcareAmount() {
        return healthcareAmount;
    }


    /**
     * Sets the healthcareAmount value for this IIASData.
     * 
     * @param healthcareAmount   * <summary>
     *             Specifies the total amount of eligible healthcare items
     * associated with the authorization. Conditional, required for IIAS
     * transactions.
     *             </summary>
     */
    public void setHealthcareAmount(java.math.BigDecimal healthcareAmount) {
        this.healthcareAmount = healthcareAmount;
    }


    /**
     * Gets the clinicOtherAmount value for this IIASData.
     * 
     * @return clinicOtherAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to clinic
     * or other qualified expenses. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getClinicOtherAmount() {
        return clinicOtherAmount;
    }


    /**
     * Sets the clinicOtherAmount value for this IIASData.
     * 
     * @param clinicOtherAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to clinic
     * or other qualified expenses. Optional.
     *             </summary>
     */
    public void setClinicOtherAmount(java.math.BigDecimal clinicOtherAmount) {
        this.clinicOtherAmount = clinicOtherAmount;
    }


    /**
     * Gets the dentalAmount value for this IIASData.
     * 
     * @return dentalAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to dental
     * expenses. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getDentalAmount() {
        return dentalAmount;
    }


    /**
     * Sets the dentalAmount value for this IIASData.
     * 
     * @param dentalAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to dental
     * expenses. Optional.
     *             </summary>
     */
    public void setDentalAmount(java.math.BigDecimal dentalAmount) {
        this.dentalAmount = dentalAmount;
    }


    /**
     * Gets the prescriptionAmount value for this IIASData.
     * 
     * @return prescriptionAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to prescription
     * expenses. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getPrescriptionAmount() {
        return prescriptionAmount;
    }


    /**
     * Sets the prescriptionAmount value for this IIASData.
     * 
     * @param prescriptionAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to prescription
     * expenses. Optional.
     *             </summary>
     */
    public void setPrescriptionAmount(java.math.BigDecimal prescriptionAmount) {
        this.prescriptionAmount = prescriptionAmount;
    }


    /**
     * Gets the visionAmount value for this IIASData.
     * 
     * @return visionAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to vision
     * or optical expenses. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getVisionAmount() {
        return visionAmount;
    }


    /**
     * Sets the visionAmount value for this IIASData.
     * 
     * @param visionAmount   * <summary>
     *             Specifies the portion of HealthCareAmt related to vision
     * or optical expenses. Optional.
     *             </summary>
     */
    public void setVisionAmount(java.math.BigDecimal visionAmount) {
        this.visionAmount = visionAmount;
    }


    /**
     * Gets the IIASDesignation value for this IIASData.
     * 
     * @return IIASDesignation   * <summary>
     *             Specifies merchants IIAS status. Conditional, required
     * for IIAS transactions.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASDesignation getIIASDesignation() {
        return IIASDesignation;
    }


    /**
     * Sets the IIASDesignation value for this IIASData.
     * 
     * @param IIASDesignation   * <summary>
     *             Specifies merchants IIAS status. Conditional, required
     * for IIAS transactions.
     *             </summary>
     */
    public void setIIASDesignation(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASDesignation IIASDesignation) {
        this.IIASDesignation = IIASDesignation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IIASData)) return false;
        IIASData other = (IIASData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.healthcareAmount==null && other.getHealthcareAmount()==null) || 
             (this.healthcareAmount!=null &&
              this.healthcareAmount.equals(other.getHealthcareAmount()))) &&
            ((this.clinicOtherAmount==null && other.getClinicOtherAmount()==null) || 
             (this.clinicOtherAmount!=null &&
              this.clinicOtherAmount.equals(other.getClinicOtherAmount()))) &&
            ((this.dentalAmount==null && other.getDentalAmount()==null) || 
             (this.dentalAmount!=null &&
              this.dentalAmount.equals(other.getDentalAmount()))) &&
            ((this.prescriptionAmount==null && other.getPrescriptionAmount()==null) || 
             (this.prescriptionAmount!=null &&
              this.prescriptionAmount.equals(other.getPrescriptionAmount()))) &&
            ((this.visionAmount==null && other.getVisionAmount()==null) || 
             (this.visionAmount!=null &&
              this.visionAmount.equals(other.getVisionAmount()))) &&
            ((this.IIASDesignation==null && other.getIIASDesignation()==null) || 
             (this.IIASDesignation!=null &&
              this.IIASDesignation.equals(other.getIIASDesignation())));
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
        if (getHealthcareAmount() != null) {
            _hashCode += getHealthcareAmount().hashCode();
        }
        if (getClinicOtherAmount() != null) {
            _hashCode += getClinicOtherAmount().hashCode();
        }
        if (getDentalAmount() != null) {
            _hashCode += getDentalAmount().hashCode();
        }
        if (getPrescriptionAmount() != null) {
            _hashCode += getPrescriptionAmount().hashCode();
        }
        if (getVisionAmount() != null) {
            _hashCode += getVisionAmount().hashCode();
        }
        if (getIIASDesignation() != null) {
            _hashCode += getIIASDesignation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IIASData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthcareAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "HealthcareAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinicOtherAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ClinicOtherAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dentalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DentalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prescriptionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PrescriptionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "VisionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIASDesignation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASDesignation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASDesignation"));
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
