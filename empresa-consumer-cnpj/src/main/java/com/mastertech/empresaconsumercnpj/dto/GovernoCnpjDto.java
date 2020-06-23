package com.mastertech.empresaconsumercnpj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GovernoCnpjDto {

    @JsonProperty("capital_social")
    private String capital;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
