package laba7.task;

import java.io.*;

public class Task8 {
    public static void main(String[] args) {
        Person person = new Person("Abc", 12);

        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("src/main/java/laba7/person.json"));
            objectOutputStream.writeObject(person);
            System.out.println("Объект записан в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("src/main/java/laba7/person.json"));
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("Объект восстановлен");
            System.out.println(person1.getName() + " " + person1.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
