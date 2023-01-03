package demopractice;

public class variable {
    public static void main(String[] args) {


        /* Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz.
         Fiyatların toplamını konsola yazdırınız.
         */

        double milk=15.99;
        double oil=34.54;
        double egg=23.54;
        System.out.println(milk + oil+ egg+ "$");

/*
Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz.
 Bu değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
 */
    float cell=134.45f;
    long kw=56789L;
    int num=678;
        System.out.println("sumMultiply " + num*kw*cell);

    /*
    Basit faizi bulmak için bir kod yazınız.
Not: Basit faiz formülü = anapara * oran * yılDegeri /100
     */
        int anapara=150000;
        double interestRate=12;
        int year=3;

        System.out.println("formul of interest :"+anapara*interestRate*year/100);


        /*
        Bir String ve iki long data tipinde değişken oluşturunuz.
         Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.

         */


        long x=1299L;
        long y=2023L;

        String s="sonuc";

        System.out.println(s  + x*y);
        System.out.println(s + (x+y));

        /*
        Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve
        bu değerleri iki ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
         */

        boolean a = 2<3;

        boolean b = 3>5;
        System.out.println(a + " " + b);

        /*
        3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
         */
   float prBook=65.34f;
    float prNote=45.56f;
    float prPc=122.67f;

    float toplamFiyat=(2*prBook)+(4*prNote)+(3*prPc);

        System.out.println(toplamFiyat);


        /*
        İki tamsayıyı değiştirmek için bir kod yazınız.
         */

        int u=4;
        int t=6;
        t=t+u;
        u=t-u;
        t=t-u;
        System.out.println("t ve u yenı hali: "+ t+ " " + u);
    }



}
