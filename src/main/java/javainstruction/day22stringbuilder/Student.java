package javainstruction.day22stringbuilder;

public class Student {

    // stdName "public" olduğu için diğer class lardan uşaşılabilir.
    public  String stdName = "Ali Can";

    //Access Modifier'ı "default" olan ile "public" olan class member lar aynı package içinde
    //kullanıldıklarında aynı özellikleri gosterirler.
    // Fakat farklı  package a geçildiğinde, "public" olanlara ulaşılabilir,"default" olanlara
    //ulasılamaz.
    int age =23;

    //Access Modifier'ı "private" olan class member lar sadece olusturulldukları
    //class içinden gorulebilirler.
    //Olusturuldukları class ın dışında gorunmez, ulasilmaz olurlar.
    private String healthCondition = "Cancer";

    //Access Modifier'ı "protected" olan class member lar aynı package içinde iken
    // "public" gibi davranırlar.
    //Farklı package e geçtiğinizde "protected" olanlar sadece child class larda gorulebilir.
    protected int salary = 3000;

    // Note: Class lar public ve default olabilir,. Ama private ve protected olamazlar.


}
