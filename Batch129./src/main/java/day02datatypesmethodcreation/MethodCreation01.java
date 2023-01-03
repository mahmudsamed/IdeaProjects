package day02datatypesmethodcreation;

import org.w3c.dom.ls.LSOutput;

public class MethodCreation01 {

    public static void main(String[] args) {

       double kup = getCube(5);
        System.out.println(kup);





       int sonuc = add(3,5);
        System.out.println(sonuc);


                  long carpmasonucu = multiply(3,6);

        System.out.println(carpmasonucu);


                   int ıslemsonucu = firstTwoMultiplyThirdAdd(5,6,3);
        System.out.println(ıslemsonucu);

      int arearectangle = shortSideMultiplyLongSide(10,25);
        System.out.println(arearectangle);




    }


    public  static int add(int a,int b){
      return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;
    }




       private static int firstTwoMultiplyThirdAdd(int a,int b,int c) {
           return a * b + c;
       }

       static double getCube(double a){
        return  a*a*a;


       }

public static int shortSideMultiplyLongSide(int x,int y){
        return x*y;
}



    }
