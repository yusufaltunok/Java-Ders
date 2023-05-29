package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint {
    public static void main(String[] args) {
  /*
        \n ==> her bir karakteri bir alt satira gecirir
        \t ==> bir tab bosluk birakir
        \" ==> ekrana " yazdirir
        ctrl + alt + l ==> sayfayi duzenler
        cmd + alt + l ==> sayfayi duzenler (MAC KULLANANLAR İÇİN)

         */
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz

        // 1. YOL   CTRL+D
        System.out.println("************* 1. Yol *********************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        // "TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdiriniz
        System.out.println("***************** 2. Yol **************************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        // JAVA ILE GUZEL DUNYA cümlesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesinin arasında 1 tab bosluk birakan
        //  kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");// \t de harf sayısı önemlidir harf sayıları farklı ise eşit aralık bırakmıyor

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("Techpro ile java cok kolay");//Techpro ile java cok kolay
        System.out.println("\"Techpro \" ile java cok ' kolay '");//"Techpro " ile java cok ' kolay '
        //" MAHARET" hic 'DUSMEMEK' degil;

        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz

        System.out.println("\" MAHARET\" hic 'DUSMEMEK' " +
                "degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Print ile Println arasindaki farklar

        System.out.println("************ 1*************");
        System.out.print("Ali");
        System.out.println("Can");

        System.out.println("************ 2*************");
        System.out.println("Ali");
        System.out.print("Can");

        System.out.println("************ 3*************");
        System.out.print("Ali");
        System.out.println("Can");

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
     /*
          A
         A A
        A A A
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


    }//main
}//class
