package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s ="Learn Java earn money";
        //********************* endsWith **************************\\

        /*
        endsWith () Metnin bellirli bir datayla bitip bitmedigini verir
                    Bize boolean bir sonuc dondurur
                    Tek karakterde , coklu karakterde kullanilabilir
         */
        //Ex: s String'inin "money" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//isEnd = true
        boolean sonHarf= s.endsWith("j");
        System.out.println("sonHarf = " + sonHarf);
       /*
contaisn () methodu cumlenin herhangi bir yerinde istenilen datayi bulursa true dondurur.
ancak task'in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin endsWith () methodu kullanmaliyiz.
 */
        boolean varMi=s.contains("Ja");
        System.out.println("varMi = " + varMi);


        //********************* replace () **************************\\

        /*
        replace () Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
                   String bir data dondurur
                   tekli karakterler ile de coklu karakterler ile de calisir
                   Ancak her iki taraftada " "  ya da  her iki taraftada ' ' kullanilmalidir.
         */
        // Ex : s String'indeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz

        String s1 = s.replace("money","dolar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dolar


        //Ex : s String'indeki "earn" kelimesini "win" kelimesine ceviriniz
        //Learn Java win money
        //Lwin Java win money

        String s3 = s.replace("earn","win");
        System.out.println("s3 = " + s3);//s3 = Lwin Java win money


        // Ex : s String'indeki "a" harflerini "*" degistiriniz

        String s4 = s.replace('a','*');
        System.out.println("s4 = " + s4); //s4 = Le*rn J*v* e*rn money

        // Ex : s String'indeki "n" harflerini "***" degistiriniz
        String s5 = s.replace("L","***");
        System.out.println("s5 = " + s5);//s5 = ***earn Java earn money


        // String s ="Larn Java arn mony"
        // Ex : s String'indeki tum "e" harflerini siliniz
        String s6 = s.replace("e","");
        System.out.println("s6 = " + s6);//s6 = Larn Java arn mony

        String s7 = s.replace('e',' ');
        System.out.println("s7 = " + s7);//s7 = L arn Java  arn mon y
        // Space ile silme yapılmaz. Space java için bir karakterdir.

        //Ex: s Stringindeki "earn" kelimelerini siliniz.
       String s8= s.replace("earn","");
        System.out.println("s8 = " + s8);//s8 = L Java  money


        String t="Dolma Kalem";
        //Ex: t Stringindeki "Kalem" kelimesi yerine Biber yerleştiriniz.
        String t1=t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);//t1 = Dolma Biber


        //********************* replaceAll() **************************\\

        /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir.
                     Bir grup datayi ifade edebilmek icin Regular
                     Expression (Regex) kullanilir
         */

        // Ex : t String'indeki tum rakamlari "*"'a ceviriniz
        String t2=t.replaceAll("0-9","*");
        System.out.println("t2 = " + t2);

        //String s6=s.replace('e','');
        //System.out.println("s5 = " + s5);
        /*
        char data type'inin icerisine mutlaka birkarakter yerlestirilmelidir.
        space bir karakterdir.char'in icine yerlestirilebilir.Ancak hiclik
        javada char icin kullanilamaz.Bu nedenle silme islemi yaparken mutlaka
        String kullanmaliyiz
         */


           }//main
}//class
