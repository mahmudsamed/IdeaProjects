package demopractice;

public class practicevariable {

    public static void main(String[] args) {

        // counting numbers from 10 to 57 onthe console

        for (int i=10;i<58;i++){
            System.out.println(i);
        }


        //to print even counting numbersvfrom 100 to 43 on the console

        for (int i=100; i>42;i--){
            if (i%2==0){
                System.out.print(i);
            }
        }

        System.out.println();
        //to print odd counting numbersvfrom 200 to 33 on the console

        for (int i=200;i>32;i--){
            if (i%2==1){
                System.out.print(i + " ");
            }
        }

        System.out.println("*****");
        //to add counting numbers from 23 to 57 on the console

       int toplam=0;
        for (int i=23;i<58;i++){

            toplam +=i;//toplam=toplam + i

        }System.out.println("Toplam =" + toplam );

        //to multiply counting nummbers from 7 to 15 on th e console

        int m=1;
        for (int i=7 ; i<16;i++){
            m=m*i;
        }

        System.out.println("Cumulatıve Multiply"+ "= "+ m);
//to print counting number less than 200 and divisible by 5 on the console

        int n=1;
        for (int i=200;i>0;i--){
            if (i%5==0);

            System.out.println(i+" ");
        }
























    }
}
