package day22statticblocksconstructors;

public class HomeRunner {


    public static void main(String[] args) {

        Home myhome= new Home("selale",120,"beyaz",2,"12.cadde");

        System.out.println(myhome);


        StringBuilder sb3 = new StringBuilder("Learn");

        System.out.println("Before trim: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());

        StringBuilder str = new StringBuilder("LearnJava");


        int index = str.indexOf("e", 4);
        System.out.println(index);

        StringBuilder strBld = new StringBuilder(6);
        strBld.append("Learn");
        strBld.append("Java");
        System.out.println(strBld);
        strBld.substring(3);
        System.out.println(strBld);


        String strr = "Learn";
        join("Java");
        System.out.println(strr);
    }

    public static String join(String strr) {
        return strr + "Java";


    }




}
