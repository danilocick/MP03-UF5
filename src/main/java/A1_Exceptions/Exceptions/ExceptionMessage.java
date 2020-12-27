package A1_Exceptions.Exceptions;


import A1_Exceptions.Model.*;
import A1_Exceptions.Control.*;
import A1_Exceptions.Exceptions.*;
public class ExceptionMessage extends Exception {

    //BANK ACCOUNT MESSAGES
    public static final String ACCOUNT_NOT_FOUND = "Compte inexistent";
    public static final String ACCOUNT_OVERDRAFT = "Compte al descobert";
    public static final String ACCOUNT_ZERO_USER = "Compte sense usuari";

    //CLIENT MESSAGES
    public static final String WRONG_DNI = "DNI incorrecte";

    //OPERATIONS
    public static final String TRANSFER_ERROR = "Error en la transferència";


}
