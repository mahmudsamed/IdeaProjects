package advancepractice;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int rastgelesayı=(int)(Math.random()*101);

        int sayı;

        int sayac=10;
        System.out.println("0-100 arası bir tamsayı giriniz.");

        do {



            sayac--;
          sayı=input.nextInt();
            if (sayı<rastgelesayı){
                System.out.println(sayac + " hakkınız kaldı");
                System.out.println("Daha buyuk bir sayı giriniz");
            } else if (sayı>rastgelesayı) {
                System.out.println(sayac + " hakkınız kaldı");

                System.out.println("Daha kucuk bir sayı giriniz");
            } else if (sayı==rastgelesayı) {
                System.out.println("Tebrikler!!!"+ (10-sayac)+"tahminde buldunuz");
                System.out.println("Puanınız: "+ (sayac+1)*10);
            }

            if (sayac==0){
                System.out.println("Hakkınız bitti");

                break;
                //ödev yeniden oynama hakkı
            }
        }while (sayı!=rastgelesayı);



    }
}
