package javainstruction.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {

    /*
        1) Aynı data type'ındaki çoklu dataları depolamak için Array kullanırız.
        2) Array'lerin negatif yonu var; içine koyacağınız eleman sayısını başta belirlemek zorundasınız.
        3) Array'ler eleman sayısında esnek değildirler. Bu yüzden Java List adıyla yeni bir yapı oluşturdu.
           Bu yapı eleman sayısında esnektir. Hiç eleman koymazsanız eleman sayısını sıfır olarak ayarlar,
           1000 eleman koymazsanız eleman sayısını 1000 olarak ayarlar,
        4) "ArrayList" yerine sadece "List" de diyebiliriz.
        5) Java "ArrayList"leri oluşturduktan sonra Array'leri iptal etmemiştir, çünkü;
            i- Array'ler super hızlıdır.
            ii- Array'ler memoryd'e çok az yer kaplar.
        6) Array'ler primitive data type'ları ve reference'ları depolayabilir ama
           "ArrayList"ler non-primitive data type'ları depolar.
           Bu yüzden "ArrayList"ler Array'lerden daha cok yer kaplar.
     */

    public static void main(String[] args) {

        // ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        // ArrayList console'a nasıl yazdırılır?
        System.out.println(ages); // [ ]

        // ArrayList'e eleman nasıl eklenir?

        // 1. Way:
        ages.add(12);
        ages.add(24);
        ages.add(9); // add() methodu elemanları "giriş sırası"na ( insertion order ) göre list'e yerleştirir
        System.out.println(ages);// [12, 24, 9 ]

        // 2. Way:
        ages.add(1,99);//[12, 99, 24, 9] 1. indexe 99 yerleştir.
        System.out.println(ages);


        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        // 3. Way:  bir list'i diğer list'in içine yerleştirir.
        ages.addAll(price);
        System.out.println(ages); //[12, 99, 24, 9, 23, 33]

        // 4. Way: istediğimiz index'e yerleştirir.

        ages.addAll(3,price);// [12, 99, 24, 23, 33, 9, 23, 33]
        System.out.println(ages);

        // ArrayList'te eleman sayısı nasıl bulunur?
        int numOfElement = ages.size();
        System.out.println(numOfElement); // 8

        // ArrayList'te  spesific bir eleman nasıl alınır?
        int el1 = ages.get(3); // get() methodu index kullanarak istediğimiz elemanı almaya yarar.
        System.out.println(el1); //23

        // ArrayList'te  spesific bir eleman nasıl değiştirillir?
        ages.set(6,111);
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 111, 33] 3. index i değiştirdi

        // ArrayList'te spesific bir elemanın var olup olmadığını nasıl anlarız?
        boolean r1= ages.contains(99);
        System.out.println(r1);// true

        // Bir ArrayList'in boş olup olmadığını nasıl kontrol ederiz?
        boolean r2 =ages.isEmpty();
        System.out.println(r2);//false

        // Bir ArrayList'teki tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println(ages); // []

        boolean r3 =ages.isEmpty();
        System.out.println(r3); // true

        // Ex. 1) bir List'in  boş olup olmadığını kontrol eden code u yazınız.
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda)");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1. Way : burada 2 iş yapıldığı için tercih edilmez

        if (names.size()==0){
            System.out.println("Liste boştur");
        }else {
            System.out.println("List'te en az bir eleman varrdır.");
        }

        //2. Way: Java bir iş için bir method yapmışsa o kullanılmalı
        if (names.isEmpty()){
            System.out.println("Liste boştur");
        }else {
            System.out.println("List'te en az bir eleman varrdır.");
        }





    }//main
}
