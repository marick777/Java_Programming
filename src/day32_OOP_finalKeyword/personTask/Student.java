package day32_OOP_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person{

    private char grade;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", ") +
                "grade=" + grade +
                '}';
    }
}

