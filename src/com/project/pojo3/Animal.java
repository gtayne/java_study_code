package com.project.pojo3;

public class Animal {
    private String type;
    public void eat(){};
    public void sleep(){};

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }
}
