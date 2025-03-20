package laba2;

public class Task8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 10, "Мопс");
        Bird bird = new Bird("Пират", 2, true, 20);
        Animal animal = new Animal("Бобик", 6);

        animal.displayInfo();
        animal.sound();

        dog.displayInfo();
        dog.sound();

        bird.displayInfo();
        bird.sound();
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println(name + " издает звук");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + " Возраст: " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println(name + " Лает");;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }
}

class Bird extends Animal {
    boolean abilityToFly;
    int wingspan;

    public Bird(String name, int age, boolean abilityToFly, int wingspan) {
        super(name, age);
        this.abilityToFly = abilityToFly;
        this.wingspan = wingspan;
    }

    @Override
    public void sound() {
        System.out.println(name + " Чирикает");;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размах крыльев: " + wingspan + " Может летать: " + abilityToFly);
    }
}