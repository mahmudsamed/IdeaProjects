package day22statticblocksconstructors;
/*
  Consructor nedir ?
  Class dan object uretmemize yarayan code block laridir.

  Class olusturdugunuzda Java bize otomatik olarak bir constuctor verir
  Ama bu consructor gozle gorulmez,gozle gorulmeyen otomatik olarak java tarafindan verilen bu consructor lara
  "default consructor" denir.

  "default consructor" lar " Car(){} " seklindedir

  Siz kendi constructor inizi olusturdugunuzda Java default consructor i siler.

  Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusuturabilirsiniz

  Farkli constructorlar sayesinde bir classdan farkli farkli objeler olusturabiliriz.

  Interview Sorusu: Method ile constructor in farki var midir ? Varsa nedir?
  Cevap: Method ile Constructor farkli yapilardir.
  i) Methodlarda return type vardir ama constructor larda return type yoktur
  ii)Methodlarin ismi yaptiklari ise gore developer lar tarafindan belirlenir
     Constructor larin ismi class ismi ile ayni olmak zorundadir


   */
public class Car {

    String make="Honda";
    String model="Accord";
    int year= 2023;
    boolean hybrid=true;


   public Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }






public Car(String make,String model){
        this.make=make;
        this.model=model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
}


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
