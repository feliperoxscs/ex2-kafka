package com.mastertech.empresaProducer.producer;

import com.mastertech.empresaProducer.dto.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpresaProducer {

    @Autowired
    private KafkaTemplate<String, Empresa> kafkaTemplate;


    public void enviaKafka(Empresa empresa) {
        kafkaTemplate.send("spec2-felipe-sarmento-2", empresa);
    }
}
