package day07_IfStatementsContinue;

public class MultiBranchIF {

    public static void main(String[] args) {

        int number = 100;

        String result = "";

        if (number > 0) {
            result = "Positive";
        }
        if (number < 0) {
            result = "Negative";
        }
        if (number == 0) {
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------");

        String resul2 = "";

        if (number>0){
            resul2 = "Positive";
        }else if (number<0){
            resul2 = "Negative";
        }else{
            resul2 = "Zero";
        }
        System.out.println(resul2);

    }
}
