package day08_NestedIf;

import java.util.Scanner;

public class C01_NestedIf {


    /*
    TASK : Kulanıcıdan 3 tane pozitif tam sayı alınız
    bu 3 sayının üçgen oluşturma durumunu kontrol ediniz
    Eğer üçgen ise eşkenar üçgen olma durumunu kontrol ediniz


    INFO:
    UCGEN OLMA SARTI
    Herhangi iki kenar toplamı ucuncu kenardan buyuk olmalı
    herhangi iki kenar farkı ucuncudenkucuk olmalı

    a+b>c>a-b
    a+c>b>a-c
    b+c>a>b-c
    a=b=c ise eskenar ucge

Java nested kodları çalıştırırken çok zaman harcıyor
buna "time complexity " deniyor
mumkunse nested kod yazılmamalı

     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {// Ucgen olma Durumu buyuk if

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else {
                System.out.println("Ucgen ama Eskenar ucgen degildir.");
            }

        } else {//Ucgen Olmama durumu
            System.out.println("Ucgen Degildir");
        }

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunuu giriniz");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();


        if (x + y > z && x - y < z && x+ z > y && x - z < y && y + z > x && y - z < x) {


            if (x == z && y == z) {
                System.out.println("Eskenar ucgen");
            } else if (x == z || y == z || x == y) {
                System.out.println("ıkızkenar ucgen");


            } else if (x != y && y != z) {
                System.out.println("cesitkenar");
            }
            else {
                System.out.println("ucgen değildir");
            }

        }
    }
}
