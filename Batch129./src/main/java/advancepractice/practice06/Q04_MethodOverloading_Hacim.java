package advancepractice.practice06;

public class Q04_MethodOverloading_Hacim {

    //Kup, kare prizma ve dikdortgen prizmanin hacmini hesaplayan bir kod yaziniz.(Method overloading kullaniniz)
    public static void main(String[] args) {
        Hacim obje =new Hacim();

        int kupunHacmi= obje.hacimHesapla(5);

        System.out.println("kupunHacmi = " + kupunHacmi);


        int karePrizmaHacmi= obje.hacimHesapla(5,4);

        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        int dikdortgenPrizmaHacmi= obje.hacimHesapla(5,4,3);

        System.out.println("dikdortgenPrizmaHacmi = " + dikdortgenPrizmaHacmi);


        int kupunHacmi2=obje.hacimHesapla(2);

        System.out.println("kupunHacmi2 = " + kupunHacmi2);
    }
}
