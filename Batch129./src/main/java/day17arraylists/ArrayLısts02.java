package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLısts02 {
    public static void main(String[] args) {
//ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz.
//Ama sol tarafa ister "ArrayList" yazin isterseniz de "List" yazin,ikisi de calisir.

        List<Character> initials = new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        //Bir listde kac eleman oldugunu nasıl anlarız
        int numOfElements = initials.size();
        System.out.println(numOfElements);

        //Note arraylerden bahsederken length kullanın
        //Listlerden bahsederken size kullanın
//Bir listden istenen bir eleman nasıl alınır
        char u = initials.get(2);
        System.out.println(u);

        //Example 1 : Verilen bir string listdeki elemanların toplam karakter sayısını bulunuz

        List<String> initialss = new ArrayList<>();

        initialss.add("Miami");
        initialss.add("Istanbul");
        initialss.add("Kayseri");
        initialss.add("Almaty");


//1.yol Recomennded
        int sum = 0;
        for (String w : initialss) {
            w.length();

            sum = sum + w.length();

        }

        System.out.println(sum);

        //2.yol
        int toplam=0;
        for (int i = 0; i <initialss.size() ; i++) {
            toplam=toplam+initialss.get(i).length();
        }

        System.out.println(toplam);
        //Bir listdeki istenen bir elemanı nasıl degistirebiliriz?

        initialss.set(0,"New York");
        System.out.println(initialss);

        //Example 2 : Maas list i olustrunuz ve maaslara yuzde 20 zam yapınız

        List<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        int idx=0;

      //  for (Double w: salary){
        //    salary.set(idx,w*1.20);

            idx++;

      //  }
        System.out.println(salary);


        //2.yol
        for (int i = 0; i <salary.size() ; i++) {

            salary.set(i,salary.get(i)*1.20);

        }

        System.out.println(salary);






















    }
}
