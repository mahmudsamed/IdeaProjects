package day09incrementdecrementternaryswitch.suleymanhoca;

import java.util.Scanner;

public class forloopwhileloop {

/*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Satır(row) sayısını giriniz");
        int row=input.nextInt();
        System.out.println("Sutun(column) sayısını giriniz");
        int column=input.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=column; j++) {
                System.out.print("X ");

            }
            System.out.println();
        }

        System.out.println("2.yol****");


        for (int i = 1; i <4 ; i++) {

            for (int j = 1; j <6; j++) {
                System.out.print("X ");

            }
            System.out.println();
        }

    }
}

