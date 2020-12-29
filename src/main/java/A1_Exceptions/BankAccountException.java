package A1_Exceptions;

import A1_Exceptions.Exceptions.ExceptionMessage;

public class BankAccountException extends Exception {
    public BankAccountException(String msg) {
        super(msg);
    }

}
