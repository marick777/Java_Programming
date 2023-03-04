package day11_StringContinue;

public class StringMathods3 {

    public static void main(String[] args) {


        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        //--------------------------------------------------------------------------------------------------------

        String str = "           ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " +r2);
        System.out.println("r3 = " +r3);

        //--------------------------------------------------------------------------------------------------------

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));

        //--------------------------------------------------------------------------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        //--------------------------------------------------------------------------------------------------------

        String students = "Hasan Naran Sumeve Nataliia";

        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        //--------------------------------------------------------------------------------------------------------

        String name = "Michael";
        boolean l = name.startsWith("Da");
        System.out.println("l = " + l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");
        System.out.println("isValid = " + isValid);

        boolean t = url.endsWith(".com");
        System.out.println("t = " + t);

        //--------------------------------------------------------------------------------------------------------

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);



    }
}
