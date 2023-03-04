package day36_OOP_PolimorphismContinue;

public class Circle {
    private double radius;

    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // if the specified object is not Circle, then we should not compare them

        if(!(obj instanceof Circle)){
            System.err.println("Invalid Object");
            System.exit(1);
        }

        if(this.radius == ((Circle)obj).radius){ // if current radius is equals to given circles radius, then two circles are equal
            return true;
        }
        return false;
    }
    // ==
    // .equals()



}
