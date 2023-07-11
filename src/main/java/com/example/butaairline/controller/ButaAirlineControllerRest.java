package com.example.butaairline.controller;


import com.example.butaairline.apidto.ButaAirlineRequestDto;
import com.example.butaairline.apidto.Root;
import com.google.gson.Gson;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import wiremock.com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class ButaAirlineControllerRest {


    @GetMapping(value = "/fly")
    public ResponseEntity<Root> butaInfo() throws JsonProcessingException {

        ButaAirlineRequestDto requestDto = new ButaAirlineRequestDto();

        requestDto.adultCount = 1;
        requestDto.arrivalDate = "2023-07-22";
        requestDto.arrivalPort = "SAW";
        requestDto.childCount = 0;
        requestDto.classType = "ECONOMY";
        requestDto.click_id = "BDbee56b82-315c-a7ff-1b4c-92491a270ee5";
        requestDto.departureDate = "2023-07-13";
        requestDto.departurePort = "GYD";
        requestDto.directionType = "RT";
        requestDto.infantCount = 0;
        requestDto.isQIWI = false;
        requestDto.lang = "EN";
        requestDto.searchType = "NORMAL";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Gson gson = new Gson();
        String json = gson.toJson(requestDto);

       var entity = new HttpEntity<String>(json, headers);

        var responseEntity =
                restTemplate.postForEntity("https://search.azal.travel/buta/searchFlight",
                        entity, Root.class);
        var butaResponeData = responseEntity.getBody();
        return new ResponseEntity<Root>(butaResponeData,HttpStatus.OK);
    }
}
