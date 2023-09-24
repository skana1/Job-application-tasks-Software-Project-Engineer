package com.example.tasks;

public class Teacher {
    /**     Exercise 3
     * •	Name
     * •	Surname
     * •	Subject
     * •	Class Custody (ownership)
     */

    String name;
    String surname;
    String subject;
    Class classCustody;

    public Teacher(String name, String surname, String subject, Class classCustody) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.classCustody = classCustody ;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Class getClassCustody() {
        return classCustody;
    }

    public void setClassCustody(Class classCustody) {
        this.classCustody = classCustody;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", classCustody=" + classCustody +
                '}';
    }
}
