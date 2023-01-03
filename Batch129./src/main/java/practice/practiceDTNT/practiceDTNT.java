package src.main.java.practice.practiceDTNT;

import java.util.Scanner;

public class practiceDTNT {

    public static void main(String[] args) {


        /*
Kullanicidan bir gun alin
- Eger gun cuma ise "Muslumanlar icin kutsal gun"
- Eger gun cumartesi ise "Yahudiler icin kutsal gun"
- Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
Yazdiran kodu yaziniz
 */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun =input.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");



        }else if (gun.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else {
            System.out.println("Kutsal gun değil");
        }


    }



}
