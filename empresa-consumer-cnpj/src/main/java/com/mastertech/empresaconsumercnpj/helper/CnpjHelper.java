package com.mastertech.empresaconsumercnpj.helper;

import com.mastertech.empresaconsumercnpj.request.RequestGoverno;
import com.mastertech.empresaconsumercnpj.dto.GovernoCnpjDto;

import java.io.IOException;


public class CnpjHelper {


    public static Boolean verificaCapital(String cnpj) throws IOException {
        RequestGoverno requestGoverno = new RequestGoverno();
        GovernoCnpjDto governoCnpjDto = requestGoverno.get(cnpj);
        System.out.println(governoCnpjDto.getCapital());
        if (Double.parseDouble(governoCnpjDto.getCapital()) > 1000000){
            return true;
        }
        else {
            return false;
        }

    }
}
