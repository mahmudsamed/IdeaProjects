package advancepractice.practice06;

import java.util.Scanner;

public class Q02_Palindrom {
    // Bir string degerin Palindrom olup olmadigini kontrol eden bir kod yaziniz


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     //   System.out.println("Bir string deger giriniz");

     //   String str=input.nextLine().replaceAll(" ","").toLowerCase();

    //    String strReverse="";


     //   for (int i = str.length()-1; i >-1 ; i--) {

     //       strReverse+=str.charAt(i);



  //      }
  //      System.out.println("strReverse = " + strReverse);

   //     if (str.equals(strReverse)){
    //        System.out.println("Palindrom");
     //   }else {
    //        System.out.println("Palindrom degil");
    //    }
        System.out.println("Bir string deger giriniz");
        String str2=input.nextLine().replaceAll(" ","").toLowerCase();


        System.out.println(str2);
        StringBuilder stb=new StringBuilder(str2);
        System.out.println("stb = " + stb);

       String str2Reverse= stb.reverse().toString();
        System.out.println("stb = " + stb);

        if (str2.equals(str2Reverse)){
            System.out.println("Palindrom");

        }else {
            System.out.println("Palindrom degil");
        }

    }
}
