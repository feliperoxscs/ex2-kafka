package com.mastertech.empresaconsumercsv.helper;

import com.mastertech.empresaProducer.dto.Empresa;

import java.io.*;
import java.util.List;

public class CsvHelper {

    private static final String CSV_SEPARATOR = ",";

    public static void writeToCsv(Empresa empresa) {
        try {
            FileWriter fileWriter = new FileWriter(new File("empresas.csv"), true);
            StringBuffer line = new StringBuffer();
            line.append(empresa.getCnpj());
            line.append(CSV_SEPARATOR);
            line.append(empresa.getName());
            fileWriter.write(line.toString());
            fileWriter.flush();
            fileWriter.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
}
