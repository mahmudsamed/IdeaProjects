package day05typecastinstringmanipulations;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen Kullanıcı Adınızı giriniz");
        String dname =input.nextLine();

        boolean first=dname.length()>7;
        System.out.println(first);

        boolean second= !dname.contains(" ");
        System.out.println(second);

        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());


    }
}
