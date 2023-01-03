package day13whileloopdownwhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

      /*
      Kullanıcıdan bir tamsayı alınız
      Tamsayı 100 den kucuk ise kullanıcıya "Kaybettiniz !"mesajı vererek oyunu sonlandırınız
      Tamsayı 100 ve 100 den buyuk ise "Kazandınız!" mesajı vererek oyunu devam etttriniz
       */

        Scanner input=new Scanner(System.in);


        int num=0;
        do {
            System.out.println("Bir sayı giriniz..");
             num=input.nextInt();
            if (num>=100){
                System.out.println("Kazandınız!!");
            }


        }while (num>=100);

        System.out.println("Kaybettiniz");











    }
}
