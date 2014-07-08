/**
 * ICWSServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.ServiceInformation;

public interface ICWSServiceInformation extends java.rmi.Remote {
    public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException;

    /**
     * <summary>
     *             Sign on using an identity token.
     *             </summary>
     *             <param name="identityToken">Identity token associated
     * with your service key</param>
     *             <returns>Session token</returns>
     */
    public java.lang.String signOnWithToken(java.lang.String identityToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault;

    /**
     * <summary>
     *             Retrieve service information.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <returns>Service information associated with the session
     * token</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ServiceInformation getServiceInformation(java.lang.String sessionToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault;

    /**
     * <summary>
     *             Save application configuration data.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="applicationData">Application common configuration
     * data</param>
     *             <returns>Application profile ID</returns>
     */
    public java.lang.String saveApplicationData(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData applicationData) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Retrieves all current application configuration data associated
     * with the Service Key.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="applicationProfileId">Application profile
     * ID returned from SaveApplicationData()</param>
     *             <returns>Application common configuration data associated
     * with the session token</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData getApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Deletes application configuration data.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="applicationProfileId">Application profile
     * ID</param>
     */
    public void deleteApplicationData(java.lang.String sessionToken, java.lang.String applicationProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Tests whether merchant profile is initialized for a specific
     * Tender Type.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="serviceId">Service ID</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="tenderType">Tender type</param>
     *             <returns><c>true</c> if the merchant profile has been
     * initialized</returns>
     */
    public java.lang.Boolean isMerchantProfileInitialized(java.lang.String sessionToken, java.lang.String serviceId, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Retrieves all merchant profiles associated with a specific
     * Service ID and Tender Type.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="serviceId">Service ID</param>
     *             <param name="tenderType">Tender type</param>
     *             <returns>Collection of merchant profiles</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Retrieves all merchant profile IDs associated with a specific
     * Service ID and Tender Type.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="serviceId">Service ID</param>
     *             <param name="tenderType">Tender type</param>
     *             <returns>Collection of merchant profile IDs</returns>
     */
    public java.lang.String[] getMerchantProfileIds(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Retrieves a specific merchant's merchant profiles for
     * all Service IDs and Tender Types.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <returns>Collection of merchant profiles</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] getMerchantProfilesByProfileId(java.lang.String sessionToken, java.lang.String merchantProfileId) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Retrieves the merchant profile associated with a specific
     * Service ID and Tender Type.
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="serviceId">Service ID</param>
     *             <param name="tenderType">Tender type</param>
     *             <returns>The requested merchant profile</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile getMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Deletes a specific merchant profile for a Tender Type.     * 
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="serviceId">Service ID</param>
     *             <param name="tenderType">Tender type</param>
     */
    public void deleteMerchantProfile(java.lang.String sessionToken, java.lang.String merchantProfileId, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Saves one or more merchant profiles for a Tender Type.     * 
     *             </summary>
     *             <param name="sessionToken">Session token</param>
     *             <param name="serviceId">Service ID</param>
     *             <param name="tenderType">Tender type</param>
     *             <param name="merchantProfiles">Merchant profiles</param>
     */
    public void saveMerchantProfiles(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile[] merchantProfiles) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Sign on using a username and password.
     *             </summary>
     *             <param name="serviceKey">Service key to sign on</param>     * 
     *             <param name="username">Username associated with the specified
     * service key</param>
     *             <param name="password">Password associated with the specified
     * service key and username</param>
     *             <returns>Session token</returns>
     */
    public java.lang.String signOnWithUsernamePasswordForServiceKey(java.lang.String serviceKey, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.LockedByAdminFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.OneTimePasswordFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.PasswordExpiredFault, com.ipcommerce.schemas.Identity._1_0.BadAttemptThresholdExceededFault;

    /**
     * <summary>
     *             Reset the password for the specified service key and username.     * 
     *             </summary>
     *             <param name="serviceKey">Service key</param>
     *             <param name="userName">User name associated with specified
     * service key</param>
     */
    public void resetPasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.GeneratePasswordFault;

    /**
     * <summary>
     *             Change the password for the specified service key and
     * username.
     *             </summary>
     *             <param name="serviceKey">Service key</param>
     *             <param name="userName">Username associated with specified
     * service key</param>
     *             <param name="password">Password currently associated with
     * specified service key and username</param>
     *             <param name="newPassword">New password to associate with
     * specified service key and username</param>
     */
    public void changePasswordForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newPassword) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.PasswordInvalidFault, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault;

    /**
     * <summary>
     *             Change the username for the specified service key and
     * username.
     *             </summary>
     *             <param name="serviceKey">Service key</param>
     *             <param name="userName">Username associated with specified
     * service key</param>
     *             <param name="password">Password associated with specified
     * service key and username</param>
     *             <param name="newUsername">New username to associate with
     * specified service key</param>
     */
    public void changeUsernameForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newUsername) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault;

    /**
     * <summary>
     *             Change the email address for the specified service key
     * and username.
     *             </summary>
     *             <param name="serviceKey">Service key</param>
     *             <param name="userName">Username associated with specified
     * service key</param>
     *             <param name="password">Password associated with specified
     * service key and username</param>
     *             <param name="newEmail">New email to associate with specified
     * service key and username</param>
     */
    public void changeEmailForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password, java.lang.String newEmail) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.SendEmailFault, com.ipcommerce.schemas.Identity._1_0.InvalidEmailFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault;

    /**
     * <summary>
     *             Change the username for the specified service key and
     * username.
     *             </summary>
     *             <param name="serviceKey">Service key</param>
     *             <param name="userName">Username associated with specified
     * service key</param>
     *             <param name="password">Password associated with specified
     * service key and username</param>
     */
    public java.util.Calendar getPasswordExpirationForServiceKey(java.lang.String serviceKey, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.UserNotFoundFault;

    /**
     * <summary>
     *             Validates a provided merchant proifile. If the profile
     * is invalid, the operation will throw a 
     *             CWSValidationResultFault containing the details of the
     * exception. If your application does not implement 
     *             unmanaged merchant profiles – you do not need to call
     * this method.  Your merchant profile will automatically 
     *             be validated when you call SaveMerchantProfiles.
     *             </summary>
     *             <param name="sessionToken">The session token associated
     * with this call.</param>
     *             <param name="serviceId">The service id of record for the
     * profile.</param>
     *             <param name="tenderType">The tender type of record for
     * the profile.</param>
     *             <param name="merchantProfile">The merchant profile.</param>
     */
    public void validateMerchantProfile(java.lang.String sessionToken, java.lang.String serviceId, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TenderType tenderType, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.MerchantProfile merchantProfile) throws java.rmi.RemoteException, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;

    /**
     * <summary>
     *             Get a list of claims given a pair of security tokens.
     * The claims returned are presented as a list of ClaimMetaData objects
     * which is a pairing of the claim namespace and the claim value.
     *             </summary>
     *             <param name="authenticatingToken">This security token
     * is used to authorize the request by verifying the 'verifiedToken'
     * and extract claims data from it.</param>
     *             <param name="verifiedToken">The security token that will
     * yield the claims data.</param>
     *             <returns>A list of claim namespace and value pairs.</returns>
     */
    public com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] getAllClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *             Get a list of claims, within a specific list of claim
     * namespaces, given a pair of security tokens. The claims returned are
     * presented as a list of values that are sequenced to collate with the
     * order of the 
     *             list of namespaces passed in.
     *             </summary>
     *             <param name="authenticatingToken">This security token
     * is used to authorize the request by verifying the 'verifiedToken'
     * and extract claims data from it.</param>
     *             <param name="verifiedToken">The security token that will
     * yield the claims data.</param>
     *             <param name="claimNSs">A list of claims namespaces to
     * limit the list of claims returned. The returned list if claim values
     * will be in the same order as specified in this list.</param>
     *             <returns>A list of claims values.</returns>
     */
    public java.lang.String[] getClaims(java.lang.String authenticatingToken, java.lang.String verifiedToken, java.lang.String[] claimNSs) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.RelyingPartyNotAssociatedToSecurityDomainFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ClaimNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *             Uses an identity token to authorize the renewal of a another,
     * lower-level security token.
     *             </summary>
     *             <param name="authenticatingToken">An identity token that
     * is used to authorize the renewal of the 'toRenewToken' parameter.</param>     * 
     *             <param name="toRenewToken">A security token that is to
     * be renewed.</param>
     *             <returns>A renewed token.</returns>
     */
    public java.lang.String renew(java.lang.String authenticatingToken, java.lang.String toRenewToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.NonRenewableTokenFault, com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *              Allows a service key identity token holder to add dynamic
     * claims as allowed for their service key
     *              to the resultant session token
     *             </summary>
     *              <param name="identityToken">Identity token associated
     * with your service key</param>
     *             <param name="claims">claims to add to the generated session
     * token</param>
     *             <returns>session token</returns>
     */
    public java.lang.String signOnAndAddClaims(java.lang.String identityToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *              Allows an initiator (IDT) to receive a session token
     * for onBehalf SK and add dynamic claims as 
     *              allowed for their service key
     *             </summary>
     *              <param name="identityToken">Identity token associated
     * with your service key</param>
     *             <param name="onBehalfOfSk">service key to generate session
     * token for.</param>
     *             <param name="claims">claims to add to the generated session
     * token</param>
     *             <returns>session token</returns>
     */
    public java.lang.String delegatedSignOn(java.lang.String identityToken, java.lang.String onBehalfOfSk, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *              Allow a service key identity token holder to receive
     * a session token with some claims sourced from an external domain token     * 
     *             </summary>
     *              <param name="identityToken">Identity token associated
     * with your service key</param>
     *             <param name="externalDomainToken">external domain token
     * containing claims to add to session token</param>
     *             <returns>session token</returns>
     */
    public java.lang.String federatedSignOn(java.lang.String identityToken, java.lang.String externalDomainToken) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;

    /**
     * <summary>
     *              Allow a service key identity token holder to receive
     * a session token with some claims sourced from an 
     *              external domain token and add dynamic claims as allowed
     * for their service key
     *             </summary>
     *              <param name="identityToken">Identity token associated
     * with your service key</param>
     *             <param name="externalDomainToken">external domain token
     * containing claims to add to session token</param>
     *             <param name="claims">claims to add to the generated session
     * token</param>
     *             <returns>session token</returns>
     */
    public java.lang.String federatedSignOnAndAddClaims(java.lang.String identityToken, java.lang.String externalDomainToken, com.ipcommerce.schemas.Identity._1_0.ClaimMetaData[] claims) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ClaimMappingsNotFoundFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.AuthorizationFault, com.ipcommerce.schemas.Identity._1_0.SystemFault;
}
