package com.mastertech.empresaconsumercsv.helper;

import com.mastertech.empresaProducer.dto.Empresa;

import java.io.*;
import java.util.List;

import static com.mastertech.empresaconsumercsv.EmpresaConsumerCsvApplication.bw;

public class CsvHelper {

    private static final String CSV_SEPARATOR = ",";

    public static void writeToCsv(List<Empresa> empresas) {
        try {

            for (Empresa empresa : empresas) {
                StringBuffer line = new StringBuffer();
                line.append(empresa.getCnpj());
                line.append(CSV_SEPARATOR);
                line.append(empresa.getName());
                bw.write(line.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
}
