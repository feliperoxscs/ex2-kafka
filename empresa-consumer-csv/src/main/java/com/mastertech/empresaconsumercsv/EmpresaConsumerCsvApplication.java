package com.mastertech.empresaconsumercsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@SpringBootApplication
public class EmpresaConsumerCsvApplication {

	public static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("empresas.csv"), "UTF-8"));
		SpringApplication.run(EmpresaConsumerCsvApplication.class, args);
	}

}
