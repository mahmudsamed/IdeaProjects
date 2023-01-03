package mentoring;

import java.util.Scanner;

public class c02 {
    public static void main(String[] args) {

        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir adınızı ve soyadnızı giriniz");

        String name = input.nextLine();

        System.out.println("Lutfen cc kod gırınız");

        long cc=input.nextLong();


    }
}
