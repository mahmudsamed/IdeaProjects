package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Bir stringde ki sesli harflerin sayisini bulan kodu yaziniz

        String str="Java ogrenince para kazanmak ne kolay , ogrenmeyince ne kadar zor";

        str=str.toLowerCase();

       String harfler[]=str.split("");

        System.out.println(Arrays.toString(harfler));


        int counter=0;

        for (String w : harfler) {


            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":


                    counter++;
            }

        }
        System.out.println(counter);






    }
}
