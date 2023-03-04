package day07_IfStatementsContinue;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 75;

        if (score>=0 && score<=100){ // if the score is valid

            if (score>=60){ // if the score is greater or equal to 60
                System.out.println("Passed");
            }else{ // if the score is less than 60
                System.out.println("Failed");
            }

        }else { // if the score is not valid
            System.out.println("Invalid Score");
        }
        System.out.println("--------------------------------------------------------");

        int age = 222; //1~150

        if (age>=1&&age<=150){

            if (age>=21){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
            }



        }else {
            System.out.println("Invalid age");
        }







    }
}
