package javainstruction.day31collectionsmaps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
/*
        Map denilince akla sozluk gelsin.
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
        "key" kismi tekrarsiz, "value kismi tekrarlı olabilir.
        Map'ler key=Value structure'ını kullanır.
        Map'lerdeki elemanlara "Entry" denir. Elemanların tamamına ise "EntrySet" denir.
        "Entry"ler tekrarsız olduğu için "EntrySet" denir.
        2 tane data type kullanılır 1. Key için 2. Value için
        Key ve Value'lar ayrı data tipinde olabilir.
        Map lar collection değildir, farklı bir yapıdır.

        HashMap ler Entry'leri rastgele sıralar bu yuzden en hızlı Map'dir(HashSet gibi)

 */
        // Map nasıl olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasıl eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Nederland",18000000);

        System.out.println(countryPopulation); // {Turkiye=83000000, USA=400000000, Nederland=18000000, Germany=83000000, Albania=3000000}

        // get() methodu "key" ile çalısır ve "value" kısmını verir.
        int usaPopulation =countryPopulation.get("USA");
        System.out.println(countryPopulation); // 400000000

        //Butun key'leri nasıl alabiliriz?
        Set <String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, USA, Nederland, Germany, Albania]

        //Butun value'ları nasıl alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[83000000, 400000000, 18000000, 83000000, 3000000]

        //Example 1: country population map'indeki ülkelerin nufuslarının ortalaması nedir?

        Collection<Integer> value = countryPopulation.values();
        int sum =0;
        for (Integer w : value) {
            sum=sum + w;
        }
        System.out.println( sum / value.size());//117400000

        //entrySet(), entry'leri kalıp halinde alıp bize "Set"in içine koyarak verir
        //Map'ler Loop lar ile kullanılamaz. Sadeece entry'ler arasında gezmek istediğimizde loop kullanabiliriz.
        Set< Map.Entry<String,Integer>>entries =countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, USA=400000000, Nederland=18000000, Germany=83000000, Albania=3000000]

        //Example 1: country population map'indeki ülkelerin isimlerinin karakter sayısı ile nufuslarının toplamını bulunuz.

        int toplam =0;
        for (Map.Entry<String,Integer> w : entries ) {

            toplam = toplam + w.getKey().length() + w.getValue();

        }
        System.out.println(toplam);//587000033

    }
}
