package com.bbva.cpqr.lib.r052.impl;

import com.bbva.apx.exception.business.BusinessException;
import com.bbva.cpqr.dto.datos.Authentication;
import com.bbva.cpqr.dto.datos.AuthenticationData;
import com.bbva.cpqr.dto.datos.GrantingTicket;
import com.bbva.cpqr.dto.datos.OutAutehenticationGranting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.List;

/**
 * The CPQRR052Impl class...
 */
public class CPQRR052Impl extends CPQRR052Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPQRR052Impl.class);
	private static final String POST_CPQR_TOKEN_ACCESS_PROPERTY_URL = "https://asodev.openmarket.bbva.com.co/cptv_sv/TechArchitecture/co/grantingTicket/V02";


	/**
	 * The execute method...
	 */
	@Override
		public GrantingTicket execute(String consumerId, String idAuthenticationData) {


		AuthenticationData authenticationData = new AuthenticationData();
		List<String> lstIdAuthentication = new ArrayList<>();

		lstIdAuthentication.add(idAuthenticationData);

		authenticationData.setIdAuthenticationData("password");
		authenticationData.setAuthenticationData(lstIdAuthentication);

		Authentication authentication = new Authentication();

		List<AuthenticationData> authenticationDataV1 = new ArrayList<>();
		authenticationDataV1.add(authenticationData);

		GrantingTicket grantingTicket = new GrantingTicket();

		//authentication.setUserID("ZM12038");
		authentication.setUserID(escrituraUserID(grantingTicket));
		authentication.setConsumerID(consumerId);
		authentication.setAuthenticationType("04");
		authentication.setAuthenticationData(authenticationDataV1);



		grantingTicket.setAuthentication(authentication);

		return grantingTicket;
	}

	@Override
	public OutAutehenticationGranting OutExecute(GrantingTicket grantingTicket) {

		OutAutehenticationGranting outAutehenticationGranting = new OutAutehenticationGranting();

		try {
			ResponseEntity<OutAutehenticationGranting> responseService =
					this.internalApiConnector.postForEntity(
							POST_CPQR_TOKEN_ACCESS_PROPERTY_URL,
							grantingTicket,
							OutAutehenticationGranting.class);

			if (responseService != null) {
				//LOGGER.debug(LOGGER_STATUS_CODE, responseService.getStatusCode());
				LOGGER.debug("LOGGER_BODY_RESPONSE", responseService.getBody());
				outAutehenticationGranting = responseService.getBody();
			}
		} catch(RestClientException ex) {
			LOGGER.info("LOGGER_REST_CLIENT_EXCEPTION", ex.getMessage());
		} catch(BusinessException ex) {
			LOGGER.info("LOGGER_BUSINESS_EXCEPTION", ex.getMessage());
		}
		return outAutehenticationGranting;
	}

	public String escrituraUserID(GrantingTicket grantingTicket){
		String userId=grantingTicket.getAuthentication().getUserID();
		String resultUserID= "ZM"+userId.substring(0,2)+userId.substring(6,8);
		return resultUserID;
	}

}
