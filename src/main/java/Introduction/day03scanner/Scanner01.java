package Introduction.day03scanner;

//Java nın util kutuphanesinden scanner import edildi demektir.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
     //1. adım Scanner Class tan bir obje oluştur
        Scanner input = new Scanner(System.in);
    //Obje ismini input yaptık çünkü bu object kullanıcıdan alınan datayı benim kodlarımın içine koyacak.

    //2. adım Kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");

    //3. adım Uygun methodu kullanatak kullanıcının verdiği datayı memory e yerleştiriniz.
        Byte age = input.nextByte();
        System.out.println(age);


    }

}
