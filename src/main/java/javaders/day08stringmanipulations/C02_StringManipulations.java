package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {

         /*
Kullanicidan email adresini girmesini isteyin,
Asagidaki kurallara gore kullanicinin
girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi i)mail adresi \"gmail\" icermeli\n" +
                "       ii)Space characteri mail'de olmamali\n" +
                "       iii)mail adresinde buyuk harf olmamali\n" +
                "       iv)En az bir tane noktalama isareti bulunmali seklinde giriniz ");

        String mail = input.nextLine();

        boolean first = mail.contains("gmail");
        System.out.println("gmail Içermeli = " + first);

        boolean second = !mail.contains(" ");
        System.out.println("Bosluk Içermesin = " + second);

        boolean third = mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replaceAll(" ","").length()==0;
        System.out.println("Büyük harf olmasın = " + third);

        //iv)En az bir tane noktalama isareti bulunmali
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").
                replace(" ","").
                length()>0;
        System.out.println("Noktalama işareti olsun = " + fourth);
/*
        boolean fourth1 = mail.replaceAll("[^\\p{Punct}]","").//[^\p{Punct}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth1 = " + fourth1);

        boolean fourth2 = mail.replaceAll("[\\P{P}]","").// [\\P{P}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth2 = " + fourth2);
        System.out.println(first && second && third && fourth);
*/






    }
}




