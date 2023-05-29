package Introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk 2 ve son 2 basamağındaki
        // rakamların toplamını yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamaklı bir giriniz...");

        int number = input.nextInt();
        //bir sayının son rakamını alabilmek için o sayıyı 10 a bölüp kalanı almalıyız
        // % == modulus operator solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir
        //dolayısıyla %10 bize her zaman birler basamağında bulunan sayıyı verir.
        //bir tam sayıyı bir tam sayıya bölerseniz java sonucu kesinlikle tam sayı yapar
        //java bu durumda yuvarlama yapmaz, ondalıklı kısmı iptal eder
        //dolayısıyla bir tam sayıyı 10 a bölersek birler basamağını silmiş oluruz.

        //son rakami al
        int lastDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan ucunucu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifithDigit = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifithDigit);




    }


}