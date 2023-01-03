package demopractice;

import java.util.Arrays;

public class arraydemo {
    public static void main(String[] args) {
        //Exapmle 1: String array oluşturun içine 9 tane eleman ekleyin
        //ilk eleman ile son elemanın içerdiği karakter sayıları toplamı ekrana yazdırın

        String arr[] = new String[7];
        arr[0] = "gs";
        arr[1] = "fb";
        arr[2] = "bjk";
        arr[3] = "ts";
        arr[4] = "ads";
        arr[5] = "ks";
        arr[6] = "rm";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Exapmle 2: String array oluşturun içine 5 tane eleman ekleyin
        //tum elemanların içerdiği karakter sayıları toplamı ekrana yazdırın


        String arrx[] = new String[5];

        arrx[0] = "gs";
        arrx[1] = "fb";
        arrx[2] = "bjk";
        arrx[3] = "ts";
        arrx[4] = "ads";


        int total = 0;
        for (int i = 0; i < arrx.length; i++) {

            total = total + arrx[i].length();

        }

        System.out.println("total = " + total);


        String mr[] = new String[3];
        int toplam = 0;
        mr[0] = "18";
        mr[1] = "24";
        mr[2] = "30";

        for (int i = mr.length - 1; i >= 0; i--) {
            toplam = toplam + mr[i].length();

        }
        System.out.println(toplam);


        int toplamm = 0;

        for (String w : mr) {
            toplamm = toplamm + w.length();
        }

        System.out.println("toplamm = " + toplamm);


        String[] demo = new String[4];
        int sum1 = 0;
        demo[0] = "a";
        demo[1] = "b";
        demo[2] = "c";
        demo[3] = "d";


        for (String w : demo) {
            sum1 = sum1 + w.length();
        }
        System.out.println("sum1 = " + sum1);


///Example 2:Integer array oluşturunuz içine 6 tane eleman yerleştiriniz
// bu elemanların en kucugu ile en buyugunun toplamını ekrana yazdrınız

        Integer[] num = new Integer[6];


        num[0] = 12;
        num[1] = 11;
        num[2] = 9;
        num[3] = 118;
        num[4] = 142;
        num[5] = 152;

        int newnum = 0;
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        System.out.println(num[0] + num[num.length - 1]);


        int minimum = num[0];
        int maximum = num[0];

        for (int w : num) {

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);

        System.out.println((maximum + minimum));









    }
}
