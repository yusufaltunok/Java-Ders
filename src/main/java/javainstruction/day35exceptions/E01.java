package javainstruction.day35exceptions;

public class E01 {
    public static void main(String[] args) {
        System.out.println(convertStringToInt("123") + 2); // sayıya donustugunu ispatlamak için +2 topladık

        System.out.println(convertStringToInt("12ab") + 2); //NumberFormatException -->sayı formatı hatası
        // valueOf metodunu sayı formatında olmayan Stringler için kullanınca bu hatayı verir
    }

    // Bir Stringi Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str) {

        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {  //valueOf() method'u non-digit character iceren bir String
            // ile kullanildiginda atilir.
            System.out.println("Do not use non-digit characters");

            str = str.replaceAll("[^0-9]", ""); // rakam dısındakileri sil
            return Integer.valueOf(str);
        }
    }

}




