package day11loops;

import java.util.Scanner;

public class C07_ForLoop {

    public static void main(String[] args) {


     /*   Type code to print the following image on the console
        X X X X X
        X X X X X
        X X X X X
                */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen satır ve sutun sayısını giriniz");
        int satır=input.nextInt();
        int sutun=input.nextInt();

        for (int i = 1; i <=satır ; i++) {
            String str="";
            for (int j = 1; j <= sutun; j++) {
                str=str+" X ";
            }
            System.out.println("str = " + str);

        }



    }
}
