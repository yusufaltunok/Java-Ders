package javainstruction.day25polymorphism;

public class Student {

    public String stdName ="Tom Hanks";

    public int age = 23;


    //Encapsulation nedir? Data saklamaktır.(Data hiding)
    //Data'yı nasıl saklarız? Access Modifier'ını "private" yaparak.

    private String stdId = "AC2023102T";

    private double gpa = 3.87;

    private boolean successful = false;

    //Encapsulation yaptığımız data yı istersek diğer class lardan okuyabiliriz.
    //NAsıl okuruz? "get method" oluşturarak Encapsulation edilmiş data nın değerini okuyabiliriz.
    //"get method" hep public olur.
    //"get method"un "return type"ı okudugu variable'ın return type'ı ile aynı olur.

    public String getStdId() {
        return stdId;
    }
    public double getGpa() {
        return gpa;
    }
    //Encapsulation yapılan variable'ın data type'ı "boolean" ise get method ismi "is" ile başlar.
    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptığımız datayı istersek diğer class lardan nasıl değiştirebiliriz?
    //"set method" oluşturarak Encapsulation edilmiş data nın değerini değiştirebiliriz
    //"set method"lar hep public olur.
    //"set method"un "return type"ı hep "void" olur.
    //"set method" parametre kullanır, parametrenin data type ı variable ile aynı olur.
    //"set method" kullanarak varolan object üzerinde değişiklikler yaparak o object i sanki yeni bir objectmiş gibi kullanabiliriz
    //Note :get method'ların diğer adı "getter", set methodların diğer adı "setter"dır.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
