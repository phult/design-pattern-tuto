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
public class OrderService implements ServiceInterface {

    @Override
    public String getName() {
        return "OrderService";
    }

    public int getAmount(int orderId) {
        return 1000;
    }

}
