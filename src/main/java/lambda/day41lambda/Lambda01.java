package lambda.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums)); // 436
        System.out.println();
        System.out.println(getTheSumOfSquareOfOdds2(nums)); // 436
        System.out.println();
        System.out.println(getTheSumOfSquareOfOdds3(nums));// 436
        System.out.println();
        System.out.println(getMultiplicationOfSquareOfOfOddsEvens(nums)); // 147456
        System.out.println();
        System.out.println(getMultiplicationOfSquareOfOfOddsEvens1(nums)); // 147456
        System.out.println();
        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums)); //15
        System.out.println();



    }

    // Example 1: Verilen bir Listteki tek sayı olan elemanların kareleri toplamını hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1 (List<Integer> nums){
        return nums.
                stream().
                filter(t-> t % 2 != 0).
                map(t->t*t).
                reduce(0, (t,u)->t+u); // 17548
        // reduce()= azaltmak, indirgemek demektir.Bu ornekte 4 değeri toplayıp bire indirmiştir.
        // t-> her zaman baslangıç değerini ilk parametreden (0) alır.
        // u->tüm değerlerini stream'den alır.
        // 0+81 -> t=81 olur --> 81+17161 -> t=17242 olur --> 17242+81=17323 t=17323 olur -->1723+225=17548...
        // Listi değiştirdik.sayılar değişti

    }
    public static int getTheSumOfSquareOfOdds2 (List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 != 0).
                map( t -> t * t).
                reduce(0, Math::addExact); // Class ismi :: Method ismi -->Method Referance
    }

    public static int getTheSumOfSquareOfOdds3 (List<Integer> nums) {
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare). // ihtiyacınız olan metot java class larında yoksa Utils Class olusturup içinde
                reduce( Math::addExact). // ihtiyacınız olan metodu olusturunuz ve metot reference kullanınız.
                get(); //  Optional<Integer>i Integer'a çevirir. data tipini değiştirir
    }
    // Example 2: Verilen bir Listteki cift sayı olan elemanların tekrarsız olarak kareleri carpımını hesaplayan method olusturunuz.

    public static int getMultiplicationOfSquareOfOfOddsEvens (List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().// kareleri tekrarsız olacagı için karelerini aldıktan sonra tekrarsız olanları aldık
                reduce(1,(t,u)->t*u); //147456

    }
    public static int getMultiplicationOfSquareOfOfOddsEvens1 (List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isEven).
                map(Utils::getSquare).
                distinct().// kareleri tekrarsız olacagı için karelerini aldıktan sonra tekrarsız olanları aldık
                reduce(Math::multiplyExact).
                get(); //147456
    }

    // Example 3: Verilen bir Listteki cift sayı olan elemanların max değeri ile tek sayı olan elemanların min değerinin
    // toplamını hesaplayan method olusturunuz.

    public static int getTheSumOfEvenMaxAndOddMin (List<Integer> nums){

       int maxEven = nums.
                stream().
                distinct().// max bir tane olacagı için tekrarlıları çıkarıp hızlandırabiliriz
                filter(t->t%2==0).
                reduce((t,u)->t>u ? t: u).get(); // reduce()'u baslangıç değeri vermeden kullanırsak sonunda get() kullaırız
                          // baslangıç değeri olmadıgı için t'de u'da stream'den sırayla alacaklar
                          // 2. dongude t ilk dongunun sonucunu alır.
                         // t>u ? t: u -->Ternari t>u'dan buyuk olanı alacak
        int minOdd = nums.
                stream().
                filter(t->t%2!=0).
                reduce((t,u)->t<u ? t :u).get();

        return maxEven + minOdd; //15

    }
    public static int getTheSumOfEvenMaxAndOddMin1 (List<Integer> nums){

        int maxEven = nums.
                stream().
                distinct().// max bir tane olacagı için tekrarlıları çıkarıp hızlandırabiliriz
                filter(Utils::isEven).
                reduce(Math::max).
                get(); // reduce()'u baslangıç değeri vermeden kullanırsak sonunda get() kullaırız
        // baslangıç değeri olmadıgı için t'de u'da stream'den sırayla alacaklar
        // 2. dongude t ilk dongunun sonucunu alır.
        // t>u ? t: u -->Ternari t>u'dan buyuk olanı alacak
        int minOdd = nums.
                stream().
                filter(Utils::isOdd).
                reduce(Math::min).
                get();

        return maxEven + minOdd; //15

    }
    // Example 4: Verilen bir Listteki cift sayı olan elemanların 7'den kucuk max değeri ile
    // tek sayı olan elemanların 8'den buyuk min değerinin
    // toplamını hesaplayan method olusturunuz.

    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max = nums.
                stream().
                distinct().
                filter(t->t%2==0 && t<7).
                reduce((t,u)->t>u ? t : u).
                get();

        int min = nums.
                stream().
                distinct().
                filter(t->t%2!=0 && t>8).
                reduce((t,u)->t<u ? t : u).
                get();

        return max + min;
    }
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight1 (List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0 && t < 7).
                reduce((t, u) -> t > u ? t : u).
                get();



        int min = nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0 && t > 8).
                reduce((t, u) -> t < u ? t : u).
                get();

        return max + min;
    }



}
/*
Dersin basinda nums ismini verdigimiz Integer list olusturduk. Listteki tek sayi olan elemanlarin kareleri toplamini hesaplayan bir method olusturduk. Main method icinde cagirma yapabilmemiz icin methodu static yaptik.
public static int getTheSumOfSquareOdds(List<Integer> nums). Methdoumuz bir list ile calisacagindan
parantezi icine Integer Listimizi koyduk. Basa return yazdik ve bosluk birakarak listin ismini yazip devaminda stream methodunu yazdik. Basa neden return yazdik? Cunku sayilarin toplamini bize vermesini
isteyecegiz.Tek sayilari almamiz gerektiginden burada stream sonrasi filter kullandik.
't' harfi sayi olan elemanlarimizi temsil ediyor. Java'ya map methodu icinde elemani al,kendisi ile carp diyerek sayinin karesini almasini sagladik.
Daha sonra karesini aldiklarimizin toplamini alacagiz ancak sum methodu olmadigini gorduk ve reduce methodunu kullanmaya karar verdik. map methodu sonrasi nokta koydugumuzda 3 tane farkli parametreli reduce methodunu gorduk ve onlardan Integer identity gerektireni sectik.
Identity matematikte etkisiz eleman denir. Toplamada etkisiz eleman 0'dir.
Ilk parametre yapacagimiz islemin etkisiz elemani olmalidir. Carpma yaparken etkisiz eleman olarak 1'i aliriz. Reduce methodu icine ilk 0 yazdik ve devaminda javaya
"iki sayi aldiginda, sayilarin toplamini yap" dedik. O iki sayi yerine t ve u yazdik.
reduce(0,(t,u)t->t+u); ve kodu calistirmak icin main method icine giderek methodumuz ismini list ismi ile yazdik ve sout icine aldik.

Listimizi stream'e cevirince elemanlar yan yana degil alt alta siralandi. Filter methodu ile o elemanlardan tek sayi olanlar alindi ve yine alt alta sirali halde oldular. Daha sonra map methodu ile tek tek alinan elemanlarin kendileri ile carpimlari sonucu yani kareleri alt alta siralandi ve son olarak reduce methodu soyle calisti: t her zaman baslangic degerini ilk parametreden alir.Yani 0'dir ilk degeri.
u degerlerini her zaman son method icinde alt alta sirali stream'e cevrilmis elemanlardan alir. Yani basta sirali olan elemanlardan 9'un karesi olarak yazilan 81'i alacak. t ve u toplaninca 0+81=81 olacak
devam edecek. Bu defa t'nin degeri 81 olup, u ise sirali elemanlarimizdan ikinci siradaki 131'in karesi olan 17161'i alir ve 81+17161=17242 oldu ve t sonraki islem icin 17242 degerini aldi, u bu defa 3. siradaki eleman 81'i aldi. 17242+81=17323, t 17323 oldu, u 4. eleman 225'i aldi. t+u islemi yapilacagindan 17323+225=17548 sonucta biz ekranda 17548'i gorduk, methodu main method icinde calistirdigimizda.

reduce azaltmak, indirgemek demektir. Burada 4 deger vardi ve java bize bir deger verdi. Yani 4 degeri bir degere dusurerek azaltma yapilmis oldu. Ne zaman coklu datayi tekli dataya cevirmek istersek reduce methodunu kullanmaliyiz. Mesela 40 sayi var ve en buyugunu almak istedik. 40 sayi bire indirilecek oldugundan reduce methodunu kullanabiliriz. 40 sayinin minimumunu almamiz gerektiginde de reduce methodunu kullanabiliriz. Cunku bir tane minumum sayi vardir 40 sayi icerisinde.

Ikinci ornegimizde listteki cift sayilarin tekrarsiz olan karelerinin carpimini hesaplayan bir method olusturduk. Tekrarsiz diyorsa distinct methodu kullanmamiz gerektigini hatirlamaliyiz. Ancak burada distinc methodunu cift sayilarin kareleri alindiktan sonra kullanmaliyiz. Cunku soruda bizden tekrarsiz cift sayilari istemiyor, sayilarin karelerinde tekrar olmamasi istendi. Cift sayilari ararken sayi olan elemanimizi temsil eden t'nin 2'ye bolumunden kalan 0'a esit ise t cift sayidir olacak ve t'de cift sayilar birikecek. Eger cift sayilar tekrarsiz olsun denseydi distinct methodu stream methodu sonrasi kullanilirdi. Burada karelerin tekrarsiz olanlari istendiginden map icinde kare hesaplamasi yapildiktan sonra distinct methodunu kullandik. reduce methodunun ilk parametresi 1 olarak yazildi. Cunku carpma isleminde 1 etkisiz elemandir. Daha sonra t ve u t,u olarak yazildi. t basta 1'i deger olarak alacak. u ise distinct methodu icinde stream olarak alt alta sirali tekrarsiz kare olan elamanlardan birinci siradaki elemani ilk deger olarak alir. Burada basta 64 var. t*u islemi yapilacagindan, 1*64=64 olur.
Bir sonraki loop'da t'nin degeri 64 olacak.u ise ikinci siradaki elemani deger olarak alacak ve islem ayni yolla devam ederek en son carpma islemindeki sonucu bize return edecek. Methodumuzun parantezi icinde en basta return yazmistik, bize carpma isleminin sonucunu versin diye yazmistik.

Ucuncu ornegimizde, tek sayilarin minimum, cift sayilarin maksimum olanini bulmamiz gerekli. Yine bir listimiz var ve methodumuzu yazinca parantezi icine listimizi koyduk.
Javaya bu listi bir stream'e cevir ve sonra filtrele. Once cift sayilari filter methodu ile aldik ve maksimum olan sayiyi almak icin reduce methodunu kullandik. Javaya en buyuk sayiyi vermesi icin reduce methodu icinde ternary'i kullandik. reduce(t,u)t->t>u ? t : u);
Ancak kodumuzun kizardigini gorduk. Tekrar reduce methodlarina baktik. Burada etkisiz elemani yazdirmamiz gerekli olan reduce methodunu degil 1. siradaki reduce methodunu kullandik. Bu method bize Optional<Integer> veriyor. Oysa biz data type olarak methodumuza int yazdigimiz icin hata veriyor. O zaman get() methodunu yanina ekleyince Optional data type'i normal data type'a donebildi ve kizariklik sona erdi. Methodumuz icinde kodumuzu yazarken basta return yazmistik. return yazinca sonucu almaliyiz. Ancak biz yazdigimiz ilk kod ile maksimum sayiyi bulmus olacagiz. Ayrica minumum sayiyi bulmak icin ikinci bir islem iceren kodu yazmaliyiz. Yani islem
henuz bitmediginden bastaki return keyword'unu kaldirip, listimizin ismi ve devamindaki methodlari yeni olusturdugumuz int variable'ina assign ettik. Ayni islemi minumum sayiyi bulmak icin yazdigimiz kod icin de yapacagiz, yine baska bir int variable'ina assign edecegiz. int maxEven ve intminOdd variablelari olusturduk.

Minimum sayiyi bulmak icin reduce methodunu etkisiz eleman olmadan kullandigimiz icin methodun devamina get methodunu ekledik. reduce methodu icinde yine ternary kullandik, ancak bu defa minumum sayiyi alacagimiz icin t>u degil t<u ? t :u seklinde yazdik. return keywordunu islemlerimiz bitince en alta yazdik.
return maxEven + minOdd;

Dorduncu ornegimizde, filter'i degistirmemiz gerekecek. Yani filter methodu icine hem cift ve tek sayilari hem de 7'den kucuk ve 8'den buyuk olma kuralini maximum ve minumum elemanlar icin yerlestirmemiz gerekti.
Methodumuzu olusturduktan sonra parantezi icine listimizi koyduk ve method body'si icinde iki ayri islem yaptik. Yukaridaki soru cozumunde oldugu gibi maximum ve minumum sayilarla ilgili iki ayri int variable olusturduk. Yukaridaki cozumden farkli olarak filter methodu icinde birden fazla kurali belirttik. listimizin ismi, stream methodu, distinct methodu, filter methodu, reduce methodu ve kullandigimiz reduce methodu type'ina gore get methodunu yazdik.
filter methodu icine ilk kisimda t->t%2==0 && t<7 yazdik. Ikinci kisimda ise t->t%2!=0 && t>8 yazdik.
filter methodlarimizin devaminda istenen sonuca uygun olarak reduce methodlarimizi ternary kullanarak yazdik.
reduce methodu devaminde get methodu yazdik ve alt kisimda bize javanin neyi return etmesini istediysek o sekilde return'u yazdik. return max + min; Daha sonra main methoduna giderek methodumuzu list ismi ile birlikte sout icinde yazdirip sonucu gorduk.

filter methodu icinde t->t%2==0 && t<7 Lambda expression'dir. Ideal kodu yazarken mumkun oldugunca bu sekilde bir yazim olmamali. Lambda experssion yerine method reference kullanmaliyiz. Ayni sorulari
tekrarladik method reference'i kullanabilmemiz icin. Bunun icin sadece onceden olustrudugumuz methodlarin
isimlerini basitce degistirdik. Onceki kodumuz icinde reduce methodu icinde yazdigimizi sildik ve Math Class'i icine giderek methodlara baktik. Bize toplama methodu lazimdi o nedenle add methodunu aldik ve onu kullandik. reduce methodu icine soyle yazdik reduce(0, Math::addExact)
Daha sonra main methodu icine gidip ismini degistirdigimiz methodu yazdirinca bize onceki kodumuzda verdigi ayni sonucu yazdirdi. Math::addExact bu soz dizimine method reference denir. Methodu refere ettik.

Lambda expression'lari kaldirmamiz gerekir.

reduce methodu icinde  (0, (t,u)->t+u) yazmak yerine, (Math: :addExact) yazdik.
O kisim kizarinca, yanina get methodu ekleyince duzeldi.

Baska bir kodumuzda sayinin karesini almamiz gerekmisti. Math Class'ina gittik ve sayilarin karesini alan bir method var mi diye baktik ve bulamadik. Applicationimizda kare alma sikca kullanilacak bir islem ise onun icin package kismina gelip Utils Class isimli class'i olusturmaliyiz. Utils demek sik kullanilanlardir ve faydali
methodlarin depolandigi yer demektir. Bir kere bu class'i olusturup lazim olan methodu bir kere olusturup,buraya depolariz ki daha sonra kullanabilelim.

Utils class'i icinde public static int getSquare(int a){
return a*a;
}
Ayni package icinde bu classimizi olusturduk ve kodumuzu yazdigimiz class'a geri donerek reduce methodu icinden Utils: :getSquare yazarak bu method Math Classinda olmasa dahi onceden olusturdugum methoddan istifade ettim. getSquare ismini methoda biz vermistik ve methodun ismini yazdik reduce methodu icine.

Utils Classimizda bir isOdd methodu olusturduk ve kodumuzu yazdigimiz class'a geri gelip, reduce methodu icine
Utils: :isOdd) yazarak Utils'deki methoddan faydalandik.

Ideal kod sadece methodlardan olusan koddur.
Utils Class'indaki methodlar tekrar kullanabilecegimiz faydali methodlardir.
 */