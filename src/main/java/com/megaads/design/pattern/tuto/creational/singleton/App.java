/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.creational.singleton;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        OrderService orderService1 = ServiceSingleton.getOrderServiceInstance();
        int amount = orderService1.getAmount(0);

        OrderService orderService2 = ServiceSingleton.getOrderServiceInstance();
        if (orderService1.equals(orderService2)) {
            System.out.println("Unique Instance");
        }
    }
}
