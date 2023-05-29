package javainstruction.day21datetime;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add (5,2,4,3));//14
        System.out.println(add (5,2));//7
        System.out.println(add (5));//5
        System.out.println(add ());//0

        getInitials("Ali Can", "Kemal Han", "Tuncay Cinar", "Ibrahim Cata;");


    }
        //Example 1: Toplama islemi yapan bir method olustur.

    // Asagidaki gibi farkli method lar olusturarak is yapamayiz.
    // Cunku kullanici farklı sayidaki sayilari toplamak isteyebilir.
    // Her ihtimal için bir method oluşturmak mümkün değildir.
    /*

    public  int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }
    public int add(int a, int b,int c,int d){
        return a+b+c+d;
    }
    */


    // Java farklı sayıdaki parametrelerin hepsini kabul eden bir yapi oluşturdu.
    // Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapısını kullanır.

    /*
       1) Bir method parantezinde birden fazla Varargs kullanılamaz.
       2) Bir method parantezinde birden fazla parametre kullanılacaksa Varargs en sonda olmalıdır.
          Örnek :public static int add(in a, int... b){
     */

    public static int add(int... a){
        int sum =0;
        for (int w : a){
            sum = sum +w;
        }
        return sum;

    }


    //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran methodu oluşturunuz.
    //           Ali Can ==>AC

    public static void getInitials(String... s){
        String initials = "";

        for (String w : s){
           initials=  initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials ="";
        }

    }

}
