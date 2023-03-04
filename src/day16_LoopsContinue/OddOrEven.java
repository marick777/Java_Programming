package day16_LoopsContinue;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number%2==0){
                System.out.println(number+ " even number");
            }else {
                System.out.println(number+ " odd number");
            }

            System.out.println("Would you to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no")) ){// while the user provides invalid answer
                System.err.println("Invalid Entry! Would you to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }


        }



    }
}
