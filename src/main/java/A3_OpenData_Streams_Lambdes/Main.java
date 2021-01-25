package A3_OpenData_Streams_Lambdes;

import A3_OpenData_Streams_Lambdes.Model.Entitat;
import A3_OpenData_Streams_Lambdes.Model.Entitats;
import A3_OpenData_Streams_Lambdes.Model.GuiaEntitats;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static final String pathXML = "http://justicia.gencat.cat/web/.content/tramits/entitats/llistatEntitats-entitats_religioses.xml";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        readXML();
    }

    private static void readXML() {
        URL url = null;
        try {
            url = new URL(pathXML);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        try {
            JAXBContext contextObj = JAXBContext.newInstance(GuiaEntitats.class);
            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
            GuiaEntitats guiaEntitats = (GuiaEntitats) unmarshallerObj.unmarshal(url);
            guiaEntitats.getEntitats().getLlistaEntitats().forEach(System.out::println);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
