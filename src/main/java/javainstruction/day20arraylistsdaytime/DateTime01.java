package javainstruction.day20arraylistsdaytime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        // İçinde bulundugumuz zaman dilimindeki tarihi nasıl alırız?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2023-03-15

        // Tarihten istediğimiz bileşeni nasıl alırız?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        // Asagidaki Month bir "Enum"dir.
        //"Enum" Java'da sabit degerleri(Ay, gun, sehir, gezegen isimleri) depolamak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//MARCH

        //Asagidsaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        // İleri bir tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));//2027-05-20

        // Gecmis bir tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2)
                .minusDays(18));//1992-12-28

        //Spesific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);

        // Bir tarihin bir tarihten sonra olup olmadıgı nasıl kontrol edilir?
        boolean r1 =gokhanDob.isAfter(fatihDob); //true
        System.out.println(r1);

        // Bir tarihin bir tarihten once olup olmadıgı nasıl kontrol edilir?
        boolean r2=fatihDob.isBefore(gokhanDob);
        System.out.println(r2);//true

        // Bir tarihin bir tarihe esit olup olmadıgı nasıl kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);//false

        // Ezample 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz Tarih Girdiniz"mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani Girebilirsiniz" deyiniz


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");
        int year =input.nextInt();
        int month =input.nextInt();
        int day =input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");

        }else {
            System.out.println("Enter time for the ticket");
        }


        int lengtOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lengtOfMonth);//31


        // Ezample 2: Kullanıcının girdigi tarihin gun ismini bulan kodu yazınız.

        System.out.println("Please enter year, month and day numbers in the given order");
        int y =input.nextInt();
        int m =input.nextInt();
        int d =input.nextInt();

        LocalDate Date = LocalDate.of(y, m, d);
        System.out.println( Date.getDayOfWeek());// 1977.10.10 ==> MONDAY





    }
}
