package mentorhomework.advancepractice;

public class Q04_RandomMethod_RastgeleHarf {
    /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

    public static void main(String[] args) {

        String rastgeleHarf=rastgeleHarf().toLowerCase();
        System.out.println(rastgeleHarf);
        switch (rastgeleHarf){
            case "a":
                System.out.println("İlk karakter");
                break;
            case "b":
                System.out.println("İkinci karakter");
                break;
            case "c":
                System.out.println("Ucuncu karakter");
                break;
            case "d":
                System.out.println("Dorduncu karakter");
                break;
            default:
                System.out.println("Diger karakterler");
        }

        System.out.println(rastgeleHarf());


    }

    public static String rastgeleHarf(){

        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int maxIndex=alfabe.length();
       int rastgeleINdex= (int) (Math.random()*maxIndex);

    return   alfabe.substring(rastgeleINdex,rastgeleINdex+1);



    }




}
