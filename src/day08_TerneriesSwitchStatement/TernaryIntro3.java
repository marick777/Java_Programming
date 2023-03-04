package day08_TerneriesSwitchStatement;

public class TernaryIntro3 {

    public static void main(String[] args) {

/*        int score = 75;

        if (score>=0 && score<=100){ // if the score is valid

            if (score>=60){ // if the score is greater or equal to 60
                System.out.println("Passed");
            }else{ // if the score is less than 60
                System.out.println("Failed");
            }

        }else { // if the score is not valid
            System.out.println("Invalid Score");
        }*/

        int score = 130;
      /*  String result;
        if (score >= 0 && score <= 100) { // if the score is valid
            if (score >= 60) { // if the score is greater or equal to 60
                result = "Passed";
            } else { // if the score is less than 60
                result = "Failed";
            }
            }else{ // if the score is less than 60
                result = "Failed";


        }
        System.out.println(result);

        */

        String result = (score >= 0 && score <= 100)?
                        (score >= 60)?"Passed":"Failed"

                :"Invalid";

        System.out.println(result);

        System.out.println("----------------------------------------------------------");

        int n = 5;
        String s = "No such a day";
        String day = (n>=1 && n<=12)?
                (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday":(n==5)?"Friday"
                        :(n==6)?"Saturday":"Sunday"
                : "No such a day";

        System.out.println(day);
    }
}