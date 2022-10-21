package com.bbva.cpqr.dto.datos;

public class BackendUserRequest {

    private String userId;
    private String accessCode;
    private String dialogId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getDialogId() {
        return dialogId;
    }

    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    @Override
    public String toString() {
        return "BackendUserRequest{" +
                "userId='" + userId + '\'' +
                ", accessCode='" + accessCode + '\'' +
                ", dialogId='" + dialogId + '\'' +
                '}';
    }
}
