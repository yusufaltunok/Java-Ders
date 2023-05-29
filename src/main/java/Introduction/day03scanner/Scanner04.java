package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
   //Kullanıcıdan 2 sayı alıp 4 işlem yapan ve işlem sonuçlarını ekrana yazdıran kodu yazınız
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Ikı sayi giriniz");

       double firstNumber = input.nextDouble();
       double secondNumber = input.nextDouble();

        System.out.println( firstNumber + secondNumber);
        System.out.println( firstNumber - secondNumber);
        System.out.println( firstNumber * secondNumber);
        System.out.println( firstNumber / secondNumber);



    }

}
