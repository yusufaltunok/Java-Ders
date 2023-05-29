package javainstruction.day24inheritancepolymorphism;

    /*
    1- inheritance'da object oluştururken constructor lar yukarıdan (Parent)
        aşağıya (Child) doğru çalışır
    2- Parent ve Super eş anlamlıdır, Child ve Sub eş anlamlıdır.
    3- Super() her constructor'ın ilk satırında gorunmez olarak bulunur.
        İsterseniz gorunur  şekilde de yazabilirsiniz.
    4- super() sizi parent class'daki constructor'a taşır.
    5- this()  sizi aynı class içindeki constructor lar arasında gezdirir.
    6- this() içinde bulundugunuz class daki varibale'ları çağırmaya yarar.
       super() parent class'daki varibale'ları çağırmaya yarar.
     7- parent'tan chil'a HAS-A iliskisi vardir.
        chil'dan parent'a IS-A iliskisi vardir.
     8- Eğer data type'ları arasında IS-A ve HAS-A iliskisi varsa bu data type'larına "COVARIANT" denir.
     */

    /*
    1- Polymorphism = çoklu şekil demektir.
        Yani bir methodun farklı şekillerde karşımıza çıkması demektir.
        Polymorphism = Overloading + Overriding
     2- Overriding parent class'daki methodu child'ın ihtiyaçlarına göre özelleştirerek kullanmak demektir.
     3- Overriding'de methodun body'si değiştirilir.(Overloading'de parametre değişiyordu)
     4- Overriding'de method signatur'a dokunulmaz, dokunulursa Java kızar.

     */

public class Car {

    public  void move(){
        System.out.println("Cars move...");
    }

    public  void getBreake() {
        System.out.println("Cars breake...");
    }

    public  void engine() {
        System.out.println("Cars engine...");
    }

    public String model = "Car";
    public int price = 0;

    public Car (){
        System.out.println("Car constructor 1");
    }
    public Car (int i){
       this();
        System.out.println("Car constructor 2");
    }


}
