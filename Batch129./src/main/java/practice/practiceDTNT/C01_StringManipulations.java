package practice.practiceDTNT;

import java.util.Scanner;

public class C01_StringManipulations {


  /*                          String Class Methodlari

                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
    ii)equals() method'u "boolean" return eder.
            2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
    kucuk harfe dikkat etmeden anlamamiza yarar.
    ii) equalsIgnoreCase() method'u "boolean" return eder.
            3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
    ii) toLowerCase() method'u "String" return eder
            4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
    ii) toUpperCase() method'u "String" return eder
            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
            ii) charAt() method'u "char" return eder.
            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
    ii) length() method'u "int" return eder.
            7)contains(): i)Bir String'de belli bir characterin veya
    characterlerin var olup olmadigini anlamak icin
    kullanilir
    ii) contains() method'u "boolean" return eder.
            8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
    ii)split() method'u "Array" return eder.
            9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
    istenilen karakter ya da metinle degistirilmesini saglar.
    Sonuc String'dir..
            10)replaceFirst()
    i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey

               12) + Concat: Bir Stringe diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.


        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.
         */

    public static void main(String[] args) {

        System.out.println(15+20+"Merhaba");

        System.out.println("Merhaba"+15+20);
        System.out.println("Merhaba"+15*20);

        //Kullanıcıdan ismini ve soyismini girmesini isteyin
        //Sonrasında kullanıcı nasıl girerse girsin konsola buyuk harfle yazdırsın


        //Scanner input=new Scanner(System.in);

        System.out.println("Lutfen ismini ve soyismini giriniz ");

        //String isim=input.nextLine(),soyAd=input.nextLine();//multiple declaration

      // String tamIsim=isim.concat(" "+soyAd).toUpperCase();

       // System.out.println(tamIsim);

        //rakam haricindekiler

        String str="45.99 $";

        str=str.replaceAll("\\D","");

        System.out.println("str = " + str);


//Verilen cumleyi yıldız ile gizleyin.10 . karakterden sonrasını yazdırın

        String cumle="Her dert java gibi olsa";

        System.out.println(cumle.replaceAll("\\w","*")+ cumle.substring(10));



        // a harfi yerine @ işareti yerleştiriniz

        String kelime="olaganustu";

        System.out.println(kelime.replace("a","@"));


        String txt ="Merhaba Dunya";
        //txt deki butun a ları e ile değiştirin

        System.out.println(txt.replaceAll("a","e"));

        //txt deki ilk nulunan a yı e ye donustur
        System.out.println(txt.replaceFirst("a","e"));

        //kalem yerine dolma yazdrın

        String str2="Dolma Kalem ile bir dünya kaleme aldık";

        System.out.println(str2.replaceAll("Kalem","biber"));




        String str3="bugun hava yagmurlu";
        System.out.println(str3.length());//uzunlugu verir


        String str4="";
        System.out.println(str4.length());


        String str5=" ";
        System.out.println(str5.length());



        //kullanıcıdan isim ve soy isim girmesini isteyin hangisini daha uzun oldugu
        // kodu olulturun

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen isim ve soy isminizi griniz");

        String isim=input.nextLine();
        String surname=input.nextLine();

       // System.out.println(isim.length()>surname.length()? isim:surname);

        if (isim.length()>surname.length()){
            System.out.println("ısmınız daha uzun");
        } else if (isim.length()==surname.length()) {
            System.out.println("ismini soyisminizle aynı uzunluktalar");

        }else
            System.out.println("soy isminiz isminizden uzun");


    }













}
