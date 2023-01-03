package mentorhomework.advancepractice;

import java.util.Scanner;

public class Q01_WhileLoop_10KatinaKadar {
    //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
    //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı integer giriniz");
        int num = input.nextInt();

        while (num % 10 != 0) {


            if (num % 10 == 0) {
                System.out.println("10 nun katı olan bir sayı");
            }
            System.out.print("num = " + num + " " + " ,");

            num++;
        }


    }
}
