package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
        String olusturmak icin String Class,Stringbuilder class ve StringBuffer kullanillabilir
        1)StringBuffer Java nin String uretmek icin olusturdugu ile Classdir.Java 5 de uretilmistir
        2)StringBuffer synchronized dir , stringbuilder synchronized degildir
        3)StringBuffer thread-safe(multi thread e uygun) dir , stringbuilder thread-safe degildir
        4)StringBuffer ve String builder ikisi de mutable dir


    Note1: Immutable string lazim oldugunda String class kullaniriz
    Note 2: Mutable String lazim oldugunda StringBuilder veya Stringbuffer kullanilir

    Note 3:     Stringbuffer multi thread ve synchronizition lazim oldugunda  tercih edilir

                Stringbuilder multi thread ve synchronizition gerekmezse  tercih edilir

     */




    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer("Java");

        System.out.println(sbf);

        System.out.println(sbf.capacity());//20

















    }
}
