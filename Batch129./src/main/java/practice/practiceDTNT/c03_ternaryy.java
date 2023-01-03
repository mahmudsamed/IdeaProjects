package practice.practiceDTNT;

import java.util.Scanner;

public class c03_ternaryy {

/*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir caharacter griniz");

        char ch=input.next().charAt(0);


        System.out.println("**********ternary **********");

        boolean harfMi=(ch<='z' && ch>='a') ||(ch<'Z'&& ch>'A');

        boolean kucukHarf=(ch<='z'&&ch>='a');


        String result=(harfMi) ?  kucukHarf ? "Kucuk Harf" :"Buyuk harf"       :"Harf değil";

        System.out.println(result);






    }


}
