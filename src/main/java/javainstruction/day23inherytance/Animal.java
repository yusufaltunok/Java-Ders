package javainstruction.day23inherytance;// miras demektir

public class Animal {

    /*
        1- eat() methodu gibi birçok class'ın kullanması gereken method'ları ayrı ayrı yazarsak;
         i) Tekrar yapmış oluruz, tekrar ideal kod da olmamalıdır.
         ii) Aynı methodu tekrar tekrar yazmak zaman kaybıdır.
         iii) Tekrar tekrar yazılan methodun tamiri çok zaman alır.
         iv) Tekrar tekrar yazılan methodun geliştirilmesi çok zaman alır.
         v) methodu tekrar tekrar yazmak "atomic yapı"ya terstir.
        2- private class member lar child class lar tarafından kullanılamaz
           public class member lar child class lar tarafından kullanılabilir.
           default class member lar aynı package de child class lar tarafından kullanılabilir.
           protected class member lar farklı package de olsalar da child class lar tarafından kullanılabilir.
        3- Java da bir class ın sadece bir tane parent'ı olabilir.
           Çoklu parent'a "multyple inheritance" denir, tekli parent'a "single inheritance" denir.
           Java "multyple inheritance"i desteklemez, Java "single inheritance" kullanır.
        4- Apartman seklindeki inheritance yapısına "Multylevel inheritance" denir.
            Java "multylevel inheritance"ı destekler.
     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){

        System.out.println("Animals drink...");
    }

}
