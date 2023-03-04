package day15_LoopsContinue;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = ""; // "abc"

        for (int i = 0; i < str.length(); i++) { //i: index number of str
            //System.out.println(str.charAt(i));

            char each = str.charAt(i);

            if (!result.contains("" + each)) { // if the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            // if the character is not contains yes in the new string, then will add it to new string
        }

        System.out.println(result);




    }
}
/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */
