package day06_IfStatements;

public class PozNegZero {

    public static void main(String[] args) {

        int number = 20;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        String result ="";

        if (positive){
            result = "Positive";
        }

        if (negative){
            result = "Negative";
        }

        if (zero){
            result = "Zero";
        }

        System.out.println(result);


    }
}
/*
1. Create a class named PosNegZero.java
    2. An integer variable named number is declared and given,
    Write a program can identify if the number is positive, negative or zero

            Ex:
                number = 20
                output:
                    Positive
 */