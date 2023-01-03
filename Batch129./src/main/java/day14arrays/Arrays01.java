package day14arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        //Exapmle 1: String array oluşturun içine 5 tane eleman ekleyin
        //ilk eleman ile son elemanın içerdiği karakter sayıları toplamı ekrana yazdırın

        String arr[]=new String[5];


        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());

        //Exapmle 2: String array oluşturun içine 5 tane eleman ekleyin
        //tum elemanların içerdiği karakter sayıları toplamı ekrana yazdırın

        String brr[]=new String[5];


        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Atina";

        //1.yol for loop
        int totalChar=0;

        for (int i = 0; i <brr.length ; i++) {
            totalChar=totalChar + brr[i].length();
        }

        System.out.println("totalChar = " + totalChar);


//2.yol:for each loop(enhanced)==> baslangıc degeri loopun çalışma şartı ve increment decrement kısını kendisi haleder
        //for each loop Array lerde colectionlarda kulanılır
        // ındex kullanmanız gerektiğinde bazen for each loop çaresiz kalır mecburen diğer loopları kullanırız

        int sum=0;

        for (String w : brr){
            sum=sum + w.length();
        }

        System.out.println("sum = " + sum);









































    }
}
