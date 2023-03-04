package day32_OOP_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);

        System.out.println("------------------------------------------------------------------------------------");

        Employee employee = new Employee("Emely", 'F', LocalDate.of(1989, 2, 5), "Acounter", 95000);

        System.out.println(employee);

        employee.breath();

        System.out.println("------------------------------------------------------------------------------------");

        Student student = new Student("Josh", 'M', LocalDate.of(1999, 2, 9),'B');

        System.out.println(student);

        student.eat();

    }
}
