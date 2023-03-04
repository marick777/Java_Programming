package day04_concatenations;

public class CarInfo {

    public static void main(String[] args) {

        String  year = "2018",
                make = "Toyota",
                model = "Camry",
                miles = "50000 miles",
                color = "Red",
                price = "$19000";

        System.out.println("Car information is:\n\t" + year + " " + make + " " + model + ", " + miles + ", "
                + color + ", " + price);

    }
}
/*
Create a class named CarInfo.java
 Declarethefollowingvariables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
    Ex:
Car information is :
    2018 Toyota Camry, 50000 miles, Red, $19000.
 */