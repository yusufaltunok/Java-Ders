package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {
        /*
        Javada işlem yaptıran
        == Eşittir
        != Eşit değildir
        < küçüktür
        > büyüktür
        = atama operatoru

        1<4<5 mat. üçlü karşılaştırma yapar ancak java üçlü kıyas yapamaz
        1<4 && 4<5; 1 küçüktür 4 hemde 4<5 == java bu şekilde ikili kıyas yapıp mantık operatorleri ile birleştirme yapar

        && == "ve hem" (and) operatoru mükemmeliyetçi yapıdadır. True dondurmesi için her iki şartında sağlanması gerekir.
        & ile && arasındaki fark
        (3<5 && 6<9 && 11<2 && 4<8  && 2<3 )
          T      T       F ilk false gördüğünde false döndürür
        (3<5 & 6<9 & 11<2 & 4<8 & 2<3 )
          TEK & olduğunda tüm kodu tarar. tek bir false varsa false dondurur
           ama tüm kodun bitmesini bekler.onun için && kullanmak işlemi hızlandirir.

          && kullanırsak ilk false gördüğünde false döndürür

        Çay  ve  limon
         +   &&    +   ==> True;
         +   &&    -   ==> False;
         -   &&    +   ==> False;
         -   &&    -   ==> False;

        || ==> veya (or) operatoru Polyannacı yapıdadır. en ufak bir pozitif durumda True dondurur

        Çay  veya  limon
         +   ||    +   ==> True;
         +   ||    -   ==> True;
         -   ||    +   ==> True;
         -   ||    -   ==> False;

         */

        System.out.println(5+2==8);//false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println("sonuc1 = " + sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 !=7;
        System.out.println("sonuc2 = " + sonuc2);//false

        int sayi1 =15;
        System.out.println(10<sayi1 || sayi1<20);//true
        int sayi2 =5;
        System.out.println(sayi2<10 || sayi2>20);//true

        short a =1000;
        System.out.println(a<15000 || a>28000 || a<-23);//true

        System.out.println(a<=1000 && a==1000 && a<12);//false




    }//main


}//Class
