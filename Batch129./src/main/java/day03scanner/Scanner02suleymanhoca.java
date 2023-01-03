package day03scanner;

import java.util.Scanner;

public class Scanner02suleymanhoca {
    public static void main(String[] args) {

        // kulanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız
        Scanner input= new Scanner(System.in);
        System.out.println("ilk isminizi giriniz....");
        //next method kulanıcıdan tek kelimeli string almak için kulanılır
        String firstName =input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName=input.next();

        System.out.println(firstName +"\t"+lastName);

    }
}
