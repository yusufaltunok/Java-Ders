package javainstruction.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        /*
        1- TreeMap "thread-safe" ve "synchronized" degildir.
          Note: Map'lerde "multy thread" kullanmanız gerektiğinde sadece HashTable kullanabilirsiniz.
         2-TreeMap ler value larda null kullanımına izin verir, key lerde izin vermez
         3- TreeMap entry leri key lerine gore naturel order a göre siraya koyar. bu yuzden çooook yavaştır.

         */

        long t1 = System.nanoTime();

        TreeMap<String,Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("Usa",400000000);
        countryPopulations.put("Nedherland",18000000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagaskar",30000000);
        System.out.println(countryPopulations);//{Belgium=12000000, Brasil=215000000, Finland=8000000, France=75000000, Germany=85000000, Madagaskar=30000000, Mexico=125000000, Nedherland=18000000, Turkiye=83000000, Usa=400000000}
        long t2 = System.nanoTime();

        HashMap<String,Integer> countryPop = new HashMap<>();

        countryPop.put("Usa",400000000);
        countryPop.put("Nedherland",18000000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagaskar",30000000);


        TreeMap<String,Integer> countryPop2 = new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long t3 = System.nanoTime();

        System.out.println(t2-t1);//1224600
        System.out.println(t3-t2);//140100

        // HashMap oluşturup sonra TreeMap e çavirirsek daha hızlı çalısır.


    }
}
