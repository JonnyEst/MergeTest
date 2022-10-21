package com.bbva.cpqr.batch.mock;

import com.bbva.cpqr.dto.datos.*;
import com.bbva.cpqr.lib.r052.CPQRR052;

import java.util.ArrayList;
import java.util.List;

public class CPQRR052Mock implements CPQRR052 {

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

        authentication.setUserID("ZM12038");
        authentication.setConsumerID(consumerId);
        authentication.setAuthenticationType("04");
        authentication.setAuthenticationData(authenticationDataV1);

        GrantingTicket grantingTicket = new GrantingTicket();

        grantingTicket.setAuthentication(authentication);

        return grantingTicket;
    }

    @Override
    public OutAutehenticationGranting OutExecute(GrantingTicket grantingTicket) {

        OutAuthentication outAuthentication = new OutAuthentication();
        outAuthentication.setAuthenticationState("FAILED");

        OutAutehenticationGranting outAutehenticationGranting = new OutAutehenticationGranting();
        outAutehenticationGranting.setOutAuthentication(outAuthentication);

        return outAutehenticationGranting;
    }
}
