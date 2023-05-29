package javainstruction.day27interface;

   /*     interface'deki method'lar
      1- "interface" içine "concrete method" konulamaz.
      2- "interface" içindeki method'ların abstract oldugunu Java bilir.
         Bu yuzden "interface" içindeki "abstract" method'larda "abstract"
         keyword kullanmaya gerek yoktur.
      3- "interface" içindeki abstract method'ların tamamı public'tir.
          Bu yuzden "interface" içinde "abstract" method olustururken
          "access modifier" yazmaya gerek yoktur.
      4- Bir "interface"i bir class'ın parent'ı yapmak istediğinizde
         "extend" keyword yerine "implement"keyword kullanınız.
      5-"Concrete child Class"lar parent interface'deki abstract method'ları
         owerride etmek zorundadırlar.
      6- "interface"ler bir application'da "Concrete child Class"ların yapmak zorunda oldukları
          fonksiyonları barındırırlar. Bu yuzden "interface"lere "to-do list" denir.
      7- Birden fazla "parent interface" içinde aynı isimli abstract method'ları olusturabilirsiniz.
         abstract method'ların body'si olmadıgı içic child class'lar aynı isimli method'lardan herhangi birini
         override ederek kullanabilirler.
      8- Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda
         bu method'larin "return type"lari ayni olmak zorundadir.
      9- Normalde "interface" içine "Concrete method" konulmaz ama bazı durumlarda "Concrete method"
         koymamız gerekirse;
               i) "default" keyword'unu asagidaki gibi kullanarak "interface" içine "Concrete method"
                   koyabiliriz. default void eco(){System.out.println("Uses gas less..."); }
               ii) "static"  keyword'unu asagidaki gibi kullanarak "interface" içine "Concrete method"
                   koyabiliriz. static void stop(){ System.out.println("Stops securely..."); }
      10- "default" veya "static" keyword'unu kullanarak olusturdugunuz "Concrete method"ların
          "Concrete" child class'lar tarafından kullanılma zorunlulugu yoktur.
      11- "default" keyword'unu kullanarak olusturdugunuz "concrete methodla'lara "object" olusturarak ulaşabilriz
          "static" keyword'unu kullanarak olusturdugunuz "concrete methodlar"lara ulasmak için "Object"
           olusturmaya gerek yoktur ,  "interface" ismi yeterlidir.
      12- "interface"lerden "object" oluşturulamaz. "interface"lerin "constructor"ı yoktur.

   */

public interface Engine {

     void start();

     void payment();

     default void eco(){
          System.out.println("Uses gas less...");
     }
     static void stop(){
          System.out.println("Stops securely...");
     }






}
