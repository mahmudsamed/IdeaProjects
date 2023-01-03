package day03scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //kulanicidan sayilari alarak toplama islemş yaptiran kodu giriniz

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen ilk sayıyıy giriniz");
        double number1 = input.nextDouble();
        System.out.println("lutfen toplanacak ikinci sayiyi giriniz");

        double number2 = input.nextDouble();

        System.out.println("Toplam"+(number1+ number2));


    }
}
