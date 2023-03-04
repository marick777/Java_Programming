package day08_TerneriesSwitchStatement;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {


        int score = 123;
        String result = "Your grade is: ";
/*
        if (score >= 90) { //false: score <90
            result += "A";
        } else if (score >= 80) { //false: score <80
            result += "B";
        } else if (score >= 70) { // false: score <70
            result += "C";
        } else if (score >= 60) { //false: score <60
            result += "D";
        } else // score<60
            result += "F";

        System.out.println(result);


    }
}

 */

        if (score >= 0 && score <= 100) {
            if (score >= 90) { //false: score <90
                result += "A";
            } else if (score >= 80) { //false: score <80
                result += "B";
            } else if (score >= 70) { // false: score <70
                result += "C";
            } else if (score >= 60) { //false: score <60
                result += "D";
            } else // score<60
                result += "F";
        }

            //-------------------------------------------------------------------------------


        int number = 14;
        String month = ""; //1~12 Jan~Dec




    }

}
