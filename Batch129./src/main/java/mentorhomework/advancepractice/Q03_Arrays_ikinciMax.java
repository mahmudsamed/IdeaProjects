package mentorhomework.advancepractice;

import java.util.Arrays;

public class Q03_Arrays_ikinciMax {
    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
       */

    public static void main(String[] args) {

        int[] arr = { 100, 10, -90, 845, -8787, 898, 0, 1234567};

       //1.yol

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("min:"+arr[0]+" max: "+arr[arr.length-1]+" secMax: "+arr[arr.length-2]);

        //2.yol { 100, 10001, -90, 845, 8787, 898, 0, 1};


        int min=arr[0];
        int max=arr[0];
        int secMAx=arr[0];
        for (int w: arr) {
            if (w<min){
                min=w;
            } else if (w>max) {
                secMAx=max;
                max=w;
            }else if (w>secMAx){
                secMAx=w;
            }
        }

        System.out.println("min :"+min+"max:"+max+"secMax:"+secMAx);

    }
}
