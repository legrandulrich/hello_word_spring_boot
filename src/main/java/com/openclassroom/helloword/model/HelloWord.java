package com.openclassroom.helloword.model;

public class HelloWord {
    
    private String value = "bonjour president";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}