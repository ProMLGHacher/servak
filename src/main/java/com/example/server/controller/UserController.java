package com.example.server.controller;

import com.example.server.models.PlaceInfo;
import com.example.server.models.Travel;
import com.example.server.models.getModels.Place;
import org.apache.commons.logging.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping(path = "/route",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String route(@RequestBody Travel travel) {
        System.out.println(travel.getBudget() + " " + travel.getStartRoute());
        return Ok(travel.getStartRoute(), travel.getEndRoute(), travel.getPlacesList());
    }









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


    public String Ok(String str0, String str1, List<PlaceInfo> placesList) {


        StringBuilder forAdd = new StringBuilder();


        forAdd.append(Geocod(str0)).append(";");

        if (placesList.size() != 0) {
            for (PlaceInfo place :
                    placesList) {
                forAdd.append(Geocod(place.getAddress())).append(";");
            }
        }

        forAdd.append(Geocod(str1));

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.mapbox.com/directions/v5/mapbox/cycling/"+ forAdd +"?geometries=geojson&access_token=sk.eyJ1IjoicXdlcnR5anVzdHRlc3QiLCJhIjoiY2t2M250ZjZ2NDlucDJvczd5Z21wMXA0biJ9.OoflJ5Q7AcDGws02P3dDGw"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        int a = response.body().indexOf("coordinates\":[") + 14;
        int b = response.body().indexOf(",\"type");
        String bibycle = "[" + response.body().substring(a,b);
        System.out.println(bibycle);
        return bibycle;
    }

}
