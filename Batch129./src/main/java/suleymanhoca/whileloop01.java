package suleymanhoca;

import java.util.Scanner;

public class whileloop01 {

    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayıları yazdırn

        int i=3;
        while (i<11){
            System.out.println(i);
            i++;
        }
// example 2 23 den 12 ye kadar cift tamsayıları yazdır
        System.out.println("******");
        int m=23;
        while (m>11){
if (m%2==0)
            System.out.println(m);
            m--;
        }

//Examplw 3: Verilen bir tamssayını rakamları toplamını konsola yazdıran kodu yazınız


        System.out.println("*******");
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı griniz");
        int num=input.nextInt();

        int sum=0;

            while (num>0){

                sum=sum + num%10;
                num/=10;
            }
        System.out.println(sum);

    }
}
