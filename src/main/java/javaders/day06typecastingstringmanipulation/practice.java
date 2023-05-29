package javaders.day06typecastingstringmanipulation;

public class practice {
    public static void main(String[] args) {

            String soz = "Korkma sönmez bu şafaklarda yüzen al sancak.";
        System.out.println("soz = " + soz);//soz = Korkma sönmez bu şafaklarda yüzen al sancak.

        String sozUpper  = soz.toUpperCase();
        System.out.println("sozUpper = " + sozUpper);//sozUpper = KORKMA SÖNMEZ BU ŞAFAKLARDA YÜZEN AL SANCAK.

        String sozLower= sozUpper.toLowerCase();
        System.out.println("sozLower = " + sozLower);//sozLower = korkma sönmez bu şafaklarda yüzen al sancak.

        System.out.println("İlk karakter = " + soz.charAt(0));//İlk karakter = K
        System.out.println("28. karakter = " + soz.charAt(28));//28. karakter = y
        System.out.println("soz.charAt(0)+soz.charAt(28) = " + soz.charAt(0)+soz.charAt(28));//soz.charAt(0)+soz.charAt(28) = Ky
        System.out.println("soz.charAt(0)+soz.charAt(28) = " + (soz.charAt(0)+soz.charAt(28)));//soz.charAt(0)+soz.charAt(28) = 196
                                                                                              // ( Ascii değeri K=75+y=121= 196)


        System.out.println("karakter sayısı = " + soz.length());//karakter sayısı = 44

        System.out.println("İlk 6 karakter = " + soz.substring(0, 6));//İlk 6 karakter = Korkma
        System.out.println("7-13. karakterler = " + soz.substring(7, 13));//7-13. karakterler = sönmez
        System.out.println("14. karakterden sonrası = " + soz.substring(14));//14. karakterden sonrası = bu şafaklarda yüzen al sancak.

      boolean varMi = soz.contains("c");
        System.out.println("varMi = " + varMi); //varMi = true
        boolean yokMu = soz.contains("*");
        System.out.println("yokMu = " + yokMu);//yokMu = false

        System.out.println("soz.startsWith(\"K\") = " + soz.startsWith("K"));//soz.startsWith("K") = true
        System.out.println("soz.startsWith(\"al\",6) = " + soz.startsWith("al", 6));


        String number = "1994266";
        System.out.println("number.startsWith(42,4) = " + number.startsWith("42",4 ));


    }

}
