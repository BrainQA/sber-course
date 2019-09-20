package ru.sberbank.matorinCourse.ru.sberbank;

public class Main {
    public static void main(String[] args) {
        Person marya = new Person(18, "Мария", Gender.WOMAN, null);
        Person ivan = new Person(18, "Иван", Gender.MAN, null);
        System.out.println(marya.marry(ivan));
        Person dasha = new Person(21, "Даша", Gender.WOMAN, null);
        Person ilya = new Person(33, "Илья", Gender.MAN, null);
        System.out.println(dasha.marry(ilya));
        System.out.println(ivan.marry(dasha));
    }
}
