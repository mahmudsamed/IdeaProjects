package suleymanhoca.day29exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
/*
  "throw" ile "throws" keyword'leri arasindaki fark nedir?
  1)"throw" method body'si icinde, "throws" ise method parantezinden hemen sonra kullanilir.
  2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir.
     "throws" ise method parantezinden hemen sonra sadece bir kere kullanilabilir.
  3)"throw" dan sonra "new" keyword ve constructor kullanilarak object olusturulur.
    "throws" dan sonra sadece "Exception Class" ismi yazilir.
  4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra
     durdurur.
 */
        try {
            printAge(-12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    //
        try {
            getMark(900);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
     // throw keyword bir methodun bodysi icinde istedigimiz yerde istedigimiz kosullar icin istedigimiz kadar icin  Exception atmamizi saglar
    //throw keyword yazildiktan sonra bir exception class objecti olusturulur
    //Exception Class construction inin parantezi icine istediginiz Exception Mesajdaini yazabilirsiniz
    public static void printAge(int age) {

        if (age<0){
            throw new IllegalArgumentException("Age can not be negative");


        }else {
            System.out.println(age);
        }

    }
//Ogrenci notlari girisini yapan ve notu console a yazdiran method olusturunuz

    public static void getMark(double d){

        if (d<0){
            throw new IllegalArgumentException("Marks can not be less than zero");
        } else if (d>100) {
            throw new IllegalArgumentException("Marks can not be bigger than hundred");

        }else {
            System.out.println(d);
        }
        System.out.println(d);
    }

}
