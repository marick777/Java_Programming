package day12_CustomMethodsIntro;

public class CustomMethodPractice {
    public static void main(String[] args) {

        maxNum(10000, 50000);
        maxNum(10.5, 20.5);
        maxNum(-25.3, -125.8);

        System.out.println("--------------------------------------------------------");

        initial("Mohamed", "Karim");

        System.out.println("--------------------------------------------------------");

        initial("Hasan", "Ayahan");




    }
// create a method that can print the maximum number between two numbers,
// if both are equal then it prints "Equal", (num1, num2)

    public static void maxNum(double num1, double num2){

        if(num1>num2){
            System.out.println(num1+" is maxumum number");
        }else if(num2>num1){
            System.out.println(num2+" is maximum number");
        }else{
            System.out.println("Equal");
        }
    }

//Create a method that can display the initials of a person  (firstName, lastName)

        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */

    public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initial is: "+initial );

    }




}

// create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)


//Create a method that can display the initials of a person  (firstName, lastName)

        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */

// create a method that can check if person is eligible to buy alcohol(age)


// create a method that can check if a number is odd or even or zero(number)


// create a method that can calculate the grade of the student(score)