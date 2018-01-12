/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.singleresponsibility.correct;

/**
 *
 * @author phuluong
 */
public class Formatter {

    public String getInfoInText(Student student) {
        return "Name: " + student.getName() + ", Age: " + student.getAge();
    }

    public String getInfoInJSONString(Student student) {
        return "{"
                + "name: " + student.getName() + ","
                + "age: " + student.getAge() + ","
                + "}";
    }
}
