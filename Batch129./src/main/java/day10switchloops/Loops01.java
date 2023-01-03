package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
/* Code Standarts
i)Tekrar olmamalıdır
ii)Dynamic olmalıdır
iii)Tamir ve update kolay yapılabilmedir
 */






//Example 1: EKrana 5 kere "hi" yazdırınız
// tavsiye edilmez

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");


//2.Yol
// Aynı adımlar tekrar tekrar yapılması gerektiğinde Looplar kullanılır
// Dort tane loop var i)for-loop ii)while loop iii)do while loop iv) for each loop

// i) for loop
 //   başlangıc degeri      loopun çalışma şartı                increment /decrement
for (   int i=1          ;    i<6                              ; i++                ){
    System.out.println("Ha");
}

//Example 2 11 den 44 e kadar tum tams sayıları ekrana yazdıran kodu yazınız

        for (int i=11;i<45; i++){

            System.out.println(i);
        }

        //Example 3 40 dan 23 e kadar tum cift sayıları yazınız

        for (int i=40 ; i>22;i--){

            if (i%2==0) {

                System.out.println(i);
            }
            }

        //Example 4 : 18 den 56 ya kadar tum tek sayıları ekrana yazdır
        for (int i = 18  ; i<57  ;i++){
            if (i%2==1){
                System.out.print(i);
            }
        }
        for (int i=1 ; i<3;i++){

            System.out.println();
        }















    }
}
