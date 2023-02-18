package suleymanhoca;

public class forloop03 {
    public static void main(String[] args) {

        //Example :1 size verilen bir stringi tersden yazdırınız

        String s= "antalya";

        String ters="";
        for (int i =s.length()-1; i >=0 ; i--) {
            char ch=s.charAt(i);
           ters+=ch;


        }
        System.out.println(ters);

        //example 2 :Size verilen bir string in "palindrom" olup olmadıgını kontrol eden kodu yazınız
        // civic.nalan.kucuk

        //Logic:Stringi ters cevir sonra da duz hali ile ters halini karşılaştır aynı ise palindrome de



        String r="civic";

        String u="";

        for (int i =r.length()-1; i >=0 ; i--) {
            u =u+r.charAt(i);

        }
        if (r.equalsIgnoreCase(u)){
            System.out.println("Bu string palindrome dur : "+ r);

        }else {
            System.out.println(" palindrome değildi " + r);
        }




    }
}
