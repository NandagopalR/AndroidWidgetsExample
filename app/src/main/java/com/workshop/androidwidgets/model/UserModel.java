package com.workshop.androidwidgets.model;

public class UserModel {

    private String name;
    private String designation;
    private String location;

    public UserModel(String name, String designation, String location) {
        this.name = name;
        this.designation = designation;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
