/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.di.correct;

/**
 *
 * @author phuluong
 */
public class DBStorage implements StorageInterface {
    
    @Override
    public void save() {
        System.out.println("Saving with DBStorage");
    }
}
