package day05typecastinstringmanipulations;

public class TypeCasting01 {
    /*numeric datatyplerinin birbrine donuşturulmesine Type Casting  denir
    numeric data type lar  byte short int long float double

    Note:1 kucuk datatyplerini buyuk data typlerine cevirmeyi Java otomatik olarak yapabilir
    Bu işleme Autowidening  otomatik genişletme denir

    Note :2 Buyuk data typlerinikucuk data typlerine donusturmek riskli bir işdir
    Java bu riskli isi otomatik olarak yapmaz
    Bu islemi kod yazanlar yapar
    Bu isleme  ExplicitNarrowing denir


     */



    public static void main(String[] args) {


        //byte datatype ını int datatype ına ceviriniz

        byte age =13;
        int Intage= age;//Autowidening

        //Long data datatypeını shorta cevirin

        long weight = 234;
        short weightInt = (short) weight; //ExplicitNarrowing


        int tone= 700000;

        System.out.println(tone);
        float toneFloat= tone;

        System.out.println(toneFloat);

        double cellnumber= 12.234;

        System.out.println(cellnumber);

        short shortCelNumber=(short) cellnumber;


        System.out.println(shortCelNumber);

        //Dikkat !
        //donusum yaptıgınız sayı donuseceginiz data type nin snırları dısında ise java kulandıgınız sayı ile mod islemi yapar
        //mod isleminin sonucu yeni degeriniz olur
        //ex 1
        short num = 260;
        System.out.println(num);

        byte nunByte = (byte) num;

        System.out.println(nunByte);
        //Ex 2

        short n = 1023;
        System.out.println(n);

        byte nByte= (byte) n;

        System.out.println(nByte);







































    }
}
