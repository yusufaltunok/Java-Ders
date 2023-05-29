package javainstruction.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
    Kullanıcıdan bir sayi alınız, o sayi pozitif ise ekrana "Pozitif" yazdirin,
    değilse "Pozitif Degil" yazdirin
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an Integers");
        int num = input.nextInt();

        String result = num > 0 ? "Pozitif " : "Pozitif Değil";
        System.out.println(result);


    }
}
