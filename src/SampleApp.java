

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPBinding;

import com.ipcommerce.schemas.CWS.v2_0.*;
import com.ipcommerce.schemas.CWS.v2_0.DataServices.*;
import com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.*;
import com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Fault.*;
import com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.Faults.*;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.*;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.AddressInfo;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.CustomerPresent;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestAdvice;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCountryCodeA3;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeISOCurrencyCodeA3;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.TypeStateProvince;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.*;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSBaseFault;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationErrorFault;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;
import com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.IndustryType;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardData;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CardSecurityData;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.Pro.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.ElectronicChecking.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.*;
import com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.*;
import com.ipcommerce.schemas.Identity._1_0.*;
import com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault;



//import com.sun.xml.bind.v2.model.core.PropertyInfo;

public class SampleApp {
	//These urls should be located in a configuration file or similar so that they can be changed without recompiling or redistributing the application.
	private static String _primaryServiceEndpoint = "https://api.dev.nabcommerce.com/2.0.18/SvcInfo";
	private static String _secondaryServiceEndpoint = "https://api.dev.nabcommerce.com/2.0.18/SvcInfo";
	private static String _primaryTxnEndpoint = "https://api.dev.nabcommerce.com/2.0.18/Txn";
	private static String _secondaryTxnEndpoint = "https://api.dev.nabcommerce.com/2.0.18/Txn";
	private static String _primaryTMSEndpoint = "https://api.dev.nabcommerce.com/2.0.18/DataServices/TMS";
	private static String _secondaryTMSEndpoint = "https://api.dev.nabcommerce.com/2.0.18/DataServices/TMS";
	// *** Please reference developers guide about protecting the Identity Token *** 
	//https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/Implementation_Guidelines/2.0.17/ServiceInformationGuidelines/AuthenticationProcess/index.aspx
	public String _IdentityToken = "PHNhbWw6QXNzZXJ0aW9uIE1ham9yVmVyc2lvbj0iMSIgTWlub3JWZXJzaW9uPSIxIiBBc3NlcnRpb25JRD0iX2VkOGIxOGJlLWZmY2MtNGU3Ny1hNDhiLWVlODQ1YTc2YTM0OSIgSXNzdWVyPSJJcGNBdXRoZW50aWNhdGlvbiIgSXNzdWVJbnN0YW50PSIyMDE0LTA0LTAyVDE4OjEzOjE1LjI3OVoiIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjEuMDphc3NlcnRpb24iPjxzYW1sOkNvbmRpdGlvbnMgTm90QmVmb3JlPSIyMDE0LTA0LTAyVDE4OjEzOjE1LjI3OVoiIE5vdE9uT3JBZnRlcj0iMjAxNy0wNC0wMlQxODoxMzoxNS4yNzlaIj48L3NhbWw6Q29uZGl0aW9ucz48c2FtbDpBZHZpY2U+PC9zYW1sOkFkdmljZT48c2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PHNhbWw6U3ViamVjdD48c2FtbDpOYW1lSWRlbnRpZmllcj43QzNBRDg2OTE1NTAwMDAxPC9zYW1sOk5hbWVJZGVudGlmaWVyPjwvc2FtbDpTdWJqZWN0PjxzYW1sOkF0dHJpYnV0ZSBBdHRyaWJ1dGVOYW1lPSJTQUsiIEF0dHJpYnV0ZU5hbWVzcGFjZT0iaHR0cDovL3NjaGVtYXMuaXBjb21tZXJjZS5jb20vSWRlbnRpdHkiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlPjdDM0FEODY5MTU1MDAwMDE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0iU2VyaWFsIiBBdHRyaWJ1dGVOYW1lc3BhY2U9Imh0dHA6Ly9zY2hlbWFzLmlwY29tbWVyY2UuY29tL0lkZW50aXR5Ij48c2FtbDpBdHRyaWJ1dGVWYWx1ZT5mMTczOTlkZi1jZDE3LTRlZTYtYjBiMS1kZDkzMmMxN2M2NTc8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0ibmFtZSIgQXR0cmlidXRlTmFtZXNwYWNlPSJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcyI+PHNhbWw6QXR0cmlidXRlVmFsdWU+N0MzQUQ4NjkxNTUwMDAwMTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjwvc2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PFNpZ25hdHVyZSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFNpZ25lZEluZm8+PENhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiPjwvQ2Fub25pY2FsaXphdGlvbk1ldGhvZD48U2lnbmF0dXJlTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI3JzYS1zaGExIj48L1NpZ25hdHVyZU1ldGhvZD48UmVmZXJlbmNlIFVSST0iI19lZDhiMThiZS1mZmNjLTRlNzctYTQ4Yi1lZTg0NWE3NmEzNDkiPjxUcmFuc2Zvcm1zPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSI+PC9UcmFuc2Zvcm0+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyI+PC9UcmFuc2Zvcm0+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjc2hhMSI+PC9EaWdlc3RNZXRob2Q+PERpZ2VzdFZhbHVlPjA5andVU1Rmc2dHajNDQ3BncmZkTXFKbU9Fcz08L0RpZ2VzdFZhbHVlPjwvUmVmZXJlbmNlPjwvU2lnbmVkSW5mbz48U2lnbmF0dXJlVmFsdWU+STZBY2ZqN1dLYmRuMEJ1UVZBSWJWbEM5ZHgvUldpVTFhR0Q5MS80ZmhFOVpEc2VYNFltYk5sU3c4bmRNSmxMRTArOUNvWGF2TWxZK1ZLcE8rTmFXNDJPNXY2Rk8wWUtKSUh0T29NU3d3cDhPdm02YSsxazQvKzM3amNmbUVDTVQrM0tGVmREaWFRRE5uQmNsME12YjV5VWNKeU1MTjNQL3BjQjRjVlVtQUNSR3AvMnJReFh6QVJ6ZGdQSWJTbTk4czVxQTU5cEJuN1A1U09rNTV0NkgwRS8vODJIQmg5SWFJWkhOWE5RUytGN0VDYW9FMFpNRngxU3g2RmdxVXBHbW1iTnM5OXdCb3V3OThRMVMrQi9vS0pUQXI2OUZiaVZjdWxTVEg5M3FWWjB1V0NuVlFsU3htSmpMem1DQ3ZrSWZmdmVQREpGQklJeVRUWVlKL0NQTVVnPT08L1NpZ25hdHVyZVZhbHVlPjxLZXlJbmZvPjxvOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2UgeG1sbnM6bz0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzLzIwMDQvMDEvb2FzaXMtMjAwNDAxLXdzcy13c3NlY3VyaXR5LXNlY2V4dC0xLjAueHNkIj48bzpLZXlJZGVudGlmaWVyIFZhbHVlVHlwZT0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzL29hc2lzLXdzcy1zb2FwLW1lc3NhZ2Utc2VjdXJpdHktMS4xI1RodW1icHJpbnRTSEExIj5ZREJlRFNGM0Z4R2dmd3pSLzBwck11OTZoQ2M9PC9vOktleUlkZW50aWZpZXI+PC9vOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2U+PC9LZXlJbmZvPjwvU2lnbmF0dXJlPjwvc2FtbDpBc3NlcnRpb24+";
	// The PTLSSocketId changes from Sandbox to Production however is tied to your certified application.
	public String _PTLSSocketId = "MIIFCzCCA/OgAwIBAgICAoEwDQYJKoZIhvcNAQEFBQAwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb20wHhcNMTMwODI2MTcxMDI3WhcNMjMwODI0MTcxMDI3WjCBjDELMAkGA1UEBhMCVVMxETAPBgNVBAgTCENvbG9yYWRvMQ8wDQYDVQQHEwZEZW52ZXIxGjAYBgNVBAoTEUlQIENvbW1lcmNlLCBJbmMuMT0wOwYDVQQDEzR0ZHNwM25TZ0FJQUFBUDhBSCtDWUFBQUVBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtn6ILI78EaOLcWrmI9RZf8Vj+3P/WcrDLimSyJJH/8LnIBbXNkiKcZSMg/KHqNLAtq/ncYqZcicgAfaoSbj9FxKGIXTDEICriv/i8sQIGFhIwW/V6H02E8SpWjdCQO9EUUaFPUVMhHfiabwJ3B0VODsQfVuG7mbrAvD/wAqiUVR2Q0rpgHkToCkytdhMlkXiFtnfy4nnoFnI6c5cmsQU7AZgI6Zr08pDMN9y3uSRGSJIzdcTohBA1qb8C4+ZVRCmwCfQZiBHxjC8c5DTiGlPQVEDfRjKXm6ffqBKCttX7qCeB0s57iob0Q7ucz8NfoWtY8dZVzMhYH8obU/dSXaZ6wIDAQABo4IBTjCCAUowCQYDVR0TBAIwADAdBgNVHQ4EFgQUJ64+T3k9d5nWfplPlxVZsN382XUwgeYGA1UdIwSB3jCB24AU3+ASnJQimuunAZqQDgNcnO2HuHShgbekgbQwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb22CCQD/yDY5hYVsVzA1BgNVHR8ELjAsMCqgKKAmhiRodHRwOi8vY3JsLmlwY29tbWVyY2UuY29tL2NhLWNybC5jcmwwDQYJKoZIhvcNAQEFBQADggEBAJrku2QD0T/0aT+jfFJA947Vf7Vu/6S1OxUGhMipx6z/izXZ+o4fK/Nsg0G39KvfxippFG/3MUo621dwXwtqq9SM72zy9ry9E0ptmEiG8X8bSVOyGj4MqyExCPs9LgloV5GgewqYRgq2hmbXOv8Gw7EeXGCfnQ+eROxGu1+p3ZWUnGMQnBbayg43npcHYfyLFHOzd57pj6ncYoxY3kun5GLMLr6tJXKpPNvbM5lAOzcAmKviPMCM2T53UzJlsRdVvCbnkrc5cYqN4l01elqr3MSsj6BJ+JqIqViFrYYkD34THKO8c+wZGb8IN+NJAVre9YOvt5+Cvbbd5ik0UQ+YQNM=";
	
	//Some services use a username and password
	private static String _userName = "";
	private static String _password = "";
	
	// END Configuration Values
	

	//Made global only for demonstration purposes with cross transaction processing
	public BankcardTransactionResponsePro BCTR = new BankcardTransactionResponsePro();
	public ElectronicCheckingTransactionResponse ECTR = new ElectronicCheckingTransactionResponse();
	public BankcardTransactionResponsePro _ReturnById_TC_Example = new BankcardTransactionResponsePro();//Terminal Capture example requires a settled Authorize for ReturnById
	
	
	//Used for a check Authorize() transaction.
	public ElectronicCheckingTransactionResponse _queryAccountTxn;//Used for a check Authorize() transaction.
	
	//public java.util.List<String> _transactionIDs = new ArrayList<String>();//The following is used for Capture Selective Example
	public ArrayList<String> _transactionIDs = new ArrayList<String>();
	public String _AuthorizeTransactionId = "";

	public com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformationProxy CWSSIC;
	public com.ipcommerce.schemas.CWS.v2_0.TransactionProcessing.ICwsTransactionProcessingProxy CWSBC;
	public com.ipcommerce.schemas.CWS.v2_0.DataServices.TMS.ITMSOperationsProxy CWSTMS;

	public Operations SupportedTxnTypes = new Operations();

	public BankcardService[] BCP_Services;
	public ElectronicCheckingService[] ECK_Services;
	public Workflow[] WorkFlows;

	// / The following is used for Service Information Setup

	public boolean signOnWithToken(ConfigurationValues _CV) {
		try {
			setupEndpoints(_CV);
			checkTokenExpire(_CV);
		} catch (WebServiceException WSE) {
			return false;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
		return true;
	}

	public boolean SaveApplicationConfiguration(ConfigurationValues _CV) {
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			String SADR = "";
			ApplicationData AD = new ApplicationData();
			AD.setApplicationAttended(false);
			AD.setApplicationLocation(ApplicationLocation.OffPremises);
			AD.setApplicationName("MyTestApp");
			// AD.setDeveloperId("TPP123");// Only used for First Data
			//AD.setDeviceSerialNumber("");
			AD.setEncryptionType(EncryptionType.MagneSafeV4V5Compatible);//<!-- [Magensa : Valid Values 'IPADV1Compatible', 'MagneSafeV4V5Compatible', 'NotSet'] -->
			AD.setHardwareType(HardwareType.PC);
			AD.setPINCapability(PINCapability.PINNotSupported);
			AD.setReadCapability(ReadCapability.NoMSR);
			AD.setSerialNumber("208093707");
			AD.setPTLSSocketId(_PTLSSocketId.trim());
			AD.setSoftwareVersion("2.1.0");
			Calendar cal = Calendar.getInstance();
			cal.set(2011, 01, 25);
			AD.setSoftwareVersionDate(cal);

			// Now Let's save The ApplicationData
			SADR = CWSSIC.saveApplicationData(_CV._SessionToken, AD);
			_CV._ApplicationProfileId = SADR;

		} catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
		System.out.println("Successfully Obtained an ApplicationProfileId " + _CV._ApplicationProfileId + "\r\n\r\n");
		return true;
	}

	public boolean RetrieveServiceInformation(ConfigurationValues _CV) {

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			ServiceInformation GSIR = new ServiceInformation();
			String strServiceAvailable = "";
			// BancardServices
			GSIR = CWSSIC.getServiceInformation(_CV._SessionToken);
			BCP_Services = GSIR.getBankcardServices();
			// NOTE: At this point you can either iterate through the services
			// in BCP_Services or in the case of our example just use the first one.
			if(BCP_Services != null && BCP_Services.length > 0)
			{
				boolean BCPFirstService = true;
				System.out.println("*** Key Information about the Bankcard Service(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (BankcardService b : BCP_Services)
				{
					if(_CV._BCPServiceId.length() < 1 && BCPFirstService){
						_CV._bcs = b;//Use the first service returned
						BCPFirstService = false;
					}
					else if (_CV._BCPServiceId.equals(b.getServiceId())) {
						_CV._bcs = b;//Use the service specified in main.java
					}
											
					//List all of the information about this service
					strServiceAvailable = "ServiceId : " + b.getServiceId()//Unique identifier for available services. These values change from sandbox to production.
					+ "\r\nService Name : " + TranslateServiceIdToFriendlyName(b)
					+ "\r\nAlternative Merchant Data : " + b.getAlternativeMerchantData()//Indicates whether the service supports the display of AlternativeMerchantData on accountholder statements. Subject to issuer discretion.
					+ "\r\nAutoSettle Supported : " + b.getAutoBatch()//Indicates whether AutoBatch is supported.
					+ "\r\nAVSData Fields Required: "
					+ "\r\n- CardHolderName: " + b.getAVSData().getCardholderName()
					+ "\r\n- Street: " + b.getAVSData().getStreet()
					+ "\r\n- City: " + b.getAVSData().getCity()
					+ "\r\n- State: " + b.getAVSData().getStateProvince()
					+ "\r\n- PostalCode: " + b.getAVSData().getPostalCode()
					+ "\r\n- Phone: " + b.getAVSData().getPhone()
					+ "\r\n- Country: " + b.getAVSData().getCountry()
					+ "\r\nCutoffTime : " + CalenderToString(b.getCutoffTime())//If the service supports AutoBatch, this is the cutoff time for new transactions to be included in the daily automated batch. 
					+ "\r\nEncryptionKey : " + b.getEncryptionKey()//Public key used for encrypting payment account data.
					+ "\r\nManagedBilling : " + b.getManagedBilling()//Indicates whether the service supports Service Provider managed billing.
					+ "\r\nMaximumBatchItems : " + b.getMaximumBatchItems()//Maximum number of items included in a single batch.
					+ "\r\nMaximumLineItems : " + b.getMaximumLineItems()//Maximum number of line items that may be provided when providing Level 3 line item data.
					+ "\r\nMultiplePartialCapture : " + b.getMultiplePartialCapture()//Indicates whether the service supports multiple partial captures of a single authorization.
					+ "\r\nOperations Supported:"//Specifies which operations are supported for the service.
					+ "\r\n- Adjust : " + b.getOperations().getAdjust()
					+ "\r\n- AuthAndCapture : " + b.getOperations().getAuthAndCapture()
					+ "\r\n- Authorize : " + b.getOperations().getAuthorize()
					+ "\r\n- Capture : " + b.getOperations().getCapture()
					+ "\r\n- CaptureAll : " + b.getOperations().getCaptureAll()
					+ "\r\n- CaptureSelective : " + b.getOperations().getCaptureSelective()
					+ "\r\n- CloseBatch : " + b.getOperations().getCloseBatch()
					+ "\r\n- QueryAccount : " + b.getOperations().getQueryAccount()
					+ "\r\n- ReturnById : " + b.getOperations().getReturnById()
					+ "\r\n- ReturnUnlinked : " + b.getOperations().getReturnUnlinked()
					+ "\r\n- Undo : " + b.getOperations().getUndo()
					+ "\r\n- Verify : " + b.getOperations().getVerify()
					+ "\r\nPurchaseCardLevel : " + b.getPurchaseCardLevel()//Specifies highest level of purchase card support. Level 3 support implies support for Level 2 as well.
					+ "\r\nTender Information:"
					+ "\r\n- Credit : " + b.getTenders().getCredit()
					+ "\r\n- CreditAuthorizeSupport : " + b.getTenders().getCreditAuthorizeSupport()//Determins if on a specific service the application can send a credit AuthorizeAndCapture
					+ "\r\n- PINDebit : " + b.getTenders().getPINDebit()
					+ "\r\n- PINDebitReturnSupportType : " + b.getTenders().getPINDebitReturnSupportType()//Gets or sets a value that determines the PINDebitReturnSupportType. This value will default to PinDebitReturnSupportType.Standalone.
					+ "\r\n- PINDebitUndoTenderDataRequired : " + b.getTenders().getPINDebitUndoTenderDataRequired()//Specifies whether a new card swipe is required when performing an Undo on a PINDebit card.
					+ "\r\n- PINlessDebit : " + b.getTenders().getPINlessDebit() + "\r\n"
					;
					System.out.println(strServiceAvailable);
				}
			}
			System.out.println("Please note that for BCP demonstration we'll use the first Service with ServiceId " + _CV._bcs.getServiceId());
			System.out.println("\r\n*** END Bankcard Service(s) ***\r\n");
	//ElectronicChecking Services
			ECK_Services = GSIR.getElectronicCheckingServices();
			// NOTE: At this point you can either iterate through the services
			// in SI or in the case of our example just use the first one.
			if(ECK_Services != null && ECK_Services.length > 0)
			{
				boolean ECKFirstService = true;
				System.out.println("*** Key Information about the Electronic Checking Service(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (ElectronicCheckingService e : ECK_Services)
				{
					if(_CV._ECKServiceId.length() < 1  && ECKFirstService){
						_CV._ecks = e;//Use the first service returned
						ECKFirstService = false;
					}
					else if (_CV._ECKServiceId.equals(e.getServiceId())) {
						_CV._ecks = e;//Use the service specified in main.java
					}
																
					//List all of the information about this service
					strServiceAvailable = "ServiceId : " + e.getServiceId()//Unique identifier for available services. These values change from sandbox to production.
                    + "\r\nService Name : " + TranslateServiceIdToFriendlyName(e)
					//Operations Supported
                    + "\r\nOperations Supported:" //Specifies which operations are supported for the service.
                    + "\r\n - Adjust : " + e.getOperations().getAdjust()
                    + "\r\n - AuthAndCapture : " + e.getOperations().getAuthAndCapture()
                    + "\r\n - Authorize : " + e.getOperations().getAuthorize()
                    + "\r\n - Capture : " + e.getOperations().getCapture()
                    + "\r\n - CaptureAll : " + e.getOperations().getCaptureAll()
                    + "\r\n - CaptureSelective : " + e.getOperations().getCaptureSelective()
                    + "\r\n - CloseBatch : " + e.getOperations().getCloseBatch()
                    + "\r\n - QueryAccount : " + e.getOperations().getQueryAccount()
                    + "\r\n - ReturnById : " + e.getOperations().getReturnById()
                    + "\r\n - ReturnUnlinked : " + e.getOperations().getReturnUnlinked()
                    + "\r\n - Undo : " + e.getOperations().getUndo()
                    + "\r\n - Verify : " + e.getOperations().getVerify()
                    + "\r\nTender Information:" //Contains specific information about the supported payment tenders.
                    + "\r\n - BatchAssignmentSupport : " + e.getTenders().getBatchAssignmentSupport() //Indicates level of BatchAssignment supported by the service. Required.
                    + "\r\n - Credit : " + e.getTenders().getCredit() //Indicates support for the Credit Card tender. Required.
                    + "\r\n - CreditAuthorizeSupport : " + e.getTenders().getCreditAuthorizeSupport() //Indicates the level of credit authorization support on a service. Required. Maps to the CreditAuthorizeSupportType enumeration.
                    + "\r\n - PINDebit : " + e.getTenders().getPINDebit() //Indicates support for the PIN Debit tender. Required.
                    + "\r\n - PINDebitReturnSupportType : " + e.getTenders().getPINDebitReturnSupportType() //Indicates if Return is supported by the service for PIN Debit transactions. Required. Maps to the PinDebitReturnSupportType enumeration. Defaults to 'Standalone'.
                    + "\r\n - PinDebitUndoSupport : " + e.getTenders().getPinDebitUndoSupport() //Indicates if Undo is supported by the service for PIN Debit transactions. Required. Maps to the PINDebitUndoSupportType enumeration.
                    + "\r\n - PINDebitUndoTenderDataRequired : " + e.getTenders().getPINDebitUndoTenderDataRequired() //Specifies whether a new card swipe is required when performing an Undo on a PIN Debit card. Required.
                    + "\r\n - PINlessDebit : " + e.getTenders().getPINlessDebit() //Indicates support for PINless Debit. Required.
                    + "\r\n - QueryRejectedSupport : " + e.getTenders().getQueryRejectedSupport() + "\r\n" //Indicates if date ranges are supported for QueryRejected on a service. Required. Maps to the QueryRejectedSupportType enumeration.
                    ;
					System.out.println(strServiceAvailable);
				}
				System.out.println("Please note that for ECK demonstration we'll use the first Service with ServiceId " + _CV._ecks.getServiceId());
				System.out.println("\r\n*** END Electronic Checking Service(s) ***\r\n");
			}
			
	//Report available workflowId(s)
			WorkFlows = GSIR.getWorkflows();
			if(WorkFlows != null && WorkFlows.length > 0)
			{
				System.out.println("*** Key Information about the Available Workflow(s) ***\r\n");
				//Use the following to use the first service in the scenario for first time through sample.
				for (Workflow w : WorkFlows)
				{
					//List all of the information about this service
					strServiceAvailable = "WorflowId : " + w.getWorkflowId()//Unique identifier for available services. These values change from sandbox to production.
                    + "\r\nWorkflow Name : " + w.getName()
                    + "\r\nAssociated ServiceId : " + w.getServiceId() + "\r\n"
                    ;
					System.out.println(strServiceAvailable);
				}
				System.out.println("\r\n*** END Available WorkflowId(s) ***\r\n");
			}

			if (_CV._bcs.getServiceId().length() < 1 && _CV._ecks.getServiceId().length() < 1)
				return false;
		} catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
		
		return true;
	}

	public boolean SaveMerchantProfile(ConfigurationValues _CV) {

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			MerchantProfileMerchantData MPMD = new MerchantProfileMerchantData();
			MerchantProfile MP = new MerchantProfile();
			ArrayList<MerchantProfile> AOMP = new ArrayList<MerchantProfile>();

			// Set Merchant Data
			AddressInfo AI = new AddressInfo();
			AI.setStreet1("1234 HappyWay");
			AI.setCity("Pleasanton");
			AI.setStateProvince(TypeStateProvince.CA);
			AI.setPostalCode("94566");
			AI.setCountryCode(TypeISOCountryCodeA3.USA);
			MPMD.setAddress(AI);
			MPMD.setCustomerServicePhone("513 3334444");
			MPMD.setMerchantId("123456789012");
			MPMD.setName("MerchantName");
			MPMD.setLanguage(TypeISOLanguageCodeA3.ENG);
			MPMD.setPhone("513 8884444");
			MPMD.setTaxId("");
			MerchantProfileTransactionData MPTD = new MerchantProfileTransactionData();
			BankcardTransactionDataDefaults BTDD = new BankcardTransactionDataDefaults();
			BTDD.setCurrencyCode(TypeISOCurrencyCodeA3.USD);
			BTDD.setCustomerPresent(CustomerPresent.Ecommerce);
			BTDD.setRequestAdvice(RequestAdvice.Capable);
			BTDD.setRequestACI(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.RequestACI.IsCPSMeritCapable); // If AVS is supported set to "IS_CPS_MERIT_CAPABLE"
			BTDD.setEntryMode(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EntryMode.Keyed);
			MPTD.setBankcardTransactionDataDefaults(BTDD);
			BankcardMerchantData BCMD = new BankcardMerchantData();
			BCMD.setABANumber("987654321");
			BCMD.setAcquirerBIN("654321");
			BCMD.setAgentBank("123456");
			BCMD.setAgentChain("645231");
			//BCMD.setAggregator(false);
			BCMD.setClientNumber("1234");
			//BCMD.setIndustryType(com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.IndustryType.ECOMMERCE);
			BCMD.setLocation("12345");
			//BCMD.setMerchantType("");
			//BCMD.setPrintCustomerServicePhone(false);
			//BCMD.setQualificationCodes("");
			BCMD.setReimbursementAttribute("A");
			BCMD.setSecondaryTerminalId("12345678");
			BCMD.setSettlementAgent("12AB");
			BCMD.setSharingGroup("123ABC");
			BCMD.setSIC("5999");
			BCMD.setStoreId("1234");
			BCMD.setTerminalId("0011");
			BCMD.setTimeZoneDifferential("005");
			
			MPMD.setBankcardMerchantData(BCMD);
			MP.setProfileId("Merch_" + _CV._bcs.getServiceId());
			MP.setMerchantData(MPMD);
			MP.setTransactionData(MPTD);
			AOMP.add(MP);
			
			if(_CV._bcs != null){
				if(_CV._BCPMerchantProfileId.length() < 1){//Save a merchant profile for BCP as one was not specified
					CWSSIC.saveMerchantProfiles(_CV._SessionToken, _CV._bcs.getServiceId(), TenderType.Credit, AOMP.toArray(new MerchantProfile[AOMP.size()]));
					System.out.println("Successfully Saved a Bankcard MerchantProfileId");
				}
				//Now let's get a list of all MerchantProfileId's saved for Bankcard 
				MerchantProfile[] MFBCP = CWSSIC.getMerchantProfiles(_CV._SessionToken, _CV._bcs.getServiceId(), TenderType.Credit);
				if(MFBCP != null){
					boolean BCPFirstMerchant = true;
					String MerchantProfiles = "";
					for (MerchantProfile m : MFBCP)
					{
						if(_CV._BCPMerchantProfileId.length() < 1  && BCPFirstMerchant){
							_CV._BCPMerchantProfileId = m.getProfileId();//Use the first MerchantProfileId returned
							BCPFirstMerchant = false;
						}
						MerchantProfiles = MerchantProfiles + m.getProfileId() + "\r\n";
					}
					System.out.println("Available Bankcard Merchant Profiles\r\n" + MerchantProfiles);
					// Can be used however skipped here CWSSIC.isMerchantProfileInitialized(_CV._SessionToken, _CV._bcs.getServiceId(), MP.getProfileId(), TenderType.CREDIT);
				}			
			}
			if(_CV._ecks != null){
				if(_CV._ECKMerchantProfileId.length() < 1){//Save a merchant profile for ECK as one was not specified
					//Set Checking specific values
					ElectronicCheckingMerchantData ECMD = new ElectronicCheckingMerchantData();
					ECMD.setOrginatorId("123456");
					ECMD.setProductId("321");
					ECMD.setSiteId("23135");
					MPMD.setElectronicCheckingMerchantData(ECMD);
					MP.setMerchantData(MPMD);
					//Note that MerchantProfileIds cannot be the same even across serviceIds
					MP.setProfileId("Merch_" + _CV._ecks.getServiceId());
					MP.setTransactionData(MPTD);
					AOMP.clear();
					AOMP.add(MP);
					CWSSIC.saveMerchantProfiles(_CV._SessionToken, _CV._ecks.getServiceId(), TenderType.Credit, AOMP.toArray(new MerchantProfile[AOMP.size()]));
					System.out.println("Successfully Saved a ElectronicChecking MerchantProfileId");
				}
				//Now let's get a list of all MerchantProfileId's saved for Electronic Checking
				MerchantProfile[] MFECK = CWSSIC.getMerchantProfiles(_CV._SessionToken, _CV._ecks.getServiceId(), TenderType.Credit);
				if(MFECK != null){
					boolean ECKFirstMerchant = true;
					String MerchantProfiles = "";
					for (MerchantProfile m : MFECK)
					{
						if(_CV._ECKMerchantProfileId.length() < 1  && ECKFirstMerchant){
							_CV._ECKMerchantProfileId = m.getProfileId();//Use the first MerchantProfileId returned
							ECKFirstMerchant = false;
						}
						MerchantProfiles = MerchantProfiles + m.getProfileId() + "\r\n";
					}
					System.out.println("Available Electronic Checking Merchant Profiles\r\n" + MerchantProfiles);
					// Can be used however skipped here CWSSIC.isMerchantProfileInitialized(_CV._SessionToken, _CV._bcs.getServiceId(), MP.getProfileId(), TenderType.CREDIT);
				}	
			}				
			return true;
		}catch (Exception e) 
        {
			handle_SVC_CWSBase_Fault(e);
            return false;
        }
	}

/// The following is used for Transaction Processing
	
	public boolean AuthorizeAndCapture(ConfigurationValues _CV, boolean ProcessAsPINDebit) {
		/*
		 * The AuthorizeAndCapture() operation is used to authorize transactions by performing a check on 
		 * cardholder's funds and reserves the authorization amount if sufficient funds are available, and 
		 * flags the transaction for capture (settlement) in a single invocation.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/AuthorizingTransactions/AuthorizeAndCapture.aspx
		*/

		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getAuthAndCapture()){
					System.out.println("AuthorizeAndCapture is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				if(_CV._bcs.getTenders().getCreditAuthorizeSupport() == CreditAuthorizeSupportType.AuthorizeOnly && ProcessAsPINDebit != true){
					System.out.println("AuthorizeAndCapture can only be used for a PINDebit transaction for this service\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
		        if(_CV._UseWorkFlowId){
					BCTR = (BankcardTransactionResponsePro) CWSBC.authorizeAndCapture(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
					BCTR = (BankcardTransactionResponsePro) CWSBC.authorizeAndCapture(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());		        	
		        }
		        
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("AuthorizeAndCapture Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Authorize(ConfigurationValues _CV) {
		/* 
		 * The Authorize() operation is used to authorize transactions by performing a check on cardholder's funds and 
		 * reserves the authorization amount if sufficient funds are available. Unlike the AuthorizeAndCapture() operation, 
		 * authorized transactions must then be flagged for settlement by invoking the Capture() operation.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/AuthorizingTransactions/Authorize.aspx
		 */
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getAuthorize()){
					System.out.println("Authorize is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
		        if(_CV._UseWorkFlowId){
		        	BCTR = (BankcardTransactionResponsePro) CWSBC.authorize(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
		        	BCTR = (BankcardTransactionResponsePro) CWSBC.authorize(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());		        	
		        }
				
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().getAuthorize()){
					System.out.println("Authorize is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				if(!ECTR.getACHCapable()){
					System.out.println("Your previous QueryAccount() returned a response where the transaction is not ACHCapable");
					return false;
				}
				
                //If a modified account or routing number is returned, those numbers should be used for the check transaction.  
                //Good for verifying the info before running the charge – like when you initially set-up a recurring payment.
				ElectronicCheckingTransaction ECKtransaction = setElectronicCheckTxnData();
				if(ECKtransaction.getTenderData().getCheckData().getAccountNumber() != ECTR.getModifiedAccountNumber())
					ECKtransaction.getTenderData().getCheckData().setAccountNumber(ECTR.getModifiedAccountNumber());
				if(ECKtransaction.getTenderData().getCheckData().getRoutingNumber() != ECTR.getModifiedRoutingNumber())
					ECKtransaction.getTenderData().getCheckData().setRoutingNumber(ECTR.getModifiedRoutingNumber());
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._ECKServiceId))
		        	ECKtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
				
		        if(_CV._UseWorkFlowId){
		        	ECTR = (ElectronicCheckingTransactionResponse) CWSBC.authorize(_CV._SessionToken, ECKtransaction, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._WorkFlowId);
		        }
		        else{
		        	ECTR = (ElectronicCheckingTransactionResponse) CWSBC.authorize(_CV._SessionToken, ECKtransaction, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId());		        	
		        }
		        
				ProcessElectronicCheckingTransactionResponse(ECTR, _CV);
				
				if(ECTR != null){
					//In this case the check is ACHCapable meaning that it can now be processed as a check
					System.out.println("The check is ACHCapable meaning that it can now be processed as a check");
				}
				else{
					return false;//Stop processing as an issue was encourntered.
				}
			}
			
			System.out.println("Authorize Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			//The following is used for TMS
			_AuthorizeTransactionId = BCTR.getTransactionId();
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Adjust(ConfigurationValues _CV) {
		/* The Adjust() operation is used to make adjustments to a previously authorized amount (incremental 
		 * or reversal) prior to capture and settlement.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/AdjustingVoidingTransactions/Adjust.aspx
		*/ 
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getAdjust()){
					System.out.println("Adjust is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				// First Let's perform an Authorize and Capture. Well use this later on for the Adjust
				if (_CV._bcs.getOperations().getAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's adjust the previously approved AuthorizeAndCapture
				String pTransaction = BCTR.getTransactionId();
				com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust aDifference = new com.ipcommerce.schemas.CWS.v2_0.Transactions.Adjust();
				//Add tip to original amount
				
				aDifference.setAmount(BCTR.getAmount().add((new BigDecimal("2.00")).setScale(2, RoundingMode.UNNECESSARY)));// Add two dollars to original amount
				aDifference.setTipAmount((new BigDecimal("2.00")).setScale(2, RoundingMode.UNNECESSARY));// Add two dollars to original amount
				aDifference.setTransactionId(pTransaction); // Simply use the TransactionId from the Authorize
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	aDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.adjust(_CV._SessionToken, aDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);

				/*
				 * Since the Adjust succeeded, remove the original TransactionID from the list of transaction to settle. 
				 * The new TransactionId Should be used when calling CaptureSelective. In your database you'll 
				 * likely perform and Update instead of an add and delete.
				*/
				if(_transactionIDs.contains(pTransaction))
				{
					_transactionIDs.remove(pTransaction);
				}
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
						
			System.out.println("Adjust Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Undo(ConfigurationValues _CV) {
		/* 
		 * The Undo() operation is used to release cardholder funds by performing a void (Credit Card) or reversal 
		 * (PIN Debit) on a previously authorized transaction that has not been captured (flagged) for settlement.
		 * 
		 * The fundamental difference between Undo() and ReturnUnlinked() is that Undo() is used to void or reverse 
		 * a previously authorized transaction, while ReturnUnlinked() can only be used to return funds for a transaction 
		 * that has been previously flagged for capture.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/AdjustingVoidingTransactions/Undo.aspx
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getUndo()){
					System.out.println("Undo is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//For an Undo let's first generate an Authorize to Undo
				if (_CV._bcs.getOperations().getAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's Undo the previously approved Authorize
				BankcardUndo uDifference = new BankcardUndo();

				String pTransaction = BCTR.getTransactionId();
				uDifference.setTransactionId(pTransaction); // Simply use the TransactionId from the Authorize
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	uDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.undo(_CV._SessionToken, uDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);

				/*
				 * Since the Undo succeeded, remove both the original transactionId as well as the transactionId
				 * returned from the Undo transaction.
				*/
				if(_transactionIDs.contains(BCTR.getTransactionId()))//The last TransactionId from the Undo
					_transactionIDs.remove(BCTR.getTransactionId());
				if(_transactionIDs.contains(pTransaction))//The original TransactionId from the Authorize	
					_transactionIDs.remove(pTransaction);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().getUndo()){
					System.out.println("Undo is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//ADD
			}
						
			System.out.println("Undo Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean Capture(ConfigurationValues _CV) {
		/* 
		 * The Capture() operation is used to capture a single transaction for settlement after it has been successfully 
		 * authorized using the Authorize() operation.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/CapturingTransactions/Capture.aspx
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			BankcardCaptureResponse BCCR = new BankcardCaptureResponse();
			
			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getCapture()){
					System.out.println("Capture is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//First process an Authorize which will be used for a capture
				if (_CV._bcs.getOperations().getAuthorize())
					if(!Authorize(_CV))return false;

				// Now Let's Capture the previously approved Authorize
				BankcardCapture cDifference = new BankcardCapture();

				cDifference.setTransactionId(BCTR.getTransactionId()); // Simply use the TransactionId from the Authorize
				// Conditional values. The following scenario would be used in a
				// Restaurant industry type where tip is added.
				
				BigDecimal NewAmt = BCTR.getAmount();
				NewAmt.add(new BigDecimal("6.00")).setScale(2, RoundingMode.UNNECESSARY);
				cDifference.setAmount(NewAmt);// Add tip amount
				cDifference.setTipAmount(new BigDecimal("6.00").setScale(2, RoundingMode.UNNECESSARY));
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	cDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCCR = (BankcardCaptureResponse) CWSBC.capture(_CV._SessionToken, cDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardCaptureResponse(BCCR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("Capture Successfully Processed : " + BCCR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean CaptureAll(ConfigurationValues _CV) {
		/*
		 * The CaptureAll() operation is used to flag all transactions for settlement that have been successfully authorized 
		 * using the Authorize() operation. Merchants may wish to invoke this operation to ensure all transactions are included 
		 * in the batch that is sent for settlement processing by the cut-off times established by the Service Provider, or to 
		 * transmit smaller batches to the Service Provider for settlement
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/CapturingTransactions/CaptureAll.aspx
		 */
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			if (!_CV._bcs.getOperations().getCaptureAll())
			{
				System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
				return true;// Check to see if this transaction type is supported
			}

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getCaptureAll()){
					System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				//Lets first load some transaction. For simulation I'll try and load each transaction type if supported
				System.out.println("Starting CaptureAll examples");

				if (_CV._bcs.getOperations().getAuthAndCapture() && _CV._bcs.getAutoBatch())
					if(!AuthorizeAndCapture(_CV, false))return false;
				if (_CV._bcs.getOperations().getAuthorize())
				{	
					if(!Authorize(_CV))return false;
					_ReturnById_TC_Example = BCTR;//Save the transaction of the Authorize for post settlement ReturnById Example 
				}
				if (_CV._bcs.getOperations().getAdjust())
					if(!Adjust(_CV))return false;
				if (_CV._bcs.getOperations().getUndo())
					if(!Undo(_CV))return false;
				//Note ReturnById is shown below as this requires an Authorize from a previous settlement
				if (_CV._bcs.getOperations().getReturnUnlinked())
					if(!ReturnUnlinked(_CV))return false;
				
				Response[] AOR = CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
				
				for (Response BCCR : AOR)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				
				//Now let's demonstrate sending a ReturnById from a previous settlement.
				if (_CV._bcs.getOperations().getReturnById())
					if(!ReturnById(_CV))return false; 
									
				AOR = CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
								
				for (Response BCCR : AOR)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				System.out.println("CaptureAll Example Set Successfully Processed" + "\r\n");
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().getCaptureAll()){
					System.out.println("CaptureAll is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				Response[] AOR = CWSBC.captureAll(_CV._SessionToken, null, null, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId());
				for (Response ECCR : AOR)
				{
					ProcessElectronicCheckingCaptureResponse((ElectronicCheckingCaptureResponse)ECCR, _CV);
				}
				System.out.println("CaptureAll for Electronic Checking Successfully Processed" + "\r\n");
			}
			
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean CaptureSelective(ConfigurationValues _CV) {
		/*
		 * The CaptureSelective() operation is used to flag one or more transactions (by transactionId) for settlement 
		 * that have been successfully authorized using the Authorize() operation. Merchants may wish to invoke this 
		 * operation to ensure only specific transactions are included in the batch that is sent for settlement processing 
		 * by the cut-off times established by the Service Provider, or to transmit smaller batches to the Service 
		 * Provider for settlement.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/CapturingTransactions/CaptureSelective.aspx
		 */
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getCaptureSelective()){
					System.out.println("CaptureSelective is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				//Lets first load some transaction. For simulation I'll try and load each transaction type if supported
				System.out.println("Starting CaptureSelective examples");
				
				_transactionIDs.clear();
				
				if (_CV._bcs.getOperations().getAuthAndCapture() && _CV._bcs.getAutoBatch())
					if(!AuthorizeAndCapture(_CV, false))return false;
				if (_CV._bcs.getOperations().getAuthorize())
				{	
					if(!Authorize(_CV))return false;
					_ReturnById_TC_Example = BCTR;//Save the transaction of the Authorize for post settlement ReturnById Example 
				}
				if (_CV._bcs.getOperations().getAdjust())
					if(!Adjust(_CV))return false;
				if (_CV._bcs.getOperations().getUndo())
					if(!Undo(_CV))return false;
				//Note ReturnById is shown below as this requires an Authorize from a previous settlement
				if (_CV._bcs.getOperations().getReturnUnlinked())
					if(!ReturnUnlinked(_CV))return false;
				
				Response[] AOR = CWSBC.captureSelective(_CV._SessionToken, _transactionIDs.toArray(new String[_transactionIDs.size()]), null, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				
				for (Response BCCR : AOR)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
				
				//Now let's demonstrate sending a ReturnById from a previous settlement.
				_transactionIDs.clear(); //Clear out previous List of transactions to settle
				if (_CV._bcs.getOperations().getReturnById())
					if(!ReturnById(_CV))return false; 

				AOR = CWSBC.captureSelective(_CV._SessionToken, _transactionIDs.toArray(new String[_transactionIDs.size()]), null, _CV._ApplicationProfileId, _CV._bcs.getServiceId());

				for (Response BCCR : AOR)
				{
					ProcessBankcardCaptureResponse((BankcardCaptureResponse)BCCR, _CV);
				}
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}

			System.out.println("CaptureSelective Example Set Successfully Processed" + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean ReturnById(ConfigurationValues _CV) {
		/*
		 * The ReturnById() operation is used to perform a linked credit to a cardholder’s account from the merchant’s 
		 * account based on a previously authorized and settled transaction.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/RefundingTransactions/ReturnById.aspx
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.
			
			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getReturnById()){
					System.out.println("ReturnById is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				//First let's process an AuthorizeAndCapture 
				if (_CV._bcs.getOperations().getAuthAndCapture() && _CV._bcs.getAutoBatch())
				{//In this case the example is demonstrating a host capture return that supports AuthorizeAndCapture
					if(!AuthorizeAndCapture(_CV, false))return false; 
				}
				else if (_ReturnById_TC_Example.getTransactionId() != null)
				{//In this case the example is demonstrating a terminal capture return
					BCTR = _ReturnById_TC_Example; //Replace previous transaction with settled value
					_ReturnById_TC_Example = new BankcardTransactionResponsePro();//reset so that this transaction is not used a second time
				}
				else
				{
					System.out.println("ReturnById unable to process as a previously settled Authorize was not available");
					return true; //AuthorizeAndCapture not supported however continue with other samples.
				}
				
				// Now Let's ReturnById the previously approved AuthorizeAndCapture
				BankcardReturn rDifference = new BankcardReturn();

				rDifference.setTransactionId(BCTR.getTransactionId()); // Simply use the TransactionId from the AuthorizeAndCapture
				/* Conditional values. The following scenario would be used in a partial return for an amount 2 dollars
				 * less
				*/
				rDifference.setAmount(BCTR.getAmount());

				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	rDifference.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				BCTR = (BankcardTransactionResponsePro) CWSBC.returnById(_CV._SessionToken, rDifference, _CV._ApplicationProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("ReturnById Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}

	public boolean ReturnUnlinked(ConfigurationValues _CV) {

		/*The ReturnUnlinked() operation is used to perform an “unlinked”, or standalone, credit to a cardholder’s account 
		 * from the merchant’s account. This operation is useful when a return transaction is not associated with a previously 
		 * authorized and settled transaction.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/RefundingTransactions/ReturnUnlinked.aspx
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getReturnUnlinked()){
					System.out.println("ReturnUnlinked is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				// Let's Return an unlinked transaction
				BankcardTransaction BCR = setBankCardTxnData(_CV);

				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCR.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
				BCTR = (BankcardTransactionResponsePro) CWSBC.returnUnlinked(_CV._SessionToken, BCR, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//Presently no service providers support
				return true;
			}
			
			System.out.println("ReturnUnlinked Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean Verify(ConfigurationValues _CV) {
		/* 
		 * The Verify() operation is used to verify information about a payment account, such as address verification data (AVSData) 
		 * on a credit card account, without reserving any funds.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/OptionalOperations/Verify.aspx
		 */
		
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				if (!_CV._bcs.getOperations().getVerify()){
					System.out.println("Verify is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				BankcardTransaction BCtransaction = setBankCardTxnData(_CV);
				
				//Note *** : Alwasy make sure AVS is set
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._BCPServiceId))
		        	BCtransaction.setAddendum(SetUsernameAndPassword(_userName, _password));
		        
				BCTR = (BankcardTransactionResponsePro) CWSBC.verify(_CV._SessionToken, BCtransaction, _CV._ApplicationProfileId, _CV._BCPMerchantProfileId, _CV._bcs.getServiceId());
				ProcessBankcardTransactionResponse(BCTR, _CV);
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				//TODO add later
			}
			
			System.out.println("Verify Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	public boolean QueryAccount(ConfigurationValues _CV) {

		/*The QueryAccount() operation is used to perform a balance inquiry on a cardholder's account to determine the current account balance.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/TransactionProcessing/OptionalOperations/QueryAccount.aspx
		*/ 
		try {
			checkTokenExpire(_CV);// Always verify that the session token has not expired.

			if(_CV.ServiceToProcessAs == "BankcardService" && _CV._bcs != null){
				//Presently no service providers support
				return true;
			}
			else if (_CV.ServiceToProcessAs == "ElectronicCheckingService" && _CV._ecks != null){
				if (!_CV._ecks.getOperations().getQueryAccount()){
					System.out.println("QueryAccount is not supported by this service provider. Moving to next transaction type\r\n");	
					return true;// Check to see if this transaction type is supported
				}
				
				// Let's verfiy the check account is correct
				ElectronicCheckingTransaction ECR = setElectronicCheckTxnData();
				
				//Check to see if this service requires username and password
		        if(CredentialRequired(_CV._ECKServiceId))
		        	ECR.setAddendum(SetUsernameAndPassword(_userName, _password));
				
				ECTR = (ElectronicCheckingTransactionResponse) CWSBC.queryAccount(_CV._SessionToken, ECR, _CV._ApplicationProfileId, _CV._ECKMerchantProfileId, _CV._ecks.getServiceId());
				ProcessElectronicCheckingTransactionResponse(ECTR, _CV);
			}
			
			System.out.println("QueryAccount Successfully Processed : " + BCTR.getTransactionId() + "\r\n");
			return true;
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
            return false;
        }
	}
	
	
/// The following is used for Transaction Management Service (TMS)
	public boolean QueryBatch(ConfigurationValues _CV) {
		
		try {
			checkTokenExpire(_CV);// Query Batch requires CaptureAll() or CaptureSelective()
			if (!_CV._bcs.getOperations().getCaptureAll() && !_CV._bcs.getOperations().getCaptureSelective())
			{
				System.out.println("QueryBatch is not supported as neither CaptureAll or CaptureSelective " +
						"is supported by this service provider. Moving to next transaction type\r\n");	
				return true;// Check to see if this transaction type is supported
			}				
			System.out.println("\r\nStarting QueryBatch Example");
			BatchDetailData[] AOBDD = CWSTMS.queryBatch(_CV._SessionToken, QBP(), PP());
		
            if(AOBDD != null)
            {              
            	System.out.println(processQueryBatchResponse(Arrays.asList(AOBDD)));
            }
			System.out.println("QueryBatch Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionsSummary(ConfigurationValues _CV) {
					
		try {
			checkTokenExpire(_CV);
			
			System.out.println("\r\nStarting QueryTransactionsSummary Example");
			SummaryDetail[] AOSD = CWSTMS.queryTransactionsSummary(_CV._SessionToken, QTP(""), true, PP());
			
            if(AOSD != null)
            {              
            	System.out.println(processQueryTransactionSummaryResponse(Arrays.asList(AOSD)));
            }
			System.out.println("QueryTransactionSummary Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionFamilies(ConfigurationValues _CV) {
					
		try {
			checkTokenExpire(_CV);
		
			System.out.println("\r\nStarting QueryTransactionFamilies Example");
			FamilyDetail[] AOTD = CWSTMS.queryTransactionFamilies(_CV._SessionToken, QTP(_AuthorizeTransactionId), PP());
			
            if(AOTD != null)
            {              
            	System.out.println(processQueryTransactionFamiliesResponse(Arrays.asList(AOTD)));
            }
			System.out.println("QueryTransactionSummary Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}

	public boolean QueryTransactionsDetail(ConfigurationValues _CV){
					
		try {
			checkTokenExpire(_CV);
		
			System.out.println("\r\nStarting QueryTransactionsDetail Example");
			TransactionDetail[] AOTD = CWSTMS.queryTransactionsDetail(_CV._SessionToken, QTP(_AuthorizeTransactionId), null, null, PP());
			
            if(AOTD != null)
            {              
            	System.out.println(processQueryTransactionsDetailResponse(Arrays.asList(AOTD)));
            }
            System.out.println("QueryTransactionsDetail Successfully Processed");
			return true;
		} catch (Exception e) 
        {
			handleTMSBase_Fault(e);
            return false;
        }
	}
	
/// The following are helper methods

	public void checkTokenExpire(ConfigurationValues _CV) throws Exception {
		try {
			if (_CV._SessionTokenDateTime == null) {
				// First Time so get a new Session Token
				_CV._SessionToken = CWSSIC.signOnWithToken(_IdentityToken);
				GregorianCalendar gc1 = new GregorianCalendar();
				Date d1 = gc1.getTime();
				_CV._SessionTokenDateTime = d1.getTime();
			} else {
				// Let's check to see if the token has expired or is about to
				// expire.
				GregorianCalendar gc = new GregorianCalendar();
				Date d = gc.getTime();
				long l = d.getTime();
				long difference = l - _CV._SessionTokenDateTime;
				difference = difference / 60000;
				if (difference > 25) {
					// In this case the session token has either expired or will
					// expire in less than 5 min. So get a new one.
					_CV._SessionToken = CWSSIC.signOnWithToken(_IdentityToken);
					GregorianCalendar gc1 = new GregorianCalendar();
					Date d1 = gc1.getTime();
					_CV._SessionTokenDateTime = d1.getTime();
				}
			}
		} catch (Exception e) 
        {
			handleCWSBase_Fault(e);
        }
	}

	private void setupEndpoints(ConfigurationValues _CV)throws Exception{
		try {
		//Let's first setup the Service Information end point
			try
			{
		        CWSSIC = new ICWSServiceInformationProxy(_primaryServiceEndpoint);				
			}
			catch (Exception e1)
			{
				//Primary not available so try the Secondary end point
				try
				{
			        CWSSIC = new ICWSServiceInformationProxy(_secondaryServiceEndpoint);
				}
				catch (Exception e2)
				{
					handleCWSBase_Fault(e2);
				}
			}
			
			//Let's now setup the Transaction Processing end point
			try
			{
				//First try to setup the primary end point
		        CWSBC = new ICwsTransactionProcessingProxy(_primaryTxnEndpoint);			
			}
			catch (Exception e1)
			{
				//Primary not available so try the Secondary end point
				try
				{
			        CWSBC = new ICwsTransactionProcessingProxy(_secondaryTxnEndpoint);
				}
				catch (Exception e2)
				{
					handleCWSBase_Fault(e2);
				}
			}
			
			if(_CV._UseTMS)
			{
				//And Finally if supported setup Transaction Management Services (TMS)
				try
				{
					//First try to setup the primary end point
			        CWSTMS = new ITMSOperationsProxy(_primaryTMSEndpoint);			
				}
				catch (Exception e1)
				{
					//Primary not available so try the Secondary end point
					try
					{
				        CWSTMS = new ITMSOperationsProxy(_secondaryTMSEndpoint);
					}
					catch (Exception e2)
					{
						handleCWSBase_Fault(e2);
					}
				}
			}
		}
		catch (Exception ex) {throw ex;}
	}
	
	private void handle_SVC_CWSBase_Fault(Exception _e)
	{
        try {
            CWSBaseFault faultInfo = (CWSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof  CWSValidationResultFault)
            {
            	CWSValidationResultFault valFault = (CWSValidationResultFault) faultInfo;
    			for (CWSValidationErrorFault err : valFault.getErrors())
            	{
            		System.out.println("  Validation Error: " + err.getRuleMessage());
            		System.out.println("   Location: " + err.getRuleLocationKey());             		
            	}
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	private void handleCWSBase_Fault(Exception _e)
	{
        try {
            CWSBaseFault faultInfo = (CWSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof  CWSValidationResultFault)
            {
            	CWSValidationResultFault valFault = (CWSValidationResultFault) faultInfo;
    			for (CWSValidationErrorFault err : valFault.getErrors())
            	{
            		System.out.println("  Validation Error: " + err.getRuleMessage());
            		System.out.println("   Location: " + err.getRuleLocationKey());             		
            	}
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	private void handleTMSBase_Fault(Exception _e)
	{
        try {
            TMSBaseFault faultInfo = (TMSBaseFault) _e.getClass().getMethod("getFaultInfo", null).invoke(_e, null);
            System.out.println("FAULT: " + faultInfo.getErrorID() + ": " + faultInfo.getProblemType());
            if (faultInfo instanceof TMSUnavailableFault)
            {
            	TMSUnavailableFault err = new TMSUnavailableFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSUnknownServiceKeyFault)
            {
            	TMSUnknownServiceKeyFault err = new TMSUnknownServiceKeyFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSOperationNotSupportedFault)
            {
            	TMSOperationNotSupportedFault err = new TMSOperationNotSupportedFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
            if (faultInfo instanceof TMSTransactionFailedFault)
            {
            	TMSTransactionFailedFault err = new TMSTransactionFailedFault();
            	System.out.println("Fault Thrown: " + err.getClass());
        		System.out.println("  ErrorID: " + err.getErrorID());
        		System.out.println("  Operation: " + err.getOperation());
        		System.out.println("  ProblemType: " + err.getProblemType());
            }
        }
        catch (Exception e2) {
            // Not a IP Commerce fault.
        	System.out.println("Class: " + _e.getClass().getName());
        	System.out.println("Cause: " + _e.getCause());
        	System.out.println("Message: " + _e.getMessage()); 
        }
	}
	
	
	private BankcardTransaction setBankCardTxnData(ConfigurationValues _CV) {
		BankcardTransaction BCtransaction = new BankcardTransaction();

		BankcardTransactionData BCTD = new BankcardTransactionData();
		BCTD.setAmount(new BigDecimal("15.00").setScale(2, RoundingMode.UNNECESSARY));
		BCTD.setCurrencyCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCurrencyCodeA3.USD);
		BCTD.setEntryMode(com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode.Keyed);
		BCTD.setIndustryType(IndustryType.Ecommerce);
		BCTD.setLaneId("1");
		BCTD.setCustomerPresent(com.ipcommerce.schemas.CWS.v2_0.Transactions.Bankcard.CustomerPresent.Ecommerce);
		BCTD.setSignatureCaptured(false);
		
		Calendar cTimeNow = Calendar.getInstance();
		cTimeNow.getTime();
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");//IPCommerce format : yyyy-MM-ddTHH:mm:ss
		BCTD.setTransactionDateTime(SDF.format(cTimeNow.getTime()));
	
	
		// Used for Retail
		//BCTD.setEmployeeId("123h");

		BCTD.setGoodsType(GoodsType.PhysicalGoods);//Only used for some service providers
		
		// Used for Ecommerce
		BCTD.setOrderNumber("123ggd");

		BCtransaction.setTransactionData(BCTD);

		BankcardTenderData BCTen = new BankcardTenderData();
		CardData CD = new CardData();
		CD.setCardType(TypeCardType.MasterCard);
		CD.setExpire("1213"); // exactly 4 digits – MMYY where as a swipe will be YYMM
		CD.setPAN("5454545454545454");
		// CD.setTrack1Data("B5454545454545454^IPCOMMERCE/TESTCARD^1312101013490000000001000880000");
		// CD.setTrack2Data("5454545454545454=13121010134988000010");
		BCTen.setCardData(CD);

		CardSecurityData CSD = new CardSecurityData();
		// AVSData
		AVSData AVS = new AVSData();
		AVS.setPostalCode("45040");
		CSD.setAVSData(AVS);
		// CVData
		CSD.setCVDataProvided(CVDataProvided.Provided);
		CSD.setCVData("111");

		//Process a Magensa 'End to end encryption' transaction
        if (_CV._UseWorkFlowId)
        { //*** ToDo : the following are generic values which will only work against Sandbox.***
            //First set the CardData to null
        	BCTen.setCardData(null);

    		CSD.setCVDataProvided(CVDataProvided.NotSet);
    		CSD.setCVData(null);
    		CSD.setIdentificationInformation("9ED72A486AB36DC352957C2C00607E937D1D90CB8B09A8588629AABA8EAF0FD65296A4FBA490EECFCD8D5B350438C4BFA6A36FFA2ADAAA3E");

    		BCTen.setSecurePaymentAccountData("87936F09AE06386BA4CD81ADFF7DF0FA5AC1B28EF9F7B7075E415545F9B9095C0AC5FA12B9905325");
    		BCTen.setEncryptionKeyId("9010010B0C2472000021");
    		BCTen.setSwipeStatus("00304061");

    		//BCtransaction.getTransactionData().setScoreThreshold(".5");//Not presently supported
            BCtransaction.getTransactionData().setEntryMode(com.ipcommerce.schemas.CWS.v2_0.Transactions.EntryMode.Track2DataFromMSR);
            BCtransaction.getTransactionData().setReference("11");
        }
		
		BCTen.setCardSecurityData(CSD);
		BCtransaction.setTenderData(BCTen);
		
		return BCtransaction;
	}
	
    private ElectronicCheckingTransaction setElectronicCheckTxnData()
    {
        ElectronicCheckingTransaction ECKTransaction = new ElectronicCheckingTransaction();
        
        //Consumer Data
        TransactionCustomerData TCD = new TransactionCustomerData();
        TCD.setCustomerId("123");
        ECKTransaction.setCustomerData(TCD);

        //Transaction Data
        ElectronicCheckingTransactionData ECTxD = new ElectronicCheckingTransactionData();
        ECTxD.setAmount(new BigDecimal("14.00").setScale(2, RoundingMode.UNNECESSARY));
        //ECTxD.setCurrencyCode(com.ipcommerce.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3.USD);
        Calendar cTimeNow = Calendar.getInstance();
        cTimeNow.getTime();
        ECTxD.setEffectiveDate(cTimeNow); //Specifies the effective date of the transaction. Required.
        ECTxD.setIsRecurring(false); //Indicates whether the transaction is recurring. Conditional, required if SECCode = 'WEB'.
        //Supported SEC Codes are PPD, CCD, TEL, WEB and BOC.  CCD and PPD transactions can be either credit or debit.  TEL, WEB and BOC are debit transactions only.
        ECTxD.setSECCode(SECCode.WEB); //The three letter code that indicates what NACHA regulations the transaction must adhere to. Required.
        ECTxD.setServiceType(ServiceType.ACH); //Indicates the Electronic Checking service type: ACH, RDC or ECK. Required.
        //ECTxD.setTransactionDateTime(cTimeNow);
        ECTxD.setTransactionType(TransactionType.Debit); //Indicates the transaction type. Required.
        ECKTransaction.setTransactionData(ECTxD);        
        
        //Billing Data
        CustomerInfo CI = new CustomerInfo();
        //Set either Individual or Business
      //Individual
        NameInfo NI = new NameInfo();
        NI.setFirst("");
        NI.setLast("");
        NI.setMiddle("");
        CI.setName(NI);
        com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo AI = new com.ipcommerce.schemas.CWS.v2_0.Transactions.AddressInfo();
        AI.setCity("Denver");
        AI.setCountryCode(com.ipcommerce.schemas.CWS.v2_0.Transactions.TypeISOCountryCodeA3.USA);
        AI.setPostalCode("80023");
        AI.setStateProvince("CO");
        AI.setStreet1("1234 Happyway");
        //AI.setStreet2("");
        CI.setAddress(AI);
                
      //Business
        CI.setBusinessName("ACME Supplies");
                
        TCD.setBillingData(CI);

        //Tender Data
        ElectronicCheckingTenderData ECTnD = new ElectronicCheckingTenderData();
        CheckData CD = new CheckData();
        CD.setAccountNumber("1234567890");//Account number on the check. Required.
        CD.setCheckCountryCode(CheckCountryCode.US);//Bank account country of origin for receiver deposit.
        CD.setCheckNumber("191");//The check number as printed on the check. Optional.
        CD.setOwnerType(OwnerType.Personal);//Indicates the type of entity which owns the account.
        CD.setRoutingNumber("987654321"); //9-digit bank routing number of the receiver deposit account. Required.
        CD.setUseType(UseType.Checking);//Indicates the type of account.
        ECTnD.setCheckData(CD);
        ECKTransaction.setTenderData(ECTnD);
        
        return ECKTransaction;
    }
    
    public boolean CredentialRequired(String ServiceID)
    {
        //Intuit
        if (ServiceID == "16E5800001") return true; //Sandbox
        if (ServiceID == "7AC431300C") return true; //Production
        if (ServiceID == "2FE5500001") return true; //Sandbox
        if (ServiceID == "2D00A1300C") return true; //Production
        if (ServiceID == "CE4AE1300C") return true; //Sandbox
        if (ServiceID == "6429C00001") return true; //Production
        if (ServiceID == "692981300C") return true; //Sandbox
        if (ServiceID == "6BAEC00001") return true; //Production
        if (ServiceID == "E7DFB1300C") return true; //Sandbox
        if (ServiceID == "8046100001") return true; //Production

        //RBS Worldpay
        if (ServiceID == "832E400001") return true; //Sandbox
        if (ServiceID == "EEEAB1300C") return true; //Production

        //Affirmative ACH Now
        if (ServiceID == "35A7700001") return true; //Sandbox
        if (ServiceID == "DF29D1300C") return true; //Production

		
        //Adaptive Ecommerce PINDebit
        if (ServiceID == "207CE00001") return true; //Sandbox
        if (ServiceID == "CAFF61300C") return true; //Production
		
        return false;
    }
    
    public Addendum SetUsernameAndPassword(String username, String password)
    {
		// Set Credentials
		// For service providers that use username and password
        
		Addendum addendum = new Addendum();
		Unmanaged unmanaged = new Unmanaged();
		ArrayList<String> creds = new ArrayList<String>();
		
        creds.add("<UserId>"+username+"</UserId><Password>"+password+"</Password>");
        unmanaged.setAny(creds.toArray(new String[creds.size()]));
        
        addendum.setUnmanaged(unmanaged);
        return addendum;
    }
 
    public String TranslateServiceIdToFriendlyName(BankcardService bankcardService)
    {
        //Sandbox
        if (bankcardService.getServiceId().equals("214DF00001")) return "Chase Paymentech Orbital - Tampa";
        if (bankcardService.getServiceId().equals("B51E100001")) return "Chase Paymentech Orbital - Salem";
        if (bankcardService.getServiceId().equals("7B62B00001")) return "First Data - Nashville";
        if (bankcardService.getServiceId().equals("786F400001")) return "Chase Paymentech Orbital - Tampa Retail";
        if (bankcardService.getServiceId().equals("A656D00001")) return "First Data - Nashville US";
        if (bankcardService.getServiceId().equals("4CACF00001")) return "Chase Tampa Direct TCS";
        if (bankcardService.getServiceId().equals("3E2DE00001")) return "RBS Global Gateway";
        if (bankcardService.getServiceId().equals("832E400001")) return "RBS Worldpay";
        if (bankcardService.getServiceId().equals("C82ED00001")) return "TSYS Sierra";
        if (bankcardService.getServiceId().equals("5A38100001")) return "Tampa - Canada";
        if (bankcardService.getServiceId().equals("71C8700001")) return "TSYS Sierra Canada";
        if (bankcardService.getServiceId().equals("8335000001")) return "TSYS Summit";
        if (bankcardService.getServiceId().equals("A4F2B00001")) return "Salem Direct";
        if (bankcardService.getServiceId().equals("E4FB800001")) return "First Data - Nashville";
        if (bankcardService.getServiceId().equals("16E5800001")) return "Intuit QBMS";
        if (bankcardService.getServiceId().equals("A8CFF00001")) return "First Data BUYPASS";
        if (bankcardService.getServiceId().equals("36EBE00001")) return "Tampa TCS for Canada";
        if (bankcardService.getServiceId().equals("6429C00001")) return "Intuit QBMS Inline Tokenization";
        if (bankcardService.getServiceId().equals("8046100001")) return "Intuit QBMS No Tokenization";
        if (bankcardService.getServiceId().equals("207CE00001")) return "Adaptive Payments";
        if (bankcardService.getServiceId().equals("88D9300001")) return "Vantiv FTPS";
        if (bankcardService.getServiceId().equals("8077500001")) return "Intuit QBMS Inline Tokenization";
        if (bankcardService.getServiceId().equals("B447F00001")) return "Vantiv IBM FTPS";
        if (bankcardService.getServiceId().equals("D806000001")) return "Vantiv IBM FTPS";
        if (bankcardService.getServiceId().equals("9B0C200001")) return "Intuit QBMS No Tokenization";
        if (bankcardService.getServiceId().equals("4365400001")) return "Vantiv Tandem HC FTPS";
        if (bankcardService.getServiceId().equals("2C36000001")) return "RBS Worldpay";
        if (bankcardService.getServiceId().equals("E88FD00001")) return "TSYS Summit";

        //Production
        if (bankcardService.getServiceId().equals("C97EF1300C")) return "Chase Paymentech Orbital - Tampa";
        if (bankcardService.getServiceId().equals("8A4B91300C")) return "Chase Paymentech Orbital - Salem";
        if (bankcardService.getServiceId().equals("19F161300C")) return "First Data - Nashville";
        if (bankcardService.getServiceId().equals("3257B1300C")) return "Chase Paymentech Orbital - Tampa Retail";
        if (bankcardService.getServiceId().equals("859AC1300C")) return "First Data - Nashville US";
        if (bankcardService.getServiceId().equals("633511300C")) return "Chase Tampa Direct TCS";
        if (bankcardService.getServiceId().equals("355931300C")) return "RBS Global Gateway";
        if (bankcardService.getServiceId().equals("8CEA11300C")) return "RBS Worldpay";
        if (bankcardService.getServiceId().equals("168511300C")) return "TSYS Sierra";
        if (bankcardService.getServiceId().equals("852BB1300C")) return "Tampa - Canada";
        if (bankcardService.getServiceId().equals("507BF1300C")) return "TSYS Sierra Canada";
        if (bankcardService.getServiceId().equals("55C3C1300C")) return "TSYS Summit";
        if (bankcardService.getServiceId().equals("D1DDF1300C")) return "Salem Direct";
        if (bankcardService.getServiceId().equals("D917B1300C")) return "First Data - Nashville";
        if (bankcardService.getServiceId().equals("7AC431300C")) return "Intuit QBMS";
        if (bankcardService.getServiceId().equals("7B4DD1300C")) return "First Data BUYPASS";
        if (bankcardService.getServiceId().equals("9461F1300C")) return "Tampa TCS for Canada";
        if (bankcardService.getServiceId().equals("CE4AE1300C")) return "Intuit QBMS Inline Tokenization";
        if (bankcardService.getServiceId().equals("E7DFB1300C")) return "Intuit QBMS No Tokenization";
        if (bankcardService.getServiceId().equals("CAFF61300C")) return "Adaptive Payments";
		if (bankcardService.getServiceId().equals("9999999999")) return "Vantiv FTPS";//NOTE : Placeholder

        return bankcardService.getServiceName();//Match was not found so pass back the name in the service.
    }
    
    public String TranslateServiceIdToFriendlyName(ElectronicCheckingService electronicCheckingService)
    {
        //Sandbox
        if (electronicCheckingService.getServiceId().equals("35A7700001")) return "Affirmative ACH Now";

        //Production
        if (electronicCheckingService.getServiceId().equals("DF29D1300C")) return "Affirmative ACH Now";

        return electronicCheckingService.getServiceName();//Match was not found so pass back the name in the service.
    }
    
    public String TranslateServiceIdToFriendlyName(StoredValueService storedValueService)
    {
        //Sandbox
        if (storedValueService.getServiceId().equals("C58FD00001")) return "Vantiv Stored Value Service";

        //Production
        if (storedValueService.getServiceId().equals("XXXXX1300C")) return "Vantiv Stored Value Service";

        return storedValueService.getServiceId();//Match was not found so pass back the name in the service.
    }

	private void ProcessBankcardTransactionResponse(BankcardTransactionResponsePro _BCResponse, ConfigurationValues _CV) {
		/*
		 * At this point, you'll need to store the response information into
		 * your database. Please refer to the functional requirement as to what
		 * values are required, conditionally required and optional. The values
		 * are broken out logically below and assigned to a string as reference
		 * only.
		 */
		if (_BCResponse.getStatus() == Status.Successful) {// The transaction was approved
			String strSuccessfulResponseValues = "";
			
			_transactionIDs.add(_BCResponse.getTransactionId());
			
			strSuccessfulResponseValues = strSuccessfulResponseValues
					+ "Your transaction was APPROVED"
					// Note Highly recommended to save
					+ "\r\nTransactionId : " + _BCResponse.getTransactionId()
					+ "\r\nProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Highly recommended to save if Tokenization will be used
					+ "\r\nPaymentAccountDataToken : " + _BCResponse.getPaymentAccountDataToken() // If tokenization purchased this field represents the actual token returned in the transaction for future use.
					// Note Optional but recommended to save
					+ "\r\nStatus Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ "\r\nStatus Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					+ "\r\nApprovalCode : " + _BCResponse.getApprovalCode() // A value returned when a transaction is approved. This value should be printed on the receipt, and also recorded for every off-line transaction, such as a voice authorization. This same data element and value must be provided during settlement. Required.
					+ "\r\nAmount : " + _BCResponse.getAmount() // Specifies the authorization amount of the transaction. This is the actual amount authorized.
					;
			if(_BCResponse.getAVSResult() != null)
			{
				strSuccessfulResponseValues = strSuccessfulResponseValues
				//Note Optional but recommended if AVS is supported
				 + "\r\nAVSResult ActualResult : " + _BCResponse.getAVSResult().getActualResult() //Specifies the actual result of AVS from the Service Provider.
				 + "\r\nAVSResult AddressResult : " + _BCResponse.getAVSResult().getAddressResult() //Specifies the result of AVS as it pertains to Address matching
				 + "\r\nAVSResult PostalCodeResult : " + _BCResponse.getAVSResult().getPostalCodeResult()
				 + "\r\nAVSResult CardholderNameResult : " + _BCResponse.getAVSResult().getCardholderNameResult()
				 + "\r\nAVSResult CityResult : " + _BCResponse.getAVSResult().getCityResult()
				 + "\r\nAVSResult CountryResult : " + _BCResponse.getAVSResult().getCountryResult()
				 + "\r\nAVSResult PhoneResult : " + _BCResponse.getAVSResult().getPhoneResult()
				 + "\r\nAVSResult StateResult : " + _BCResponse.getAVSResult().getStateResult()
				 ;	
			}
			strSuccessfulResponseValues = strSuccessfulResponseValues
					//Specifies the result of AVS as it pertains to Postal Code matching
					//Note Optional but recommended if CV data is supported
					+ "\r\nCVResult : "
					+ _BCResponse.getCVResult() // Response code returned by the card issuer indicating the result of Card Verification (CVV2/CVC2/CID).
					// Note Optional
					+ "\r\nBatchId : " + _BCResponse.getBatchId() // A unique ID used to identify a specific batch settlement
					+ "\r\nCardLevel : " + _BCResponse.getCardLevel() 
					+ "\r\nCardType : " + _BCResponse.getCardType()
					+ "\r\nCashBackAmount() : " + _BCResponse.getCashBackAmount()
					+ "\r\nDowngradeCode : " + _BCResponse.getDowngradeCode() // Indicates down grade reason.
					+ "\r\nFeeAmount : " + _BCResponse.getFeeAmount() // Fee amount charged for the transaction.
					+ "\r\nFinalBalance : " + _BCResponse.getFinalBalance()
					+ "\r\nMaskedPAN : " + _BCResponse.getMaskedPAN()
					+ "\r\nOrderId : " + _BCResponse.getOrderId()//The order id generated by CWS. This value is often used by service providers for transaction correlation.
					+ "\r\nResubmit : " + _BCResponse.getResubmit() // Specifies whether resubmission is supported for PIN Debit transactions.
					+ "\r\nServiceTransactionDateTime : " + _BCResponse.getServiceTransactionDateTime().getDate() + " " + _BCResponse.getServiceTransactionDateTime().getTime()
					+ "\r\nServiceTransactionId : " + _BCResponse.getServiceTransactionId()
					//+ "\r\nSettlementDate : " + CalenderToString(_BCResponse.getSettlementDate()) // Settlement date. Conditional, if present in the authorization response, this same data element and value must be provided during settlement
					+ "\r\nAdviceResponse : " + _BCResponse.getAdviceResponse()//Specifies the reason for issuer decline of recurring payment transactions. Optional.
					+ "\r\nCommercialCardResponse : " + _BCResponse.getCommercialCardResponse()//Indicates the status of the card with respect to its ability to utilize purchase card data. When the card is a Business, Corporate, or Purchase card, providing purchase card data can result in improved interchange rates.
					+ "\r\nReturnedACI : " + _BCResponse.getReturnedACI()//Provides information concerning the status of a transaction's CPS qualification.
					;
			System.out.println(strSuccessfulResponseValues);
		}
		if (_BCResponse.getStatus() == Status.Failure) {// The transaction was declined
			String strDeclinedResponseValues = "";
			strDeclinedResponseValues = strDeclinedResponseValues
					+ "Your transaction was DECLINED"
					// NOTE : Please reference the developers guide for a more complete explination of the return fields
					// Note Highly recommended to save
					+ "\r\nTransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\nProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\nStatus Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ "\r\nStatus Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					// Note Optional but recommended if CV data is supported
					+ "\r\nCVResult : " + _BCResponse.getCVResult() // Response code returned by the card issuer indicating the result of Card Verification (CVV2/CVC2/CID).
					// Note Optional
					+ "\r\nServiceTransactionId : " + _BCResponse.getServiceTransactionId()
					;
			System.out.println(strDeclinedResponseValues);
		}
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._bcs.getServiceId());
		}
	}

	private void ProcessBankcardCaptureResponse(BankcardCaptureResponse _BCResponse, ConfigurationValues _CV) {
		/*
		 * At this point, you'll need to store the response information into
		 * your database. Please refer to the functional requirement as to what
		 * values are required, conditionally required and optional. The values
		 * are broken out logically below and assigned to a string as reference
		 * only.
		 */
		if (_BCResponse.getStatus() == Status.Successful) {// The transaction
															// was approved
			String strSuccessfulResponseValues = "";
			strSuccessfulResponseValues = strSuccessfulResponseValues
					+ "Your transaction was APPROVED"
					// Note Highly recommended to save
					+ "\r\n  TransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\n  ProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\n  Status Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ " : Status Message : " + _BCResponse.getStatusMessage(); // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
			
		            //Note Optional data about the batch
		            if (_BCResponse.getBatchId() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\nBatch Id : " + _BCResponse.getBatchId();
		            if (_BCResponse.getTransactionSummaryData().getCashBackTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Cash Back Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getCashBackTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getCashBackTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getNetTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Net Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getNetTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getNetTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getPINDebitReturnTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  PINDebit Return Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getPINDebitReturnTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getPINDebitReturnTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getPINDebitSaleTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  PINDebit Sale Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getPINDebitSaleTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getPINDebitSaleTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getReturnTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Return Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getReturnTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getReturnTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getSaleTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Sale Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getSaleTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getSaleTotals().getNetAmount();
		            if (_BCResponse.getTransactionSummaryData().getVoidTotals() != null) strSuccessfulResponseValues = strSuccessfulResponseValues + "\r\n  Void Totals \r\n    Count : " + _BCResponse.getTransactionSummaryData().getVoidTotals().getCount() + "\r\n    Net Amount : " + _BCResponse.getTransactionSummaryData().getVoidTotals().getNetAmount();
			
			System.out.println(strSuccessfulResponseValues);
		}
		if (_BCResponse.getStatus() == Status.Failure) {// The transaction was declined
			String strDeclinedResponseValues = "";
			strDeclinedResponseValues = strDeclinedResponseValues
					+ "Your transaction was DECLINED"
					// NOTE : Please reference the developers guide for a more
					// complete explination of the return fields
					// Note Highly recommended to save
					+ "\r\n  TransactionId : " + _BCResponse.getTransactionId() // The unique id of the transaction. TransactionId is required for all subsequent transactions such as Return, Undo, etc.
					+ "\r\n  ProfileId : " + _CV._BCPMerchantProfileId // Must be stored with the TransactionId in order to identify which merchant sent which transaction. Required to support multi-merchant.
					// Note Optional but recommended to save
					+ "\r\n  Status Code : " + _BCResponse.getStatusCode() // Status code generated by the Service Provider. This code should be displayed to the user as verification of the transaction.
					+ " : Status Message : " + _BCResponse.getStatusMessage() // Explains the StatusCode which is generated by the Service Provider. This message should be displayed to the user as verification of the transaction.
					// Note Optional
					+ "\r\n  ServiceTransactionId : " + _BCResponse.getServiceTransactionId();
			System.out.println(strDeclinedResponseValues);
		}
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._bcs.getServiceId());
		}
	}

    private void ProcessElectronicCheckingTransactionResponse(ElectronicCheckingTransactionResponse _ECKResponse, ConfigurationValues _CV)
    {

        String strResponseMessage = "";
        
        if (_ECKResponse.getStatus() == Status.Successful)//The transaction was approved
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional data about the batch
            if (_ECKResponse.getACHCapable() != null) strResponseMessage = strResponseMessage + "\r\nACHCapable : " + _ECKResponse.getACHCapable();//Indicates if the customer's account will accept ACH transactions. Returned only on QueryAccount() transactions.
            if (_ECKResponse.getAmount() != null) strResponseMessage = strResponseMessage + "\r\nAmount : " + _ECKResponse.getAmount();
            if (_ECKResponse.getApprovalCode() != null) strResponseMessage = strResponseMessage + "\r\nApprovalCode : " + _ECKResponse.getApprovalCode(); //A code provided when a transaction is approved.
            if (_ECKResponse.getModifiedAccountNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedAccountNumber : " + _ECKResponse.getModifiedAccountNumber(); //Indicates the corrected account number that should be used for electronic check processing
            if (_ECKResponse.getModifiedRoutingNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedRoutingNumber : " + _ECKResponse.getModifiedRoutingNumber(); //Indicates the corrected 9-digit bank routing number that should be used for electronic check processing.
            if (_ECKResponse.getReturnInformation() != null)
            {
                if (_ECKResponse.getReturnInformation().getReturnCode() != null) strResponseMessage = strResponseMessage + "\r\nReturnCode : " + _ECKResponse.getReturnInformation().getReturnCode();//Code that indicates why the transaction was returned.
                if (_ECKResponse.getReturnInformation().getReturnDate() != null) strResponseMessage = strResponseMessage + "\r\nReturnDate : " + _ECKResponse.getReturnInformation().getReturnDate(); //The date the transaction was returned by the bank. 
                if (_ECKResponse.getReturnInformation().getReturnReason() != null) strResponseMessage = strResponseMessage + "\r\nReturnReason : " + _ECKResponse.getReturnInformation().getReturnReason(); //Reason that indicates why the transaction was returned. 
            }
            if (_ECKResponse.getSubmitDate() != null) strResponseMessage = strResponseMessage + "\r\nSubmitDate : " + _ECKResponse.getSubmitDate(); //The date the transaction was submitted to the bank.

            strResponseMessage = "Your transaction was APPROVED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.Failure)//The transaction was declined
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional
            if (_ECKResponse.getACHCapable() != null) strResponseMessage = strResponseMessage + "\r\nACHCapable : " + _ECKResponse.getACHCapable();//Indicates if the customer's account will accept ACH transactions. Returned only on QueryAccount() transactions.
            if (_ECKResponse.getAmount() != null) strResponseMessage = strResponseMessage + "\r\nAmount : " + _ECKResponse.getAmount();
            if (_ECKResponse.getApprovalCode() != null) strResponseMessage = strResponseMessage + "\r\nApprovalCode : " + _ECKResponse.getApprovalCode(); //A code provided when a transaction is approved.
            if (_ECKResponse.getModifiedAccountNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedAccountNumber : " + _ECKResponse.getModifiedAccountNumber(); //Indicates the corrected account number that should be used for electronic check processing
            if (_ECKResponse.getModifiedRoutingNumber() != null) strResponseMessage = strResponseMessage + "\r\nModifiedRoutingNumber : " + _ECKResponse.getModifiedRoutingNumber(); //Indicates the corrected 9-digit bank routing number that should be used for electronic check processing.
            if (_ECKResponse.getReturnInformation() != null)
            {
                if (_ECKResponse.getReturnInformation().getReturnCode() != null) strResponseMessage = strResponseMessage + "\r\nReturnCode : " + _ECKResponse.getReturnInformation().getReturnCode();//Code that indicates why the transaction was returned.
                if (_ECKResponse.getReturnInformation().getReturnDate() != null) strResponseMessage = strResponseMessage + "\r\nReturnDate : " + _ECKResponse.getReturnInformation().getReturnDate(); //The date the transaction was returned by the bank. 
                if (_ECKResponse.getReturnInformation().getReturnReason() != null) strResponseMessage = strResponseMessage + "\r\nReturnReason : " + _ECKResponse.getReturnInformation().getReturnReason(); //Reason that indicates why the transaction was returned. 
            }
            if (_ECKResponse.getSubmitDate() != null) strResponseMessage = strResponseMessage + "\r\nSubmitDate : " + _ECKResponse.getSubmitDate(); //The date the transaction was submitted to the bank.

            strResponseMessage = "Your transaction was DECLINED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.NotSet)//The transaction was declined
        {
            strResponseMessage = "No Transactions found for settlement";
        }
        System.out.println(strResponseMessage);
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._ecks.getServiceId());
		}
    }

    private void ProcessElectronicCheckingCaptureResponse(ElectronicCheckingCaptureResponse _ECKResponse, ConfigurationValues _CV)
    {
         String strResponseMessage = "";

        if (_ECKResponse.getStatus() == Status.Successful)//The transaction was approved
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional data about the batch
            if (_ECKResponse.getSummaryData() != null)
            {
                if (_ECKResponse.getSummaryData().getCreditTotals() != null) strResponseMessage = strResponseMessage + "\r\nCredit Totals \r\n  Count : " + _ECKResponse.getSummaryData().getCreditTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getCreditTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getDebitTotals() != null) strResponseMessage = strResponseMessage + "\r\nDebit Totals \r\n  Count : " + _ECKResponse.getSummaryData().getDebitTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getDebitTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getNetTotals() != null) strResponseMessage = strResponseMessage + "\r\nNet Totals \r\n  Count : " + _ECKResponse.getSummaryData().getNetTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getNetTotals().getNetAmount();
                if (_ECKResponse.getSummaryData().getVoidTotals() != null) strResponseMessage = strResponseMessage + "\r\nVoid Totals \r\n  Count : " + _ECKResponse.getSummaryData().getVoidTotals().getCount() + "\r\n  Net Amount : " + _ECKResponse.getSummaryData().getVoidTotals().getNetAmount();
            }
            strResponseMessage = "Your transaction was APPROVED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.Failure)//The transaction was declined
        {//NOTE : Please reference the developers guide for a more complete explination of the return fields
            //Note Highly recommended to save
            if (_ECKResponse.getTransactionId() != null) strResponseMessage = strResponseMessage + "\r\nTransactionId : " + _ECKResponse.getTransactionId();
            strResponseMessage = strResponseMessage + "\r\nMerchant Profile Id : " + _CV._ECKMerchantProfileId;
            //Note Optional but recommended to save
            if (_ECKResponse.getStatusCode() != null) strResponseMessage = strResponseMessage + "\r\nStatus Code : " + _ECKResponse.getStatusCode();
            if (_ECKResponse.getStatusMessage() != null) strResponseMessage = strResponseMessage + "\r\nStatus Message : " + _ECKResponse.getStatusMessage();
            //Note Optional

            strResponseMessage = "Your transaction was DECLINED" + strResponseMessage;
        }
        if (_ECKResponse.getStatus() == Status.NotSet)//The transaction was declined
        {
            strResponseMessage = "No Transactions found for settlement";
        }
        System.out.println(strResponseMessage);
        
		//Report the serviceID or WorkFlowId used.
		if(_CV._UseWorkFlowId){
			System.out.println("WorkFlowId : " + _CV._WorkFlowId);
		}
		else{
			System.out.println("ServiceId : " + _CV._ecks.getServiceId());
		}
    }

	
    private QueryBatchParameters QBP()
    {
    	
        QueryBatchParameters QBP = new QueryBatchParameters();
        //First set the date range
        DateRange dr = new DateRange();
        Calendar cStart = Calendar.getInstance();
        Calendar cEnd = Calendar.getInstance();
        cStart.getTime();
        cStart.add(Calendar.HOUR, -2);
        cEnd.getTime();
        dr.setStartDateTime(cStart);
        dr.setEndDateTime(cEnd);
        QBP.setBatchDateRange(dr);
  
        //It's possible to filter the search. Not included however for the sake of sample code
        //QBP.setBatchIds(value)
        //QBP.setMerchantProfileIds(value);
        //QBP.setServiceKeys(value;)
        //QBP.setTransactionIds(value);
        
        return QBP;
    }

    private QueryTransactionsParameters QTP(String _TransactionId)
    {
        QueryTransactionsParameters QTP = new QueryTransactionsParameters();
        //char[] splitter = { ',' };

        /* THE FOLLOWING ARE FILTERS THAT COULD BE APPLIED
        if (txtQTP_Amounts.Text.Length > 0)
        {
            List<decimal> Amt = new List<decimal>();
            string[] values = txtQTP_Amounts.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries);
            foreach (string s in values)
            {
                try
                {
                    decimal d = Convert.ToDecimal(s);
                    d = decimal.Parse(d.ToString("0.00"));//Amounts must be in format N.NN
                    Amt.Add(d);
                }
                catch { }
            }
            QTP.Amounts = Amt;
        }

        if (txtQTP_ApprovalCodes.Text.Length > 0)
            QTP.ApprovalCodes = new List<string>(txtQTP_ApprovalCodes.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));
        if (txtQTP_BatchIds.Text.Length > 0)
            QTP.BatchIds = new List<string>(txtQTP_BatchIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        //ToDo : add logic
        //QTP.CaptureDateRange = new DateRange();
        //QTP.CaptureDateRange.StartDateTime = dtpStartTimeTMS.Value.ToUniversalTime();
        //QTP.CaptureDateRange.EndDateTime = dtpEndTimeTMS.Value.ToUniversalTime();

        if (cboQTP_CaptureStates.Text.Length > 0)
        {
            List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState> TS = new List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState>();
            TS.Add((schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.CaptureState)cboQTP_CaptureStates.SelectedItem);
            QTP.CaptureStates = TS;
        }

        if (cboQTP_CardTypes.Text.Length > 0)
        {
            List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType> TS = new List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType>();
            TS.Add((schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TypeCardType)cboQTP_CardTypes.SelectedItem);
            QTP.CardTypes = TS;
        }

        if (cboQTP_IsAcknowledged.Text.Length > 0)
            QTP.IsAcknowledged = (BooleanParameter)cboQTP_IsAcknowledged.SelectedItem;

        if (txtQTP_MerchantProfileIds.Text.Length > 0)
            QTP.MerchantProfileIds = new List<string>(txtQTP_MerchantProfileIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        if (cboQTP_QueryType.Text.Length > 0)
            QTP.QueryType = (QueryType)cboQTP_QueryType.SelectedItem;

        if (txtQTP_ServiceIds.Text.Length > 0)
            QTP.ServiceIds = new List<string>(txtQTP_ServiceIds.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        if (txtQTP_ServiceKeys.Text.Length > 0)
            QTP.ServiceKeys = new List<string>(txtQTP_ServiceKeys.Text.Split(splitter, StringSplitOptions.RemoveEmptyEntries));

        //ToDo : add logic
        if (txtQTP_TransactionClassTypePairs.Text.Length > 0)
        {
            List<TransactionClassTypePair> TCTP = new List<TransactionClassTypePair>();
            TCTP.Add(new TransactionClassTypePair());
            QTP.TransactionClassTypePairs = TCTP;
        }
*/
        ////Specify batch paramaters
        //First set the date range
        DateRange dr = new DateRange();
        Calendar cStart = Calendar.getInstance();
        Calendar cEnd = Calendar.getInstance();
        cStart.getTime();
        cStart.add(Calendar.HOUR, -2);
        cEnd.getTime();
        dr.setStartDateTime(cStart);
        dr.setEndDateTime(cEnd);
        QTP.setTransactionDateRange(dr);

        if (_TransactionId.length() > 0)
        {       
        	ArrayList<String> AOS = new ArrayList<String>();
        	AOS.add(_TransactionId);
        	QTP.setTransactionIds(AOS.toArray(new String[AOS.size()]));
        }
            

            /*
        if (cboQTP_TransactionStates.Text.Length > 0)
        {
            List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState> TS = new List<schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState>();
            TS.Add((schemas.ipcommerce.com.Ipc.General.WCF.Contracts.Common.External.TMS.TransactionState)cboQTP_TransactionStates.SelectedItem);
            QTP.TransactionStates = TS;
        }

*/
        return QTP;
    }

    private PagingParameters PP()
    {
        //Specify Paging Parameters
        PagingParameters PP = new PagingParameters();
        PP.setPage(0);//Note : this is a zero based value. So page 1 is 0
        PP.setPageSize(50);

        return PP;
    }
    
    private String CalenderToString(Calendar c)
    {
    	String returnVal = "";
    	returnVal = (c == null ? "[Not Available]" : c.getTime().toGMTString()+"(UTC)");
    	return returnVal;
    }
    
    ///Process TMS response

    private String processQueryBatchResponse(List<BatchDetailData> _BDD)
    {
    	String strSummary = "";
        if (_BDD.size() > 0)
        {        	
            int i = 1;

			for (BatchDetailData b : _BDD)
            {				
                //Batch Summary
                strSummary = strSummary + "Batch Summary # " + i + "\r\n";
                strSummary = strSummary + "BatchCaptureDate : " + CalenderToString(b.getBatchCaptureDate()) + "\r\n";
                strSummary = strSummary + "BatchId : " + b.getBatchId() + "\r\n";
                strSummary = strSummary + "Description : " + b.getDescription() + "\r\n";
                //Batch Summary Data
                strSummary = strSummary + "Batch Summary Data";
                if (b.getBatchSummaryData().getCashBackTotals() != null) strSummary = strSummary + "\r\nCash Back Totals \r\n  Count : " + b.getBatchSummaryData().getCashBackTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getCashBackTotals().getNetAmount();
                if (b.getBatchSummaryData().getNetTotals() != null) strSummary = strSummary + "\r\nNet Totals \r\n  Count : " + b.getBatchSummaryData().getNetTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getNetTotals().getNetAmount();
                if (b.getBatchSummaryData().getPINDebitReturnTotals() != null) strSummary = strSummary + "\r\nPINDebit Return Totals \r\n  Count : " + b.getBatchSummaryData().getPINDebitReturnTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getPINDebitReturnTotals().getNetAmount();
                if (b.getBatchSummaryData().getPINDebitSaleTotals() != null) strSummary = strSummary + "\r\nPINDebit Sale Totals \r\n  Count : " + b.getBatchSummaryData().getPINDebitSaleTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getPINDebitSaleTotals().getNetAmount();
                if (b.getBatchSummaryData().getReturnTotals() != null) strSummary = strSummary + "\r\nReturn Totals \r\n  Count : " + b.getBatchSummaryData().getReturnTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getReturnTotals().getNetAmount();
                if (b.getBatchSummaryData().getSaleTotals() != null) strSummary = strSummary + "\r\nSale Totals \r\n  Count : " + b.getBatchSummaryData().getSaleTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getSaleTotals().getNetAmount();
                if (b.getBatchSummaryData().getVoidTotals() != null) strSummary = strSummary + "\r\nVoid Totals \r\n  Count : " + b.getBatchSummaryData().getVoidTotals().getCount() + "\r\n  Net Amount : " + b.getBatchSummaryData().getVoidTotals().getNetAmount();
                
                //TransactionId
                strSummary = strSummary + "\r\nList of TransactionIds\r\n";
                if(b.getTransactionIds() != null)
                {                   	
                	for (String txnid : b.getTransactionIds())
                    {
                        strSummary = strSummary + txnid + "\r\n";
                    }
                }
                i++;
            }
        }

        return strSummary;
    }
    

    private String processQueryTransactionSummaryResponse(List<SummaryDetail> _SD)
    {
    	String strSummary = "";
        if (_SD.size() > 0)
        {
            int i = 1;
            for (SummaryDetail s : _SD)
            {
                //Family Information
                strSummary = strSummary + "Transaction # " + i + "\r\nFamily Information\r\n";
                strSummary = strSummary + "FamilyId : " + s.getFamilyInformation().getFamilyId() + "\r\n";
                strSummary = strSummary + "FamilySequenceCount : " + s.getFamilyInformation().getFamilySequenceCount() + "\r\n";
                strSummary = strSummary + "FamilySequenceNumber : " + s.getFamilyInformation().getFamilySequenceNumber() + "\r\n";
                strSummary = strSummary + "FamilyState : " + s.getFamilyInformation().getFamilyState() + "\r\n";
                //Transaction Information
                strSummary = strSummary + "Transaction Information\r\n";
                strSummary = strSummary + "Amount : " + s.getTransactionInformation().getAmount() + "\r\n";
                strSummary = strSummary + "ApprovalCode : " + s.getTransactionInformation().getApprovalCode() + "\r\n";
                if ( s.getTransactionInformation().getBankcardData().getAVSResult() != null)
                {
                	strSummary = strSummary + "AVS-ActualResult : " + s.getTransactionInformation().getBankcardData().getAVSResult().getActualResult() + "\r\n";
                    strSummary = strSummary + "AVS-AddressResult : " + s.getTransactionInformation().getBankcardData().getAVSResult().getAddressResult() + "\r\n";
                    strSummary = strSummary + "AVS-PostalCodeResult: " + s.getTransactionInformation().getBankcardData().getAVSResult().getPostalCodeResult() + "\r\n";
                }
                strSummary = strSummary + "BatchId : " + s.getTransactionInformation().getBatchId() + "\r\n";
                strSummary = strSummary + "CaptureDateTime : " + CalenderToString(s.getTransactionInformation().getCaptureDateTime()) + "\r\n";
                strSummary = strSummary + "CaptureState : " + s.getTransactionInformation().getCaptureState() + "\r\n";
                strSummary = strSummary + "CardType : " + s.getTransactionInformation().getBankcardData().getCardType() + "\r\n";
                strSummary = strSummary + "CustomerId : " + s.getTransactionInformation().getCustomerId() + "\r\n";
                strSummary = strSummary + "CVResult : " + s.getTransactionInformation().getBankcardData().getCVResult() + "\r\n";
                strSummary = strSummary + "IsAcknowledged : " + s.getTransactionInformation().getIsAcknowledged() + "\r\n";
                strSummary = strSummary + "MaskedPAN : " + s.getTransactionInformation().getMaskedPAN() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + s.getTransactionInformation().getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "OriginatorTransactionId : " + s.getTransactionInformation().getOriginatorTransactionId() + "\r\n";
                strSummary = strSummary + "ServiceId : " + s.getTransactionInformation().getServiceId() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + s.getTransactionInformation().getServiceKey() + "\r\n";
                strSummary = strSummary + "ServiceTransactionId : " + s.getTransactionInformation().getServiceTransactionId() + "\r\n";
                strSummary = strSummary + "Status : " + s.getTransactionInformation().getStatus() + "\r\n";
                strSummary = strSummary + "TransactionClassTypePair : " + "\r\n  Class:" + s.getTransactionInformation().getTransactionClassTypePair().getTransactionClass() + "\r\n  Type:" + s.getTransactionInformation().getTransactionClassTypePair().getTransactionType()+ "\r\n";
                strSummary = strSummary + "TransactionId : " + s.getTransactionInformation().getTransactionId() + "\r\n";
                strSummary = strSummary + "TransactionState : " + s.getTransactionInformation().getTransactionState() + "\r\n";
                strSummary = strSummary + "TransactionStatusCode : " + s.getTransactionInformation().getTransactionStatusCode() + "\r\n";
                strSummary = strSummary + "TransactionTimestamp : " + CalenderToString(s.getTransactionInformation().getTransactionTimestamp()) + "\r\n";
                strSummary = strSummary + "\r\n";
                i++;
            }
        }
        return strSummary;
    }
    

    private String processQueryTransactionFamiliesResponse(List<FamilyDetail> _FD)
    {
        String strSummary = "";
        if (_FD.size() > 0)
        {
            int i = 1;
            for (FamilyDetail f : _FD)
            {
                //Family Summary
                strSummary = strSummary + "Family Summary # " + i + "\r\n";
                strSummary = strSummary + "FamilyId : " + f.getFamilyId() + "\r\n";
                strSummary = strSummary + "FamilyState : " + f.getFamilyState() + "\r\n";
                strSummary = strSummary + "LastAuthorizedAmount : " + f.getLastAuthorizedAmount() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + f.getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "NetAmount : " + f.getNetAmount() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + f.getServiceKey() + "\r\n";

                //TransactionId
                strSummary = strSummary + "List of TransactionIds\r\n";
                for (String txnid : f.getTransactionIds())
                {
                    strSummary = strSummary + txnid + "\r\n";
                }
                i++;
            }
        }
        return strSummary;
    }
    

    private String processQueryTransactionsDetailResponse(List<TransactionDetail> _TD)
    {
        String strSummary = "";
        if (_TD.size() > 0)
        {
            int i = 1;
            for (TransactionDetail t : _TD)
            {
                //Batch Summary
                strSummary = strSummary + "Transaction # " + i + "\r\n";
                strSummary = strSummary + "CompleteTransaction CWS object : " + t.getCompleteTransaction().getCWSTransaction() + "\r\n";
                strSummary = strSummary + (t.getCompleteTransaction().getSerializedTransaction() == null ? "CompleteTransaction Serialized : NOT AVAILABLE\r\n" : "CompleteTransaction Serialized : " + t.getCompleteTransaction().getSerializedTransaction() + "\r\n");
                //Family Information
                strSummary = strSummary + "Family Information \r\n";
                strSummary = strSummary + "FamilyId : " + t.getFamilyInformation().getFamilyId() + "\r\n";
                strSummary = strSummary + "FamilySequenceCount : " + t.getFamilyInformation().getFamilySequenceCount() + "\r\n";
                strSummary = strSummary + "FamilySequenceNumber : " + t.getFamilyInformation().getFamilySequenceNumber() + "\r\n";
                strSummary = strSummary + "FamilyState : " + t.getFamilyInformation().getFamilyState() + "\r\n";
                //Transaction Information
                strSummary = strSummary + "Transaction Information\r\n";
                strSummary = strSummary + "Amount : " + t.getTransactionInformation().getAmount() + "\r\n";
                strSummary = strSummary + "ApprovalCode : " + t.getTransactionInformation().getApprovalCode() + "\r\n";
                if ( t.getTransactionInformation().getBankcardData().getAVSResult() != null)
                {                	
                	strSummary = strSummary + "AVS ActualResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getActualResult() + "\r\n";
                	strSummary = strSummary + "AVS AddressResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getAddressResult() + "\r\n";
                	strSummary = strSummary + "AVS PostalCodeResult : " + t.getTransactionInformation().getBankcardData().getAVSResult().getPostalCodeResult() + "\r\n";
                }
                strSummary = strSummary + "BatchId : " + t.getTransactionInformation().getBatchId() + "\r\n";
                strSummary = strSummary + "CaptureDateTime : " + CalenderToString(t.getTransactionInformation().getCaptureDateTime()) + "\r\n";
                strSummary = strSummary + "CaptureState : " + t.getTransactionInformation().getCaptureState() + "\r\n";
                strSummary = strSummary + "CardType : " + t.getTransactionInformation().getBankcardData().getCardType() + "\r\n";
                strSummary = strSummary + "CustomerId : " + t.getTransactionInformation().getCustomerId() + "\r\n";
                strSummary = strSummary + "CVResult : " + t.getTransactionInformation().getBankcardData().getCVResult() + "\r\n";
                strSummary = strSummary + "IsAcknowledged : " + t.getTransactionInformation().getIsAcknowledged() + "\r\n";
                strSummary = strSummary + "MaskedPAN : " + t.getTransactionInformation().getMaskedPAN() + "\r\n";
                strSummary = strSummary + "MerchantProfileId : " + t.getTransactionInformation().getMerchantProfileId() + "\r\n";
                strSummary = strSummary + "OriginatorTransactionId : " + t.getTransactionInformation().getOriginatorTransactionId() + "\r\n";
                strSummary = strSummary + "ServiceId : " + t.getTransactionInformation().getServiceId() + "\r\n";
                strSummary = strSummary + "ServiceKey : " + t.getTransactionInformation().getServiceKey() + "\r\n";
                strSummary = strSummary + "ServiceTransactionId : " + t.getTransactionInformation().getServiceTransactionId() + "\r\n";
                strSummary = strSummary + "Status : " + t.getTransactionInformation().getStatus() + "\r\n";
                strSummary = strSummary + "TransactionClassTypePair : " + "\r\n  Class:" + t.getTransactionInformation().getTransactionClassTypePair().getTransactionClass() + "\r\n  Type:" + t.getTransactionInformation().getTransactionClassTypePair().getTransactionType()+ "\r\n";
                strSummary = strSummary + "TransactionId : " + t.getTransactionInformation().getTransactionId() + "\r\n";
                strSummary = strSummary + "TransactionState : " + t.getTransactionInformation().getTransactionState() + "\r\n";
                strSummary = strSummary + "TransactionStatusCode : " + t.getTransactionInformation().getTransactionStatusCode() + "\r\n";
                strSummary = strSummary + "TransactionTimestamp : " + CalenderToString(t.getTransactionInformation().getTransactionTimestamp()) + "\r\n";
                strSummary = strSummary + "\r\n";
                i++;
            }
        }
        return strSummary;
    }
    
    
    ///END Process TMS response
}
