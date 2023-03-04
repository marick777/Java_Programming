package day27_StaticAccessModifiers;

public class AccessModifiers {

    public static  int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400;

    private static int privetData = 500;

    public AccessModifiers(){
        System.out.println("Public");
    }

    public static void publicMethod(){
        System.out.println("public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");
    }

    static void defaultMethod(){
        System.out.println("default");
    }

    private static void privateMethod(){
        System.out.println("private");
    }






    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privetData);

        new AccessModifiers();
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
