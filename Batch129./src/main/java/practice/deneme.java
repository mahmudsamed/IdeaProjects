package practice;

import suleymanhoca.Lists02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class deneme {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Ebubekir","Ayse","Zeynep","Ada","Okan","Semih",
                "Gulsen","Ali","Semih","bilal"));

        buyuktekrarsiz(isimler);
        System.out.println();
        karaktersayisi(isimler);
        System.out.println();
        kucukbuyukkarakter(isimler);
        System.out.println();
        yedikarakter(isimler);
        System.out.println();


    }

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void buyuktekrarsiz(List<String> isimler){
        isimler.stream().distinct().map(String::toUpperCase).sorted().forEach(t-> System.out.print(t + " "));

    }
    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void karaktersayisi(List<String> isimler){
        isimler.stream().distinct().map(String::length).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }
    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

    public static void kucukbuyukkarakter(List<String> isimler){
        isimler.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+ " "));

    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void yedikarakter(List<String> isimler){
        System.out.println(   isimler.stream().allMatch(t-> t.length()<=7) );
    }
}