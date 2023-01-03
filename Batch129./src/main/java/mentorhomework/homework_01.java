package mentorhomework;

import java.util.Scanner;

public class homework_01 {


    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

      //  Scanner input=new Scanner(System.in);
       // System.out.println("Lutfen bir kelime giriniz");
       // String str=input.nextLine();
       // System.out.println("Lutfen bir sayi giriniz");
      //  int num=input.nextInt();
        //for (int i = 0; i <str.length()-1; i++){

        //    char ch =input.next().charAt(0);
          //  if (ch=='0'){

           //    continue;

           // }
        //  System.out.print(str.charAt(0));,





            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir kelime giriniz");
            String str = input.nextLine().toLowerCase();

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String ch = "" + first + last;

            System.out.println("lütfen bir sayı giriniz");
            int num = input.nextInt();
            myMethod(ch,num);

        }
        static void myMethod(String a, int b) {
            String s = "";
            for (int i = 0; i < b; i++) {
                s+=a;
            }
            System.out.println(s);



 /*
    Kullanıcıdan başkangıç ve bitiş değerlerini alın
    Başlangıc degerinden baslayıp bitiş degerine kadar cift sayıları ekrana yazdrın

     */


        }





    }



