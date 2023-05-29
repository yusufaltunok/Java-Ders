package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        // ********* ExplicitNarrowing ***********
        /*
        Explicit Narrowing yaparken dikkat edilmeli .
Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
 bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir

         */

        // short data type ında bir variable olusturup byte data type ına çeviren kodu yaz.
        short num=260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);//numByte = 4
        
        short num2 = 1023;
        byte num2Byte= (byte) num2;
        System.out.println("num2Byte = " + num2Byte);//num2Byte = -1

        short num3 = 1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);//num3Byte = -24

        int intSayi = 8880;
        short shortSayi = (short) intSayi;// -32768 + 32768 + 0
        System.out.println("shortSayi = " + shortSayi);//shortSayi = 8880



        








    }//main

}//class
