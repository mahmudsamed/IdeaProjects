package day08_NestedIf;

import java.util.Scanner;

public class C05_Ternary {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir sayı giriniz");

        int num= input.nextInt();

        System.out.println( num<=0  ? num*-1:num );

////Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse Negatif yazdirin

        System.out.println("Lutfen bir sayı giriniz");
        Scanner inputt=new Scanner(System.in);

        int num1=input.nextInt();

       String sonuc=num1>0 ? "sayı pozitif" : "sayı negatif";

        System.out.println(sonuc);























    }


}
