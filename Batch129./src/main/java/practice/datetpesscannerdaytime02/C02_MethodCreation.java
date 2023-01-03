package practice.datetpesscannerdaytime02;

public class C02_MethodCreation {

    //Dikdörtgenin alanını hesaplayan methodu oluşturunuz ve kullanınız.

    public static void main(String[] args) {

        //protokol alanı

        System.out.println(dikdortgenAlani(5, 10));

        System.out.println(dikdörtgenÇevresi(6,10));


    } //main in body
    /*
    Acces static Data MethodAdi  (parametreler)

    modifier type




     */


    public static int dikdörtgenÇevresi(int a,int b){
        return (a+b)*2;
    }





    public static int dikdortgenAlani (int a,int b){

        //main method oldugu için main içinde ki herşeyin static olması gerekir
        //method adi Camel Case kucuk harfle baslar sonrakş her kelimenin ilk harfi buyuk olur
        return a*b;  // çarpmanın sonucu kulanıcıya ver
    }



}//class
