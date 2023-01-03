package day03scanner;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner kulanıcı ile etkileşim kurmamızı sağlar


    //Scanner bir Class dır Java util kutuphanesinden getirildigi icin import ister

    public static void main(String[] args) {

        //kulanıcıdan data almak icin
        //1.adım Scanner classındanobject olusturun

        Scanner input = new Scanner(System.in);

        //Scanner input = new Scanner(System.in);
        //2.ADIM kulaniciya ne yapacagini  soyle


        //3.adım kullanicidan aldginiz datayi variable icine koyun



        //kullniciya ad,memlket,yas,boy,
        //yasadigi yeri sevip sevmedigni soran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi griniz");
        String isim = scan.nextLine(); // kulanıcıdan strting deger istedik tum satiri alması icin next line sectik
        System.out.println("lutfen memleketinizi giriniz");
        String memleket = scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int yas =scan.nextInt();
        System.out.println("lutfen boyunuzu giriniz");
        short boy=scan.nextShort();
        System.out.println("yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu = scan.hasNextBoolean();

        System.out.println("**********************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);








    }

}
