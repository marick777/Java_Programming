package day19_Array;

public class MInNumber {
    public static void main(String[] args) {

        int[] numbers = {100,20,500,40,-10,30};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i]<min){
                min = numbers[i];
            }

        }

        System.out.println("min = "+min);


    }
}
/*
Write a program that can find the minimum number from an array

 */