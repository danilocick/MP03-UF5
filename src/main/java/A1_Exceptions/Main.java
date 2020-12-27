package A1_Exceptions;

import A1_Exceptions.Model.Client;
import A1_Exceptions.Model.CompteEstalvi;

public class Main {
    public static void main(String[] args) {
        CompteEstalvi compteEstalvi = new CompteEstalvi("08923");

        try {
            String dni = "53828204Q";
            String dni2 = "53828203S";
            Client aa = new Client("dani", "hernandez", dni);
            Client bb = new Client("dani", "hernandez", dni2);
            compteEstalvi.addUser(aa);
            compteEstalvi.addUser(bb);
            compteEstalvi.removeUser(dni);
            compteEstalvi.ingressar(10);
            compteEstalvi.treure(11);

        }catch (ClientAccountException | BankAccountException e){
            e.printStackTrace();
        }


    }
}
