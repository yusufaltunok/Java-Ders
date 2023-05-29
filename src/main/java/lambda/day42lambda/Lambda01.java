package lambda.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");


        System.out.println(sortWithLastCharDistinctUpperInList(names)); //[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]
        System.out.println(sortLenghtReversedSameLenghtInNaturalOrderLowerInList(names));//[alexander, michael, alex, alex, brad, mary, jim, tom]
        System.out.println(isLenghtMoreThanTwo(names)); //true
        System.out.println(noLenghtLessThanThree(names));//true
        System.out.println(atLeastOneLenghtLessThanFour(names));//true


    }

    // Example 1: List elemanlarını son harflerine gore natural order'da tekrarsız olarak buyuk harfle bir List'in içinde return ediniz
    // Tom,Alex,Jim,Michael,Mary,Alexander,Alex ==> [ MİCHAAEL, TOM, JIM,  ALEXANDER, ALEX,MARY ]

    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length() - 1))).
                collect(Collectors.toList());// sonucu list olarak almak için kullandık
        // normalde distinct elemanları depolamak için set kullanılır. ama lambda daki  collect(Collectors.toSet() metodu elemanları
        // rastgele sıralar. halbuki bu soruda rastgele sıralama kabul edilmiyor.
        // bu uzden mecburen  collect(Collectors.toList() kullandık

    }

    // Example 2: List elemanlarını karakter sayılarına gore ters sırada  kucuk harfle bir List'in içinde return ediniz
    //           Aynı karakter sayısına sahip elemanlar kendi içinde alfabetik sırada plsun.
    // Tom,Alex,Jim,Michael,Mary,Alexander,Alex ==> [Alexander,,Michael,Alex,Alex,Mary,Jim,Tom]

    public static List<String > sortLenghtReversedSameLenghtInNaturalOrderLowerInList(List<String>names){

        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                // (unluklara gore sıramama kucukten-buyuge).ters cevir.uzunluktan sonra ilk harfe gore,aynı olanlar alfabetik.
                collect(Collectors.toList()); // List'in içinde yazdır
    }

    // Example 3: List elemanlarının tamamının karakter sayısının 2'den buyuk olup olmadıgını kontrol eden methodu olusturunuz.

    public static boolean isLenghtMoreThanTwo(List<String>names){
        return names.
                stream().
                allMatch(t->t.length()>2);//Bir listteki tum elemanların spesifik bir ozelliğe sahip olup olmadıgını anlamak için kullanırız.
    }


    // Example 4: List elemanlarının hiçbirinin karakter sayısının 3'den kucuk  olmadıgını kontrol eden methodu olusturunuz.

    public static boolean noLenghtLessThanThree(List<String>names){
        return names.
                stream().
                noneMatch(t->t.length()<3); // allMatch() in tersi

    }

    // Example 5: List elemanlarının en az birinin karakter sayısının 4'den kucuk olup olmadıgını kontrol eden methodu olusturunuz.

    public static boolean atLeastOneLenghtLessThanFour(List<String>names){
        return names.
                stream().
                anyMatch(t->t.length()<4);

    }

  /* Match
    allMatch() ==> tum elemanlar sarti saglarsa true dondurur
    anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
    noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
   */



}
