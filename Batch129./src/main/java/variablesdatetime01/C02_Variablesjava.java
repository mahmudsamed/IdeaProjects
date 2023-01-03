package variablesdatetime01;

import java.util.Scanner;

public class C02_Variablesjava {
/*
TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
 salona devam edeceği ay süresi
 bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.


 */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("TechProEd Spor Salonuna hosgeldiniz");


        System.out.println("Lutfen isim soyisim giriniz");

        String isim=input.nextLine();//tum cumleyi alır


        System.out.println("Lutfen yasınızı giriniz");
        int yas = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");
        double kg=input.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy=input.nextDouble();

        int aylikucret=20;

        System.out.println("aylikucret = " + aylikucret);


        System.out.println("Lutfen devam edeceğiniz süreyi giriniz");
        int sure=input.nextInt();



       int toplamTutar=aylikucret*sure;

        System.out.println("\nisminiz : "+ isim+"\t"+"Yasınız :"+yas+"\t"+"Kilo"+kg+"\t"+"Boyunuz :"+boy+"\t"
        +"Odemeniz gereken toplam tutar :"+toplamTutar+"$");


    }
}
