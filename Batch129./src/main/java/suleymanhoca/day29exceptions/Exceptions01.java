package suleymanhoca.day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj=70;
        String str="";
        try {
             str= (String) obj;//Birbirne donusturuelemeycek data typlerini donusturmekde israr edersiniz Java ClassCastException atar

        }catch (ClassCastException e){
            System.out.println("Her data type i data type ine cevrilmez");
        }

        System.out.println(str);

    }
}
