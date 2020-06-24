package com.mastertech.empresaconsumercnpj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpresaConsumerCnpjApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaConsumerCnpjApplication.class, args);
	}

}
