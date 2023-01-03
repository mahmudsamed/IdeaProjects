package day07ifstatement;

import java.util.Scanner;

public class C04_ifstatementsuleymanhoca {


    //Example 01 Gun sayısını verdiğinizde gün ismini yazan kodu yazınız
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen kacıncı gun oldugunu giriniz");
            byte num = input.nextByte();

            if (num == 1) {
                System.out.println("Pazar");
            } else if (num == 2) {
                System.out.println("Pazartesi");
            } else if (num == 3) {
                System.out.println("salı");
            } else if (num == 4) {
                System.out.println("çarşamba");
            } else if (num == 5) {
                System.out.println("perşembe");
            } else if (num == 6) {
                System.out.println("cuma");
            } else if (num == 7) {
                System.out.println("cumartesi");
            } else {
                System.out.println("Hatalı giriş yaptınız.Lütfen 1 ile 7 arasında sayı giriniz");
            }


        }


    }

