package day25_dateAndTimeConstructorsIntro;

import java.time.LocalDate;

public class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Kiril", 33, 'M', LocalDate.of(1989, 11,12), true,false);

        System.out.println(p1);
    }
}
