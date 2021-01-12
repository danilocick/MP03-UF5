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
        String folletsparenoel = "<]:-DOo";
        String substring;


        int comptePareNoel = 0, compteRens = 0, compteFollets = 0;
        boolean bPareNoel = false, bRens = false, bFollets = false;

        try {
            File myObj = new File("src/main/java/A2_ExpressionsRegulars/santako.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String mm = data;

                while (data.indexOf(pareNoel)>-1){

                    if (data.contains(pareNoel)) {
                        bPareNoel = true;
                        comptePareNoel++;
                        substring = data.substring(data.indexOf(pareNoel) + pareNoel.length());
                        data = substring;
                    }
                }

                data = mm;
                while (data.indexOf(rens)>-1){

                    if (data.contains(rens)) {
                        bRens = true;
                        compteRens++;
                        substring = data.substring(data.indexOf(rens) + rens.length());
                        data = substring;
                    }
                }

                data = mm;
                while (data.indexOf(follets)>-1){
                    if (data.contains(follets)) {
                        if (!data.contains(folletsparenoel)) {
                            bFollets = true;
                            compteFollets++;
                        }
                        substring = data.substring(data.indexOf(follets) + follets.length());
                        data = substring;
                    }
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
