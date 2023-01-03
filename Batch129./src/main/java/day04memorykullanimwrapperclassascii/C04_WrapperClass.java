package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {
    /*
    non primitive data türleri sadece data barındırmak için değil aynı zamanda method larda bulundurur
    primitive data türleri ise sadece deger saklar
     java bu duruma bir cöüzm üretmiştir
     her primitive data turunu  non primitive olarak kullanabilmek için özel classlar oluşturmuştur
     oracle firmasının ürünü olan java primitivlere method ekleyerek oluşturdukları bu yeni yapıya wrapper
     class adını vermiştir


     primitive              wrapper
     byte         ==>       Byte
     short        ==>       Short
     int            ==>     Integer*****
     long           ==>     Long
     float          ==>     Float
     double     ==>         Double
     boolean    ==>         Boolean
     char       ==>         Chaacter*****






     */
    public static void main(String[] args) {

        byte primitiveByte=12;//primitive datat typlerında nokta koydugumuzda hiç bir method gelmez


        Byte wrapperByte=12;//wrapper classlarda nokta koydugumuzda bir cok method kullanabiliriz




                //ex.byte data type nın en kucuk ve en buyuk degerini ekrana yazdırın

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //EX short int long data typlerının max ve min degerlerini hesaplatan kodu yazınız

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //*******Primitivler wrapper classlara nasıl çevrilir(autuboxing)*****



        float f1 = 13.99F;//kucuk kutu primitive
        Float wrapperF1 = f1;


        //*****Wrapper Class ları primitive Data Typelarına nsıl cevrilir ?(unboxing)

        Character w1 = 's';
        char primitiveW1= w1;
        // autboxing ve unboxing java tarafında yapılır

        //extra kod yazmaya ggerek yok

        System.out.println((primitiveW1+0));

        //ex verilen iki String datanın toplamını veren kodu giriniz

        String str1 = "12345";
        String str2 ="6789";
        System.out.println(str2+str1);//yanayana yazdırdı

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//İnteger ve value of kullanrak toplarız



































    }


























}
