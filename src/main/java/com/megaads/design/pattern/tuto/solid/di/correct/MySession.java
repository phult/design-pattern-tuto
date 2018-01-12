/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.di.correct;

/**
 *
 * @author phuluong
 */
public class MySession implements SessionInterface {

    StorageInterface storage;
    LoggerInterface logger;

    public MySession(StorageInterface storage, LoggerInterface logger) {
        this.storage = storage;
        this.logger = logger;
    }

    @Override
    public void add(String key, String value) {
        this.storage.save();
        this.logger.log("MySession add key: " + key);
    }
}
