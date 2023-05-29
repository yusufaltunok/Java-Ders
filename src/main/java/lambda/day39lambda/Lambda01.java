package lambda.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");


        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartWithT(myList);
        System.out.println();
        printElLenghtLessThanFour(myList);
        System.out.println();
        printElLenghtLessThanFourWithUpper(myList);
        System.out.println();
        printElLenghtMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToLowerCaseSorted(myList);
        System.out.println();
        printElUniqueToLowerCaseSortWithLenght(myList);


    }

    // Example 1: Bir List'teki elemanları console'a yazdıran method'u olusturunuz.
    // 1.YOl
    public static void printElements(List<String> myList) {

        for (String w : myList) {       // --> yapısal kod ==> Structured Programing
            System.out.print(w + " "); // Tom Jim Clara Tom Clara Angelina
        }
    }

    // 2.YOl : Lambda Expression
    public static void printEl(List<String> myList) {

        myList.stream(). // Stream() dataları akışa sunar.
                forEach(t -> System.out.print(t + " ")); // Tom Jim Clara Tom Clara Angelina  List i stream çevir.
        // Functional Programing == sadece metot kullanılan mimarinin önemli olmadığı
        // Lambda ==> Functional Programing'dir
    }
    // stream yukarıdan asagıya sıralayan bir metottur.
    // forEach ilk elemanı alır t nin içine koyar. sonra 2. elemanı alıp koyar...


    // Example 2: Bir List'teki T ile baslayanlar hariç tum elemanları console'a yazdıran method'u olusturunuz.

    public static void printElExceptStartWithT(List<String> myList) {

        myList.stream().
                filter(t -> !t.startsWith("T")).
                forEach(t -> System.out.print(t + " ")); // Jim Clara Clara Angelina

    }

    // Example 3: Bir List'te character sayısı 4 den az olan tum elemanları console'a yazdıran method'u olusturunuz.

    public static void printElLenghtLessThanFour(List<String> myList) {
        myList.stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " ")); //Tom Jim Tom
    }

    // Example 4: Bir List'teki  charcter sayisi 4 den cok olan tum elemanlari buyuk harflerle consol'e yazdiran method'u olusturunuz.

    public static void printElLenghtLessThanFourWithUpper(List<String> myList) {

        myList.
                stream().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()). // bir şeyin yapısını dağiştireceksek "map" kullanmalıyız
                forEach(t -> System.out.print(t + " ")); //CLARA CLARA ANGELİNA
        //filter() ile lenght i 4 den buyuk olanları seçtik. ve 4 den buyuk olanları yazdırdık
    }

    // Example 5: Bir List'teki  charcter sayisi 4 den cok olan tum elemanlari tekrarsız olarak kucuk harflerle
    // consol'e yazdiran method'u olusturunuz.

    public static void printElLenghtMoreThanFourUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                distinct(). // tekrarsız
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " ")); // clara angelina
        // distinct() tekrarsızları alır
    }

    // Example 6: Bir List'teki  elemanlari tekrarsız olarak buyuk harflerle alfabetik sırada
    // consol'e yazdiran method'u olusturunuz.

    public static void printElUniqueToLowerCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()). // map() var olan elemanı değiştirmek için kullanılır.
                sorted(). // naturel order olarak çalısır. a!dan z'ye, 1'den buyuge...
                          // tersten sıralamada reverse order'dır
                forEach(t -> System.out.print(t + " ")); // ANGELİNA CLARA JİM TOM
    }

    // Example 7: Bir List'teki  elemanlari tekrarsız olarak kucuk harflerle uzunluklarına gore kucukten buyuge sıralayarak
    // consol'e yazdiran method'u olusturunuz.

    public static void printElUniqueToLowerCaseSortWithLenght(List<String> myList) {

        myList.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())). // sıralamanın kuralını biz belirleyeceksek Comparator.comparing() kullanırız.
                forEach(t -> System.out.print(t + " ")); // tom jim clara angelina
      // Comparator: karşılaştırıcı class'ı, comparing: karşılaştırma
    }
}