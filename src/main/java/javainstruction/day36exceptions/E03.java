package javainstruction.day36exceptions;

public class E03 {

    /*
        "throws" ile "throw" arasındaki farklar nelerdir?
        1- "throws" method signature satırında kullanılır.
           "throw" ise method body içinde kullanılır.
        2- "throws" method signature satırında bir veya birden fazla Exception ile bir kere kullanılır.
           "throw" method body içinde bir tane Exception ile tekrar tekrar kullanılabilir.
        3- "throws"dan sonra sadece Exception Class isimleri yazılır
           "throw"dan sonra ise Exception Class'dan object olusturulur.
     */
    public static void main(String[] args) {

        //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz
        printAge(23);

        try {     // kendi oluşturduğumuz Exception u handle ettik
            printAge(-12);
        }catch (IllegalArgumentException e) {
            System.out.println("Negative ages are not valid");
        }

        printAge(-9);


    }

    public static void printAge (int age) {
        if (age<0){
            throw new IllegalArgumentException("Used negative integers for ages"); // age negatif ise Exception at dedik
        }                            // kendi olusturdugumuz Exceptionlar için constructor'ın parantezi içine mesaj koyabiliriz.
        System.out.println(age);
    }
}
