package A1_Exceptions;

import A1_Exceptions.Exceptions.ExceptionMessage;
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
            System.out.println();
            compteEstalvi.treure(8);

        }catch (ClientAccountException | BankAccountException e){
            e.printStackTrace();
        }

        CompteEstalvi ce1 = new CompteEstalvi("1000000000");
        CompteEstalvi ce2 = new CompteEstalvi("5000000000");

        try{
            ce1.ingressar(123);
            compteEstalvi.transferTo(ce1,ce2,110);
        }catch ( BankAccountException e){
            e.printStackTrace();

        }finally {
            System.out.println(ce1.getNumCompte() + ": " +ce1.getSaldo());
            System.out.println(ce2.getNumCompte() + ": " +ce2.getSaldo());
        }
    }
}
