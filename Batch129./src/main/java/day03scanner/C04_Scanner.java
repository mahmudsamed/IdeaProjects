package day03scanner;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {


        // example lulanicidan alacaginiz 5 basmakali bir sayinin ilk 2 ve son iki basamagındaki rakamlari toplamını yazdiran kodu yaziniz


        Scanner input = new Scanner(System.in);

        System.out.println("bes basamakli sayiyi griiniz");

        int number = input.nextInt(); //12345 number

        int ilkIkiRkm = number / 1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);

        int ilkIkiTop = (ilkIkiRkm % 10) + (ilkIkiRkm / 10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);



        int sonIkiRkm = number % 100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);
        int sonIkiRkmTop = (sonIkiRkm %10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmTop = " + sonIkiRkmTop);

        int toplam = ilkIkiTop + sonIkiRkmTop;

        System.out.println("toplam = " + toplam);

    }


}
