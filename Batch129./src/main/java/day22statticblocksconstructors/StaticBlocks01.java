package day22statticblocksconstructors;

public class StaticBlocks01 {


    //Bir variable olusturdugunuzda deger atamazsaniz o variable i initialize etmediniz demektir.
    //Static variablelar static blocklar icinde initialize edilirse o classin icinde herseyden once hazir hale getirilmis olur
    //Bazen main method calistirilmadan once variable larin hazir hale getorolmesi grekir bu yuzden static blocklar kullanilir

// Note 1 : static blocklar static variable lari initizalize etmek icin kullanilirlar
    //static blocklar class icinde herseyden once calisitirilirlar
    static double pi;

    static String shape;


    static {
        pi =3.14;

        System.out.println("Static block 1");

    }

    static {
        shape="Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {

        System.out.println("main method");
    }



}
