package javainstruction.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        // verilen cumledeki kelimelerin gorunum sayısını veren kodu yazınız
        // "I like you you like like!"  => I=1, like=3, you=2 ( key=value) Map formatı



        String s = "I like you you like like!";
        System.out.println(s);// "I like you like!"

        // like ile like! i aynı yapabilmek için tüm noktalama işaretlerini silelim.
        s=s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        // Kelimelerle çalışmalıyız. Bu yuzden split(" ")kullanıp kelimeleri ayıracağız.ve Arra'in içine koyacağız
        String words [] =s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();

        // "words" array'indeki kelimeler birer birer Map'de var mı, yok mu diye kontrol edilecek.
        // "words" array'indeki kelimeler  Map'de yoksa  Map'e value'su 1olarak yerleştirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w : words) {

            Integer numOfOccurrence = occ.get(w);// occ Map'ine git w(I, like...) Map de var mı bak

            if (numOfOccurrence==null) { // w Map de yoksa yani null ise
                occ.put(w,1); // Map'e git w=1 olarak yerleştir.

            }else { // w Map de varsa  w'nin değerini replace() ile 1 artır.
                occ.replace(w,numOfOccurrence+1);
            }
        }
        System.out.println(occ); // {like=3, I=1, you=2}

    }
}
