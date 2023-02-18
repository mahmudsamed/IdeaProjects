package day22statticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {


    //Date Class
    public static void main(String[] args) {
        Date myDate = new Date();

        System.out.println(myDate);//Sat Jan 07 23:26:32 EET 2023

        System.out.println(myDate.getTime());//1673123312245 1 Ocak 1970 den su ana kadar ki milli saniye miktari


        //Icinde bulundugumuz an nasil alinir ?

        System.out.println(LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());//23:34:36.534035

        System.out.println(LocalDateTime.now());//2023-01-07T23:36:04.246691

//Dunyanin herhani bir saat dilimindeki saati nasi aliriz

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));//2023-01-07T21:44:25.158709
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:44.962970
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:46:29.627087


//Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12


        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05


       //Ileriki bir zamana nasil gidilir ?

        System.out.println(LocalTime.now().plusHours(3));//02:56:16.999460
//Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:38.052123


        //Zamanda belli bir bolumu nasil aliriz ?

        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:4



        //Tarihde belli bir bolumu alma

        System.out.println(LocalDate.now().getMonth()+ ":"+ LocalDate.now().getDayOfMonth());//JANUARY:8


        //Iki tarih nasil karsilastirilir ?
        //02/13/2005 - 03/01/2007
       boolean result= LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
       boolean result2= LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result);//true
        System.out.println(result2);//false

        //Tarihlerin formmatlari nasil degistirilir ?
        // M --> tek rakamla ay nos unu yazar  - MM -->iki rakamla ay nosunu yazar
        //MMM --> ay isminin ilk uc harfini yazar - MMMM --> ay isminin tamamini yazar

        //d --> Tek rakamla gun nosunu yazar - dd--> iki rakamla gun no sunu yazar

        //yy --> yilin son iki rakamini yazar - yyyy --> yilin tamamini yazar

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));//08/01/2023



    }





}
