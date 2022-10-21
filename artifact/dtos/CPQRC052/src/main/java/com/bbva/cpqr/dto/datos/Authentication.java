package com.bbva.cpqr.dto.datos;

import java.util.List;

public class Authentication {

    private String userID;
    private String consumerID;
    private String authenticationType;
    private List<AuthenticationData> authenticationData;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(String consumerID) {
        this.consumerID = consumerID;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public List<AuthenticationData> getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(List<AuthenticationData> authenticationData) {
        this.authenticationData = authenticationData;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "userID='" + userID + '\'' +
                ", consumerID='" + consumerID + '\'' +
                ", authenticationType='" + authenticationType + '\'' +
                ", authenticationData=" + authenticationData +
                '}';
    }
}
