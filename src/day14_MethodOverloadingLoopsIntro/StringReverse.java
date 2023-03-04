package day14_MethodOverloadingLoopsIntro;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Cydeo School";
        //            0123

        //"avaJ"

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);

        System.out.println("------------------------------------------------------------------------------------------");

        String name = "Cydeo School";
        String result = reverse(name);

        System.out.println(result);
    }


    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of given string revers order
        for (int i = str.length() - 1; i >= 0; i--) {// to get index numbers if the given string starting from last index
            // to index 0
            reverse += str.charAt(i);// to get each character of the string starting from the last index to index zero
        }

        return reverse;
    }



}
