package com.mastertech.empresaProducer.controller;


import com.mastertech.empresaProducer.dto.Empresa;
import com.mastertech.empresaProducer.producer.EmpresaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaProducer empresaProducer;

    @PostMapping
    public void cadastraEmpresa(@RequestBody Empresa empresa) {
        empresaProducer.enviaKafka(empresa);
    }
}
