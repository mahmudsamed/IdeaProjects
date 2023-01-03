package day08_NestedIf;

import java.util.Scanner;

public class C03_NestedIf {

    /*
    Kullanıcıdan 0 dan kucuk 120 den buyuk deger giremeyecek sekilde dataları aldıktan sonra
    eger calısan kadın ise 60 yasından buyuk ise emekli olabilir yazdırın
    calısan erkek ise 65 yasından buyukse emekli olabilir yazdırın

     */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \n Kadın için K harfi giriniz \n Erkek için E harfi giriniz");

        char cinsiyet=input.next().toUpperCase().charAt(0);//kullanıcın verdiği buyuk harfi kucuk harfe cevirdim

        System.out.println("Lutfen yasınızı giriniz");

        int yas=input.nextInt();

        if (cinsiyet=='K'){//outer if
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas>60 ){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsın" + "K"+ (60-yas) +"daha yıl calısma gerekir" );
            }

        } else if (cinsiyet=='E') {

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas>65 ){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("  emekli olamazsın  "  +   (  65-yas   )    +   "  daha yıl calısma gerekir" );
            }



        }else {
            System.out.println("Lutfen cinsiyet için geçerli bir harf giriniz");
        }


    }



}
