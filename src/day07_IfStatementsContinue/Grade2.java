package day07_IfStatementsContinue;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'B';

        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Greate Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);

    }

}
