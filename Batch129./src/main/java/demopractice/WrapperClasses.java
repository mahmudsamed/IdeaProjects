package demopractice;

public class WrapperClasses {

    public static void main(String[] args) {

 // 1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını bulmak için bir kod yazınız.

        byte min=Byte.MIN_VALUE;
        short max=Short.MAX_VALUE;
        System.out.println("Toplam " + (max+min));

//2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız
// ve yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki değişken arasındaki farkı yazdırınız.

        byte sayi1 = Byte.valueOf("111");
        short sayi2 = Short.valueOf("2351");
        System.out.println("Fark :" + (sayi2-sayi1));



    }
}
