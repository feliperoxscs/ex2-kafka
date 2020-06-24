package com.mastertech.empresaconsumercnpj.helper;

import com.mastertech.empresaconsumercnpj.client.GovernoClient;
import com.mastertech.empresaconsumercnpj.client.GovernoClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CnpjHelper {

    @Autowired
    private GovernoClient governoClient;

    public Boolean verificaCapital(String cnpj) throws IOException {
        GovernoClientDto governoClientDto = governoClient.getCapitalSocial(cnpj);
        System.out.println(governoClientDto.getCapital());
        if (Double.parseDouble(governoClientDto.getCapital()) > 1000000){
            return true;
        }
        else {
            return false;
        }

    }
}
