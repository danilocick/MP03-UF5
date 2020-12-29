package A1_Exceptions.Model;

import A1_Exceptions.BankAccountException;
import A1_Exceptions.ClientAccountException;
import A1_Exceptions.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class CompteEstalvi extends Exception {
    private final String numCompte;
    private double saldo;
    private List<Client> llista_usuaris;
    private List<CompteEstalvi> llista_compteEstalvi;

    public CompteEstalvi(String numCompte) {
        this.numCompte = numCompte;
        saldo = 0;
    }

    /**
        Afegeix un usuari d'aquest compte
        @param client
        @return quantitat d'usuaris que té el compte
     **/
    public int addUser(Client client) {
        if(llista_usuaris == null){
            llista_usuaris = new ArrayList<Client>();
        }
        llista_usuaris.add(client);
        return llista_usuaris.size();
    }

    /**
     Elimina un usuari d'aquest compte,
     Com que no pot quedar un compte sense usuari, si és l'ùltim és llança una excepció
     @param dni
     @return quantitat d'usuaris que té el compte
     @throws BankAccountException
     **/
    public int removeUser(String dni) throws ClientAccountException {
        if(llista_usuaris.size() < 2){
            try {
                throw new ClientAccountException(ExceptionMessage.ACCOUNT_ZERO_USER);
            } catch (ClientAccountException e) {
                e.printStackTrace();
            }
        } else llista_usuaris.removeIf(u -> dni.equals(u.getDNI()));
        return llista_usuaris.size();
    }

    /**
     * Afegeix m diners al saldo
     * @param m
     */
    public void ingressar(double m) {
        saldo += m;
    }

    /**
     * Treu m diners del compte si n'hi han suficient sinó es llança l'excepció
     * @param m
     * @throws BankAccountException
     */
    public void treure(double m) throws BankAccountException {
        if(saldo < m) {
            try {
                throw new ClientAccountException(ExceptionMessage.TRANSFER_ERROR);
            } catch (ClientAccountException e) {
                e.printStackTrace();
            }
        }else saldo -= m;
    }

    public void transferTo(CompteEstalvi emisor,CompteEstalvi receptor, double transfer) throws BankAccountException{
        try{
            emisor.treure(transfer);
            receptor.ingressar(transfer);
        }catch (BankAccountException e){e.printStackTrace();}
    }

    public String getNumCompte() {
        return numCompte;
    }
    public double getSaldo() {
        return saldo;
    }
    public List<Client> getLlista_usuaris() {
        return llista_usuaris;
    }
}
