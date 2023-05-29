package javainstruction.day37ExceptionsEnums;

public class IllegalGradeException extends Exception{
    // Exception class ımız java nın Exception class ındaki tum özellikleri kullanabilsin diye extend yaptık

    /*
       1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
         Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

       2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
          Bu "constructor" parent'taki constructor'i cagirmalidir.
          Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

       3) Custom Exception Class olusturdugunuzda ismin sonunda "Exception kelimesini kullanmakısınız
          "illegalGradeException" da oldugu gibi
     */

    public IllegalGradeException(String message){ // mesaj veren constructor olsturduk
        super(message);// objeyi parent'tan olusturduk
    }

    public IllegalGradeException( ){ // mesaj vermeyeceğimiz bo constructor olsturduk
        super();
    }


}
