package advancepractice;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit=input.nextInt();

        int arr[]=new int[limit];
        for (int i=0;i<arr.length;i++){

            System.out.println("İndeks "+i+ " degerini giriniz");

            arr[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
     //   Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.


        System.out.println("Sılmek istediginiz indeksi giriniz");
        int indexsil =input.nextInt();
        int brr[] =new int[limit-1];

        int idx=0;
        for (int i = 0; i <limit ; i++) {

            if (i!=indexsil){
                brr[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));













    }

}
