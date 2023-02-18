package demopractice;

import java.util.Arrays;

public class array {
    /*
    Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
     */

    public static void main(String[] args) {


        /*
        String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
         */


        String str[]={"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };


        String obj="";
        for (String w : str) {

            if (w.endsWith("n") || w.endsWith("k")){

                obj=obj + w.substring(0,1);



            }


        }
        System.out.println(obj);

















    }





}
