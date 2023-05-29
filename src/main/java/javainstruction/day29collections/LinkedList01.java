package javainstruction.day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        /*
        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
        LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosterir
        ve en sondakinin sonrasi olmasa da null gosterir. LinkedListler index kullanmazlar.

        LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail (kuyruk) denir en sonda
        oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune pointer, on yuzune
        ornegimize gore harf olan kismina Data denir. Node, Data ve Pointer'den olusuyor.
        Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.

    1- LinkedListLer node silme ve eklemede cok basarili oldukları icin,
       silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullanınız.

    2- ArrayList'ler indexleri adres gibi kullanır, bu yuzden ArrayList'ler search işlemlerinde çok başarılıdırlar.
       Note : İhyiyacınız olan collection çoğunlukla silme ve ekleme işlemleri yapacaksa (müze ziyaretcileri gibi) LinkedList,
       "search" işlemleri yapacaksa (ABD eyaletleri gibi) ArrayList kullanınız.


         */

        LinkedList<String> s= new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        System.out.println(s);// [Steve, Ajda, Muge, Cuneyt, Esra]

        s.add(2,"Esen");// LinkedList index kullanmaz ama biz index kullanıyormuş gibi yazabiliriz.Java arka planda halleder.
        s.addFirst("Kemal");
        s.addLast("Ajdar");


        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove(2);
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove("Ajdar");
        System.out.println(s);

        //s.remove();
        System.out.println(s);

        //s.removeFirstOccurrence("esra");// ilk esra silindi
        System.out.println(s);

        //s.removeLastOccurrence("esra");// sondaki esra silindi
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r1 =s.peek();//ilk elemanı size verir(copy+Paste)
        System.out.println(r1);//Kemal

        String r2 =s.poll();//ilk elemanı size verir ve list'ten siler (cut+Paste)
        System.out.println(r2);//Kemal
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]
        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty
        Note: peek() ile element(), ikiside ilk elemanı silmeden size verir
              Ama peek() list bos oldugunda size "null" verir, element() ise hata verir.
        */

        s.element();// ilk elemanı silmeden size verir
        String r3 =s.poll();//ilk elemanı size verir ve list'ten siler (cut+Paste)
        System.out.println(r3);//Esra

        /*
        removes and returns the first element of this list.
       This method is equivalent to removeFirst().
       Throws: NoSuchElementException – if this list is empty
         Note: poll() ile pop(), ikiside ilk elemanı siler ve size verir
              Ama poll() list bos oldugunda size "null" verir, pop() ise hata verir.
        */


        s.pop();//
        String r4 = s.pop();
        System.out.println(r4);//Esra
        System.out.println(s);// [Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]
















    }
}
