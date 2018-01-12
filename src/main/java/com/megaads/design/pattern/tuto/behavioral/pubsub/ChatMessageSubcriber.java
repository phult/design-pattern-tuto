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
public class ChatMessageSubcriber implements SubscriberInterface {

    @Override
    public void onMessage(String channel, Object data) {
        System.out.println("Chat data: " + data.toString());
    }
}
