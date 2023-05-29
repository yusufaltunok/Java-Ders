package javainstruction.day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {
    }

    @Override
    public void drink() {
    }


    public static void main(String[] args) {
        //interface'lerde variable cagırırken interface adını kullanarak çağırın.
        //Bu hem "static" variable' olmanın gereğidir, hem da okunurluğu artırır.


        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);


    }



}
