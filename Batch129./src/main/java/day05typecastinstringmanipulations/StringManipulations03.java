package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {


        /*
         Ex:Asagıdakı kuralara gore kulanıcının girdiği passwordu kontrol ediniz
         1)en az 8 karakter olsun
         2)space passwordd de olmasın
         3) en az bir tane buyuk harf olsun
         4) en az bir tane kucuk harf olsun
         5)en az bir tane symbol olsun
         6)en az bir tane rakam olsun


         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd=input.nextLine();

        //1) en az 8 karakter olsun

        boolean first=pwd.length()>7;
        System.out.println(first);

        //2)space passwordd de olmasın
        // ! başa koyarsak space olmasın der
         boolean second=!pwd.contains(" ");
        System.out.println(second);



//3) en az bir tane buyuk harf olsun
        // buyuk harf olmayanları sil
        // kalan character sayısına bak
        //charachter sıfır ise buyuk harf yok demektir
        //sıfırdan buyuk ise buyuk harf vardır
        // methodları aynı satırda yanyana kulanmaya method chain denir


       Boolean third= pwd.replaceAll("[^A-Z]","").length()>0;

        System.out.println(third);

        //4) en az bir tane kucuk harf olsun

       boolean fourth= pwd.replaceAll("[^a-z]","").length()>0;

        System.out.println(fourth);
        //5)en az bir tane symbol olsun

     boolean fifth= pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);


       // 6)en az bir tane rakam olsun


        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(sixth);

        System.out.println("Password geçerli mi  "  +   (first&&second&&third&&fourth&&fifth));





    }
}
