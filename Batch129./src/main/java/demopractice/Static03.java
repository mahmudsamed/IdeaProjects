package demopractice;


import java.util.Scanner;

public class Static03 {


    public static void main(String[] args)  {

        String s2 = "abc"; try{
            System.out.println(Integer.parseInt(s2)); }
        catch(NullPointerException e) {
            System.out.print("Better"); }
        catch(NumberFormatException e) {
            System.out.print("The Best"); }

}}