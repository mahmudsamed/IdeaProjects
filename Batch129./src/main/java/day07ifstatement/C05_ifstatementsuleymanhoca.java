package day07ifstatement;

import java.util.Scanner;

public class C05_ifstatementsuleymanhoca {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz");
        String moon = input.next();

        if (moon.equalsIgnoreCase("ocak")) {
            System.out.println("1");
        } else if (moon.equalsIgnoreCase("şubat")) {
            System.out.println("2");


        }else if (moon.equalsIgnoreCase("mart")) {
            System.out.println("3");


        }else if (moon.equalsIgnoreCase("nisan")) {
            System.out.println("4");


        }else if (moon.equalsIgnoreCase("mayıs")) {
            System.out.println("5");


        }else if (moon.equalsIgnoreCase("haziran")) {
            System.out.println("6");


        }else if (moon.equalsIgnoreCase("temmuz")) {
            System.out.println("7");


        }else if (moon.equalsIgnoreCase("ağustos")) {
            System.out.println("8");


        }else if (moon.equalsIgnoreCase("eylül")) {
            System.out.println("9");


        }else if (moon.equalsIgnoreCase("ekim")) {
            System.out.println("10");


        }else if (moon.equalsIgnoreCase("kasım")) {
            System.out.println("11");


        }else if (moon.equalsIgnoreCase("aralık")) {
            System.out.println("12");


        }
        else   {
            System.out.println("Lutfen gecerli ay ismi giriniz");


        }
       /* Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
        Niye ?
                Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
                ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
        adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

        "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
        bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
        ihtiyac duydugumuz seydir.
*/

    }






}
