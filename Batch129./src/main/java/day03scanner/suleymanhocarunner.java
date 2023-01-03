package day03scanner;

public class suleymanhocarunner {

    public static void main(String[] args) {

        //object nasıl oluşturulur?
        //classs        object   atama operatoru     new keyword             Constructor

            Car          myCar      =               new                       Car();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();

        Studentsuleymanhoca samed= new Studentsuleymanhoca();
        System.out.println(samed.name);
        System.out.println(samed.grade);
        System.out.println(samed.address);


        samed.study();
        samed.feed();


    }
}
