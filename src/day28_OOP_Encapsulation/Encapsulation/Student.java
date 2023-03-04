package day28_OOP_Encapsulation.Encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false, hasSpecialChar = false;

        for(char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

            if(hasDigit){
                System.err.println("Invalid name: "+name);
                System.exit(1);
            }

        this.name = name;
    }

    public int getAge(){ // READ ONLY

        if(age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age){ // WRITE ONLY
        if(age<30 || age>100) {
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }





}
