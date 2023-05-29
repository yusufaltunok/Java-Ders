package javainstruction.day22stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

    /*
        1- Stringbuilder String üreten bir classs'tır.
        2- stringbuilder kullanarak String üretiriz. Java niçin stringbuilder class ı oluşturdu?
            "String Class" Immutable (değiştirilemez) String üretir, "stringbuilder" Class "mutable"( değiştirilebilir) String üretir.
        3- Immutable olmak demek orijinal değerin korunması, değiştirilemez olması demektir.
            mutable olmak demek orijinal değerin değiştirilebilir olması demektir.
        4- "capacity" Java'nın size verdiği data depolama yer sayısıdır.
            Lenght ise size verilen  data depolama yerinin kullanılan kısmıdır.
        5- Java baslangiç olarak size "capacity" i 16 olarak verir.
            Siz verilen "capacity"i asarsaniz Java yeni "capacity"i varolanın 2 katının 2 fazlası olacak sekilde değiştirir.

    */

        String s = "Java";
        s = s + "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        // Stringbuilder nasil olusturulur?
        //1. Way
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        // Stringbuilder lara nasil ekleme yapılır?
        t.append("!").append("...");
        System.out.println(t);//Python!...

        //2. Way
        StringBuilder r = new StringBuilder();
        System.out.println(r);// hiçbir şey yazdirmaz

        r.append("c");
        System.out.println(r);//c

        // capacity ve lenght rarsındakı fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity);//21

        int lenght = sb1.length();
        System.out.println(lenght);//5 "Money" ==> 5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c);// 21*2 ==>44

        int ln = sb1.length();
        System.out.println(ln);//23

        // Default "capacity"i değiştirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6














    }
}
