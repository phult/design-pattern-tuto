/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.eventListener;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        Button button = new Button();
        // create event listener
        JSEventListener jsEventListener = new JSEventListener();
        button.addEventListener("hover", jsEventListener);
        button.addEventListener("click", jsEventListener);
        // fire event
        button.fireEvent("hover", null);
        button.fireEvent("click", null);
        button.fireEvent("drag", null);
    }
}
