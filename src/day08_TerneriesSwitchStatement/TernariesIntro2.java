package day08_TerneriesSwitchStatement;

public class TernariesIntro2 {

    public static void main(String[] args) {

        int number = 100;

        /*String result;
        if (n>0){
            result = "Positive";
        } else if (n<0) {
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
*/
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("---------------------------------------------------------");

        int n =1;

/*
        String day;

        if (n == 1) {
            result = "Monday";
        } else if (n == 2) {
            result = "Tuesday";
        } else if (n == 3) {
            result = "Wednesday";
        } else if (n == 4) {
            result = "Thursday";
        } else if (n == 5) {
            result = "Friday";
        } else if (n == 6) {
            result = "Saturday";
        } else
            result = "Sunday";
    }*/

    String day =(n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday":(n==5)?"Friday"
            :(n==6)?"Saturday":"Sunday";
        System.out.println(day);

        System.out.println("--------------------------------------------------------------");

        int num = 10;

        String month = (number==1)?"Janury":(num==2)?"February":(number==3)?"March":(number==4)?"April":(num==5)?"May"
                :(num==6)?"Jun":(num==7)?"July":(num==8)?"August":(num==9)?"September":(num==10)?"October":(num==11)?"November"
                :"December";

        System.out.println(month);

}
}
