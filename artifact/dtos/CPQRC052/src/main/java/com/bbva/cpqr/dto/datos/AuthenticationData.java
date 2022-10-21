package com.bbva.cpqr.dto.datos;

import java.util.Arrays;
import java.util.List;

public class AuthenticationData {
    private String idAuthenticationData;
    private String[] authenticationData;

    public String getIdAuthenticationData() {
        return idAuthenticationData;
    }

    public void setIdAuthenticationData(String idAuthenticationData) {
        this.idAuthenticationData = idAuthenticationData;
    }

    public String[] getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(List<String> authenticationData) {
        this.authenticationData = authenticationData.toArray(new String[0]);
    }

    @Override
    public String toString() {
        return "AuthenticationData{" +
                "idAuthenticationData='" + idAuthenticationData + '\'' +
                ", authenticationData=" + Arrays.toString(authenticationData) +
                '}';
    }
}
