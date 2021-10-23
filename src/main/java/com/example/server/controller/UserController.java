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

    @GetMapping("/route")
    public String Ok(String str0, String str1) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.mapbox.com/directions/v5/mapbox/cycling/"+ str0 + ";" + str1 +"?geometries=geojson&access_token=sk.eyJ1IjoicXdlcnR5anVzdHRlc3QiLCJhIjoiY2t2M250ZjZ2NDlucDJvczd5Z21wMXA0biJ9.OoflJ5Q7AcDGws02P3dDGw"))
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
