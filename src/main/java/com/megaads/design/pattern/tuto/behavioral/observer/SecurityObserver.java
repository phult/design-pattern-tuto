/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.observer;

/**
 *
 * @author phuluong
 */
public class SecurityObserver implements Observer{

    @Override
    public void update(Subject subject) {
        Account account = (Account) subject;
        System.out.println("Authorizing " + account.getEmail());
    }
    
}
