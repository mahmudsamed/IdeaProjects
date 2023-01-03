package day15arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {


        /*
        Interview questions

        [0,2,3,0,12,0] sifirlari en sona koyunuz


         */
        int original[]= {0,2,3,0,12,0};

        int yeni[]=new int[original.length];

        int idx=0;
        for (int i = 0; i <original.length ; i++) {// original array icin calisti


            if (original[i]!=0){
                yeni[idx]=original[i];

              idx++;// bir sonraki index e gecer






            }

        }
        System.out.println(Arrays.toString(yeni));



    }
}
