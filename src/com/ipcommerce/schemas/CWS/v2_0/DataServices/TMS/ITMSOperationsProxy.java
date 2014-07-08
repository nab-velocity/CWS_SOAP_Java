package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;

public class ITMSOperationsProxy implements com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ITMSOperations {
  private String _endpoint = null;
  private com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ITMSOperations iTMSOperations = null;
  
  public ITMSOperationsProxy() {
    _initITMSOperationsProxy();
  }
  
  public ITMSOperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initITMSOperationsProxy();
  }
  
  private void _initITMSOperationsProxy() {
    try {
      iTMSOperations = (new com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TMSLocator()).getBasicHttpBinding_ITMSOperations();
      if (iTMSOperations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTMSOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTMSOperations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTMSOperations != null)
      ((javax.xml.rpc.Stub)iTMSOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ITMSOperations getITMSOperations() {
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations;
  }
  
  public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.ping();
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[] queryBatch(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryBatchParameters queryBatchParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryBatch(sessionToken, queryBatchParameters, pagingParameters);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[] queryTransactionFamilies(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryTransactionFamilies(sessionToken, queryTransactionsParameters, pagingParameters);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] queryTransactionsDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetailFormat transactionDetailFormat, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryTransactionsDetail(sessionToken, queryTransactionsParameters, transactionDetailFormat, includeRelated, pagingParameters);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[] queryTransactionsSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryTransactionsSummary(sessionToken, queryTransactionsParameters, includeRelated, pagingParameters);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryRejectedSummary(sessionToken, queryRejectedParameters, pagingParameters);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault{
    if (iTMSOperations == null)
      _initITMSOperationsProxy();
    return iTMSOperations.queryRejectedDetail(sessionToken, queryRejectedParameters, pagingParameters);
  }
  
  
}