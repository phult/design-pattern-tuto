/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.singleresponsibility.mistake;

/**
 *
 * @author phuluong
 */
public class Student {

    private String name;
    private int age;

    public String getInfoInText() {
        return "Name: " + name + ", Age: " + age;
    }

    public String getInfoInJSONString() {
        return "{"
                + "name: " + name + ","
                + "age: " + age + ","
                + "}";
    }

    public void saveToFile() {
        System.out.println("Saved to file");
    }

    public void saveToDB() {
        System.out.println("Saved to database");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
