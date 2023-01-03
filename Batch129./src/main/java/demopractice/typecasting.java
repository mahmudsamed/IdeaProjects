package demopractice;

public class typecasting {


    public static void main(String[] args) {
      // 1 Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        short x=1234;

        int yeniYas = (int)x;


        System.out.println("yeniYas = " + yeniYas);

    //2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        long km=3478L;

        int mile=(int)km;

        System.out.println(mile);
//3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.

        double number=12.99;
        float newww=(float)number;
        System.out.println("newww = " + newww);

 //4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz. Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        // Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır

        double m=854.65;
        short n=(short)m;
        System.out.println("n = " + n);

//5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz. Sonrasında bu double değişkenin değerini konsolda yazdırınız.
//Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.


        byte j=122;
        double g=(double) j;
        System.out.println("g = " + g);







    }
}
