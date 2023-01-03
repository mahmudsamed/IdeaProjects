package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {
      //Arama motorunda guzel ısımler adlı bır applıcatıon ıcın ısımlerı
      //kucukten buyuge sıralayan kodu yazınız

       String arr[]={"Abdurrahman","Emre","Yunus","Ali","Mehmet","Can","Veli"};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //String array elemanlarını karakter sayısına göre vw buyukten kucuge sıralayınız

        String brr[]={"Abdurrahman","Emre","Yunus","Ali","Mehmet","Can","Veli"};

        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(brr));

    }
}
