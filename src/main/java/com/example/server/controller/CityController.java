package com.example.server.controller;

import com.example.server.models.CityInfo;
import com.example.server.models.OnCityInfo;
import com.example.server.models.PlaceInfo;
import com.example.server.models.getModels.Cities;
import com.example.server.models.getModels.Place;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {

    Cities cities = new Cities();
    Place attractions = new Place();

    @GetMapping("/city/{id}")
    public ArrayList getCityInfoFromId(@PathVariable("id") int id) {
        OnCityInfo onCityInfo = cities.getCitiesArray().get(id);
        ArrayList<PlaceInfo> list = new ArrayList<>(onCityInfo.getAttractions());
        list.addAll(onCityInfo.getHotels());
        list.addAll(onCityInfo.getEat());
        return list;
    }



    @GetMapping("/city")
    public ArrayList yep() {

        ArrayList<CityInfo> returnList = new ArrayList<>();

        returnList.add(new CityInfo(
                0,
                "Москва",
                "https://static-cse.canva.com/blob/249699/pexels-vierro-3629813.b14e694a.jpg"
        ));

        returnList.add(new CityInfo(
                1,
                "Сочи",
                "https://12millionov.com/wp-content/uploads/2017/09/%D0%9E%D0%BB%D0%B8%D0%BC%D0%BF%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9-%D0%BF%D0%B0%D1%80%D0%BA.jpg"
        ));

        returnList.add(new CityInfo(
                2,
                "Краснодар",
                "https://gdezhivet.com/wp-content/uploads/2018/10/krasnodar4-e1539093787835.jpg"
        ));

        returnList.add(new CityInfo(
                3,
                "Анапа",
                "http://www.welcometoanapa.ru/f/images/2017/12/16/202245456.png"
        ));

        returnList.add(new CityInfo(
                4,
                "Санкт-Петербург",
                "http://www.peterburg.biz/images/place/razvodm7.jpg"
        ));

        returnList.add(new CityInfo(
                5,
                "Ростов на Дону",
                "https://rostov.ru/uploads/posts/2020-08/1598627630_xxl-13.jpg"
        ));

        return returnList;
    }

}
