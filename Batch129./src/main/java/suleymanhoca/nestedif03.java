package suleymanhoca;

import java.util.Scanner;

public class nestedif03 {

   /* Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
    Passwordun ilk harfi kucuk harf ise
      'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin

    */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen passwordu giriniz.....");

        String pwd=input.nextLine();

        char firstChar=pwd.charAt(0);


        if (firstChar>='A' && firstChar<='Z'){
            if (firstChar=='A'){
                System.out.println("gecerli password");
            }  else {
                System.out.println("gecersiz password cunku buyuk harf ama 'A' değil......");
            }

        } else if (firstChar>='a' && firstChar<='z') {
            if (firstChar=='z'){
                System.out.println("gecerli password");
            }
            else {
                System.out.println("gecersiz password cunku kucuk harf ama 'z' değil...... ");
            }


        }else {
            System.out.println("İlk chracter harf olmalı");
        }


    }




}
