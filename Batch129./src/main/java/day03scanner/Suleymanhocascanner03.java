package day03scanner;

import java.util.Scanner;

public class Suleymanhocascanner03 {


    public static void main(String[] args) {
        //kulanıcıdan adresini alınız ve ekrana yazdırıız
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adresini giriniz");

        //nextline() methodu kulanıcıdan çok kelimeli string almak için kulanılır
        String address=input.nextLine();


        System.out.println(address);


    }
}
