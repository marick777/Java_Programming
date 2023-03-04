package day28_OOP_Encapsulation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        //student.age = -200;

        //System.out.println(student.age);
        student.setAge(45);

        System.out.println(student.getAge());

        System.out.println("Age is: "+student.getAge());

        //student.name = "Aaron";
        student.setName("Aaron");

        System.out.println(student.getName());




    }
}
