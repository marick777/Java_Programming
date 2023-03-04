package day16_LoopsContinue;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello "+i);
        }
        System.out.println("-------------------------------------");

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello2 "+i);
        }
        System.out.println("-------------------------------------");

        int j = 0;
        while(j<5){
            System.out.println("Hello3 "+j);
            j++;
        }
        System.out.println("-------------------------------------");

        int k = 0;
        do{
            System.out.println("Hello4 "+k);
            k++;
        }while(k<5);

        System.out.println("-------------------------------------");


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while (score>100||score<0){ // while score is invalid
            System.out.println("Invalid score, please re-enter your score ");
            score = input.nextInt();
        }


        if (score>=60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
