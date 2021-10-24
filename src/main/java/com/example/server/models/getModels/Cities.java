package com.example.server.models.getModels;

import com.example.server.models.OnCityInfo;


import java.util.ArrayList;

public class Cities {

    Place hotels = new Place();
    Place attractions = new Place();
    Place eat = new Place();

    OnCityInfo moscow = new OnCityInfo(
            hotels.getMoscowHotels(),
            attractions.getMoscowAttractions(),
            eat.getMoscowEat()
    );


    OnCityInfo sochi = new OnCityInfo(
            hotels.getSochiHotels(),
            attractions.getSochiAttractions(),
            eat.getSochiEat()
    );

    OnCityInfo krasnodar = new OnCityInfo(
            hotels.getKrasnodarHotels(),
            attractions.getKrasnodarAttractions(),
            eat.getKrasnodarEat()
    );

    OnCityInfo anapa = new OnCityInfo(
            hotels.getAnapaHotels(),
            attractions.getAnapaAttractions(),
            eat.getAnapaEat()
    );

    OnCityInfo piter = new OnCityInfo(
            hotels.getPiterHotels(),
            attractions.getPiterAttractions(),
            eat.getPiterEat()
    );

    OnCityInfo rostov = new OnCityInfo(
            hotels.getRostovHotels(),
            attractions.getRostovAttractions(),
            eat.getRostovEat()
    );

    public ArrayList<OnCityInfo> getCitiesArray() {
        ArrayList<OnCityInfo> citiesArray = new ArrayList<>();
        citiesArray.add(moscow);
        citiesArray.add(sochi);
        citiesArray.add(krasnodar);
        citiesArray.add(anapa);
        citiesArray.add(piter);
        citiesArray.add(rostov);
        return citiesArray;
    }



    public Place getEat() {
        return eat;
    }

    public void setEat(Place eat) {
        this.eat = eat;
    }

    public Place getHotels() {
        return hotels;
    }

    public void setHotels(Place hotels) {
        this.hotels = hotels;
    }

    public Place getAttractions() {
        return attractions;
    }

    public void setAttractions(Place attractions) {
        this.attractions = attractions;
    }

    public OnCityInfo getMoscow() {
        return moscow;
    }

    public void setMoscow(OnCityInfo moscow) {
        this.moscow = moscow;
    }

    public OnCityInfo getSochi() {
        return sochi;
    }

    public void setSochi(OnCityInfo sochi) {
        this.sochi = sochi;
    }

    public OnCityInfo getKrasnodar() {
        return krasnodar;
    }

    public void setKrasnodar(OnCityInfo krasnodar) {
        this.krasnodar = krasnodar;
    }

    public OnCityInfo getAnapa() {
        return anapa;
    }

    public void setAnapa(OnCityInfo anapa) {
        this.anapa = anapa;
    }

    public OnCityInfo getPiter() {
        return piter;
    }

    public void setPiter(OnCityInfo piter) {
        this.piter = piter;
    }

    public OnCityInfo getRostov() {
        return rostov;
    }

    public void setRostov(OnCityInfo rostov) {
        this.rostov = rostov;
    }
}
