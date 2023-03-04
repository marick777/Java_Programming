package day09_SwitchContinue_Scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // takes Enter from line 8

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = "+age);
        System.out.println("Full name = "+full_name);
    }
}
