package advancepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {

        //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.


        Scanner input = new Scanner(System.in);


        List<Integer> list = new ArrayList<>();


        while (true){
            System.out.println("Ekleme tapmak için: 'add'\n"+
                    "Güncellemek için: 'set'\n"+
                    "Silmek için: 'remove'\n"+
                    "Çıkmak için: 'break' komutunu giriniz."
            );
            String komut = input.next();




            if (komut.equalsIgnoreCase("add")){

                System.out.println("Eklemek istedginiz tamsayıyı giriniz");
                list.add(input.nextInt());

            } else if (komut.equalsIgnoreCase("set")) {

                System.out.println("Guncellemek istediginiz sayının indeksini giriniz");
                int guncellenecekindeks=input.nextInt();
                System.out.println("Yerine eklemek istediginiz sayıyı giriniz");
                int yenisayı =input.nextInt();
                list.set(guncellenecekindeks,yenisayı);


            } else if (komut.equalsIgnoreCase("remove")) {

                System.out.println("Sılmek ıstediginiz sayıyı giriniz");

                Integer silineceksayı=input.nextInt();
                list.remove(silineceksayı);

            } else if (komut.equalsIgnoreCase("break")) {

                break;
            }else {
                System.out.println("Gecerli bir komut giriniz");
            }

            System.out.println(list);

        }


        System.out.println("gule gule");


    }
}
