/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.solid.di.correct;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author phuluong
 */
public class DIContainer {

    Dictionary<String, Object> diInstanceDictionary = new Hashtable<>();

    public void bind(Class interfaceClass, Class instanceClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object instance = null;
        Constructor[] constructors = instanceClass.getConstructors();
        if (constructors.length == 1 && constructors[0].getParameterCount() == 0) {
            instance = instanceClass.newInstance();
        } else {
            for (Constructor constructor : constructors) {
                if (constructor.getParameterCount() > 0) {
                    Class[] parameterTypes = constructor.getParameterTypes();
                    List<Object> params = new ArrayList<>();
                    for (Class paramType : parameterTypes) {
                        Object diInstance = diInstanceDictionary.get(paramType.getName());
                        params.add(diInstance);
                    }
                    instance = constructor.newInstance(params.toArray());
                    break;
                }
            }
        }
        diInstanceDictionary.put(interfaceClass.getName(), instance);
    }

    public Object get(Class interfaceClass) {
        return diInstanceDictionary.get(interfaceClass.getName());
    }

}
