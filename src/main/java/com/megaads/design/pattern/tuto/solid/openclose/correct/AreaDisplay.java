/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.openclose.correct;

import com.megaads.design.pattern.tuto.solid.openclose.mistake.*;

/**
 *
 * @author phuluong
 */
public class AreaDisplay {

    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
