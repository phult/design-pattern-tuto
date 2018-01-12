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
public class Storage {

    public void saveToFile(Student student) {
        System.out.println("Saved to file");
    }

    public void saveToDB(Student student) {
        System.out.println("Saved to database");
    }
}
