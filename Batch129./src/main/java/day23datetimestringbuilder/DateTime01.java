package day23datetimestringbuilder;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {



        public static void main(String[] args) {
            //Example 1: Time í formatlayiniz
            LocalTime myTime=LocalTime.now();
            System.out.println(myTime);//19:42:03.977899
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh-mm a ");

            System.out.println(dtf.format(myTime));//07-44 PM "a"harfi eklenince PM yada AM seklinde yazar
            //HH yaparsak 24 satlik zaman dilimini kullanilir
            DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH-mm ");
            System.out.println(dtf1.format(myTime));//19-48

            DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm :ss a ");
            System.out.println(dtf2.format(myTime));//07:49 :32 PM

            LocalDateTime mine=LocalDateTime.now();
            System.out.println(mine);

        }
}
