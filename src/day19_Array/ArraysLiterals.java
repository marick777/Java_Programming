package day19_Array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1,2,3,4,5};


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------");


        // elements:        1        2           3           4          5          6           7
        String[] days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        //index:            0        1           2           3             4        5          6

        int n = 1;

        System.out.println(days[n-1]);

        System.out.println("--------------------------------------------------------");


        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug","Sep", "Oct", "Nov", "Dec"};

        /*
        month = new String[12];
        month[0] = "Jan";
        ...

         */
        System.out.println("Month = " + Arrays.toString(month));

        System.out.println("--------------------------------------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }



    }



}
