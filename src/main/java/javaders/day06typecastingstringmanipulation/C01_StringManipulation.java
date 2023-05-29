package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        String a = "Benim Tek Rakibim Dunku Ben*." ;
        // ************ toUpperCase() ***************\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        //aUpper = BENİM TEK RAKİBİM DUNKU BEN .
        // ************ toLowerCase() ***************\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLower benim tek rakibim dunku ben .

        // ************ charAt() ***************\\
        System.out.println("ilk karakter : "+(a.charAt(0)));//B
        System.out.println(a.charAt(10));//R

        // a String'indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.
        char firstChar =a.charAt(1);
        char lastSecondChar =a.charAt(27);
        System.out.println( firstChar+" "+lastSecondChar);//e *


        // ************ lenght() ***************\\
        // a String'inde bulunan karakter sayisini bulunuz
        System.out.println(a.length());//29

        // ************ substring() ***************\\
        // a String'indeki ilk 4 karakteri aliniz
        String sub1 = a.substring(0,4);//0 dahil  4 haric  [0,4)==> 0 .index, 1.index,2.index,3.index==> alinir
        // 4.indexden itibaren alinmaz

        System.out.println("sub1 = " + sub1);//Beni

        //a String'indeki 4.index dahil 7.index haric yazdiriniz
        System.out.println(a.substring(4, 7));//m  T
        //"Benim Tek Rakibim Dunku Ben*."
        // a String'indeki "Rakib" kelimesini aliniz

        System.out.println(a.substring(10, 15));//Rakib

        System.out.println(a.substring(10));//Rakibim Dunku Ben*.

      // ************ contains() ***************\\
        // a String'inde "bim" kelimesinin olup olmadığını kontrol ediniz
        boolean varMi =a.contains("bim");
        System.out.println("varMi = " + varMi);//varMi = true

        // ************ startsWith() ***************\\
        // a String'inin "T" hatfi ile başlayıp başlamadığını kontrol ediniz
        System.out.println(a.startsWith("T"));//false
        System.out.println(a.startsWith("Tek", 6));//true ilk 6 karakteri at; sonrası "Tek" kelimesi ile başlıyor mu?
        // prefix : başlangıç    offset : at gitsin

        //Uni. no ları yıl+ bolum kodu + o bolume giris sirası olarak düzenlenen bir okulda
        // öğrenci Umran ın hukuk fak. de okuyup okumadığını gösteren kodu yazınız
        /*
        sınıf öğrt. :22 hukuk 33 bilg. 44 Eczacılık 55 maliye 66 kimya müh 77

         */
        String str ="2010551";
        System.out.println(str.startsWith("33", 4));//false



    }//main
}//class
