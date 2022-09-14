package com.veer.kafka.consumer.model;

public class User {

    private String name;
    private String dept;
    private int age;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public User() {
    }

    public User(String name, String dept, int age, boolean active) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
