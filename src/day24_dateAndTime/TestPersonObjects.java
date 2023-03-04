package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Vitea", 'M', LocalDate.of(1999,5,6));
        people[2].setInfo("Valea", 'F', LocalDate.of(1995, 2, 5));
        people[3].setInfo("Fazilat", 'F', LocalDate.of(1985, 11, 15));
        people[4].setInfo("Valera", 'M', LocalDate.of(2005, 8,12));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        System.out.println(people[0]);
        System.out.println(people[1]);



        // print name & date of birth of each person object


        // remove all the person object that has the age > 55


    }

}
