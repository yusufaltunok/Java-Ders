package lambda.lambdapractice;
import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elemanlariYazdir1(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();
        elemanlariYazdir2(nums); // 12 9 131 14 9 10 4 12 15
        System.out.println();
        ciftElemanlariYazdir(nums); // 12 14 10 4 12
        System.out.println();
        ciftElemanlariYazdir1(nums); // 12 14 10 4 12
        System.out.println();
        tekElemanlarinKaresiniYazdir(nums);// 81 17161 81 225
        System.out.println();
        tekElemanlarinKaresiniYazdir1(nums);// 81 17161 81 225
        System.out.println();
        tekElemanlarinKupleriniTekrarsizYazdir(nums);// 729 2248091 3375
        System.out.println();
        System.out.println(benzersizCiftElKarelerininToplaminiYazdir(nums));//456
        System.out.println(benzersizCiftElKarelerininCarpiminiYazdir(nums)); // 45158400
        System.out.println("***********************");
        maxDegerYazdir(nums); // max = 131
        System.out.println();
        maxDegerYazdir1(nums);// max1 = 131
        System.out.println();
        maxDegerYazdir2(nums);// max1 = 131
        System.out.println();
        minDegerYazdir(nums); // min : 4
        System.out.println();
        System.out.println(minDegerYazdir1(nums)); // 4


    }// main

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

public static void elemanlariYazdir1(List<Integer> nums){

    for (Integer w : nums ) {
        System.out.print(w+" ");
    }

}

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer> nums){ // [12,9,131,14,9,10,4,12,15]
        nums.
                stream().
                forEach(t->System.out.print(t+" "));
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanlariYazdir(List<Integer> nums){ // [12,9,131,14,9,10,4,12,15]
        for ( Integer w : nums  ) {
            if ( w % 2 == 0){
                System.out.print(w+" ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElemanlariYazdir1(List<Integer> nums){
        nums.
                stream().
                filter(t-> t % 2 ==0 ).
                forEach(t-> System.out.print(t+" "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElemanlarinKaresiniYazdir(List<Integer> nums){ // [12,9,131,14,9,10,4,12,15]
        for ( Integer w : nums  ) {
            if ( w % 2 == 1){
                w*=w;
                System.out.print(w+" ");
            }
        }
    }
    public static void tekElemanlarinKaresiniYazdir1(List<Integer> nums){
        nums.
                stream().
                filter(t-> t % 2 !=0 ).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t-> t % 2 !=0 ).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static Integer benzersizCiftElKarelerininToplaminiYazdir(List<Integer> nums){
        return nums.
                stream().
                distinct().
                filter(t-> t % 2 == 0 ).
                map(t->t*t).
                reduce(Math::addExact).// toplama metodu
                get();
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static Integer benzersizCiftElKarelerininCarpiminiYazdir(List<Integer> nums){
       return nums.
                stream().
                distinct().
                filter(t-> t % 2 == 0 ).
                map(t->t*t).
                reduce(Math::multiplyExact).get();
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void maxDegerYazdir(List<Integer> nums) {
        //1.Yol
        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " +max);
    }

    // 2.Yol
    public static void maxDegerYazdir1(List<Integer> nums){
        Integer max1 = nums.
                stream().
                distinct().
                reduce(nums.get(0),(t,u)-> t > u ? t : u);

        System.out.println("max1 = "+max1);

    }
       // 3.Yol
        public static void maxDegerYazdir2(List<Integer> nums){
            Integer max2 = nums.
                    stream().
                    distinct().
                    sorted().
                    reduce((t,u)->u).
                    get();
            System.out.println("max2 = "+max2);

        }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz
    public static void minDegerYazdir(List<Integer> nums){
        //1.Yol
        Integer min = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE,(t,u)-> t < u ? t : u );
        System.out.println("min : " + min);


    }
    public static Integer minDegerYazdir1(List<Integer> nums){

        return nums.
                stream().
                reduce(Math::min).
                get();
    }




}