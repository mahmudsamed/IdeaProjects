package suleymanhoca;

import java.util.Scanner;

public class Forlooop033 {

/*
            Example 1: Asagidaki sekli cizdiren kodu yaziniz
                        * * * *
                        * * *
                        * *
                        *
         */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Satır(row) sayısını giriniz");
        int row=input.nextInt();



        for (int i = 1; i <=row ; i++) {


            for (int j = row; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }

}
