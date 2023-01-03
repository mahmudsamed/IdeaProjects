package day09incrementdecrementternaryswitch.suleymanhoca;

import java.util.Scanner;

public class nested01 {

     /*
          Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise "eskenar"
                     Ucgen olma durumunu
                     kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>a-b
                     a+c>b>a-c
                     b+c>a>b-c
                     a=b=c ise eskenar ucgen


          Note: Java "Nested If"leri çalıştırırken cok zaman ihityac duyar(time consumıng)
          Bu yuzden bizz mumkun oldugu nested if kullanmamaya calışırız.

         */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin kenarları icin 3 tane uzunluk giriniz....." );

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        boolean ucgenmi=(a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Ucgenin kenarları negatif olamaz....");
        }


        else if (ucgenmi){

            if (a==b && b==c && a==c){
                System.out.println("Ucgen hem de eskenar ucgen...");
            }else {
                System.out.println("Ucgen ama eskenardegil");
            }
        }else {
            System.out.println("Sen ucgen değilsin");
        }






    }





}
