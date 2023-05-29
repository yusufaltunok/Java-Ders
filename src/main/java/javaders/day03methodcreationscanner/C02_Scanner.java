package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin
        // toplamini ekrana yazdiran programi yaziniz
        // % ==> modulus operatoru sayının bölümünden kalan sayıyı verir.

        Scanner input = new Scanner(System.in); //Beyza
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi= input.nextInt();//8649
        int sonRakam = sayi%10;//9
        int ilkRakam = sayi/1000;//8
        /*
        3 basamakli bir sayinin ilk
        basamagini rakami almak icin  (Basamak sayisi -1) 0 olan yani 100'e bolmeliyiz

        4 basamakli bir sayinin ilk
        basamagini almak icin  (Basamak sayisi -1) 0 olan yani 1000'e bolmeliyiz

        5 basamakli bir sayinin ilk
        basamagini almak icin  (Basamak sayisi -1) 0 olan yani 10000'e bolmeliyiz
         */
        System.out.println("IlkRakam+ sonRakam = "+(ilkRakam+sonRakam));


    }//main
}//class
