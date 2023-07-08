//package com.example.butaairline.controller;
//
//import com.example.butaairline.client.ButaAirlineClient;
//import com.example.butaairline.dto.ButaAirlineRequestDto;
//import com.example.butaairline.dto.ButaAirlineResponseDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ButaAirlineController {
//
//    @Autowired
//    private ButaAirlineClient butaAirlineClient;
//
//    @GetMapping(value = "/fly")
//    public ResponseEntity<ButaAirlineResponseDto> butaInfo() {
//
//        ButaAirlineRequestDto requestDto = new ButaAirlineRequestDto();
//
//        requestDto.adultCount = 1;
//        requestDto.arrivalDate = "2023-07-22";
//        requestDto.arrivalPort = "SAW";
//        requestDto.childCount = 0;
//        requestDto.classType = "ECONOMY";
//        requestDto.click_id = "BDbee56b82-315c-a7ff-1b4c-92491a270ee5";
//        requestDto.departureDate = "2023-07-13";
//        requestDto.departurePort = "GYD";
//        requestDto.directionType = "RT";
//        requestDto.infantCount = 0;
//        requestDto.isQIWI = false;
//        requestDto.lang = "EN";
//        requestDto.searchType = "NORMAL";
//
//
//        ButaAirlineResponseDto butaAirlineResponseDto = butaAirlineClient.post(requestDto);
//
//
//        return new ResponseEntity<ButaAirlineResponseDto>(butaAirlineResponseDto, HttpStatus.OK);
//
//
//    }
//
//}
