package Q02_KullaniciBilgileri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     /*
//       6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    */

        List<String > iller = new ArrayList<>(Arrays.asList("Van","MUS","Ordu","MUS","Hatay"));

        System.out.println(krktrSayilarininKaresi(iller));

    }

    public static List<String> krktrSayilarininKaresi (List<String>iller){
        System.out.println("6) ");

        iller.
                stream().
                map(t->t.length()*t.length()).
                forEach(System.out::println);

        return iller;


    }
}


