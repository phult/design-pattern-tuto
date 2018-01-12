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
public class Account extends Subject {    

    private String email;
    
    public void login(String email, String password) {
        // do something
        this.email = email;
        // notity to observers
        this.notify_();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
}
