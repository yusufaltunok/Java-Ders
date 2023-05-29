package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*
        Numerik data type'larının birbirine dönüştürülmesine Type Casting denir.
        Numerik data type'ları byte, short, int, long, float, double

        Küçük data type'ların büyük data type'larına dönüştürülmesine
        Auto Widening (otomatik genişletme) denir. ==> küçük kutunun büyük kutu içine yerleştşrşlmesi

          Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
    Data kaybi olabilecegi icin code'u yazanlara birakir.Buna "Explicit Narrowing"
     (Aciktan Daraltma ) denir.

         */

        byte age =13;
        int ageInt = age; // Auto Widening (otomatik genişletme)

     // long data type ını short a çevirelim.
      long population= 325632;
      short populationShort = (short) population; //"Explicit Narrowing (Aciktan Daraltma )

     // int data type'ını float data type ına çeviriniz.

        int boy =190;
        float boyFloat=boy;// Auto Widening (otomatik genişletme)


      //  short data type ını byte a çevirelim.

        short numberShort =125;
        byte numberByte = (byte) numberShort;//"Explicit Narrowing (Aciktan Daraltma )

    }//main

}//class
