package day19_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        int score1 = 85;
        int score2 = 85;
        int score3 = 85;
        int score4 = 85;
        int score5 = 85;

        System.out.println("-------------------------------------------------");

        int[] scores = new int[5];
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 88;
        scores[3] = 89;
        scores[4] = 95;
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]);

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("------------------------------------------------------");

        System.out.println(scores[scores.length-1]);



    }
}
