package day16_LoopsContinue;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String user = input.next().toLowerCase();
        System.out.println("Enter you password:");
        String password = input.next().toLowerCase();

        if (user.equals("cydeo") && password.equals("woodenspoon")){ // if the credentials are correct
            System.out.println("Logged in");
        }else{ // otherwise

            for (int i = 0; i < 3; i++) {
                if (i !=2) {
                    System.err.println("Incorrect username and password.Please re-enter");
                }else{
                    System.err.println("This is your last chance.\nPlease re-enter username and password");
                }

                System.out.println("Enter your username:");
                user = input.next().toLowerCase();
                System.out.println("Enter you password:");
                password = input.next().toLowerCase();

                if (user.equals("cydeo") && password.equals("woodenspoon")){ // if user enters valid credentials
                    System.out.println("Logged in");
                    break; // exits the loop
                }
            }

            if (! (user.equals("cydeo") && password.equals("woodenspoon"))){
                System.err.println("Your account is locked.\n Please contact support team");

            }

        }


    }
}
/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */