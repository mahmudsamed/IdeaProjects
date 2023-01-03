package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //kulanıcıdan bir dikdörtgenin en ve boyunu alan ve hesaplayan kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("dikdortgenin kisa kenarini giriniz");
        int en=input.nextInt();
        System.out.println("dikortgenin uzun kenarını giriniz");

        int boy = input.nextInt();

        System.out.println("Alan ==>"+(en*boy));

        System.out.println("Cevre ==>"+(2*(en+boy)));

        System.out.println("Alan+Cevre ==>"+(("Alan")+("Cevre")));

    }
}
