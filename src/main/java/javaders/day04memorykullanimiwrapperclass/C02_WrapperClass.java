package javaders.day04memorykullanimiwrapperclass;

/*
Javada sonucta bir urundur.
Oracle firmasinin bir urunudur.Developerlar sadece data
barindiran primitve data typelarinin non-primitive ler gibi
method 'da barindirmasini istemislerdir.Bunun uzerine Java
primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
Bunada wrapper(sarmalamak,durum) class denir.


    Primitive               Non-Primitive
     byte         ==>          Byte
     short        ==>          Short
     int          ==>          Integer  *****
     long         ==>          Long
     float        ==>          Float
     double       ==>          Double
     boolean      ==>          Boolean
     char         ==>          Character  *****

 */
public class C02_WrapperClass {


    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        //  byte data type ının en buyuk ve en kucuk degerini ekrana yazdirin

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        // İnt data type  nin max degeri ile byte data type nin min degerinin
        // toplamını hesaplatan methodu oluşturunuz

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMin+intMax  = " + (intMax + byteMin));


        //*********Primitive data type larını Wrapper Class lara nasıl çeviririz.*********

        float primitiveFloat = 12.33f;
        Float WrapperFloat = primitiveFloat;// buna Autoboxing denir. Java bunu otomatik olarak yapar
        //küçük kutuyu büyük kutuya yerleştirir.

        //****** Wrapper Class ları Primitive //maindata type larına nasıl çeviririz ******

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;//Unboxing küçük kutuyu büyük kutudan çıkarmaJava bunu da otomatik olarak yapar


        //Verilen iki String datanın toplamini veren kodu yazınız

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1 + str2);
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // valueOf == String bir datayı Integer e dönüştürür

            /*
            Java da "+" sembolü iki int için matematikteki gibi toplama işl yapar
            İki String data arasında ya da bir String bir int arasında ise yanyana yazdirir
            Buna "Concatination" denir
            Java metematik bilir islem onceligine gore calisir
          i)Uslu Sayilar
          ii)Parantez ici
          iii)carpma/bolme
          iv) toplama/cikarma

             */

        String harf = "A";
        int sayi = 7;
        // harf+sayi ==> A7
        /*
        8+3"K"==>11K
        "K"+3*5/2==K7

         */
        String a="K";
        int b =3, c=5, d=2;
        System.out.println(a+b*c/d);//K7



    }//main


}//class
