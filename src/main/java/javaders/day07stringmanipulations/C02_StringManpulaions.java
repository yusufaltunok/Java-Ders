package javaders.day07stringmanipulations;

public class C02_StringManpulaions {
    public static void main(String[] args) {

        //********************* replaceAll() **************************\\
        /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir.
                     Bir grup datayi ifade edebilmek icin Regular
                     Expression (Regex) kullanilir

           En Cok Kullanilan Regexler
        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum  Harfler ==> [a-zA-Z]
        5) Tum  Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum Sesli Harfler ==> [aeiouAEIOU]
        7) Tum Noktalama Isaretleri ==> \\p{Punct}

        ^ ==> den farklı, haricinde

        1) Tum Rakamlar ==> [^0-9]
        2) Tum Kucuk Harfler ==> [^a-z]
        3) Tum Buyuk Harfler ==> [^A-Z]
        4) Tum  Harfler ==> [^a-zA-Z]
        5) Tum  Harfler ve Rakamlar ==> [^a-zA-Z0-9]
        6) Tum Sesli Harfler ==> [^aeiouAEIOU]
        7) Tum Noktalama Isaretleri ==> \\p{Punct}
         */
        String s = "Mehmet 20 yasinda QA_Developer kursunda $ dolar kazanmistir...";
        // Ex s Stringindeki tüm rakamları "*"a çeviriniz

        String s1 = s.replaceAll("[0-9]", "*");
        System.out.println("s1 = " + s1);//s1 = Mehmet ** yasinda QA_Developer kursunda $ dolar kazanmistir...

        // Ex : s String'indeki tum harfleri ve tum rakamlari "@" ceviriniz.
        String s2 = s.replaceAll("[a-zA-Z0-9]", "@");
        System.out.println("s2 = " + s2);//s2 = @@@@@@ @@@@@ @@@ @@ @@@@@@@ @@_@@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...

        // Ex : s String'indeki tum Space ler dışındaki karakterleri "+"ya çeviriniz

        String s3 = s.replaceAll("[^ ]", "+");
        System.out.println("s3 = " + s3); //s3 = ++++++ ++ +++++++ ++++++++++++ ++++++++ + +++++ ++++++++++++++

        // Ex : s String'indeki tum küçük harfler dışındaki karakterleri "*"ya çeviriniz

        String s4 = s.replaceAll("[^a-z]", "*");
        System.out.println("s4 = " + s4); //s4 = *ehmet****yasinda*****eveloper*kursunda***dolar*kazanmistir***

        //Ex : s String'indeki tum sesli harfler disindaki
        //     karakterleri & 'ne donusturunuz

        String s5= s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("s5 = " + s5);//s5 = &e&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&&a&a&&i&&i&&&&











    }
}
