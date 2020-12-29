package A1_Exceptions;

import A1_Exceptions.Exceptions.ExceptionMessage;
import A1_Exceptions.Model.Client;
import A1_Exceptions.Model.CompteEstalvi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClientAccountException {
        CompteEstalvi compteEstalvi = new CompteEstalvi("08923");
        CompteEstalvi ce1 = new CompteEstalvi("1000000000");
        CompteEstalvi ce2 = new CompteEstalvi("5000000000");
        String dni, dni2, dni3;
        int i = 10;
        Scanner sc = new Scanner(System.in);


        do{
            Menu.menu();
            i = sc.nextInt();

            switch (i){
                case 1:
                    try {
                        dni = "53828204Q";
                        dni2 = "53828203S";
                        Client aa = new Client("dani", "hernandez", dni);
                        Client bb = new Client("dani", "hernandez", dni2);
                        compteEstalvi.addUser(aa);
                        compteEstalvi.addUser(bb);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        dni3 = "53828203Q";
                        Client cc = new Client("dani", "hernandez", dni3);
                        compteEstalvi.addUser(cc);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        dni = "53828204Q";
                        compteEstalvi.removeUser(dni);
                    }catch (ClientAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        compteEstalvi.ingressar(10);
                        System.out.println();
                        compteEstalvi.treure(8);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        compteEstalvi.ingressar(10);
                        System.out.println();
                        compteEstalvi.treure(40);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        ce1.ingressar(123);
                        compteEstalvi.transferTo(ce1, ce2, 110);
                    } catch (BankAccountException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(ce1.getNumCompte() + ": " + ce1.getSaldo());
                        System.out.println(ce2.getNumCompte() + ": " + ce2.getSaldo());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("error torna a probar un altre número");
            }
        }while (i != 0);
    }
}
