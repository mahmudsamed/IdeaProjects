package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLısts03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");

        cities.add("Almaty");


        System.out.println(cities);
        //remove methodu index ile kullanılırsa o index deki elemanı siler

        String n = cities.remove(1);
        System.out.println(n);
        cities.remove(1);
        System.out.println(cities);
// remove methodu eleman ile kullanılırsa ilk gorunumu siler
// remove methodu eleman ile kullanılırsa size silip silmedigini ifade eden true yada false verir
        //eger eleman list de var ise o elemanı siler ve size true verir
        //eger eleman list de yok ise o elemanı siler ve size false verir

        boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);


        List<Integer> list = new ArrayList<>();
        list.add(21);

        list.add(22);
        list.add(23);
        int count = 0;
        for (int w : list) {
            count++;
            if (count < 3) {
                System.out.print(w + " ");
            }
        }
    }
}
