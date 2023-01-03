package day08_NestedIf;

public class C02_NestedIf {


    /*
    Passwordun ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdırın değilse geçersin password yazdırın
    Passwordun ilk harfi kucuk ise
    kucuk z olursa gecerli passworde yazdırın
    değilse gecersiz password yazdrın
     */


    public static void main(String[] args) {

        String pwd="dtyvbh";
         char ilkHarf =pwd.charAt(0);

         if(ilkHarf>='A'&& ilkHarf<='Z'){

             if (ilkHarf=='A'){
                 System.out.println("gecerli password");

             }else {
                 System.out.println("gecersiz password");
             }

         } else if (ilkHarf<='a' && ilkHarf>='z') {

             if(ilkHarf=='z'){
                 System.out.println("gecerlipassword");
             }else {
                 System.out.println("gecersiz password");
             }

         }else {
             System.out.println("ilk  characteri yanlıs kulandınız");
         }


    }





}
