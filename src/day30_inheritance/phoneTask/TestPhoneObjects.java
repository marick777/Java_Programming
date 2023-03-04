package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("12 Pro","Max", "Black", 1200);
        Samsung samsung = new Samsung("S22", "Ultra", "Gold", 1350);
        Nokia nokia = new Nokia("3310", "Small", "White", 123);


        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(12345);
        samsung.text(12345);
        nokia.text(12345);

        System.out.println("---------------------------------------------------------------");

        iphone.faceTime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);













    }
}
