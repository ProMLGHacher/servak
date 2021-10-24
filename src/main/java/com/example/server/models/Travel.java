package com.example.server.models;

import com.example.server.models.getModels.Place;

import java.util.HashMap;
import java.util.List;

public class Travel {
    int id;
    String startRoute;
    String endRoute;
    String budget;
    HashMap<String, Boolean> hashMapTransport;
    String dateStartTravel;
    String dateEndTravel;
    HashMap<String, Integer> hashMapPeople;
    List<PlaceInfo> placesList;

    public Travel(int id, String startRoute, String endRoute, String budget, HashMap<String, Boolean> hashMapTransport, String dateStartTravel, String dateEndTravel, HashMap<String, Integer> hashMapPeople, List<PlaceInfo> placesList) {
        this.id = id;
        this.startRoute = startRoute;
        this.endRoute = endRoute;
        this.budget = budget;
        this.hashMapTransport = hashMapTransport;
        this.dateStartTravel = dateStartTravel;
        this.dateEndTravel = dateEndTravel;
        this.hashMapPeople = hashMapPeople;
        this.placesList = placesList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartRoute() {
        return startRoute;
    }

    public void setStartRoute(String startRoute) {
        this.startRoute = startRoute;
    }

    public String getEndRoute() {
        return endRoute;
    }

    public void setEndRoute(String endRoute) {
        this.endRoute = endRoute;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public HashMap<String, Boolean> getHashMapTransport() {
        return hashMapTransport;
    }

    public void setHashMapTransport(HashMap<String, Boolean> hashMapTransport) {
        this.hashMapTransport = hashMapTransport;
    }

    public String getDateStartTravel() {
        return dateStartTravel;
    }

    public void setDateStartTravel(String dateStartTravel) {
        this.dateStartTravel = dateStartTravel;
    }

    public String getDateEndTravel() {
        return dateEndTravel;
    }

    public void setDateEndTravel(String dateEndTravel) {
        this.dateEndTravel = dateEndTravel;
    }

    public HashMap<String, Integer> getHashMapPeople() {
        return hashMapPeople;
    }

    public void setHashMapPeople(HashMap<String, Integer> hashMapPeople) {
        this.hashMapPeople = hashMapPeople;
    }

    public List<PlaceInfo> getPlacesList() {
        return placesList;
    }

    public void setPlacesList(List<PlaceInfo> placesList) {
        this.placesList = placesList;
    }
}
