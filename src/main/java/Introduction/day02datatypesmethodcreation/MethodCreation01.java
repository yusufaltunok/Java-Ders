package Introduction.day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
      Java'da temelde iki tip data vardir
      1)primitive data type:
          char, boolean, byte, short, int, long, float, double
      2)non-primitive data type:
          String
       */
    /*
    Note1: primitive data type'lari java olusturmustur, biz olusturamayiz
    Note2: primiteve data type'larin isimlerinde sadece kucuk harf kullanilir
    Note3: primitive data'lar type'larina gore memory'de farkli farkli yer kaplarlar
    Note4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
     */
    /*
        Non-primitive Data Types
        Ornek olarak String non-primitive bir data type'dir
        Uretilen her bir class ayni zamanda bir "non-primitive data type" dir.
        Bu yuzden "non-primitive data type" lar sinirsiz sayida dir denilebilir
        Non-primitive data type larin isimleri buyuk harfle baslar
        Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
     */


        /*
               Interview sorusu: "primitve " ve "non-primitive" data type'lar arasindaki fark nedir?
               1)"primitive " ler sadece bizim atadigimiz degeri icerir
                  "non-primitive" ler bizim atadigimiz deger ve method'lar icerir
               2)"primitive "ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
               3)"primitve " leri java uretmistir ve 8 tanedir
                  "non-primitve"leri java ve developerlar uretebilir, sinirsiz sayidadir
               4) "primitive " ler memory de data type'ina gore yer kaplar
                   Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
         */

    /*
       java'da method nasil olusturulur?
       1)main method'un disinda classin icinde olusturulur
       2)Access Modifier + Return Type + Method ismi + () + {}
       Olusturulan methodlar nasil kullanilir?
       1)main method'un icinden kullanilir
       2)method'un ismi + () yazin
       3)Islem yapacağınız parametreleri parantez icine koyun
        */
    public static void main(String[] args) {
        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);
        long carpmaSonuc = multiply(3, 6);
        System.out.println(carpmaSonuc);
        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 3, 4);
        System.out.println(ucluSonuc);
        System.out.println(getCube(5));
        print("Hello world");
        print("hamit");
    }
    //Ornek1: toplama islemi yapan bir method olusturunuz
    //main method static oldugu icin main method icerisinde kullanacğınız hersey static olmalidir
    int a=7;
    int b=3;
    int c=2;

    public static int toplamaYap(int a, int b) {
        return a + b;
    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusuturunuz
    protected static long multiply(int a, int b) {
        return a * b;
    }
    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile taplayan methodu olusturunuz
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //NOTE: ACCESS MODIFIER'I default YAPMAK icin access modifier YAZMAYİNİZ
    static double getCube(double a){
        return a*a*a;
    }
    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print (String str) {
        System.out.println(str);
    }
    //methodun return type'i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data üretmiyor ise return typi void olur
    //shift f10
}


