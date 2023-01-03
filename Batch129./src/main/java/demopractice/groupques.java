package demopractice;

import java.util.Scanner;

public class groupques {

    /*
    1-Kullanıcının girdiği iki sayıdan büyük olanını ekrana çıktı olarak veren metodu oluşturun
2-Kullanıcıdan iki sayı alın ve toplam, fark, çarpma ve bölme işlemlerinden birini kullanıcının seçmesini isteyin.
Girilen sayılara seçilen işlemi uygulayan metodu oluşturun
3-öğrencinin vize ve final notu girilecek. ortalama hesaplanacak. ortalama>60 ise geçti,
 ortalama>50 ise sorumlu geçti, ortalama<45 ise kaldı mesajı veren metodu oluşturun
     */


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen iki sayı griniz");
        int num11=input.nextInt();
        int num22=input.nextInt();
        if (num22<num11){
            System.out.println(num11);
        }else if (num22>num11){
            System.out.println(num22);
        }else System.out.println("sayılar esit");


        System.out.println("Lutfen iki sayı griniz");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Lutfen 4 islemden birini seciniz");
       String toplam=input.next();
        System.out.println("toplam = " + (num2+num1));



    }
}
