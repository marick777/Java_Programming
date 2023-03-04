package utilites;

import day27_StaticAccessModifiers.AccessModifiers;
import day27_StaticAccessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(AccessModifiers.publicData);

//      System.out.println(AccessModifiers.protectedData);

//      System.out.println(AccessModifiers.defaultData);

 //     System.out.println(AccessModifiers.privateData);

        new AccessModifiers();

        AccessModifiers.publicMethod();
        //AccessModifiers.protectedMethod();
        //AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();







    }



}
