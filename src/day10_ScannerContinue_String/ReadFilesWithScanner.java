package day10_ScannerContinue_String;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_ScannerContinue_String/Test.txt"));


/*      LINE BY LINE
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
*/

        // WORD BY WORD
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());

        scan.close();


    }
}
