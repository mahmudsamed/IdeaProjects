package src.main.java.practice.practiceDTNT;

import java.util.Scanner;

public class C02_Ifstatement {


    public static void main(String[] args) {

        /*
         Kulanıcıdan alacagınız 2 sayıyı yine kulanıcıya
         sectirecegiz dort işlemden biri ile işleme koyup yazdırınız


         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen toplama yapmak için 1 çıkarma yapmak için 2"
               + "çarpma yapmak için 3 bolme yapmak için 4 giriniz");


        int islem=input.nextInt();

        System.out.println("Lutfen 2 tam sayı giriniz");

        double num1=input.nextDouble();//1.sayı assign edildi
        double num2=input.nextDouble();//2.sayı assign edildi


        if(islem==1){
            System.out.println("Toplama isleminin sonucu : "+ num1 +"+"+num2+"="+(num1+num2) );
        }else if(islem==2){
            System.out.println("Cıkarma isleminin sonucu : "+ num1 +"-"+num2+"="+(num1-num2) );
        }else if(islem==3){
            System.out.println("Carpma isleminin sonucu : "+ num1 +"*"+num2+"="+(num1*num2) );
        }else if(islem==4){
            System.out.println("Bölme isleminin sonucu : "+ num1 +"/"+num2+"="+(num1/num2) );
        }else
        {System.out.println("Hatalı secim yaotınız lutfen 2 tam sayı giriniz");
        }










    }
}
