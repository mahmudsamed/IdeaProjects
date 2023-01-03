package day14arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //note 1 :sort methodu sayısal data typlerini kucuk ten buyuge sıralar(ascending order)
        //note 2 :sort methodu String data typlerini alfabetik olarak sıralar(alphabetical order)
        //note 3 :(ascending order)+(alphabetical order)=natural order
        //note 4  :sort methodu array elemanlarını natural ordera göre sıralar
        //note:5 binary search metodunu kullanmadan önce sort metodunu kulanırız
        //note 6:binary search metodu bir elemanın bir arrayde olup olmadıgını kontrol etmek için kullanılır.
        String colors[] = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));
       int num= Arrays.binarySearch(colors,"Blue");

        System.out.println(num);

        int num2= Arrays.binarySearch(colors,"Orange");

        System.out.println(num2);

        int num3= Arrays.binarySearch(colors,"samed");

        System.out.println(num3);// -7 ==>"-" bu eleman yok demek
                                 // 7 ise olsaydı 6.eleman olurdu







    }
}
