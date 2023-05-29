package lambda.day42lambda;
import lambda.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(10, 7));
        System.out.println(getMultiplicationInTheGivenRange(10, 7));
        System.out.println(getSumOfDigitsInTheGivenRange(47, 45));

    }

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).sum();
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3: 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();

    }
}
/*
IntStream. yapinca methodlari gorduk. rangeClosed methodunu sectik. Cunku ilk sayi dahil, ikinci sayi haric olacak.
method parantezi icine starting, ending yazdik.
Boylece eger 7 ve 10 sayisi verilirse 7 dahil, 10 dahil olur. Eger rangeClosed yerine range methodunu secseydik 10 haric olacakti.

Java'da, rangeClosed() ve range() metotları IntStream, LongStream ve DoubleStream interface'leri tarafından sağlanan, belirli bir aralıkta değerler üreten metotlardir.

rangeClosed(int startInclusive, int endInclusive) metodu, startInclusive ile endInclusive arasındaki
tam sayıları içeren bir akım üretir. Örneğin, IntStream.rangeClosed(7, 10) metodu, 7, 8, 9 ve 10 değerlerini içeren bir stream üretir.

range(int startInclusive, int endExclusive) metodu, startInclusive ile endExclusive arasındaki
tam sayıları içeren bir akım üretir. Ancak, endExclusive parametresi dahil edilmez.
Örneğin, IntStream.range(7, 10) metodu, 7, 8 ve 9 değerlerini içeren bir stream üretir.

Bu nedenle, rangeClosed() ve range() arasındaki temel fark, rangeClosed() metodu ile belirtilen
aralığın uç noktalarının dahil edilip edilmediğidir. rangeClosed() metodu, aralığın her iki
uç noktasını da dahil ederken, range() metodu ikinci parametre olarak belirtilen uç noktasını dahil etmez.

Bu nedenle, eğer uç noktaları da aralığa dahil etmek istiyorsanız, rangeClosed() metodunu kullanmalısınız.
Eğer uç noktaları dahil etmek istemiyorsanız, range() metodunu kullanmalısınız.
Örneğinizde, range() metodu ile 7 ve 10 parametreleri kullanılırsa, sonuçta elde edilecek stream
7, 8 ve 9 değerlerini içerecektir, ancak 10 değerini içermeyecektir. Aynı parametrelerle rangeClosed() metodu kullanılırsa, elde edilecek stream 7, 8, 9 ve 10 değerlerini içerecektir.
 */