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
public class CPU {

    public void freeze() {
        System.out.println("CPU's freezing");
    }

    public void jump(long position) {
        System.out.println("CPU's jumping");
    }

    public void execute() {
        System.out.println("CPU's execute");
    }
}
