package day05typecastinstringmanipulations;

public class StringManipulations01 {


    //String bir non primitive data type dır aynı zaman da class dır


    public static void main(String[] args) {

        String s = "Java is easy";

        //exanple 1 "s" Strinde ki tüm karakterleri buyuk harf yapınız


        String sUpper= s.toUpperCase();

        System.out.println(sUpper);
    //ex2 Strindeki harfleri kucuk yazdı
        String sLowerCase =s.toLowerCase();
        System.out.println(sLowerCase);

        //ex3 "s" stringinde ki ilk karakteri alınız

        char firstChar =s.charAt(0);

        System.out.println(firstChar);


        //ex3 "s" stringinde ki 2. ve sondan 2. karakteri alınız ekrana yanyana yazınız(charlar 0 dan başlar)

        char secondChar= s.charAt(1);
        char  lastsecondChar=s.charAt(10);
        System.out.println("newChart = " + lastsecondChar+secondChar);

        //2.yol

        System.out.print(lastsecondChar);
        System.out.println(secondChar);



        //s stringinde ki karakter sayısı kaçtır
        int slength=    s.length();
        System.out.println(slength);

        //s stringde ki  ilk 4 karakteri alınız
        //o yani ilk index dahil 4 yani ikinci index haricdir

        String sfirstchar=s.substring(0,4);

        System.out.println(sfirstchar);

        // is stringini yazınız
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        // easy stringini yazınız

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //sonuna kadar almak istersek ikinci indexi yazöayız

        String sub4=s.substring(8);

        System.out.println(sub4);


        //ex9 s stringnde money  var olup olmadıgını görünüz

        boolean isExit =s.contains("money");

        System.out.println(isExit);
        /*
        bir methodu öğrenirken 3 şeyi mutlaka öğrenin
        1)bu method ne iş yapar
        2)bu methodun farklı kullanımları nedir
        3)bu method size ne return eder
         */

        // EX 10 s stringinin belli bir harfle başlayıp başlamadıgını kontrol ediniz

        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        boolean imStart=s.startsWith("J");
        System.out.println(imStart);

        boolean ikStart=s.startsWith("");
        System.out.println(ikStart);

        //s stringinin altıncı karakterden itibaren belli bir harfla başlayıp başlamaduıgını kontrol ediniz
        // (kakarkter diyorsa sayma sayısı kullanılacak)

       boolean isBegin= s.startsWith("i",5);
        System.out.println(isBegin);


















    }














}
