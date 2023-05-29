package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatemtikselIslemler {
       /*
  -Javada farkli data type'lari arasinda islem yapiliyorsa
     sonuc uyuk olan data type'inin turunde olur
 - Karsilastirma operatorlerinde sonuc hep boolean doner
    < Kucuktur
    >  Buyuktur
    == Esittir
    != Esit Degildir
    <= ucuk Esittir
    >= Buyuk Esittir
    && and (ve) operatoru
    ||  or (veya) operatoru
        */
       public static void main(String[] args) {

        System.out.println(4*(5+2)/3);
        //9 döndürür. int/int==> int olacağı için virgülden sonrasını siler ve tam sayı alır
        // 9,3333333 yerine 9 görürüz

        System.out.println(6*16/8);// 12

        double sonuc = 4*(2+5)/3;

        System.out.println("sonuc = " + sonuc);// 9,0

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2); //sonuc2 = 9.333333333333334

        System.out.println(4*(1+5)/3); //8

       int sayi1 =5;
       int sayi2=2;
       double sayi3=2;

       System.out.println(sayi1/sayi2);// normalde 2,5 ama  int/int=int olacağı için tam sayı kısmını alır

       System.out.println(sayi1/sayi3);// 2,5
       System.out.println(sayi1+sayi3/sayi2);//6,0
           boolean first = 2<4;
           boolean second = 2+6!=8;
           boolean third= 2+3*5<20;

           System.out.println("first = " + first);// true
           System.out.println("second = " + second);//false
           System.out.println("third = " + third);//true

           System.out.println(first&&second);//false
           System.out.println(first || second || third);//true




       }//main
}//class
