package mentoring;

import java.util.Scanner;

public class c01 {
    //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir double sayı giriniz");
        double num=input.nextDouble();
        int num1=(int)num;


        System.out.println(num1);


       /* Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

                INPUT:

        Dakika sayısı: 3456789

        OUTPUT :

        3456789 dakika yaklaşık 6 yıl 210 gündür *\




        */

        System.out.println("Lutfen dakika giriniz");
        int min=input.nextInt();
        int year=min/525600;
        System.out.println("year = " + year);
        int day=min%525600;
        System.out.println("day = " + day);

        System.out.println(year + " year " + day +" day");


     /*   Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

                IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


        BMI 18,5'in altındaysa zayıfsınız

        BMI 18,5 ile 25 arasında ise kilonuz idealdir

        BMI 25-30 arasındaysa şişmansınız

        BMI 30'dan büyük veya eşitse, obez


        Input:

        Output:

        Agirlik : 71

        Boy : 1,72

        BMI : 23.99945916711736

        Zayifsiniz.

      */



        System.out.println("Lutfen bir boyunuzu giriniz");
        double height=input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        int kg=input.nextInt();

        double bmi=kg/(height*height);

        System.out.println("bmi = " + bmi);

        if (bmi<18.5){
            System.out.println("Zayıfsın");
        } else if (18.5<bmi && bmi<25.0) {
            System.out.println("ideal");

        } else if (bmi>25 && bmi<30) {
            System.out.println("şişman");
        }
        else
            System.out.println("obez");


    }
}
