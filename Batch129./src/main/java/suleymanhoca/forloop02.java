package suleymanhoca;

public class forloop02 {
    public static void main(String[] args) {

        //example 1 : Verilen bir stringde 'a' characteri hariç tum karakterleri yazdırınız.


        //1.yol

        String str="madagaskar";

        String t=str.replace("a","");
        System.out.println(t);

        //2.yol

        for (int i = 0; i <str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != 'a') {
                System.out.println(ch);
            }
        }
        System.out.println("********");
            //3.yol

            for (int i = 0; i <str.length(); i++){

                char ch =str.charAt(i);
                if (ch=='a'){

 continue;

                }
                System.out.print(ch);
            }










    }
}
