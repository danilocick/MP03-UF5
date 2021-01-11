package A2_ExpressionsRegulars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NoExpressions {
    public static void main(String[] args) {

        String pareNoel = "*<]:-DOo";
        String rens = ">:o)";
        String follets = "<]:-D";

        int comptePareNoel = 0, compteRens = 0, compteFollets = 0;
        boolean bPareNoel = false, bRens = false, bFollets = false;

        try {
            File myObj = new File("src/main/java/A2_ExpressionsRegulars/santako.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();


                if (data.contains(pareNoel)) {
                    comptePareNoel++;
                    bPareNoel=true;
                }
                if (data.contains(rens)) {
                    compteRens++;
                    bRens=true;
                }
                if (data.contains(follets)) {
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
