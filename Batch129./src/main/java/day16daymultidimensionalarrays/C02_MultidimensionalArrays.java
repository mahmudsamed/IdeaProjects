package day16daymultidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {
    public static void main(String[] args) {
        int crr[][] = {{2, 5, 1}, {32, 75}};
        int mult=1;

        System.out.println(Arrays.deepToString(crr));

        for (int[] w : crr) {

            for (int i : w) {// i artık array degil arrayın ıcındekı ınteger deger

                mult=mult*i;

            }
        }
        System.out.println(mult);
    }
}
