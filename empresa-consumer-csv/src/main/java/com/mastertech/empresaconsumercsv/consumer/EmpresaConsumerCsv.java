package com.mastertech.empresaconsumercsv.consumer;

import com.mastertech.empresaProducer.dto.Empresa;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.mastertech.empresaconsumercsv.helper.CsvHelper.writeToCsv;

@Component
public class EmpresaConsumerCsv {

    private final List<Empresa> empresas = new ArrayList<Empresa>();

    @KafkaListener(topics = "spec2-felipe-sarmento-3", groupId = "snoopy")
    public void recebeMensagem(@Payload Empresa empresa){
        empresas.add(empresa);
        writeToCsv(empresas);
        System.out.println("Cheguei aqui! " + empresa.getCnpj());
    }

}
