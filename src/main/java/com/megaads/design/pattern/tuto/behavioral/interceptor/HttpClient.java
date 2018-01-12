/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuluong
 */
public class HttpClient {

    List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void sendRequest(Request request) {
        boolean isPass = true;
        for (Filter filter : filters) {
            boolean filterResult = filter.execute(request);
            if (!filterResult) {
                isPass = false;
                break;
            }
        }
        if (isPass) {
            // do something
            System.out.println("Request's sent");
        } else {
            System.out.println("Request's denied");
        }
    }
}
