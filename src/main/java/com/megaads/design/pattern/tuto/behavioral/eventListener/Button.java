/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.eventListener;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author phuluong
 */
public class Button {

    Dictionary<String, List<EventListener>> listenerDictionary = new Hashtable<>();

    public void addEventListener(String event, EventListener listener) {
        List<EventListener> eventListeners = listenerDictionary.get(event);
        if (eventListeners == null) {
            eventListeners = new ArrayList<>();
        }
        eventListeners.add(listener);
        listenerDictionary.put(event, eventListeners);
    }

    public void fireEvent(String event, Object data) {
        List<EventListener> listeners = listenerDictionary.get(event);
        if (listeners != null) {
            for (EventListener listener : listeners) {
                listener.onEvent(event, data);
            }
        }
    }
}
