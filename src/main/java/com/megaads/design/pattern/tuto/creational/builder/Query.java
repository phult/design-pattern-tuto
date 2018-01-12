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
public class Query {

    private String tableName = "tableName";
    private String whereSQL = "1 = 1 ";
    private String selectSQL = "";

    public List<Object> get() {
        // build query string
        String sqlString = this.toSQL();
        // do something
        return null;
    }

    public String toSQL() {
        return "SELECT " + getSelectSQL() + " FROM " + getTableName() + " WHERE " + getWhereSQL();
    }

    /**
     * @param whereSQL the whereSQL to set
     */
    void setWhereSQL(String whereSQL) {
        this.whereSQL = whereSQL;
    }

    /**
     * @param selectSQL the selectSQL to set
     */
    void setSelectSQL(String selectSQL) {
        this.selectSQL = selectSQL;
    }

    /**
     * @return the tableName
     */
    String getTableName() {
        return tableName;
    }

    /**
     * @param tableName the tableName to set
     */
    void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the whereSQL
     */
    String getWhereSQL() {
        return whereSQL;
    }

    /**
     * @return the selectSQL
     */
    String getSelectSQL() {
        return selectSQL;
    }
}
