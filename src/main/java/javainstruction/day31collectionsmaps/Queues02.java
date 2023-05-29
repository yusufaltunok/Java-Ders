package javainstruction.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>(); // Priority --> oncelik demektir, belirlenen onceliğe gore sıralama yapar.

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]
        // sıralama için olcut belirlemezsek java kendi sıralar.

      //Deque == Double ended Queue --> iki uclu kuyruk demektir
    //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur
        Deque<String> d =new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");

        /*
         Queue bir interface'dir, bu yuzden constructor'ı yoktur. dolayısıyla oblect olusturuken new keyword'unden sonra kullanılamaz.
         Datatype "Queue" olan bir object olusturmak için new keyword'unden sonra
          a- LinkedList
          b- PrioryQueue Class ları kullanılabilir.
         Queue olustururken contructor olarak PrioryQueue kullanırsanız elemanları kendi belirleyeceğiniz kurala gore sıralama hakkınız olur.
         */







    }
}
