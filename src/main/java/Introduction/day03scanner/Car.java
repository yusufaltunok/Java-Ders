package Introduction.day03scanner;

public class Car {
    //Variable lar oluşturalım
    public String model = "Corolla";
    public int fiyat =200000;
    public boolean price;

    //Method lar oluşturalım
    //Note : return type void olduğunda method içinde return keyword u kullanılmaz
    //Eğer bir method yeni bir data üretmiyorsa sadece belli bir işlem yapıyorsa return type i void olur.

    public void hareket(){
        System.out.println("Corolla hizli hareket eder... ");

    }
    public void dur (){
        System.out.println("Corolla guvenli bir şekilde durur...");

    }



}
