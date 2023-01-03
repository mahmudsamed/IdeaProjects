package day05typecastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "learn Java  earn money";


        //Ex 1  s stringinin "money" ile bitip bitmediğini kontrol ediniz

       boolean isEnd= s.endsWith("money");
        System.out.println(isEnd);

        boolean isEndd= s.endsWith("y");

        System.out.println(isEndd);

//ex 2 s stringin deki money kelimesini " dolar " kelimesine çeviriniz

        String s1= s.replace("money","dollar");
        System.out.println(s1);
//ex3 earn kelimesini win kelimesine çeviriniz ...(replace )strindeki bütün kelimeri earn e çevirir

        String s2= s.replace("earn","win");
        System.out.println(s2);

        String s3 = s.replace("a","*");

        System.out.println(s3);

        //not replace methodunda coklu character ile calısırsanız cift tırnak kullanacaksınız
        //tek characterde tek tırnak kullanabiliriz

        // ex 5 n harfini "xxx" e çevirelim

       String s4 =s.replace("n","***");
        System.out.println(s4);


        // ex 6 s stringindek i bütün e harflerini siliiz
        // hiçbir şey char data type ında yoktur bu yüzden replace kulanarak silme işlemi yaparsanız
       //mutlaka çift tırnak kullanırız

        String s5= s.replace("e","");


        System.out.println(s5);





        String t = "Ali 13 yasindadir!...";


              // ex 7  t stringindeki tüm rakamları * çeviriniz
        // bir grup datayı değiştirmek için replaceAll kulanılır
        //bir gerup datayı ifade etmek için regular expressions kullanırız

        String newt=t.replaceAll("[0-9]","*");

        System.out.println(newt);


        String newt1=t.replaceAll("[a-z]","+");
        System.out.println(newt1);

        /*
        1) eger tüm rakamlar****> [0-9]
        2) eger tüm harfler ****>[a-z]
        3) tum harfler ve rakamlar****> [a-zA-Z0-9]
        4) tum noktalama isaretleri***> \\p{Punct}  ezberle
        5) tum sesli harfler **>[aeiou]

              x,q,w,q***> [xqw]

        6) kucuk harflerden farklı tum karakterler***>[^a-z]
            ^ ( den farklı anlamına gelir)


        7) tum harflerden farklıu tum karakterler***> [^a-zA-Z]
        8) space dısındaki tum characterler

         */

        //EX8 t stringindeki tum rakam ve harfleri ! e cevirin

        String t3=t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println(t3);




        //EX9 T STRİNGİNDE Kİ TÜM SESLİ HARFLERİ ? E çeviriniz

       String t4= t.replaceAll("[AEIOUaeoui]","?");
        System.out.println(t4);

        // ex 10 t stringiinde kucuk harfler dısındaki tum karakterleri "<>" ceviriniz

        String t5=t.replaceAll("[^a-z]","<>");
        System.out.println(t5);



        // EX

      String t6=  t.replaceAll("[^a-zA-z]","*");
        System.out.println(t6);


        // t stringindeki space ler dsındaki tum karakterleri + ya ceviriniz

     String t7=   t.replaceAll("[^ ]","+");


        System.out.println(t7);

        // sesli harfler dısında ki, tum karakterleri & e ceviriniz

      String t8=  t.replaceAll("[^(aeiouAEIOU)]","&");

        System.out.println(t8);




















































    }
}
