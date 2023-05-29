package javainstruction.day20arraylistsdaytime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class prkts01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*
        Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
                Örnek: 2000 yılının Şubat ayında gün sayısı 29.

        */

        int ay = 2;
        int yil = 2010;
        int gunSayisi = 0;

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gunSayisi=31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi = 30;
                break;
            case 2:
                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)){
                    gunSayisi=29;
                }else {
                    gunSayisi=28;
                }break;
            default:
                System.out.println("Geçersiz Ay");
                break;
        }
        System.out.println("Gun Sayisi = " + gunSayisi);


    /*120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
      ardışık tam sayı arasında boşluk bırakarak yazınız

     */

     for (int i = 120; i >10 ; i--){
         if (i%4==0 && i%6==0)
             System.out.print(i +" ");
     }
        System.out.println();


     // 2. Yol
        String s = "";
        Integer i=120;
        while(i>10){
            if(i%4==0 && i%6==0){
                s = s + i + " ";
            }
            i--;
        }
        System.out.println(s);

        //3 Yol
        String t = "";
        int j = 120;

        do {
            if (j%4==0 && j%6==0){
            t=t+j+" ";
            }
            j--;
        }while (j>10);
        System.out.println(t );


    }//main
}
