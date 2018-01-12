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
public class MegaLogger implements LoggerInterface{

    @Override
    public void log(String msg) {
        System.out.println("MegaLogger: " + msg);
    }
    
}
