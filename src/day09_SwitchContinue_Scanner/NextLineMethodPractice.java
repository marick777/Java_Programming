package day09_SwitchContinue_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Enter+Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();//Aaron King Daniel + Enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();//Cydeo School + Enter

        System.out.println("Enter your gander: ");
        String gender = input.next(); //Male + Enter(goes in Systen.in)

        System.out.println("Enter your age: ");
        int age = input.nextInt();//28 + Enter(goes in Systen.in)

        input.nextLine();// Clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method
                         // after the others methods of scanner

        System.out.println("Enter your street name:");
        String street = input.nextLine();


    }
}
