package practice.practiceDTNT;

import java.util.Scanner;

public class practice02 {

    public static void main(String[] args) {


        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    |||
    |||
    |||
    |||
    |||


 */
        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen agacın tac uzunlugunu giriniz");

        int tac =input.nextInt();
        String yaprak ="^";

        for (int i = 0; i <tac ; i++) {//satır kontrolu
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("|||");
        }




    }



}
