package javainstruction.day34exceptions;

public class E03 {
    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));// 4
        System.out.println(getNumOfChars("Money"));// 5
        System.out.println(getNumOfChars(""));// 0

        System.out.println(getNumOfChars(null));// NullPointerException


    }
    // Bir String'deki character sayısını veren method oluşturunuz.

    public static int getNumOfChars(String s){

        int result =0;

       try{

        result = s.length();

       }catch (NullPointerException e) { // NullPointerException String Class da null ile uyumlu olmayan methodlar kullanıldıgında atılır.
          // String null olursa asağidaki mesajı dondur

           System.out.println("Some String methods do not work with null...");
           System.out.println(e.getMessage());// null -->Java teknik bir mesaj uretmişse onu gösterir.
       }
       return result;
    }

}
