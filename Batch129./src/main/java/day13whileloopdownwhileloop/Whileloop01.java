package day13whileloopdownwhileloop;

import java.util.Scanner;

public class Whileloop01 {

    public static void main(String[] args) {
//  Example 1 : Kulanıcıdan verdiği sayı için çarpım tablosu oluşturun

        Scanner input=new Scanner(System.in);
        System.out.println("Carpım tablosunu görmek için bi sayı giriniz");
        int num=input.nextInt();

        int i =1;
        while (i<11){
            System.out.println(num+ "x"+ i+"="+(num*i));
        i++;
        }


        // verilen bir stringde her harfin sonrasına * sembolu ekleiniz

        String str="Java";
        String newWord="";
        int k =0;
        while (k<str.length()){

            newWord=newWord + str.charAt(k) + "*";

            k++;
        }

        System.out.println(newWord);


        System.out.println("********");

        int a=684;
        int toplam=0;


        for (int j = a; j >0 ; j/=10) {
            toplam=toplam+j%10;


        }
        System.out.println(toplam);















    }

}
