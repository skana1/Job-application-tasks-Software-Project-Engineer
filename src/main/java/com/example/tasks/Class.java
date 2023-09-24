package com.example.tasks;

import java.util.ArrayList;

public class Class {
    //Exercise 3
    ArrayList<Pupil> pupils;

    String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Class(String className) {
        this.pupils =new ArrayList<Pupil>();
        this.className = className;
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }

    public void addPupil(ArrayList<Pupil> pupils){

        this.pupils.addAll(pupils);
    }

    @Override
    public String toString() {
        return "Class{" +
                "pupils=" + pupils +
                '}';
    }
}
