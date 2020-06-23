package com.mastertech.empresaconsumercnpj.request;

import com.mastertech.empresaconsumercnpj.dto.GovernoCnpjDto;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RequestGoverno {

    private String server = "https://www.receitaws.com.br/v1/cnpj/";
    private RestTemplate rest;
    private HttpHeaders headers;
    private HttpStatus status;

    public RequestGoverno() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    public GovernoCnpjDto get(String cnpj) {
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<GovernoCnpjDto> responseEntity = rest.exchange(server+cnpj, HttpMethod.GET, requestEntity, GovernoCnpjDto.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

}
