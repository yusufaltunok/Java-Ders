package javainstruction.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {

     /*
        1- Iterator'lar loop'ların yaptığı aynı işi yapar.
        2- Iterator'larda sonsuz loop oluşma ihtimali yoktur.
        3- Iterator'lar ile loop'lar arasında performans farkı yoktur.
        4-- Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemanı değiştirme konusunda daha basarilidir..
        5- İki tip iterator var:
           i)Iterator: Bu sadece eleman silmede kullanılır.
                       Eleman eklemek veya elemanı değiştirmek mümkün değildir.
           ii) ListIterator : Bu eleman silebilir, ekleyebilir ve değiştirebilir.
        Note : "Iterator" sadece  soldan saga (ilk elemandan son elemana) çalışır.
               ListIterator ise iki yonlu çalışabilir.

     */
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); // [Tom, Jim, Clara, Angie, Mark]

        // "Iterator" kullanalım
        Iterator<String> myItr = myList.iterator(); // [Tom, Jim, Clara, Angie, Mark]
                                          // iterator ilk elemanın başına bir pointer koyar.

        while (myItr.hasNext()){ // hasNext pointer'a senden sonra eleman var mı diye sorar
                                 // eleman varsa true yoksa false return eder
                                 // tum elemanlar silinince senden sonra eleman var mı diye sorar ve false dondurur, loop kırılır
            myItr.next();  // next pointeri bir sonraki elemanın onune taşır ve üstünden atladığı elemanı return eder

            myItr.remove(); // her dongude next() metodunun return ettiği elemanı siler.

        }

        System.out.println(myList); // [] iterator kullanarak listi sildik


        // "ListIterator" kullanalım

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

       ListIterator<String> yourListItr = yourList.listIterator(); // list'i listIterator'a cevirdik

        while (yourListItr.hasNext()) {

            String el = yourListItr.next();

            yourListItr.set(el+"!");// set() metodu ile List'i update ettik

        }

        System.out.println(yourList); // [Tom!, Jim!, Clara!, Angie!, Mark!]

        // hasPrevious() ve previous() nasıl kullanılır?

        while (yourListItr.hasPrevious()) { // pointer'ı en sona yollamadan hasPrevious ve previous kullanamayız.

            String el = yourListItr.previous(); // hasNext()'in tersi, sondan basa
            System.out.println(el); // sondan basa dogru yazdırdı
            yourListItr.set("?" + el);
        }
        System.out.println(yourList); // [?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        // En sondan en basa nasıl iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);//

        Iterator<String> ourListItr = ourList.descendingIterator();// sondan basa, ters sıra demektir.

        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        //descendingIterator() metodu ile tersten direk yazdırabiliriz.Ama sadece LinkedList ile kullanabiliriz.
        }



    }
}
