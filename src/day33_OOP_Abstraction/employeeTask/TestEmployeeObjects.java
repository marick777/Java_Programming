package day33_OOP_Abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        //Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 95000);
            //We can not create object from an abstract class, Object MUST be created from a concrete class

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");

        Tester tester = new Tester("Vivian", 28, 'F', "D1", "SDET", 120000);

        Driver driver = new Driver("Aaron", 48, 'M', "E1", "Truck Driver", 90000);


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("--------------------------------------------------------------------------------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();
    }
}
