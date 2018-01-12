/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.di.correct;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        // method 1
        SessionInterface mysession = new MySession(new FileStorage(), new MegaLogger());
        mysession.add("key", "value");
        // method 2
        DIContainer container = new DIContainer();
        try {
            container.bind(LoggerInterface.class, MegaLogger.class);
            container.bind(StorageInterface.class, FileStorage.class);
            container.bind(SessionInterface.class, MySession.class);
            SessionInterface session = (SessionInterface) container.get(SessionInterface.class);
            session.add("name", "bill");
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
