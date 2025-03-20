package laba2;

public class Task4 {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Male", 22);
        Person person2 = new Person();

        person2.setName("Andrey");
        person2.setGender("Male");
        person2.setAge(23);

        person1.getInfo();
        person2.getInfo();
    }
}

class Person {
    String name;
    String gender;
    int age;

    public Person() {

    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Имя: " + name + "\nПол: " + gender + "\nВозраст: " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
