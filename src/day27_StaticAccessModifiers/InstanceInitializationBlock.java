package day27_StaticAccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;
/*
    {
        name = "James";
        age = 20;
    }


 */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Vitea", 25);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Petea", 33);

        System.out.println(obj1.name);

        System.out.println(obj2.name);
    }
}
