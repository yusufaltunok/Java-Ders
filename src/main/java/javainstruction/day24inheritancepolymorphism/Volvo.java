package javainstruction.day24inheritancepolymorphism;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the secure car in the world...");
    }

    @Override // Bu bir "anotation"dır. @Override anotation'ı Override yapmanın kurallarını kontrol eder.
    public void move() {
        System.out.println("Volvo moves...");
    }
}
