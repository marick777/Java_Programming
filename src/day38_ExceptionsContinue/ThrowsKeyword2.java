package day38_ExceptionsContinue;

import java.io.FileInputStream;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException{


        method1();
    }




    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);

    }


    public static void method1() throws InterruptedException{
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2()throws Exception{

        System.out.println("First program started");

        Thread.sleep(5000);

        System.out.println("First program ended");

        new FileInputStream("");

        Thread.sleep(5000);
    }

}
