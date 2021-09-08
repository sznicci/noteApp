package com.sznicci.noteApp.data.entity;

import org.springframework.data.annotation.Id;

public class Owner {

    @Id
    private String id;

    private String name;

    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
