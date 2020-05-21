package com.singleton;

public enum  EnumSingleton {
    INSTANCE;
    private EnumSingleton(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
