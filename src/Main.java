import java.rmi.RemoteException;
import java.util.Calendar;

import SampleApplication.ConfigurationValues;

import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationData;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ApplicationLocation;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.EncryptionType;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.HardwareType;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformation;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformationProxy;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.PINCapability;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ReadCapability;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSFault;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSServiceInformationUnavailableFault;
import com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.Faults.CWSValidationResultFault;
import com.ipcommerce.schemas.Identity._1_0.AuthenticationFault;
import com.ipcommerce.schemas.Identity._1_0.ExpiredTokenFault;
import com.ipcommerce.schemas.Identity._1_0.InvalidTokenFault;
import com.ipcommerce.schemas.Identity._1_0.STSUnavailableFault;


public class Main {
	public static void main(String [ ] args)
	{
		SampleApp SA = new SampleApp();
		ConfigurationValues CV = new ConfigurationValues();
		/* 
		 * Preparing the application to transact
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/PreparingTheAppToTransact/index.aspx
		 * Note : The following steps should be performed during the initial setup of the application.
		 * The results of the following steps will be an ApplicationProfileId, ServiceId and MerchantProfileId.
		 * These values should be persisted/cached and use for Transaction Processing. The persistence/caching should be treated similar Administrator user credentials. 

		 * Service Information produces Three configuration values that if already obtained should bypass the 
		 * Service information steps. To simulate this behavior, if you provide the values below the Service 
		 * Information steps are skipped. 
		 * 
		*/ 
		CV._ApplicationProfileId = "";//If you provide a value this step will be skipped
		CV._BCPServiceId = "";//If you provide a getServiceInformation will attempt to match from the services returned for BankcardService
		CV._ECKServiceId = "";//If you provide a getServiceInformation will attempt to match from the services returned for ElectronicCheckingService
		CV._BCPMerchantProfileId = "";//If you provide a value this step will attempt to match from the services returned for BankcardService
		CV._ECKMerchantProfileId = "";//If you provide a value this step will attempt to match from the services returned for ElectronicCheckingService
		CV._WorkFlowId = "";//For workflows like ReD or Magensa set this value to the proper workflowId
		CV._UseWorkFlowId = false;//Trigger to use the workflowId in place of the Serviceid
		//The following service does incur additional fees. Please contact your sales representative
		CV._UseTMS = true;//Transaction Management Services (TMS) - Query transactions that have process through the application
		
		/*
		 * Step 1 - Let's first get a Security Token from the Service Key and Identity token provided in the Integration Recommendation. 
		 * Note that step 1 is necessary for both Service Information as well as Transaction Processing. The session token returned is 
		 * valid for up to 30 minutes. We recommend that your application obtains a new session token if older than 25 minutes. 
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/PreparingTheAppToTransact/SignOnAuthentication/SignOnWithToken.aspx
		*/

		String identityToken = "PHNhbWw6QXNzZXJ0aW9uIE1ham9yVmVyc2lvbj0iMSIgTWlub3JWZXJzaW9uPSIxIiBBc3NlcnRpb25JRD0iXzUwODA0Mjc1LTFjMzQtNDcyYS05ZDUwLTlmMjUxOTA0N2FkZSIgSXNzdWVyPSJJcGNBdXRoZW50aWNhdGlvbiIgSXNzdWVJbnN0YW50PSIyMDE0LTA1LTMwVDIwOjE0OjI4LjkzNloiIHhtbG5zOnNhbWw9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjEuMDphc3NlcnRpb24iPjxzYW1sOkNvbmRpdGlvbnMgTm90QmVmb3JlPSIyMDE0LTA1LTMwVDIwOjE0OjI4LjkzNloiIE5vdE9uT3JBZnRlcj0iMjAxNy0wNS0zMFQyMDoxNDoyOC45MzZaIj48L3NhbWw6Q29uZGl0aW9ucz48c2FtbDpBZHZpY2U+PC9zYW1sOkFkdmljZT48c2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PHNhbWw6U3ViamVjdD48c2FtbDpOYW1lSWRlbnRpZmllcj5CREI4MTgxQUQ4QzAwMDAxPC9zYW1sOk5hbWVJZGVudGlmaWVyPjwvc2FtbDpTdWJqZWN0PjxzYW1sOkF0dHJpYnV0ZSBBdHRyaWJ1dGVOYW1lPSJTQUsiIEF0dHJpYnV0ZU5hbWVzcGFjZT0iaHR0cDovL3NjaGVtYXMuaXBjb21tZXJjZS5jb20vSWRlbnRpdHkiPjxzYW1sOkF0dHJpYnV0ZVZhbHVlPkJEQjgxODFBRDhDMDAwMDE8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0iU2VyaWFsIiBBdHRyaWJ1dGVOYW1lc3BhY2U9Imh0dHA6Ly9zY2hlbWFzLmlwY29tbWVyY2UuY29tL0lkZW50aXR5Ij48c2FtbDpBdHRyaWJ1dGVWYWx1ZT4zMDFmNTUxNC1lZjNiLTQzZWYtOTc2Mi0wNWNhZDVhMDk1Mjc8L3NhbWw6QXR0cmlidXRlVmFsdWU+PC9zYW1sOkF0dHJpYnV0ZT48c2FtbDpBdHRyaWJ1dGUgQXR0cmlidXRlTmFtZT0ibmFtZSIgQXR0cmlidXRlTmFtZXNwYWNlPSJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcyI+PHNhbWw6QXR0cmlidXRlVmFsdWU+QkRCODE4MUFEOEMwMDAwMTwvc2FtbDpBdHRyaWJ1dGVWYWx1ZT48L3NhbWw6QXR0cmlidXRlPjwvc2FtbDpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PFNpZ25hdHVyZSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFNpZ25lZEluZm8+PENhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiPjwvQ2Fub25pY2FsaXphdGlvbk1ldGhvZD48U2lnbmF0dXJlTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI3JzYS1zaGExIj48L1NpZ25hdHVyZU1ldGhvZD48UmVmZXJlbmNlIFVSST0iI181MDgwNDI3NS0xYzM0LTQ3MmEtOWQ1MC05ZjI1MTkwNDdhZGUiPjxUcmFuc2Zvcm1zPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSI+PC9UcmFuc2Zvcm0+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyI+PC9UcmFuc2Zvcm0+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjc2hhMSI+PC9EaWdlc3RNZXRob2Q+PERpZ2VzdFZhbHVlPnNzSGtjK1NSK053NWFkTVBZT1Z4SWFDN1hXbz08L0RpZ2VzdFZhbHVlPjwvUmVmZXJlbmNlPjwvU2lnbmVkSW5mbz48U2lnbmF0dXJlVmFsdWU+QVBlZys3S3BRR1EwdW1ReW9qM0g1Vlo0RkcrSVVrQ0VmZGgxTkNTVnVyeXpuTUM1eG1HRnA3bHlkTy9uSUJoTVVMMUhaYWkwSnpWbGtBYTBFSXRnWU5Va1NSalg5QmEvNVZ0b05aRWhBSXp6bHpYZ2o0L0swQUxZRHNvZ0lYUnBPRTlEd1JMSE5PUGtWM3JSOWtKOVJzVDNBSFZEZGVlNTVHQTh0d2U3eW1HYXd4azRLSHpWZWF0Y3o1RkUvVUpObm5Id05qMTdESlkvU1JuWXVaQVVXQlhpN2NWdDJlU2pPNFIvVzR0VjhYWXhnNWp2c1RHVXBaMlBSdGNOek4xQnJ3Ky9xT3Z3QmEzQXIxRmlyWVlqaTZ0aTFtaU03a0RIKzNPeTBwWndqZkxNU2VhbStMdEVkK3pyWDRxMHcwYm52RFNxM3FHV3hreUlUOTc3eDZnWmRnPT08L1NpZ25hdHVyZVZhbHVlPjxLZXlJbmZvPjxvOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2UgeG1sbnM6bz0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzLzIwMDQvMDEvb2FzaXMtMjAwNDAxLXdzcy13c3NlY3VyaXR5LXNlY2V4dC0xLjAueHNkIj48bzpLZXlJZGVudGlmaWVyIFZhbHVlVHlwZT0iaHR0cDovL2RvY3Mub2FzaXMtb3Blbi5vcmcvd3NzL29hc2lzLXdzcy1zb2FwLW1lc3NhZ2Utc2VjdXJpdHktMS4xI1RodW1icHJpbnRTSEExIj5IY2cvdDBCSE1hSFdWeGs4c3EvelF5NHpySmc9PC9vOktleUlkZW50aWZpZXI+PC9vOlNlY3VyaXR5VG9rZW5SZWZlcmVuY2U+PC9LZXlJbmZvPjwvU2lnbmF0dXJlPjwvc2FtbDpBc3NlcnRpb24+";
		String _PTLSSocketId = "MIIFCzCCA/OgAwIBAgICAoEwDQYJKoZIhvcNAQEFBQAwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb20wHhcNMTMwODI2MTcxMDI3WhcNMjMwODI0MTcxMDI3WjCBjDELMAkGA1UEBhMCVVMxETAPBgNVBAgTCENvbG9yYWRvMQ8wDQYDVQQHEwZEZW52ZXIxGjAYBgNVBAoTEUlQIENvbW1lcmNlLCBJbmMuMT0wOwYDVQQDEzR0ZHNwM25TZ0FJQUFBUDhBSCtDWUFBQUVBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtn6ILI78EaOLcWrmI9RZf8Vj+3P/WcrDLimSyJJH/8LnIBbXNkiKcZSMg/KHqNLAtq/ncYqZcicgAfaoSbj9FxKGIXTDEICriv/i8sQIGFhIwW/V6H02E8SpWjdCQO9EUUaFPUVMhHfiabwJ3B0VODsQfVuG7mbrAvD/wAqiUVR2Q0rpgHkToCkytdhMlkXiFtnfy4nnoFnI6c5cmsQU7AZgI6Zr08pDMN9y3uSRGSJIzdcTohBA1qb8C4+ZVRCmwCfQZiBHxjC8c5DTiGlPQVEDfRjKXm6ffqBKCttX7qCeB0s57iob0Q7ucz8NfoWtY8dZVzMhYH8obU/dSXaZ6wIDAQABo4IBTjCCAUowCQYDVR0TBAIwADAdBgNVHQ4EFgQUJ64+T3k9d5nWfplPlxVZsN382XUwgeYGA1UdIwSB3jCB24AU3+ASnJQimuunAZqQDgNcnO2HuHShgbekgbQwgbExNDAyBgNVBAMTK0lQIFBheW1lbnRzIEZyYW1ld29yayBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxCzAJBgNVBAYTAlVTMREwDwYDVQQIEwhDb2xvcmFkbzEPMA0GA1UEBxMGRGVudmVyMRowGAYDVQQKExFJUCBDb21tZXJjZSwgSW5jLjEsMCoGCSqGSIb3DQEJARYdYWRtaW5AaXBwYXltZW50c2ZyYW1ld29yay5jb22CCQD/yDY5hYVsVzA1BgNVHR8ELjAsMCqgKKAmhiRodHRwOi8vY3JsLmlwY29tbWVyY2UuY29tL2NhLWNybC5jcmwwDQYJKoZIhvcNAQEFBQADggEBAJrku2QD0T/0aT+jfFJA947Vf7Vu/6S1OxUGhMipx6z/izXZ+o4fK/Nsg0G39KvfxippFG/3MUo621dwXwtqq9SM72zy9ry9E0ptmEiG8X8bSVOyGj4MqyExCPs9LgloV5GgewqYRgq2hmbXOv8Gw7EeXGCfnQ+eROxGu1+p3ZWUnGMQnBbayg43npcHYfyLFHOzd57pj6ncYoxY3kun5GLMLr6tJXKpPNvbM5lAOzcAmKviPMCM2T53UzJlsRdVvCbnkrc5cYqN4l01elqr3MSsj6BJ+JqIqViFrYYkD34THKO8c+wZGb8IN+NJAVre9YOvt5+Cvbbd5ik0UQ+YQNM=";
		ICWSServiceInformationProxy sis = new ICWSServiceInformationProxy("https://api.dev.nabcommerce.com/2.0.18/SvcInfo");
	    com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformationProxy CWSSIC = new  com.ipcommerce.schemas.CWS.v2_0.ServiceInformation.ICWSServiceInformationProxy();
		
		try {
			// SignOn
			String sessionToken = sis.signOnWithToken(identityToken);
			CV._SessionToken = sessionToken;
			System.out.println(sessionToken);
			// SaveApplicationData
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Step 2 - If this is the first time running the application, you need to save application 
		 * and retrieve an applicationProfileId used in transacting.
		 * https://mylab.ipcommerce.com/Docs/TransactionProcessing/CWS/SOAP_Developer_Guide/2.0.17/Implementation/PreparingTheAppToTransact/ManagingAppConfigData/SaveApplicationData.aspx
		*/
		//checkTokenExpire(sessionToken);// Always verify that the session token has not expired.

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
		try {
			SADR = CWSSIC.saveApplicationData(CV._SessionToken, AD);
		} catch (CWSFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExpiredTokenFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticationFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidTokenFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CWSServiceInformationUnavailableFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CWSValidationResultFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CV._ApplicationProfileId = SADR;


	System.out.println("Successfully Obtained an ApplicationProfileId " + CV._ApplicationProfileId + "\r\n\r\n");
	
	}
	
}
