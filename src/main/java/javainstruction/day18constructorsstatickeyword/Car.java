package javainstruction.day18constructorsstatickeyword;
    /*
    1) Constructor nasıl oluşturulur?
        Access Modifier + Class ismi +() + {}
    2)  "Method" ile Constructor arasındaki farklar nelerdir?
        i) "Method"larda "return type" olur, "constructor"larda olmaz.
        ii) "Method"lar yaptıkları işe gore isimlendirilirler, "constructor" ise har zaman "Class ismi"ile isimlendirilirler
        iii) "Method"lar bir aksiyon yapmak için oluşturulur. Constructor lar ise object oluşturmak içindir
        iv)"Method" isimleri kucuk harfle baslar, "Constructor" isimleri class ismi ile ayni oldugu icin buyuk harfle baslar.
        3)Parametreli Constructor'lar olusturarak ayni class'dan farkli ozelliklere sahip object'ler olusturabiliriz.
    */

public class Car {

        String make = "Honda";
        String model = "Accord";
        int year = 2021;
        int price = 18000;

        // Default constructor'lar "parametre" kullanmazlar
        // Default constructor'ların body'si boştur.
        // Java kıskançtır.Siz Default constructor'ı elle yazdıgınızda
        // Java Object Class içindeki constructor'i kullandirtmaz.

        public Car(){

        }

        // Custom constructor
        public Car(String make, String model, int year, int price) {
                this.make = make;
                this.model = model;
                this.year = year;
                this.price = price;
        }

        // Custom constructor
        public Car(String make) {
                this.make = make;
        }

        public Car(String make, int price) {
                this.make = make;
                this.price = price;
        }
}
