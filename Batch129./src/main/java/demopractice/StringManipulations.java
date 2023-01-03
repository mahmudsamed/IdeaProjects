package demopractice;

public class StringManipulations {


    public static void main(String[] args) {

//1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir ismini, baş harfi büyük ve
// diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
//Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
//mIaMi - Miami vb.

        String city = "ANtaLyA";

        String newCity = city.trim().toLowerCase();
        newCity = newCity.substring(0, 1).toUpperCase() + newCity.substring(1);
        System.out.println("newCity = " + newCity);
//2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
//Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

        String a = "Ali Can";
        String b = "Merve Star";
        String c = "Mark Tom";

        Integer a1 = a.replaceAll("\\s", "").length();
        Integer b1 = b.replaceAll("\\s", "").length();
        Integer c1 = c.replaceAll("\\s", "").length();

        System.out.println("karakter sayı toplamı " + (c1 + b1 + a1));

        //3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String str = "Antalya posta kod 07800 !!!";
        Integer karakterSayisi = str.replaceAll("\\s", "").replaceAll("[//w]", "").length();
        System.out.println("karakterSayisi = " + karakterSayisi);


        System.out.println("------");
//4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
//Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

        String u = "1a3Bcf4!...";

        Integer rakamolmayankaraktersayısı = u.replaceAll("[0-9]", "").length();
        System.out.println("rakamolmayankaraktersayısı = " + rakamolmayankaraktersayısı);

        System.out.println("*******");
//5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son karakteri yazdırınız.
//Örnek: 'Ali Can' için n yazdırmalısınız. ‘Miami’ için i yazdırmalısınız.

        String y = "Ali Can";

        int ynew = y.trim().length() - 1;
        String boslukOlmayanSonKrk = y.substring(ynew, ynew + 1);
        System.out.println("boslukOlmayanSonKrk = " + boslukOlmayanSonKrk);

        //6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulunuz.


String h="Galatasaray";
int sonharf=h.length()-1;
int l=h.charAt(0);
        System.out.println(l);
        int m=h.charAt(sonharf);
        System.out.println("ilk ve son karakter toplamları = " +(l+ m));


        System.out.println("********");
//7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız.
//Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

        String cumle="Java";
        String anew=cumle.substring(1);
        System.out.println(anew);

        //8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

String aa="Java";
Integer cc=aa.length()-1;
        String sonKrkDisindakiler = aa.substring(1, cc).toUpperCase();
        System.out.println(sonKrkDisindakiler);

//9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
//Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

String new1="Javamın";
Integer new2=new1.length()-1;

String new3=new1.substring(0,new2).toUpperCase();
        System.out.println("new3 = " + new3);

//10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
//Örnek: ‘Ali ‘Can’ için konsolda false yazmalıdır.
        String s = "Tom  Hanks";
        String trimlenmis = s.trim();
        String hicBoslukYok = trimlenmis.replaceAll("\\s", "");
        Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;
        System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);


        //11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır ‘Ali’ için kodunuz konsolda true yazmalıdır

        String dmd=" mahmud  ";
        String trimli=dmd.trim();

        boolean result=dmd.equals(trimli);
        System.out.println("result = " + result);

        String hm="rukiye";
        String mewtrm=hm.trim();
boolean result1=hm.equals(mewtrm);
        System.out.println("result1 = " + result1);
        //12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
        String z="adana";
        String xtrim=z.trim();




    }
}
