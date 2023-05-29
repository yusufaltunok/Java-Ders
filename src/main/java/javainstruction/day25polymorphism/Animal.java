package javainstruction.day25polymorphism;

public class Animal {

    /*
    1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir.
    2)Child'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan dar olamaz.
    3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar olabilir.

    4)Method'un Return type'ı primitive ise Overriding yapıldıgında Return type değiştirilemez.
    5)Method'un Return type'ı primitive void ise Overriding yapıldıgında Return type değiştirilemez.

    6)Child'da Override edilen method'un Return type'ı Parent'taki method'un Return type'ı "IS-A" ilişkisi varsa
        Return type'ı değiştirilebilir. Aksi takdirde değiştirilemez.
        Mesela Integer Wrapper Class ile Long Wrapper Class arasında IS_A ilişkisi yoktur.
        O yuzden return type Integer olduğunda Long'a değiştirilemez.

    7) Return type Wrapper Class oldugunda, Override yaparken  "return type" degistirilemez.
    8) "final method"lar Override edilemez.
        "final method"lar body'si değiştirilemez ama Override ederken method body'i değiştiririz.
        Bu bir çelişkidir. Bu yuzden Java "final method"ların Override edilmesine izin vermez.

    9)"static" method'lar Override edilemezler. Çunku ststic method lar tum Child'lar için ortak method'lardır.
       Bir Child ortak methodu değiştirdiğinde Child lar bundan etkilenir. Bu etkilenme ummadık sonuçlar artaya çıkarabilir.
       Bu yuzden Java "static method"ların Override edilmesine izin vermez.

    10)"private method"lar Override edilemez.
     */


    public void move(){
        System.out.println("Animals move...");
    }

    public int add(int a, int b){
        return a+b;

    }

    public Animal create(){
        return new Animal();
    }
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;

    }

}
