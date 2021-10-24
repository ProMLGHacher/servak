package com.example.server.models;

import java.util.ArrayList;

public class OnCityInfo {
    ArrayList<PlaceInfo> hotels;
    ArrayList<PlaceInfo> attractions;
    ArrayList<PlaceInfo> eat;

    public OnCityInfo(ArrayList<PlaceInfo> hotels, ArrayList<PlaceInfo> attractions, ArrayList<PlaceInfo> eat) {
        this.hotels = hotels;
        this.attractions = attractions;
        this.eat = eat;
    }

    public ArrayList<PlaceInfo> getEat() {
        return eat;
    }

    public void setEat(ArrayList<PlaceInfo> eat) {
        this.eat = eat;
    }

    public ArrayList<PlaceInfo> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<PlaceInfo> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<PlaceInfo> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<PlaceInfo> attractions) {
        this.attractions = attractions;
    }
}
