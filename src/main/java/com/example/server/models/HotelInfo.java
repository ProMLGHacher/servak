package com.example.server.models;

public class HotelInfo {
    long id;
    String name;
    String imagePath;
    String address;

    public HotelInfo(long id, String name, String imagePath, String address) {
        this.id = id;
        this.name = name;
        this.imagePath = imagePath;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
