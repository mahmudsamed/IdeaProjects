package day16daymultidimensionalarrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

       /*
bir array`in icindeki data yine bir array ise buna "multidimensional array" denir
 */

        int arr[][]=new int[3][2];//auter array==> 3

        // inner array = 2 olan bir multidimensional array olusturduk
        // Bu yontemle inner arrayler sabit olmak zorunda

        System.out.println(Arrays.toString(arr));
        // ıcındekı data nonprimitive oldugu ıcın adreslerı gorurum
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(Arrays.deepToString(arr));//multidimensıonal arrayler bu sekılde yazdırılır

        //Arraylere eleman eklemenın 2ç yontemı ıle
        //hem declare edip hemde deger atama yontemı

        int arr2[][]={{2,3},{9},{78,6,4,5}};

        System.out.println(Arrays.deepToString(arr2));

        System.out.println(Arrays.toString(arr2[1]));


        //Multidimensional Arraylere eleman nasıl eklenır

        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;


        System.out.println(Arrays.deepToString(arr));


        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);




        String brr[][]=new String[3][2];

        brr[0][0]="a";
        brr[0][1]="b";

        brr[1][0]="c";
        brr[1][1]="d";

        brr[2][0]="e";
        brr[2][1]="f";

        System.out.println(Arrays.deepToString(brr));
        
        int sum=0;
        for (String[] w : brr) {//w=each (her bir) w=Array

           sum= sum+w.length;

        }

        System.out.println(sum);


        int crr[][] = {{2, 5, 1}, {32, 75}};
        int summ=0;

        System.out.println(Arrays.deepToString(crr));

        for (int[] w : crr) {

            for (int i : w) {// i artık array degil arrayın ıcındekı ınteger deger

                summ=summ+i;

            }
        }

        System.out.println(summ);


        //Multidimensional Array i tek katlı Array e cevırme
        /*
        1)Eleman sayısını bulun
        2)Yeni array almalıyım yenı olusturdugum bu arrayın buyuklugu ılk multıdımensıonal
         arrayın eleman sayısına esıt olmalı

         */
        int krr[][] = {{2, 5, 1}, {32, 75}};//3 + 2=5 daire


        int toplam=0;
        System.out.println(Arrays.deepToString(krr));

        for (int[] w : krr) {//krr multidimensional arrayın ıcınden her bir w arrayını al

           toplam=toplam+w.length;


        }
        System.out.println(toplam);// burada yenı olustaracagımız arrayın buyuklugunu belırledık
         int idx=0;

         int hrr[]=new int[toplam];

        for (int[] w : krr) {
            for (int k : w) {//w arryaının ıcındekı her bır k degerını getır

                            //yenı hrr arrayının ıcıne ıdx e gore yerlestır

                hrr[idx]=k;

                idx++;

            }
        }

        System.out.println(Arrays.toString(hrr));


    }
}
