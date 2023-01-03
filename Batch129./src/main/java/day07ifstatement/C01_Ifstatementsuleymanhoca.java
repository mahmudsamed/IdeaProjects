package day07ifstatement;

import java.util.Scanner;

public class C01_Ifstatementsuleymanhoca {


    public static void main(String[] args) {

//Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        Scanner inputt = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");

        char ch = inputt.next().charAt(0);
//1.YOL
  //   if (ch >= 'A' && ch <= 'Z') {
    //    }


    //    if (ch >= 'a' && ch <= 'z') {
   //         System.out.println("Kucuk Harf.....");
   //     }

        //2.YOL
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf...");

        } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("Kucuk Harf.....");
            }else {
            System.out.println("Lutfen harf giriniz....");

        }



        }
    }

