package day06stringmanipulationsifstatement;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {

        // Example 1 bir stringin baş ve sonunda space characteri varsa siliniz
        // "" Ali Can *

        String s= "   Ali Can   ";
        System.out.println(s);

        // trim methodu bir stringdeki baş ve sonunda ki baş ve son karakterleri siler aradaki spacelere dokunmaz

        String sTrimmed=s.trim();

        System.out.println(sTrimmed);


        //Example 2: Asagıda fıyatları verilen urunlerin toplam fiyatlarını veriniz
        // String tv = "$456.99";  String laptop = "$875.99"==> 456.99+875.99=1332.98

        String tv1 = "$456.99";
        String laptop = "$875.99";

        String tv2=tv1.replace("$","");
        System.out.println(tv2);
        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);

       Double totalPrice= Double.valueOf(tv2) + Double.valueOf(laptop2);


        System.out.println(totalPrice);


        // Example 3 : verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekran yazdırıız
        // "ALİ CAN" ==> AC yazdırcak


        String name ="   ali cAN   ";

       char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        //parçala boşluktan demek ali ile can ın arasını kesti‚
       char second= name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);


        System.out.println(""+ first+second);

        //Example 4 : Bir stringin hiç karaktter içermediğini(boş string) kontrol eden kodu yazınız

        String str ="x";

        //1.yol :lenght metodu
       boolean result1= str.length()==0;
        System.out.println("String bos mu ?  "+ result1);

        //2.yol isEmpty kulan Java bir konuda method uretmisse o methodu kulanmak en iyisidir
        boolean result2=str.isEmpty();

        System.out.println("String bos mu ?  "+result2);


        // java da az işlem önceliğimizdie (hızlı çalışır)(2.yol best)

        // Ecample 5 bir stringin space hariç içermediğini kokntrol eden kodu yazınız

        String t = "      ";

        //1.yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var ? "+result3);


        //2.yol

        boolean result4=t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3.yol
        //isblank methodu sadece space içeren strinler için true verir
        //space dışında bir karakter içerirse false  verir
        //isblamk methodu bos stringler içimde true verir
        //isblank() ==> space + hicbisey icin true          isEMpty=> hicbisey icin true
        boolean result5 =t.isBlank();

        System.out.println(result5);


        //Example 6 : Bİr Stringde a,e,i caharcterlerinin ilk görünümlerinin indexlerinin toplamını ekrana yazdırnız
        //  " java is easy to learn ==>1+5+8=14

        String r ="java is easy to learn";


        int idxA=r.indexOf('a');


        System.out.println(idxA);

        int idxI=r.indexOf('i');
        System.out.println(idxI);
        int idxE=r.indexOf('e');
        System.out.println(idxE);

        System.out.println("toplamı =  " + (idxE+idxI+idxA));

        //bir stringde java kelimesinin ilk olarak kaçıncı index de kulanıldıgını gösteren kodu yazınız
        //          "Ah Java vah Java sensiz olmuyor Java."
        String u="Ah Java vah Java sensiz olmuyor Java.";
        //index of java kulanımında ilk görünümündeki ilk harfin yani J nin indexini almış olursunuz
        int idxJava=u.indexOf("Java");


        System.out.println(idxJava);

        //index of methodu olmayan characterler için her zaman  " -1 " verir
        int idxOfXyz=u.indexOf("xyz");

        System.out.println(idxOfXyz);

        //Bir stringde a i e characterlerinin ""    son "" gorunumlerinin indexlerini toplamını ekrana yazdrnz



        String v ="java is easy to learn";
       int idxOfA= v.lastIndexOf('a');
        System.out.println(idxOfA);
        int idxOfİ=v.lastIndexOf('i');
        System.out.println(idxOfİ);
        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);

        System.out.println("indextoplam " + (idxOfe+idxOfİ+idxOfA));

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //example 9 bir stringdeki tekrarsız karakterleri ekrana yazdırıız
        // abbccdc ==> ad


        String y ="aac";

        char ch1=y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note: bazı kodların bazı sartlara baglı olarak calısması gerekir
        //bazı kodları bazı şartlara aktive etmek için "    if  " statement(yapısı) kulanılır
        //if you study hard, you wil learn Java
        //example 10 Sayı pozitif ise ekrana pozitif yazdırın

        int num= 12;

        if(num>0){
            System.out.println("Pozitif");

        }

        int number=3;
                if(number>-1 && number<10){
                    System.out.println(number);
                }




                //example 12 : sayı 3 basamaklı ise "Woow!" yazdırın



        int num3=-465;

                //mutlak degerini alıyoruz abs ile
                num3=Math.abs(num3);

                if(num3>99 && num3<1000){
                    System.out.println("Woow!");
                }






















    }
}
