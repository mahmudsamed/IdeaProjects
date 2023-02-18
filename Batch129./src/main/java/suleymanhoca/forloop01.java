package suleymanhoca;

public class forloop01 {

    public static void main(String[] args) {


      //Example 1:Verilen bir stringde ilk a harfinden önceki tum characterleri console yazdırınız

      String s="I love Java";

        for (int i=0;i<s.length();  i++    ){

            char ch=s.charAt(i);



            if (ch=='a'){
                break;

            }
            System.out.print(s.charAt(i));

        }


        System.out.println("***************");
        //EXAMPLE 2 Verilen bir stringde son a dan sonraki karakterleri yazınız
        //"germany"

        String str="Germany";

        for (int i = str.length()-1; i >=0 ; i--) {

            char ch = str.charAt(i);
            if (ch=='a' ){
                break;
            }

            System.out.print(str.charAt(i));
        }




    }


}
