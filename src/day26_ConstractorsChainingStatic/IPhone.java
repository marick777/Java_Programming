package day26_ConstractorsChainingStatic;

public class IPhone {

    public static String brand = "Apple";// static: "Apple" is the brand of all the Iphone objects

    public String model;// instance: different models for iPhone objects

    public String color;//instance: different colors for iPhone objects

    public double price;//instance: different price for iPhone objects

    public static String OS = "iOS";// static: "iOS" is same for all iPhone objects

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    /*
    public static void printPhoneInfo(){ // static only accepts static
        System.out.println(model);
        System.out.println(color);
    }


     */

    public void printPhoneInfo(){//instance methods accepts both static and none static
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: "+OS);
    }

}
/*
Attributes:
        brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */