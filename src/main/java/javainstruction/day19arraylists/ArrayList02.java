package javainstruction.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    /*
    Bir methodu öğrenirken aşağıdaki 3 şeyi öğrenin
     1- O method ne iş yapar?
     2- O method nasıl kullanılır?
     3- O method size neyi verir?
     */

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun]

        // ArrayList'te bir elemanın ilk gorunumu nasıl silinir?
        System.out.println(cities.remove("Miami")); //true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        // ArrayList'te bir eleman indexi kullanılarak nasıl silinir?
        System.out.println(cities.remove(2)); //2. index Barcelona silinir.
        System.out.println(cities); //[Giresun, Yozgat, Miami, Giresun]


        //ArrayList oluştururken en basa ArrayList yerine List de yazabilirsiniz.
        List<Integer>ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        // Example 1: 12 elemanını ages List'ten siliniz.
        // int list lerde elemanı silmek istersek Wrapper Integer'a çevirmemiz gerekir
        ages.remove((Integer)12);

        System.out.println(ages); //[23, 7, 4]

        // Bir ArrayList'te bir elemanın tum görunumlerini nasıl sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);//[Miami]

        // kısa yoldan bir list oluşturmak için aşağıdaki List.of() methodu kullanılabilir.
        List <Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]

        List<Character> letters = List.of('a','c','k','d','k');
        System.out.println(letters);//[a, c, k, d, k ]


        // İki ArrayList'in birbirine eşit olup olmadığını nasıl anlarız?
        //equals() methodu aynı elemanlar aynı indexte olduğu sürece true verir.
        boolean r1 =initials.equals(letters); //false

        // indexOf('k') yazarsanız 'k' nın ilk gorunumunun index ini verir.
        int r2 =initials.indexOf('k');
        System.out.println(r2);//1

        // LastIndexOf('k') yazarsanız 'k' nın son gorunumunun index ini verir.
        int r3=initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Ex.1) Bir listteki tekrarsız elemanları console'a yazdıran kodu yazınız.
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w : prices){
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w + " "); //3.75 4.0
            }
        }

        //Ex.1) Bir listte tekrarlı eleman olup olmadığını gösteren kodu yazınız.
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        int counter =0;
        for (Double w : heights){

            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All element are unique in the list");
        }else {
            System.out.println("At least one element is not unique in the list");
        }
















    }//main
}
