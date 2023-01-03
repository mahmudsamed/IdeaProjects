package day03scanner;

public class Car {

    // Class ==> Variable (Pasif Özellikler)==>Object
    //Method (Aktif Özellikler)


    public String model= "Volvo"; //pasif özellikler variable
    public int fiyat = 600000;

    public static void main(String[] args) {


        //Class ismini yazın , objeye isim verin = new keywordunu koyun   Class ismini ()


        Car                  myVolvo = new Car();

        System.out.println(myVolvo.fiyat);
        System.out.println(myVolvo.model);
        myVolvo.hareket();
        myVolvo.dur();


    }//main'in bodysi

    public void hareket(){
        System.out.println("Volvo hizli hareket eder..");

    }
    public void dur(){
        System.out.println("Volvo guvenle durur...");
    }


}//class bodys'i
