package day37_Exceptions;

public class ExceptionIntro {

    public static void main(String[] args) {


        String str = "Java";

        //char ch = str.charAt(250);

        //System.out.println(ch);

        Pizza pizza = null;
        //pizza.calcCost(); // unchecked exception

        // System.out.println(50/0); // unchecked exception


        System.out.println("Hello world");

        System.out.println("--------------------------------------------------------------------");

        int score = 100;

        if (score > 59) {
            System.out.println("You grade is D");
        } else if (score > 70) {
            System.out.println("You grade is C");
        }

        System.out.println("--------------------------------------------------------------------");


        //FileInputStream file = new FileInputStream(""); //checked exception

        //Thread.sleep(3000); //checked exception
    }
}
