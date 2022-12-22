package Homework6.Name_;

public interface Nameable {
    String getName();
}

class Dog_name implements Nameable {
    int age;
    String name;
    String breed;
    public Dog_name(int age, String name, String breed ){
        this.age=age;
        this.name=name;
        this.breed = breed;
    }

    @Override
    public String getName() {
        return name;
    }
}