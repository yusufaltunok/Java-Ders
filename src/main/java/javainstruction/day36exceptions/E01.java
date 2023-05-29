package javainstruction.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

        /*
        1- Run butonuna bastıktan sonra console da alınan Exception lara "Runtime Exception" denir.
          ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
           "Runtime Exception" a ornektir.
            "Runtime Exception"lara "Unchecked Exception" da denir.

        2- Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception" lara "Checked Exception" da denir.

       3- FileNotFoundException: (Dosya bulunamadı hatası) Javaya bir dosyayı bul dediğimizde java dosyanın adresi ve
          dosyanın varlığı konusunda hata olusursa ne yapması gerektiğini soylemenizi ister.

       4- IOException: "IO" Input Output demektir.
                      Note : IOException, FileNotFoundException'ın parentidir.

       5- Java da hatalar temelde ikiye ayrılır.
          i- Exception'lar (Handle edilerek çozulebilir)
          ii-Error'lar (Handle edilemezler)
             a- StackOverFlow Error (memory dolma hatası)
             b- Out Of Memory Error (Heap memory dolma hatası)
             c- Virtual Machine Error (Java nın içindeki makine hatası)

         */
        public static void main(String[] args) throws IOException {

            //1. Way: Exception'u method signature satırına ekledik(main in devamına)
        FileInputStream fis = new FileInputStream("src/main/java/javainstruction/day36exceptions/TextFile");
        // bu code ile file text ine ulaştık

        int i = 0;

            while ((i = fis.read())!=-1) { // read() karakterlerin Ascii değerlerini verir
                                       //Ascii değer -1 olmadığı sürece loop u devam ettir
                System.out.print((char)i);

            }





    }
}
