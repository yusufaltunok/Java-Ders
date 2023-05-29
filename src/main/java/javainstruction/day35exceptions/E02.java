package javainstruction.day35exceptions;

public class E02 {
    public static void main(String[] args) {

        System.out.println(getCharFromString("Java", 2));//v

        System.out.println(getCharFromString("Java", 8));//StringIndexOutOfBoundsException
    }                                                            // J

    // Example 1- Bir Stringdeki character i index kullanarak alan bir method olusturunuz.

    public static char getCharFromString(String str, int idx) {

        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e) { // Stringlerde olmayan index kullanıldıgında atılır.

            idx = Math.abs(idx); // negatif index girilme ihtimaline karşı mutlak değer aldık

            idx = idx % str.length();// index i lengh ten kucuk hale getirmek için lenght e bolup kalanı aldık

            return str.charAt(idx);
        }



    }


}
