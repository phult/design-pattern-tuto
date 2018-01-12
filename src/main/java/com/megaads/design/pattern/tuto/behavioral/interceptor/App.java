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
public class App {

    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();
        
        httpClient.addFilter(new AuthenticationFilter());
        httpClient.addFilter(new DeviceFilter());
        httpClient.addFilter(new LocationFilter());
        
        Request validRequest = new Request("https://chiaki.vn/api/product");
        validRequest.setDevice("ios");
        validRequest.setLocation("vietnam");
        validRequest.setToken("HELLO");        
        httpClient.sendRequest(validRequest);
        
        Request invalidRequest = new Request("https://chiaki.vn/api/product");
        invalidRequest.setDevice("ios");
        invalidRequest.setLocation("us");
        invalidRequest.setToken("HELLO");        
        httpClient.sendRequest(invalidRequest);       
    }
}
