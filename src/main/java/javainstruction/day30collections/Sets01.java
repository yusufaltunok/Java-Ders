package javainstruction.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        /*
        1- Set'ler tekrarsız eleman (unique) depolamak için kullanılır.
        2- 3 tane Set Class vardır.
            i) HashSet Class :
                               "Hash" Benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                               "HashSet" elemanları rastgele sıralar.
                               "HashSet" elemanları sıralamadıgından cok hizli calisir.
                               "HashSet"ler "null"ı eleman olarak kabul eder.
                               "HashSet"ler tekrarsız eleman depolamak içindir.

            ii) LinkedHashSet Class :
                        "LinkedHashSet"ler elemanları sizin verdiğiniz sıraya gore dizdiklerinden (insertion order)
                        "HashSet"lere gore daha yavas calışırlar.
                        "LinkedHashSet"ler tekrarsız eleman depolamak içindir.

            iii) TreeSet Class
                        "TreeSet"ler elemanları naturel order'a gore dizerler.
                        "TreeSet"ler elemanları naturel order'a gore dizdiklerinden cooooook yavastirlar.
                        En yavas Set "TreeSet"tir.
         3- TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz.


         */

        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");// Tekrarlı eleman eklediğinizde hata vermez ama tekrarlı elemanı sadece bir kez ekler.
        hs.add(null); // null'ı her zaman en basa koyar
        hs.add(null);

        System.out.println(hs); // [null, Zeki, Ajda, Cuneyt, Esra, Ezel]
        System.out.println(hs.hashCode());// javanın HashSet için ürettiği id'yi verir


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        System.out.println(lhs);//[234, 87, -32, 124, null] verilen sıraya gore dizer


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs); // [87, 124] -> ilk LinkedHashSet'teki farklı elemanlar silindi
        System.out.println(ls); // [451, 87, -231, 124]


        TreeSet<Character> ts =new TreeSet<Character>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); TreeSet null eklenemez cunku alfabetik sıralamada null'ın yeri belli değildir.

        System.out.println(ts); // [A, G, R, U, Z] alfabetik sıra

        System.out.println(ts.first()); // A ilk elemanı verir
        System.out.println(ts.last()); // Z son elemanı verir
        System.out.println(ts.lower('R')); // R -> verilen elemandan bir önceki elemanı verir.
        System.out.println(ts.lower('D')); // A olmayan elemanlar içinde çalışır. olsa ondan önceki elemanı verir
        System.out.println(ts.higher('K'));; //R -> verilen elemandan sonraki elemanı verir.

        System.out.println(ts.headSet('R'));// [A, G] R'den öncekileri verir. R hariç
        System.out.println(ts.tailSet('G'));//[G, R, U, Z] parantez içindeki dahil
        System.out.println(ts.headSet('R',true));;//[A, G, R]
        System.out.println(ts.tailSet('G',false));;//[R, U, Z]

        System.out.println(ts.ceiling('R'));//R ->Eleman set'in içinde varsa elemanın kendisi return eder
        System.out.println(ts.ceiling('K'));//R ->Eleman set'in içinde yoksa sonraki eleman return eder.

        System.out.println(ts.floor('G'));//G ->Eleman set'in içinde varsa elemanın kendisi return eder
        System.out.println(ts.floor('J'));//G ->Eleman set'in içinde yoksa önceki eleman return eder.

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U] -> ilk parametre dahil ikinci parametre hariç verir
        System.out.println(ts.subSet('G',false, 'Z',true)); //[R, U, Z] G hariç Z dahil
    }

}
