package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {

        // if it rains; I will cancel the picnic.
        // Eğer yağmur yağarsa; pikniği iptal edeceğim

        //Ex.: Verilen karakter büyük harf ise ekrana "Büyük Harf" yazdıran kodu yazınız


        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük Harf");
        }//if

        //Ex.: Verilen sayi cit sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz.

        byte sayi = -8;
        if (sayi % 2 == 0) {  // Kodun dinamik yazılması için variable nin ismi yazılır.
                             // Direk değer yazilirsa hurd coding yani tek datalık kod olur
            System.out.println("Cift Sayi");

        }//if

        //Ex.: Verilen bir sayi 300 den küçük veya 1200 den büyük ise "Harika Sayi" yazdiran kodu yazdiriniz.

        int number = 320;
        if(number<300 || number>1200){
            System.out.println("Harika Sayi");
        }//if

        //Ex.: Kullanıcıdan alınan bir sayinın tek mi çift mi olduğunu yazdiran kodu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfeen bir sayi giriniz.");
        int num=input.nextInt();

        // 1.yol bağımsız if statement
        if(num %2 ==0 ){
            System.out.println("Çift Sayi");

        }//if body çift

        if(num %2 !=0){
        System.out.println("Tek Sayi");

        }//if body tek


    // 2. yol if Else

        if(num %2 ==0 ) {  // eğer num içindeki datanın ikiye bolumunden kalan 0 ise "Çift Sayi" yazdirir
            System.out.println("Çift Sayi");
        }else {  //Geriya kalan tüm ihtimaller için burası çalısır
            System.out.println("Tek Sayıdır");
        }// else body


    //Ex.: Verilen bir sayinın negatif mi, pozptf mi nötr mü olduğunu söyleyen kodu yazdiriniz.


    int numara = 66;
    if(numara<0){
        System.out.println("Negatif Sayi");
    }else if(numara==0){
            System.out.println("Notr Sayi");
    }else{
        System.out.println("Pozitif Sayi");
    }









    }//main
    }//class
