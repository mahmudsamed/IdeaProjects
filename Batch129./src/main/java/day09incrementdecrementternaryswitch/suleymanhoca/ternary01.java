package day09incrementdecrementternaryswitch.suleymanhoca;

import java.util.Scanner;

public class ternary01 {


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen iki sayı giriniz.....");

        double a =input.nextDouble();
        double b =input.nextDouble();

        if (a<b){
            System.out.println(a);

        }else {
            System.out.println(b);
        }


        //2.yol:Ternary
        //              condition               ? condition  true ise çalışır     :  false ise çalışır
        double result=          a<b           ?     a                           :           b           ;


        System.out.println(result);






















    }
}
