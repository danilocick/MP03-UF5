package A3_OpenData_Streams_Lambdes;

import A3_OpenData_Streams_Lambdes.Model.Entitat;
import A3_OpenData_Streams_Lambdes.Model.Entitats;
import A3_OpenData_Streams_Lambdes.Model.GuiaEntitats;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static final String pathXML = "http://justicia.gencat.cat/web/.content/tramits/entitats/llistatEntitats-entitats_religioses.xml";

    public static void main(String[] args) throws IOException, JAXBException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        MenuA3 menu = new MenuA3();

        GuiaEntitats guiaEntitats = readXML();
        boolean iterator = true;
        int election;

        do {
            MenuA3.showMenu();

            election= sc.nextInt();
            switch (election){
                case 1:
                    System.out.println("Introduce a name");
                    //EX:CENTRO PARROQUIAL DE SAN VICENTE
                    String finalPalabra = mc.nextLine();

                    //Stream d'una entitat(etiqueta XML) filtra amb una lambda on el text introduït es igual al nom de p(on p es el el nom de la entitat religiosa).
                    Stream<Entitat> entitesFiltered =  guiaEntitats.getEntitats().getLlistaEntitats().stream().filter(p -> finalPalabra.equals(p.getNom()));
                    //print
                    entitesFiltered.forEach(System.out::println);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Introduce a population");
                    //Ex:Sabadell
                    String population = mc.nextLine();

                    //filtar la cantidad de entidades
                    long countBigCustomers = guiaEntitats.getEntitats().getLlistaEntitats()
                            .stream()
                            .filter(p -> population.equals(p.getPoblacio()))
                            .count();

                    //filtrar para comprobar e imprimir
                    Stream<Entitat> filterBy =  guiaEntitats.getEntitats().getLlistaEntitats().stream().filter(p -> population.equals(p.getPoblacio()));
                    filterBy.forEach(System.out::println);
                    //imprimir numero total
                    System.out.println("Total of entities in "+population+": "+countBigCustomers);
                    break;
                case 3:
                    System.out.println("Introduce an entity");
                    //EX:CENTRO PARROQUIAL DE SAN VICENTE
                    String address = mc.nextLine();

                    //filtrar per nom i després mostrar només l'adreça.
                    Stream<Entitat> popNames  =guiaEntitats.getEntitats().getLlistaEntitats()
                            .stream()
                            .filter(p -> address.equals(p.getNom()));

                    //falta mostrar només l'adreca
                    System.out.println(popNames.collect(Collectors.toList()));

                    break;
                case 4:
                    System.out.println("Sorting...");
                    TimeUnit.SECONDS.sleep(2);
                    //Ordenant i imprimint
                    guiaEntitats.getEntitats().getLlistaEntitats().stream().sorted(Comparator.comparing(Entitat::getNom)).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Introduce a country(Comarca)");
                    //EX:Baix Llobregat
                    String country = mc.nextLine();

                    //Stream d'una entitat(etiqueta XML) filtra amb una lambda on el text introduït es igual al nom de p(on p es el el nom de la entitat religiosa).
                    Stream<Entitat> entitesFilteredByComarca =  guiaEntitats.getEntitats().getLlistaEntitats().stream().filter(p -> country.equals(p.getComarca()));
                    //print
                    entitesFilteredByComarca.forEach(System.out::println);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Showing...");
                    TimeUnit.SECONDS.sleep(2);

                    //list of postalcode
                    List<String> postalCode =guiaEntitats.getEntitats().getLlistaEntitats()
                            .stream()
                            .map(Entitat::getCodiPostal)
                                    .collect(Collectors.toList());

                    //list of names
                    List<String> names =guiaEntitats.getEntitats().getLlistaEntitats()
                            .stream()
                            .map(Entitat::getCodiPostal)
                            .collect(Collectors.toList());

                    System.out.println(postalCode);
                    System.out.println(names.);

                    break;
                case 7:
                    System.out.println("Showing...");
                    TimeUnit.SECONDS.sleep(2);

                    guiaEntitats.getEntitats().getLlistaEntitats().forEach(System.out::println);
                    System.out.println();
                    break;
                case 0:
                    iterator = false;
                    break;
            }
        }while (iterator);

    }

    private static GuiaEntitats readXML() throws MalformedURLException, JAXBException {
        URL url = null;
            url = new URL(pathXML);

            JAXBContext contextObj = JAXBContext.newInstance(GuiaEntitats.class);
            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
            GuiaEntitats guiaEntitats = (GuiaEntitats) unmarshallerObj.unmarshal(url);


        return guiaEntitats;
    }
}
