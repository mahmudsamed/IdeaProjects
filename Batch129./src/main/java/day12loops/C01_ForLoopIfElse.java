package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {


    /*
    Kullanıcıdan başkangıç ve bitiş değerlerini alın
    Başlangıc degerinden baslayıp bitiş degerine kadar tum sayıları ekrana yazdrın

     */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen başlangıc degerini giriniz");
        int num1=input.nextInt();
        System.out.println("Lutfen bitiş degerini giriniz");
        int num2=input.nextInt();


        if (num1>num2){
            System.out.println("Verdiğiniz baslangıc degeri bitiş degerinden kucuk olmalı");
        }


        for (int i = num1; i <=num2 ; i++) {


            System.out.println(i+" ");
        }


    }
}
