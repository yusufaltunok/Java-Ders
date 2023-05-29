package javainstruction.day13loops;

public class Loops02 {

    public static void main(String[] args) {

        // Verilen bir String de küçük harfleri console a yazmayınız.
        // "Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;// loop yaparken bazi elemanlari isleme sokmamak icin "continue"kullanilir.
            } else {
                System.out.print(ch);
            }

        }
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        System.out.println();
        // Bir Stringi ters çeviren code'u yazınız.
        //"Java" ==> "avaJ"

        // 1. Way
        String t = "Java";
        String ters = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);
        }
        System.out.println(ters);// avaJ

        // 2. Way  String ile char concatination (toplandığı) yapıldığı için tercih edilmez 2 iş
        String u = "Java";
        String ters2 = "";
        for (int i = t.length()- 1 ; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters);// avaJ

        //Bir tamsayının rakamlarının toplamını veren code'u yazınız
        // 578==> 5+7+8 =20
        int sum = 0;

        int n = -578;
        n = Math.abs(n);

        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println(sum);// 20

    }
}
