package day03scanner;

public class Homeworkcar {


    public String model= "Honda";
     public int price = 8000;


    public static void main(String[] args) {




        Homeworkcar myHonda=new Homeworkcar();


        System.out.println(myHonda.model);
        System.out.println(myHonda.price);
        myHonda.hareket();
        myHonda.dur();
    }
    public void hareket(){
        System.out.println("Honda seri hızlanır");
    }
            public void dur(){
                System.out.println("Honda fren sistemi iydir");
            }


    }

