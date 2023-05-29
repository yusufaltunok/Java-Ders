package lambda.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String > iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","Ordu","MUS","Gaziantep","Hatay","Edirne"));

        bykHrfLenghtArtanDistinct(iller); // VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
        System.out.println();
        bykHrfSonHarfArtanDistinct(iller); // KUTAHYA ANKARA GUMUSHANE EDİRNE VAN GAZİANTEP MUS ORDU HATAY
        System.out.println();
        bykHrfLenghtArtanDistinctLenghtAlfabetikSira(iller);//MUS VAN ORDU HATAY ANKARA EDİRNE KUTAHYA GAZİANTEP GUMUSHANE
        System.out.println();
        System.out.println(krktrSayisiBesFzlOlanlariSil(iller)); // [Van, MUS, Ordu, MUS, Hatay]
        System.out.println();
        System.out.println(hIleBaslayanOrRIleBitenElSil(iller)); // [Van, MUS, Ordu, MUS]
        System.out.println();
        System.out.println(krktrSayilarininKaresi(iller));
        System.out.println();
        System.out.println(krktrSayisiCift(iller)); // [Ordu]


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtanDistinct (List<String>iller){

        System.out.println("1) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t -> System.out.print(t+" ")); // VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarfArtanDistinct (List<String>iller){
        System.out.println("2) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t -> System.out.print(t+" ")); // KUTAHYA ANKARA GUMUSHANE EDİRNE VAN GAZİANTEP MUS ORDU HATAY

    }




        // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfLenghtArtanDistinctLenghtAlfabetikSira (List<String>iller) {
        System.out.println("3) ");
        iller.
                stream().
                distinct().
                //map(t->t.toUpperCase()). // Lambda Expression
                map(String :: toUpperCase). // Ustteki ile aynı method referans yontemi
                //sorted(Comparator.comparing(t->t.length())). //Lambda Expression
                sorted(Comparator.comparing(String ::length). // method referans yontemi
                thenComparing(Comparator.naturalOrder())). // Ustteki ile aynı method referans yontemi
                //forEach(t -> System.out.print(t+" ")); // Lambda Expression MUS VAN ORDU HATAY ANKARA EDİRNE KUTAHYA GAZİANTEP GUMUSHANE
                forEach(System.out::println); // method referans yontemi (alt alta yazıyor)
    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz

    public static List <String> krktrSayisiBesFzlOlanlariSil (List<String>iller) {
        System.out.println("4) ");

        iller. // stream()' de remove()'a ulasamadığımız için burada kullanmadık
                removeIf(t -> t.length() > 5);

        return iller; // Donus tipi olarak List (sadece ekrana bastırmak için void de kullanabilirdik) seçtiğimiz için return yaptık

    }

        // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

        public static List<String> hIleBaslayanOrRIleBitenElSil (List<String>iller) {
            System.out.println("5) ");

            iller.
                    removeIf(t->t.startsWith("H")||t.endsWith("r"));

            return iller;
        }

        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

        public static List<String> krktrSayilarininKaresi (List<String>iller){
            System.out.println("6) ");

            iller.stream().map(t->t.length()).forEach(Math::sqrt);




            return iller;


        }


        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> krktrSayisiCift (List<String> iller){

        System.out.println("7) ");
        iller.
                removeIf(t -> t.length() %2==1);

        return iller;
    }
  // iller.stream().filter(t -> t.length()%2==0).forEach(t -> System.out.print(t+""));

}
