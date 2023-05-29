package javaders.day02printmethodcreation;

public class MethodCreation {
    public static void main(String[] args) {
        // static ==> protokol tribunu vip class

        //Karenin alanini veren kodu yaziniz

        kareninAlani(7);
        // kareninAlani(7)+2;
        /*
        return type void oldugunda dondurdugu her hangi bir deger olmadigi icin
        sadece ekranda bastirdigi icin; ekleme cikarma ya da method kullanma vs.
        hic bir islem yapamayiz.
        Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda goruruz.
        TV ekraninda elmalari gorup elmali pasta yapmamiz gibi...
        */

        //Dikdortgenin alanini veren kodu yaziniz
        System.out.println("Dikdortgenin Alani " + (dikdortgeninAlani(10, 20) + 2));//Dikdortgenin Alani 200
        /*
        return type'i int oldugu icin bir deger dondurur.Ve bu degeri biz kullanabiliriz.
        Method kullanabiliriz.
        Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz
        */
    }//main

    private static int dikdortgeninAlani(int a, int b) {

        return a * b;//carpmanin sonucunu kullaniciya verdim
    }

    private static void kareninAlani(int a) {

        System.out.println("Karenin Alani : " + (a * a));//Karenin Alani : 49
    }
}//class