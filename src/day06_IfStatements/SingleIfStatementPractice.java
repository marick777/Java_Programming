package day06_IfStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {
        int number = 100;

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println(number + " Even number");
        }

        if (!isEven) {
            System.out.println(number + " Odd number");
        }

        System.out.println("-------------------------------------------------------");

        if (number % 2 == 0) {
            System.out.println(number + " Even number");
        }

        if (number % 2 != 0) {
            System.out.println(number + " Odd number");
        }
    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */