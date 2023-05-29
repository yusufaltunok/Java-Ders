package javainstruction.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        String s ="Hello Henry!";
        getTheNumOfOccurrenceOfLetters(s);
        System.out.println(getTheNumOfOccurrenceOfLetters(s)); //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

    }

    // Example 1: Verilen bir Stringde hangi harfin kaç defa kullanıldıgını veren method olusturunuz.
    //     "Hello Henry!" --> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    public static TreeMap<String, Integer> getTheNumOfOccurrenceOfLetters(String s){

        // Stringteki harf dısı karakterleri sil.
        s = s.replaceAll("[^A-Za-z]","");

        // Gorunum sayılarını depolamak için Map oluştur.
        TreeMap<String, Integer> numOfOccurrence = new TreeMap<>();// Alfabetik sırada gormek için TreeMap kullandık.
                                                                   // daha hızlı çalısması için HashMap kullanmalıyız.
        // HArfleri ai
        String letters [] = s.split("");

        // for-each Loop olustur
        for (String w : letters){// letters array'indeki harfleri birer birer w'nin içine koy.
            Integer numOfOcc = numOfOccurrence.get(w);
            if (numOfOcc==null){
                numOfOccurrence.put(w,1);
            }else{
                numOfOccurrence.replace(w,numOfOcc+1);
            }
        }
        return numOfOccurrence;

    }
}
/*
Soruya bakildiginda map kullanilacagi anlasiliyor. Main method disinda method olusturacagiz. HashMap
olarak olusturdugumuz methodu static yapiyoruz. Boylece main methodu kullanabilecegiz.

Bu method ile kullanilacak harfler soruldugundan bir String olusturacagiz. Biz harflere bakacagimizdan
harfler disindaki karakterleri replaceAll methodu ile silecegiz. Eger harf degil her karakterin kac kez
kullanildigi denseydi bu silme islemini yapmazdik. Gorunum sayilarini depolamak icin bir map
olusturacagiz. HashMap'imizi bir String bir Integer ile olusturacagiz. HashMap'imizin adi numOfOccurence.

Harfleri almaliyiz. Bunun icin split methodu kullaniriz. s isimli Stringimiz ile split methodunu kullaniriz.
split icine hiclik saydigimiz "", koyduk. Boylece tek tek her harfi alabiliriz.Aldigimiz harfleri yine
bir String array'e koyduk ve ona letters dedik. Split methodu arraylerde kullanilir.

Loop olusturmamiz gerekir. For each loop icinde harfleri barindiran letters'i w olan String'e atadik.
get methodunu Map ismi ile kullanabildik ve w;yi aldik, bir Integer variable'ina assign ettik.
Bu yolla harfin kac kez gorundugunu bulacagiz.

Bir if statement ile map kendisine w'yu assign ettigimiz Integer variable'in null'a esit olup olmadigini
bulmaya calistik. Null ise o eleman yok demektir ve olmayan eleman yerine 1 degerini verdik. Put methodu
bize o elemani al, yerine su degeri ver dedigimizde onu yapar. Ornek w'yi al, yerine bir yerlestir.
Daha sonra loop ile diger elemana bakacagiz. O eleman varsa ilk if statementa artik calismaz,
else bolumune gecilir ve buna gore deger artisi yapilir. Var olan bir eleman ise
w icinde buldugumuz o elemana arti bir deger verdik. O eleman once bir iken bu defa iki olur,
sonraki dongulerde yine varsa iki olan elaman artik 3 olacak.

If statement icindeki kosul gerceklesmezse if kismi degil else kismi calisir. Loop tamamlaninca numOfOccurence
map'ini return ediyoruz loop {} disinda. Boylelikle sonucu alabiliyoruz.
 */