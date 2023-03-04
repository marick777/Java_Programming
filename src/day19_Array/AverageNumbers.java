package day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum = 0;

        for (int i = 0; i < total; i++) {

            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double averege = sum/(double)total;

        DecimalFormat df = new DecimalFormat("0.000");


        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = "+ sum);
        System.out.println("averege = "+df.format(averege));
    }
}
/*
5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */