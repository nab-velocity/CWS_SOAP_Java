package com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing;

public class ICwsTransactionProcessingProxy implements com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.ICwsTransactionProcessing {
  private String _endpoint = null;
  private com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.ICwsTransactionProcessing iCwsTransactionProcessing = null;
  
  public ICwsTransactionProcessingProxy() {
    _initICwsTransactionProcessingProxy();
  }
  
  public ICwsTransactionProcessingProxy(String endpoint) {
    _endpoint = endpoint;
    _initICwsTransactionProcessingProxy();
  }
  
  private void _initICwsTransactionProcessingProxy() {
    try {
      iCwsTransactionProcessing = (new com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.TPSLocator()).getBasicHttpBinding_ICwsTransactionProcessing();
      if (iCwsTransactionProcessing != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCwsTransactionProcessing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCwsTransactionProcessing)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCwsTransactionProcessing != null)
      ((javax.xml.rpc.Stub)iCwsTransactionProcessing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.ICwsTransactionProcessing getICwsTransactionProcessing() {
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing;
  }
  
  public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.ping();
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response queryAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.queryAccount(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response verify(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.verify(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorize(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.authorize(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response adjust(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.adjust(sessionToken, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorizeAndCapture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.authorizeAndCapture(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnUnlinked(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.returnUnlinked(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions._return differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.returnById(sessionToken, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response undo(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.undo(sessionToken, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response capture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.capture(sessionToken, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureAll(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.captureAll(sessionToken, differenceData, batchIds, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureAllAsync(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.captureAllAsync(sessionToken, differenceData, batchIds, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureSelective(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.captureSelective(sessionToken, transactionIds, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureSelectiveAsync(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.captureSelectiveAsync(sessionToken, transactionIds, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response acknowledge(java.lang.String sessionToken, java.lang.String transactionId, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.acknowledge(sessionToken, transactionId, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] requestTransaction(java.lang.String sessionToken, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData tenderData) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.requestTransaction(sessionToken, merchantProfileId, tenderData);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.manageAccount(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccountById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.manageAccountById(sessionToken, differenceData, applicationProfileId, workflowId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response disburse(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault{
    if (iCwsTransactionProcessing == null)
      _initICwsTransactionProcessingProxy();
    return iCwsTransactionProcessing.disburse(sessionToken, transaction, applicationProfileId, merchantProfileId, workflowId);
  }
  
  
}