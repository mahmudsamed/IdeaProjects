package day07ifstatement;

import java.util.Scanner;

public class C04_ifstatement {


    /* kullanıcıdan yas degerini alan ve yasin hangi evrede oldugunu asagıdaki
    tabloya göre yazdıran kodu oluşturunuz

    0-4==>bebek
    5-12==>cocuk
    13-20==>genc
    21-30==>yetiskin
    tanımlanmamış  evre

    hata mesajı olarak "gecerli bir yas giriniz" yazdırınız


     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");



        int age = input.nextInt();

        if (age<0){
            System.out.println("Gecerli bi sayi giriniz");
        } else if (age<5) {
            System.out.println("Bebek");

        } else if (age<13) {
            System.out.println("Cocuk");

        }else if (age<21) {
            System.out.println("Genc");

        }else if (age<31) {
            System.out.println("Yetiskin");

        }else {
            System.out.println("Tanımlanmamış evre");
        }
    }
}
