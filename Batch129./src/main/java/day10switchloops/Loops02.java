package day10switchloops;

public class Loops02 {


    public static void main(String[] args) {

//Example 1 : 21 den 180 e kadar hem 4 hemde 6 ile bölünebilen tamsayıları yazınız


for (int i=21 ; i<181;i++){
    if (i%4==0 && i%6==0){
        System.out.print(i +" ");
    }
}
        System.out.println();
//Example 2: Size verilen kucuk harfle yazılmış string in
// index i çift sayı olan characterlerini buyuk harf yapınız
//Note : Yazdıgınız kod belli senaryolara çalışıyor tum senaryolara çalışmıyorsa bu code a
// hard code denir.hard code  yanlış yazılmış koddur mutlaka düzeltilmelidir
 // Bir stringde son index = length - 1


 String s ="ankara";
 for (int i=0;i<s.length() ;i++){

     String ch =s.substring(i,i+1);

     if (i%2==0){
         System.out.println(ch.toUpperCase());
     }
 }













    }
}
