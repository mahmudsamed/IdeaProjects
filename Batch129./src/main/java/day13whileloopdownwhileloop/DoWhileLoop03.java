package day13whileloopdownwhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
   /*
   Username ="admin" ve Password="pwd123"dur
   "Kulanıcıdan username ve passsword doğru ise "Hesabınıza hosgeldiniz"
    username ve passsword yanlış ise "3 kere username ve passwordunuz giriniz"
    username ve passswor 4. kere yanlış girilirse "Hesabınız bloke olmuştur mesajı vererek işlemi tamamlayınız

    */
        Scanner input=new Scanner(System.in);


        int counter=0;

        do {
            if (counter==4){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }
            System.out.println("Lutfen username giriniz");
            String username=input.next();
            System.out.println("Lutfen password giriniz");
            String password=input.next();

            if (username.equals("admin")&& password.equals("pwd123")){
                System.out.println("Hesabınıza hosgeldniz");
                break;
            }

            counter++;


        }while (true);


    }
}
