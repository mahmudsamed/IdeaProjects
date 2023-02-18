package suleymanhoca;

import java.util.Arrays;
import java.util.Scanner;

public class array01 {

    public static void main(String[] args) {
        //Example 01 Kullanici ile beraber bir array olusturunuz

        Scanner input=new Scanner(System.in);



        System.out.println("Kac ogrenci ismi gireceksiniz");

        int numofelements=input.nextInt();

        String stdNames[]=new String[numofelements];
        for (int i=1;i<=numofelements; i++){
            System.out.println("Lutfen " +i+ " . ogrecinin adini giriniz");
            String stdName=input.next();
            stdNames[i-1]=stdName;
        }

        System.out.println(Arrays.toString(stdNames));
    }
}
