package day16_LoopsContinue;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "cccccaccabbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {// i: index number of str

            if (str.charAt(i) == ch){ // if character of the string is equal to given character
                count++;
            }

        }

        System.out.println(count);


    }
}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */
