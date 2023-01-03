package day14arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 2:Integer array oluşturunuz içine 6 tane eleman yerleştiriniz
        //bu elemanların en kucugu ile en buyugunun toplamını ekrana yazdrınız

        int ages[]=new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));
        //sort methodu arraydeki elemanları kucukten buyuge dizer
        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));


        System.out.println(ages[0]+ages[ages.length-1]);


        //2.yol:

        int minimum =ages[0];

        int maximum=ages[0];
        for (int w :ages){

            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);
        }

        System.out.println(minimum);
        System.out.println("maximum = " + maximum);


        System.out.println("Toplam = " + (maximum+minimum));











        }









    }

