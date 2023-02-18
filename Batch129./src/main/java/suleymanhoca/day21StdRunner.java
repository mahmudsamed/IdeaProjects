package suleymanhoca;

public class day21StdRunner {
    public static void main(String[] args) {

        //day21 static oldugundan ona ulasmak icin object  olusturmadi
        //sadece class ismini kullanmak yeterlidir
        System.out.println(day21statickeywordstudent.stdName);

        //age non static oldugundan ona ulasmak icin object olsuturmak zorundayiz
        day21statickeywordstudent std1=new day21statickeywordstudent();

        System.out.println(std1.age);

        day21statickeywordstudent std2=new day21statickeywordstudent();

        System.out.println(day21statickeywordstudent.getInitials("cem karaca"));

       String initials =day21statickeywordstudent.getInitials("Tom Cruise");
        System.out.println(initials);

      int vowels=  std1.countVowels("Cem Karaca");
        System.out.println(vowels);






    }
}
