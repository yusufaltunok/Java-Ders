package javainstruction.day18constructorsstatickeyword;

public class StudentRunner {

    public static void main(String[] args) {

        // static olan "numOfRegisteredStd" variable'ını çağırmak için sadece class ismini kullandık, obje oluşturmadık.

        System.out.println(Student.numOfRegisteredStd);

       // static olmayan "num" variable'ını çağırmak için object oluşturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan "numOfRegisteredStd" variable'ına object uzerinden de ulasabilirsiniz ama bu hatadır.
        System.out.println(s1.numOfRegisteredStd);




    }
}
