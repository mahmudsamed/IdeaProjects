package day07ifstatement;

import java.util.Scanner;

public class C03_Ifstatementsuleymanhoca {


    public static void main(String[] args) {

        //verilen sayının pozitif negatif veya notr oldugunu kontrol eden kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int num=input.nextInt();

        if (num>0){
            System.out.println("Pozitif sayı....");
        } else if (num<0) {
            System.out.println("negatif sayı");

        }else {
            System.out.println("notr sayı");

        }


    }







}
