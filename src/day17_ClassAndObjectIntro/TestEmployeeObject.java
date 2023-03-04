package day17_ClassAndObjectIntro;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A123");

        Employee employee2 = new Employee();
        employee2.setInfo("Vitea", 33, 'M', "BOSS", 123000, "B123");

        Employee employee3 = new Employee();
        employee3.setInfo("Kira", 25, 'F', "BA", 135000, "C321");

        employee2.age = 39;
        employee3.name = "Lucy";
        employee3.gender = 'F';

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }
}
