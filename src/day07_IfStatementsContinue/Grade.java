package day07_IfStatementsContinue;

public class Grade {

    public static void main(String[] args) {

        char grade ='B';

        String result ="";

        if (grade =='A'){
            result = "Excelent";
        }
        if (grade =='B'){
            result ="Great job";
        }
        if (grade =='C'){
            result = "Good";
        }
        if (grade =='D'){
            result = "Passed";
        }
        if (grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);
    }
}
