package day03scanner;

import java.util.Scanner;

public class Suleymanhocascanner {
    // kullanıcıdan data alıp kulanıcaz
    //objenin ismini input yaptım cunku bu obje kullanıcıdan alınan datayı benim kodlarımı ıcıne koyacak
    //systemin içine koy demek




   public static void main(String[] args) {
   //1.adım scaner Class dan objectolustur
      Scanner input = new Scanner(System.in);

      //2.adım kullanıcıya ne istedigine dair mesaj veriniz
      System.out.println("Lutfen yasinizi griniz..");
      //3.adım uygun methodu kulanarak kullanıcın verdigi dtayau memorye yerlestriniz

      byte age =input.nextByte();
      System.out.println(age);
   }

}
