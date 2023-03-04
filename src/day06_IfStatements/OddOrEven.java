package day06_IfStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 45;

        boolean isEaven = number % 2 == 0; //when we devide a number by 2, if the remainder is 0, means the number is EVEN

        //boolean isOdd = number % 2 != 0; //when we devide a number by 2, if the remainder is NOT 0, means the number is ODD

        boolean isOdd = !isEaven; // if the number is not EVENT it's ODD

        System.out.println(number + " is an even number: " + isEaven);
        System.out.println(number + " is an odd number: " + isOdd);


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