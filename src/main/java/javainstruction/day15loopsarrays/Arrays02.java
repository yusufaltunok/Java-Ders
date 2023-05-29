package javainstruction.day15loopsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays02 {

    /*
    1)Applicationlarda data ile bu data ları işleyen kodlar birbirinden ayrılır.
      Yani logic dataya bağımlı olmamalıdır.
      Dataya bağımlı olarak yazılan kodlara "hard code"denir
      "hard code" hatalı kod demektir

      Aşağıdaki grades array'inde son elemanı almak için "4" veya "grades.length-1" kullanılabilir.
       "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
        kullanirsaniz hep dogru sonucu alirsiniz
     */
    public static void main(String[] args) {

        // Array'leri kısa yoldan nasıl oluşturabiliriz?
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

    //Example 1: grades array'indeki en kucuk ve en buyuk grade'in toplamini ekrana yazdirian kodu yaziniz

        Arrays.sort(grades);// sort metodu küçükten büyüğe sıralar.
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]);//134

    //Example 2: Size verilen bir String array deki isimlerden 5 karakterden az karakter içerenleri console a yazdırınız.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length() <5){
                System.out.println(w);
            }
        }


        //Example 3: Size verilen bir String array deki isimleri alfabetik sıraya koyduktan sonra
         // "F" ile başlayan isimlerden önceki isimleri console'a yazdırınız

       Arrays.sort(stdNames);

       for (String w : stdNames){
           if (w.startsWith("F")){
               break;
           }
           System.out.println(w);
       }


        //Example 4: Size verilen bir String array deki isimleri alfabetik sıraya koyduktan sonra
        // "F" ile başlayan isimlerden önceki isimleri   ve "F" ile başlayan isimleri console'a yazdırınız

        Arrays.sort(stdNames);

        for (String w : stdNames){

            if (w.startsWith("F")){
                System.out.println(w);
                break;
            }

        }

        //Example 5: Size verilen bir String array deki isimleri alfabetik sıraya koyduktan sonra,
        // "F" ile başlayan isimler hariç diğer  isimleri console'a yazdırınız

        Arrays.sort(stdNames); // sort() metodu numeric dataları küçükten büyüğe(ascending) dizer
                               // Stringleri ise alfabetik sırada (alphabeticall) dizer.
                               // ascending + alphabeticall ==> Natural Order

        for (String w : stdNames){

            if (w.startsWith("F")){
                continue;

            }else {
                System.out.println(w);
            }

        }

    }

}
