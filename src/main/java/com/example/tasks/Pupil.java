package com.example.tasks;

public class Pupil {
    /**     Exercise 3
     * •	Name
     * •	Surname
     * •	Id
     * •	Age
     * •	Class grade
     */

    String name;
    String surname;
    int id;
    int age;
    int classGrade;

    public Pupil(String name, String surname, int id, int age, int classGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(int classGrade) {
        this.classGrade = classGrade;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", classGrade=" + classGrade +
                '}';
    }
}
