package javainstruction.day13loops;

public class Loops01 {

    public static void main(String[] args) {

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for(int i=21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";// MiAmI

        for(int i=0; i<s.length(); i++){
            String ch = s.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }

        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Tokaci ==> Tok
        String t = "Tokaci";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;// Loop'u herhangi bir sarta gore kirmak icin "break" keyword kullanilir.
            }else{
                System.out.print(ch);
            }
        }

        System.out.println();

        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci ==> ict
        String u = "Tokatci";
        for(int i=u.length()-1; i>=0;i--){
            char ch = u.charAt(i);
            if(ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }
    }
}