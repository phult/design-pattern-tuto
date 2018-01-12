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
public class App {

    public static void main(String[] args) {
        Observer securityObserver = new SecurityObserver();
        Observer emailObserver = new EmailObserver();
        
        Account account = new Account();
        account.attach(securityObserver);
        account.attach(emailObserver);
        account.login("bill@gmail.com", "123456");
        
        
        account.detach(emailObserver);
        account.login("gate@gmail.com", "123456");
    }
}
