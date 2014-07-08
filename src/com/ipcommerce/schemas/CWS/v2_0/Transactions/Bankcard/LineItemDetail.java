/**
 * LineItemDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard;


/**
 * <summary>
 *             Aggregate containing a collection of line item data. Allowed
 * by some Service Providers. Optional.
 *             </summary>
 */
public class LineItemDetail  implements java.io.Serializable {
    /* <summary>
     *             Line item total cost. Use DiscountIncluded and TaxIncluded
     * to specify whether this amount is inclusive of DiscountAmount and
     * Tax. Required.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Line item commodity code. Optional.
     *             </summary> */
    private java.lang.String commodityCode;

    /* <summary>
     *             Line item description. Optional.
     *             </summary> */
    private java.lang.String description;

    /* <summary>
     *             Discount amount for this line item. Optional.
     *             </summary> */
    private java.math.BigDecimal discountAmount;

    /* <summary>
     *             Indicates whether amount is inclusive of discount. Conditional,
     * required if DiscountAmount is specified.
     *             </summary> */
    private java.lang.Boolean discountIncluded;

    /* <summary>
     *             Line item product code. Optional.
     *             </summary> */
    private java.lang.String productCode;

    /* <summary>
     *             Quantity of item. Required.
     *             </summary> */
    private java.math.BigDecimal quantity;

    /* <summary>
     *             Tax details for this line item. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax;

    /* <summary>
     *             Indicates whether amount is inclusive of tax. Required.
     * </summary> */
    private java.lang.Boolean taxIncluded;

    /* <summary>
     *             Units used to measure quantity. Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeUnitOfMeasure unitOfMeasure;

    /* <summary>
     *             Price per unit of line item. Required.
     *             </summary> */
    private java.math.BigDecimal unitPrice;

    /* <summary>
     *             Line item UPC code. Optional.
     *             </summary> */
    private java.lang.String UPC;

    public LineItemDetail() {
    }

    public LineItemDetail(
           java.math.BigDecimal amount,
           java.lang.String commodityCode,
           java.lang.String description,
           java.math.BigDecimal discountAmount,
           java.lang.Boolean discountIncluded,
           java.lang.String productCode,
           java.math.BigDecimal quantity,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax,
           java.lang.Boolean taxIncluded,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeUnitOfMeasure unitOfMeasure,
           java.math.BigDecimal unitPrice,
           java.lang.String UPC) {
           this.amount = amount;
           this.commodityCode = commodityCode;
           this.description = description;
           this.discountAmount = discountAmount;
           this.discountIncluded = discountIncluded;
           this.productCode = productCode;
           this.quantity = quantity;
           this.tax = tax;
           this.taxIncluded = taxIncluded;
           this.unitOfMeasure = unitOfMeasure;
           this.unitPrice = unitPrice;
           this.UPC = UPC;
    }


    /**
     * Gets the amount value for this LineItemDetail.
     * 
     * @return amount   * <summary>
     *             Line item total cost. Use DiscountIncluded and TaxIncluded
     * to specify whether this amount is inclusive of DiscountAmount and
     * Tax. Required.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LineItemDetail.
     * 
     * @param amount   * <summary>
     *             Line item total cost. Use DiscountIncluded and TaxIncluded
     * to specify whether this amount is inclusive of DiscountAmount and
     * Tax. Required.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the commodityCode value for this LineItemDetail.
     * 
     * @return commodityCode   * <summary>
     *             Line item commodity code. Optional.
     *             </summary>
     */
    public java.lang.String getCommodityCode() {
        return commodityCode;
    }


    /**
     * Sets the commodityCode value for this LineItemDetail.
     * 
     * @param commodityCode   * <summary>
     *             Line item commodity code. Optional.
     *             </summary>
     */
    public void setCommodityCode(java.lang.String commodityCode) {
        this.commodityCode = commodityCode;
    }


    /**
     * Gets the description value for this LineItemDetail.
     * 
     * @return description   * <summary>
     *             Line item description. Optional.
     *             </summary>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LineItemDetail.
     * 
     * @param description   * <summary>
     *             Line item description. Optional.
     *             </summary>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discountAmount value for this LineItemDetail.
     * 
     * @return discountAmount   * <summary>
     *             Discount amount for this line item. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this LineItemDetail.
     * 
     * @param discountAmount   * <summary>
     *             Discount amount for this line item. Optional.
     *             </summary>
     */
    public void setDiscountAmount(java.math.BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the discountIncluded value for this LineItemDetail.
     * 
     * @return discountIncluded   * <summary>
     *             Indicates whether amount is inclusive of discount. Conditional,
     * required if DiscountAmount is specified.
     *             </summary>
     */
    public java.lang.Boolean getDiscountIncluded() {
        return discountIncluded;
    }


    /**
     * Sets the discountIncluded value for this LineItemDetail.
     * 
     * @param discountIncluded   * <summary>
     *             Indicates whether amount is inclusive of discount. Conditional,
     * required if DiscountAmount is specified.
     *             </summary>
     */
    public void setDiscountIncluded(java.lang.Boolean discountIncluded) {
        this.discountIncluded = discountIncluded;
    }


    /**
     * Gets the productCode value for this LineItemDetail.
     * 
     * @return productCode   * <summary>
     *             Line item product code. Optional.
     *             </summary>
     */
    public java.lang.String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this LineItemDetail.
     * 
     * @param productCode   * <summary>
     *             Line item product code. Optional.
     *             </summary>
     */
    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the quantity value for this LineItemDetail.
     * 
     * @return quantity   * <summary>
     *             Quantity of item. Required.
     *             </summary>
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this LineItemDetail.
     * 
     * @param quantity   * <summary>
     *             Quantity of item. Required.
     *             </summary>
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the tax value for this LineItemDetail.
     * 
     * @return tax   * <summary>
     *             Tax details for this line item. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this LineItemDetail.
     * 
     * @param tax   * <summary>
     *             Tax details for this line item. Optional.
     *             </summary>
     */
    public void setTax(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax tax) {
        this.tax = tax;
    }


    /**
     * Gets the taxIncluded value for this LineItemDetail.
     * 
     * @return taxIncluded   * <summary>
     *             Indicates whether amount is inclusive of tax. Required.
     * </summary>
     */
    public java.lang.Boolean getTaxIncluded() {
        return taxIncluded;
    }


    /**
     * Sets the taxIncluded value for this LineItemDetail.
     * 
     * @param taxIncluded   * <summary>
     *             Indicates whether amount is inclusive of tax. Required.
     * </summary>
     */
    public void setTaxIncluded(java.lang.Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }


    /**
     * Gets the unitOfMeasure value for this LineItemDetail.
     * 
     * @return unitOfMeasure   * <summary>
     *             Units used to measure quantity. Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this LineItemDetail.
     * 
     * @param unitOfMeasure   * <summary>
     *             Units used to measure quantity. Optional.
     *             </summary>
     */
    public void setUnitOfMeasure(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeUnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the unitPrice value for this LineItemDetail.
     * 
     * @return unitPrice   * <summary>
     *             Price per unit of line item. Required.
     *             </summary>
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this LineItemDetail.
     * 
     * @param unitPrice   * <summary>
     *             Price per unit of line item. Required.
     *             </summary>
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the UPC value for this LineItemDetail.
     * 
     * @return UPC   * <summary>
     *             Line item UPC code. Optional.
     *             </summary>
     */
    public java.lang.String getUPC() {
        return UPC;
    }


    /**
     * Sets the UPC value for this LineItemDetail.
     * 
     * @param UPC   * <summary>
     *             Line item UPC code. Optional.
     *             </summary>
     */
    public void setUPC(java.lang.String UPC) {
        this.UPC = UPC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemDetail)) return false;
        LineItemDetail other = (LineItemDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.commodityCode==null && other.getCommodityCode()==null) || 
             (this.commodityCode!=null &&
              this.commodityCode.equals(other.getCommodityCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.discountIncluded==null && other.getDiscountIncluded()==null) || 
             (this.discountIncluded!=null &&
              this.discountIncluded.equals(other.getDiscountIncluded()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.taxIncluded==null && other.getTaxIncluded()==null) || 
             (this.taxIncluded!=null &&
              this.taxIncluded.equals(other.getTaxIncluded()))) &&
            ((this.unitOfMeasure==null && other.getUnitOfMeasure()==null) || 
             (this.unitOfMeasure!=null &&
              this.unitOfMeasure.equals(other.getUnitOfMeasure()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.UPC==null && other.getUPC()==null) || 
             (this.UPC!=null &&
              this.UPC.equals(other.getUPC())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCommodityCode() != null) {
            _hashCode += getCommodityCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getDiscountIncluded() != null) {
            _hashCode += getDiscountIncluded().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getTaxIncluded() != null) {
            _hashCode += getTaxIncluded().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getUPC() != null) {
            _hashCode += getUPC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Amount"));
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
        elemField.setFieldName("discountIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "DiscountIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "UnitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeUnitOfMeasure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "UPC"));
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
