package javainstruction.day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop(); // stop() metodu static olduğundan "interface" ismi ile ulaştım.

        Honda h = new Honda();
        h.eco(); // eco() metodu static olmadığından "object" ismi ile ulaştım.





    }
}
