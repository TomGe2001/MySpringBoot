package org.tom.entity;

public class User {
    private int id=0;
    private String name="默认";



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String name) {
        this.name = name;
    }
}
