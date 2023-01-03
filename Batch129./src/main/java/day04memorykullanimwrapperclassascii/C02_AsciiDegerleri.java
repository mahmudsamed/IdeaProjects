package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {

    /*ASCII=Amerikan Standart kodlama Sistemi uluslarlarası kabul görmüş değerlerdir.
    Klavyemizde kulandığımız harf ve sembeolerin matematiksel karşılığı char
     data türünde işleme alınırsa o char değerinin ASCII table daki karşığını alır
    harfve sembolere deger atar
    Karakterlerin cebirsel karşılığını bulmak için ortaya çıkmıştır
    çunku pc de herşey 1001001 den oluşur
    bu yapıya çevirebilmek için ascii table oluşturulmuştur
    Buyuk harflerin ascii degeri kucuk harflerin ascii degerinden daha kucuktur


     */

    public static void main(String[] args) {

        //bir tamsayı ile bir harfi toplayınız
        int deger=20;
        char harf='a';

        //1.yol
        int sum=deger+harf;
        System.out.println("bir tamsayı ile harfin toplamı="+sum);

        //2.yol toplam
        System.out.println("2.Yol Toplam "+(deger+harf));

        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2='2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);

        // parantez olmadıgından yanyana koyar
        //+ lar yanayana yazdırma işlemdidir
        System.out.println("rakam1+rakam2+rakam3+rakam4 ="+rakam1+rakam2+rakam3+rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 ASCII toplam ="+(rakam1+rakam2+rakam3+rakam4));


        char kh='a';
        char bh='A';

        System.out.println("a'nın ascii degeri ="+ (0+kh));

        System.out.println("A nın ascii degeri ="+(0+bh));

        //karşılaştırma işlemlerinin sonucu true yada false döner
        System.out.println("kh  > bh  =>"+(kh>bh));

        //herhangi bir karakterin ascii degerini hesaplatalım

        //1.yol
        char space =' ';
        System.out.println("space = " + (space+0));


        char samed =' ';
        System.out.println("samed ascii degeri = " + (samed+0));
        //charlar da java data typlerında Java karaktere int deger de atanabilir
        //cunku char data typlerinin bir resim degeri bir de asciiden gelen int degeri vardır
        //bu sekilde ascii degerini bulabiliriz

        //2,yol
        int hrf='m';

        System.out.println("int har'in ascii degeri"+ hrf);


        char enter =' ';
        System.out.println("mahmud = " + (enter+0));

        //ascii degerleerinden yararlanarak karsılastırma yapabiliriz

        byte b= 125;
        float f= 2.45648f;
        long l=54555555555555L;
        char ch='h';
        System.out.println(l>ch);
        System.out.println(b<f);

        System.out.println(b<ch);




















    }


}
