package day34_OOP_Interface.animalTask;

public class Dog extends Animal implements Playable, Swimmable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog food");
    }

    @Override
    public void play() {
        System.out.println("Dog "+getName()+" is playable");
    }

    @Override
    public void swim() {
        System.out.println("Dog "+getName()+" is swimming");
    }
}
