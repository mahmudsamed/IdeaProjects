package day09incrementdecrementternaryswitch.suleymanhoca;

import java.util.Scanner;

public class nestedif04 {

/*
   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa 60 yasindan buyukse “Emekli Olabilir “yazdirin
   Eger calisan erkek ise 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz


    */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz.Erkek kadın Diğerleri.....");

        String gender=input.next();

        System.out.println("Yasınız giriniz...");

        int age = input.nextInt();






        if (age<0 || age>120){
            System.out.println("Lutfen yası 0 ile 120 arasında giriniz");


        }





        else if (gender.equalsIgnoreCase("Kadın")){

            if (age>60){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Calısmalı....");
            }


        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age > 65) {

                System.out.println("emekli olabilir");
            }else {
                System.out.println("Kesinlikle çalışmalı...");
            }

        }else {
            System.out.println("Tanımlanmadı....");
        }


    }




}
