/**
 * BasicHttpBinding_ICWSServiceInformationStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class BasicHttpBinding_ICWSServiceInformationStub extends org.apache.axis.client.Stub implements com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
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
        oper.setName("SignOnWithToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "identityToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnWithTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceInformation"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetServiceInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveApplicationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "applicationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationData"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SaveApplicationDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
                      true
                     ));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApplicationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ApplicationData"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetApplicationDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteApplicationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "applicationProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
                      true
                     ));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsMerchantProfileInitialized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "IsMerchantProfileInitializedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMerchantProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfMerchantProfile"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfilesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMerchantProfileIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfileIdsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMerchantProfilesByProfileId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfMerchantProfile"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfilesByProfileIdResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMerchantProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"));
        oper.setReturnClass(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteMerchantProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveMerchantProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfiles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfMerchantProfile"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
                      true
                     ));
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SignOnWithUsernamePasswordForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnWithUsernamePasswordForServiceKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "LockedByAdminFault"),
                      "com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "LockedByAdminFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "OneTimePasswordFault"),
                      "com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "OneTimePasswordFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordExpiredFault"),
                      "com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordExpiredFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BadAttemptThresholdExceededFault"),
                      "com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BadAttemptThresholdExceededFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetPasswordForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SendEmailFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "GeneratePasswordFault"),
                      "com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "GeneratePasswordFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePasswordForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordInvalidFault"),
                      "com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordInvalidFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SendEmailFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeUsernameForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "newUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SendEmailFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeEmailForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "newEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SendEmailFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidEmailFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidEmailFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPasswordExpirationForServiceKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetPasswordExpirationForServiceKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateMerchantProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "serviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "tenderType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "merchantProfile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile"), com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"),
                      "com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllClaims");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "authenticatingToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "verifiedToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData"));
        oper.setReturnClass(com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetAllClaimsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault"),
                      "com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClaims");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "authenticatingToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "verifiedToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "claimNSs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetClaimsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault"),
                      "com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Renew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "authenticatingToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "toRenewToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RenewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "NonRenewableTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "NonRenewableTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"),
                      "com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SignOnAndAddClaims");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "identityToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "claims"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData"), com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnAndAddClaimsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DelegatedSignOn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "identityToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "onBehalfOfSk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "claims"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData"), com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DelegatedSignOnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FederatedSignOn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "identityToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "externalDomainToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "FederatedSignOnResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FederatedSignOnAndAddClaims");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "identityToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "externalDomainToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "claims"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData"), com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "FederatedSignOnAndAddClaimsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"),
                      "com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault"), 
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
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthenticationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"),
                      "com.ipcommerce.schemas.Identity._1_0.AuthorizationFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"),
                      "com.ipcommerce.schemas.Identity._1_0.SystemFault",
                      new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault"), 
                      true
                     ));
        _operations[26] = oper;

    }

    public BasicHttpBinding_ICWSServiceInformationStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ICWSServiceInformationStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ICWSServiceInformationStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "ArrayOfCWSValidationErrorFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSBaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSBaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault.EErrorType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFaultEErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfBankcardService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfElectronicCheckingService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingService");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfMerchantProfile");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfStoredValueService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfWorkflow");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ArrayOfWorkflowService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardServiceAVSData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardServiceAVSData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BankcardTransactionDataDefaults");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BankcardTransactionDataDefaults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "BatchAssignmentSupport");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.BatchAssignmentSupport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CloseBatch");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CloseBatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditAuthorizeSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditAuthorizeSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReturnSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReturnSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CreditReversalSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CreditReversalSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "CustomerPresent");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ElectronicCheckingService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EncryptionType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "EntryMode");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfile");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "MerchantProfileTransactionData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfileTransactionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Operations");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Operations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PartialApprovalSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PartialApprovalSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PINDebitReturnSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINDebitReturnSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PinDebitUndoSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PinDebitUndoSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "PurchaseCardLevel");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PurchaseCardLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "QueryRejectedSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.QueryRejectedSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ReadCapability");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestACI");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "RequestAdvice");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ServiceInformation");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueMerchantData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "StoredValueService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.StoredValueService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Tenders");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Tenders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TenderType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TrackDataSupportType");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TrackDataSupportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOCountryCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "TypeISOCurrencyCodeA3");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Workflow");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "WorkflowService");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.WorkflowService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ArrayOfClaimMetaData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData");
            qName2 = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthenticationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.AuthenticationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "AuthorizationFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.AuthorizationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BadAttemptThresholdExceededFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "BaseFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.BaseFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMappingsNotFoundFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimMetaData");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ClaimMetaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ClaimNotFoundFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "ExpiredTokenFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "GeneratePasswordFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidEmailFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "InvalidTokenFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "LockedByAdminFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "NonRenewableTokenFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "OneTimePasswordFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordExpiredFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "PasswordInvalidFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "RelyingPartyNotAssociatedToSecurityDomainFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SendEmailFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.SendEmailFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "STSUnavailableFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "SystemFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.SystemFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ipcommerce.com/Identity/1.0/", "UserNotFoundFault");
            cachedSerQNames.add(qName);
            cls = com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault.class;
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

    public java.lang.String signOnWithToken(java.lang.String identityToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/SignOnWithToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnWithToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation getServiceInformation(java.lang.String sessionToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetServiceInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetServiceInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String saveApplicationData(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/SaveApplicationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SaveApplicationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, applicationData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData getApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetApplicationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetApplicationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, applicationProfileId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/DeleteApplicationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DeleteApplicationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, applicationProfileId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean isMerchantProfileInitialized(java.lang.String sessionToken, java.lang.String serviceId, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/IsMerchantProfileInitialized");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "IsMerchantProfileInitialized"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, serviceId, merchantProfileId, tenderType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetMerchantProfiles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, serviceId, tenderType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMerchantProfileIds(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetMerchantProfileIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfileIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, serviceId, tenderType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfilesByProfileId(java.lang.String sessionToken, java.lang.String merchantProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetMerchantProfilesByProfileId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfilesByProfileId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, merchantProfileId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile getMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetMerchantProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetMerchantProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, merchantProfileId, serviceId, tenderType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/DeleteMerchantProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DeleteMerchantProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, merchantProfileId, serviceId, tenderType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void saveMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] merchantProfiles) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/SaveMerchantProfiles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SaveMerchantProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, serviceId, tenderType, merchantProfiles});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String signOnWithUsernamePasswordForServiceKey(java.lang.String serviceKey, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault, com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/SignOnWithUsernamePasswordForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnWithUsernamePasswordForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void resetPasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/ResetPasswordForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ResetPasswordForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SendEmailFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SendEmailFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void changePasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newPassword) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/ChangePasswordForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ChangePasswordForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, userName, password, newPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SendEmailFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SendEmailFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void changeUsernameForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newUsername) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/ChangeUsernameForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ChangeUsernameForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, userName, password, newUsername});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SendEmailFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SendEmailFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void changeEmailForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newEmail) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/ChangeEmailForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ChangeEmailForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, userName, password, newEmail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SendEmailFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SendEmailFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.Calendar getPasswordExpirationForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/GetPasswordExpirationForServiceKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetPasswordExpirationForServiceKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceKey, userName, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateMerchantProfile(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile merchantProfile) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation/ICWSServiceInformation/ValidateMerchantProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "ValidateMerchantProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionToken, serviceId, tenderType, merchantProfile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) {
              throw (com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] getAllClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/1.0/GetAllClaims");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetAllClaims"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticatingToken, verifiedToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken, java.lang.String[] claimNSs) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/1.0/GetClaims");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "GetClaims"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticatingToken, verifiedToken, claimNSs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String renew(java.lang.String authenticatingToken, java.lang.String toRenewToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/1.0/Renew");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "Renew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticatingToken, toRenewToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String signOnAndAddClaims(java.lang.String identityToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/2.0/TokenCred/SignOnAndAddClaims");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "SignOnAndAddClaims"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityToken, claims});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String delegatedSignOn(java.lang.String identityToken, java.lang.String onBehalfOfSk, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/2.0/TokenCred/DelegatedSignOn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "DelegatedSignOn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityToken, onBehalfOfSk, claims});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) axisFaultException.detail;
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
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String federatedSignOn(java.lang.String identityToken, java.lang.String externalDomainToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/2.0/MultiTokenCred/FederatedSignOn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "FederatedSignOn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityToken, externalDomainToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String federatedSignOnAndAddClaims(java.lang.String identityToken, java.lang.String externalDomainToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.ipcommerce.com/Identity/2.0/MultiTokenCred/FederatedSignOnAndAddClaims");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/ServiceInformation", "FederatedSignOnAndAddClaims"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityToken, externalDomainToken, claims});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthenticationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.AuthorizationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ipcommerce.schemas.Identity._1_0.SystemFault) {
              throw (com.ipcommerce.schemas.Identity._1_0.SystemFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
