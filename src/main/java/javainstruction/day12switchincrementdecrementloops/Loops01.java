package javainstruction.day12switchincrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        Code yazarken i) Tekrarlı code yazmamaya dikkat ediniz
                      ii) Yazdiğiniz code'un gerektiğinde tamir edilebilmesinin kolay olmasına,
                      iii) Yazdiğiniz code'un gerektiğinde geliştirilebilmesinin kolay olmasına,
                      iv) Yazdiğiniz code'un farklı senaryolar içinde çalışabilmesine dikkat ediniz.
         */

        // Ekrana 5 kez "Hi" yazdırınız.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Yukarıdaki gibi tekrar gerektiren işleri yapmak için "Loop" yapılarını kullanırız
        // 4 tane loop yapısı vardır. i) for-loop  ii) while-loop  iii)do-while-loop iv) for-each-loop

        // for-loop

            //Starting Value   Loop Condition    Increment/Decrement
        for (   int i = 1    ;     i<6         ;     i++             ) {
            System.out.println("Hi");

        }

        // 4'den 24'e kadar tüm tamsayıları aynı satırda, aralarına boşluk bırakarak console'a yazdırınız.
    for (int i = 4 ; i<25 ; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
    // 33 den 11'e kadar tüm çift tamsayıları aynı satırda, aralarına boşluk bırakarak console'a yazdırınız.

    for (int i = 33 ;i>10 ; i--){
        if (i%2==0) {
            System.out.print(i + " ");
        }
    }
        System.out.println();

    // Yazdiğiniz code başka sahada uzmanlık içermemeli.
        for (int i = 32 ;i>10 ; i=i-2){
                System.out.print(i + " ");
            }

        // 20'den 74'e kadar tüm tek tamsayıları aynı satırda, aralarına boşluk bırakarak console'a yazdırınız.

        System.out.println();
        for (int i = 20 ;i<75 ; i++){
            if (i%2!=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    // Massachusetts kelimesindeki tüm sesli harfleri console'a yazdırınız.
        String s = "Massachusetts";
        for (int i = 0 ; i<s.length() ; i++){
            char  c = s.charAt(i);
            if (c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E'|| c=='İ' || c=='O' || c=='U'){
                System.out.print(c + " ");
        }

        }





    }
}
