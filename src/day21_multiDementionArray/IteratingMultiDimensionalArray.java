package day21_multiDementionArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        // index of element         0   1   2    0    1   2   3   4     0   1
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}}; // index: 0 ~ 2
        // index:                      0                  1               2

        for (int i = 0; i < arr2D.length; i++) { // i: index number of 1D array in arr2D
            int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) { // j: index num of elements in each1D array of arr2D

                int eachElement = each1D[j];

                System.out.println(eachElement);

            }

        }

        System.out.println("------------------------------------------------------------------------------");

        for (int[] each1D : arr2D) {
            System.out.println(Arrays.toString(each1D));

            for (int eachElement : each1D) {
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("------------------------------------------------------------------------------");


        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }



    }
}
