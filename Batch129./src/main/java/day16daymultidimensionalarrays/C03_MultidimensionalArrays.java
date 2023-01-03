package day16daymultidimensionalarrays;

import java.util.Arrays;

public class C03_MultidimensionalArrays {
    public static void main(String[] args) {
        //Bir multıdımensıonal arrayde kı en buyuk ve en kucuk elemanın
        // toplamını veren kodu yaınız

        int arr[][] = {{2, 5, 1}, {83, 75}};
        int maxElement= arr[0][0] ;//2
        int minElement= arr[0][0] ;
        for (int[] w: arr) {
            for (int k : w) {
                maxElement=Math.max(maxElement,k);//maxElement = 83
                minElement=Math.min(minElement,k);//minElement = 1
            }
        }
        System.out.println("maxElement = " + maxElement);//83
        System.out.println("minElement = " + minElement);//1
        System.out.println("Toplam = " +( maxElement+minElement));//Toplam = 84

    }
}
