package day07ifstatement;

import java.util.Scanner;

public class C02_ifstatement {

    // kullanıcı gun numarasını girsin kod gun ismini yazsın
//1==> Pazar  2==> Pazartesi   5==> Perşembe
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Lutfen gun nuamrasını giriniz....\n 1:Pazar 2:Pazartesi 3:salı 4:çarşamba 5:perşembe 6:cuma 7:cumartesi ");

        Integer dayNo = input.nextInt();

        if (dayNo == 1) {
            System.out.println("Pazar");

        }
        else if (dayNo == 2) {
            System.out.println("Pazartesi");


        }
       else if (dayNo == 3) {
            System.out.println("salı");
        }
       else if (dayNo == 4) {
            System.out.println("çarşamba");
        }
        else if (dayNo == 5) {
            System.out.println("perşembe");


        }else if (dayNo == 6) {
            System.out.println("cuma");


        }else if (dayNo == 7) {
            System.out.println("Pcumartesi");


        }
        else  {
            System.out.println("Lutfen gun nuamrasını tekrar giriniz....\n 1:Pazar 2:Pazartesi 3:salı 4:çarşamba 5:perşembe 6:cuma 7:cumartesi");


        }
    }
}