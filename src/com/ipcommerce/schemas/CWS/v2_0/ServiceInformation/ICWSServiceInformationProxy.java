package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public class ICWSServiceInformationProxy implements com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation {
  private String _endpoint = null;
  private com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation iCWSServiceInformation = null;
  
  public ICWSServiceInformationProxy() {
    _initICWSServiceInformationProxy();
  }
  
  public ICWSServiceInformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initICWSServiceInformationProxy();
  }
  
  private void _initICWSServiceInformationProxy() {
    try {
      iCWSServiceInformation = (new com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.SISLocator()).getBasicHttpBinding_ICWSServiceInformation();
      if (iCWSServiceInformation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCWSServiceInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCWSServiceInformation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCWSServiceInformation != null)
      ((javax.xml.rpc.Stub)iCWSServiceInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation getICWSServiceInformation() {
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation;
  }
  
  public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.ping();
  }
  
  public java.lang.String signOnWithToken(java.lang.String identityToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.signOnWithToken(identityToken);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation getServiceInformation(java.lang.String sessionToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getServiceInformation(sessionToken);
  }
  
  public java.lang.String saveApplicationData(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.saveApplicationData(sessionToken, applicationData);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData getApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getApplicationData(sessionToken, applicationProfileId);
  }
  
  public void deleteApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.deleteApplicationData(sessionToken, applicationProfileId);
  }
  
  public java.lang.Boolean isMerchantProfileInitialized(java.lang.String sessionToken, java.lang.String serviceId, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.isMerchantProfileInitialized(sessionToken, serviceId, merchantProfileId, tenderType);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getMerchantProfiles(sessionToken, serviceId, tenderType);
  }
  
  public java.lang.String[] getMerchantProfileIds(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getMerchantProfileIds(sessionToken, serviceId, tenderType);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfilesByProfileId(java.lang.String sessionToken, java.lang.String merchantProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getMerchantProfilesByProfileId(sessionToken, merchantProfileId);
  }
  
  public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile getMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getMerchantProfile(sessionToken, merchantProfileId, serviceId, tenderType);
  }
  
  public void deleteMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.deleteMerchantProfile(sessionToken, merchantProfileId, serviceId, tenderType);
  }
  
  public void saveMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] merchantProfiles) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.saveMerchantProfiles(sessionToken, serviceId, tenderType, merchantProfiles);
  }
  
  public java.lang.String signOnWithUsernamePasswordForServiceKey(java.lang.String serviceKey, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault, com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.signOnWithUsernamePasswordForServiceKey(serviceKey, username, password);
  }
  
  public void resetPasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.resetPasswordForServiceKey(serviceKey, userName);
  }
  
  public void changePasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newPassword) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.changePasswordForServiceKey(serviceKey, userName, password, newPassword);
  }
  
  public void changeUsernameForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newUsername) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.changeUsernameForServiceKey(serviceKey, userName, password, newUsername);
  }
  
  public void changeEmailForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newEmail) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.changeEmailForServiceKey(serviceKey, userName, password, newEmail);
  }
  
  public java.util.Calendar getPasswordExpirationForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getPasswordExpirationForServiceKey(serviceKey, userName, password);
  }
  
  public void validateMerchantProfile(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile merchantProfile) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    iCWSServiceInformation.validateMerchantProfile(sessionToken, serviceId, tenderType, merchantProfile);
  }
  
  public com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] getAllClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getAllClaims(authenticatingToken, verifiedToken);
  }
  
  public java.lang.String[] getClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken, java.lang.String[] claimNSs) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.getClaims(authenticatingToken, verifiedToken, claimNSs);
  }
  
  public java.lang.String renew(java.lang.String authenticatingToken, java.lang.String toRenewToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.renew(authenticatingToken, toRenewToken);
  }
  
  public java.lang.String signOnAndAddClaims(java.lang.String identityToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.signOnAndAddClaims(identityToken, claims);
  }
  
  public java.lang.String delegatedSignOn(java.lang.String identityToken, java.lang.String onBehalfOfSk, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.delegatedSignOn(identityToken, onBehalfOfSk, claims);
  }
  
  public java.lang.String federatedSignOn(java.lang.String identityToken, java.lang.String externalDomainToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.federatedSignOn(identityToken, externalDomainToken);
  }
  
  public java.lang.String federatedSignOnAndAddClaims(java.lang.String identityToken, java.lang.String externalDomainToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault{
    if (iCWSServiceInformation == null)
      _initICWSServiceInformationProxy();
    return iCWSServiceInformation.federatedSignOnAndAddClaims(identityToken, externalDomainToken, claims);
  }
  
  
}