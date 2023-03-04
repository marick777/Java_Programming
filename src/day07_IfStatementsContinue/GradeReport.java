package day07_IfStatementsContinue;

public class GradeReport {

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

            System.out.println(result);

        } else
            System.out.println("Invalid Score");
    }
}

        /*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given,
Write a program that can print the grade of the student
                            Ex:
                                score = 95
                            output:
                                Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */