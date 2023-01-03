package day07ifstatement;

import java.util.Scanner;

public class C01_Ifstatement {

    public static void main(String[] args) {

        // if rains,i will cancel the picnic
        //eger yağmur yağarsa pikniği iptal edeceğim

        //example1 ) Verilen karakter buyuk harf ise ekrana "buyuk harf" yazdıran kodu oluşturunuz


        char ch = 'S';

        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("Buyuk Harf");
        }// if body

        // example 2 )Verilen bir sayı çift sayı ise ekrana çift sayı yazdıran kodu oluşturunuz

        byte number = 20;

        if (number % 2 == 0) {
            System.out.println("çift sayı");

        }

        //Example 3) Verilen bir sayı 300 den kucuk veya 1200 den buyuk ise ekrana  "Harika Sayi" yazdiran
        // kodu oluşturunuz

        int num1 = 222;
        if (300 > num1 || num1 > 1200) {

            System.out.println("Harika Sayi");
        }

        // Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayı giriniz");

        int n = input.nextInt();

// iki kontrol yapıldı
        if (n % 2 == 1) {
            System.out.println("tek sayı");
        }

        if (n % 2 == 0) {
            System.out.println("cift sayı");
        }

        //2.yol

        if (n % 2 == 0) {
            System.out.println("cift");

        } else {// diğer tum ihtimaler
            //burada conditional yok tek kontrol var
            //java ya az iş yaptırdık
            System.out.println("tek");
        }

        //Ex 5) Verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yaziniz

        Scanner inputtt=new Scanner(System.in);
        System.out.println("sayı gir");



        int numara = inputtt.nextInt();

        if (numara < 0) {
            System.out.println("negatif sayi");
        } else if (numara == 0) {
            System.out.println("notr sayı");

        } else {
            System.out.println("pozitif sayi");


        }//main mody


    }//class body
}
