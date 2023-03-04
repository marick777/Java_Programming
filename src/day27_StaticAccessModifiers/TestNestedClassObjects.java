package day27_StaticAccessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {

        Car obj1 = new Car(); // Car Object

        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
    }
}
