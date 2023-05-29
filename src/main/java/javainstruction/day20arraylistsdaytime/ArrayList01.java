package javainstruction.day20arraylistsdaytime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {

  /*
    1- String class kullanmak tercih edilir.Çünkü String class method acısından oldukca zengindir.
    2- ListOf kullanarak kısa yoldan List olusturabilirsiniz, ama;
        i  : Bu Listlerin elemanları değiştirilemez.
        ii : Bu Listlere yeni eleman eklenemez.
        iii: Bu Listlerden eleman silinemez.

   */

    /*
    Example 1: Kullanıcının girdiği harf List'te varsa o harfi  harfi "Buldum!" a
     cevirin yoksa o harfi list'e ekleyin
     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if(counter == size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);
            }
            counter++;

        }while(true);



    }//main


}
