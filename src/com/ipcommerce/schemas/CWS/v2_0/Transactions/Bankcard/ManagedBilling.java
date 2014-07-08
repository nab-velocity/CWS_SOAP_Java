/**
 * ManagedBilling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Configuration to setup and perform an automated recurring
 * payment on behalf of the merchant. Conditional, optional if ManagedBilling
 * (ServiceInformation) = 'true', otherwise not present.
 *             </summary>
 */
public class ManagedBilling  implements java.io.Serializable {
    /* <summary>
     *             Amount the cardholder is initially paying towards the
     * purchase. Optional.
     *             </summary> */
    private java.math.BigDecimal downPayment;

    /* <summary>
     *             Installment data. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBillingInstallments installments;

    /* <summary>
     *             Unit used in calculating the period. Required.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Interval interval;

    /* <summary>
     *             Number of intervals between each payment. Required.
     *             </summary> */
    private java.lang.Integer period;

    /* <summary>
     *             Date when the recurring payments should be initiated.
     * Required.
     *             </summary> */
    private java.util.Calendar startDate;

    public ManagedBilling() {
    }

    public ManagedBilling(
           java.math.BigDecimal downPayment,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBillingInstallments installments,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Interval interval,
           java.lang.Integer period,
           java.util.Calendar startDate) {
           this.downPayment = downPayment;
           this.installments = installments;
           this.interval = interval;
           this.period = period;
           this.startDate = startDate;
    }


    /**
     * Gets the downPayment value for this ManagedBilling.
     * 
     * @return downPayment   * <summary>
     *             Amount the cardholder is initially paying towards the
     * purchase. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getDownPayment() {
        return downPayment;
    }


    /**
     * Sets the downPayment value for this ManagedBilling.
     * 
     * @param downPayment   * <summary>
     *             Amount the cardholder is initially paying towards the
     * purchase. Optional.
     *             </summary>
     */
    public void setDownPayment(java.math.BigDecimal downPayment) {
        this.downPayment = downPayment;
    }


    /**
     * Gets the installments value for this ManagedBilling.
     * 
     * @return installments   * <summary>
     *             Installment data. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBillingInstallments getInstallments() {
        return installments;
    }


    /**
     * Sets the installments value for this ManagedBilling.
     * 
     * @param installments   * <summary>
     *             Installment data. Required.
     *             </summary>
     */
    public void setInstallments(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBillingInstallments installments) {
        this.installments = installments;
    }


    /**
     * Gets the interval value for this ManagedBilling.
     * 
     * @return interval   * <summary>
     *             Unit used in calculating the period. Required.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Interval getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this ManagedBilling.
     * 
     * @param interval   * <summary>
     *             Unit used in calculating the period. Required.
     *             </summary>
     */
    public void setInterval(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Interval interval) {
        this.interval = interval;
    }


    /**
     * Gets the period value for this ManagedBilling.
     * 
     * @return period   * <summary>
     *             Number of intervals between each payment. Required.
     *             </summary>
     */
    public java.lang.Integer getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this ManagedBilling.
     * 
     * @param period   * <summary>
     *             Number of intervals between each payment. Required.
     *             </summary>
     */
    public void setPeriod(java.lang.Integer period) {
        this.period = period;
    }


    /**
     * Gets the startDate value for this ManagedBilling.
     * 
     * @return startDate   * <summary>
     *             Date when the recurring payments should be initiated.
     * Required.
     *             </summary>
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ManagedBilling.
     * 
     * @param startDate   * <summary>
     *             Date when the recurring payments should be initiated.
     * Required.
     *             </summary>
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedBilling)) return false;
        ManagedBilling other = (ManagedBilling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.downPayment==null && other.getDownPayment()==null) || 
             (this.downPayment!=null &&
              this.downPayment.equals(other.getDownPayment()))) &&
            ((this.installments==null && other.getInstallments()==null) || 
             (this.installments!=null &&
              this.installments.equals(other.getInstallments()))) &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getDownPayment() != null) {
            _hashCode += getDownPayment().hashCode();
        }
        if (getInstallments() != null) {
            _hashCode += getInstallments().hashCode();
        }
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedBilling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ManagedBilling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DownPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Installments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ManagedBillingInstallments"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Interval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
