package javainstruction.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
        1) Bir method "aynı isim" ve "farklı "Method Overloading"lerle" oluşturulursa buna "Method Overloading" denir.
        2)"Method Overloading" java da "iyi organizasyon" için önemlidir.
        3)"Method Overloading" yaparken parametre 3 şekilde değiştirilebilir:
           i- Parametrelerin sayıları değiştirilebilir.
           ii- Parametrelerin data type'ları değiştirilebilir.
           iii- Parametrelerin data type'ları aynı ise yerleri değiştirilebilir.
        4)"Method Overloading"  bir class'ın içinde olusur bu yuzden "privat" method lar da overload edilebilir.
           "Method Overloading" bütün Access modifier larda kullanılabilir.
        5) Static method lar overload edilebilirler.
     */

    public static void main(String[] args) {

        System.out.println(add(3,5));

    }

    public static int add(int a, int b) {

        return a + b;
    }
    public static int add(int a, int b,int c) {

        return a + b + c;
    }
    public static double add(double a, int b) {

        return a + b;
    }
    public static double add(int a, double b) {

        return a + b;
    }



}
