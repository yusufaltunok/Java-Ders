package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

        //INTERWIEW questions usa QA

        //bİR sTRİNGDEKİ TEKRARSIZ KARAKTERLERİ EKRANA YAZDIRINIZ

        //String y = "abbccdc";

        String y = "abbccdc";//soru çozumu çok uzamaması için bu şekilde alındı.

        char ch = y.charAt(0);
        if (y.indexOf(ch) == y.lastIndexOf(ch)) {

            System.out.println(ch);
        }// if body iki süslü parantez arası

        char ch1 = y.charAt(1);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {

            System.out.println(ch1);
        }// if body

        char ch2 =y.charAt(2);
        if(y.indexOf(ch2) ==y.lastIndexOf(ch2)) {

            System.out.println(ch2);
        }// if body

        char ch3 =y.charAt(3);
        if(y.indexOf(ch3) ==y.lastIndexOf(ch3)) {

            System.out.println(ch3);
        }// if body

        char ch4 =y.charAt(4);
        if(y.indexOf(ch4) ==y.lastIndexOf(ch4)) {

            System.out.println(4);
        }// if body

        char ch5 =y.charAt(5);
        if(y.indexOf(ch5) ==y.lastIndexOf(ch5)) {

            System.out.println(ch5);
        }// if body

        char ch6 =y.charAt(6);
        if(y.indexOf(ch6) ==y.lastIndexOf(ch6)) {

            System.out.println(ch6);
        }// if body

    //Ex.:Verilen sayı pozitif ise ekrana "Sayı Pozitif" yazdıran kodu yazdırın

        int num = 65;
        if (num>0){
            System.out.println("Sayi Pozitif");
        }// if body

        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
        int rakam = 3;
        if(rakam>-1 && rakam<10){
        System.out.println("Verilen Data Rakamdir");

        }// if body

    //Ex.: Sayı 3 basamaklı ise "Verilen data 3 basamaklıdır" yazdiran kodu yaziniz
       int sayi = -998;
       sayi =Math.abs(sayi);// bu metot sayıyı - ise pozitife çeviriyor.Mutlak değer alıyor
       if(sayi>99 && sayi <1000) {
           System.out.println("Verilen data 3 basamaklıdır");
        }// if body

        //      Eger Math classindan abs() kullanmak istemez iseniz
        //      asagidaki gibi iki kez if statement yazabilirsiniz

        int data=-999;

        if(data>99 && data<1000){
            System.out.println("Verilen Data 3 Basamaklidir");
        }
        if(data>-1000 && data<-99){
            System.out.println("Sayi Negatifte Olsa 3 Basamaklidir");
        }


    }//main
}//class
