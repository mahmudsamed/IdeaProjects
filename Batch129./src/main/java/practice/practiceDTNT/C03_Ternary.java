package src.main.java.practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {


    public static void main(String[] args) {

        /*
        Kulanıcıdan pozitif bir tamsayı girmesini isteyin
        Girilen pozitif tam sayı 3 basamaklı ise ekrana 3 basamaklı yazdırın
        3 basmaklı değilse çift olup olmadıgını kontrol edin
        Çift ise 3 basamaklı olmayan çift sayı yazdırın
        Çift değilse 3 basamaklı olmayan tek sayı yazdırın


         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tam sayı giriniz");
        int num=input.nextInt();

        if (num>0){


            boolean sıfırdanBuyukBas=num>99 && num<1000;
            boolean sıfırdanbyukucbasolmayanciftsayı=! (num>99 && num<1000) && num %2==0;

            if (sıfırdanBuyukBas){
                System.out.println("3 basamaklı sayı");
            } else if (sıfırdanbyukucbasolmayanciftsayı){

                System.out.println("sıfırdanbyukucbasolmayanciftsayı");

            }else System.out.println("3 basmaklı olmayan pozitif tek sayı");




        }else //negatif sayılar
        {
            System.out.println("Negatif sayı girdiniz !! ");
        }
//Ternary ile çözümü


        boolean sıfırdanBuyuk3BasTernary=num>99 && num<1000;
        boolean sıfırdanbyukucbasolmayanciftsayıTernary=! (num>99 && num<1000) && num %2==0;


        String sonuc=num>0 ? sıfırdanBuyuk3BasTernary ? ("3 basamaklı sayı"):sıfırdanbyukucbasolmayanciftsayıTernary ? ("3 basamaklı olmayan cift sayi") :("3 basamaklı olmayan tek sayi") : ("Lutfen pozitif bir tam sayı giriniz");


        System.out.println(sonuc);  }

    }










