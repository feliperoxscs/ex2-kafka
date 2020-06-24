package com.mastertech.empresaconsumercsv.consumer;

import com.mastertech.empresaProducer.dto.Empresa;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.mastertech.empresaconsumercsv.helper.CsvHelper.writeToCsv;

@Component
public class EmpresaConsumerCsv {

    @KafkaListener(topics = "spec2-felipe-sarmento-3", groupId = "snoopy")
    public void recebeMensagem(@Payload Empresa empresa){
        writeToCsv(empresa);
        System.out.println("Cheguei aqui! " + empresa.getCnpj());
    }

}
