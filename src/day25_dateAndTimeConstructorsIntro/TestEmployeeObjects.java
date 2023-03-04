package day25_dateAndTimeConstructorsIntro;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Vitea", 25, 'M', "Boss", 120000, LocalDate.of(2022, 12, 2));

        Employee e2 = new Employee("Stepa", 30, 'M', "SDET", 140000, LocalDate.of(2021,11,15));



        System.out.println(e1);
        System.out.println(e2);


    }
}
