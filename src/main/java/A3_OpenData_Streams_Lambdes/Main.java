package A3_OpenData_Streams_Lambdes;

import A3_OpenData_Streams_Lambdes.Model.Entitat;
import A3_OpenData_Streams_Lambdes.Model.GuiaEntitats;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    static final String pathXML = "http://justicia.gencat.cat/web/.content/tramits/entitats/llistatEntitats-entitats_religioses.xml";

    public static void main(String[] args) throws IOException, JAXBException {
        Scanner sc = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        GuiaEntitats guiaEntitats = readXML();

        boolean iterator = true;
        int election;

        do {
            election= sc.nextInt();
            switch (election){
                case 1:

                    System.out.println("Intro a name");
                    String finalPalabra = mc.nextLine();
                    //Stream<Entitat> = guiaEntitats.getEntitats();
                    Stream<Entitat> entitesFiltered = guiaEntitats.getEntitats().filter(p -> finalPalabra.equals(p.getNom()));

                    entitesFiltered.forEach(System.out::println);
                    System.out.println();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Stream<Entitat> entitiesSorted = guiaEntitats.sorted(comparing(Entitat::getNumeroInscripcio));
                    entitiesSorted.forEach(System.out::println);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    iterator = false;
                    break;
            }
        }while (iterator);

        //MenuA3 menu = new MenuA3();
        // MenuA3.showMenu();

    }

    private static GuiaEntitats readXML() throws MalformedURLException, JAXBException {
        URL url = null;
            url = new URL(pathXML);

            JAXBContext contextObj = JAXBContext.newInstance(GuiaEntitats.class);
            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
            GuiaEntitats guiaEntitats = (GuiaEntitats) unmarshallerObj.unmarshal(url);

            //guiaEntitats.getEntitats().getLlistaEntitats().forEach(System.out::println);

        return guiaEntitats;
    }
}
