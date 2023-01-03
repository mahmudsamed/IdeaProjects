package day03scanner;

import java.util.Scanner;

public class C07_Scanner {



    public static void main(String[] args) {

        /*
  TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
  salona devam edeceği ay süresi
  bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
*/
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen isminizi griniz");

        String isim = input.nextLine();

        System.out.println("lutfen yasınızı giriniz");
        int yas = input.nextInt();
        System.out.println("lutfen kilonuzu giriniz");
        int kg = input.nextInt();
        System.out.println("lutfen boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("lutfen surenizi seciniz");
        int sure = input.nextInt();
        System.out.println("isim;"+isim+" "+"yas;" +yas+ " "+"kg;"+ kg+"  " +"boy;"+boy);
        System.out.println("toplamUcret:"+ 20*sure+"$");


    }



}
