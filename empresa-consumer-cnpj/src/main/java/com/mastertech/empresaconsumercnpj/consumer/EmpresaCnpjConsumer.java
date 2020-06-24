package com.mastertech.empresaconsumercnpj.consumer;

import com.mastertech.empresaProducer.dto.Empresa;
import com.mastertech.empresaconsumercnpj.helper.CnpjHelper;
import com.mastertech.empresaconsumercnpj.producer.EmpresaCnpjCsvProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EmpresaCnpjConsumer {

    @Autowired
    private EmpresaCnpjCsvProducer empresaCnpjCsvProducer;

    @Autowired
    private CnpjHelper cnpjHelper;

    @KafkaListener(topics = "spec2-felipe-sarmento-2", groupId = "snoopy")
    public void recebeMensagem(@Payload  Empresa empresa) throws IOException {
        if (cnpjHelper.verificaCapital(empresa.getCnpj())) {
            empresaCnpjCsvProducer.enviaKafka(empresa);
        } else {
            throw new RuntimeException("Capital menor que 1Mi!");
        }
    }
}
