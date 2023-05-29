package javainstruction.day28interface;

public interface Animal {

    void eat();
    void drink();

    //1-interface'lerdeki tum variale'lar otomatik oarak "final"dir.
       // Bu yuzden interface içindeki variale'ı olusturdugunuzda mutlaka deger ataması yapmalısınız.
       // Bilindiği gibi final variable'ların değerleri değiştirilemez.
    //2- interface'lerdeki tüm variable'lar otomatik (default) olarak "public"dir.
    //3- interface'lerdeki tüm variable'lar otomatik (default) olarak "static"dir

    int age = 4;








}
