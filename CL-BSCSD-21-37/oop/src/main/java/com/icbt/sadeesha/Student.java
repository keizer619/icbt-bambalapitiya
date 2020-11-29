package com.icbt.sadeesha;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2020-11-29
 */
public class Student extends Person {

    private String id;

    public Student(String id, String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String toString() {
        return id + " : " + super.getFullName();
    }
}
