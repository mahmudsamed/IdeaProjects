package mentorhomework.advancepractice;

import java.util.ArrayList;
import java.util.List;

public class Q02_Arrays_Ortakelemanlar {
    public static void main(String[] args) {
        /*
     * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
     * (case sensitivity olmadan)
     * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                     String[] brr = {"sofia","brad","grace","emily","hazel"};
     * Output : [brad,sofia,emily]
     */

        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> list = new ArrayList<>();

        for (String w : arr) {
            for (String u : brr) {
                if (w.equalsIgnoreCase(u)) {

                    list.add(w);

                }
            }
        }

        System.out.println("list = " + list);


    }


}
