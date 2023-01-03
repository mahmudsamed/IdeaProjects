package day07ifstatement;

import java.util.Scanner;

public class C03_ifstatement {

    public static void main(String[] args) {

        /*
        Iki tane String datanin birbirine esit olup olmadigini anlamak icin "==" degil ; equals() kullaniriz
        i)equals() == > Buyuk kucuk harf onemser.
        ii)equalsIgnoreCase() ==> Buyuk kucuk harf onemsemez
         */

        //Kullanicidan gun isimlerini aliniz haftaici mi
        // hafta sonu mu oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");

        } else {
            System.out.println("Gecerli bir gun ismi giriniz");

        }//else body
        // 2. YOL:

        boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaici) {
            System.out.println("Hafta ici");
        } else if (haftasonu) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }//main
}//class

