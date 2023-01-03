package src.main.java.day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

/*
 Example 1 : Verilen yılın artık yıl(leap year) olup olmadıgını kontrol eden kodu yazınız

 1)Yıl 100 e bölünürse 400 e bölünmelidir
 2)Yıl 100 e bolunmuyorsa 4 e bolunmelidir
 */
        int year=160;

       String result=year%100==0 ? (year%400==0 ? "Leap" :"Not Leap") : (year%4==0 ? "Leap " : "Not Leap");

        System.out.println(result);












    }






}
