package day11loops;

public class C04_ForLoop {

    public static void main(String[] args) {


        // Ex: 1 DEN 100 yüze kadar 6 ile bölünenler hariç ekrana yazdırınuız

        for (int i = 1; i <101 ; i++) {
            if (i%6==0){
                continue;//boşver

            }//if body

            System.out.print(i+ " ");
        }


        System.out.println("******");
        //Interview
        // size verilen bir stringi ters çeviren kodu yazınız

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
