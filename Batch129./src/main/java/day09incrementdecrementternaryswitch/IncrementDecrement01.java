package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {


    public static void main(String[] args) {


        int a =5;
        System.out.println(a);

        //Increment
        a=a +2;// veya a+=2;
        System.out.println(a);//7

        //

        int x= 10;

        x+=10;
        System.out.println(x);//


        //Decrement


        int m=15;
        m-=2;

        System.out.println(m);





        //ıncrement 2:
        int h=15;
        h*=3;
        System.out.println(h);



        //decrement 2:

        int j=96;
        j/=2;
        System.out.println(j);

        //1 ile increment ve decrement

        int d =13;
        d++;
        System.out.println(d);

        int r=15;

        r--;
        System.out.println(r);


        //post increment ve pre increment

        int i= 10;
        int k=i++;//post increment cunku increment variable ın isminden sonra yazıldı


        System.out.println(k);//10 ==> i artırılmadan k ya konuldugu için k nın degeri 10 olur
        System.out.println(i);//11 ==> i satır sonunda artırıldıgı için i nin degeri 11 olur



int l=15;
int v=++l;
        System.out.println(l);// ==> m artırıldıgı için m nin degeri 16 olur

        System.out.println(v);//16 ==> m artırıldıktan sonra n ye konuldugu için n nin degeri 16 olur

        //"post decrement ve pre decrement"

        int p =17;
        int ş =p--;
        System.out.println(p);//16
        System.out.println(ş);//17

        int s=20;
        int t =--s;
        System.out.println(s);//
        System.out.println(t);









    }
}
