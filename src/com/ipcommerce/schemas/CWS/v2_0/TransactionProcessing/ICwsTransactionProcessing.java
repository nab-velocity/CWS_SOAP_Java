/**
 * ICwsTransactionProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing;

public interface ICwsTransactionProcessing extends java.rmi.Remote {
    public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException;

    /**
     * <summary>
     *             Performs a balance inquiry on the cardholder's account
     * to determine the current account balance.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response queryAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs a check on the cardholder's account without reserving
     * any funds.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response verify(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs a check on cardholder's funds and reserves the
     * queried amount if sufficient funds are available. Transaction must
     * be captured before funds transfer will occur.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorize(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs an incremental or reversal authorization to increase
     * or decrease the amount of an existing authorization.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Adjustment details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response adjust(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs a check on cardholder's funds and reserves the
     * queried amount if sufficient funds are available, then marks the transaction
     * for capture.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response authorizeAndCapture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs an unlinked or 'standalone' credit to a cardholder's
     * account from a merchant's account.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnUnlinked(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Performs a linked credit to a cardholder's account from
     * a merchant's account using data from the authorization.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Return details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response returnById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions._return differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Void or reverse an authorization in order to release cardholder
     * funds. If transaction to be Undone is in an ErrorUnknown state, the
     * TenderData must be set on the BankcardUndo.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Undo details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response undo(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Undo differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark a succesfully authorized transaction for settlement
     * by the processor.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Capture details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response capture(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark all succesfully authorized transactions for settlement
     * by the processor.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Capture details</param>
     *             <param name="batchIds">A list of batch ids.</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureAll(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark all succesfully authorized transactions for settlement
     * by the processor without waiting for 
     *             the settlement to complete. The Response object will indicate
     * a successful receipt of the settlement request.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Capture details</param>
     *             <param name="batchIds">A list of batch ids.</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns>Single Response object.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureAllAsync(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String[] batchIds, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark one or more specific succesfully authorized transactions
     * for settlement by the processor.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transactionIds">Transaction IDs to capture</param>     * 
     *             <param name="differenceData">Capture details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] captureSelective(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark one or more specific succesfully authorized transactions
     * for settlement by the processor without waiting for 
     *             the settlement to complete. The Response object will indicate
     * a successful receipt of the settlement request.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transactionIds">Transaction IDs to capture</param>     * 
     *             <param name="differenceData">Capture details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns>Single Response object.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response captureSelectiveAsync(java.lang.String sessionToken, java.lang.String[] transactionIds, com.ipcommerce.schemas.CWS.v2_0.Transactions.Capture[] differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Mark a transaction acknowledged after successfully receiving
     * a response. This is helpful for later reporting.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transactionId">Transaction ID to acknowledge</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response acknowledge(java.lang.String sessionToken, java.lang.String transactionId, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Provides the mechanism to request any transactions that
     * match given tender data.
     *             </summary>
     *             <param name="tenderData">The tender data tro match.</param>     * 
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="merchantProfileId">Aids in the distinction
     * of the transaction(s) located.</param>
     *             <returns>One or more transaction instances that match
     * the supplied tender data.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response[] requestTransaction(java.lang.String sessionToken, java.lang.String merchantProfileId, com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionTenderData tenderData) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Used to activate, reload, deactivate an account or to
     * transfer the balance from another card.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccount(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Used to update an existing account.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="differenceData">Manage details</param>
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response manageAccountById(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Manage differenceData, java.lang.String applicationProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;

    /**
     * <summary>
     *             Disburse is used to submit a disbursement request to the
     * Service Provider who then electronically disburses funds from the
     * Payers bank account to the Payee.
     *             </summary>
     *             <param name="sessionToken">Session token obtained from
     * SignOn()</param>
     *             <param name="transaction">Transaction details</param>     * 
     *             <param name="applicationProfileId">Application profile
     * ID obtained from SaveApplicationData()</param>
     *             <param name="merchantProfileId">Merchant profile ID</param>     * 
     *             <param name="workflowId">Workflow ID</param>
     *             <returns></returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.Response disburse(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.Transactions.Transaction transaction, java.lang.String applicationProfileId, java.lang.String merchantProfileId, java.lang.String workflowId) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSExtendedDataNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidMessageFormatFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSValidationResultFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionAlreadySettledFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidServiceInformationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionServiceUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSConnectionFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSInvalidOperationFault, com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSDeserializationFault;
}
