package day07_IfStatementsContinue;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 30_000,
                creditScore = 800;
        String result = "";

        if (salary >= 45_000 && creditScore >= 700) {
            //System.out.println("You are eligible for the loan");
            result = "You are eligible for the loan";
        } else {
            //System.out.println("You are not eligible");
            result = "You are not eligible";
        }
        System.out.println(result);

    }
}
/*
    Create a class named - LoanApplication.-
two variables named salary and createdScore are declared and given,
write a program that can check if the person is eligible to apply for a loan
Note:In order to be eligible for a loan:
   1. salary: at least 45K
   2. credit score: at least 700
 */