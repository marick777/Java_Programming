package day32_OOP_finalKeyword;

import java.time.LocalDate;

class Student{

    public final void language(){
        System.out.println("Java Programming");
    }

}

public final class FinalKeyword extends Student{
/*
    public void language(){  // final method can never be overridden
        System.out.println("Python Programming");
    }
 */

    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender); // M

       // gender = 'F';

        System.out.println(gender); // F

        System.out.println("------------------------------------------------------------");

        final LocalDate DOB = LocalDate.now();

        System.out.println(DOB);

        //DOB = DOB.plusYears(1);

        System.out.println(DOB);

        System.out.println("------------------------------------------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("------------------------------------------------------------");

        final String name = "James";
        //name = null;
        //name = "Daniel";

        System.out.println(name);
    }
}
