package javainstruction.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        stdAges.put("Tom",83); // key'ler tekrarsız olmalı. Tekrarlı olursa en son verilen entry'nin değerini alır.
                                // yani veriyi günceller. Buna overwrite denir.

        // HashMap, HashSet'te oldugu gibi entry'ler rastgele sıralar ve çok hızlı çalısır.
        // Map'ler entry'leri sıralarken key'lere bakarak sıralama yapar.
        System.out.println(stdAges); //{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        // replace methodu "value"ları key'leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //replace("Angelina",57,61);Angelina 58 Map'in içinde varsa 61 yapar yoksa değiştirmez.
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //utIfAbsent("Brad", 60); Map'te 'Ali' key olarak yoksa Map'e Ali 60'ı ekler varsa eklemez.
        stdAges.putIfAbsent("Ali", 60); //
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        // getOrDefault("Ayse", 0)); methodu Map de varolan key'ler için get() methodu ile aynı çıktıyı verir.
        // getOrDefault("Ayse", 0)); methodu Map de olmayan key'ler için ikinci parametreye koydugumuz değeri,
        // get() methodu ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom", 0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        System.out.println(stdAges.containsValue(77));// true --> value içinde 77 var mı
        System.out.println(stdAges.containsValue(99));// false --> value içinde 99 var mı

        System.out.println(stdAges.containsKey("Ali"));//true --> key içinde Ali var mı

        // key kullanarak "entry"yi silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        // mapde key'i "Tom",  value'su 81 olan bir entry varsa onu siler yoksa silmez.
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAges = new HashMap<>();
        kidsAges.put("Jahn", 12);
        kidsAges.put("Jim", 22);
        kidsAges.put("Jack", 32);

        // stdAges.putAll(kidsAges); metodu stdAges Map'ine kidsAge Map'ini ekler.Dolayisiyla stdAges Map'i degismis olur.
        // Ama kidsAge Map'i degismez
        stdAges.putAll(kidsAges);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Jack=32, Ezel=39, Jahn=12, Jim=22}


    }
}
