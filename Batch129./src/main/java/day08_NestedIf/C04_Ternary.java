package day08_NestedIf;

import java.util.Scanner;

public class C04_Ternary {

    //Kulanıcıdan iki sayı alınız buyuk olmayan sayıyıy yazdırınız

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen iki sayı giriniz");
         int sayi1=input.nextInt();
         int sayi2=input.nextInt();

         if (sayi1<sayi2){
             System.out.println("Buyuk olmayan Sayı :  "+ sayi1);
         }else if(sayi1>sayi2){
             System.out.println("Buyuk olmayan sayı :  "+sayi2);
         }else {
             System.out.println("Sayılar birbirne eşit");
         }



         //2.yol

        System.out.println(sayi1==sayi2 ?"Sayılar eşit " : sayi1>sayi2 ?  sayi2  :sayi1);






    }





}
