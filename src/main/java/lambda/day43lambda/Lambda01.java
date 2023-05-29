package lambda.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish DayTime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish NightTime QA", 245, "Winter", 98);
        Course englishDay = new Course("English NightTime Dev", 121, "Spring", 91);
        Course englishNight = new Course("English NightTime Dev", 137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanNumber(courseList, 90));// true
        System.out.println(isAnyCourseNameContainsQa(courseList,"QA")); //true
        System.out.println(getCourseNamesWhoseAvgMax(courseList));// Turkish NightTime QA
        System.out.println(getCourseBetteThanLastTwo(courseList)); //[Course{courseName='Turkish DayTime QA', numOfStudents=213, season='Spring', averageScore=97.0}, Course{courseName='Turkish NightTime QA', numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getHighestThird(courseList)); //Course{courseName='English NightTime Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList,150));//[Course{courseName='English NightTime Dev', numOfStudents=121, season='Spring', averageScore=91.0}, Course{courseName='English NightTime Dev', numOfStudents=137, season='Winter', averageScore=95.0}]
    }

    // Example 1:Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz
    public static boolean isAvgScoreGreaterThanNumber(List<Course> courseList, int avg) {
        return courseList.stream().allMatch(t -> t.getAverageScore() > avg);

    }

    // Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz

    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word) {

        return courseList.stream().anyMatch(t -> t.getCourseName().contains(word));


    }

    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.

    public static String getCourseNamesWhoseAvgMax (List<Course>courseList){
        Course course = courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                reversed()).
                findFirst().
                get();

    return course.getCourseName();
    }
    /* bu sekilde de yapılabilir
      return courseList.
                            stream().
                            sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                            findFirst().
                            get().
                            getCourseName();

                            Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
Kusr ismi verileceginden metodumuzu String yaptik. parametre olarak sadece List'imizi yazmamiz yeterli, cunku list icindeki skoru en yuksek olan belirlidir ve verebilir.

metod icine sirasiyla courseList.stream.sorted(burada sorted metodlarindan ikincisini sectik, Comparator.comparing
(Course::getAverageScore) ve reversed() yazdik. Cunku tersten yazilinca skoru en yuksek olan en basa gelecek ve
biz ilk elemani isteyecegiz. reversed sonrasi findFirst() methdou ile ilk elemani alabiliriz. Son kismina
get() yazdik. Alt kisimda kurs adini alabilmemiz icin return course.getCourseName(); yazdik. Main metod icinde kodu calistirinca ekranda
Turkish Nighttime QA yazildi.

stream(): sirasiyla tum elemanlar alt alta yazildi.
sorted(Comparator.comparing(Course::getAverageScore): Sirasiyla skorlar alt alta su sekilde yazilacak;
91
95
97
98
reversed(): 98 olan en uste gelecek;
98
97
95
91
findFirst(): Birinci elemani alacak
get(): sadece data type'ini degistiriyor. get methodu icine 98 girmis olacak.
return course.getCourseName: Bize en yuksek skora sahip kursun ismini verdi.
     */


    //Example 4 :Average score'u en dusuk olan ilk iki kurs disindaki tum kurslari return eden method'u olusturunuz

    public static List<Course> getCourseBetteThanLastTwo(List<Course>courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }


    // Example 5:Average score'u üstten 3. olan kursu veren metodu olşturunuz.

    public static Course getHighestThird(List<Course>courseList) {

        return courseList.
                stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);

    }

    // Example 6:Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.

    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList, int numOfStd){
        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());
    }

}
