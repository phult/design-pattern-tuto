/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.proxy;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        //Image image = new ProxyImage("image.jpg");
        Image image = new RealImage("image.jpg");
        //image will be loaded from disk
        image.display();
        //image will not be loaded from disk
        image.display();
    }
}
