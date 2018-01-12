/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.pubsub;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        // create event channel manager
        EventChannel eventChannel = new EventChannel();
        // create a subcriber
        ChatMessageSubcriber messageSubcriber = new ChatMessageSubcriber();
        eventChannel.subscribe(messageSubcriber, "chat:message");
        eventChannel.subscribe(messageSubcriber, "chat:ping");
        eventChannel.subscribe(messageSubcriber, "rest-channel");
        // publish a message
        eventChannel.publish("chat:message", "Hello world!");
        eventChannel.publish("chat:message", "Ping ping");
        eventChannel.publish("rest-channel", "Test");
    }
}
