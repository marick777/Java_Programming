package day27_StaticAccessModifiers;

public class StaticBlock {

    public StaticBlock() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Block");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

}
