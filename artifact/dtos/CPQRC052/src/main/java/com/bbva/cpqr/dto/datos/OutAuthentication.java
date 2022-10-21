package com.bbva.cpqr.dto.datos;

import java.util.Arrays;

public class OutAuthentication {

    private String authenticationState;
    private String[] authenticationData;

    public String getAuthenticationState() {
        return authenticationState;
    }

    public void setAuthenticationState(String authenticationState) {
        this.authenticationState = authenticationState;
    }

    public String[] getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(String[] authenticationData) {
        this.authenticationData = authenticationData;
    }

    @Override
    public String toString() {
        return "OutAuthentication{" +
                "authenticationState='" + authenticationState + '\'' +
                ", authenticationData=" + Arrays.toString(authenticationData) +
                '}';
    }
}
