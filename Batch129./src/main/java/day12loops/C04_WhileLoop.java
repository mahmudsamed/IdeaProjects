package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //3 den 10 a kadar tam sayıları aynı satıra yazdıran kodu yazınız
//1.yol
        for (int i = 3; i < 11; i++) {

            System.out.print(i);
        }

        System.out.println();
//2.yol


        int i = 3;//baslangıc degeri

        while (i < 11) {//bitiş degeri
            System.out.print(i + " ");
            i++;//artırma while loop un {} içinde
        }

        System.out.println();
//17 den 4 e kadar çift sayıları yazınız

        int m = 17;
        while (m > 3) {
            if (m % 2 == 0) {
                System.out.print(m + " ");

            }
            m--;

        }
    }
}