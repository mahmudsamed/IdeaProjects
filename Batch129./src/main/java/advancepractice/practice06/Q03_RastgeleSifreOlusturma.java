package advancepractice.practice06;

import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {

    //Kullanicidan alidginiz sayi kadar karakter uzunluguna sahip rastgele sifre ureten bir kod yaziniz
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz");
        int karakterSayisi= input.nextInt();
        int sayac=0;
        String sifre="";


        String karakterler="ABCDEFGHIJKLMNOPRSTUWYZabcdefghijklmnoprstuwyz0123456789";
      int maxIndex=  karakterler.length();

        while (sayac<karakterSayisi){

            int rastgeleIndex=(int) ( Math.random()*maxIndex);

          sifre+=  karakterler.charAt(rastgeleIndex);


            sayac++;
        }


        System.out.println("sifre = " + sifre);
    }
}
