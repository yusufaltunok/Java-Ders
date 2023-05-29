package javainstruction.day34exceptions;

public class E01 {
    /*
    1- Exception, beklenmedik problem demektir.
    2- Exception'ları halledebilmek için 2 temel yol vardır.
      i- Exception'a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
      ii- Exception olustugunda bunu ilan eder ve geri çekilirsiniz. Buna "Throw Exception" denir
    3- Exception'a uygun cozumler uretmede "try-catch" kullanılır.
       try block' da yapılması gereken işlemi Java dan yapması istenir.
       Java işlemi problemsiz bir şekilde yaparsa catch block java tarafından okunmaz
          "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
        4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
     */

    public static void main(String[] args) {


        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0)); // ArithmeticException: / by zero
                                               // Aritmatik hata 0 ile boldun

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));
    }

    //1. Way : Exception'ı handle etmede ilk yol (bu yol kesinlikle kullanılmaz)
    public static int divide1 (int a, int b) {
        if (b==0){ // 0 ile bolme hatasını gidermek için yazdık
            return 0;
        }else {
            return a / b;
        }
    }

    // 2. Way : Exception'ı handle etmede harika yol

    public static int divide2 (int a, int b) {

        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){ // matematik ile ilgili herhangi bir kural ihlali yapıldığında atılır.
            System.out.println("There is an issue in division");
        }
        return result;
    }




}
