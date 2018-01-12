/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.openclose.mistake;

/**
 *
 * @author phuluong
 */
public class AreaDisplay {

    public void printArea(Shape shape) {
        double area = 0;
        if (shape.getName().equalsIgnoreCase("circle")) {
            Circle circle = (Circle) shape;
            area = Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape.getName().equalsIgnoreCase("square")) {
            Square square = (Square) shape;
            area = square.getHeight() * square.getHeight();
        }
        System.out.println("Area: " + area);
    }
}
