package com.codechallenge.mathdemo.model;

public enum OperationEnum {
    SUM("sum"),
    PRODUCT("product"),
    POWER("power");

    private String name;

    private OperationEnum(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
