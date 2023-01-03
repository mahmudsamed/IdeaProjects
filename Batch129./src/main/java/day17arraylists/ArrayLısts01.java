package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLısts01 {

    /*
    1) Arraylist ler çoklu data depolamak için kullanılır
    2) Arraylistler non primitive data type indeki çoklu datları depolamak için kullanılır
    Listler non primitive data kabul ederler array ler ise primitive data veya reference kabul eder
    3)Arraylistleri oluştururken içine koyacagınız eleman sayısını başta söylemeye gerek yoktur
     List ler eleman sayısında flexible dırlar ama Array ler flexible değildirler
     4)Madem arrayler eleman sayısında flexible değil niçin java arrayleri iptal etmedi ?
     i)eleman sayısı belli olan dataları depolamak için arrayler tercih edilir
     ii)Arrayler cok hızlı calısır
     iii)Arrayler memoryde çok az yer kaplar
     */
    public static void main(String[] args) {

        //List nasıl oluşturulur ?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);// []

        //Lıstlere eleman nasıl eklenir
        //Lıste eleman eklemek için add methodu kullanırız
        //add methodu elemanları sizin verdiğiniz sırada Liste ekler.(Insertion)
        ages.add(12);
        ages.add(9);
        ages.add(10);

        ages.add(1, 656);
        ages.add(3, 43);
        ages.add(5, 23);
        System.out.println(ages);


        //Liste çoklu eleman nasıl eklenir? veya Lıste baska bir list nasıl eklenir?
        //Bir liste çoklu eleman eklemek için o elemanları once bir Listin içine koymlısınız

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);

        //bir list deki elemanları nasıl silebilirim ?
        //  ages.clear();

        //System.out.println(ages);

        //contains methodu bir elemanın var olup olmadıgını nasıl kontrol ederiz
        boolean r = ages.contains(656);
        System.out.println(r);
// Bir listin başka bi list ile aynı olup olmadıgını nasıl kontrol ederiz
        //İki listin eşit olabilmesi için aynı indexde aynı elemanlar olmalıdır

        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jim");
        names.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names.add("Tom");
        names.add("Kim");
        names.add("Jim");

        boolean s = names.equals(names2);
        System.out.println(s);

        //Example 1 : Verilen iki integer listde tamamıyla aaynı elemanların olup olmadıgını kontrol eden kodu yazınız


        ArrayList<Integer> nums1 = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);


    }
}
