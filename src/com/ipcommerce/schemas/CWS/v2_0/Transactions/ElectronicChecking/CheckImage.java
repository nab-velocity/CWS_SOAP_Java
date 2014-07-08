/**
 * CheckImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking;


/**
 * <remarks />
 */
public class CheckImage  implements java.io.Serializable {
    /* <summary>Indicates the compression type used. 0 = Group4, 1
     * = JPEG, 2 = ABIC, 3-20 = reserved-agreement not required, 21 = PNG,
     * 22 = JBIG, 23 = JPEG2000, 24-99 = reserved for future use - as defined
     * in X9.37 specification. Required.</summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgCompressionType compressionType;

    /* <summary>Indicates the document type. Required.</summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.DocType docType;

    /* <summary>Indicates the format of the image. 0 = TIFF 6, 1 =
     * IOCA FS 11, 2-19 = Reserved-agreement not required, 20 = PNG, 21 =
     * JFIF, 22 = SPIFF, 23 = JBIG, 24 = JPEG 2000, 25-99 = Reserved for
     * future use - as defined in X9.37 specification. Required.</summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgFormatType formatType;

    /* <summary>Binary image data encoded as Base64 string. Required.</summary> */
    private byte[] imgData;

    /* <summary>The length of the data included in the ImgData element.
     * Required.</summary> */
    private java.lang.Integer imgSize;

    /* <summary>Reference field to be passed along with image view
     * in X9.37 file. Optional.</summary> */
    private java.lang.String userField;

    public CheckImage() {
    }

    public CheckImage(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgCompressionType compressionType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.DocType docType,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgFormatType formatType,
           byte[] imgData,
           java.lang.Integer imgSize,
           java.lang.String userField) {
           this.compressionType = compressionType;
           this.docType = docType;
           this.formatType = formatType;
           this.imgData = imgData;
           this.imgSize = imgSize;
           this.userField = userField;
    }


    /**
     * Gets the compressionType value for this CheckImage.
     * 
     * @return compressionType   * <summary>Indicates the compression type used. 0 = Group4, 1
     * = JPEG, 2 = ABIC, 3-20 = reserved-agreement not required, 21 = PNG,
     * 22 = JBIG, 23 = JPEG2000, 24-99 = reserved for future use - as defined
     * in X9.37 specification. Required.</summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgCompressionType getCompressionType() {
        return compressionType;
    }


    /**
     * Sets the compressionType value for this CheckImage.
     * 
     * @param compressionType   * <summary>Indicates the compression type used. 0 = Group4, 1
     * = JPEG, 2 = ABIC, 3-20 = reserved-agreement not required, 21 = PNG,
     * 22 = JBIG, 23 = JPEG2000, 24-99 = reserved for future use - as defined
     * in X9.37 specification. Required.</summary>
     */
    public void setCompressionType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgCompressionType compressionType) {
        this.compressionType = compressionType;
    }


    /**
     * Gets the docType value for this CheckImage.
     * 
     * @return docType   * <summary>Indicates the document type. Required.</summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.DocType getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this CheckImage.
     * 
     * @param docType   * <summary>Indicates the document type. Required.</summary>
     */
    public void setDocType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.DocType docType) {
        this.docType = docType;
    }


    /**
     * Gets the formatType value for this CheckImage.
     * 
     * @return formatType   * <summary>Indicates the format of the image. 0 = TIFF 6, 1 =
     * IOCA FS 11, 2-19 = Reserved-agreement not required, 20 = PNG, 21 =
     * JFIF, 22 = SPIFF, 23 = JBIG, 24 = JPEG 2000, 25-99 = Reserved for
     * future use - as defined in X9.37 specification. Required.</summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgFormatType getFormatType() {
        return formatType;
    }


    /**
     * Sets the formatType value for this CheckImage.
     * 
     * @param formatType   * <summary>Indicates the format of the image. 0 = TIFF 6, 1 =
     * IOCA FS 11, 2-19 = Reserved-agreement not required, 20 = PNG, 21 =
     * JFIF, 22 = SPIFF, 23 = JBIG, 24 = JPEG 2000, 25-99 = Reserved for
     * future use - as defined in X9.37 specification. Required.</summary>
     */
    public void setFormatType(com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgFormatType formatType) {
        this.formatType = formatType;
    }


    /**
     * Gets the imgData value for this CheckImage.
     * 
     * @return imgData   * <summary>Binary image data encoded as Base64 string. Required.</summary>
     */
    public byte[] getImgData() {
        return imgData;
    }


    /**
     * Sets the imgData value for this CheckImage.
     * 
     * @param imgData   * <summary>Binary image data encoded as Base64 string. Required.</summary>
     */
    public void setImgData(byte[] imgData) {
        this.imgData = imgData;
    }


    /**
     * Gets the imgSize value for this CheckImage.
     * 
     * @return imgSize   * <summary>The length of the data included in the ImgData element.
     * Required.</summary>
     */
    public java.lang.Integer getImgSize() {
        return imgSize;
    }


    /**
     * Sets the imgSize value for this CheckImage.
     * 
     * @param imgSize   * <summary>The length of the data included in the ImgData element.
     * Required.</summary>
     */
    public void setImgSize(java.lang.Integer imgSize) {
        this.imgSize = imgSize;
    }


    /**
     * Gets the userField value for this CheckImage.
     * 
     * @return userField   * <summary>Reference field to be passed along with image view
     * in X9.37 file. Optional.</summary>
     */
    public java.lang.String getUserField() {
        return userField;
    }


    /**
     * Sets the userField value for this CheckImage.
     * 
     * @param userField   * <summary>Reference field to be passed along with image view
     * in X9.37 file. Optional.</summary>
     */
    public void setUserField(java.lang.String userField) {
        this.userField = userField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckImage)) return false;
        CheckImage other = (CheckImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.compressionType==null && other.getCompressionType()==null) || 
             (this.compressionType!=null &&
              this.compressionType.equals(other.getCompressionType()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.formatType==null && other.getFormatType()==null) || 
             (this.formatType!=null &&
              this.formatType.equals(other.getFormatType()))) &&
            ((this.imgData==null && other.getImgData()==null) || 
             (this.imgData!=null &&
              java.util.Arrays.equals(this.imgData, other.getImgData()))) &&
            ((this.imgSize==null && other.getImgSize()==null) || 
             (this.imgSize!=null &&
              this.imgSize.equals(other.getImgSize()))) &&
            ((this.userField==null && other.getUserField()==null) || 
             (this.userField!=null &&
              this.userField.equals(other.getUserField())));
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
        if (getCompressionType() != null) {
            _hashCode += getCompressionType().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getFormatType() != null) {
            _hashCode += getFormatType().hashCode();
        }
        if (getImgData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImgData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImgData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImgSize() != null) {
            _hashCode += getImgSize().hashCode();
        }
        if (getUserField() != null) {
            _hashCode += getUserField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CompressionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgCompressionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "DocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "DocType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "FormatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgFormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imgData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imgSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UserField"));
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
