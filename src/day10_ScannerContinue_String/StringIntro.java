package day10_ScannerContinue_String;

import java.util.Scanner;
import java.lang.String; // present already
import java.lang.System; // present already

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();

        input.close();


        System.out.println("-------------------------------------------------------");


        String st1 = "Cat";
        String st2 = "Dog";

        String st3 = "Cat";
        String st4 = "Cat";

        System.out.println(st1 == st3);
        System.out.println(st1 == st4);
        System.out.println(st3 == st4);


        System.out.println("-------------------------------------------------------");


        String s1 = new String("Java"); // Creates two objects: 1. String pool, 2. in heap (outside string)

        String s2 = new String("Java");

        System.out.println(s1 == s2);


        System.out.println("-------------------------------------------------------");


        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);
        System.out.println(t3 == t2);


    }
}
