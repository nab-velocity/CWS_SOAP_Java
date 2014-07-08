/**
 * NameInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions;


/**
 * <summary>
 *             Contains information about the customer name. Conditional,
 * required by some Service Providers. If this value is set on the transaction
 * and not required by the Service Provider, the data will not be present
 * on the transaction.
 *             </summary>
 */
public class NameInfo  implements java.io.Serializable {
    /* <summary>
     *             Title. Optional.
     *             </summary> */
    private java.lang.String title;

    /* <summary>
     *             First name. Required.
     *             </summary> */
    private java.lang.String first;

    /* <summary>
     *             Middle name or initial. Optional.
     *             </summary> */
    private java.lang.String middle;

    /* <summary>
     *             Last name. Required.
     *             </summary> */
    private java.lang.String last;

    /* <summary>
     *             Suffix. Optional.
     *             </summary> */
    private java.lang.String suffix;

    public NameInfo() {
    }

    public NameInfo(
           java.lang.String title,
           java.lang.String first,
           java.lang.String middle,
           java.lang.String last,
           java.lang.String suffix) {
           this.title = title;
           this.first = first;
           this.middle = middle;
           this.last = last;
           this.suffix = suffix;
    }


    /**
     * Gets the title value for this NameInfo.
     * 
     * @return title   * <summary>
     *             Title. Optional.
     *             </summary>
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NameInfo.
     * 
     * @param title   * <summary>
     *             Title. Optional.
     *             </summary>
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the first value for this NameInfo.
     * 
     * @return first   * <summary>
     *             First name. Required.
     *             </summary>
     */
    public java.lang.String getFirst() {
        return first;
    }


    /**
     * Sets the first value for this NameInfo.
     * 
     * @param first   * <summary>
     *             First name. Required.
     *             </summary>
     */
    public void setFirst(java.lang.String first) {
        this.first = first;
    }


    /**
     * Gets the middle value for this NameInfo.
     * 
     * @return middle   * <summary>
     *             Middle name or initial. Optional.
     *             </summary>
     */
    public java.lang.String getMiddle() {
        return middle;
    }


    /**
     * Sets the middle value for this NameInfo.
     * 
     * @param middle   * <summary>
     *             Middle name or initial. Optional.
     *             </summary>
     */
    public void setMiddle(java.lang.String middle) {
        this.middle = middle;
    }


    /**
     * Gets the last value for this NameInfo.
     * 
     * @return last   * <summary>
     *             Last name. Required.
     *             </summary>
     */
    public java.lang.String getLast() {
        return last;
    }


    /**
     * Sets the last value for this NameInfo.
     * 
     * @param last   * <summary>
     *             Last name. Required.
     *             </summary>
     */
    public void setLast(java.lang.String last) {
        this.last = last;
    }


    /**
     * Gets the suffix value for this NameInfo.
     * 
     * @return suffix   * <summary>
     *             Suffix. Optional.
     *             </summary>
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this NameInfo.
     * 
     * @param suffix   * <summary>
     *             Suffix. Optional.
     *             </summary>
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameInfo)) return false;
        NameInfo other = (NameInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.first==null && other.getFirst()==null) || 
             (this.first!=null &&
              this.first.equals(other.getFirst()))) &&
            ((this.middle==null && other.getMiddle()==null) || 
             (this.middle!=null &&
              this.middle.equals(other.getMiddle()))) &&
            ((this.last==null && other.getLast()==null) || 
             (this.last!=null &&
              this.last.equals(other.getLast()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirst() != null) {
            _hashCode += getFirst().hashCode();
        }
        if (getMiddle() != null) {
            _hashCode += getMiddle().hashCode();
        }
        if (getLast() != null) {
            _hashCode += getLast().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "NameInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "First"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Suffix"));
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
