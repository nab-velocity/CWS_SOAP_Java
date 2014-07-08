/**
 * Level2Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Aggregate of elements specific to Level 2/Purchase Card
 * transactions. Optional.
 *             </summary>
 */
public class Level2Data  implements java.io.Serializable {
    /* <summary>
     *             Base amount of the transaction, not including freight,
     * handling, and tax amounts. Required.
     *             </summary> */
    private java.math.BigDecimal baseAmount;

    /* <summary>
     *             Commodity code for the entire purchase. Optional.
     *             </summary> */
    private java.lang.String commodityCode;

    /* <summary>
     *             Name of company making purchase. Optional.
     *             </summary> */
    private java.lang.String companyName;

    /* <summary>
     *             Code provided by cardholder to appear on invoice. Optional.
     * </summary> */
    private java.lang.String customerCode;

    /* <summary>
     *             Destination country code of the goods being shipped. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 destinationCountryCode;

    /* <summary>
     *             Destination postal code. Optional.
     *             </summary> */
    private java.lang.String destinationPostal;

    /* <summary>
     *             Description of the purchase. Optional.
     *             </summary> */
    private java.lang.String description;

    /* <summary>
     *             Discount amount. Optional.
     *             </summary> */
    private java.math.BigDecimal discountAmount;

    /* <summary>
     *             Duty amount. Optional.
     *             </summary> */
    private java.math.BigDecimal dutyAmount;

    /* <summary>
     *             Freight amount. Optional.
     *             </summary> */
    private java.math.BigDecimal freightAmount;

    /* <summary>
     *             Miscellaneous handling charges. Optional.
     *             </summary> */
    private java.math.BigDecimal miscHandlingAmount;

    /* <summary>
     *             Date the order was placed. Optional.
     *             </summary> */
    private java.util.Calendar orderDate;

    /* <summary>
     *             Order number. Required.
     *             </summary> */
    private java.lang.String orderNumber;

    /* <summary>
     *             Name of the person making the request. Optional.
     *             </summary> */
    private java.lang.String requesterName;

    /* <summary>
     *             The zip/postal code of the location from which the goods
     * are shipped. Optional.
     *             </summary> */
    private java.lang.String shipFromPostalCode;

    /* <summary>
     *             Number of the shipment. Optional.
     *             </summary> */
    private java.lang.String shipmentId;

    /* <summary>
     *             Tax exemption indicator and number. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TaxExempt taxExempt;

    /* <summary>
     *             Aggregate of tax information. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax;

    public Level2Data() {
    }

    public Level2Data(
           java.math.BigDecimal baseAmount,
           java.lang.String commodityCode,
           java.lang.String companyName,
           java.lang.String customerCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 destinationCountryCode,
           java.lang.String destinationPostal,
           java.lang.String description,
           java.math.BigDecimal discountAmount,
           java.math.BigDecimal dutyAmount,
           java.math.BigDecimal freightAmount,
           java.math.BigDecimal miscHandlingAmount,
           java.util.Calendar orderDate,
           java.lang.String orderNumber,
           java.lang.String requesterName,
           java.lang.String shipFromPostalCode,
           java.lang.String shipmentId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TaxExempt taxExempt,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax) {
           this.baseAmount = baseAmount;
           this.commodityCode = commodityCode;
           this.companyName = companyName;
           this.customerCode = customerCode;
           this.destinationCountryCode = destinationCountryCode;
           this.destinationPostal = destinationPostal;
           this.description = description;
           this.discountAmount = discountAmount;
           this.dutyAmount = dutyAmount;
           this.freightAmount = freightAmount;
           this.miscHandlingAmount = miscHandlingAmount;
           this.orderDate = orderDate;
           this.orderNumber = orderNumber;
           this.requesterName = requesterName;
           this.shipFromPostalCode = shipFromPostalCode;
           this.shipmentId = shipmentId;
           this.taxExempt = taxExempt;
           this.tax = tax;
    }


    /**
     * Gets the baseAmount value for this Level2Data.
     * 
     * @return baseAmount   * <summary>
     *             Base amount of the transaction, not including freight,
     * handling, and tax amounts. Required.
     *             </summary>
     */
    public java.math.BigDecimal getBaseAmount() {
        return baseAmount;
    }


    /**
     * Sets the baseAmount value for this Level2Data.
     * 
     * @param baseAmount   * <summary>
     *             Base amount of the transaction, not including freight,
     * handling, and tax amounts. Required.
     *             </summary>
     */
    public void setBaseAmount(java.math.BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }


    /**
     * Gets the commodityCode value for this Level2Data.
     * 
     * @return commodityCode   * <summary>
     *             Commodity code for the entire purchase. Optional.
     *             </summary>
     */
    public java.lang.String getCommodityCode() {
        return commodityCode;
    }


    /**
     * Sets the commodityCode value for this Level2Data.
     * 
     * @param commodityCode   * <summary>
     *             Commodity code for the entire purchase. Optional.
     *             </summary>
     */
    public void setCommodityCode(java.lang.String commodityCode) {
        this.commodityCode = commodityCode;
    }


    /**
     * Gets the companyName value for this Level2Data.
     * 
     * @return companyName   * <summary>
     *             Name of company making purchase. Optional.
     *             </summary>
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Level2Data.
     * 
     * @param companyName   * <summary>
     *             Name of company making purchase. Optional.
     *             </summary>
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the customerCode value for this Level2Data.
     * 
     * @return customerCode   * <summary>
     *             Code provided by cardholder to appear on invoice. Optional.
     * </summary>
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this Level2Data.
     * 
     * @param customerCode   * <summary>
     *             Code provided by cardholder to appear on invoice. Optional.
     * </summary>
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the destinationCountryCode value for this Level2Data.
     * 
     * @return destinationCountryCode   * <summary>
     *             Destination country code of the goods being shipped. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 getDestinationCountryCode() {
        return destinationCountryCode;
    }


    /**
     * Sets the destinationCountryCode value for this Level2Data.
     * 
     * @param destinationCountryCode   * <summary>
     *             Destination country code of the goods being shipped. Optional.
     * </summary>
     */
    public void setDestinationCountryCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3 destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }


    /**
     * Gets the destinationPostal value for this Level2Data.
     * 
     * @return destinationPostal   * <summary>
     *             Destination postal code. Optional.
     *             </summary>
     */
    public java.lang.String getDestinationPostal() {
        return destinationPostal;
    }


    /**
     * Sets the destinationPostal value for this Level2Data.
     * 
     * @param destinationPostal   * <summary>
     *             Destination postal code. Optional.
     *             </summary>
     */
    public void setDestinationPostal(java.lang.String destinationPostal) {
        this.destinationPostal = destinationPostal;
    }


    /**
     * Gets the description value for this Level2Data.
     * 
     * @return description   * <summary>
     *             Description of the purchase. Optional.
     *             </summary>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Level2Data.
     * 
     * @param description   * <summary>
     *             Description of the purchase. Optional.
     *             </summary>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discountAmount value for this Level2Data.
     * 
     * @return discountAmount   * <summary>
     *             Discount amount. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this Level2Data.
     * 
     * @param discountAmount   * <summary>
     *             Discount amount. Optional.
     *             </summary>
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the dutyAmount value for this Level2Data.
     * 
     * @return dutyAmount   * <summary>
     *             Duty amount. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getDutyAmount() {
        return dutyAmount;
    }


    /**
     * Sets the dutyAmount value for this Level2Data.
     * 
     * @param dutyAmount   * <summary>
     *             Duty amount. Optional.
     *             </summary>
     */
    public void setDutyAmount(java.math.BigDecimal dutyAmount) {
        this.dutyAmount = dutyAmount;
    }


    /**
     * Gets the freightAmount value for this Level2Data.
     * 
     * @return freightAmount   * <summary>
     *             Freight amount. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getFreightAmount() {
        return freightAmount;
    }


    /**
     * Sets the freightAmount value for this Level2Data.
     * 
     * @param freightAmount   * <summary>
     *             Freight amount. Optional.
     *             </summary>
     */
    public void setFreightAmount(java.math.BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }


    /**
     * Gets the miscHandlingAmount value for this Level2Data.
     * 
     * @return miscHandlingAmount   * <summary>
     *             Miscellaneous handling charges. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getMiscHandlingAmount() {
        return miscHandlingAmount;
    }


    /**
     * Sets the miscHandlingAmount value for this Level2Data.
     * 
     * @param miscHandlingAmount   * <summary>
     *             Miscellaneous handling charges. Optional.
     *             </summary>
     */
    public void setMiscHandlingAmount(java.math.BigDecimal miscHandlingAmount) {
        this.miscHandlingAmount = miscHandlingAmount;
    }


    /**
     * Gets the orderDate value for this Level2Data.
     * 
     * @return orderDate   * <summary>
     *             Date the order was placed. Optional.
     *             </summary>
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this Level2Data.
     * 
     * @param orderDate   * <summary>
     *             Date the order was placed. Optional.
     *             </summary>
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderNumber value for this Level2Data.
     * 
     * @return orderNumber   * <summary>
     *             Order number. Required.
     *             </summary>
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Level2Data.
     * 
     * @param orderNumber   * <summary>
     *             Order number. Required.
     *             </summary>
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the requesterName value for this Level2Data.
     * 
     * @return requesterName   * <summary>
     *             Name of the person making the request. Optional.
     *             </summary>
     */
    public java.lang.String getRequesterName() {
        return requesterName;
    }


    /**
     * Sets the requesterName value for this Level2Data.
     * 
     * @param requesterName   * <summary>
     *             Name of the person making the request. Optional.
     *             </summary>
     */
    public void setRequesterName(java.lang.String requesterName) {
        this.requesterName = requesterName;
    }


    /**
     * Gets the shipFromPostalCode value for this Level2Data.
     * 
     * @return shipFromPostalCode   * <summary>
     *             The zip/postal code of the location from which the goods
     * are shipped. Optional.
     *             </summary>
     */
    public java.lang.String getShipFromPostalCode() {
        return shipFromPostalCode;
    }


    /**
     * Sets the shipFromPostalCode value for this Level2Data.
     * 
     * @param shipFromPostalCode   * <summary>
     *             The zip/postal code of the location from which the goods
     * are shipped. Optional.
     *             </summary>
     */
    public void setShipFromPostalCode(java.lang.String shipFromPostalCode) {
        this.shipFromPostalCode = shipFromPostalCode;
    }


    /**
     * Gets the shipmentId value for this Level2Data.
     * 
     * @return shipmentId   * <summary>
     *             Number of the shipment. Optional.
     *             </summary>
     */
    public java.lang.String getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this Level2Data.
     * 
     * @param shipmentId   * <summary>
     *             Number of the shipment. Optional.
     *             </summary>
     */
    public void setShipmentId(java.lang.String shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the taxExempt value for this Level2Data.
     * 
     * @return taxExempt   * <summary>
     *             Tax exemption indicator and number. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TaxExempt getTaxExempt() {
        return taxExempt;
    }


    /**
     * Sets the taxExempt value for this Level2Data.
     * 
     * @param taxExempt   * <summary>
     *             Tax exemption indicator and number. Optional.
     *             </summary>
     */
    public void setTaxExempt(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TaxExempt taxExempt) {
        this.taxExempt = taxExempt;
    }


    /**
     * Gets the tax value for this Level2Data.
     * 
     * @return tax   * <summary>
     *             Aggregate of tax information. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this Level2Data.
     * 
     * @param tax   * <summary>
     *             Aggregate of tax information. Optional.
     *             </summary>
     */
    public void setTax(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax) {
        this.tax = tax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Level2Data)) return false;
        Level2Data other = (Level2Data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseAmount==null && other.getBaseAmount()==null) || 
             (this.baseAmount!=null &&
              this.baseAmount.equals(other.getBaseAmount()))) &&
            ((this.commodityCode==null && other.getCommodityCode()==null) || 
             (this.commodityCode!=null &&
              this.commodityCode.equals(other.getCommodityCode()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.destinationCountryCode==null && other.getDestinationCountryCode()==null) || 
             (this.destinationCountryCode!=null &&
              this.destinationCountryCode.equals(other.getDestinationCountryCode()))) &&
            ((this.destinationPostal==null && other.getDestinationPostal()==null) || 
             (this.destinationPostal!=null &&
              this.destinationPostal.equals(other.getDestinationPostal()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.dutyAmount==null && other.getDutyAmount()==null) || 
             (this.dutyAmount!=null &&
              this.dutyAmount.equals(other.getDutyAmount()))) &&
            ((this.freightAmount==null && other.getFreightAmount()==null) || 
             (this.freightAmount!=null &&
              this.freightAmount.equals(other.getFreightAmount()))) &&
            ((this.miscHandlingAmount==null && other.getMiscHandlingAmount()==null) || 
             (this.miscHandlingAmount!=null &&
              this.miscHandlingAmount.equals(other.getMiscHandlingAmount()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.requesterName==null && other.getRequesterName()==null) || 
             (this.requesterName!=null &&
              this.requesterName.equals(other.getRequesterName()))) &&
            ((this.shipFromPostalCode==null && other.getShipFromPostalCode()==null) || 
             (this.shipFromPostalCode!=null &&
              this.shipFromPostalCode.equals(other.getShipFromPostalCode()))) &&
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.taxExempt==null && other.getTaxExempt()==null) || 
             (this.taxExempt!=null &&
              this.taxExempt.equals(other.getTaxExempt()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax())));
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
        if (getBaseAmount() != null) {
            _hashCode += getBaseAmount().hashCode();
        }
        if (getCommodityCode() != null) {
            _hashCode += getCommodityCode().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getDestinationCountryCode() != null) {
            _hashCode += getDestinationCountryCode().hashCode();
        }
        if (getDestinationPostal() != null) {
            _hashCode += getDestinationPostal().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDutyAmount() != null) {
            _hashCode += getDutyAmount().hashCode();
        }
        if (getFreightAmount() != null) {
            _hashCode += getFreightAmount().hashCode();
        }
        if (getMiscHandlingAmount() != null) {
            _hashCode += getMiscHandlingAmount().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getRequesterName() != null) {
            _hashCode += getRequesterName().hashCode();
        }
        if (getShipFromPostalCode() != null) {
            _hashCode += getShipFromPostalCode().hashCode();
        }
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getTaxExempt() != null) {
            _hashCode += getTaxExempt().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Level2Data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Level2Data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BaseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CommodityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DestinationCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCountryCodeA3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DestinationPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DutyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "FreightAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscHandlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "MiscHandlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "OrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequesterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ShipFromPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxExempt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax"));
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
