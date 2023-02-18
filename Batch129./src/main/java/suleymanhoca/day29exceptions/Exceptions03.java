package suleymanhoca.day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {
    public static void main(String[] args) {


        try {
            FileInputStream fis=new FileInputStream("Batch129./src/main/java/suleymanhoca/day29exceptions/file01.txt");

            int k=0;
            while ((k= fis.read()) !=-1){

                System.out.print((char) k);
            }




        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Hi!");

    }
}
