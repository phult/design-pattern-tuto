/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.interceptor;

/**
 *
 * @author phuluong
 */
public class DeviceFilter implements Filter {

    @Override
    public boolean execute(Request request) {
        boolean retval = false;
        if ("ios".equals(request.getDevice())) {
            retval = true;
        } else {
            System.out.println("DeviceFilter just intercepts a request");
        }
        return retval;
    }

}
