package com.mastertech.empresaconsumercnpj.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GovernoClientDto {

    @JsonProperty("capital_social")
    private String capital;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
