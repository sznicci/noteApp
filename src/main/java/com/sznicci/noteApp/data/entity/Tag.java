package com.sznicci.noteApp.data.entity;

import org.springframework.data.annotation.Id;

public class Tag {

    @Id
    private String id;

    private String name;
    private String colour;

    public Tag(String name, String colour) {
        this.name = name;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
