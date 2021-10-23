package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/users")
public class UserController {




    @GetMapping("/")
    public ResponseEntity getUsers(){
        try{
            return ResponseEntity.ok("Сервер");
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    public String Geocod(String str) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://nominatim.openstreetmap.org/search.php?q=" + str + "&format=jsonv2"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String bicycle = response.body();
        int a = bicycle.indexOf("osm_type\":\"") + 11;
        int b = bicycle.indexOf("osm_id\":") + 8;
        int c = bicycle.indexOf(",\"boundingbox");
        String cha = String.valueOf(bicycle.charAt(a));
        return Ok3(cha.toUpperCase(),bicycle.substring(b,c));
    }

    public String Ok3(String str0,String str1) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://nominatim.openstreetmap.org/details.php?osmtype=" + str0 + "&osmid=" + str1 + "&addressdetails=1&hierarchy=0&group_hierarchy=1&format=json"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int a = response.body().indexOf("coordinates\":[") + 14;
        int b = response.body().indexOf("]},\"geometry\":{\"type\":\"Point\",\"coordinates\":");
        String[] str = response.body().substring(a,b).split(",");
        String bicycle = str[1] + "," + str[0];
        return bicycle;
    }

    @GetMapping("/route")
    public String Ok(String str0, String str1) {



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.mapbox.com/directions/v5/mapbox/cycling/"+ Geocod(str0) + ";" + Geocod(str1) +"?geometries=geojson&access_token=sk.eyJ1IjoicXdlcnR5anVzdHRlc3QiLCJhIjoiY2t2M250ZjZ2NDlucDJvczd5Z21wMXA0biJ9.OoflJ5Q7AcDGws02P3dDGw"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int a = response.body().indexOf("coordinates\":[") - 1;
        int b = response.body().indexOf(",\"type");
        String bibycle = "{" + response.body().substring(a,b) + "}";
        return bibycle;
    }

}
