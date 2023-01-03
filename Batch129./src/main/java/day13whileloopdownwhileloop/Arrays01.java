package day13whileloopdownwhileloop;

import java.sql.Array;
import java.util.Arrays;

public class Arrays01 {


    public static void main(String[] args) {

        int a =12;// bu yapının içinde saedece bir tane data depolanabilir
        //Ama biz code yazarken bir yapının içinde çoklu data depolama ihtiayacı hissederiz
        //bir yapının içinde çoklu data depolayabilme için Java "Array" yapısını oluşturmuştur



        //Array nasıl oluşturulur
        //Array oluşturmak için Array elemanlarının data type i ve eleman sayısı mutlaka yazılmalıdır
        String stdNames[]=new String[5];
//Array console a nasıl yazdırılır
        //toString() methodunu kullanmadan sadece array ismi ile yazdırırsanız java aArrayın adresini yazdırır
        System.out.println(Arrays.toString(stdNames));
//Arraye eleman ekleme nasıl yapılır?
        stdNames[2]="Ajda";
        stdNames[0]="Cuneyt";
        stdNames[1]="Kemal";
        stdNames[3]="Ezel";
        stdNames[4]="Beşir";
        System.out.println(Arrays.toString(stdNames));

        //Arrrayden specific bir elemanı almak

        System.out.println(stdNames[2]);

//EXAMPLE 1:Arrray deki her elemanı sonuna ! işareti koyarak ekrana yazdırınız

        for (int i = 0; i <stdNames.length ; i++) {
            System.out.print(stdNames[i]+"!");
        }





    }
}
