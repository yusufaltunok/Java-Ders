package javainstruction.day17multidimensionalarraypassbyvalue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultyDimensionalArray01 {

    /*
    1- Bir array'in elemanları da array olursa bu tarz array lere "MultyDimensionalArray" denir
     */

    public static void main(String[] args) {

        // "MultyDimensionalArray" nasıl oluşturulur?
        String names[][] = new String[3][2];

        // "MultyDimensionalArray"e eleman nasıl eklenir?
        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        // "MultyDimensionalArray" console ayazdırmak için "toString()" metodu değil "deepToString()" metodu kullanınız.

        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

        // "MultyDimensionalArray" içinden spesific bir eleman nasıl yazdırılır?

        System.out.println(names[1][1]);//M

        // "MultyDimensionalArray" içindeki bir array i yazdırmak.

        System.out.println(Arrays.toString(names[0])); // [A, K]

        System.out.println(Arrays.toString(names[1])); // [P, M]

        System.out.println(Arrays.toString(names[2])); // [C, Z]

        // Kısa yoldan  "MultyDimensionalArray" nasıl oluşturulur?

        String students [][] = { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"} };

        // Ex. 1: Yukarıdaki student array'inde toplam kaç isim olduğunu bulunuz?

        int sum =0;

        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum); // 8


        //Ex.2: Yukarıdaki student array'inde içinde "m" olan isimleri console' yazdırınız.

        for (String[] w : students) {

            for (String k : w) {

                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

    // Ex.3: Bir integer "MultyDimensionalArray" oluşturunuz, tüm elemanların çarpımını hesaplayınız.
        int nums [][] = {{5,4},{2,3,2},{7}};

        int result =1;

        for (int [] w : nums) {

            for (int k :w){
                result = result * k;
            }
        }
        System.out.println(result); //1680


        // Ex.4: İki boyutlu bir arrayi tek boyutlu bir arraye çeviriniz.

        int numbers [][] = {{5,4},{2,3,2},{7}}; // { 5,4,2,3,2,7}

        //1.Step :İki boyutlu array'de kaç eleman olduğunu bulan kodu yazmalıyız.
        int toplamElemanSayisi =0;

        for (int [] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

        //2.Step: Tek boyutlu array'i İki boyutlu array'in eleman sayısını kullanarak oluşturmalıyız.
        int newArr [] = new int[toplamElemanSayisi];

        //3.Step : İki boyutlu arraydeki elemanları Tek boyutlu array'e transfer etmeliyim.
        int idx =0;

        for (int [] w : numbers){

            for (int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); // [5, 4, 2, 3, 2, 7]


        // Ex.:Bir integer "MultyDimensionalArray"deki en küçük ve en büyük elemanın toplamını bulunuz?

        int ages [][] = {{15,4},{12,43,21},{7}};// ==> 4+43 =47

        int small = ages[0][0];
        int big = ages[0][0];

        for (int [] w : ages){
            for (int k : w) {
                small = Math.min(small,k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small+big); // 47


    }
}
