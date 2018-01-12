/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.creational.builder;

import java.util.List;

/**
 *
 * @author phuluong
 */
public class App {

    public static void main(String[] args) {
        QueryBuilder queryBuilder = new QueryBuilder("sa_user");
        // method 1
        queryBuilder.where("name", "bill");
        queryBuilder.where("age", "80");
        queryBuilder.select("name");
        queryBuilder = queryBuilder.select("create_time");
        // method 2
        queryBuilder
                .where("name", "bill")
                .where("age", "80")
                .select("name")
                .select("create_time");
        // get sql string
        String sqlString = queryBuilder.toSQL();
        // get result
        List<Object> users = queryBuilder
                .where("name", "bill")
                .where("age", "80")
                .select("name")
                .select("create_time").get();
        
        
    }
}
