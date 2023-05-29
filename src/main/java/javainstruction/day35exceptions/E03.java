package javainstruction.day35exceptions;

public class E03 {

    /*
        1- try block'tan sonra coklu catch block kullanılabilir.
           catch block'lar arasında parent-child ilişkisi yoksa catch block'lar istenildiği gibi sıralanabilir.
           catch block'lar arasında parent-child ilişkisi varsa child üstte olmalıdır
        2- "Exception class" tum exception'ların parenti dir.
           Çoklu catch block kullanmak yerine sizden istenen fonksiyonu karsıladıgı surece
           tek catch block'ı "Exception class" ile kullanabilirsiniz.
        3- "try + 1 catch" olur - "try + cok catch" olur - "try tek basına kullanılmaz.
        4- "try" catch block olmadan kullanılabilir mi?
            "try + finally" olabilir.


     */
    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLenghth1("6"));
        System.out.println(convertStringToIntDivideByLenghth1("6"));
        System.out.println(convertStringToIntDivideByLenghth1("6"));


    }

    // Example 1: Bir Stringi integer'a ceviren ve bu integer'ı Stringin lenght'inin bir eksiğine bolen method olusturunız.

    public static int convertStringToIntDivideByLenghth1 (String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str); // valueOf'a rakam vermezseniz hata verir
            result = a / (str.length() - 1);
        } catch (NumberFormatException e) {
            System.out.println("Non-digit character cannot be used in valueOf()");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;

    }
        public static int convertStringToIntDivideByLenghth2 (String str) {
            int result = 0;
            try {
                int a =Integer.valueOf(str);
                result = a / (str.length()-1);
            }catch (Exception e){ // ayrı ayrı Exception yerine tek bir Exception da kullanabiliriz.
                                //Exception lara özel kod yazmamız gerekirse bunu kullanamayız.
                System.out.println(e.getMessage());
            }
            return result;
        }

    public static int convertStringToIntDivideByLenghth3 (String str) {
        int result = 0;
        try {
            int a =Integer.valueOf(str);
            result = a / (str.length()-1);
        }catch (ArithmeticException e){
            System.out.println("Jump");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
/*
Eger catch bloklardaki exceptionlar arasinda child parent iliskisi varsa child yukarida,parent asagida olmalidir.
 Bu siralamaya dikkat etmez ve parent'i yukari alirsak java hata verir.
Exception classlarin ismi genellestikce class olurlar. Exception genel bir isim,
AritmeticException ve gordugumuz diger classlar  ise ozeldir yani child sayilirlar. Exception class diger tum exceptionlarin parentidir
 */