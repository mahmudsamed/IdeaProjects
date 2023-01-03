package interviewque;

public class Interview1 {


    public static void main(String[] args) {

        //String karakterleri teker teker yazdıran;
        //Eger a karakterşnş görürse yazdırmayı durduran kodu yazınız

        String cumle = "Ogrenmek yasamin tek kanitidir";

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == 'a') {
                break;
            }
            System.out.print(cumle.charAt(i));
        }


        String name="Mahmud";

        String ters="";// yeni bir konteynır

        for (int i = name.length()-1; i>-1 ; i--) {

            char harf=name.charAt(i);

            //ters=ters + harf; 2.yol

            ters+=harf;
        }
        System.out.println(ters);



    }



}
