package day07ifstatement;

import java.util.Scanner;

public class C02_Ifstatementsuleymanhoca {
    public static void main(String[] args) {

//Example 2 : Kulanıcıdan alınan bir sayının tek mi çift mi olduğunu yazdıran kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("Cift Sayı...");
        }else {
            System.out.println("Tek Sayı...");
        }










    }
}
