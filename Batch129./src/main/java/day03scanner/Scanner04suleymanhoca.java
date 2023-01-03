package day03scanner;

import java.util.Scanner;

public class Scanner04suleymanhoca {
    public static void main(String[] args) {
        //kulanıcıdan dört işlem yapan ve işlemlerin sonucu ekrana yazdıran kodu yazınız

        Scanner input=new Scanner(System.in);

        System.out.println("iki sayı giriniz");
        double firstNum=input.nextDouble();
        double secondNum=input.nextDouble();

        System.out.println(secondNum  + firstNum);
        System.out.println(secondNum  - firstNum);
        System.out.println(secondNum  * firstNum);
        System.out.println(secondNum  / firstNum);


    }
}
