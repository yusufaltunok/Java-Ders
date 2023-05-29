package javainstruction.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {


        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]
        // elemanları verilen sıraya gore dizdi cunku constructor olarak LinkedList kullandık.

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese] 1. silindi

        System.out.println(wareHouse.peek());//Meat --> silmeden 1. yi verir
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll());//Meat ilk elemanı size verir ve siler
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();

        System.out.println(wareHouse.poll());//null

        System.out.println(wareHouse.remove());//NoSuchElementException (eleman yok hatası)

    }
}
