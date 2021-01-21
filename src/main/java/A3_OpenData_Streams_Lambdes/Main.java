package A3_OpenData_Streams_Lambdes;

import A3_OpenData_Streams_Lambdes.Model.Title;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static final String pathCSV = "https://datasets.imdbws.com/name.basics.tsv.gz";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        readCSV();

    }

    private static void readCSV() {
        System.out.println("reading CSV");
        URL url = null;
        BufferedReader in = null;
        CSVReader reader = null;
        try {
            url = new URL(pathCSV);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            reader = new CSVReader(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        CsvToBean<Title> TitleaCsvToBean = new CsvToBeanBuilder(reader)
                .withType(Title.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        Iterator<Title> csvIterator = TitleaCsvToBean.iterator();
        while(csvIterator.hasNext()) {
            Title title = csvIterator.next();
            System.out.println(title);
            System.out.println("hola");
        }

    }
}
