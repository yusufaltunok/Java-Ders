package javainstruction.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // Anlik zamani nasil aliriz?

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:04:55.991255300

        //  anlik Zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int namo = myCurrentTime.getNano();
        System.out.println(namo);

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        // HH 24'luk saat sistemi hh 12'lik saat sistemi
        // hh:mm a ifadesindeki a 12'lik saat sisteminde 'AM' , 'PM' yazilmasini saglar
        //ss saniyeyi gosterir.
        // mm 'minute', 'MM' month demektir.

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH.mm a");

        String formattedmyCurrentTime= dtf1.format(myCurrentTime);
        System.out.println(formattedmyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate =LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25


        //Tarihi Ay/Gun/Yıl sekline çeviriniz.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedmyCurrentDate1 = dtf2.format(myCurrentDate);
        System.out.println(formattedmyCurrentDate1);//08/25/2022

        //Tarihi Gun/ Ay isminin ilk 3 harfi/Yıl sekline çeviriniz.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedmyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedmyCurrentDate2);//25/Ağu/22

        //Tarihi Gun/Ay ismi/Yıl sekline çeviriniz.
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/Ağustos/2022


        //Baska bir zaman dilimindeki tarih ve zamanı nasil aliriz?

        //Tokyo'da ayın kaçı?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17

        //Taskent'da ayın kaçı?
        LocalDate dateInTashkent =LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        //Tokyo'da saat kaç?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//03:46:40.521834700

        //Berlin'da saat kaç?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:49:07.876206300














    }
}
