package suleymanhoca.day24accessmodifiersinheritance;

public class Student {
    public String name = "Tom Hanks";//name herkes tarafindan bilinebilir , o yuzden public yaptim
    String stdId = "TH2023HU12001";// student Id okul yonetimindeki insanlar tarafindan bilinebilir,o yuzden default yaptim
    protected int accountNum = 76512345;//acoount number ben,esim,ve cocuklarim tarafindan bilinebilir o yuzden protected yaptim
    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden private yaptim
    private int balance = 123000;



    /*
Access modifierlar genisten dara dogru;
        public > protected > default > private
Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
Kac tane access modifier var ? 4. public > protected > default > private

1)publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
2)protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
3)default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
4)private sadece class icinden ulasilabilir class disina cikildiginda ulasilamaz
5)protected ile defaultun farki nedir ?
Package disina ciktigimizda childlardan protectedlara ulasabiliriz defaultlarda ulasamayiz.


*/
}