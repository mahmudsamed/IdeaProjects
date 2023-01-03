package day05typecastinstringmanipulations;

public class SwapValues {

    //swap: yer değiştirme
    //1.kapta patates   2.kapta domates ==>1.kap domates 2.kap patates

    public static void main(String[] args) {

        int a = 12;
        int b = 5;      //swapden sonra  ==> a=5 ve b=12

        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1.Yol

        //1.adım
        temp=a;
        //2.adım
        a=b;
        //3.adım
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Yol

        int x =12;
        int y = 5;

        x = x+y;
        y= x-y;
        x= x-y;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

































    }
}
