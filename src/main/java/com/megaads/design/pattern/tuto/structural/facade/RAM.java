/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.structural.facade;

/**
 *
 * @author phuluong
 */
public class RAM {

    public void load(long position, byte[] data) {
        System.out.println("HDD's loading");
    }
}
