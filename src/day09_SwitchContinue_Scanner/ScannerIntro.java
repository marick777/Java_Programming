package day09_SwitchContinue_Scanner;

import java.util.Scanner;

//import java.util.*;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // for reading users input
        System.out.println("Enter you first number: ");
        byte num1 = input.nextByte();
        System.out.println("Enter you second numder: ");
        short num2 = input.nextShort();
        System.out.println("Enter your third number:");
        int num3 = input.nextInt();
        System.out.println("Enter you fourth number");
        long num4 = input.nextLong();

        input.close();// scanner is closed, can not read user inputs agian





        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number: "+num4);

    }
}
