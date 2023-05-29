package javainstruction.day28interface;

    /*
       Child     Parent
    1- Class --> Class : extends (class, class'ın parenti olursa extends)
       interface --> interface : extends
       Class --> interface : implements
       interface --> class : olamaz
       Aynı ise extends, farklı ise implements kullan
       interface'i class'ın child'ı yapma.

           ABSTRACT CLASS İLE INTERFACE ARASINDAKİ FARKLAR NELERDİR?
    1- Abstract class'lar hem abstract hem de concrete method'lar içerebilir ama interface'ler sadece abstract method içerir.
       Ama interface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
    2- Abstract class'lar multyple inheritance'i desteklemez ama interface'ler destekler.
    3- Abstract class'lar içinde her turlu variable olusturulabilir, interface'ler içindeki variable'lar "public", "static" ve "final" olmak zorundadır.
    4- "interface" Class'ın child'ı olmaz ama "abstract class" class'ın child'ı olabilir.
    5- Abstract class'larda constructor vardır ama object üretemez, interface'lerde constructor yoktur bu yuzden object üretilemez.

     */

public interface Mammal extends Animal {
    String feedBaby = "Milk";
    int age = 6;




}
