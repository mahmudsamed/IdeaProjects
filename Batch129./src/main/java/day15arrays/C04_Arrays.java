package day15arrays;

public class C04_Arrays {
    public static void main(String[] args) {


        //B ir arrayin icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz


        int arr[]={5,1,5,-3};

        int eleman=-3;

        int counter=0;

        for (int w : arr) {

            if (eleman==w){


                counter++;
            }

        }

        if (counter>0){
            System.out.println(eleman + " Arrayde " +counter+ " defa var" );

        }else System.out.println(eleman +" arrayde yok");










    }
}
