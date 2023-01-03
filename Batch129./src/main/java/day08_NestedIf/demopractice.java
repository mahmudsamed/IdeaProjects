package day08_NestedIf;

import java.util.Scanner;

public class demopractice {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse sayinin karesini yazdirin


        System.out.println("Lutfen bir sayı giriniz");


        Scanner input=new Scanner(System.in);
        int num2=input.nextInt();

        if (num2>0){
            System.out.println("pozitif sayının karesi  " + (num2*num2)       );
        } else if (num2<0) {
            System.out.println("negatif sayının karesi " + (num2*num2)  );

        }else {
            System.out.println("notr sayı");
        }


    }
}
