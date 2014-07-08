/**
 * BasicHttpBinding_ICwsTransactionProcessingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing;

public class BasicHttpBinding_ICwsTransactionProcessingStub extends org.apache.axis.client.Stub implements com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.ICwsTransactionProcessing {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Ipc.General.WCF.Contracts.Common/External", "PingResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Ipc.General.WCF.Contracts.Common", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "QueryAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Verify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "VerifyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Authorize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "AuthorizeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Adjust");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Adjust"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "AdjustResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthorizeAndCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "AuthorizeAndCaptureResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReturnUnlinked");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ReturnUnlinkedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReturnById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Return"), com.ipcommerce.schemas.CWS.v2_0.Transactions._return.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ReturnByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Undo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Undo"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "UndoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Capture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CaptureAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCapture"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "batchIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureAllResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CaptureAllAsync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCapture"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "batchIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureAllAsyncResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CaptureSelective");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transactionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCapture"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureSelectiveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CaptureSelectiveAsync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transactionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCapture"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureSelectiveAsyncResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Acknowledge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transactionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "AcknowledgeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "tenderData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionTenderData"), com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "RequestTransactionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ManageAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageAccountById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "differenceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Manage"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ManageAccountByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Disburse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "transaction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction"), com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "workflowId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "DisburseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault"), 
                      true
                     ));
        _operations[18] = oper;

    }

    public BasicHttpBinding_ICwsTransactionProcessingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ICwsTransactionProcessingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ICwsTransactionProcessingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCapturePro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardCapturePro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCaptureResponsePro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardCaptureResponsePro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardInterchangeData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardReturnPro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardReturnPro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionDataPro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardTransactionDataPro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionPro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardTransactionPro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionResponsePro");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardTransactionResponsePro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AddressResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AddressResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AdviceResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AdviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ApplicationLocation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ApplicationLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ArrayOfItemizedTax");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTax");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ArrayOfLineItemDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "AVSResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.AVSResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardApplicationConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardApplicationConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardCapture");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardCapture.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardCaptureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardReturn");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardUndo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardUndo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BillPayment");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BillPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardholderNameResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardholderNameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CardSecurityData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ChargeType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CityResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CityResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CommercialCardResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CommercialCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CountryResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CountryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "CustomerPresent");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "EcommerceSecurityData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.EcommerceSecurityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ExistingDebt");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ExistingDebt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "GoodsType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.GoodsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "HardwareType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.HardwareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IIASDesignation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IIASDesignation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "InternetTransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.InternetTransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Interval");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Interval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "IsTaxExempt");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.IsTaxExempt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ItemizedTax");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ItemizedTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Level2Data");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Level2Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "LineItemDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.LineItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ManagedBilling");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ManagedBillingInstallments");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ManagedBillingInstallments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PartialApprovalSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PartialApprovalSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PhoneResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PhoneResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PINDebitUndoReason");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PINDebitUndoReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PostalCodeResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PostalCodeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "PrepaidCard");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.PrepaidCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ReadCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.ReadCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestACI");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestACI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestAdvice");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestAdvice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "RequestCommercialCard");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.RequestCommercialCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Resubmit");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Resubmit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "StateResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.StateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Tax");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TaxExempt");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TaxExempt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TokenIndicator");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TokenIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "Totals");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Totals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionCode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TransactionSummaryData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TransactionSummaryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeTaxType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckCountryCode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckCountryCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckImage");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.CheckImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "DocType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.DocType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingCaptureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCustomerData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingCustomerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingTransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingUndo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ElectronicCheckingUndo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgCompressionType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgCompressionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ImgFormatType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ImgFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "OwnerType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.OwnerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnInformation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ReturnInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "SECCode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.SECCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "TransactionType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.TransactionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UndoType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UndoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "ArrayOfCWSValidationErrorFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationErrorFault[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSBaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSBaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault.EErrorType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationErrorFaultEErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ArrayOfConsumerIdentification");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardSecurityData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardSecurityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.ConsumerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdEntryMode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdEntryMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "IdType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.IdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OperationType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueActivateTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueActivateTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueBalanceTransferTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueBalanceTransferTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueCapture");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueCapture.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueCaptureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueManage");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueManage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueReturn");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "VirtualCardData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.VirtualCardData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Addendum");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AddressInfo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Adjust");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AlternativeMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCapture");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillPayServiceData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Capture");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CustomerInfo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.CustomerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVDataProvided");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.CVDataProvided.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVResult");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "DriversLicense");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.DriversLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "EntryMode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "IndustryType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Manage");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "NameInfo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.NameInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PayeeData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.PayeeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PersonalInfo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.PersonalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "PINlessDebitData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.PINlessDebitData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Response");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Return");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions._return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ServiceTransactionDateTime");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Status");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "SummaryTotals");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.SummaryTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Transaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionCustomerData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionCustomerData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionReportingData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionReportingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionTenderData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCountryCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeISOCurrencyCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TypeStateProvince");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeStateProvince.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Undo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "Unmanaged");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Unmanaged.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.AuthenticationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.BaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Ipc.General.WCF.Contracts.Common/External", "PingResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Ipc.General.WCF.Contracts.Common/IExternallyFacingStandardOperations/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Ipc.General.WCF.Contracts.Common", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response queryAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/QueryAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "QueryAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response verify(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Verify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Verify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorize(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Authorize");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Authorize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response adjust(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Adjust");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Adjust"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorizeAndCapture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/AuthorizeAndCapture");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "AuthorizeAndCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnUnlinked(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/ReturnUnlinked");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ReturnUnlinked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions._return differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/ReturnById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ReturnById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response undo(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Undo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Undo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response capture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Capture");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Capture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureAll(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/CaptureAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, batchIds, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureAllAsync(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/CaptureAllAsync");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureAllAsync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, batchIds, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureSelective(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/CaptureSelective");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureSelective"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transactionIds, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureSelectiveAsync(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/CaptureSelectiveAsync");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "CaptureSelectiveAsync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transactionIds, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response acknowledge(java.lang.String sessionToken, java.lang.String transactionId, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Acknowledge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Acknowledge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transactionId, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] requestTransaction(java.lang.String sessionToken, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData tenderData) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/RequestTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "RequestTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, merchantProfileId, tenderData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/ManageAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ManageAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccountById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/ManageAccountById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "ManageAccountById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, differenceData, applicationProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response disburse(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing/ICwsTransactionProcessing/Disburse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/TransactionProcessing", "Disburse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.Transactions.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.Transactions.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
