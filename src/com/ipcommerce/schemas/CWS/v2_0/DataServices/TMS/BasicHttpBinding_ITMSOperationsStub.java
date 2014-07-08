/**
 * BasicHttpBinding_ITMSOperationsStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;

public class BasicHttpBinding_ITMSOperationsStub extends org.apache.axis.client.Stub implements com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ITMSOperations {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
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
        oper.setName("QueryBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryBatchParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryBatchParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryBatchParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfBatchDetailData"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryBatchResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDetailData"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTransactionFamilies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryTransactionsParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfFamilyDetail"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionFamiliesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyDetail"));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTransactionsDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryTransactionsParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "transactionDetailFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetailFormat"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetailFormat.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "includeRelated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfTransactionDetail"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsDetailResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTransactionsSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryTransactionsParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "includeRelated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfSummaryDetail"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsSummaryResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryDetail"));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryRejectedSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryRejectedParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedSummaryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryRejectedDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "queryRejectedParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "pagingParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters"), com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryResponse"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedDetailResult"));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public BasicHttpBinding_ITMSOperationsStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ITMSOperationsStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ITMSOperationsStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSBaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSBaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "ArrayOfTMSValidationError");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError.EErrorType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationErrorEErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfBatchDetailData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDetailData");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDetailData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfFamilyDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyDetail");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryDetail");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfTransactionClassTypePair");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfTransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ArrayOfTransactionMetaData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BankcardData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BankcardData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BatchDetailData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "BooleanParameter");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BooleanParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CompleteTransaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CompleteTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "CWSTransaction");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.CWSTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckingRejectedDetailResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckingRejectedDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckingRejectedSummaryResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckingRejectedSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "ElectronicCheckQueryRejectedParameters");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ElectronicCheckQueryRejectedParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "FamilyInformation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryBatchParameters");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryBatchParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedParameters");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsParameters");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "RejectedSummary");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.RejectedSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "StoredValueData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.StoredValueData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "SummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionClassTypePair");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionClassTypePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionDetailFormat");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetailFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionInformation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TransactionMetaData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionMetaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "TypeDateType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TypeDateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "DSBaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.DSBaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices", "PagingParameters");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "AddressInfo");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationLocation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EncryptionType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "HardwareType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "IndustryType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReadCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOCountryCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOLanguageCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOLanguageCodeA3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeStateProvince");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardInterchangeData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.BankcardInterchangeData.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "ArrayOfTypeCardType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.TypeCardType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "TypeCardType");
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Bankcard", "BankcardCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.BankcardCaptureResponse.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.UseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueCaptureResponse");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.StoredValueCaptureResponse.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "AlternativeMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.AlternativeMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfCaptureState");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CaptureState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "ArrayOfTransactionState");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "TransactionState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "BillPayServiceData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.Transactions.BillPayServiceData.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdecimal");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "decimal");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[] queryBatch(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryBatchParameters queryBatchParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryBatchParameters, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[] queryTransactionFamilies(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryTransactionFamilies");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionFamilies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryTransactionsParameters, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[].class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] queryTransactionsDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetailFormat transactionDetailFormat, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryTransactionsDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryTransactionsParameters, transactionDetailFormat, includeRelated, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[].class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[] queryTransactionsSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryTransactionsSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryTransactionsSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryTransactionsParameters, includeRelated, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[].class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryRejectedSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryRejectedParameters, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS/ITMSOperations/QueryRejectedDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/DataServices/TMS", "QueryRejectedDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, queryRejectedParameters, pagingParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse.class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
