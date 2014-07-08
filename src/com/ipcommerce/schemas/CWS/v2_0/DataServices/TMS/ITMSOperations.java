/**
 * ITMSOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS;

public interface ITMSOperations extends java.rmi.Remote {
    public com.ipcommerce.schemas.Ipc_General_WCF_Contracts_Common.External.PingResponse ping() throws java.rmi.RemoteException;

    /**
     * <summary>
     *             Queries the batch summary and returns Batch Status, DateTime,
     * and a list of transactionIds in the batch.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryBatchParameters">The batch query details.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of batch details.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.BatchDetailData[] queryBatch(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryBatchParameters queryBatchParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;

    /**
     * <summary>
     *             Returns family summary information and a list of transactionIds
     * that can be used to query for full transaction details.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryTransactionsParameters">Query parameters.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of transaction families.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.FamilyDetail[] queryTransactionFamilies(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;

    /**
     * <summary>
     *             Queries the specified transactions and returns both summary
     * details and full transaction details as a serialized object.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryTransactionsParameters">Query parameters.</param>     * 
     *             <param name="transactionDetailFormat">Indicates the format
     * for the complete serialized transactions: CWSTransaction or SerializedCWS.</param>     * 
     *             <param name="includeRelated">Indicates whether transactions
     * related to the resulting transaction should also be included.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of transaction details.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetail[] queryTransactionsDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.TransactionDetailFormat transactionDetailFormat, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;

    /**
     * <summary>
     *             Queries the specified transactions and returns summary
     * details related to one or more transactions matching specific search
     * criteria.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryTransactionsParameters">Query parameters.</param>     * 
     *             <param name="includeRelated">Indicates whether transactions
     * related to the resulting transaction should also be included.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of transaction summaries.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.SummaryDetail[] queryTransactionsSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryTransactionsParameters queryTransactionsParameters, java.lang.Boolean includeRelated, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;

    /**
     * <summary>
     *             Used to collect transaction summary information from the
     * service provider (post-settlement), in the event that a captured transaction
     * was rejected during settlement by the service provider.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryRejectedParameters">Query parameters.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of batch details.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedSummary(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;

    /**
     * <summary>
     *             Used to collect transaction detail information from the
     * service provider (post-settlement), in the event that a captured transaction
     * was rejected during settlement by the service provider.
     *             </summary>
     *             <param name="sessionToken">The short-lived token used
     * to authenticate to CWS.</param>
     *             <param name="queryRejectedParameters">Query parameters.</param>     * 
     *             <param name="pagingParameters">Defines the parameters
     * for the service to use for paging large datasets.</param>
     *             <returns>Collection of batch details.</returns>
     */
    public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryResponse queryRejectedDetail(java.lang.String sessionToken, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.QueryRejectedParameters queryRejectedParameters, com.ipcommerce.schemas.CWS.v2_0.DataServices.PagingParameters pagingParameters) throws java.rmi.RemoteException, com.ipcommerce.schemas.Identity._1_0.AuthenticationFault, com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault, com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSTransactionFailedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnknownServiceKeyFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.TMSOperationNotSupportedFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.DataServicesUnavailableFault, com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.TMSValidationResultFault;
}
