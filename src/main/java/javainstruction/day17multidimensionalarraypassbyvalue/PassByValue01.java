package javainstruction.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
    Method oluşturmak için aşağıdaki 5 adımı takip ediniz:
    1-Access Modifier
    2-Return Type
    3-Method ismi
    4-Method parantez
    5-{} parantezleri method bodysi için

    Note: main method'un içindeki tüm method'lar statik olmalıdır.
           Bir method'u statik yapmak için Access Modifier ile return Type arasına
           "static" yazmak yeterlidir.

    Pass by Value
      1- Java "Pass by Value" kullanır.
      2-Yani; Java method'larin orjinal degeri degistirmesine musaade etmez
      3-Java method'lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi method'a yollar.
         Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.,
      4-Java esnek bir dil'dir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
        Bakiniz line 39

         Pass by Reference:
        1)Pass by Reference da method'a reference yollanir.
        2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
          orjinal degeri degistirir.
          Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.

     */
    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println(discount ("student",shirtPrice)); //180

        System.out.println(shirtPrice);// 200 indirim yapıldığı halde orijinal değer korunuyor.Buna "PassByValue" denir

        shirtPrice = discount("veteran",shirtPrice);
        System.out.println(shirtPrice);

    }

    // Discout (indirim) Method'u oluşturunuz.

    public static int discount (String type, int price) {
        switch (type) {
            case "student":
                price = price-20;
                break;
            case "veteran":
                price = price-40;
                break;
            case "senior":
                price = price-30;
                break;
        }
        return price;
    }

}

