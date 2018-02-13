package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String headWare;
    private String eyeWare;
    private String phoneNumber;
    private String sex;
    private boolean isPerson;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
    this.age = age;
    }

    public Person(String name) {
    this.name = name;
    }

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public Person(String name, int age, String headWare, String eyeWare, String phoneNumber, String sex, boolean isPerson) {
        this.name = name;
        this.age = age;
        this.headWare = headWare;
        this.eyeWare = eyeWare;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.isPerson = isPerson;
    }

    public String getHeadWare() {
        return headWare;
    }

    public void setHeadWare(String headWare) {
        this.headWare = headWare;
    }

    public String getEyeWare() {
        return eyeWare;
    }

    public void setEyeWare(String eyeWare) {
        this.eyeWare = eyeWare;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isPerson() {

        return true;
    }

    public void setPerson(boolean person) {
        isPerson = person;
    }

    public void setName(String name) {
    this.name = name;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
