package day17_ClassAndObjectIntro;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if (str.charAt(i) == ch){ // if the ch has appeared in str
                    frequency++; // increase the frequency by 1
                }
            }

            if (frequency == 1){ // if the frequency is one, than it's unique
                unique +=ch;
            }

        }
        System.out.println(unique);




    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */