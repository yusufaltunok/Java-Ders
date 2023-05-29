package javainstruction.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

       /*
       Kullanıcıdan alınan iki sayıdan küçük olanı ekrana yazdırınız
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two Integers");
        int first =input.nextInt();
        int second = input.nextInt();

    //1. yol: Use if else

        if(first<second){System.out.println(first);
          }else {System.out.println(second);}

    // 2. yol: Use Ternary

        int result = first<second ? first : second;
        System.out.println(result);








    }
}
