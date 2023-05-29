package javainstruction.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Spesific bir elemanın array de olup olmadığını anlamak için gereken code u yazınız.

        String names[] = {"K", "C", "R", "A", "S"};

        String el = "K";

        // 1. Way
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }

        if (counter>0){
            System.out.println("Array has " + el);
        }else {
            System.out.println("Array does not have " + el);
        }


        // 2. Way: binarySearch() method hizli arama yapar.

        Arrays.sort(names);

        // binarySearch() methodunu sort() kullanmadan kullanmayınız.Çünkü binarySearch() mantığı sıralı elemanlar için geçerlidir.
        // binarySearch() methodunu var olan elemanlar için size o elemanın indexini verir.
        // binarySearch() methodundan aldığınız index 0 veya 0 dan büyükse bu o eleman arrayde var demektir.
        // binarySearch() methodu olmayan elemanlar için negatif tam sayı değeri verir.
        // "-" işaretinin anlamı o eleman yok demektir.
        // sayı ise o eleman olsaydı kaçıncı eleman olurdu demektir.

        int result = Arrays.binarySearch(names, el );
        System.out.println(result);

        if (result < 0){
            System.out.println("Array does not have " + el);
        }else {
            System.out.println("Array has " + el);
        }

    }
}
