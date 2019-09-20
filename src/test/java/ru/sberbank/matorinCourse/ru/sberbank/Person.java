package ru.sberbank.matorinCourse.ru.sberbank;

public class Person {

    private int age;
    private String name;
    private Gender gender;
    private Person spouse;

    public Person(int age, String name, Gender gender, Person spouse) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.spouse = spouse;
    }

    public boolean marry(Person person) {
        if (this.gender != person.gender && this.age >= 18 && person.age >= 18) {
            if (spouse != null) {
                System.out.println(divorce());
            }
            spouse = person;
            return true;
        }
        return false;
    }

    public boolean divorce() {
            spouse = null;
            return true;
    }
}
