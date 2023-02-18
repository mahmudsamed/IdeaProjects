package suleymanhoca;

public class day21statickeywordstudent {

    /*
    1)Static variable veya static methodlar(class member) tum objeler icin ortak elemandir
    2)Static class memberlar uzerinde yapilan tum degisiklikler tum objeleri etkiler
    3)Static class member lar Class a non static class member lar object lere monte edilir
        Mesela bir class dan 100 tane object olusturdugunuzda non static olanlar 100 kere olusturulur
        ama static object sayisindan bagimsiz olarak bir kere olusturulur.
    4)Static class memberlara ulasmak icin object olusturmaya gerek duyulmaz.ama non static class member lara
      ulasmak icin object olusturmak sarttir
      5) static variable larin diger adi Class Variable dir
      Non static Variable diger adi  Instance Variable veya Object Variable dir
     */
   public static String stdName="Tom Hanks";



    public   int age=13;


    //Ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name){

        String first=name.substring(0,1);
        String second=name.split(" ")[1].substring(0,1);
        return first + second;
    }

    //Ogrenci isminde ki sesli harfleri sayan methodu olusturun
    public int countVowels(String name){

        int counter=0;

        for (int i = 0; i <name.length() ; i++) {

          char ch=  name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }

        }
        return counter;
    }






}
