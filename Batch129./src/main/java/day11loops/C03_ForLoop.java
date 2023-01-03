package day11loops;

public class C03_ForLoop {


    //Interview questions

    public static void main(String[] args) {

        //String karakterleri teker teker yazdıran;
        //Eger a karakterşnş görürse yazdırmayı durduran kodu yazınız

        String cumle="Ogrenmek yasamin tek kanitidir";

        for (int i = 0; i <cumle.length();         i++) {

            if (cumle.charAt(i)=='a'){
                break;
            }
            System.out.print(cumle.charAt(i));
        }



    }
}
