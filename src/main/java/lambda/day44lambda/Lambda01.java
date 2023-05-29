package lambda.day44lambda;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.

        // lines--> text'in içindekileri satırlar halinde streem içinde verir.
        Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                forEach(System.out::println);


        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                map(String::toUpperCase).forEach(System.out::println);


        //Example 3: Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean r1 = Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                anyMatch(t -> t.contains("Java"));
        System.out.println(r1); // true


        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

        List<String> words = Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).// split Array'e çevirmişti,flatMap Array duvarlarını yıkıp stream'e koyar.
                        distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

        long numOfLetters = Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                count();// long dondurur
        // kendisinden sponra method kullanılmasına izin vermeyen methodlara "Terminal Method" denir.
        System.out.println(numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.

        List<String> letters = Files.
                lines(Paths.get("src/main/java/lambda/day44lambda/MyText.txt")).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);


    }
}
