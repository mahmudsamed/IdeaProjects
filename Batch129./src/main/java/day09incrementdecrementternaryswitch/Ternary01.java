package src.main.java.day09incrementdecrementternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

//example 1 :

        int a =10;
        int b =20;

       int r1= a<b ? a++ :++b;

        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);


        // example 2:Verilen bir sayının muylak degerini hesaplayan kodu yazınız

        int m=-9 ;
       int m2= m<0 ?-1*m : m;

        System.out.println(m2);

 // example 3 : iki sayının işareti aynı ise bu sayıları çarpan,işartleri farklı ise farklı işaretli sayılarıçarpmıyorum
 //mesajı veren kodu yazınız

 int k=5;
 int n=-6;

 //Object javada bütün "NON Primitive Data Type  data typpe larinin ortak parent idir
 //Object in parent i yoktur
 //Farklı data type ları için ortak bir variable oluşturmak istediginizde data type olarak object kullanabilirsiniz
 // Java da Object insanlık aleminde Hz.Ademe benzer


Object kn=  (k>0 && n>0) || (k<0 && n<0) ? k*n :"Farklı sayıları carmıyorum";
        System.out.println(kn);

 //example 4: size verilen sayının 3 basamaklı olup olmadıgını kontrol eden kodu yazınız

 int u=-123;


 int y=Math.abs(u);

      String u4=y>99 && y<1000  ?+ y  + "   3 basamaklı sayı" :+ y +  "    3 basamaklı sayı değil" ;

        System.out.println(u4);















    }







}
