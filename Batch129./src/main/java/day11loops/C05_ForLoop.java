package day11loops;

import java.util.Scanner;

public class C05_ForLoop {


    public static void main(String[] args) {



        // 5 den 10 a kadar tam sayıların toplamını bulan kodu yazınız

        int sum=0;
        for (int i = 5; i <11 ; i++) {

            sum=sum+i;
        }
        System.out.println("5 den 10 a kadar sum :"+sum);


        // 6 dan 3 e kadar olan sayıların çarğımı

        int toplamcrp=1;
        for (int i = 6; i >2 ; i--) {

            toplamcrp*=i;

        }
        System.out.println("toplamcrp = " + toplamcrp);


        //bir tamsayını rakamlarının toplamını yazan kodu oluştrunuz
           //2543
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yamsayı giriniz");
      int number=input.nextInt();
      number=Math.abs(number);

      int result= 0;

        for (int i = number; i >0 ; i=i/10) {

            result=result+i%10;

        }
        System.out.println("result = " + result);






    }
}
