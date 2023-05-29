package javainstruction.day26abstraction;

 /*
    1)Bazen parent class'daki method'un body'si hicbir child class   tarafindan kullanilmaz.
          Bu durumda parent'daki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
          Biz de o method'a body yazmayiz.

    2)Body'si yazilmayan method'a "Abstract Method" denir.
          Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.

    3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
          keyword'unu kullanarak Java'ya bu method'un body'si olmayacak deriz.

    4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
          normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.

    5) Parent'taki method abstract ise bütün child class lar o methodu override etmek zorundadır.
       Bu yuzden tum child lar için mecburi olmasını istediğimiz fonksiyonları
       abstrack yapmak mantıklı bir seçimdir.

    6)Bodysi olan methodlar ( Concrete Method ) abstract class ların içine yazılabilir.
      abstract methodlar Concrete class ların içine yazılamazlar.

    7) "abstract" keyword ile method body bir method'da aynı anda kullanılamaz.

    8)"abstract" class ların içinde   abstract methodlar olur. abstract methodlar
      body'si olmadığından eksik method'lar gibi düşünülebilir.
      Yani abstract class içinde eksik bir yapı barındırır, siz abstract class
      object üretirseniz abstract class içindeki eksiklik object'e yansır ve object
      eksiği olan bir object olur.
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir

    9)"abstract" class'ların constructor'ı vardır ama object oluşturamazlar.

    10) "final" method'lar "abstract" olamazlar.

    11) "private" method'lar "abstract" olamazlar.

    12)"abstract" class'ın "abstract" child'ı veya concrete child'ı olabilir.
  */

    /*
        "final" keyword'u açıklar mısınız?

      "final" keyword i) variale'larda  ii) method'larda  iii) class'larda kullanılır.

        i)variale'larda kullanıldığında  a- O variale'a kesinlikle değer ataması yapılmalıdır.
                                         b- ilk atanan değer değiştirilemez.

        ii) method'larda kullanıldığında a- O method'un body'si değiştirilemez.
                                         b- O method override edilemez.

        iii) class'larda kullanıldığında a- O class'ın child class'ı olamaz ama final class'ın kendisi child olabilir.

     */

public abstract class Courses {

    public abstract void math ();

    public void art(){

        System.out.println("Learn art");
    }













}
