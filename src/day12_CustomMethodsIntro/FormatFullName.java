package day12_CustomMethodsIntro;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String first = input.nextLine().trim().replace(" ", "");
            // trim() & replace() methods will make sure that the white spaces and
                  // additional spaces between the characters will be removed

        System.out.println("Enter last name:");
        String last = input.nextLine().trim().replace(" ", "");
        input.close();

        //String first = "cyDEo";
        //String last = "SCHOOL";

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // "C" | getting first character of first name + remaining characters of firs name
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        // "S" | getting first character of last name + remaining characters of last name

        String fullName = first + " " + last;

        System.out.println("fullName = " + fullName);

    }
}
/*
Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */