package javainstruction.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        // Kullanıcının çoklu datayı bir array e yerleştirebilmesi için gereken kodu yazınız.

    /*
    1-Kullanıcıdan data almak için Scanner object pluştur.
    2- Çoklu datayı yerleştirmek için bir array oluştumalıyım.
    3- Array oluşturabilmek için kullanıcıdan array'e kaç tane eleman koyacağını almalıyım
    4-Loop oluşturup eleman ekleme işlemini tekrar tekrar yapabilmeliyim
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numberOfElements = input.nextInt();

        String stdNames [] = new String[numberOfElements];

        System.out.println("To stop adding press 'q'");

        for (int i = 0; i < stdNames.length; i++){
            System.out.println("Enter the "+(i+1) + ". student name");

            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(stdNames));







    }
}
