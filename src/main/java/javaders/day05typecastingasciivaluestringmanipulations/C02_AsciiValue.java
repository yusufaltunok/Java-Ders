package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {

        /*
        Javada char data type'ini matematiksel islemlerde kullanirsaniz
        Ascii table'daki sayisal degerleri alir.

        Numeric Data typelari : byte-short-int-long-float-double
        char karakteri hem sayisal deger barindirir + hem de resim karakteri barindirir
        boolean ==> Numeric Olmayan Data Type'dir
        Javada char datat type'ina int degerde atanabilir Sembol Harf vs de atanabilir
        Cunku char data type'inin Ascii 'den gelen bir  sayisal == numeric bir degeri birde
        resim karakteri vardir


         */

        // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz

        int asciiA = 'A';
        System.out.println(asciiA);//65

        int asciia = 'a';
        System.out.println("asciia = " + asciia);//asciia = 97



        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//asciiUnlem = 33
        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//asciiSpace = 32
        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//asciiSembol = 42
        String isim="Zeki";
        char ch ='Z';
        char sembol ='*';
        char isaret = '?';
        char space =' ';
        char rakam ='9';
        char sayi='0';
        // int intCh=Z;

        // 149.9999Tl  *2
        int deger=20;
        char smbl= '$';

        System.out.println(deger+smbl);//$ Ascii tabledaki degeri 36 + 20 = 56


        int deger2=0;
        char smbl2 = '+';
        System.out.println("deger2+smbl2  = " + deger2+smbl2);// 43
        System.out.println("deger2+smbl2  = " +( deger2+smbl2));// 43

        String name="123";
        int number= 45;
        System.out.println(name + number);//12345  Concatination uc uca ekleme yan yana yazdirma


        int asciiG='G';
        System.out.println("asciiG = "+asciiG);//asciiG = 71
        String str1="Java";
        char ch3='G';
        int sayi1=5;
        System.out.println(str1+ch3+sayi1);//JavaG5
        System.out.println(str1+(ch3+sayi1));//Java76

        System.out.println(ch3+sayi1+str1);//76Java

        String sayiStr="123";
        String sayiStr2="45";
        System.out.println(sayiStr+sayiStr2);//12345

        char rakam1 ='1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2 ='2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 ='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 ='4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1+rakam2+rakam3+rakam4);//1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +
                ( rakam1+rakam2+rakam3+rakam4));//202 Ascii Top

        System.out.println( rakam1+rakam2+rakam3+rakam4);

        // 1 ==> Ascii 49   2==>50    3==>51   4 ==>52

        ///******************* Ascii Degerlerinden Faydalanilarak Neler Yapilabilir ? *******************\\\\

        byte b =5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih);// h==104

        int ascii5= '5';
        System.out.println("ascii5 = " + ascii5); //5==53

        System.out.println("b>ch2 = " +(b>ch2));// 5 > 104 ==> false

        long l = 542168784578L;
        System.out.println("ch2>l = " +(ch2>l));// false

        float f = 2.45648f;
        double d = 2.49658;
        System.out.println("f>d = " +(f>d));//f>d = false


        byte sayi3=5;
        byte sayi4 =6;
        System.out.println(sayi3<sayi4);//true

        System.out.println("b<f = " + (b<f));//b<f = false

    int sayiİnt =100;
    long sayiLong=100L;
    System.out.println("sayiİnt==sayiLong = " +(sayiİnt==sayiLong));//true

    int sayiİnt2 =200;
    System.out.println("sayiİnt2>=sayiLong = " +(sayiİnt2>=sayiLong));//true

    int sayiInt3=9;
    char sayiChar = '9';
    System.out.println("sayiInt3 >= sayiChar "+(sayiInt3 >= sayiChar));//false







    }//main
}//class