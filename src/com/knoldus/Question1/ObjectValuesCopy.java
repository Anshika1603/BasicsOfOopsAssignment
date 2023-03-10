package com.knoldus.Question1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ObjectValuesCopy {
    public static void main(String[] args) {
        // Create an object of Person class
        Person person1 = new Person("John", 25);

        // Create another object of Person class
        Person person2 = new Person("", 0);

        // Copy the values from person1 to person2
        person2.setName(person1.getName());
        person2.setAge(person1.getAge());

        // Display the values of both objects
        System.out.println("Person1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person2: Name = " + person2.getName() + ", Age = " + person2.getAge());
    }
}

