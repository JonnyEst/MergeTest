package com.bbva.cpqr.dto.datos;

public class OutAutehenticationGranting {

    private OutAuthentication outAuthentication;

    public OutAuthentication getOutAuthentication() {
        return outAuthentication;
    }

    public void setOutAuthentication(OutAuthentication outAuthentication) {
        this.outAuthentication = outAuthentication;
    }

    @Override
    public String toString() {
        return "OutAutehenticationGranting{" +
                "outAuthentication=" + outAuthentication +
                '}';
    }
}
