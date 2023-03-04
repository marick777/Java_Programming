package day27_StaticAccessModifiers;

public class InstanceBlock {

    {
        System.out.println("Instance block");
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();


    }
}
