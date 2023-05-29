package javainstruction.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        1- Array, java nın aynı "data type" ında "çoklu data" depolamak için oluşturduğu bir yapıdır.
        2- Array ler "primitive data type" ları veya "reference" lar ile çalışır.
        3- Array ler "super fast"dir ve "memory"de çok az yer kaplarlar.
         */

        //Array nasıl oluşturulur
        String sdtNames[] = new String[5];

        // Array nasıl yazdırılır
        System.out.println(Arrays.toString(sdtNames));//[null, null, null, null, null]


        // Array'e nasıl eleman eklenir
        sdtNames[0] = "Ahmet";
        sdtNames[1] = "Ibrahim";
        sdtNames[2] = "Yusuf";
        sdtNames[3] = "Ayse";
        sdtNames[4] = "Iclal";
        System.out.println(Arrays.toString(sdtNames));

        // Array'deki spesific bir elemanı nasıl alabiliriz
        System.out.println(sdtNames[3]);

        // Example 1: stdNames array'indeki her ismin sonuna yıldız koyarak console'a yazdırınız

        //1. Way

        for (int i = 0; i < sdtNames.length; i++) { //length Stringlerde parantezli, Array'lerde parantezsiz kullanılır
            System.out.println(sdtNames[i] + "*");
        }

        System.out.println("--------------------------");

        //2.Way for-each loop ==> Enhanced (Zenginleştirilmiş) loop -Mümkünse  for-each loop kullanın

        for (String w : sdtNames) {
            System.out.println(w + "*");
        }

        //  Example 2: Bir Integer Array oluşturunuz, 5 eleman ekleyiniz, elemanların toplamını bulup console'a yazdırınız.
        int ages[] = new int[5];

        System.out.println(Arrays.toString(ages));//[,0,0,0,0,0]
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages));// [12,23,9,38,27]

        int sum = 0;
        for (int w : ages) {
            sum = sum + w;

        }

        System.out.println(sum); // 109

        //  Example 3: Bir char Array oluşturunuz, 3 eleman ekleyiniz, elemanların çarpımını bulup console'a yazdırınız.

        char initials []=new char[3];

        initials[0] = 'J';// Ascii 74
        initials[1] = 'P';// Ascii 80
        initials[2] ='A';// Ascii 65

        int carpim = 1;

        for (int w : initials) {
            carpim = carpim * w;
        }
        System.out.println(carpim);//384800

    }

}
