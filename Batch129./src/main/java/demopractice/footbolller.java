package demopractice;

public class footbolller {



    public static String ftb="Hagi";

    public int cost=150;

    public int age=35;

    public int weight= 80;

    public static int boy=190;

    public int sesli(String name){

        int counter=0;
        for (int i = 0; i <name.length() ; i++) {

            char ch=name.toLowerCase().charAt(i);

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


    public  String change(String degisim){


        degisim.replace('a','e');

        return change(degisim);

    }







}
