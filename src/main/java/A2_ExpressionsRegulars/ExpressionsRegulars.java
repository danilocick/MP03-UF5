package A2_ExpressionsRegulars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsRegulars {
    public static void main(String[] args) {
        /*
        pare noel -> *<]:-DOo
        rens -> >:o)
        follets -> <]:-D
        */
        Pattern pareNoel = Pattern.compile("/*<]:-DOo");
        Pattern rens = Pattern.compile(">:o\\)");
        Pattern follets = Pattern.compile("[^/*]<]:-D");
        int comptePareNoel = 0, compteRens = 0, compteFollets = 0;
        boolean bPareNoel = false, bRens = false, bFollets = false;


        try {
            File myObj = new File("src/main/java/A2_ExpressionsRegulars/santako.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                Matcher pareNoelCount = pareNoel.matcher(data);
                Matcher rensCount = rens.matcher(data);
                Matcher folletsCount = follets.matcher(data);

                while (pareNoelCount.find()) {
                    comptePareNoel++;
                    bPareNoel=true;
                }
                while (rensCount.find()) {
                    compteRens++;
                    bRens=true;
                }
                while (folletsCount.find()) {
                    compteFollets++;
                    bFollets=true;
                }

                if (bPareNoel){System.out.print("Pare Noel ("+ comptePareNoel+") ");}
                if (bRens){System.out.print("Rens ("+ compteRens+") ");}
                if (bFollets){System.out.print("Follets ("+ compteFollets+") ");}
                System.out.print("\n");

                bPareNoel = false;
                bRens = false;
                bFollets = false;
                comptePareNoel = 0;
                compteRens = 0;
                compteFollets = 0;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
