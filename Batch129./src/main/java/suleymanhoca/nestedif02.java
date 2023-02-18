package suleymanhoca;

import java.util.Scanner;

public class nestedif02 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen ucgenin uzunluklarını giriniz.....");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        boolean ucgenmi=(a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));


        if (a<=0 || b<=0 || c<=0){
            System.out.println("Negatif kenar uzunlugu olamaz.....");
        }



       else if (ucgenmi){

            if (a==b && b==c && a==c){
                System.out.println("Eskenar");
            }else if (a==b ||b==c||a==c){
                System.out.println("ikizkenar");
            }else {
                System.out.println("cesitkenar");
            }

        }else {
            System.out.println("Ucgen değil......");
        }






    }









}
