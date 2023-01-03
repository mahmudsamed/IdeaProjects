package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {

    /*
       Example 1: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/

    public static void main(String[] args) {


        for (int i = 1; i <6 ; i++) {//satır kontrolu


            for (int j = 1; j <=i ; j++) {//rakam kontrol

                System.out.print(j+" ");

            }

            System.out.println();//alt satıra attı
        }

        /*

    Example 2: Asagidaki sekli cizdiren cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
 */

        System.out.println("Example 2");


        for (int i = 1; i <=4 ; i++) {//satır kontrol
            for (int j = 4; j >=i; j--) {//yıldız kontrol

                System.out.print(" * ");//yıldız yazdırır
            }
            System.out.println();
        }




        /*

             *
            * *
           *   *
          *     *
         * * * * *

satır saysını kullanıcıdan yukarıdaki şekli yazdrınız

         */



        System.out.println("example3");

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen satır sayısı degerini giriniz");
        int num1=input.nextInt();



        for (int i = 1; i<=num1 ; i++) {//satır kontrol

            for (int bosluk = num1; bosluk >=i ; bosluk--) {//bosluk kontrol

                System.out.print("o");
            }

            for (int yıldız = 1; yıldız <=i ; yıldız++) {//yıldız kontrol

                if (yıldız==1 || yıldız==i){
                    System.out.print("* ");//en dıstaki yıldızlar
                } else if (i==num1) {
                    System.out.print("* ");//en alt satır
                }else System.out.print("  ");//3. ve 4. satır



            }
            System.out.println();
        }




    }






}
