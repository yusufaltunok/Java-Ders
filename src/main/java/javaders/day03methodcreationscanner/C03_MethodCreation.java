package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

     /*


    Javada method nasil olusturulur?

    1) Javada method main'in disinda olusturulur
    2) tekrar tekra kullanmamiz gerekiyorsa method olustururuz
     Access Modifier  +  Return Type + methodIsmi  + ( ) + { }
     islem yapilacak olan sayilari methodIsmi () parantezin icine eklenir


    Scope == Kapsam Alani bir variable'in  bir degerin,
     hangi alanda kapsam icinde oldugunu gosterir
     */

    public static void main(String[] args) {

        // 1) Verilen iki sayiyi toplayan methodu olusturunuz
        toplamaYap(30, 87);
        // 2) Verilen 2 sayiyi carpan methodu yaziniz
        multiply(46, 12);

        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("3 sayidan ilk ikiyi carp 3 ekle : " + firstTwoMultiplyThirdAdd(2, 3, 5) * 2);

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz  5.6
        double sayininKupu = getCube(5.6);
        System.out.println("sayininKupu = " + sayininKupu);

        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        System.out.println("dairenin cevresi " + daireninCevresi(2));

    }//main

    private static int daireninCevresi(int r) {
        return 2 * 314 * r / 100;

    }

    static double getCube(double v) {
        return v * v * v;
    }

    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    private static void multiply(int a, int b) {
        System.out.println("carpma methodu : " + a * b);
    }

    static void toplamaYap(int a, int b) {
        // Access modifiers default oldugu icin bir sey yazilmadi
        System.out.println("toplama : " + a + b);
    }


}//class

