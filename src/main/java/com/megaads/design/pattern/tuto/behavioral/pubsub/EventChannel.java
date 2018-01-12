/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.pubsub;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author phuluong
 */
public class EventChannel {

    Dictionary<String, List<SubscriberInterface>> subscriberDictionary = new Hashtable<>();

    public void publish(String channel, Object data) {
        List<SubscriberInterface> subscribers = subscriberDictionary.get(channel);
        if (subscribers != null) {
            for (SubscriberInterface subscriber : subscribers) {
                subscriber.onMessage(channel, data);
            }
        }
    }

    public void subscribe(SubscriberInterface subscribe, String channel) {
        List<SubscriberInterface> subscribers = subscriberDictionary.get(channel);
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        subscribers.add(subscribe);
        subscriberDictionary.put(channel, subscribers);
    }
}
