package javainstruction.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan aldıgınız sayi çift ise yarısını ekrana yazdırınız,
        Tek ise "Bu sayı ikiye bölünmez" yazdırınız
         */
        /*
        1) Ternary de true ve false durumları için size verilen data type ları farklı ise olusturdugunuz
         containerin data type ini "Object" yapın
        2)"Object" java da bir class dır
          "Object" java daki bütün class ların "Parent"i dir. Yani babasıdır. Hz Adem gibi.
          "Object" class in Parent i yoktur
          Java da Parent i olmayan tek class "Object Class" dır
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an Integers");
        int num = input.nextInt();

        Object result = num%2==0 ? num/2 : "Bu sayı ikiye bölünmez";
        System.out.println(result);

    }
}
