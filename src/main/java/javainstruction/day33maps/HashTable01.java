package javainstruction.day33maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    HashMap ile HashTable arasındaki fark nedir?
    1- HashMap "thread-safe" degildir. HashTable "thread-safe"dir. "thread-safe"--> aynı anda birden fazla iş yapmak demektir.
       HashMap "synchronized" degildir. HashTable "synchronized"dir.
    2- HashMap bir tane null key'e ve istediğiniz kadar null value'ye izin verir.
       HashTable key'lerde de value'larda da null kullanılmasına izin vermez.
    3- HashMap hızlıdr, HashTable HashMap'e gore yavastır.
     Note: HashMap ve HashTable ikiside entry'leri rastgele sıralar.
    */
    public static void main(String[] args) {

        Hashtable<String,Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85); //  --> HashTable'ların key lerine null konulamaz
        //stdAges.put("Chris",null); //  --> HashTable'ların value lerine de null konulamaz

        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}


    }
}
