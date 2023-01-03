package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {


    //==  = tek esittir atama (assgiment ypar)
    //cift esittir eşittr için kulanılır
    /*
     java üçlü karşılaştırma kabul etmez
     ikili karşılaştırmalar yapıp mantık opertorleriyle birleşirmeliyiz
     && == ve and     || or veya operatoru demek

     && (ve) operatoru mukemmeliyetcdir
     && (cift) oldugunda boolean sonucta bi tane false bulunca durur
     & de ise tum satırı tarar sonra durur
     buda && ni & den daha hızlı calısmasını saglar





     Cay ve Limon
       + &&   + = true
       + &&  -  = false
       - &&  + = false
       - &&  - = false

       || veya operatoru Polyannacdır.en ufak bi pozitiflikden true dömer


   Cay   ve Limon
       + ||   + = true
       + ||  -  = true
       - ||  + = true
       - ||  - = false











     */
    public static void main(String[] args) {
        System.out.println(5+2 == 8);
        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;

        System.out.println(sonuc1);
        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2==7;

        System.out.println(sonuc2);


        int sayi1 = 15;
        System.out.println(10<sayi1 && sayi1<20);


        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);


    }






























}
