package javainstruction.day18constructorsstatickeyword;

public class Student {

    /*
    1) "static" "class member"lar (class ın içindeki elemanlar: variable + method + constractor + code blocks)
        tum object'ler tarafından paylaşılır
    2) "static" "class member"lardaki degisiklikler tüm object'ler tarafından otomatik olarak gorulur.
    3)"static" "class member"lar gokteki ayın dunyaya baglı oldugu gibi, class'a baglıdırlar.
       Bu yuzden "static variable'lara "class variable"da denir.
    4) "static" "class member"ların nasıl çalıştıgını anlamak için çizim yapıp static olanları class'a
       olmayanları object'e bağlayarak dusunmek bu konuyu kolaylastirir.
    5) "static" "class member"ları çagırmak için object oluştumak gerekmez ve tavsiye edilmez.
         "non-static" "class member"ları çagırmak için object oluştumak şarttır.
     */

    public static int numOfRegisteredStd =0;
    public int num =0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd);//0
        Student s1 =new Student();
        System.out.println(numOfRegisteredStd);//1
        Student s2 =new Student();
        System.out.println(numOfRegisteredStd);//2
        Student s3 =new Student();
        System.out.println(numOfRegisteredStd);//3

        System.out.println(s1.num);//1
    }






}
