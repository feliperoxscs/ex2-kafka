package com.mastertech.empresaconsumercnpj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "receitaFederal", url = "https://www.receitaws.com.br")
public interface GovernoClient {

    @RequestMapping("/v1/cnpj/{cnpj}")
    GovernoClientDto getCapitalSocial(@PathVariable String cnpj);
}
