package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // ********************** isEmpty () **************************\\

 /*
 isEmpty () bosmu dolumu diye bakar.Bize boolean bir deger dondurur
            Sadece hiclikte true dondurur
  */


        // EX : Bir String'in hic karakter icermedigini gosteren kodu yaziniz


        String str ="";
        // 1.Yol lenght ()
        boolean bosMu = str.length()==0;
        //2 is yaptirildi lenght() + ==0 ile karsilastirma operatoru kullanildi
        System.out.println("bosMu = " + bosMu);//true
        // 2.Yol isEmpty ()
        boolean bosMu2 =str.isEmpty();
        // 1 is yaptirildi isEmpty() Makbul olan isEmpty() dudur
        System.out.println("bosMu2 = " + bosMu2);

        // Ex: Bir String'in bosluk haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz
        String str2 = "  ";
// 1.Yol
        boolean result = str2.replace(" ","").length() ==0;
        System.out.println("result = " + result);

        // 2. Yol
        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);//true


        // Ex: Bir String'in "*" haric hicbir karakter
        // icermedigini kontrol eden kodu yaziniz
        String str3 = "*a";

        boolean rslt = str3.replace("*","").length()==0;
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);//true
        System.out.println("rslt2 = " + rslt2);//true

        // ******************** isBlank *************************\\

 /*
 isBlank  methodu String bir datada space + hiclik icin true dondurur
          Bosmu dolumu oldugunu kontrol eder.Boolean bir deger dondurur
          isEmpty den farki variable'da
          sadece space varsa bosmu dolumu diye soruldugunda isBlank == Bos der
                                                            isEmpty == Bos degil der
  */

        // String str2 = "  ";
        boolean rslt3 = str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true

        boolean rslt4 = str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//false

        // ************************ indexOf() ***********************\\
 /*

 indexOf() verilen karakter veya karakterlerin ilk gorunumunun indexini verir
         tekli karakter icinde , coklu karakter icinde kullanilabilir
         Çoklu datalarda String ifadenin
         Olmayan bir datanın kaçıncı index te olduğunu sorgulatırsak bize -1 dondurur

  */


        // Ex : Bir String de a ,i ,e karakterlerinin ilk gorunumlerinin
        // indexleri toplamini ekrana yazdiriniz
        String r = "Java is easy to Learn";
        
        int aIdx=r.indexOf("a");
        System.out.println("aIdx = " + aIdx);//1

        int iIdx= r.indexOf("i");
        System.out.println("iIdx = " + iIdx);//5

        int eIdx= r.indexOf("e");
        System.out.println("eIdx = " + eIdx);//8


        System.out.println("aIdx+iIdx+eIdx = " + (aIdx+iIdx+eIdx));// 14

        // Ex : Bir String de Java kelimesinin ilk olarak kacıncı index te
        // kullanıldıgını gösteren kodu yazınız

    String u ="Ah Java vah Java sen ne guzel seysin Java ";

    int idxJava = u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3 Java kelimesini ilk gördüğünde
                                                    // başlangıç karakterinin index ini verir

        int idxPyton = u.indexOf("Pyton");
        System.out.println("idxPyton = " + idxPyton);//idxPyton = -1



        //*********************** lastIndexOf () ***********************\\
        /*
        lastIndexOf() Verilen bir datada karakter ya da karakterlerin
        son gorunumunun indexlerini verir
        Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur
         */

        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin
        //      indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";

        int aLastIdx=v.lastIndexOf('a');
        System.out.println("aLastIdx = " + aLastIdx);

        int iLastIdx=v.lastIndexOf('i');
        System.out.println("iLastIdx = " + iLastIdx);

        int eLastIdx=v.lastIndexOf('e');
        System.out.println("eLastIdx = " + eLastIdx);

        System.out.println("aLastIdx+iLastIdx+eLastIdx : = " +
                ( aLastIdx+iLastIdx+eLastIdx));//aLastIdx+iLastIdx+eLastIdx : = 40



    }
}
