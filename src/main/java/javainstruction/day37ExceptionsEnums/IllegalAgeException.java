package javainstruction.day37ExceptionsEnums;

public class IllegalAgeException extends RuntimeException {

    /*
        1- Eğer Runtime Custom Exception uretmek isterseniz RuntimeException Class'a extend etmeliyiz.
     */

    public IllegalAgeException() {
        super();
    }

    public IllegalAgeException(String message) {
        super(message);
    }


}
