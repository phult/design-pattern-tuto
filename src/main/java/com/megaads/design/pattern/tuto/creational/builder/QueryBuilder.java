/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.creational.builder;

/**
 *
 * @author phuluong
 */
public class QueryBuilder extends Query {

    public QueryBuilder(String table) {
        this.setTableName(table);
    }

    public QueryBuilder where(String column, String value) {
        String whereSQL = this.getWhereSQL().isEmpty() ? column + " = " + value : this.getWhereSQL() + " AND " + column + " = " + value;
        this.setWhereSQL(whereSQL);
        return this;
    }

    public QueryBuilder select(String column) {
        String selectSQL = this.getSelectSQL().isEmpty() ? column : this.getSelectSQL() + " , " + column;
        this.setSelectSQL(selectSQL);
        return this;
    }
}
