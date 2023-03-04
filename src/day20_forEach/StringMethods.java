package day20_forEach;

import utilites.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Sydeo School";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------------------------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------------------------");

        String sentence = "Today is a great day";

        sentence.split(" "); // [I, love, Java]

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));

        String revercedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            revercedSentence += arr[i] + " ";
        }

        System.out.println(revercedSentence);






    }

}
