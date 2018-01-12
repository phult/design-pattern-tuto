/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuluong
 */
public class Subject {

    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify_() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
